package com.baidu.mshield.b.f;

import java.util.zip.CRC32;

/* JADX INFO: compiled from: Crc32Util.java */
/* JADX INFO: loaded from: classes15.dex */
public class c {
    public static long a(String str) {
        CRC32 crc32 = new CRC32();
        crc32.update(str.getBytes());
        return crc32.getValue();
    }
}
