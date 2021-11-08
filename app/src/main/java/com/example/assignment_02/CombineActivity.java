package com.example.assignment_02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class CombineActivity extends AppCompatActivity {
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_combine);
        imageView= findViewById(R.id.imageView);
        Intent intent = getIntent();
        String imageName= intent.getStringExtra("imageName");
        int resourceId= getResources().getIdentifier(imageName,"drawable",getPackageName());
        imageView.setImageResource(resourceId);
    }
}