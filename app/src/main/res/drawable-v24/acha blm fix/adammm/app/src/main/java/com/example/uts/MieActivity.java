package com.example.uts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MieActivity extends AppCompatActivity {

    Button btnbek3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mie);

        btnbek3 = findViewById(R.id.btnbek3);
        btnbek3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnbek3 = new Intent(getApplicationContext(), MenuActivity.class);
                startActivity(btnbek3);
            }
        });
    }
}