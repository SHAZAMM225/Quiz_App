package com.example.quizzapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private String selectedTopicName="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        final LinearLayout java_ln=findViewById(R.id.java_ln);
        final LinearLayout swift_ln=findViewById(R.id.swift_ln);
        final LinearLayout react_ln=findViewById(R.id.react_ln);
        final LinearLayout flutter_ln=findViewById(R.id.flutter_ln);
        final Button btn=findViewById(R.id.btn);


        java_ln.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                selectedTopicName="Java";

                java_ln.setBackgroundResource(R.drawable.strocke);
//                swift_ln.setBackgroundResource(R.drawable.strocke);
//                flutter_ln.setBackgroundResource(R.drawable.strocke);
//                react_ln.setBackgroundResource(R.drawable.strocke);




            }
        });


        swift_ln.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                selectedTopicName="Swift";
//
//                java_ln.setBackgroundResource(R.drawable.strocke);
                swift_ln.setBackgroundResource(R.drawable.strocke);
//                flutter_ln.setBackgroundResource(R.drawable.strocke);
//                react_ln.setBackgroundResource(R.drawable.strocke);




            }
        });
        flutter_ln.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                selectedTopicName="Flutter";
//
//                java_ln.setBackgroundResource(R.drawable.strocke);
//                swift_ln.setBackgroundResource(R.drawable.strocke);
                flutter_ln.setBackgroundResource(R.drawable.strocke);
//                react_ln.setBackgroundResource(R.drawable.strocke);




            }
        });

        react_ln.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                selectedTopicName="React Native";

//                java_ln.setBackgroundResource(R.drawable.strocke);
//                swift_ln.setBackgroundResource(R.drawable.strocke);
//                flutter_ln.setBackgroundResource(R.drawable.strocke);
                react_ln.setBackgroundResource(R.drawable.strocke);




            }
        });

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ( selectedTopicName.isEmpty())
                {
                    Toast.makeText(MainActivity.this,"Please select the Topic ",Toast.LENGTH_SHORT).show();

                }else
                {
                    Intent i = new Intent(MainActivity.this,QuizActivity.class);

                    i.putExtra("selectedTopic",selectedTopicName);
                    startActivity(i);
                }
            }
        });

    }
}