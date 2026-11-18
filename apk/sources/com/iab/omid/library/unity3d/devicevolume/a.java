package com.iab.omid.library.unity3d.devicevolume;

/* JADX INFO: loaded from: classes2.dex */
public class a {
    public float a(int r2, int r3) {
        if (r3 <= 0 || r2 <= 0) {
            return 0.0f;
        }
        float f = r2 / r3;
        if (f > 1.0f) {
            return 1.0f;
        }
        return f;
    }
}
