package com.compress.view;

import android.content.Context;
import android.util.Log;
import com.facebook.react.views.scroll.ReactScrollViewHelper;
import com.umeng.analytics.pro.ak;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Iterator;
import org.xml.sax.Attributes;

/* loaded from: classes14.dex */
public class DialSequenceImg extends ObjectData {
    private static final String TAG = "DialConvertTool_DialSequenceImg";
    public byte img_num;
    public short interval;
    public Point pos;
    public boolean repeat = false;
    public Imgs seqImgs = new Imgs();
    public byte sub_seq_num;

    public DialSequenceImg() {
        Log.i(TAG, "DialSequenceImg");
        this.pos = new Point();
        this.interval = (short) 0;
        this.sub_seq_num = (byte) 1;
        this.img_num = (byte) 0;
        this.displayMode = (byte) 0;
    }

    public void parseAttributes(Context context, Attributes attributes) {
        Log.i(TAG, "parseAttributes");
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
        int parseInt3 = Integer.parseInt(attributes.getValue(ak.aT));
        if (parseInt3 < 0 || parseInt3 > 32767) {
            throw new IllegalArgumentException("[ERR]:sequence image interval out of range");
        }
        this.interval = (short) parseInt3;
        Log.i(TAG, "interval: " + ((int) this.interval));
        String value2 = attributes.getValue("display_mode");
        if (value2 != null) {
            if (value2.equals("normal")) {
                this.displayMode = (byte) 0;
            } else if (value2.equals("ambient")) {
                this.displayMode = (byte) 1;
            } else if (value2.equals(ReactScrollViewHelper.OVER_SCROLL_ALWAYS)) {
                this.displayMode = (byte) 2;
            } else {
                throw new IllegalArgumentException("invalid display mode value");
            }
            Log.i(TAG, "displayMode: " + ((int) this.displayMode));
        }
        String value3 = attributes.getValue("repeat");
        if (value3 != null) {
            Log.i(TAG, "ambientPeriodicStr: " + value3);
        }
    }

    public void addView(Imgs imgs) {
        Log.i(TAG, "addView");
        this.seqImgs = imgs;
        this.img_num = (byte) imgs.imgIdList.size();
        Log.i(TAG, "img_num: " + ((int) this.img_num));
    }

    @Override // com.compress.view.ObjectData
    protected byte[] getBytes() {
        ByteBuffer allocate = ByteBuffer.allocate(getSize());
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        allocate.put(this.pos.getBytes());
        allocate.putShort(this.interval);
        allocate.put(this.seqImgs.repeat ? (byte) 1 : (byte) 0);
        allocate.put(this.sub_seq_num);
        allocate.put((byte) 0);
        allocate.put((byte) 0);
        allocate.put(this.img_num);
        allocate.put((byte) 0);
        allocate.put((byte) 0);
        allocate.put(this.displayMode);
        Log.i(TAG, "pos.getBytes(): " + this.pos.getX() + ", " + this.pos.getY());
        Log.i(TAG, "interval: " + ((int) this.interval));
        Log.i(TAG, "repeat: " + (this.seqImgs.repeat ? 1 : 0));
        Log.i(TAG, "img_num: " + ((int) this.img_num));
        Log.i(TAG, "displayMode: " + ((int) this.displayMode));
        Iterator<Short> it = this.seqImgs.imgIdList.iterator();
        while (it.hasNext()) {
            short shortValue = it.next().shortValue();
            Log.i(TAG, "id: " + ((int) shortValue));
            allocate.putShort(shortValue);
        }
        return allocate.array();
    }

    @Override // com.compress.view.ObjectData
    protected int getSize() {
        Log.i(TAG, "getSize seqImgs: " + this.seqImgs.imgIdList.size());
        return (this.seqImgs.imgIdList.size() * 2) + 14;
    }
}
