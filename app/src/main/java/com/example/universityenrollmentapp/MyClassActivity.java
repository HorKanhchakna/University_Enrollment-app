package com.example.universityenrollmentapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.universityenrollmentapp.databinding.ActivityMyClassBinding;

public class MyClassActivity extends AppCompatActivity {
private ActivityMyClassBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
       binding = ActivityMyClassBinding.inflate(getLayoutInflater());
       setContentView(binding.getRoot());

       binding.appBar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MyClassActivity.this, MainActivity.class));
                finish();
            }
        });
    }
}