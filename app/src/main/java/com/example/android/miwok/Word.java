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

    //Image for the word.
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    //Audio for the word.
    private int mAudioResourceId;

    /**
     * Create a new Word object.
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param miwokTranslation   is the word in the Miwok language
     * @param audioResourceId    is the resource ID of the audio file presenting the pronunciation of the Miwok word.
     */
    public Word(String defaultTranslation, String miwokTranslation, int audioResourceId) {

        mDefaultTranslation = defaultTranslation;

        mMiwokTranslation = miwokTranslation;

        mAudioResourceId = audioResourceId;
    }

    /**
     * Create a new Word object.
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param miwokTranslation   is the word in the Miwok language
     * @param imageResourceId    is the drawable resource ID for image associated with the word.
     * @param audioResourceId    is the audio resource ID for audio file associated with this word.
     */
    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId, int audioResourceId) {

        mDefaultTranslation = defaultTranslation;

        mMiwokTranslation = miwokTranslation;

        mImageResourceId = imageResourceId;

        mAudioResourceId = audioResourceId;
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

    //Returns the audio resource ID of the word.
    public int getAudioResourceId() {
        return mAudioResourceId;
    }

    @Override
    public String toString() {
        return "Word{" +
                "mDefaultTranslation='" + mDefaultTranslation + '\'' +
                ", mMiwokTranslation='" + mMiwokTranslation + '\'' +
                ", mImageResourceId=" + mImageResourceId +
                ", mAudioResourceId=" + mAudioResourceId +
                '}';
    }
}

