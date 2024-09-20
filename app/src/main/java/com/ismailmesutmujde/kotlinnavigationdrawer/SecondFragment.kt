package com.ismailmesutmujde.kotlinnavigationdrawer

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ismailmesutmujde.kotlinnavigationdrawer.databinding.FragmentSecondBinding


class SecondFragment : Fragment() {

    private lateinit var bindingSecond : FragmentSecondBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        bindingSecond = FragmentSecondBinding.inflate(inflater, container, false)
        val view = bindingSecond.root

        return view
    }

}