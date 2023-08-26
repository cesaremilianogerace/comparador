package com.example.comparador

import androidx.lifecycle.ViewModel

class ComparisonViewModel : ViewModel() {

    fun compareStrings(text1: String, text2: String): Boolean {
        return text1 == text2
    }
}