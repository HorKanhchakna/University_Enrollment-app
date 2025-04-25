package com.example.universityenrollmentapp;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class sign_up extends AppCompatActivity {

    EditText editTextFullName, editTextPhoneEmail, editTextPassword, editTextConfirmPassword;
    Button buttonSignUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        // Bind views to correct IDs
        editTextFullName = findViewById(R.id.editTextFullName);
        editTextPhoneEmail = findViewById(R.id.editTextPhoneEmail);
        editTextPassword = findViewById(R.id.editTextPassword);
        editTextConfirmPassword = findViewById(R.id.editTextConfirmPassword);
        buttonSignUp = findViewById(R.id.buttonSignup);

        // Example action for the button
        buttonSignUp.setOnClickListener(v ->
                Toast.makeText(sign_up.this, "Sign Up Clicked", Toast.LENGTH_SHORT).show()
        );
    }
}
