package com.compress.view;

import android.content.Context;
import android.util.Log;
import com.compress.utils.ImageConvertTool;
import io.livekit.android.room.util.MediaConstraintKeys;
import java.util.ArrayList;
import java.util.List;
import org.xml.sax.Attributes;

/* loaded from: classes14.dex */
public class Imgs {
    private static final String TAG = "DialConvertTool_DialSequenceImg_Imgs";
    public boolean repeat = false;
    public List<Short> imgIdList = new ArrayList();

    public void parseAttributes(Context context, Attributes attributes) {
        Log.i(TAG, "Imgs parseAttributes");
        String value = attributes.getValue("repeat");
        if (value != null && value.equalsIgnoreCase(MediaConstraintKeys.TRUE)) {
            this.repeat = true;
        }
        Log.i(TAG, "repeat: " + this.repeat);
        String value2 = attributes.getValue("names");
        if (value2 != null) {
            String[] split = value2.split(",");
            Log.i(TAG, "imgNames: " + split.length);
            for (String str : split) {
                Log.i(TAG, "img: " + str);
                String str2 = context.getExternalFilesDir(null) + str;
                Log.i(TAG, "img all: " + str2);
                this.imgIdList.add(Short.valueOf((short) ImageConvertTool.getInstance().convertImg(str2)));
            }
        }
    }
}
