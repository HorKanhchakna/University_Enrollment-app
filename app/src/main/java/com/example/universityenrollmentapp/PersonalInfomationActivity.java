package com.example.universityenrollmentapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.universityenrollmentapp.databinding.ActivityPersonalEnrollmentInfoBinding;

public class PersonalInfomationActivity extends AppCompatActivity {
    private ActivityPersonalEnrollmentInfoBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityPersonalEnrollmentInfoBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(PersonalInfomationActivity.this, EnrollmentActivity.class));
                finish();
            }
        });

        binding.topAppBar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(PersonalInfomationActivity.this, MainActivity.class));
                finish();
            }
        });
    }
}