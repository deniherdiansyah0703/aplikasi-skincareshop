package com.example.uts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AciActivity extends AppCompatActivity {

    Button btnbek1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aci);

        btnbek1 = findViewById(R.id.btnbek1);
        btnbek1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnbek1 = new Intent(getApplicationContext(), MenuActivity.class);
                startActivity(btnbek1);
            }
        });
    }
}