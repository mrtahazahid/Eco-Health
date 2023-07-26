package com.cs.ecohealth.screens.dashboard

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.WindowManager
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import com.cs.ecohealth.R
import com.cs.ecohealth.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding
    private lateinit var geneticsList: ArrayList<String>
    private lateinit var productsList: ArrayList<String>
    private lateinit var daysPerTreatmentsList: ArrayList<String>
    private lateinit var noOfTreatmentList: ArrayList<String>
    private lateinit var treatmentWeekList: ArrayList<String>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        activity?.window?.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        binding = FragmentHomeBinding.inflate(inflater, container, false)

        geneticsData()
        productData()
        treatmentData()
        noOfTreatmentData()
        treatmentWeekData()


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

    private fun noOfTreatmentData() {
        noOfTreatmentList = ArrayList()

        for (i in 0..12) {
            noOfTreatmentList.add("${i}")
        }

        val adapter = ArrayAdapter(
            requireContext(),
            R.layout.spinner_item,
            noOfTreatmentList
        )
        binding.expandableGroup1.secondLayout.findViewById<Spinner>(R.id.Number_of_treatment_spinner ).adapter = adapter

        binding.expandableGroup1.secondLayout.findViewById<Spinner>(R.id.Number_of_treatment_spinner).onItemSelectedListener = object :
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

        binding.expandableGroup2.secondLayout.findViewById<Spinner>(R.id.Number_of_treatment_spinner ).adapter = adapter

        binding.expandableGroup2.secondLayout.findViewById<Spinner>(R.id.Number_of_treatment_spinner).onItemSelectedListener = object :
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
    }

    private fun treatmentWeekData() {
        treatmentWeekList = ArrayList()

        for (i in 0..100) {
            treatmentWeekList.add("${i}")
        }

        val adapter = ArrayAdapter(
            requireContext(),
            R.layout.spinner_item,
            treatmentWeekList
        )
        binding.expandableGroup1.secondLayout.findViewById<Spinner>(R.id.Treatment_age_week_spinner).adapter = adapter

        binding.expandableGroup1.secondLayout.findViewById<Spinner>(R.id.Treatment_age_week_spinner).onItemSelectedListener = object :
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

        binding.expandableGroup2.secondLayout.findViewById<Spinner>(R.id.Treatment_age_week_spinner).adapter = adapter

        binding.expandableGroup2.secondLayout.findViewById<Spinner>(R.id.Treatment_age_week_spinner).onItemSelectedListener = object :
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
    }

    private fun treatmentData() {
        daysPerTreatmentsList = ArrayList()

        daysPerTreatmentsList.add("0")
        daysPerTreatmentsList.add("3")
        daysPerTreatmentsList.add("5")
        daysPerTreatmentsList.add("7")

        val adapter = ArrayAdapter(
            requireContext(),
            R.layout.spinner_item,
            daysPerTreatmentsList
        )
        binding.expandableGroup1.secondLayout.findViewById<Spinner>(R.id.Days_per_treatment_spinner).adapter = adapter

        binding.expandableGroup1.secondLayout.findViewById<Spinner>(R.id.Days_per_treatment_spinner).onItemSelectedListener = object :
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

        binding.expandableGroup2.secondLayout.findViewById<Spinner>(R.id.Days_per_treatment_spinner).adapter = adapter

        binding.expandableGroup2.secondLayout.findViewById<Spinner>(R.id.Days_per_treatment_spinner).onItemSelectedListener = object :
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
    }

    private fun productData() {
        productsList = ArrayList()

        productsList.add("Aivlosin WSG 40 g")
        productsList.add("Aivlosin WSG 160 g")
        productsList.add("Aivlosin WSG 400 g")
        productsList.add("Aivlosin  FG 50 20 kg")
        productsList.add("Valosin WSG 40 g")
        productsList.add("Valosin WSG 160 g")
        productsList.add("Valosin WSG 400 g")
        productsList.add("Valosin FG 50 5 kg")
        productsList.add("Valosin FG 50 20 kg")
        productsList.add("Valosin 425 20 kg")
        productsList.add("Aivlosin 4.25% 20 kg")
        productsList.add("Aivlosin FG170 5kg")
        productsList.add("Aivlosin Premix")
        productsList.add("No Treatment")
        productsList.add("Other product")

        val adapter = ArrayAdapter(
            requireContext(),
            R.layout.spinner_item,
            productsList
        )
        binding.expandableGroup1.secondLayout.findViewById<Spinner>(R.id.product_spinner).adapter = adapter

        binding.expandableGroup1.secondLayout.findViewById<Spinner>(R.id.product_spinner).onItemSelectedListener = object :
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

        binding.expandableGroup2.secondLayout.findViewById<Spinner>(R.id.product_spinner).adapter = adapter

        binding.expandableGroup2.secondLayout.findViewById<Spinner>(R.id.product_spinner).onItemSelectedListener = object :
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
    }

    private fun geneticsData() {
        geneticsList = ArrayList()

        geneticsList.add("White Layers")
        geneticsList.add("Brown Layers")

        val adapter = ArrayAdapter(
            requireContext(),
            R.layout.spinner_item,
            geneticsList
        )
        binding.expandableGroup1.secondLayout.findViewById<Spinner>(R.id.genetics_spinner).adapter = adapter

        binding.expandableGroup1.secondLayout.findViewById<Spinner>(R.id.genetics_spinner).onItemSelectedListener = object :
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

        binding.expandableGroup2.secondLayout.findViewById<Spinner>(R.id.genetics_spinner).adapter = adapter

        binding.expandableGroup2.secondLayout.findViewById<Spinner>(R.id.genetics_spinner).onItemSelectedListener = object :
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
    }
}