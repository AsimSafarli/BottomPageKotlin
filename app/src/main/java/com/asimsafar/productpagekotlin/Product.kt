package com.asimsafar.productpagekotlin

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.asimsafar.productpagekotlin.databinding.FragmentProductBinding


class Product : Fragment() {


      lateinit var binding : FragmentProductBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding =FragmentProductBinding.inflate(inflater)
        return binding.root

    }


}