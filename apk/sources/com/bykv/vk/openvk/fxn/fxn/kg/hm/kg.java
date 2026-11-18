package com.bykv.vk.openvk.fxn.fxn.kg.hm;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/* JADX INFO: loaded from: classes15.dex */
public class kg {
    public static long fxn(String str, String str2) {
        File fileGff = gff(str, str2);
        if (fileGff.exists()) {
            return fileGff.length();
        }
        File fileKg = kg(str, str2);
        if (fileKg.exists()) {
            return fileKg.length();
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

    public static void fxn(RandomAccessFile randomAccessFile, byte[] bArr, int r4, int r5, String str) throws IOException {
        try {
            randomAccessFile.seek(r4);
            randomAccessFile.write(bArr, 0, r5);
        } catch (Throwable unused) {
        }
    }
}
