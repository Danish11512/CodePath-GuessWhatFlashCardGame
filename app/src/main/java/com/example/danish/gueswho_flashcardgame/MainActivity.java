package com.example.danish.gueswho_flashcardgame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    Button btn1;
    TextView first;
    TextView second;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


       btn1 = (Button) findViewById(R.id.button);
        first = (TextView) findViewById(R.id.flashcard_answer);
        second = (TextView) findViewById(R.id.answer);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(first.getVisibility()==View.GONE)
                {
                    first.setVisibility(View.VISIBLE);
                    second.setVisibility(View.GONE);
                }
                else
                {
                    first.setVisibility(View.GONE);
                    second.setVisibility(View.VISIBLE);
                }

            }
        });

        first.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(second.getVisibility()==View.GONE)
                {
                    second.setVisibility(View.VISIBLE);
                    first.setVisibility(View.GONE);
                }
                else
                {
                    second.setVisibility(View.GONE);
                    first.setVisibility(View.VISIBLE);
                }
            }
        });

        second.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(first.getVisibility()==View.GONE)
                {
                    first.setVisibility(View.VISIBLE);
                    second.setVisibility(View.GONE);
                }
                else
                {
                    first.setVisibility(View.GONE);
                    second.setVisibility(View.VISIBLE);
                }
            }
        });





    }



}
