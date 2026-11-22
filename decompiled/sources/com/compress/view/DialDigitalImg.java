package com.compress.view;

import android.util.Log;
import com.beken.iot.smartsdk.core.pack.TransmissionUnpacked;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes14.dex */
public class DialDigitalImg extends ObjectData {
    private static final String TAG = "DialConvertTool_DialDigitalImg";
    private Point alignPosition;
    private byte alignTypeAndIntegerLength;
    private short[] imgIds = new short[10];
    private byte decimalPrecision = 0;
    private short decimalPointImgId = 0;
    private short signImgId = 0;
    private short bindData = 0;
    private short space = 0;
    private boolean isPeriodic = false;
    private byte displayMode = 0;
    private byte interval_cnt = 0;

    @Override // com.compress.view.ObjectData
    protected int getSize() {
        return 38;
    }

    public byte getAlignType() {
        return (byte) (this.alignTypeAndIntegerLength & 15);
    }

    public void setAlignType(byte b) {
        this.alignTypeAndIntegerLength = (byte) ((b & 15) | (this.alignTypeAndIntegerLength & TransmissionUnpacked.HD_VAL_MAGIC_HB));
    }

    public byte getIntegerLength() {
        return (byte) ((this.alignTypeAndIntegerLength >> 4) & 15);
    }

    public void setIntegerLength(byte b) {
        this.alignTypeAndIntegerLength = (byte) ((b << 4) | (this.alignTypeAndIntegerLength & 15));
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00f1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void parseAttributes(android.content.Context r9, org.xml.sax.Attributes r10) {
        /*
            Method dump skipped, instructions count: 444
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.compress.view.DialDigitalImg.parseAttributes(android.content.Context, org.xml.sax.Attributes):void");
    }

    @Override // com.compress.view.ObjectData
    protected byte[] getBytes() {
        ByteBuffer allocate = ByteBuffer.allocate(getSize());
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        allocate.put(this.alignTypeAndIntegerLength);
        allocate.put(this.decimalPrecision);
        for (short s : this.imgIds) {
            Log.i(TAG, "id: " + ((int) s));
            allocate.putShort(s);
        }
        allocate.putShort(this.signImgId);
        allocate.putShort(this.decimalPointImgId);
        allocate.putShort(this.space);
        allocate.put(this.alignPosition.getBytes());
        allocate.putShort(this.bindData);
        allocate.put(this.isPeriodic ? (byte) 1 : (byte) 0);
        allocate.put(this.displayMode);
        allocate.put(this.interval_cnt);
        Log.i(TAG, "alignTypeAndIntegerLength: " + ((int) this.alignTypeAndIntegerLength));
        Log.i(TAG, "decimalPrecision: " + ((int) this.decimalPrecision));
        Log.i(TAG, "signImgId: " + ((int) this.signImgId));
        Log.i(TAG, "decimalPointImgId: " + ((int) this.decimalPointImgId));
        Log.i(TAG, "space: " + ((int) this.space));
        Log.i(TAG, "alignPosition.getBytes(): " + this.alignPosition.getX() + ", " + this.alignPosition.getY());
        Log.i(TAG, "bindData: " + ((int) this.bindData));
        Log.i(TAG, "isPeriodic: " + this.isPeriodic);
        Log.i(TAG, "displayMode: " + ((int) this.displayMode));
        Log.i(TAG, "interval_cnt: " + ((int) this.interval_cnt));
        return allocate.array();
    }
}
