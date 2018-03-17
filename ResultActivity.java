package com.google.sample.cloudvision;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by aashish1111 on 4/8/2017.
 */


public class ResultActivity extends AppCompatActivity {
    private TextView resultText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        resultText = (TextView) findViewById(R.id.resulttext);
        String passedArg = getIntent().getExtras().getString("result1");


//Extract the data…

        if (passedArg != null && !passedArg.isEmpty()) {
            {
                resultText.setText(passedArg);
            }

        }
    }
}