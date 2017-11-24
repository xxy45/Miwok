package com.example.xxxxxxxy.miwok;

/**
 * Created by xxxxxxxy on 2017/11/24.
 */

public class Word {
    private String mDedfaultTranslation;
    private String mMiwokTranslation;

    public Word(String dedfaultTranslation,String miwokTranslation){
        mDedfaultTranslation = dedfaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    public String getDedfaultTranslation(){
        return mDedfaultTranslation;
    }

    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }
}

