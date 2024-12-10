package com.example.uts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TulangActivity extends AppCompatActivity {

    Button btnbek5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tulang);

        btnbek5 = findViewById(R.id.btnbek5);
        btnbek5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnbek5 = new Intent(getApplicationContext(), MenuActivity.class);
                startActivity(btnbek5);
            }
        });
    }
}