package org.geeksforgeeks.generaterandomnumber

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Declaring and Initializing the EditText, Button and TextView from the layout file
        val mEditText1 = findViewById<EditText>(R.id.edit_text_1)
        val mEditText2 = findViewById<EditText>(R.id.edit_text_2)
        val mButton = findViewById<Button>(R.id.button_1)
        val mTextView = findViewById<TextView>(R.id.text_view_1)

        // On button click, min and max value is fetched from the EditText and a Random value is generated
        mButton.setOnClickListener {
            val minVal = mEditText1.text.toString().toInt()
            val maxVal = mEditText2.text.toString().toInt()

            // For Kotlin>=1.3
            val mResult = (minVal..maxVal).random() // Inclusive of min and max value

            // For Kotlin<1.3
            // mResult = Random().nextInt(maxVal + 1 - minVal) + minVal

            // Random value is displayed in the TextView
            mTextView.text = mResult.toString()
        }
    }
}