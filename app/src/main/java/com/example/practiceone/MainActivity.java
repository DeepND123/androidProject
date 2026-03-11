package com.example.practiceone;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.practiceone.firstPage.LoginPage;

public class MainActivity extends AppCompatActivity {
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button=findViewById(R.id.button);
                button.setOnClickListener(v -> {

                        Intent intent=new Intent(
                                MainActivity.this,
                                LoginPage.class);
                        startActivity(intent);

                });
    }
}