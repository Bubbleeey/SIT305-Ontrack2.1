package com.example.week2prac;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    //declared varables
    Button bplus;
    Button btimes;
    Button bminus;
    Button bdivide;
    TextView textcal;
    EditText numb1;
    EditText numb2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bplus = findViewById(R.id.bplus);
        btimes = findViewById(R.id.btimes);
        bminus = findViewById(R.id.bminus);
        bdivide = findViewById(R.id.bdivide);
        textcal = findViewById(R.id.textcal);
        numb1 = findViewById(R.id.numb1);
        numb2 = findViewById(R.id.numb2);

        //plus button
        bplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //checks to make sure their is an int in each field
                if (numb1.getText().toString().length() == 0)
                {
                   numb1.setText("0");
                }
                if (numb2.getText().toString().length() == 0)
                {
                    numb2.setText("0");
                }
                //converts each field to an int
               int num1 = Integer.parseInt(numb1.getText().toString());
               int num2 = Integer.parseInt(numb2.getText().toString());
               //calculation
               int sum = num1 + num2;
               //sets sum back to a string and replaces last string of textcal field
               textcal.setText(String.valueOf(sum));
            }
        });

        //times button
        btimes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //checks to make sure their is an int in each field
                if (numb1.getText().toString().length() == 0) {
                    numb1.setText("0");
                }
                if (numb2.getText().toString().length() == 0) {
                    numb2.setText("0");
                }
                //converts each field to an int
                int num1 = Integer.parseInt(numb1.getText().toString());
                int num2 = Integer.parseInt(numb2.getText().toString());
                //calculation
                int sum = num1 * num2;
                //sets sum back to a string and replaces last string of textcal field
                textcal.setText(String.valueOf(sum));
            }
        });

        //minus button
        bminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //checks to make sure their is an int in each field
                if (numb1.getText().toString().length() == 0) {
                    numb1.setText("0");
                }
                if (numb2.getText().toString().length() == 0) {
                    numb2.setText("0");
                }
                //converts each field to an int
                int num1 = Integer.parseInt(numb1.getText().toString());
                int num2 = Integer.parseInt(numb2.getText().toString());
                //calculation
                int sum = num1 - num2;
                //sets sum back to a string and replaces last string of textcal field
                textcal.setText(String.valueOf(sum));
            }
        });

        //divide button
        bdivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //checks to make sure their is an int in each field
                if (numb1.getText().toString().length() == 0) {
                    numb1.setText("0");
                }
                if (numb2.getText().toString().length() == 0) {
                    numb2.setText("0");
                }
                //converts each field to an int
                int num1 = Integer.parseInt(numb1.getText().toString());
                int num2 = Integer.parseInt(numb2.getText().toString());
                //calculation
                int sum = num1 / num2;
                //sets sum back to a string and replaces last string of textcal field
                textcal.setText(String.valueOf(sum));
            }
        });
    }
}