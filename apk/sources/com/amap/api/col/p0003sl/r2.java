package com.amap.api.col.p0003sl;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: compiled from: FileCopy.java */
/* JADX INFO: loaded from: classes7.dex */
public class r2 {

    /* JADX INFO: compiled from: FileCopy.java */
    public interface a {
        void a(String str, String str2);

        void a(String str, String str2, float f);

        void a(String str, String str2, int r3);
    }

    public long a(File file, File file2, long j, long j2, a aVar) {
        long jA;
        if (j == 0) {
            if (aVar != null) {
                aVar.a("", "", -1);
            }
            return 0L;
        }
        String absolutePath = file.getAbsolutePath();
        String absolutePath2 = file2.getAbsolutePath();
        try {
            if (file.isDirectory()) {
                if (!file2.exists() && !file2.mkdirs()) {
                    throw new IOException("Cannot create dir " + file2.getAbsolutePath());
                }
                String[] list = file.list();
                jA = j;
                if (list == null) {
                    return jA;
                }
                int r7 = 0;
                while (r7 < list.length) {
                    try {
                        int r18 = r7;
                        String[] strArr = list;
                        jA = a(new File(file, list[r7]), new File(new File(file2, file.getName()), list[r7]), jA, j2, aVar);
                        r7 = r18 + 1;
                        list = strArr;
                    } catch (Exception e) {
                        e = e;
                    }
                }
                return jA;
            }
            File parentFile = file2.getParentFile();
            if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
                throw new IOException("Cannot create dir " + parentFile.getAbsolutePath());
            }
            FileInputStream fileInputStream = new FileInputStream(file);
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            byte[] bArr = new byte[1024];
            long j3 = j;
            while (true) {
                try {
                    int r6 = fileInputStream.read(bArr);
                    if (r6 <= 0) {
                        break;
                    }
                    fileOutputStream.write(bArr, 0, r6);
                    j3 += (long) r6;
                    if (aVar != null) {
                        aVar.a(absolutePath, absolutePath2, (j3 / j2) * 100.0f);
                    }
                } catch (Exception e2) {
                    e = e2;
                    jA = j3;
                }
            }
            fileInputStream.close();
            fileOutputStream.flush();
            fileOutputStream.close();
            if (aVar != null && j3 >= j2 - 1) {
                aVar.a(absolutePath, absolutePath2);
            }
            return j3;
        } catch (Exception e3) {
            e = e3;
            jA = j;
        }
        e.printStackTrace();
        if (aVar == null) {
            return jA;
        }
        aVar.a(absolutePath, absolutePath2, -1);
        return jA;
    }
}
