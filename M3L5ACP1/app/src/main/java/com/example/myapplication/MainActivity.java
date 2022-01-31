package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnOurButton;
    Button btnSub;
    Button btnMul;
    EditText txtNumberOne;
    EditText txtNumberTwo;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnOurButton = (Button) findViewById(R.id.btnAdd);
        btnSub = (Button) findViewById(R.id.btnSubtract);
        btnMul = (Button) findViewById(R.id.btnMultiply);

        txtNumberOne = (EditText) findViewById(R.id.editTextNumberOne);
        txtNumberTwo = (EditText) findViewById(R.id.editTextNumberTwo);

        result = (TextView) findViewById(R.id.txtAdded);

        btnOurButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(txtNumberOne.length()>0 && txtNumberTwo.length()>0)
                {
                    int addedSum = Integer.parseInt(txtNumberOne.getText().toString()) +
                            Integer.parseInt(txtNumberTwo.getText().toString()) ;
                    result.setText("Result = " + Integer.toString(addedSum));
                }
            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(txtNumberOne.length()>0 && txtNumberTwo.length()>0)
                {
                    int addedSum = Integer.parseInt(txtNumberOne.getText().toString()) -
                            Integer.parseInt(txtNumberTwo.getText().toString()) ;
                    result.setText("Result = " + Integer.toString(addedSum));
                }
            }
        });

        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(txtNumberOne.length()>0 && txtNumberTwo.length()>0)
                {
                    int addedSum = Integer.parseInt(txtNumberOne.getText().toString()) *
                            Integer.parseInt(txtNumberTwo.getText().toString()) ;
                    result.setText("Result = " + Integer.toString(addedSum));
                }
            }
        });
    }
}