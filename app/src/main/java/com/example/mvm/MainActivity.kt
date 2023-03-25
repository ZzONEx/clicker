package com.example.mvm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.mvm.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        lateinit var bind: ActivityMainBinding
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bind = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bind.root)

        var num = 0
        val viewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        bind.bindbut.setOnClickListener{
            viewModel.addNumber()
         bind.numText.text = viewModel.number.toString()
        }


    }

    override fun  onStop(){
        super.onStop()

    }
}