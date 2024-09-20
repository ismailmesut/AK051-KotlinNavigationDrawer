package com.ismailmesutmujde.kotlinnavigationdrawer

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ismailmesutmujde.kotlinnavigationdrawer.databinding.FragmentFirstBinding


class FirstFragment : Fragment() {

    private lateinit var bindingFirst : FragmentFirstBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        bindingFirst = FragmentFirstBinding.inflate(inflater, container, false)
        val view = bindingFirst.root

        return view
    }

}