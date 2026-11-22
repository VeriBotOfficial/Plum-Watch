package com.beken.iot.smartsdk.core.video;

import android.gov.nist.javax.sip.parser.TokenNames;
import com.beken.iot.smartsdk.core.log.BKSmartLog;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes13.dex */
public class Ppi {
    private static final String TAG = "PPI";
    private int height;
    private int width;

    public Ppi(int i, int i2) {
        this.width = i;
        this.height = i2;
    }

    public int getHeight() {
        return this.height;
    }

    public int getWidth() {
        return this.width;
    }

    public Ppi(String str) {
        this.width = 0;
        this.height = 0;
        printD("ppi: " + str);
        String[] split = str.split(TokenNames.X);
        this.width = Integer.parseInt(split[0]);
        this.height = Integer.parseInt(split[1]);
    }

    public boolean isSame(Ppi ppi) {
        return ppi != null && ppi.height == this.height && ppi.width == this.width;
    }

    public Ppi transpose() {
        int i = this.height;
        this.height = this.width;
        this.width = i;
        return this;
    }

    public String toString() {
        return "Ppi{width=" + this.width + ", height=" + this.height + AbstractJsonLexerKt.END_OBJ;
    }

    private static void printD(String str) {
        BKSmartLog.INSTANCE.d(TAG, str);
    }
}
