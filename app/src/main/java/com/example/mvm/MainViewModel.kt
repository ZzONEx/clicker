package com.example.mvm

import androidx.lifecycle.ViewModel
class MainViewModel: ViewModel() {

    var number = 0

    fun addNumber() {
        number++
    }
}