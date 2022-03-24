package com.example.isolated;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.RelativeLayout;

import java.util.ArrayList;

public class FiveKRule extends AppCompatActivity {

    private RecyclerView fiveRuleRecView;

    private RuleRecViewAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_five_krule);


        adapter= new RuleRecViewAdapter(this);
        fiveRuleRecView =findViewById(R.id.fiveruletRecView);

        fiveRuleRecView.setAdapter(adapter);
        fiveRuleRecView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));

        ArrayList<Rule> rules =  new ArrayList<>();
        rules.add(new Rule("Mask","Wear cloth masks regularly in public places, places where people gather; Wear medical masks at medical facilities and isolation areas",1,"https://www.lg.com/vn/images/may-loc-khong-khi/md07536760/gallery/AP551AWF-air-purifier-1100-1.jpg"));
        rules.add(new Rule("Disinfection","Wash your hands often with soap or hand sanitizer. Clean frequently touched surfaces/items (doorknobs, phones, tablets, tables, chairs, etc.). Keep clean, wash and keep the house well ventilated.",2,"https://i.pinimg.com/originals/b7/63/db/b763db64f688a2f15086bb7207b85f27.jpg"));
        rules.add(new Rule("DISTANCE","Keep your distance when in contact with others",3,"https://i.pinimg.com/originals/d2/ff/3e/d2ff3e41ba08ce385230462c23e9b146.jpg"));
        rules.add(new Rule("DO NOT AGREE","DO NOT AGREE large numbers of people",4,"https://i.pinimg.com/originals/56/ee/f2/56eef204430a819f79cf9c2290f4794c.jpg"));
        rules.add(new Rule("HEALTH DECLARATION","make medical declarations on the NCOVI App; Install the BlueZone application at https://www.bluezone.gov.vn to be warned about the risk of COVID-19 infection",5,"https://i.pinimg.com/originals/89/81/7e/89817e75b78b340a24a6d6c4b9a4cb75.jpg"));


        adapter.setRules(rules);
    }
}