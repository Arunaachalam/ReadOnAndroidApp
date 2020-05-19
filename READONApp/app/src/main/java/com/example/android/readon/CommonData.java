package com.example.android.readon;

public class CommonData {

    private String mHeading;
    private String mDescription;
    private String mYoutubeLink;
    private int mActionImage;
    private int mPlayImage;

    private int mPosition;
    private int iDescription;
    private int mBackgroundColor;


    public CommonData(int position, String Heading, String Description, int ActionImage) {
        mHeading = Heading;
        mDescription = Description;
        mActionImage = ActionImage;
        mPosition = position;
    }

    public CommonData (String Heading, String Description, String Youtube){
        mHeading = Heading;
        mDescription = Description;
        mYoutubeLink = Youtube;
    }

    public CommonData(String  Heading, String Description, int BackgroundColor, int position,int category) {
        mHeading = Heading;
        mDescription = Description;
        mBackgroundColor = BackgroundColor;
        mPosition = position;

    }

    public String getmHeading() {
        return mHeading;
    }

    public String getmDescription() {
        return mDescription;
    }

    public int getmActionImage() {
        return mActionImage;
    }

    public int getmPlayImage() {
        return mPlayImage;
    }

    public int getmBackgroundColor() {
        return mBackgroundColor;
    }

    public int getiDescription() { return  iDescription; }

    public int getmPosition() { return mPosition; }

    public String getmYoutubeLink() {
        return mYoutubeLink;
    }
}