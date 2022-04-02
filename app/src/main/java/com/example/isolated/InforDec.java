package com.example.isolated;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.isolated.database.UserDatabase;

import java.util.ArrayList;
import java.util.List;

public class InforDec extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_infor_dec);



        TextView name,sex,address,dateOfBirth,phoneNumber,email;
        name = findViewById(R.id.inf_name);
        sex = findViewById(R.id.inf_sex);
        address = findViewById(R.id.inf_add);
        dateOfBirth = findViewById(R.id.inf_DoB);
        phoneNumber = findViewById(R.id.inf_Phone);
        email = findViewById(R.id.inf_email);

        if ( !UserDatabase.getInstance(this).m_userDAO().getListUser().isEmpty())
        {
            List<User> mList = UserDatabase.getInstance(this).m_userDAO().getListUser();
            User user = mList.get(mList.size()-1);
            name.setText(user.getName());
            sex.setText(user.getSex());
            address.setText(user.getProvince());
            dateOfBirth.setText(user.getDate() + "/" + user.getMonth() + "/" + user.getYear());
            phoneNumber.setText(user.getPhoneNumber());
            email.setText(user.getEmail());
        }
        else{
            name.setText("Youe Name");
            sex.setText("Your sex");
            address.setText("Your Address");
            dateOfBirth.setText("Your Date of Birth");
            phoneNumber.setText("Your Phone Number");
            email.setText("Your Email");
        }

    }
}