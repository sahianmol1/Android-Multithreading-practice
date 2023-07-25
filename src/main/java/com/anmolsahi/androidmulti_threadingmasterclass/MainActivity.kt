package com.anmolsahi.androidmulti_threadingmasterclass

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnExerciseOne = findViewById<Button>(R.id.btn_exercise_one)
        btnExerciseOne.setOnClickListener {
            val exerciseOneIntent = Intent(this, ExerciseOneActivity::class.java)
            startActivity(exerciseOneIntent)
        }

    }
}