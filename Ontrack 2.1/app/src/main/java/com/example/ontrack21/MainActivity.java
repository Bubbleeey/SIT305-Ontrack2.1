package com.example.ontrack21;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    //declared variables
    Button button1;
    Button button2;
    Button button3;
    EditText input;
    TextView output1name;
    TextView output1;
    TextView output2name;
    TextView output2;
    TextView output3name;
    TextView output3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //assigns all variables to their ui elements
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        input = findViewById(R.id.input);
        output1name = findViewById(R.id.output1name);
        output1 = findViewById(R.id.output1);
        output2name = findViewById(R.id.output2name);
        output2 = findViewById(R.id.output2);
        output3name = findViewById(R.id.output3name);
        output3 = findViewById(R.id.output3);

        //creates spinner array and applys it to the spinner
        Spinner spinner = findViewById(R.id.spinner);
        //sets up the selector for the spinner
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.unit, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        //Where Button on click functions go
        //and inside each button if statement to adapit to which one is selected in array
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(parent.getSelectedItem().toString().equals("Metre"))
                {
                    output1.setText("1");
                }
                if(parent.getSelectedItem().toString().equals("Celsius"))
                {
                    output1.setText("2");
                }
                if(parent.getSelectedItem().toString().equals("Kilograms"))
                {
                    output1.setText("3");
                }
            }
        });
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}