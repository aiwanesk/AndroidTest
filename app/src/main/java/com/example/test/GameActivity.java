package com.example.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import java.util.Arrays;

public class GameActivity extends AppCompatActivity {
    private TextView mQuestionText;
    private Button mReplyButton1, mReplyButton2, mReplyButton3, mReplyButton4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        mQuestionText = (TextView) findViewById(R.id.activity_game_question_text);
        mReplyButton1 = (Button) findViewById(R.id.activity_game_answer1_btn);
        mReplyButton2 = (Button) findViewById(R.id.activity_game_answer2_btn);
        mReplyButton3 = (Button) findViewById(R.id.activity_game_answer3_btn);
        mReplyButton4 = (Button) findViewById(R.id.activity_game_answer4_btn);


        Question question1 = new Question("Who is the creator of Android?",

                Arrays.asList("Andy Rubin",

                        "Steve Wozniak",

                        "Jake Wharton",

                        "Paul Smith"),

                0);


        Question question2 = new Question("When did the first man land on the moon?",

                Arrays.asList("1958",

                        "1962",

                        "1967",

                        "1969"),

                3);


        Question question3 = new Question("What is the house number of The Simpsons?",

                Arrays.asList("42",

                        "101",

                        "666",

                        "742"),

                3);


        return new QuestionBank(Arrays.asList(question1,

                question2,

                question3));
    }
}
