package com.example.universityenrollmentapp;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // Your main layout containing the BottomNavigationView and FrameLayout

        bottomNavigationView = findViewById(R.id.bottomNavigation);

        // Load the default fragment (e.g., HomeFragment) on initial launch
        loadFragment(new HomeFragment()); // Replace with your actual HomeFragment

        bottomNavigationView.setOnItemSelectedListener(item -> {
            Fragment selectedFragment = null;

            if (item.getItemId() == R.id.nav_home) {
                selectedFragment = new HomeFragment(); // Replace with your actual HomeFragment
            } else if (item.getItemId() == R.id.nav_news) {
                selectedFragment = new NewFragment(); // Assuming you'll create a NewFragment
            } else if (item.getItemId() == R.id.nav_contact) {
                selectedFragment = new ContactFragment(); // Replace with your actual ContactFragment
            }

            if (selectedFragment != null) {
                loadFragment(selectedFragment);
                return true;
            }
            return false;
        });
    }

    private void loadFragment(Fragment fragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.fragmentContainer, fragment); // 'fragmentContainer' is the ID of your FrameLayout
        transaction.commit();
    }
}