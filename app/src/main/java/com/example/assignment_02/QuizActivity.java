package com.example.assignment_02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

import java.util.Random;

public class QuizActivity extends AppCompatActivity {

    String [] Halqiyah= {"أ ہ","ع ح","غ خ"};
    String[] arabicLetters = {"ق","ک","ل","ن","ر","ت د ط","ظ  ذ  ث","ص ز س","م ن","ف","ب","م","و","باَ بوُ بىِ"};
    String [] Shajariyah_Haafiyah= {"ج ش ی","ض"};
    String[] Questions={"Which of the following is a Halqiyah letter?",
            "Which of the following is a Shajariyah_Haafiyah letter?"};
    RadioButton radioButton1,radioButton2,radioButton3,radioButton4;
    TextView textView, textView1;
    int correctAnswers= 0;
    Boolean moveNext= false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        radioButton4= findViewById(R.id.radioButton4);
        radioButton3= findViewById(R.id.radioButton3);
        radioButton2= findViewById(R.id.radioButton2);
        radioButton1= findViewById(R.id.radioButton);
        Random rand = new Random();
        radioButton4.setText(arabicLetters[rand.nextInt(arabicLetters.length)].toString());
        radioButton3.setText(arabicLetters[rand.nextInt(arabicLetters.length)].toString());
        radioButton2.setText(Halqiyah[rand.nextInt(Halqiyah.length)].toString());
        radioButton1.setText(arabicLetters[rand.nextInt(arabicLetters.length)].toString());
        textView= findViewById(R.id.textView3);
        textView.setText(Questions[0]);
    }
    public void radioButtonClicked(View v) {
        Button btn =findViewById(v.getId());
        String str= btn.getText().toString();
        moveNext= true;
        radioButton1.setEnabled(false);
        radioButton2.setEnabled(false);
        radioButton3.setEnabled(false);
        radioButton4.setEnabled(false);
        btn.setEnabled(true);
        boolean check= true;
            for (int i=0; i < Halqiyah.length;i++){
                if(Halqiyah[i].equals(str)){
//              btn.setBackgroundColor(getResources().getColor(R.color.design_default_color_error));
                    btn.setBackgroundColor(Color.rgb(13,46,28));
                    check = false;
                    correctAnswers++;
                }
            }
        if(check){
            btn.setBackgroundColor(Color.rgb(192,44,3));
        }
    }
    public  void nextActivity(View v){
        if(moveNext) {
            Intent intent = new Intent(QuizActivity.this, QuizActivity2.class);
            intent.putExtra("value", correctAnswers);
            startActivity(intent);
        }
    }

}