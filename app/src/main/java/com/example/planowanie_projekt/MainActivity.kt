package com.example.planowanie_projekt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CalendarView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.poczatek).setOnClickListener {
        val ogur = findViewById<CalendarView>(R.id.calendarView).date
        findViewById<TextView>(R.id.Pomidor).text = ogur
        }
    }
}
