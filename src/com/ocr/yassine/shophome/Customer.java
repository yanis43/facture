package com.ocr.yassine.shophome;

public class Customer
{
    private String fullname;
    private String adress;


    public Customer(String fullname, String adress)
    {
        this.fullname = fullname;
        this.adress = adress;
    }

    public String getFullname()
    {
        return fullname;
    }

    public String getAdress()
    {
        return adress;
    }
}
