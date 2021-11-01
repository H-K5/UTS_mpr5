package com.example.uts_066;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;

public class Page2 extends AppCompatActivity {
    public static final String EXTRA_TEXT = "com.example.application.example.EXTRA_TEXT";
    TextView userName, userGender;
    Button buttonP3;
    RadioButton radmale, radfemale;
    ImageView x;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);

        buttonP3 = (Button)findViewById(R.id.butpage3);
        buttonP3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goPage3();
            }
        });

        radmale = (RadioButton)findViewById(R.id.RadioMale);
        radfemale = (RadioButton)findViewById(R.id.RadioFemale);

        radmale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                radfemale.setChecked(false);
                userGender = (TextView) findViewById(R.id.userGe);
                userGender.setText("male");
            }
        });
        radfemale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                radmale.setChecked(false);
                userGender = (TextView) findViewById(R.id.userGe);
                userGender.setText("female");
            }
        });

        Intent intent = getIntent();
        String text = intent.getStringExtra(MainActivity.EXTRA_TEXT);

        userName = (TextView) findViewById(R.id.userNa);
        userName.setText(text);
    }

    public void goPage3(){
        TextView namaChar = (TextView) findViewById(R.id.userNa);
        TextView genChar = (TextView) findViewById(R.id.userGe);
        String text2 = namaChar.length()
                + namaChar.getText().toString()
                + genChar.getText().toString();
        Intent intent2 = new Intent(this, Page3.class);
        intent2.putExtra(EXTRA_TEXT,text2);
        startActivity(intent2);

    }
}