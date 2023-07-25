package com.anmolsahi.androidmulti_threadingmasterclass

import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class ExerciseOneActivity : AppCompatActivity() {
    private val ITERATIONS_COUNTER_DURATION_SEC = 10

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exercise_one)

        val btnCountIterations = findViewById<Button>(R.id.btn_count_iterations)

        btnCountIterations.setOnClickListener {
            countIterations()
        }
    }

    private fun countIterations() {
        Thread {
            val startTimestamp = System.currentTimeMillis()
            val endTimestamp: Long =
                startTimestamp + ITERATIONS_COUNTER_DURATION_SEC * 1000
            var iterationsCount = 0
            while (System.currentTimeMillis() <= endTimestamp) {
                iterationsCount++
            }
            Log.d(
                "Exercise1",
                "iterations in " + ITERATIONS_COUNTER_DURATION_SEC + "seconds: " + iterationsCount
            )
        }.start()
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Exercise1", "OnDestroy called")
    }

}