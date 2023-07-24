package com.cs.ecohealth.screens.onboarding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.WindowManager
import androidx.navigation.fragment.findNavController
import androidx.viewpager2.widget.ViewPager2
import com.cs.ecohealth.R
import com.cs.ecohealth.databinding.FragmentWeightBinding

class WeightFragment : Fragment() {

    private lateinit var binding: FragmentWeightBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        activity?.window?.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        binding = FragmentWeightBinding.inflate(inflater, container, false)


        binding.btnLangNext.setOnClickListener {
            findNavController().navigate(R.id.action_weightFragment_to_currencyFragment)
        }

        binding.ivBack.setOnClickListener {
            fragmentManager?.popBackStack()
        }

        return binding.root
    }
}