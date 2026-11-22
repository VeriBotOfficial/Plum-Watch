package com.compress.view;

import android.content.Context;
import android.util.Log;
import com.compress.utils.ImageConvertTool;
import com.facebook.react.views.scroll.ReactScrollViewHelper;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import org.xml.sax.Attributes;

/* loaded from: classes14.dex */
public class DialStaticImg extends ObjectData {
    private static final String TAG = "DialConvertTool_DialStaticImg";
    private short imgId;
    private short language;
    private Point pos = new Point();
    private Point center = new Point();
    private float rotate = 0.0f;
    private byte count = 0;

    public DialStaticImg() {
        this.displayMode = (byte) 0;
        this.language = (short) 255;
        this.imgId = (short) 0;
    }

    public void parseAttributes(Context context, Attributes attributes) {
        String value = attributes.getValue("position");
        if (value != null) {
            String[] split = value.split(" ");
            if (split.length == 2) {
                try {
                    int parseInt = Integer.parseInt(split[0]);
                    int parseInt2 = Integer.parseInt(split[1]);
                    if (parseInt < -32768 || parseInt > 32767) {
                        throw new IllegalArgumentException("static image pos x out of range");
                    }
                    if (parseInt2 < -32768 || parseInt2 > 32767) {
                        throw new IllegalArgumentException("static image pos y out of range");
                    }
                    this.pos.x = (short) parseInt;
                    this.pos.y = (short) parseInt2;
                } catch (NumberFormatException e) {
                    throw new IllegalArgumentException("invalid position values", e);
                }
            } else {
                throw new IllegalArgumentException("invalid position format");
            }
        }
        String value2 = attributes.getValue("img_names");
        Log.i(TAG, "imgName: " + value2);
        this.count = (byte) 1;
        if (value2 != null) {
            String str = context.getExternalFilesDir(null) + value2;
            Log.i(TAG, "imgName all: " + str);
            this.imgId = (short) ImageConvertTool.getInstance().convertImg(str);
        }
        String value3 = attributes.getValue("center");
        if (value3 != null) {
            String[] split2 = value3.split(" ");
            if (split2.length == 2) {
                try {
                    int parseInt3 = Integer.parseInt(split2[0]);
                    int parseInt4 = Integer.parseInt(split2[1]);
                    if (parseInt3 < -32768 || parseInt3 > 32767) {
                        throw new IllegalArgumentException("static image center x out of range");
                    }
                    if (parseInt4 < -32768 || parseInt4 > 32767) {
                        throw new IllegalArgumentException("static image center y out of range");
                    }
                    this.center.x = (short) parseInt3;
                    this.center.y = (short) parseInt4;
                } catch (NumberFormatException e2) {
                    throw new IllegalArgumentException("invalid center values", e2);
                }
            } else {
                throw new IllegalArgumentException("invalid center format");
            }
        }
        String value4 = attributes.getValue("rotate");
        if (value4 != null) {
            try {
                float parseFloat = Float.parseFloat(value4);
                if (parseFloat < 0.0f || parseFloat > 360.0f) {
                    throw new IllegalArgumentException("static image rotate out of range, [0, 360]");
                }
                this.rotate = parseFloat;
            } catch (NumberFormatException e3) {
                throw new IllegalArgumentException("invalid rotate value", e3);
            }
        }
        String value5 = attributes.getValue("display_mode");
        if (value5 != null) {
            if (value5.equals("normal")) {
                this.displayMode = (byte) 0;
            } else if (value5.equals("ambient")) {
                this.displayMode = (byte) 1;
            } else {
                if (value5.equals(ReactScrollViewHelper.OVER_SCROLL_ALWAYS)) {
                    this.displayMode = (byte) 2;
                    return;
                }
                throw new IllegalArgumentException("invalid display mode value");
            }
        }
    }

    @Override // com.compress.view.ObjectData
    protected byte[] getBytes() {
        Log.i(TAG, "getSize(): " + getSize());
        ByteBuffer allocate = ByteBuffer.allocate(getSize());
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        allocate.put(this.pos.getBytes());
        allocate.put(this.center.getBytes());
        allocate.putFloat(this.rotate);
        allocate.put(this.count);
        allocate.put(this.displayMode);
        allocate.putShort(this.language);
        allocate.putShort(this.imgId);
        Log.i(TAG, "count: " + ((int) this.count));
        Log.i(TAG, "pos.getBytes(): " + this.pos.getX() + ", " + this.pos.getY());
        Log.i(TAG, "center.getBytes(): " + this.center.getX() + ", " + this.center.getY());
        Log.i(TAG, "rotate: " + this.rotate);
        Log.i(TAG, "imgId: " + ((int) this.imgId));
        Log.i(TAG, "displayMode: " + ((int) this.displayMode));
        return allocate.array();
    }

    @Override // com.compress.view.ObjectData
    protected int getSize() {
        return Point.getSize() + Point.getSize() + 10;
    }
}
