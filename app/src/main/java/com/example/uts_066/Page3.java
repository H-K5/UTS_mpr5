package com.example.uts_066;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Locale;

public class Page3 extends AppCompatActivity {

    TextView resName, resGen;
    ImageView resGamb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page3);

        Intent intent = getIntent();
        String text = intent.getStringExtra(MainActivity.EXTRA_TEXT);
        Integer n = Integer.parseInt(text.substring(0,1));
        Integer nt = text.length();
        resName = (TextView) findViewById(R.id.resNama);
        resName.setText("Char name : " + text.substring(1,n+1));

        resGen = (TextView) findViewById(R.id.resGend);
        resGen.setText(text.substring(n+1, nt));
    }
}