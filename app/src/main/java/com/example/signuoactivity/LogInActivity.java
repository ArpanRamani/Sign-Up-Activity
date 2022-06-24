package com.example.signuoactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LogInActivity extends AppCompatActivity {

    String Email;
    String PassWord;
    String email;
    String password;
    Button btnLogin;
    EditText tEmail,tPassword;
    TextView tSignup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);
        initView();

    }

    private void initView() {

        btnLogin = findViewById(R.id.btnLogin);
        tEmail = findViewById(R.id.tEmail);
        tPassword = findViewById(R.id.tPassword);
        tSignup = findViewById(R.id.tSignup);


        if(getIntent() != null)
        {
            Email = getIntent().getStringExtra("Email");
            PassWord = getIntent().getStringExtra("PassWord");
        }
        tEmail.setText(Email);
        tPassword.setText(PassWord);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                email = tEmail.getText().toString();
                password = tPassword.getText().toString();

                if (email.isEmpty())
                {
                    Toast.makeText(LogInActivity.this, "please enter your email address", Toast.LENGTH_SHORT).show();
                }
                else if (password.isEmpty())
                {
                    Toast.makeText(LogInActivity.this, "please enter your password", Toast.LENGTH_SHORT).show();
                }

                else
                {

                    Intent intent9 = new Intent(LogInActivity.this,welcomeActivity.class);
                    startActivity(intent9);
                }


            }
        });



        tSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent8 = new Intent(LogInActivity.this,SignUpActivity.class);
                startActivity(intent8);

            }
        });

    }

}