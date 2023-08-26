package com.example.comparador

import org.junit.Test

import org.junit.Assert.*


class ComparisonViewModelTest {

    private val viewModel = ComparisonViewModel()

    @Test
    fun testCompareStrings_equalStrings() {
        val result = viewModel.compareStrings("Hello", "Hello")
        assertEquals(true, result)
    }

    @Test
    fun testCompareStrings_differentStrings() {
        val result = viewModel.compareStrings("Hello", "World")
        assertEquals(false, result)
    }
}
