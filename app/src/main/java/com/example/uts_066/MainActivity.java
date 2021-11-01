package com.example.uts_066;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_TEXT = "com.example.application.example.EXTRA_TEXT";
    TextView tombolInfo;
    Button buttonP2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonP2 = (Button)findViewById(R.id.butpage2);
        buttonP2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goPage2();
            }
        });

        tombolInfo = (TextView)findViewById(R.id.barTentang);
        tombolInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDialog();
            }
        });
    }

    public void openDialog(){
         InfoProgram infoP = new InfoProgram();
         infoP.show(getSupportFragmentManager(), "Info Dialog");
    }

    public void goPage2(){
        EditText editNama = (EditText) findViewById(R.id.barNama) ;
        String text = editNama.getText().toString();
        Intent intent = new Intent(this, Page2.class);
        intent.putExtra(EXTRA_TEXT,text);
        startActivity(intent);
    }
}