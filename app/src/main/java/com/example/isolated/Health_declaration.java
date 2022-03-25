package com.example.isolated;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;

public class Health_declaration extends AppCompatActivity {


    private Spinner sexSpinner;
    private Spinner dateSpinner;
    private Spinner monthSpinner;
    private Spinner yearSpinner;
    private Spinner proSpinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_health_declaration);

        //Spinner sex
        sexSpinner = findViewById(R.id.spinner_sex);
        ArrayList<String> sexes = new ArrayList<>();
        sexes.add("Other");
        sexes.add("Male");
        sexes.add("Female");

        ArrayAdapter<String> sexesAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item,sexes);
        sexSpinner.setAdapter(sexesAdapter);


        //Spinner date
        dateSpinner = findViewById(R.id.spinner_day);
        ArrayList<String> date = new ArrayList<>();
        date.add("Date");
        date.add("01");
        date.add("02");date.add("03");date.add("04");date.add("05");date.add("06");date.add("07");date.add("08");date.add("09");
        date.add("10");date.add("11");date.add("12");date.add("13");date.add("14");date.add("15");date.add("16");date.add("17");
        date.add("18");date.add("19");date.add("20");date.add("21");date.add("22");date.add("23");date.add("24");date.add("25");
        date.add("26");date.add("27");date.add("28");date.add("29");date.add("30");

        ArrayAdapter<String> DatesAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item,date);
        dateSpinner.setAdapter(DatesAdapter);

        // Spinner Month
        monthSpinner = findViewById(R.id.spinner_month);
        ArrayList<String> month = new ArrayList<>();
        month.add("Month");
        month.add("01");month.add("02");month.add("03");month.add("04");month.add("05");month.add("06");
        month.add("07");month.add("08");month.add("09");month.add("10");month.add("11");month.add("12");

        ArrayAdapter<String> monthAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item,month);
        monthSpinner.setAdapter(monthAdapter);
        // Spinner year

        yearSpinner = findViewById(R.id.spinner_year);
        ArrayList<String> years = new ArrayList<>();
        years.add("Year");
        years.add("1991");years.add("1992");years.add("1993");years.add("1994");years.add("1995");years.add("1996");years.add("1997");
        years.add("1998");years.add("1999");years.add("2000");years.add("2001");years.add("2002");years.add("2003");years.add("2004");
        years.add("2005");years.add("2006");years.add("2007");years.add("2008");years.add("2009");years.add("2010");years.add("2011");

        ArrayAdapter<String> yearAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item,years);
        yearSpinner.setAdapter(yearAdapter);

        //Spinner province

        proSpinner = findViewById(R.id.spinner_province);
         ArrayList<String> provinces = new ArrayList<>();
         provinces.add("Ha Nam");provinces.add("Ha Noi");provinces.add("Hai Phong");provinces.add("Nam Dinh");provinces.add("Ninh Binh");
        provinces.add("Hung Yen");provinces.add("Thai Binh");provinces.add("Phu Tho");provinces.add("Bac Giang");provinces.add("Hai Duong");

        ArrayAdapter<String> proAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item,provinces);
        proSpinner.setAdapter(proAdapter);

    }
}