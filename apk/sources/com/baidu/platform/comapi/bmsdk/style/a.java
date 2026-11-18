package com.baidu.platform.comapi.bmsdk.style;

/* JADX INFO: compiled from: BmStyleUtils.java */
/* JADX INFO: loaded from: classes15.dex */
public class a {
    public static int a(int r3) {
        int r0 = ((-16777216) & r3) >> 24;
        int r2 = (65280 & r3) >> 8;
        return ((r3 & 255) << 16) | (r0 << 24) | (r2 << 8) | ((16711680 & r3) >> 16);
    }
}
