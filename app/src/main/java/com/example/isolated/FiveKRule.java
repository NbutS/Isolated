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
        rules.add(new Rule("Disinfection","Wash your hands often with soap or hand sanitizer. Clean frequently touched surfaces/items (doorknobs, phones, tablets, tables, chairs, etc.). Keep clean, wash and keep the house well ventilated.",2,"https://www.lg.com/vn/images/may-loc-khong-khi/md07536760/gallery/AP551AWF-air-purifier-1100-1.jpg"));
        rules.add(new Rule("DISTANCE","Keep your distance when in contact with others",3,"https://www.lg.com/vn/images/may-loc-khong-khi/md07536760/gallery/AP551AWF-air-purifier-1100-1.jpg"));
        rules.add(new Rule("DO NOT AGREE","DO NOT AGREE large numbers of people",4,"https://www.lg.com/vn/images/may-loc-khong-khi/md07536760/gallery/AP551AWF-air-purifier-1100-1.jpg"));
        rules.add(new Rule("HEALTH DECLARATION","make medical declarations on the NCOVI App; Install the BlueZone application at https://www.bluezone.gov.vn to be warned about the risk of COVID-19 infection",5,"https://www.lg.com/vn/images/may-loc-khong-khi/md07536760/gallery/AP551AWF-air-purifier-1100-1.jpg"));


        adapter.setRules(rules);
    }
}