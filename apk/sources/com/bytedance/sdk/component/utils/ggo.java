package com.bytedance.sdk.component.utils;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* JADX INFO: loaded from: classes15.dex */
public class ggo {
    public static List<File> fxn(String str, String str2) throws IOException {
        return fxn(str, str2, (String) null);
    }

    public static List<File> fxn(String str, String str2, String str3) throws IOException {
        return fxn(fxn(str), fxn(str2), str3);
    }

    public static List<File> fxn(File file, File file2, String str) throws IOException {
        if (file == null || file2 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        ZipFile zipFile = new ZipFile(file);
        Enumeration<? extends ZipEntry> enumerationEntries = zipFile.entries();
        try {
            if (kg(str)) {
                while (enumerationEntries.hasMoreElements()) {
                    ZipEntry zipEntryNextElement = enumerationEntries.nextElement();
                    String name = zipEntryNextElement.getName();
                    if (name.contains("../")) {
                        new StringBuilder("entryName: ").append(name);
                    } else if (!fxn(file2, arrayList, zipFile, zipEntryNextElement, name)) {
                        zipFile.close();
                        return arrayList;
                    }
                }
            } else {
                while (enumerationEntries.hasMoreElements()) {
                    ZipEntry zipEntryNextElement2 = enumerationEntries.nextElement();
                    String name2 = zipEntryNextElement2.getName();
                    if (name2.contains("../")) {
                        new StringBuilder("entryName: ").append(name2);
                    } else if (name2.contains(str) && !fxn(file2, arrayList, zipFile, zipEntryNextElement2, name2)) {
                        zipFile.close();
                        return arrayList;
                    }
                }
            }
            zipFile.close();
            return arrayList;
        } catch (Throwable th) {
            zipFile.close();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0059  */
    /* JADX WARN: Code duplicated, block: B:33:0x005e  */
    /* JADX WARN: Code duplicated, block: B:35:0x0063  */
    private static boolean fxn(File file, List<File> list, ZipFile zipFile, ZipEntry zipEntry, String str) throws Throwable {
        BufferedOutputStream bufferedOutputStream;
        FileOutputStream fileOutputStream;
        BufferedInputStream bufferedInputStream;
        Throwable th;
        File file2 = new File(file, str);
        list.add(file2);
        if (zipEntry.isDirectory()) {
            return fxn(file2);
        }
        if (!kg(file2)) {
            return false;
        }
        try {
            fileOutputStream = new FileOutputStream(file2);
            try {
                bufferedInputStream = new BufferedInputStream(zipFile.getInputStream(zipEntry));
                try {
                    bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
                    try {
                        byte[] bArr = new byte[8192];
                        while (true) {
                            int r5 = bufferedInputStream.read(bArr);
                            if (r5 != -1) {
                                bufferedOutputStream.write(bArr, 0, r5);
                            } else {
                                bufferedInputStream.close();
                                bufferedOutputStream.close();
                                fileOutputStream.close();
                                return true;
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (bufferedInputStream != null) {
                            bufferedInputStream.close();
                        }
                        if (bufferedOutputStream != null) {
                            bufferedOutputStream.close();
                        }
                        if (fileOutputStream != null) {
                            fileOutputStream.close();
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    bufferedOutputStream = null;
                    th = th;
                    if (bufferedInputStream != null) {
                        bufferedInputStream.close();
                    }
                    if (bufferedOutputStream != null) {
                        bufferedOutputStream.close();
                    }
                    if (fileOutputStream != null) {
                        fileOutputStream.close();
                    }
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                bufferedOutputStream = null;
                bufferedInputStream = null;
            }
        } catch (Throwable th5) {
            th = th5;
            bufferedOutputStream = null;
            fileOutputStream = null;
            bufferedInputStream = null;
        }
    }

    private static boolean fxn(File file) {
        if (file == null) {
            return false;
        }
        if (file.exists()) {
            return file.isDirectory();
        }
        return file.mkdirs();
    }

    private static boolean kg(File file) {
        if (file == null) {
            return false;
        }
        if (file.exists()) {
            return file.isFile();
        }
        if (!fxn(file.getParentFile())) {
            return false;
        }
        try {
            return file.createNewFile();
        } catch (Throwable unused) {
            return false;
        }
    }

    private static File fxn(String str) {
        if (kg(str)) {
            return null;
        }
        return new File(str);
    }

    private static boolean kg(String str) {
        if (str == null) {
            return true;
        }
        int length = str.length();
        for (int r3 = 0; r3 < length; r3++) {
            if (!Character.isWhitespace(str.charAt(r3))) {
                return false;
            }
        }
        return true;
    }
}
