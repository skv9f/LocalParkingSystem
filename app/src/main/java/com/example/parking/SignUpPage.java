package com.example.parking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SignUpPage extends AppCompatActivity {

    Button SignUpBtn;
    TextView LoginText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_page);

        SignUpBtn = findViewById(R.id.SignUpbtn);
        LoginText = findViewById(R.id.SignUpLoginText);

        LoginText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SignUpPage.this,LoginPage.class);
                startActivity(intent);
                finish();
            }
        });

        SignUpBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SignUpPage.this,Home.class);
                startActivity(intent);
                finish();
            }
        });

    }
}