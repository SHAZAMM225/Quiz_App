package com.example.quizzapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    private String selectedTopicName="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        final LinearLayout java_ln=findViewById(R.id.java_ln);
        final LinearLayout php_ln=findViewById(R.id.php_ln);
        final LinearLayout andro_ln=findViewById(R.id.andro_ln);
        final LinearLayout html_ln=findViewById(R.id.html_ln);
        final Button btn=findViewById(R.id.btn);


        java_ln.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                selectedTopicName="Java";

                java_ln.setBackgroundResource(R.drawable.strocke);
                html_ln.setBackgroundResource(R.drawable.strocke);
                php_ln.setBackgroundResource(R.drawable.strocke);
                andro_ln.setBackgroundResource(R.drawable.strocke);




            }
        });


        php_ln.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                selectedTopicName="PHP";

                java_ln.setBackgroundResource(R.drawable.strocke);
                html_ln.setBackgroundResource(R.drawable.strocke);
                php_ln.setBackgroundResource(R.drawable.strocke);
                andro_ln.setBackgroundResource(R.drawable.strocke);



            }
        });

        html_ln.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                selectedTopicName="Html";

                java_ln.setBackgroundResource(R.drawable.strocke);
                html_ln.setBackgroundResource(R.drawable.strocke);
                php_ln.setBackgroundResource(R.drawable.strocke);
                andro_ln.setBackgroundResource(R.drawable.strocke);



            }
        });

        andro_ln.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                selectedTopicName="Android";

                java_ln.setBackgroundResource(R.drawable.strocke);
                html_ln.setBackgroundResource(R.drawable.strocke);
                php_ln.setBackgroundResource(R.drawable.strocke);
                andro_ln.setBackgroundResource(R.drawable.strocke);



            }
        });

    }
}