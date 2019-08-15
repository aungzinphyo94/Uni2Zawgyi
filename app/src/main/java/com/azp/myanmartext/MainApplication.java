package com.azp.myanmartext;

import android.app.Application;

import com.azp.myanmartext.utils.FontEmbedder;
import com.azp.myanmartext.utils.Moulder;
import com.azp.myanmartext.utils.TypefaceManager;

import me.myatminsoe.mdetect.MDetect;

public class MainApplication extends Application {

    public static TypefaceManager typefaceManager;

    @Override
    public void onCreate() {
        super.onCreate();

        MDetect.INSTANCE.init(this);
        typefaceManager = new TypefaceManager(getAssets());

        if (MDetect.INSTANCE.isUnicode()){
            FontEmbedder.init(typefaceManager.getShitUnicode());
            Moulder.init(true);
        }else {
            FontEmbedder.init(typefaceManager.getShitZawgyi());
            Moulder.init(false);
        }
    }
}
