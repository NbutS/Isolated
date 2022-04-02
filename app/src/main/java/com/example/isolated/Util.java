package com.example.isolated;

public class Util {


    public static boolean checkEmail(String email)
    {
        return email.matches("^[a-zA-Z][\\w-]+@([\\w]+\\.[\\w]+|[\\w]+\\.[\\w]{2,}\\.[\\w]{2,})$");
    }

    public static boolean checkPhoneNumber( String phoneNumber )
    {
        return phoneNumber.matches("0[0-9]{1,9}");
    }
}
