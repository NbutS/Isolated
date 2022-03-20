package com.example.isolated;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    private Button btnQRCODE, btn5K, btnHD;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        initViews();

        btn5K.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,FiveKRule.class);
                startActivity(intent);
            }
        });
    }

    private void initViews()
    {
        btn5K = findViewById(R.id.btn5K);
        btnHD = findViewById(R.id.btnHD);
        btnQRCODE = findViewById(R.id.btnQRCODE);
    }
}