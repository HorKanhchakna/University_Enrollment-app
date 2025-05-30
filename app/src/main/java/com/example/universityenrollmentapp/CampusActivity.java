package com.example.universityenrollmentapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.universityenrollmentapp.databinding.ActivityCampusBinding;

public class CampusActivity extends AppCompatActivity {
    private ActivityCampusBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityCampusBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.appBar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(CampusActivity.this, MainActivity.class));
                finish();
            }
        });

    }
}