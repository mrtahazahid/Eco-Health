package com.cs.ecohealth.screens.onboarding

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.WindowManager
import android.widget.AdapterView
import android.widget.ArrayAdapter
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.cs.ecohealth.R
import com.cs.ecohealth.databinding.FragmentCurrencyBinding
import com.cs.ecohealth.screens.utils.TinyDB


class CurrencyFragment : Fragment() {

    private lateinit var binding: FragmentCurrencyBinding
    private lateinit var tinyDB : TinyDB

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        activity?.window?.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        binding = FragmentCurrencyBinding.inflate(inflater, container, false)
        tinyDB = TinyDB(context)

        var currency = arrayOf("$ (USD)", "€ (EUR)", "£ (GBP)")

        val adapter = ArrayAdapter(
            requireContext(),
            R.layout.spinner_item,
            currency
        )

        binding.spinner.adapter = adapter

        binding.spinner.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                Log.d("Test", "onItemSelected: ")
            }

            override fun onNothingSelected(parent: AdapterView<*>) {
                // write code to perform some action
            }
        }

        binding.btnLangNext.setOnClickListener {
            findNavController().navigate(R.id.action_currencyFragment_to_blankFragment)
            /*val i = Intent(activity, HomeActivity::class.java)
            startActivity(i)
            (activity as Activity?)!!.overridePendingTransition(0, 0)*/
            onBoardingFinished()
        }

        binding.ivBack.setOnClickListener {
            fragmentManager?.popBackStackImmediate()
        }

        return binding.root
    }

    private fun onBoardingFinished(){
        val sharedPref = requireActivity().getSharedPreferences("onBoarding", Context.MODE_PRIVATE)
        val editor = sharedPref.edit()
        editor.putBoolean("Finished", true)
        editor.apply()
    }
}