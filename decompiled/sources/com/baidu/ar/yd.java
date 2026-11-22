package com.baidu.ar;

import android.view.Surface;

/* loaded from: classes12.dex */
public class yd extends e1 {
    public static final String k = "yd";
    public Surface j;

    /* JADX WARN: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(com.baidu.ar.record.EncoderParams r3, com.baidu.ar.z8 r4) {
        /*
            r2 = this;
            if (r3 == 0) goto L57
            if (r4 == 0) goto L57
            r2.c = r4
            java.lang.String r4 = r3.getVideoCodec()
            int r0 = r3.getVideoWidth()
            int r1 = r3.getVideoHeight()
            android.media.MediaFormat r4 = android.media.MediaFormat.createVideoFormat(r4, r0, r1)
            java.lang.String r0 = "color-format"
            r1 = 2130708361(0x7f000789, float:1.701803E38)
            r4.setInteger(r0, r1)
            int r0 = r3.getVideoBitrate()
            java.lang.String r1 = "bitrate"
            r4.setInteger(r1, r0)
            int r0 = r3.getVideoFrameRate()
            java.lang.String r1 = "frame-rate"
            r4.setInteger(r1, r0)
            int r0 = r3.getVideoIFrameInterval()
            java.lang.String r1 = "i-frame-interval"
            r4.setInteger(r1, r0)
            java.lang.String r3 = r3.getVideoCodec()     // Catch: java.lang.Exception -> L53
            android.media.MediaCodec r3 = android.media.MediaCodec.createEncoderByType(r3)     // Catch: java.lang.Exception -> L53
            r2.d = r3     // Catch: java.lang.Exception -> L53
            r0 = 0
            r1 = 1
            r3.configure(r4, r0, r0, r1)     // Catch: java.lang.Exception -> L53
            android.media.MediaCodec r3 = r2.d     // Catch: java.lang.Exception -> L53
            android.view.Surface r3 = r3.createInputSurface()     // Catch: java.lang.Exception -> L53
            r2.j = r3     // Catch: java.lang.Exception -> L53
            r2.g = r1     // Catch: java.lang.Exception -> L53
            goto L58
        L53:
            r3 = move-exception
            r3.printStackTrace()
        L57:
            r1 = 0
        L58:
            com.baidu.ar.p3 r3 = r2.f
            if (r3 == 0) goto L61
            android.view.Surface r4 = r2.j
            r3.a(r1, r4)
        L61:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baidu.ar.yd.a(com.baidu.ar.record.EncoderParams, com.baidu.ar.z8):void");
    }

    @Override // com.baidu.ar.e1
    public void d() {
        if (this.h == 0) {
            this.h = this.e.presentationTimeUs;
        }
        this.e.presentationTimeUs -= this.h;
        h.a(k, "syncTimestamp mVideoEncoder = " + this.e.size + "|" + this.e.presentationTimeUs);
    }
}
