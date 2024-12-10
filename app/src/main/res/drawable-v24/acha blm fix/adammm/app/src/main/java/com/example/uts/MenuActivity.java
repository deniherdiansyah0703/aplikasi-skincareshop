package com.example.uts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MenuActivity extends AppCompatActivity {

    ImageView baso, aci, suwir, komplit, mie, tulang;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        komplit = findViewById(R.id.komplit);
        komplit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent komplit = new Intent(getApplicationContext(), KomplitActivity.class);
                startActivity(komplit);
            }
        });

        mie = findViewById(R.id.mie);
        mie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mie = new Intent(getApplicationContext(), MieActivity.class);
                startActivity(mie);
            }
        });

        baso = findViewById(R.id.baso);
        baso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent baso = new Intent(getApplicationContext(), UratActivity.class);
                startActivity(baso);
            }
        });
        aci = findViewById(R.id.aci);
        aci.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent aci = new Intent(getApplicationContext(), AciActivity.class);
                startActivity(aci);
            }
        });

        suwir = findViewById(R.id.suwir);
        suwir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent suwir = new Intent(getApplicationContext(), SuwirActivity.class);
                startActivity(suwir);
            }
        });

        tulang = findViewById(R.id.tulang);
        tulang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tulang = new Intent(getApplicationContext(), TulangActivity.class);
                startActivity(tulang);
            }
        });
    }
}