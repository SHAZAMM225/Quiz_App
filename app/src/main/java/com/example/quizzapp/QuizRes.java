package com.example.quizzapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class QuizRes extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_res);

        final Button start =findViewById(R.id.startQuizNew);
        final TextView correct=findViewById(R.id.correctAns);
        final TextView incorect=findViewById(R.id.incorect);


        correct.setText(correct.getText()+String.valueOf(getIntent().getIntExtra("correct",0)));
        incorect.setText(incorect.getText()+String.valueOf(getIntent().getIntExtra("incorrect",0)));


        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(QuizRes.this,MainActivity.class));
                finish();
            }
        });

    }
}