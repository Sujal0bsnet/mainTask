package com.example.task

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.RadioGroup
import android.widget.Spinner
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var nameEditText: EditText
    private lateinit var emailEditText: EditText
    private lateinit var dobEditText: EditText
    private lateinit var genderRadioGroup: RadioGroup
    private lateinit var contactPreferenceRadioGroup: RadioGroup
    private lateinit var interestsSpinner: Spinner
    private lateinit var profileImageView: ImageView
    private lateinit var submitButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        nameEditText = findViewById(R.id.nameEditText)
        emailEditText = findViewById(R.id.emailEditText)
        dobEditText = findViewById(R.id.dobEditText)
        genderRadioGroup = findViewById(R.id.genderRadioGroup)
        contactPreferenceRadioGroup = findViewById(R.id.contactPreferenceRadioGroup)
        interestsSpinner = findViewById(R.id.interestsSpinner)
        profileImageView = findViewById(R.id.imageView2)
        submitButton = findViewById(R.id.submitButton)


        val interests = resources.getStringArray(R.array.interests)
        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, interests)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        interestsSpinner.adapter = adapter


        submitButton.setOnClickListener {
            if (validateForm()) {
                saveUserData()
                showSubmissionFeedback()
            }
        }


        profileImageView.setOnClickListener {
            openImagePicker()
        }
    }

    private fun validateForm(): Boolean {

        return true
    }

    private fun saveUserData() {

    }

    private fun showSubmissionFeedback() {

        Toast.makeText(this, "Form submitted successfully!", Toast.LENGTH_SHORT).show()
    }

    private fun openImagePicker() {

    }
}