package com.example.dashboardema;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btncontak, btnprofile, btneducation, btnjob;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btncontak = (Button) findViewById(R.id.btncontak);
        btneducation = (Button) findViewById(R.id.btneducation);
        btnjob = (Button) findViewById(R.id.btnjob);
        btnprofile = (Button) findViewById(R.id.btnprofile);
        btnprofile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, profile.class);
                startActivity(intent);
            }
        });

        btnjob = (Button) findViewById(R.id.btnjob);
        btnjob.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, job.class);
                startActivity(intent);
            }
        });
        btneducation = (Button) findViewById(R.id.btneducation);
        btneducation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, education.class);
                startActivity(intent);
            }
        });

        btncontak = (Button) findViewById(R.id.btncontak);
        btncontak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, contak.class);
                startActivity(intent);
            }
        });

    }
}
