package com.example.assignment_02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClick(View v) {
        Intent intent;
        switch (v.getId()) {
            case R.id.button:
                String URL= "https://github.com/SyedAliAwais449/MC_Assignment_02";
                Uri webpage = Uri.parse(URL);
                intent = new Intent(Intent.ACTION_VIEW, webpage);
                startActivity(intent);
                break;
            case R.id.button2:
                intent= new Intent(MainActivity.this, PracticeActivity.class);
                startActivity(intent);
                break;
            case R.id.button4:
                intent= new Intent(MainActivity.this, QuizActivity.class);
                startActivity(intent);
        }
    }

}