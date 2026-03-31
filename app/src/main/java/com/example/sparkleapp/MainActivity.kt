package com.example.sparkleapp

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        //Input Button Code
        //Declare the Val of the timeOfDay TextView using the ID
        val timeOfDayDisplay = findViewById<TextView>(R.id.txtTimeOfDay)

        //Declare the Val of the input Button using the ID
        val inputBtn = findViewById<ImageButton>(R.id.ImgBtnInput)

        //Declare the Val of the input EditText using the ID - this is where the user inputs data
        val input = findViewById<EditText>(R.id.edtInput)

        //Declare the Val of the suggestion TextView using the ID
        val suggestionOutput = findViewById<TextView>(R.id.txtSuggestion)

        //Processing - What happens when the input/respond button is pressed
        inputBtn.setOnClickListener {
            val timeOfDay = input.text.toString()
            var suggestion = ""
            if (timeOfDay == "Morning") {
                suggestion = "Send a 'Good Morning' text to a family member."
                //Log
                Log.v("Time of Day", timeOfDay)
            } else if (timeOfDay == "Mid-Morning") {
                suggestion = "Reach out to a colleague with a quick 'Thank You'"
                //Log
                Log.v("Time of Day", timeOfDay)
            } else if (timeOfDay == "Afternoon") {
                suggestion = "Share a funny meme or interesting link with a friend"
                //Log
                Log.v("Time of Day", timeOfDay)
            } else if (timeOfDay == "Afternoon Snack Time") {
                suggestion = "Send a quick 'thinking of you' message."
                //Log
                Log.v("Time of Day", timeOfDay)
            } else if (timeOfDay == "Dinner"){
                suggestion = "Call a friend or a relative for a 5-minute catch-up."
                //Log
                Log.v("Time of Day", timeOfDay)
            } else if (timeOfDay == "Night" || timeOfDay == "After Dinner")  {
                suggestion = "Leave a thoughtful comment on a friend's post."
                //Log
                Log.v("Time of Day", timeOfDay)
            }

            timeOfDayDisplay.text = timeOfDay
            suggestionOutput.text = suggestion

        }

    }
}