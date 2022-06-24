package com.example.signuoactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SignUpActivity extends AppCompatActivity {

    EditText txtEmail,txtPassword;
    TextView txtLogin;
    String Email,PassWord,emailVali="@gmail.com";
    Button btnSignUp1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        initView();
    }

    private void initView() {

        txtLogin = findViewById(R.id.txtLogin);
        txtPassword = findViewById(R.id.txtPassword);
        txtEmail = findViewById(R.id.txtEmail);
        btnSignUp1 = findViewById(R.id.btnSignUp1);

        btnSignUp1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Email = txtEmail.getText().toString();
                PassWord = txtPassword.getText().toString();

                if (Email.isEmpty())
                {
                    Toast.makeText(SignUpActivity.this, "Please enter your email address", Toast.LENGTH_SHORT).show();
                }
                else if (!Email.endsWith(emailVali)){
                    Toast.makeText(SignUpActivity.this, "Please enter validated email address !", Toast.LENGTH_SHORT).show();
                }
                else if (PassWord.isEmpty())
                {
                    Toast.makeText(SignUpActivity.this, "Please enter your password", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Intent a = new Intent(SignUpActivity.this,LogInActivity.class);
                    a.putExtra("Email",Email);
                    a.putExtra("PassWord",PassWord);
                    startActivity(a);

                }

            }
        });


        txtLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent6 = new Intent(SignUpActivity.this,LogInActivity.class);
                startActivity(intent6);
            }
        });



    }
}