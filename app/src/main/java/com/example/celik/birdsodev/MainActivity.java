package com.example.celik.birdsodev;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ImageView resim;
    int poz;
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resim = (ImageView) findViewById(R.id.imageView);
        text = (TextView) findViewById(R.id.text);
    }
    public void baykus(View view) {

        Birds baykus = new Birds("baykus", "gece", 1);
        poz = baykus.getResim();

        if (poz == 1) {
            resim.setImageResource(R.drawable.baykus);
            String kusOzellik = " tip " + baykus.getTip()+ " properties " + baykus.getOzellik();
            text.setText(kusOzellik);
        }
    }
    public void leylek(View view) {
        Birds leylek = new Birds("leylek", "gaga", 2);
        poz = leylek.getResim();
        if (poz == 2) {
            resim.setImageResource(R.drawable.leylek);

        }
    }
    public void flamingo(View view) {
        Birds flamingo = new Birds("flamingo", "turuncu", 3);
        poz = flamingo.getResim();
        if (poz == 3) {
            resim.setImageResource(R.drawable.flamingo);
        }
    }
    public void pelikan(View view) {
        Birds pelikan = new Birds("pelikan", "BEYAZ", 4);
        poz = pelikan.getResim();
        if (poz == 4) {
            resim.setImageResource(R.drawable.pelikan);

        }
    }

}