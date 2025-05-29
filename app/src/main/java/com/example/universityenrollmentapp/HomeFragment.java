package com.example.universityenrollmentapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.universityenrollmentapp.databinding.FragmentHomeBinding;
import com.google.firebase.auth.FirebaseAuth;

public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        binding = FragmentHomeBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view,
                              @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.signoutButton.setOnClickListener(v -> {
            FirebaseAuth.getInstance().signOut();

            Intent intent = new Intent(requireActivity(), SignInActivity.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
            startActivity(intent);

            Toast.makeText(requireContext(), "Signed out", Toast.LENGTH_SHORT).show();
        });

        binding.campusCard.setOnClickListener(v -> {
            Intent intent = new Intent(requireContext(), CampusActivity.class);
            startActivity(intent);
        });
        binding.enrollmentCard.setOnClickListener(v -> {
            Intent intent = new Intent(requireContext(), PersonalInfomationActivity.class);
            startActivity(intent);
        });

        binding.myClassCard.setOnClickListener(v -> {
            Intent intent = new Intent(requireContext(), MyClassActivity.class);
            startActivity(intent);
        });


        binding.enrollmentDetailCard.setOnClickListener(v -> {
            Intent intent = new Intent(requireContext(), EnrollmentDetailActivity.class);
            startActivity(intent);
        });

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
