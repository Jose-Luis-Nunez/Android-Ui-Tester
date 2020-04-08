package com.example.testingapp.second

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.testingapp.R
import com.example.testingapp.databinding.SecondFragmentBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

class SecondFragment : Fragment() {

    private val viewModel: SecondViewModel by viewModel()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: SecondFragmentBinding = DataBindingUtil.inflate(
            inflater,
            R.layout.second_fragment,
            container,
            false
        )
        binding.lifecycleOwner = activity
        binding.viewmodel=viewModel
        return binding.root
    }

}
