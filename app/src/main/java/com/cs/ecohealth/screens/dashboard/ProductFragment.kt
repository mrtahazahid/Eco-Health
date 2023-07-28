package com.cs.ecohealth.screens.dashboard

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.WindowManager
import com.cs.ecohealth.databinding.FragmentProductBinding
import com.cs.ecohealth.screens.utils.TinyDB

class ProductFragment : Fragment() {

    private lateinit var binding: FragmentProductBinding
    private lateinit var tinyDB : TinyDB

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        activity?.window?.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        binding = FragmentProductBinding.inflate(inflater, container, false)
        tinyDB = TinyDB(context)

        tinyDB.getString("One")
        tinyDB.getString("Two")
        tinyDB.getString("Three")

        binding.expandableData1.parentLayout.setOnClickListener {
            if (binding.expandableData1.isExpanded){
                binding.expandableData1.collapse()
            }
            else{
                binding.expandableData1.expand()
            }
        }

        binding.expandableData2.parentLayout.setOnClickListener {
            if (binding.expandableData2.isExpanded){
                binding.expandableData2.collapse()
            }
            else{
                binding.expandableData2.expand()
            }
        }

        binding.expandableData3.parentLayout.setOnClickListener {
            if (binding.expandableData3.isExpanded){
                binding.expandableData3.collapse()
            }
            else{
                binding.expandableData3.expand()
            }
        }

        binding.expandableData4.parentLayout.setOnClickListener {
            if (binding.expandableData4.isExpanded){
                binding.expandableData4.collapse()
            }
            else{
                binding.expandableData4.expand()
            }
        }

        binding.expandableFcr.parentLayout.setOnClickListener {
            if (binding.expandableFcr.isExpanded){
                binding.expandableFcr.collapse()
            }
            else{
                binding.expandableFcr.expand()
            }
        }

        return binding.root
    }

}