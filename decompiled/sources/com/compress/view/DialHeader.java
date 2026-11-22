package com.compress.view;

import android.content.Context;
import android.util.Log;
import com.compress.utils.ImageConvertTool;
import com.compress.utils.Utils;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.xml.sax.Attributes;

/* loaded from: classes14.dex */
public class DialHeader {
    private static final int DIAL_DEFAULT_MAX_HEIGHT = 960;
    private static final int DIAL_DEFAULT_MAX_WIDTH = 960;
    private static final String TAG = "DialConvertTool_DialHeader";
    private short height;
    private short width;
    private byte[] dialName = new byte[16];
    private byte[] version = new byte[16];
    private byte[] description = new byte[128];
    private byte[] watchVersion = new byte[16];
    private List<Integer> viewType = new ArrayList();
    private List<ObjectData> viewPt = new ArrayList();
    private short previewImgId = 0;
    private long imgOffset = 0;
    private byte dialViewCount = 0;
    private byte displayCapability = 0;
    private int ambientPeriod = 60000;
    private int normalPeriod = 60000;
    private int uuid = 0;
    private byte watchType = 0;

    public List<ObjectData> getViewPt() {
        return this.viewPt;
    }

    public void setViewPt(List<ObjectData> list) {
        this.viewPt = list;
    }

    public void setDisplayCapability(byte b) {
        this.displayCapability = b;
    }

    public void setImgOffset(long j) {
        this.imgOffset = j;
    }

    public long getImgOffset() {
        return this.imgOffset;
    }

    private void putUtf8Fixed(byte[] bArr, String str) {
        if (str == null) {
            str = "";
        }
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
        int min = Math.min(bArr.length, bytes.length);
        System.arraycopy(bytes, 0, bArr, 0, min);
        while (min < bArr.length) {
            bArr[min] = 0;
            min++;
        }
    }

    public void parseAttributes(Context context, Attributes attributes) {
        String str = attributes.getValue("title") + Utils.formatDate(12);
        Log.i(TAG, "title: " + str);
        putUtf8Fixed(this.dialName, str);
        String value = attributes.getValue("description");
        Log.i(TAG, "descriptionStr: " + value);
        putUtf8Fixed(this.description, value);
        putUtf8Fixed(this.version, attributes.getValue("version"));
        String value2 = attributes.getValue("size");
        if (value2 != null) {
            parseSizeAttr(value2);
        }
        String value3 = attributes.getValue("preview_img");
        Log.i(TAG, "previewStr: " + value3);
        String str2 = context.getExternalFilesDir(null) + value3;
        Log.i(TAG, "previewStr all: " + str2);
        if (str2 != null) {
            this.previewImgId = (short) ImageConvertTool.getInstance().convertImg(str2);
        }
        String value4 = attributes.getValue(CommonUrlParts.UUID);
        if (value4 != null) {
            try {
                this.uuid = Integer.parseInt(value4);
            } catch (NumberFormatException e) {
                throw new IllegalArgumentException("invalid bind data value", e);
            }
        }
        putUtf8Fixed(this.watchVersion, attributes.getValue("watch_version"));
        String value5 = attributes.getValue("tile_width");
        if (value5 != null) {
            ImageConvertTool.getInstance().setTileWidth(Integer.parseInt(value5));
        }
        String value6 = attributes.getValue("ambient_period");
        if (value6 != null) {
            try {
                int parseInt = Integer.parseInt(value6);
                if (parseInt >= 16 && parseInt <= 60000) {
                    this.ambientPeriod = parseInt;
                }
                this.ambientPeriod = 60000;
            } catch (NumberFormatException e2) {
                throw new IllegalArgumentException("invalid bind data value", e2);
            }
        }
        String value7 = attributes.getValue("normal_peroid");
        if (value7 != null) {
            try {
                int parseInt2 = Integer.parseInt(value7);
                if (parseInt2 >= 16 && parseInt2 <= 60000) {
                    this.normalPeriod = parseInt2;
                }
                this.normalPeriod = 60000;
            } catch (NumberFormatException e3) {
                throw new IllegalArgumentException("invalid bind data value", e3);
            }
        }
        String value8 = attributes.getValue("watch_type");
        if (value8 != null) {
            try {
                int parseInt3 = Integer.parseInt(value8);
                if (parseInt3 < 0 || parseInt3 > 255) {
                    throw new IllegalArgumentException("watch_type option image bind data out of range");
                }
                this.watchType = (byte) parseInt3;
            } catch (NumberFormatException e4) {
                throw new IllegalArgumentException("invalid bind data value", e4);
            }
        }
    }

    public void addView(ObjectData objectData, int i) {
        Log.i(TAG, "addView");
        this.viewPt.add(objectData);
        this.viewType.add(Integer.valueOf(i));
        this.dialViewCount = (byte) (this.dialViewCount + 1);
    }

    public byte[] getBytes() {
        Log.i(TAG, "getSize(): " + getSize());
        ByteBuffer order = ByteBuffer.allocate(getSize()).order(ByteOrder.LITTLE_ENDIAN);
        order.put(this.dialName, 0, 16);
        order.putShort(this.width);
        order.putShort(this.height);
        order.put(this.version, 0, 16);
        order.putShort(this.previewImgId);
        order.put(this.description, 0, 128);
        order.putShort((short) 0);
        order.putInt((int) (this.imgOffset & BodyPartID.bodyIdMax));
        order.put(this.dialViewCount);
        order.put(this.displayCapability);
        order.putInt(this.ambientPeriod);
        order.putInt(this.normalPeriod);
        order.putInt(this.uuid);
        order.put(this.watchType);
        order.put(this.watchVersion, 0, 16);
        order.put((byte) 0);
        for (Integer num : this.viewType) {
            Log.i(TAG, "type: " + ((int) num.byteValue()));
            order.put(num.byteValue());
        }
        Log.i(TAG, "dialName: " + this.dialName.length);
        Log.i(TAG, "width: " + ((int) this.width));
        Log.i(TAG, "height: " + ((int) this.height));
        Log.i(TAG, "version: " + this.version.length);
        Log.i(TAG, "previewImgId: " + ((int) this.previewImgId));
        Log.i(TAG, "description: " + this.description.length);
        Log.i(TAG, "imgOffset: " + this.imgOffset);
        Log.i(TAG, "dialViewCount: " + ((int) this.dialViewCount));
        Log.i(TAG, "displayCapability: " + ((int) this.displayCapability));
        Log.i(TAG, "ambientPeriod: " + this.ambientPeriod);
        Log.i(TAG, "normalPeriod: " + this.normalPeriod);
        Log.i(TAG, "uuid: " + this.uuid);
        Log.i(TAG, "watchType: " + ((int) this.watchType));
        Log.i(TAG, "watchVersion: " + this.watchVersion.length);
        return order.array();
    }

    public int getSize() {
        return this.dialViewCount + 204;
    }

    private void parseSizeAttr(String str) {
        if (str.split(" ").length != 2) {
            Log.e(TAG, "Invalid size format");
            return;
        }
        String[] split = str.split(" ");
        int parseInt = Integer.parseInt(split[0]);
        if (parseInt <= 0 || parseInt > 960) {
            Log.e(TAG, "dial size width out of range, (0, 960], value:" + parseInt);
            return;
        }
        this.width = (short) parseInt;
        int parseInt2 = Integer.parseInt(split[1]);
        if (parseInt2 <= 0 || parseInt2 > 960) {
            Log.e(TAG, "dial size height out of range, (0, 960], value:" + parseInt2);
        } else {
            this.height = (short) parseInt2;
        }
    }
}
