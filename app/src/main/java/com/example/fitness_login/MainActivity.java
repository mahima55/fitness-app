package com.example.fitness_login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button stringGenerateButton;
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        stringGenerateButton=(Button)findViewById(R.id.button);
        textView=(TextView)findViewById(R.id.textView);

        stringGenerateButton.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                GENERATE();
            }
        });
    }
    private void GENERATE(){
        Randomstring randomString =new Randomstring();
        String result = randomString.generateAlphanumeric(5);
        textView.setText(result);
    }
}