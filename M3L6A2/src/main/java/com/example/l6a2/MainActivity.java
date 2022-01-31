package com.example.l6a2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    ImageView imgFact;
    Button btnFact;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgFact = (ImageView) findViewById(R.id.imgFact);
        btnFact = (Button) findViewById(R.id.button);

        Drawable FactImages[] = new Drawable[10];
        String FactText[] = new String[10];

        Resources res = getResources();
        FactImages[0] = res.getDrawable(R.drawable.factone);
        FactImages[1] = res.getDrawable(R.drawable.facttwo);
        FactImages[2] = res.getDrawable(R.drawable.factthree);
        FactImages[3] = res.getDrawable(R.drawable.factfour);
        FactImages[4] = res.getDrawable(R.drawable.factfive);
        FactImages[5] = res.getDrawable(R.drawable.factsix);
        FactImages[6] = res.getDrawable(R.drawable.factseven);
        FactImages[7] = res.getDrawable(R.drawable.facteight);
        FactImages[8] = res.getDrawable(R.drawable.factnine);
        FactImages[9] = res.getDrawable(R.drawable.factten);

        btnFact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random randomNumber = new Random();
                int numberGenerated = randomNumber.nextInt(10 - 0) + 0;
                imgFact.setImageDrawable(FactImages[numberGenerated]);
            }
        });


    }
}