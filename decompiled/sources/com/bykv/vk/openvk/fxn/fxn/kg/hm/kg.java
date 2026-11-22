package com.bykv.vk.openvk.fxn.fxn.kg.hm;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/* loaded from: classes13.dex */
public class kg {
    public static long fxn(String str, String str2) {
        File gff = gff(str, str2);
        if (gff.exists()) {
            return gff.length();
        }
        File kg = kg(str, str2);
        if (kg.exists()) {
            return kg.length();
        }
        return 0L;
    }

    public static File kg(String str, String str2) {
        File file = new File(str);
        if (file.isFile()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return new File(file, str2 + ".temp");
    }

    public static File gff(String str, String str2) {
        File file = new File(str);
        if (file.isFile()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return new File(file, str2);
    }

    public static void fxn(RandomAccessFile randomAccessFile, byte[] bArr, int i, int i2, String str) throws IOException {
        try {
            randomAccessFile.seek(i);
            randomAccessFile.write(bArr, 0, i2);
        } catch (Throwable unused) {
        }
    }
}
