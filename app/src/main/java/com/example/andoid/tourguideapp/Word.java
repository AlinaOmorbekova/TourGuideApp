package com.example.andoid.tourguideapp;

public class Word {
    public boolean isOpen = false;
    private String mTitle;
    private String mDescription;
    private String mLocation;
    private String mShowLocation;
    private  String mPhoneNumber;
    private int mImageId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;

    public Word(String titleInfo, String information, String location ,  int ImageResId,  String locationForParsing ){
        mTitle=titleInfo;
        mDescription= information;
        mImageId=ImageResId;
        mLocation=location;
        mShowLocation="geo:" + locationForParsing + "?20";


    }
    public Word(String titleInfo, String information, String location ,  int ImageResId,  String locationForParsing,String PhoneNumber  ){
        mTitle=titleInfo;
        mDescription= information;
        mImageId=ImageResId;
        mLocation=location;
        mShowLocation="geo:" + locationForParsing + "?20";
        mPhoneNumber = "tel:" +PhoneNumber;


    }



    public String getTitleOFinformation(){

        return mTitle;
    }
    public String getIformation()
    {
        return mDescription;
    }

    public int getmImageResId(){

        return mImageId;
    }
    public String getmLocation(){

        return mLocation;
    }
    public String getmlocationForParsing(){
        return mShowLocation;
    }
    public String getmPhoneNumber(){

        return mPhoneNumber;
    }

}
