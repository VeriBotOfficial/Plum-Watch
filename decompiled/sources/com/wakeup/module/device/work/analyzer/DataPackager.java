package com.wakeup.module.device.work.analyzer;

import com.wakeup.common.log.LogUtils;
import com.wakeup.common.utils.ByteUtils;

/* loaded from: classes4.dex */
public class DataPackager {
    private static final String TAG = "DataPackager";
    private byte[] buffer;
    private int index;

    public boolean packageData(byte[] bArr) {
        byte[] bArr2 = this.buffer;
        if (bArr2 == null) {
            if (bArr.length < 3) {
                return false;
            }
            int i = ((bArr[1] & 255) * 256) | (bArr[2] & 255);
            if (bArr.length - 3 <= i) {
                byte[] bArr3 = new byte[i + 3];
                this.buffer = bArr3;
                System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
                this.index = bArr.length;
                LogUtils.i(TAG, "packageData is need append: " + (this.index < this.buffer.length));
            }
        } else if ((bArr.length - 1) + this.index <= bArr2.length) {
            LogUtils.i(TAG, "packageData append index = " + this.index + " ; bytes.length: " + bArr.length);
            System.arraycopy(bArr, 1, this.buffer, this.index, bArr.length - 1);
            this.index += bArr.length - 1;
        } else {
            LogUtils.w(TAG, "packageData append error clear");
            clear();
            return false;
        }
        LogUtils.i(TAG, "packageData index = " + this.index + " ; buffer = " + ByteUtils.bytesToHexStr(this.buffer));
        byte[] bArr4 = this.buffer;
        return bArr4 != null && this.index == bArr4.length;
    }

    public boolean isPackageIng() {
        return this.buffer != null;
    }

    public byte[] getBuffer() {
        byte[] bArr = this.buffer;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    public void clear() {
        this.buffer = null;
        this.index = 0;
    }
}
