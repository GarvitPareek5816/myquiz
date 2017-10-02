package com.example.lenovopc.myquiz;


import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.io.Serializable;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button answer1, answer2, answer3, answer4;
    TextView score ;
    TextView question;

    private Questions mQuestions = new Questions();
    private String mAnswer;
    private int mScore = 0;
    private int mQuestionsLength = mQuestions.mQuestions.length;

    Random r;
    private  int index[]= new int[7] ;
    private int nextQuestion ;

    private int qn=0;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        r = new Random();

        answer1 = (Button) findViewById(R.id.answer1);
        answer2 = (Button) findViewById(R.id.answer2);
        answer3 = (Button) findViewById(R.id.answer3);
        answer4 = (Button) findViewById(R.id.answer4);

       // score = (TextView) findViewById(R.id.score);
        question = (TextView) findViewById(R.id.questions);

    //    score.setText("Score :" + mScore);
        updateQuestion(r.nextInt(mQuestionsLength));

        answer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (answer1.getText() == mAnswer) {
                    mScore++;
                //    updateQuestion(r.nextInt(mQuestionsLength));
                    updateQuestion(nextQuestion);
                } else {
                   // gameOver();
                  //  updateQuestion(r.nextInt(mQuestionsLength));
                    updateQuestion(nextQuestion);
                }
            }
        });


        answer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (answer2.getText() == mAnswer) {
                    mScore++;
                 //   updateQuestion(r.nextInt(mQuestionsLength));
                    updateQuestion(nextQuestion);

                } else {
                  //  gameOver();
               //     updateQuestion(r.nextInt(mQuestionsLength));
                    updateQuestion(nextQuestion);
                }

            }
        });

        answer3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (answer3.getText() == mAnswer) {
                    mScore++;
               //     updateQuestion(r.nextInt(mQuestionsLength));
                    updateQuestion(nextQuestion);
                } else {
                   // gameOver();
               //     updateQuestion(r.nextInt(mQuestionsLength));
                    updateQuestion(nextQuestion);
                }

            }
        });

        answer4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (answer4.getText() == mAnswer) {
                    mScore++;
           //         updateQuestion(r.nextInt(mQuestionsLength));
                    updateQuestion(nextQuestion);
                } else {
                  //  gameOver();
          //          updateQuestion(r.nextInt(mQuestionsLength));
                    updateQuestion(nextQuestion);
                }






            }
        });

       // Intent intent=new Intent(getApplicationContext(),score.class);
        //intent.putExtra("SCORE", (Serializable) score);
        //startActivity(intent);



    }




private boolean isPresent(int[] array, int ele){
    int i=0;
    while(i < 6) {
        if(array[i]==ele)
            return true;
        else {
            i++;
            if(i==6)
                return false;
        }
    }
   return true;
}

    private void updateQuestion(int num) {
        qn++ ;
        if(qn > 6)
        {
            gameOver();
        }

        else
        {

            question.setText("Q" + qn + ". " + mQuestions.getQuestion(num));
            answer1.setText(mQuestions.getChoice1(num));
            answer2.setText(mQuestions.getChoice2(num));
            answer3.setText(mQuestions.getChoice3(num));
            answer4.setText(mQuestions.getChoice4(num));

            mAnswer = mQuestions.getCorrectAnswer(num);
            index[qn-1]=num+1;
            do {
                nextQuestion= r.nextInt(mQuestionsLength);
            }while(isPresent(index,nextQuestion+1));
        }
    }

    private void gameOver() {

        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(MainActivity.this);
        alertDialogBuilder.setMessage("Game Over ! Your Score is " + mScore)
                .setCancelable(false)
                .setPositiveButton("New Game",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                startActivity(new Intent(getApplicationContext(), MainActivity.class));
                            }
                        })

                .setNegativeButton("Exit",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                finish();
                            }
                        });
           AlertDialog alertDialog = alertDialogBuilder.create();
           alertDialog.show();
    }
}
