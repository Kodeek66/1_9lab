package com.example.a1_9lab;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity
{
    private EditText inputA;
    private EditText inputB;
    private TextView outputC;
    private Button CalcB;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.inputA = this.findViewById(R.id.inputA);
        this.inputB = this.findViewById(R.id.inputB);
        this.outputC = this.findViewById(R.id.outputC);
        this.CalcB = this.findViewById(R.id.calcB);
        this.outputC.setText("");
    }
    public void onCalcButton(View v)
    {
            if(v == CalcB)
        {
            Integer a = Integer.valueOf(inputA.getText().toString());
            Integer b = Integer.valueOf(inputB.getText().toString());

            Integer cValue = (a * a) + (b * b);
            double answer = Math.sqrt(cValue);
            this.outputC.setText((int) answer);
        }



    }

}