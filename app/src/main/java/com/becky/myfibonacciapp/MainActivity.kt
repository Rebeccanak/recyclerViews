package com.becky.myfibonacciapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var rvNames: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onResume() {
        super.onResume()
        rvNames = findViewById(R.id.rvNames)

        val names = mutableListOf(1,2)

        val namesRvAdapter = NamesRvAdapter(names)
        rvNames.layoutManager = LinearLayoutManager(this)
        rvNames.adapter = namesRvAdapter
    }
}

fun getFibonacciSequence(): List<Int> {
    val numbers = mutableListOf(0, 1)
    while (numbers.size < 100) {
        val nextNumber = numbers[numbers.size - 1] + numbers[numbers.size - 2]
        numbers.add(nextNumber)
    }
    return numbers
}