package com.example.android.miwok;

// {@link Word} represents a vocabulary word that the user wants to learn.
// It contains a default translation and a Miwok translation for that word.

import android.util.Log;

public class Word {

    //This constant is for using as a default state  of the mImageResourceId variable.
    private static final int NO_IMAGE_PROVIDED = -1;
    //Default translation for word
    private String mDefaultTranslation;
    //Miwok translation for the word
    private String mMiwokTranslation;
    //Image for the words.
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /**
     * Create a new Word object.
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param miwokTranslation   is the word in the Miwok language
     */
    public Word(String defaultTranslation, String miwokTranslation) {

        mDefaultTranslation = defaultTranslation;

        mMiwokTranslation = miwokTranslation;
    }

    /**
     * Create a new Word object.
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param miwokTranslation   is the word in the Miwok language
     * @param imageResourceId    is the drawable resource ID for image associated with the words.
     */
    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId) {

        mDefaultTranslation = defaultTranslation;

        mMiwokTranslation = miwokTranslation;

        mImageResourceId = imageResourceId;
    }

    //Get the default translation of the string.

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    //Get the Miwok translation of the string.
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    //Get the image associated with the words.
    public int getImageResourceId() {
        return mImageResourceId;
    }

    //Returns whether or not there is an image for this word.
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}

