package com.example.practiceone.firstPage;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.example.practiceone.R;

public class LoginPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login_page);

        TextView txtReg = findViewById(R.id.txtRegister);
        Button btnLg=findViewById(R.id.btnLogin);

        txtReg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(LoginPage.this, RegisterPage.class);
                startActivity(intent);
                finish();

            }
        });

        btnLg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(LoginPage.this, firstActivity.class);
                startActivity(intent);
                finish();

            }
        });
    }
}