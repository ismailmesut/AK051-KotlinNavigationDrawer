package com.ismailmesutmujde.kotlinnavigationdrawer

import android.os.Bundle
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
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
    }
}