package com.example.assignment_02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class PracticeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practice);
    }
    public void onClick2(View v) {
        Intent intent;
        switch (v.getId()) {
            case R.id.button3:
                intent= new Intent(PracticeActivity.this, CombineActivity.class);
                intent.putExtra("imageName","image1");
                startActivity(intent);
                break;
            case R.id.button5:
                intent= new Intent(PracticeActivity.this, CombineActivity.class);
                intent.putExtra("imageName","image2");
                startActivity(intent);
                break;
            case R.id.button6:
                intent= new Intent(PracticeActivity.this, CombineActivity.class);
                intent.putExtra("imageName","image3");
                startActivity(intent);
                break;
            case R.id.button7:
                intent= new Intent(PracticeActivity.this, CombineActivity.class);
                intent.putExtra("imageName","image4");
                startActivity(intent);
                break;
            case R.id.button8:
                intent= new Intent(PracticeActivity.this, CombineActivity.class);
                intent.putExtra("imageName","image5");
                startActivity(intent);
                break;
            case R.id.button9:
                intent= new Intent(PracticeActivity.this, CombineActivity.class);
                intent.putExtra("imageName","image6");
                startActivity(intent);
                break;
            case R.id.button10:
                intent= new Intent(PracticeActivity.this, CombineActivity.class);
                intent.putExtra("imageName","image7");
                startActivity(intent);
                break;
            case R.id.button11:
                intent= new Intent(PracticeActivity.this, CombineActivity.class);
                intent.putExtra("imageName","image8");
                startActivity(intent);
                break;
            case R.id.button13:
                intent= new Intent(PracticeActivity.this, CombineActivity.class);
                intent.putExtra("imageName","image9");
                startActivity(intent);
                break;
            case R.id.button14:
                intent= new Intent(PracticeActivity.this, CombineActivity.class);
                intent.putExtra("imageName","image10");
                startActivity(intent);
                break;
        }
    }
}