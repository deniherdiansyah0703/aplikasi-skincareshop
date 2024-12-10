package com.example.uts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SuwirActivity extends AppCompatActivity {

    Button btnbek4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suwir);

        btnbek4 = findViewById(R.id.btnbek4);
        btnbek4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnbek4 = new Intent(getApplicationContext(), MenuActivity.class);
                startActivity(btnbek4);
            }
        });
    }
}