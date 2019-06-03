package com.example.myapplication;

public class ModelClass {

    String name="";
    String Address="";
    public int intValue=0;
    public int image=R.drawable.ic_launcher_background;
    public String imageURL="https://nikonrumors.com/wp-content/uploads/2014/03/Nikon-1-V3-sample-photo.jpg";

    public ModelClass(String name, String address,int intValue) {
        this.name = name;
        this.Address = address;
        this.intValue=intValue;
    }

    public String getName() {
        return name;
    }

    public int getIntValue() {
        return intValue;
    }

    public String getAddress() {
        return Address;
    }

    public ModelClass build(){
        return new ModelClass(name,Address,intValue);
    }
}
