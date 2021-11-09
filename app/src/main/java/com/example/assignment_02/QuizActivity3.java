package com.example.assignment_02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;

import java.util.Random;

public class QuizActivity3 extends AppCompatActivity {
    TextView textView;
    ImageView imageView;
    String[] imagesArray={"image01","image02","image03","image04"};
    String[] imagesName={"Halqiyah","Lahatiyah","Shajariyah-Haafiyah","Tarfiyah"};
    String question3="Which Makharij is in this figure?";
    Boolean moveNext= false;
    RadioButton radioButton1,radioButton2,radioButton3,radioButton4;
    boolean check2= true;
    String frontImage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz3);
        textView= findViewById(R.id.textView3);
        imageView= findViewById(R.id.imageView3);
        Random rand = new Random();
        frontImage= imagesArray[rand.nextInt(imagesArray.length)];
        int resourceId= getResources().getIdentifier(frontImage,"drawable",getPackageName());
        imageView.setImageResource(resourceId);
        textView.setText(question3);
        radioButton4= findViewById(R.id.radioButton4);
        radioButton3= findViewById(R.id.radioButton3);
        radioButton2= findViewById(R.id.radioButton2);
        radioButton1= findViewById(R.id.radioButton);
        radioButton2.setText(imagesName[0]);
        radioButton3.setText(imagesName[2]);
        radioButton4.setText(imagesName[1]);
        radioButton1.setText(imagesName[3]);
    }
    public void radioButtonClicked3(View v){
        Button btn =findViewById(v.getId());
        String str= btn.getText().toString();
        moveNext= true;
        radioButton1.setEnabled(false);
        radioButton2.setEnabled(false);
        radioButton3.setEnabled(false);
        radioButton4.setEnabled(false);
        btn.setEnabled(true);
        int index=-1;
        for(int i=0; i<imagesArray.length; i++){
            if(imagesArray[i].equals(frontImage)){
                index=i;
            }
        }
        if(imagesName[index].equals(str))
        {
            btn.setBackgroundColor(Color.rgb(13,46,28));
            check2 = false;
        }
        if(check2){
            btn.setBackgroundColor(Color.rgb(192,44,3));
        }
    }
    public  void nextActivity3(View v){
        if(moveNext) {
            Intent intent = new Intent(QuizActivity3.this, EndingActivity.class);
            Intent intent2= getIntent();
            if(!check2){
                intent.putExtra("value",intent2.getIntExtra("value",0)+1);
            }
            else{
                intent.putExtra("value",intent2.getIntExtra("value",0));
            }
            startActivity(intent);
        }
    }
}