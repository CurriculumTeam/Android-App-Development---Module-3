package com.example.l5a1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnOurButton;
    EditText txtRandomDice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnOurButton = (Button) findViewById(R.id.btnOurButton);
        txtRandomDice = (EditText) findViewById(R.id.editTextPersonName);
        String s;
        btnOurButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Hello " + txtRandomDice.getText().toString()
                                + " Nice to talk to you",
                        Toast.LENGTH_LONG).show();
            }
        });
    }
}