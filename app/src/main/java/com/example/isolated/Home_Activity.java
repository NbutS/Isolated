package com.example.isolated;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Home_Activity extends AppCompatActivity {

    Button btnQRCODE, btn5K, btnHD;
    TextView btnDeveloped;
    ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home2);

        initViews();
        btn5K.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Home_Activity.this,FiveKRule.class);
                startActivity(intent);
            }
        });
        btnHD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Home_Activity.this, Health_declaration.class);
                startActivity(intent);
            }
        });
        btnDeveloped.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Home_Activity.this,InformationActivity.class);
                startActivity(intent);
            }
        });
        btnQRCODE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Home_Activity.this,InforDec.class);
                startActivity(intent);
            }
        });
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://covid19.gov.vn/");
                startActivity(new Intent(Intent.ACTION_VIEW,uri));
            }
        });
    }
    private void initViews()
    {
        btn5K = findViewById(R.id.btn5K);
        btnHD = findViewById(R.id.btnHD);
        btnQRCODE = findViewById(R.id.btnQRCODE);
        btnDeveloped = findViewById(R.id.txtDeveloped);
        img = findViewById(R.id.imageView3);
    }
}