package com.example.universityenrollmentapp;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.Html;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class Welcome extends AppCompatActivity {

    Button btnSignUp, btnSignIn;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSignUp = findViewById(R.id.btnSignUp);
        btnSignIn = findViewById(R.id.btnSignIn);

        btnSignUp.setOnClickListener(v ->
                Toast.makeText(Welcome.this, "Sign Up Clicked", Toast.LENGTH_SHORT).show());

        btnSignIn.setOnClickListener(v ->
                Toast.makeText(Welcome.this, "Sign In Clicked", Toast.LENGTH_SHORT).show());

        TextView tvWelcome = findViewById(R.id.tvWelcome);

        String styledWelcomeText = "Welcome to <font color='#3B00B9'><b>Enroll App!</b></font>";
        tvWelcome.setText(Html.fromHtml(styledWelcomeText, Html.FROM_HTML_MODE_LEGACY));


        TextView tvDescription = findViewById(R.id.tvDescription);
        String styledText = "<b>Thank you for choosing <font color='#3B00B9'>Enroll App</font></b>, " +
                "your all-in-one solution for a smooth and hassle-free university enrollment process! " +
                "Whether you're a first-year student or continuing your academic journey, our app is here to guide you every step of the way.";

        tvDescription.setText(Html.fromHtml(styledText, Html.FROM_HTML_MODE_LEGACY));
    }
}
