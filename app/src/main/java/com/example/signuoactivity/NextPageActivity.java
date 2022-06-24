package com.example.signuoactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NextPageActivity extends AppCompatActivity {

    Button btnNext1,btnSkip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next_page);
        initView();
    }

    private void initView() {

        btnNext1 = findViewById(R.id.btnNext1);
        btnSkip = findViewById(R.id.btnSkip);
        btnNext1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(NextPageActivity.this,NextPage1Activity.class);
                startActivity(intent2);
            }
        });

        btnSkip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(NextPageActivity.this,SignUpActivity.class);
                startActivity(intent3);
            }
        });

    }
}