package com.example.elementarycalculator;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity
{
    @SuppressLint("DefaultLocale")
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button add = findViewById(R.id.add_ButtonObject);
        add.setOnClickListener(v ->
        {
            EditText firstNumber = findViewById(R.id.firstNumber_EditTextObject);
            EditText secondNumber = findViewById(R.id.secondNumber_EditTextObject);
            TextView result = findViewById(R.id.result_TextViewObject);

            int firstNumberAsInteger = Integer.parseInt(firstNumber.getText().toString());
            int secondNumberAsInteger = Integer.parseInt(secondNumber.getText().toString());
            int resultAsInteger = firstNumberAsInteger + secondNumberAsInteger;
            result.setText(String.format("%d", resultAsInteger));
        });
    }
}
