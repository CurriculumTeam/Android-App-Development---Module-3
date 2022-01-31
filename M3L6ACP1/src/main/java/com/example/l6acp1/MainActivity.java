package com.example.l6acp1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    ImageView imgFact;
    EditText txtCountry;
    Button btnCountry;
    Button skip;
    String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgFact = (ImageView) findViewById(R.id.imageView);
        txtCountry = (EditText) findViewById(R.id.editTextTextPersonName);
        btnCountry = (Button) findViewById(R.id.button);
        skip = (Button) findViewById(R.id.button2);

        Drawable CountryImages[] = new Drawable[11];
        String CountryName[] = new String[11];

        Resources res = getResources();
        CountryImages[0] = res.getDrawable(R.drawable.egypt);
        CountryImages[1] = res.getDrawable(R.drawable.france);
        CountryImages[2] = res.getDrawable(R.drawable.greece);
        CountryImages[3] = res.getDrawable(R.drawable.india);
        CountryImages[4] = res.getDrawable(R.drawable.ireand);
        CountryImages[5] = res.getDrawable(R.drawable.japam);
        CountryImages[6] = res.getDrawable(R.drawable.kena);
        CountryImages[7] = res.getDrawable(R.drawable.kuwait);
        CountryImages[8] = res.getDrawable(R.drawable.nepal);
        CountryImages[9] = res.getDrawable(R.drawable.niger);
        CountryImages[10] = res.getDrawable(R.drawable.nigeria);

        CountryName[0] = "egypt";
        CountryName[1] = "france";
        CountryName[2] = "greece";
        CountryName[3] = "india";
        CountryName[4] = "ireland";
        CountryName[5] = "japan";
        CountryName[6] = "kenya";
        CountryName[7] = "kuwait";
        CountryName[8] = "nepal";
        CountryName[9] = "niger";
        CountryName[10] = "nigeria";

        Random randomNumber = new Random();

        int numberGenerated = randomNumber.nextInt(11 - 0) + 0;
        imgFact.setImageDrawable(CountryImages[numberGenerated]);
        name =  CountryName[numberGenerated];

        btnCountry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(txtCountry.getText().toString().toLowerCase().equals(name))
                {
                    int numberGenerated = randomNumber.nextInt(11 - 0) + 0;
                    imgFact.setImageDrawable(CountryImages[numberGenerated]);
                    name =  CountryName[numberGenerated];
                    Toast.makeText(MainActivity.this, "Correct!! Answer!!",
                            Toast.LENGTH_LONG).show();
                    txtCountry.setText("");
                }
                else
                {
                    Toast.makeText(MainActivity.this, "Wrong Answer",
                            Toast.LENGTH_LONG).show();
                    txtCountry.setText("");
                }
            }
        });

        skip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int numberGenerated = randomNumber.nextInt(11 - 0) + 0;
                imgFact.setImageDrawable(CountryImages[numberGenerated]);
                name =  CountryName[numberGenerated];
                txtCountry.setText("");
            }
        });


    }
}