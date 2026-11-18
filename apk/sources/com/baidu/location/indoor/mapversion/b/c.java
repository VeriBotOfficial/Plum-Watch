package com.baidu.location.indoor.mapversion.b;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* JADX INFO: loaded from: classes15.dex */
public class c {
    public static boolean a(File file, ByteArrayOutputStream byteArrayOutputStream) {
        try {
            ZipFile zipFile = new ZipFile(file);
            Enumeration<? extends ZipEntry> enumerationEntries = zipFile.entries();
            while (enumerationEntries.hasMoreElements()) {
                ZipEntry zipEntryNextElement = enumerationEntries.nextElement();
                if (!zipEntryNextElement.isDirectory()) {
                    BufferedInputStream bufferedInputStream = new BufferedInputStream(zipFile.getInputStream(zipEntryNextElement));
                    BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(byteArrayOutputStream, 2048);
                    byte[] bArr = new byte[2048];
                    while (true) {
                        int r6 = bufferedInputStream.read(bArr, 0, 2048);
                        if (r6 == -1) {
                            break;
                        }
                        bufferedOutputStream.write(bArr, 0, r6);
                    }
                    bufferedOutputStream.flush();
                    bufferedOutputStream.close();
                    bufferedInputStream.close();
                }
            }
            zipFile.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
