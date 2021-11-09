package com.example.assignment_02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class EndingActivity extends AppCompatActivity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ending);
        textView= findViewById(R.id.textView7);
        Intent intent= getIntent();
        textView.setText(Integer.toString(intent.getIntExtra("value",0))+"/3");
    }
    public void Share(View v){
        Intent intent= getIntent();
        String str= Integer.toString(intent.getIntExtra("value",0));
        String message = "Hi! I got "+str+"/3.";
        Intent intent2 = new Intent();
        intent2.setAction(Intent.ACTION_SEND);
        intent2.setType("text/plain");
        intent2.putExtra(Intent.EXTRA_TEXT, message);
        startActivity(intent2);
    }
}