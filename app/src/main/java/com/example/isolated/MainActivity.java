package com.example.isolated;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    Animation up,down,down1,up1;

    ImageView imageView;
    //private Button btnQRCODE, btn5K, btnHD;
    TextView textView,txtNameApp;
    ImageView img_logo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        img_logo = findViewById(R.id.img_logoclb);
        down1 = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.down);
        img_logo.setAnimation((down1));

        imageView=findViewById(R.id.imageView3);
        up = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.up);
        imageView.setAnimation(up);

        txtNameApp = findViewById(R.id.name_app);
        up1 = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.up);
        txtNameApp.setAnimation(up1);

        textView = findViewById(R.id.txtLogo);
        down = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.down);
        textView.setAnimation(down);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(getApplicationContext(),Home_Activity.class));
                finish();
            }
        },4000 );



//        initViews();
//
//        btn5K.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(MainActivity.this,FiveKRule.class);
//                startActivity(intent);
//            }
//        });
    }

//    private void initViews()
//    {
//        btn5K = findViewById(R.id.btn5K);
//        btnHD = findViewById(R.id.btnHD);
//        btnQRCODE = findViewById(R.id.btnQRCODE);
//    }
}