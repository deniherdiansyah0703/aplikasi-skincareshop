package com.example.uts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class KomplitActivity extends AppCompatActivity {
    Button btnbek2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_komplit);

        btnbek2 = findViewById(R.id.btnbek2);
        btnbek2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnbek2 = new Intent(getApplicationContext(), MenuActivity.class);
                startActivity(btnbek2);
            }
        });
    }
}