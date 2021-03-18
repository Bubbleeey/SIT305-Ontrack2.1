package com.example.ontrack21;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    //round utility taken from stackoverflow - https://stackoverflow.com/questions/2808535/round-a-double-to-2-decimal-places
    public static double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();

        long factor = (long) Math.pow(10, places);
        value = value * factor;
        long tmp = Math.round(value);
        return (double) tmp / factor;
    }

    //declared variables
    ImageButton button1;
    ImageButton button2;
    ImageButton button3;
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
                    if(input.getText().toString().length() == 0){input.setText("0");}
                    //sets output names on click of button
                    output1name.setText("Centimetre");
                    output2name.setText("foot");
                    output3name.setText("Inch");
                    //calculation for each output

                    double dubinput = Double.parseDouble(input.getText().toString());
                    output1.setText(String.valueOf(round(dubinput * 100, 2)));
                    output2.setText(String.valueOf(round(dubinput * 3.281, 2)));
                    output3.setText(String.valueOf(round(dubinput * 39.37, 2)));

                }
                if(parent.getSelectedItem().toString().equals("Celsius"))
                {
                    Toast.makeText(MainActivity.this, "Please Sellect Correct Option", Toast.LENGTH_LONG ).show();
                }
                if(parent.getSelectedItem().toString().equals("Kilograms"))
                {
                    Toast.makeText(MainActivity.this, "Please Sellect Correct Option", Toast.LENGTH_LONG ).show();
                }
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(parent.getSelectedItem().toString().equals("Metre"))
                {
                    Toast.makeText(MainActivity.this, "Please Sellect Correct Option", Toast.LENGTH_LONG ).show();
                }
                if(parent.getSelectedItem().toString().equals("Celsius"))
                {
                    if(input.getText().toString().length() == 0){input.setText("0");}
                    //sets output names on click of button
                    output1name.setText("Fahrenheit");
                    output2name.setText("Kelvin");
                    output3name.setText(" ");
                    //calculation for each output

                    double dubinput = Double.parseDouble(input.getText().toString());
                    output1.setText(String.valueOf(round((dubinput * 9/5) + 32, 2)));
                    output2.setText(String.valueOf(round(dubinput + 273.15, 2)));
                    output3.setText(" ");
                }
                if(parent.getSelectedItem().toString().equals("Kilograms"))
                {
                    Toast.makeText(MainActivity.this, "Please Sellect Correct Option", Toast.LENGTH_LONG ).show();
                }
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(parent.getSelectedItem().toString().equals("Metre"))
                {
                    Toast.makeText(MainActivity.this, "Please Sellect Correct Option", Toast.LENGTH_LONG ).show();
                }
                if(parent.getSelectedItem().toString().equals("Celsius"))
                {
                    Toast.makeText(MainActivity.this, "Please Sellect Correct Option", Toast.LENGTH_LONG ).show();
                }
                if(parent.getSelectedItem().toString().equals("Kilograms"))
                {
                    if(input.getText().toString().length() == 0){input.setText("0");}
                    //sets output names on click of button
                    output1name.setText("Gram");
                    output2name.setText("Ounce(Oz)");
                    output3name.setText("Pound(lb)");
                    //calculation for each output

                    double dubinput = Double.parseDouble(input.getText().toString());
                    output1.setText(String.valueOf(round(dubinput * 1000, 2)));
                    output2.setText(String.valueOf(round(dubinput * 35.274, 2)));
                    output3.setText(String.valueOf(round(dubinput * 2.205, 2)));
                }
            }
        });
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}