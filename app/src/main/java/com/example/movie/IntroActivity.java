package com.example.movie;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.movie.Activities.MainActivity;
import com.example.movie.databinding.ActivityIntroBinding;

public class IntroActivity extends AppCompatActivity {
    ActivityIntroBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityIntroBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.startBtn.setOnClickListener(v ->
                startActivity(new Intent(IntroActivity.this, MainActivity.class))
        );
    }
}
