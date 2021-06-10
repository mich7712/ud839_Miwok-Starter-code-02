package com.example.android.miwok;

public class Word {

    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED =-1;
    private int mAudioResourceId;

    public Word (String defaulTranslation, String miwokTranslation, int audioResourceId){
        mDefaultTranslation = miwokTranslation;
        mMiwokTranslation = defaulTranslation;
        mAudioResourceId = audioResourceId;

    }
    public Word (String defaulTranslation, String miwokTranslation, int imageResourceId, int audioResourceId){
        mDefaultTranslation = miwokTranslation;
        mMiwokTranslation = defaulTranslation;
        mImageResourceId= imageResourceId;
        mAudioResourceId = audioResourceId;
    }

    public String getDefaultTranslation(){
        return mDefaultTranslation;

    }

    public String getMiwokTranslation(){
        return mMiwokTranslation;

    }

    public int getmImageResourceId(){
        return mImageResourceId;
    }

    public boolean hasImage(){
        return mImageResourceId !=NO_IMAGE_PROVIDED;
    }

    public int getmAudioResourceId(){
        return mAudioResourceId;
    }

}
