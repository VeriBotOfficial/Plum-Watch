package com.compress.view;

import android.content.Context;
import android.util.Log;
import com.compress.utils.ImageConvertTool;
import com.compress.utils.VideoConvertTool;
import com.facebook.react.views.scroll.ReactScrollViewHelper;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import org.xml.sax.Attributes;

/* loaded from: classes14.dex */
public class DialVideo extends ObjectData {
    private static final String TAG = "DialConvertTool_DialVideo";
    private Rect rect = new Rect();
    private int offset = 0;
    private int colorKey = 0;
    private short imgId = 0;

    public DialVideo() {
        this.displayMode = (byte) 0;
    }

    public void parseAttributes(Context context, Attributes attributes) throws IOException {
        String value = attributes.getValue("rect");
        if (value != null) {
            String[] split = value.split(" ");
            if (split.length == 4) {
                try {
                    int parseInt = Integer.parseInt(split[0]);
                    int parseInt2 = Integer.parseInt(split[1]);
                    int parseInt3 = Integer.parseInt(split[2]);
                    int parseInt4 = Integer.parseInt(split[3]);
                    if (parseInt < -32768 || parseInt > 32767) {
                        throw new IllegalArgumentException("[ERR]:video rect x out of range");
                    }
                    if (parseInt2 < -32768 || parseInt2 > 32767) {
                        throw new IllegalArgumentException("[ERR]:video rect y out of range");
                    }
                    if (parseInt3 < -32768 || parseInt3 > 32767) {
                        throw new IllegalArgumentException("[ERR]:video rect w out of range");
                    }
                    if (parseInt4 < -32768 || parseInt4 > 32767) {
                        throw new IllegalArgumentException("[ERR]:video rect h out of range");
                    }
                    this.rect.x = (short) parseInt;
                    this.rect.y = (short) parseInt2;
                    this.rect.w = (short) parseInt3;
                    this.rect.h = (short) parseInt4;
                } catch (NumberFormatException e) {
                    throw new IllegalArgumentException("[ERR]:invalid rect values", e);
                }
            } else {
                throw new IllegalArgumentException("[ERR]:invalid rect format");
            }
        }
        String value2 = attributes.getValue("color_key");
        Log.i(TAG, "colorKeyStr: " + value2);
        if (value2 != null) {
            try {
                this.colorKey = Integer.parseUnsignedInt(value2.replace("0x", ""), 16);
                Log.i(TAG, "colorKey: " + this.colorKey);
            } catch (NumberFormatException e2) {
                throw new IllegalArgumentException("[ERR]:invalid color key value", e2);
            }
        }
        String value3 = attributes.getValue("source");
        if (value3 != null) {
            String str = context.getExternalFilesDir(null) + value3;
            Log.i(TAG, "videoPath: " + str);
            this.offset = VideoConvertTool.getInstance().convertVideo(str);
            Log.i(TAG, "offset: " + this.offset);
        }
        String value4 = attributes.getValue("preview_frame");
        if (value4 != null) {
            String str2 = context.getExternalFilesDir(null) + value4;
            Log.i(TAG, "previewFrame: " + str2);
            this.imgId = (short) ImageConvertTool.getInstance().convertImg(str2);
            Log.i(TAG, "imgId: " + ((int) this.imgId));
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
                throw new IllegalArgumentException("[ERR]:invalid display mode value");
            }
        }
    }

    @Override // com.compress.view.ObjectData
    protected byte[] getBytes() {
        Log.i(TAG, "getSize(): " + getSize());
        ByteBuffer allocate = ByteBuffer.allocate(getSize());
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        allocate.put(this.rect.getBytes());
        allocate.putInt(this.colorKey);
        allocate.putInt(this.offset);
        allocate.putShort(this.imgId);
        allocate.put(this.displayMode);
        return allocate.array();
    }

    @Override // com.compress.view.ObjectData
    protected int getSize() {
        return this.rect.getSize() + 11;
    }
}
