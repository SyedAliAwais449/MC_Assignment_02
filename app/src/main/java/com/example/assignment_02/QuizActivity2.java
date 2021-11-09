package com.example.assignment_02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

import java.util.Random;

public class QuizActivity2 extends AppCompatActivity {
    TextView textView;
    String[] arabicLetters1 = {"ق","ک","ل","ن","ر","ت د ط","ظ  ذ  ث","ص ز س","م ن","ف","ب","م","و","باَ بوُ بىِ"};
    String [] Shajariyah_Haafiyah= {"ج ش ی","ض"};
    RadioButton radioButton1,radioButton2,radioButton3,radioButton4;
    Boolean moveNext= false;
    boolean check= true;
    String question2="Which of the following is a Shajariyah_Haafiyah letter?";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz2);
        radioButton4= findViewById(R.id.radioButton4);
        radioButton3= findViewById(R.id.radioButton3);
        radioButton2= findViewById(R.id.radioButton2);
        radioButton1= findViewById(R.id.radioButton);
        Random rand = new Random();
        radioButton2.setText(arabicLetters1[rand.nextInt(arabicLetters1.length)].toString());
        radioButton3.setText(arabicLetters1[rand.nextInt(arabicLetters1.length)].toString());
        radioButton4.setText(Shajariyah_Haafiyah[rand.nextInt(Shajariyah_Haafiyah.length)].toString());
        radioButton1.setText(arabicLetters1[rand.nextInt(arabicLetters1.length)].toString());
        textView= findViewById(R.id.textView3);
        textView.setText(question2);
    }
    public void radioButtonClicked2(View v){
        Button btn =findViewById(v.getId());
        String str= btn.getText().toString();
        moveNext= true;
        radioButton1.setEnabled(false);
        radioButton2.setEnabled(false);
        radioButton3.setEnabled(false);
        radioButton4.setEnabled(false);
        btn.setEnabled(true);

        for (int i=0; i < Shajariyah_Haafiyah.length;i++){
            if(Shajariyah_Haafiyah[i].equals(str)){
//              btn.setBackgroundColor(getResources().getColor(R.color.design_default_color_error));
                btn.setBackgroundColor(Color.rgb(13,46,28));
                check = false;
            }
        }
        if(check){
            btn.setBackgroundColor(Color.rgb(192,44,3));
        }
    }
    public  void nextActivity2(View v){
        if(moveNext) {
            Intent intent = new Intent(QuizActivity2.this, QuizActivity3.class);
            Intent intent2= getIntent();
            if(!check){
                intent.putExtra("value",intent2.getIntExtra("value",0)+1);
            }
            else{
                intent.putExtra("value",intent2.getIntExtra("value",0));
            }
            startActivity(intent);
        }
    }
}