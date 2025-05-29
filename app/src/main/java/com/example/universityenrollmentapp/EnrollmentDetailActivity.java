package com.example.universityenrollmentapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.universityenrollmentapp.databinding.ActivityEnrollmentDetailsBinding;

public class EnrollmentDetailActivity extends AppCompatActivity {
    private ActivityEnrollmentDetailsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityEnrollmentDetailsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.appBar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(EnrollmentDetailActivity.this, MainActivity.class));
                finish();
            }
        });
    }

}