package com.example.universityenrollmentapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.universityenrollmentapp.databinding.ActivitySignUpBinding;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.*;

public class SignUpActivity extends AppCompatActivity {

    private ActivitySignUpBinding binding;
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySignUpBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        mAuth = FirebaseAuth.getInstance();

        binding.btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user = binding.etEmailPhone.getText().toString().trim();
                String password = binding.etCreatePassword.getText().toString().trim();
                String name = binding.etFullName.getText().toString().trim();
                String confirm = binding.etConfirmPassword.getText().toString().trim();

                boolean hasError = false;

                if (user.isEmpty()) {
                    binding.etEmailPhone.setError("Email cannot be empty.");
                    hasError = true;
                }
                if (name.isEmpty()) {
                    binding.etFullName.setError("Name cannot be empty.");
                    hasError = true;
                }
                if (password.isEmpty()) {
                    binding.etCreatePassword.setError("Password cannot be empty.");
                    hasError = true;
                }
                if (confirm.isEmpty()) {
                    binding.etConfirmPassword.setError("Confirm Password cannot be empty.");
                    hasError = true;
                } else if (!confirm.equals(password)) {
                    binding.etConfirmPassword.setError("Passwords do not match.");
                    hasError = true;
                }

                if (hasError) return;

                mAuth.createUserWithEmailAndPassword(user, password)
                        .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {
                                if (task.isSuccessful()) {
                                    Toast.makeText(SignUpActivity.this, "Sign up successful", Toast.LENGTH_SHORT).show();
                                    startActivity(new Intent(SignUpActivity.this, MainActivity.class));
                                    finish();
                                } else {
                                    Toast.makeText(SignUpActivity.this, "Sign up failed: " + task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                                }
                            }
                        });
            }
        });

        binding.signInRedirectText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SignUpActivity.this, SignInActivity.class));
                finish();
            }
        });
    }
}
