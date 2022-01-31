package com.example.l4acp1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btnOurButton;
    TextView txtRandomDice;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnOurButton = (Button) findViewById(R.id.btnOurButton);
        txtRandomDice = (TextView) findViewById(R.id.txtOurText);

        btnOurButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtRandomDice.setText("Text Added");
                txtRandomDice.setTextSize(70);
            }
        });
    }
}