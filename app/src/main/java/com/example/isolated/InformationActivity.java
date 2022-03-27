package com.example.isolated;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class InformationActivity extends AppCompatActivity {

    private ImageView logo_link, fb_link, youtube_link, git_link, ins_link;
    private TextView txtYoutube, txtFb, txtGit, txtIns;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information);

        logo_link = findViewById(R.id.infor_logo);
        fb_link = findViewById(R.id.img_facebook);
        youtube_link = findViewById(R.id.img_youtube);
        git_link = findViewById(R.id.img_github);
        ins_link = findViewById(R.id.img_ins);


        txtFb = findViewById(R.id.txt_faceboolk);
        txtYoutube = findViewById(R.id.txt_youtube);
        txtGit = findViewById(R.id.txt_git);
        txtIns = findViewById(R.id.txt_instagram);


        logo_link.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://www.facebook.com/clubproptit");
                startActivity(new Intent(Intent.ACTION_VIEW,uri));
            }
        });

        fb_link.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://www.facebook.com/profile.php?id=100057277302687");
                startActivity(new Intent(Intent.ACTION_VIEW,uri));
            }
        });

        txtFb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://www.facebook.com/profile.php?id=100057277302687");
                startActivity(new Intent(Intent.ACTION_VIEW,uri));
            }
        });

        //=========================================

        youtube_link.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://www.youtube.com/results?search_query=clb+l%E1%BA%ADp+tr%C3%ACnh+ptit");
                startActivity(new Intent(Intent.ACTION_VIEW,uri));
            }
        });

        txtYoutube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://www.youtube.com/results?search_query=clb+l%E1%BA%ADp+tr%C3%ACnh+ptit");
                startActivity(new Intent(Intent.ACTION_VIEW,uri));
            }
        });

        //=========================================

        git_link.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://github.com/NbutS/Isolated");
                startActivity(new Intent(Intent.ACTION_VIEW,uri));
            }
        });

        txtGit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://github.com/NbutS/Isolated");
                startActivity(new Intent(Intent.ACTION_VIEW,uri));
            }
        });
        //=========================================

        ins_link.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://www.instagram.com/nhatnguyentc123/");
                startActivity(new Intent(Intent.ACTION_VIEW,uri));
            }
        });

        txtIns.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://www.instagram.com/nhatnguyentc123/");
                startActivity(new Intent(Intent.ACTION_VIEW,uri));
            }
        });




    }




}