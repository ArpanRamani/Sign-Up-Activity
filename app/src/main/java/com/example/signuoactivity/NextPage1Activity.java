package com.example.signuoactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NextPage1Activity extends AppCompatActivity {


    Button btnSkip1,btnSignUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next_page1);
        initView();
    }

    private void initView() {

        btnSkip1 = findViewById(R.id.btnSkip1);
        btnSignUp = findViewById(R.id.btnSignUp);

        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(NextPage1Activity.this,SignUpActivity.class);
                startActivity(intent);
            }
        });

        btnSkip1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent10 = new Intent(NextPage1Activity.this,SignUpActivity.class);
                startActivity(intent10);

            }
        });



    }

}