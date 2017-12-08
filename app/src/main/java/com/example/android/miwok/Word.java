package com.example.android.miwok;

/**
 * Created by michelange on 05/12/2017.
 */

public class Word {

    private String mDefaultTranslation; // English/ default word
    private String mMiwokTranslation;  // miwok word

    // Image resource ID for the word.
    private int mImageResourceId;
    private int mImageREsourceId = NO_IMAGE_PROVIDED; // for the view that doesn't have image.

    // Constant value that represents no image was provided for this word.
    private static final int NO_IMAGE_PROVIDED = -1;

    // method that creates the words english and miwok with no Image.
    public Word(String defaultTranslation, String miwokTranslation) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    // custom class that creates all three objects/Views. and the image
    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
    }

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    // Return whether or not there is an image for this word.
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

}
