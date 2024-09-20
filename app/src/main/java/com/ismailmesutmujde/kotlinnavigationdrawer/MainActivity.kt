package com.ismailmesutmujde.kotlinnavigationdrawer

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import com.ismailmesutmujde.kotlinnavigationdrawer.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var bindingMain : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingMain = ActivityMainBinding.inflate(layoutInflater)
        val view = bindingMain.root
        setContentView(view)

        // Navigation component ile Navigation Drawer bağlantısı
        val navHostFragment = supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        NavigationUI.setupWithNavController(bindingMain.navigationView, navHostFragment.navController)

        bindingMain.toolbar.title = "TITLE"
        val toggle = ActionBarDrawerToggle(this, bindingMain.drawer, bindingMain.toolbar,0,0)
        bindingMain.drawer.addDrawerListener(toggle)
        toggle.syncState()

        val title = bindingMain.navigationView.inflateHeaderView(R.layout.navigation_title)
        val textViewTitle = title.findViewById(R.id.textViewTitle) as TextView
        textViewTitle.text = "Hello Kotlin"
    }

    @SuppressLint("MissingSuperCall")
    override fun onBackPressed() {
        if (bindingMain.drawer.isDrawerOpen(GravityCompat.START)) {
            bindingMain.drawer.closeDrawer(GravityCompat.START)
        } else {
            onBackPressedDispatcher.onBackPressed()
        }
    }
}