package com.example.comparador

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import androidx.activity.viewModels
import com.example.comparador.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val viewModel: ComparisonViewModel by viewModels()
    private lateinit var binding: ActivityMainBinding // variable para binding sin iniciar aun

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater) // Inicializa binding
        setContentView(binding.root) // layout del binding como contenido de actividad

        binding.compareButton.setOnClickListener {
            val text1 = binding.editText1.text.toString()
            val text2 = binding.editText2.text.toString()
            val result = viewModel.compareStrings(text1, text2)

            binding.resultTextView.text = if (result) "Las cadenas son iguales" else "Las cadenas son diferentes"
        }
    }
}

