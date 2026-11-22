package org.easydarwin.sw;

import android.content.Context;
import android.text.TextUtils;
import java.io.File;

/* loaded from: classes6.dex */
public class TxtOverlay {
    private final Context context;
    private long ctx;

    private static native void txtOverlay(long j, byte[] bArr, String str);

    private static native long txtOverlayInit(int i, int i2, String str);

    private static native void txtOverlayRelease(long j);

    static {
        System.loadLibrary("TxtOverlay");
    }

    public TxtOverlay(Context context) {
        this.context = context;
    }

    public void init(int i, int i2, String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("the font file must be valid!");
        }
        if (!new File(str).exists()) {
            throw new IllegalArgumentException("the font file must be exists!");
        }
        this.ctx = txtOverlayInit(i, i2, str);
    }

    public void overlay(byte[] bArr, String str) {
        long j = this.ctx;
        if (j == 0) {
            return;
        }
        txtOverlay(j, bArr, str);
    }

    public void release() {
        long j = this.ctx;
        if (j == 0) {
            return;
        }
        txtOverlayRelease(j);
        this.ctx = 0L;
    }
}
