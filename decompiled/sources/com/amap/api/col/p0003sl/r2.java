package com.amap.api.col.p0003sl;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/* compiled from: FileCopy.java */
/* loaded from: classes11.dex */
public class r2 {

    /* compiled from: FileCopy.java */
    public interface a {
        void a(String str, String str2);

        void a(String str, String str2, float f);

        void a(String str, String str2, int i);
    }

    public long a(File file, File file2, long j, long j2, a aVar) {
        long j3;
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
                if (list == null) {
                    return j;
                }
                j3 = j;
                for (int i = 0; i < list.length; i++) {
                    try {
                        j3 = a(new File(file, list[i]), new File(new File(file2, file.getName()), list[i]), j3, j2, aVar);
                    } catch (Exception e) {
                        e = e;
                    }
                }
                return j3;
            }
            File parentFile = file2.getParentFile();
            if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
                throw new IOException("Cannot create dir " + parentFile.getAbsolutePath());
            }
            FileInputStream fileInputStream = new FileInputStream(file);
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            byte[] bArr = new byte[1024];
            long j4 = j;
            while (true) {
                try {
                    int read = fileInputStream.read(bArr);
                    if (read <= 0) {
                        break;
                    }
                    fileOutputStream.write(bArr, 0, read);
                    j4 += read;
                    if (aVar != null) {
                        aVar.a(absolutePath, absolutePath2, (j4 / j2) * 100.0f);
                    }
                } catch (Exception e2) {
                    e = e2;
                    j3 = j4;
                }
            }
            fileInputStream.close();
            fileOutputStream.flush();
            fileOutputStream.close();
            if (aVar != null && j4 >= j2 - 1) {
                aVar.a(absolutePath, absolutePath2);
            }
            return j4;
        } catch (Exception e3) {
            e = e3;
            j3 = j;
        }
        e.printStackTrace();
        if (aVar != null) {
            aVar.a(absolutePath, absolutePath2, -1);
        }
        return j3;
    }
}
