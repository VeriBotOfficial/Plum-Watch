package com.compress.view;

import android.util.Log;
import com.compress.utils.ImageConvertTool;
import com.facebook.react.views.scroll.ReactScrollViewHelper;
import org.xml.sax.Attributes;

/* loaded from: classes14.dex */
public class DialKaleidoscope extends ObjectData {
    private static final String TAG = "DialConvertTool";
    private int imgId = 0;
    private float rotateEventFactor = 1.0f;
    private float rotateAnimatorValue = 0.0f;
    private byte displayMode = 0;

    @Override // com.compress.view.ObjectData
    protected int getSize() {
        return 8;
    }

    public void parseAttributes(Attributes attributes) {
        Log.i(TAG, "parseAttributes");
        String value = attributes.getValue("img_name");
        if (value != null) {
            this.imgId = ImageConvertTool.getInstance().convertImg(value);
        }
        String value2 = attributes.getValue("crown_rotate_step");
        if (value2 != null) {
            try {
                this.rotateEventFactor = Float.parseFloat(value2);
            } catch (NumberFormatException e) {
                throw new IllegalArgumentException("[ERR]:invalid crown_rotate_step value", e);
            }
        }
        String value3 = attributes.getValue("animator_rotate_step");
        if (value3 != null) {
            try {
                this.rotateAnimatorValue = Float.parseFloat(value3);
            } catch (NumberFormatException e2) {
                throw new IllegalArgumentException("[ERR]:invalid animator_rotate_step value", e2);
            }
        }
        String value4 = attributes.getValue("display_mode");
        if (value4 != null) {
            if (value4.equals("normal")) {
                this.displayMode = (byte) 0;
            } else if (value4.equals("ambient")) {
                this.displayMode = (byte) 1;
            } else {
                if (value4.equals(ReactScrollViewHelper.OVER_SCROLL_ALWAYS)) {
                    this.displayMode = (byte) 2;
                    return;
                }
                throw new IllegalArgumentException("[ERR]:invalid display mode value");
            }
        }
    }

    @Override // com.compress.view.ObjectData
    protected byte[] getBytes() {
        return new byte[getSize()];
    }
}
