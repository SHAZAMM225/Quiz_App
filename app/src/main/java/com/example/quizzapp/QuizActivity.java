package com.example.quizzapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class QuizActivity extends AppCompatActivity {
    private Button nextBtn,option1,option2,option3,option4;
    private TextView questions,questionNumber;
    private Timer quizTimer;
    private int seconds=0,totalTimer=1;

    private  List<QuestionList> questionList=new ArrayList<>();

    private int curentQuestionsPosition=0;

    String selectedOptionByUser="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);



        final ImageView backBtn=findViewById(R.id.back_btn);
        final TextView timer=findViewById(R.id.timer);
        final TextView selectedTopicName=findViewById(R.id.topic_name);
        final String getselected=getIntent().getStringExtra("selectedTopic");

        option1=findViewById(R.id.option_1);
        option2=findViewById(R.id.option_2);
        option3=findViewById(R.id.option_3);
        option4=findViewById(R.id.option_4);
        nextBtn=findViewById(R.id.next_btn);

         questionNumber=findViewById(R.id.questions_number);
         questions=findViewById(R.id.questions);

         questionList=QuestionsBank.getQuestions(getselected);


        selectedTopicName.setText(getselected);


startTimer(timer);

questionNumber.setText((curentQuestionsPosition+1)+"/"+questionList.size());
questions.setText(questionList.get(0).getQuestions());
option1.setText(questionList.get(0).getOption1());
        option2.setText(questionList.get(0).getOption2());
        option3.setText(questionList.get(0).getOption3());
        option4.setText(questionList.get(0).getOption4());




        option1.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {

        if ( selectedOptionByUser.isEmpty())
        {
            selectedOptionByUser=option1.getText().toString();

            option1.setBackgroundResource(R.drawable.round_back_red);
            option1.setTextColor(Color.WHITE);

            revealAnswer();

            questionList.get(curentQuestionsPosition).setUserSelectedAnswer(selectedOptionByUser);
        }
    }
});

        option2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ( selectedOptionByUser.isEmpty())
                {
                    selectedOptionByUser=option2.getText().toString();

                    option2.setBackgroundResource(R.drawable.round_back_red);
                    option2.setTextColor(Color.WHITE);

                    revealAnswer();

                    questionList.get(curentQuestionsPosition).setUserSelectedAnswer(selectedOptionByUser);
                }

            }
        });option3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if ( selectedOptionByUser.isEmpty())
                {
                    selectedOptionByUser=option3.getText().toString();

                    option3.setBackgroundResource(R.drawable.round_back_red);
                    option3.setTextColor(Color.WHITE);

                    revealAnswer();

                    questionList.get(curentQuestionsPosition).setUserSelectedAnswer(selectedOptionByUser);
                }

            }
        });option4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if ( selectedOptionByUser.isEmpty())
                {
                    selectedOptionByUser=option4.getText().toString();

                    option4.setBackgroundResource(R.drawable.round_back_red);
                    option4.setTextColor(Color.WHITE);

                    revealAnswer();

                    questionList.get(curentQuestionsPosition).setUserSelectedAnswer(selectedOptionByUser);
                }

            }
        });

backBtn.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        quizTimer.purge();
    }
});

