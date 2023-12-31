package com.cs.ecohealth.screens.dashboard

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.WindowManager
import com.cs.ecohealth.databinding.FragmentResultBinding
import com.cs.ecohealth.screens.utils.TinyDB

class ResultFragment : Fragment() {

    private lateinit var binding: FragmentResultBinding
    private lateinit var tinyDB : TinyDB
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        activity?.window?.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        binding = FragmentResultBinding.inflate(inflater, container, false)
        tinyDB = TinyDB(context)
        binding.expandableEconomicsResults.parentLayout.setOnClickListener {
            if (binding.expandableEconomicsResults.isExpanded){
                binding.expandableEconomicsResults.collapse()
            }
            else{
                binding.expandableEconomicsResults.expand()
            }
        }

        return binding.root
    }
}