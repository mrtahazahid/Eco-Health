package com.cs.ecohealth.screens.viewmodel

import android.text.Editable
import android.util.Log
import android.widget.EditText
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeViewModel: ViewModel() {
    val producedEggNumbersPerHenHoused = MutableLiveData<String>()

    fun updateLiveData(p0: Editable?){
        try {
            if(p0.toString() == ""){
                producedEggNumbersPerHenHoused.value = "${0}"
            }
            else{
                producedEggNumbersPerHenHoused.value = "${p0.toString().toInt() + 1}"
            }
        }
        catch (e:Exception){
            Log.d("LOG=>updateLiveData", "updateLiveData: $e")
        }
    }
}