package com.beken.iot.smartsdk.core.decode;

import android.graphics.Bitmap;
import com.beken.iot.smartsdk.core.log.BKSmartLog;
import com.beken.iot.smartsdk.core.video.ImageFrame;
import com.beken.iot.smartsdk.options.BkSmartCameraVideoOptions;
import com.beken.iot.smartsdk.options.ImageEncodingProtocolType;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes13.dex */
public class FFmpegDecoder {
    private static final String TAG = "FFmpegDecoder";
    private long decoderIndex = Long.MIN_VALUE;
    private boolean first = true;
    private final ReentrantLock lock;
    private BkSmartCameraVideoOptions options;

    private native long create(int i);

    private native Bitmap decode(long j, byte[] bArr, int i, boolean z);

    private native void destroy(long j);

    static {
        System.loadLibrary("bk_iot_lib");
    }

    public FFmpegDecoder(ReentrantLock reentrantLock) {
        this.lock = reentrantLock;
    }

    public void setOptions(BkSmartCameraVideoOptions bkSmartCameraVideoOptions) {
        this.options = bkSmartCameraVideoOptions;
    }

    public void createDecoder() {
        try {
            this.lock.lock();
            BkSmartCameraVideoOptions bkSmartCameraVideoOptions = this.options;
            if (bkSmartCameraVideoOptions == null) {
                printD("options为空，无法创建");
                this.lock.unlock();
            } else if (this.decoderIndex != Long.MIN_VALUE) {
                printD("已经存在解码器，不再创建");
                this.lock.unlock();
            } else {
                this.first = true;
                this.decoderIndex = create(bkSmartCameraVideoOptions.getFrameFormat());
                printD("createDecoder: " + this.decoderIndex);
                this.lock.unlock();
            }
        } catch (Exception e) {
            printE(e.getMessage());
        }
    }

