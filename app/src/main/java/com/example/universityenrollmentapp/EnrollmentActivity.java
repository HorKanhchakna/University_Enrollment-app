package com.example.universityenrollmentapp;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.universityenrollmentapp.databinding.ActivityEnrollmentInfoBinding;

public class EnrollmentActivity extends AppCompatActivity {
    private ActivityEnrollmentInfoBinding binding;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityEnrollmentInfoBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.topAppBar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(EnrollmentActivity.this, PersonalInfomationActivity.class));
                finish();
            }
        });
        binding.submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(EnrollmentActivity.this, EnrollmentDetailActivity.class));
                finish();
            }
        });
        binding.backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(EnrollmentActivity.this, MainActivity.class));
                finish();
            }
        });
    }
}