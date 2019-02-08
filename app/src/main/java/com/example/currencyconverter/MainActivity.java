package com.example.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;


public class MainActivity extends AppCompatActivity {

    Double result, displayInput;
    String input;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void onClick(View view) {

        TextView tvInput = findViewById(R.id.editText);
        input = tvInput.getText().toString();

        result = Double.parseDouble(input);
        displayInput = Double.parseDouble(input);
        result = result * 0.77;

        Toast.makeText(this, String.format(Locale.US, "$%.2f is £%.2f", displayInput, result), Toast.LENGTH_SHORT).show();

    }

}
