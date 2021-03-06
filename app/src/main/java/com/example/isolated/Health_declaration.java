package com.example.isolated;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.isolated.database.UserDatabase;

import java.util.ArrayList;

public class Health_declaration extends AppCompatActivity {


    private Spinner sexSpinner;
    private Spinner dateSpinner;
    private Spinner monthSpinner;
    private Spinner yearSpinner;
    private Spinner proSpinner;
    private EditText name, phoneNumber, email;
    private Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_health_declaration);


        name = findViewById(R.id.editTextTextPersonName);
        phoneNumber = findViewById(R.id.editTextPhone);
        email = findViewById(R.id.editTextTextEmailAddress);
        btn = findViewById(R.id.btnSubmitDec);
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
        for ( Integer i = 1910; i <= 2015 ; i++ )
        {
            years.add(i.toString());
        }
//        years.add("1991");years.add("1992");years.add("1993");years.add("1994");years.add("1995");years.add("1996");years.add("1997");
//        years.add("1998");years.add("1999");years.add("2000");years.add("2001");years.add("2002");years.add("2003");years.add("2004");
//        years.add("2005");years.add("2006");years.add("2007");years.add("2008");years.add("2009");years.add("2010");years.add("2011");

        ArrayAdapter<String> yearAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item,years);
        yearSpinner.setAdapter(yearAdapter);

        //Spinner province

        proSpinner = findViewById(R.id.spinner_province);
         ArrayList<String> provinces = new ArrayList<>();
         provinces.add("Ha Nam");provinces.add("Ha Noi");provinces.add("Hai Phong");provinces.add("Nam Dinh");provinces.add("Ninh Binh");
        provinces.add("Hung Yen");provinces.add("Thai Binh");provinces.add("Phu Tho");provinces.add("Bac Giang");provinces.add("Hai Duong");

        ArrayAdapter<String> proAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item,provinces);
        proSpinner.setAdapter(proAdapter);


        //=========================================

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addUser();
            }
        });

    }
    private void addUser()
    {
        String m_Name = name.getText().toString().trim();
        String m_phoneNum = phoneNumber.getText().toString().trim();
        String m_email = email.getText().toString().trim();
        String m_day,m_month, m_year, m_sex, m_province;
        m_day =  dateSpinner.getSelectedItem().toString();
        m_month =  monthSpinner.getSelectedItem().toString();
        m_year =  yearSpinner.getSelectedItem().toString();
        m_sex =  sexSpinner.getSelectedItem().toString();
        m_province =  proSpinner.getSelectedItem().toString();
        if( m_Name.compareTo("") == 0 || m_phoneNum.compareTo("") == 0 || m_email.compareTo("") == 0 )
        {
            Dialog dialog = new Dialog();
            dialog.show(getSupportFragmentManager(),"Dialog");
        }
        else if(!Util.checkEmail(m_email)|| !Util.checkPhoneNumber(m_phoneNum))
        {
            EmailDialog dialog = new EmailDialog();
            dialog.show(getSupportFragmentManager(),"Dialog_1");
        }
        else{
            User user = new User(m_Name,m_sex,m_day,m_month,m_year,m_province,m_phoneNum,m_email);
            UserDatabase.getInstance(this).m_userDAO().insertUser(user);
            name.setText(""); phoneNumber.setText(""); email.setText("");
            dateSpinner.setSelection(0); monthSpinner.setSelection(0); yearSpinner.setSelection(0); sexSpinner.setSelection(0); proSpinner.setSelection(0);

            Toast.makeText(this,"successful medical declaration", Toast.LENGTH_SHORT).show();
        }

    }

}