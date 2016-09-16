package com.example.android.miwok;

/**
 * {@link Word} represent a vocabulary word that user want to learn.
 * it contains a default translation and Miwok translation for that word.
 */
public class Word {

    /**
     * Default translation for Miwok word
     */
    private String mDefaultTranslation;

    /**
     * Miwok translation for Miwok word
     */
    private String mMiwokTranslation;

    /**
     * Image resoece id
     */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     * Audio id
     */
    private int mAudioResourceId;

    public Word(String defaultTranslation, String miwokTranslation, int audioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceId = audioResourceId;
    }


    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId, int audioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
        mAudioResourceId = audioResourceId;
    }


    /**
     * get the Default translation of the word
     */
    public String getmDefaultTranslation() {
        return mDefaultTranslation;
    }

    /**
     * get the Miwok translation of the word
     */
    public String getmMiwokTranslation() {
        return mMiwokTranslation;
    }

    /**
     * get the image resource id
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }
    /**
     * check the image id has some other id than -1;
     */
    /**
     * get the audio resource id of the word
     */
    public int getAudioResourceId() {
        return mAudioResourceId;
    }

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}
