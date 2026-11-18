package com.bytedance.sdk.openadsdk;

import androidx.camera.video.AudioStats;

/* JADX INFO: loaded from: classes11.dex */
public class TTImage {
    private final int fxn;
    private final String gff;
    private double hm;
    private final int kg;

    public TTImage(int r1, int r2, String str, double d) {
        this.fxn = r1;
        this.kg = r2;
        this.gff = str;
        this.hm = d;
    }

    public TTImage(int r7, int r8, String str) {
        this(r7, r8, str, AudioStats.AUDIO_AMPLITUDE_NONE);
    }

    public int getHeight() {
        return this.fxn;
    }

    public int getWidth() {
        return this.kg;
    }

    public String getImageUrl() {
        return this.gff;
    }

    public double getDuration() {
        return this.hm;
    }

    public boolean isValid() {
        String str;
        return this.fxn > 0 && this.kg > 0 && (str = this.gff) != null && str.length() > 0;
    }
}
