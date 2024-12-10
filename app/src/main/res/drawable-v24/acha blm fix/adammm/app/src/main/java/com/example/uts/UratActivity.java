package com.example.uts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class UratActivity extends AppCompatActivity {
    Button btnurat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_urat);

        btnurat = findViewById(R.id.btnurat);
        btnurat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnurat = new Intent(getApplicationContext(), MenuActivity.class);
                startActivity(btnurat);
            }
        });
    }
}