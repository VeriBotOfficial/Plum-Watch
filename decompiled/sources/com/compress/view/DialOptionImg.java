package com.compress.view;

import android.content.Context;
import android.util.Log;
import com.compress.utils.ImageConvertTool;
import com.facebook.react.views.scroll.ReactScrollViewHelper;
import io.livekit.android.room.util.MediaConstraintKeys;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.xml.sax.Attributes;

/* loaded from: classes14.dex */
public class DialOptionImg extends ObjectData {
    private static final String TAG = "DialConvertTool_DialOptionImg";
    private byte displayMode;
    private List<Short> imgIds = new ArrayList();
    private Point pos = new Point();
    private short bindData = 0;
    private boolean isPeriodic = false;
    private short language = 255;
    private byte count = 0;

    public DialOptionImg() {
        this.period = (byte) 0;
        this.displayMode = (byte) 0;
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
                        throw new IllegalArgumentException("option image pos x out of range");
                    }
                    if (parseInt2 < -32768 || parseInt2 > 32767) {
                        throw new IllegalArgumentException("option image pos y out of range");
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
        String value2 = attributes.getValue("bind_data");
        if (value2 != null) {
            try {
                int parseInt3 = Integer.parseInt(value2);
                if (parseInt3 < 0 || parseInt3 > 32767) {
                    throw new IllegalArgumentException("option image bind data out of range");
                }
                this.bindData = (short) parseInt3;
            } catch (NumberFormatException e2) {
                throw new IllegalArgumentException("invalid bind data value", e2);
            }
        }
        String value3 = attributes.getValue("img_names");
        if (value3 != null) {
            String[] split2 = value3.split(",");
            this.count = (byte) split2.length;
            for (String str : split2) {
                Log.i(TAG, "img: " + str);
                String str2 = context.getExternalFilesDir(null) + str;
                Log.i(TAG, "img all: " + str2);
                this.imgIds.add(Short.valueOf((short) ImageConvertTool.getInstance().convertImg(str2)));
            }
        }
        String value4 = attributes.getValue("display_mode");
        if (value4 != null) {
            if (value4.equals("normal")) {
                this.displayMode = (byte) 0;
            } else if (value4.equals("ambient")) {
                this.displayMode = (byte) 1;
            } else if (value4.equals(ReactScrollViewHelper.OVER_SCROLL_ALWAYS)) {
                this.displayMode = (byte) 2;
            } else {
                throw new IllegalArgumentException("invalid display mode value");
            }
        }
        String value5 = attributes.getValue("is_periodic");
        if (value5 == null || !value5.equalsIgnoreCase(MediaConstraintKeys.TRUE)) {
            return;
        }
        this.isPeriodic = true;
    }

    @Override // com.compress.view.ObjectData
    protected byte[] getBytes() {
        Log.i(TAG, "getSize(): " + getSize());
        ByteBuffer order = ByteBuffer.allocate(getSize()).order(ByteOrder.LITTLE_ENDIAN);
        order.put(this.pos.getBytes());
        order.putShort(this.bindData);
        order.put(this.isPeriodic ? (byte) 1 : (byte) 0);
        order.put(this.count);
        order.put((byte) 0);
        order.putShort(this.language);
        order.put(this.displayMode);
        Log.i(TAG, "pos.getBytes(): " + this.pos.getX() + ", " + this.pos.getY());
        Log.i(TAG, "bindData: " + ((int) this.bindData));
        Log.i(TAG, "isPeriodic: " + this.isPeriodic);
        Log.i(TAG, "count: " + ((int) this.count));
        Log.i(TAG, "displayMode: " + ((int) this.displayMode));
        Log.i(TAG, "language: " + ((int) this.language));
        Iterator<Short> it = this.imgIds.iterator();
        while (it.hasNext()) {
            short shortValue = it.next().shortValue();
            Log.i(TAG, "id: " + ((int) shortValue));
            order.putShort(shortValue);
        }
        return order.array();
    }

    @Override // com.compress.view.ObjectData
    protected int getSize() {
        return Point.getSize() + 8 + (this.imgIds.size() * 2);
    }
}