    public void destroyDecoder() {
        try {
            this.lock.lock();
            printD("destroyDecoder invoke native destroy Thread id " + Thread.currentThread().getId());
            long j = this.decoderIndex;
            if (j == Long.MIN_VALUE) {
                printD("destroyDecoder 无解码器,返回");
                this.lock.unlock();
            } else {
                destroy(j);
                this.decoderIndex = Long.MIN_VALUE;
                printD("destroyDecoder holdCount " + this.lock.getHoldCount());
                this.lock.unlock();
            }
        } catch (Exception e) {
            try {
                if (this.lock.isLocked()) {
                    this.lock.unlock();
                }
            } catch (Exception e2) {
                printE(e2.getMessage());
            }
            printE(e.getMessage());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x005f A[Catch: Exception -> 0x0065, TRY_LEAVE, TryCatch #1 {Exception -> 0x0065, blocks: (B:28:0x0057, B:30:0x005f), top: B:27:0x0057 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.graphics.Bitmap decode(com.beken.iot.smartsdk.core.video.ImageFrame r9) {
        /*
            r8 = this;
            r1 = 0
            java.util.concurrent.locks.ReentrantLock r0 = r8.lock     // Catch: java.lang.Exception -> L54
            r0.lock()     // Catch: java.lang.Exception -> L54
            long r2 = r8.decoderIndex     // Catch: java.lang.Exception -> L54
            r4 = -9223372036854775808
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 != 0) goto L1d
            java.lang.String r9 = "decode 无解码器，返回"
            r8.printD(r9)     // Catch: java.lang.Exception -> L19
            java.util.concurrent.locks.ReentrantLock r9 = r8.lock     // Catch: java.lang.Exception -> L19
            r9.unlock()     // Catch: java.lang.Exception -> L19
            return r1
        L19:
            r0 = move-exception
            r9 = r0
            r2 = r8
            goto L57
        L1d:
            boolean r0 = r8.first     // Catch: java.lang.Exception -> L54
            if (r0 == 0) goto L37
            boolean r0 = r8.isBekenImageEncodingProtocolType()     // Catch: java.lang.Exception -> L19
            if (r0 == 0) goto L37
            boolean r0 = r8.isLegalIFrame(r9)     // Catch: java.lang.Exception -> L19
            if (r0 == 0) goto L31
            r0 = 0
            r8.first = r0     // Catch: java.lang.Exception -> L19
            goto L37
        L31:
            java.util.concurrent.locks.ReentrantLock r9 = r8.lock     // Catch: java.lang.Exception -> L19
            r9.unlock()     // Catch: java.lang.Exception -> L19
            return r1
        L37:
            long r3 = r8.decoderIndex     // Catch: java.lang.Exception -> L54
            byte[] r5 = r9.getFrameData()     // Catch: java.lang.Exception -> L54
            int r6 = r9.getSequence()     // Catch: java.lang.Exception -> L54
            com.beken.iot.smartsdk.core.log.BKSmartLog r9 = com.beken.iot.smartsdk.core.log.BKSmartLog.INSTANCE     // Catch: java.lang.Exception -> L54
            boolean r7 = r9.getEnableDetail()     // Catch: java.lang.Exception -> L54
            r2 = r8
            android.graphics.Bitmap r9 = r2.decode(r3, r5, r6, r7)     // Catch: java.lang.Exception -> L52
            java.util.concurrent.locks.ReentrantLock r0 = r2.lock     // Catch: java.lang.Exception -> L52
            r0.unlock()     // Catch: java.lang.Exception -> L52
            return r9
        L52:
            r0 = move-exception
            goto L56
        L54:
            r0 = move-exception
            r2 = r8
        L56:
            r9 = r0
        L57:
            java.util.concurrent.locks.ReentrantLock r0 = r2.lock     // Catch: java.lang.Exception -> L65
            boolean r0 = r0.isLocked()     // Catch: java.lang.Exception -> L65
            if (r0 == 0) goto L68
            java.util.concurrent.locks.ReentrantLock r0 = r2.lock     // Catch: java.lang.Exception -> L65
            r0.unlock()     // Catch: java.lang.Exception -> L65
            goto L68
        L65:
            r9.printStackTrace()
        L68:
            java.lang.String r9 = r9.getMessage()
            r8.printE(r9)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.beken.iot.smartsdk.core.decode.FFmpegDecoder.decode(com.beken.iot.smartsdk.core.video.ImageFrame):android.graphics.Bitmap");
    }

    private boolean isBekenImageEncodingProtocolType() {
        BkSmartCameraVideoOptions bkSmartCameraVideoOptions = this.options;
        return bkSmartCameraVideoOptions == null || bkSmartCameraVideoOptions.getImageEncodingProtocolType() == ImageEncodingProtocolType.BEKEN;
    }

    private boolean isLegalIFrame(ImageFrame imageFrame) {
        printD("isLegalIFrame invoke");
        if (imageFrame == null) {
            printD("isLegalIFrame imageFrame is null ret false");
            return false;
        }
        byte[] frameData = imageFrame.getFrameData();
        if (frameData == null || frameData.length < 5) {
            printD("isLegalIFrame false frameData length " + (frameData == null ? 0 : frameData.length));
            return false;
        }
        boolean z = frameData[4] == 103;
        printD("isLegalIFrame length " + frameData.length + " frameData[4] => " + ((int) frameData[4]) + " ret => " + z);
        return z;
    }

    private void printD(String str) {
        BKSmartLog.INSTANCE.e(TAG, str);
    }

    private void printE(String str) {
        BKSmartLog.INSTANCE.e(TAG, str);
    }

    private static void printDFromNative(String str) {
        BKSmartLog.INSTANCE.d("Decoder_FromNative", str);
    }

    private static void printDetailFromNative(String str) {
        BKSmartLog.INSTANCE.detail("Decoder_FromNative", str);
    }
}