nextBtn.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        if ( selectedOptionByUser.isEmpty())
        {
            Toast.makeText(QuizActivity.this,"Please Select an Option ",Toast.LENGTH_SHORT).show();


        }else{
         changeNextQuestion();
        }

    }
});
    }

    private void startTimer(TextView timerTextView) {
        quizTimer = new Timer();

        quizTimer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                if (seconds == 0 && totalTimer == 0) {
                    quizTimer.purge();
                    quizTimer.cancel();
                    Toast.makeText(QuizActivity.this, "Timer Over", Toast.LENGTH_SHORT).show();

                    Intent i = new Intent(QuizActivity.this, QuizRes.class);
                    i.putExtra("correct", getCorrectAnswers());
                    i.putExtra("incorrect",getIncorrectAnswers());
                    startActivity(i);
                    finish();
                } else {
                    if (seconds == 0) {
                        totalTimer--;
                        seconds = 59;
                    } else {
                        seconds--;
                    }
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            String finalminutes=String.valueOf(totalTimer);
                            String finalSeconds=String.valueOf(seconds);

                            if ( finalminutes.length() == 1)
                            {
                                finalminutes='0'+finalSeconds;
                            }else
                            {
                                timerTextView.setText(finalminutes+":"+finalSeconds);
                            }
                        }
                    });
                }
            }
        }, 1000, 1000);
    }

    private int getCorrectAnswers(){

        int cocrrectAnswer=0;
        for ( int i =0;i<questionList.size();i++)
        {
            String getSelectedAnswer=questionList.get(i).getUserSelectedAnswer();
                    String getAnswer=questionList.get(i).getAnswer();

            if ( getSelectedAnswer.equals(getAnswer))
            {
                cocrrectAnswer++;
            }
        }


        return cocrrectAnswer;
    }

    private int getIncorrectAnswers(){

        int incocrrectAnswer=0;
        for ( int i =0;i<questionList.size();i++)
        {
            String getSelectedAnswer=questionList.get(i).getUserSelectedAnswer();
            String getAnswer=questionList.get(i).getAnswer();

            if ( !getSelectedAnswer.equals(getAnswer))
            {
                incocrrectAnswer++;
            }
        }


        return incocrrectAnswer;
    }

    @Override
    public void onBackPressed() {
        quizTimer.purge();
        quizTimer.cancel();

        startActivity(new Intent(QuizActivity.this,MainActivity.class));
finish();

    }


    private void revealAnswer(){
        String getAnswer=questionList.get(curentQuestionsPosition).getAnswer();

                if ( option1.getText().toString().equals(getAnswer))
                {
                    option1.setBackgroundResource(R.drawable.round_back_green);
                    option1.setTextColor(Color.WHITE);

                }else{

                }
        if ( option2.getText().toString().equals(getAnswer))
        {
            option2.setBackgroundResource(R.drawable.round_back_green);
            option2.setTextColor(Color.WHITE);

        }else{

        }
        if ( option3.getText().toString().equals(getAnswer))
        {
            option3.setBackgroundResource(R.drawable.round_back_green);
            option3.setTextColor(Color.WHITE);

        }else if ( option4.getText().toString().equals(getAnswer))
        {
            option4.setBackgroundResource(R.drawable.round_back_green);
            option4.setTextColor(Color.WHITE);

        }

    }

    private  void changeNextQuestion(){
        curentQuestionsPosition++;
        if (( curentQuestionsPosition+1) ==questionList.size())
        {
            nextBtn.setText("Submit Quiz");

        }
        if ( curentQuestionsPosition<questionList.size()){
            selectedOptionByUser="";

            option1.setBackgroundResource(R.drawable.round_back_white);
            option1.setTextColor(Color.parseColor("#1F6BB8"));


            option2.setBackgroundResource(R.drawable.round_back_white);
            option2.setTextColor(Color.parseColor("#1F6BB8"));


            option3.setBackgroundResource(R.drawable.round_back_white);
            option3.setTextColor(Color.parseColor("#1F6BB8"));

            option4.setBackgroundResource(R.drawable.round_back_white);
            option4.setTextColor(Color.parseColor("#1F6BB8"));


            questionNumber.setText((curentQuestionsPosition+1)+"/"+questionList.size());
            questions.setText(questionList.get(curentQuestionsPosition).getQuestions());


            option1.setText(questionList.get(curentQuestionsPosition).getOption1());
            option2.setText(questionList.get(curentQuestionsPosition).getOption2());
            option3.setText(questionList.get(curentQuestionsPosition).getOption3());
            option4.setText(questionList.get(curentQuestionsPosition).getOption4());

        }else
        {
            Intent i = new Intent(QuizActivity.this,QuizRes.class);
            i.putExtra("correct",getCorrectAnswers());
            i.putExtra("incorrect",getIncorrectAnswers());
            startActivity(i);

            finish();

        }

    }
}