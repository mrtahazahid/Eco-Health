package com.cs.ecohealth.screens.onboarding

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.WindowManager
import android.widget.AdapterView
import android.widget.ArrayAdapter
import androidx.navigation.fragment.findNavController
import com.cs.ecohealth.R
import com.cs.ecohealth.databinding.FragmentLangBinding

class LangFragment : Fragment() {

    private lateinit var binding: FragmentLangBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        activity?.window?.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        binding = FragmentLangBinding.inflate(inflater, container, false)

        val languages = resources.getStringArray(R.array.Languages)

        val adapter = ArrayAdapter(
            requireActivity(),
            R.layout.spinner_item,
            languages
        )
        binding.spinner.adapter = adapter

        binding.spinner.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                Log.d("Test", "onItemSelected: ")
            }

            override fun onNothingSelected(parent: AdapterView<*>) {
                // write code to perform some action
            }
        }

        binding.btnLangNext.setOnClickListener {
            findNavController().navigate(R.id.action_langFragment_to_weightFragment)
        }

        return binding.root
    }
}