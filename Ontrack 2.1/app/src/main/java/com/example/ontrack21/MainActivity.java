package com.example.ontrack21;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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
        if(parent.getItemAtPosition(position).toString() == "Meter")
        {

        }
        if(parent.getItemAtPosition(position).toString() == "Celsius")
        {

        }
        if(parent.getItemAtPosition(position).toString() == "Kilograms")
        {

        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}