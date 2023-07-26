package com.cs.ecohealth.screens.dashboard

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.WindowManager
import com.cs.ecohealth.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        activity?.window?.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        binding = FragmentHomeBinding.inflate(inflater, container, false)


        binding.expandableGroup1.parentLayout.setOnClickListener {
            if (binding.expandableGroup1.isExpanded){
                binding.expandableGroup1.collapse()
            }
            else{
                binding.expandableGroup1.expand()
            }
        }

        binding.expandableGroup2.parentLayout.setOnClickListener {
            if (binding.expandableGroup2.isExpanded){
                binding.expandableGroup2.collapse()
            }
            else{
                binding.expandableGroup2.expand()
            }
        }









        return binding.root
    }
}