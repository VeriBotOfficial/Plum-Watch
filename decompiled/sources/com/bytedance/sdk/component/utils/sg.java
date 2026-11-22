package com.bytedance.sdk.component.utils;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.mipush.sdk.Constants;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes13.dex */
public class sg {
    public static File fxn(Context context, boolean z, String str, String str2) {
        String kg = kg(context);
        if (z) {
            str = fxn(context) + Constants.ACCEPT_TIME_SEPARATOR_SERVER + str;
        }
        if (kg != null && !kg.endsWith(File.separator)) {
            kg = kg + File.separator;
        }
        String str3 = kg + str;
        File file = new File(str3);
        if (!file.exists()) {
            file.mkdirs();
        }
        return new File(str3, str2);
    }

    public static File fxn(Context context, boolean z, String str) {
        String absolutePath = context.getCacheDir().getAbsolutePath();
        if (z) {
            str = fxn(context) + Constants.ACCEPT_TIME_SEPARATOR_SERVER + str;
        }
        if (absolutePath != null && !absolutePath.endsWith(File.separator)) {
            absolutePath = absolutePath + File.separator;
        }
        File file = new File(absolutePath + str);
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    private static String kg(Context context) {
        File cacheDir;
        if (context == null || (cacheDir = context.getCacheDir()) == null) {
            return null;
        }
        return cacheDir.getPath();
    }

    public static List<File> fxn(File file) {
        LinkedList linkedList = new LinkedList();
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return linkedList;
        }
        List<File> asList = Arrays.asList(listFiles);
        Collections.sort(asList, new fxn(null));
        return asList;
    }

    public static void kg(File file) throws IOException {
        if (file.exists()) {
            long currentTimeMillis = System.currentTimeMillis();
            if (file.setLastModified(currentTimeMillis)) {
                return;
            }
            rb(file);
            if (file.lastModified() < currentTimeMillis) {
                new StringBuilder("Last modified date ").append(new Date(file.lastModified()));
                file.getAbsolutePath();
            }
        }
    }

    public static void gff(File file) {
        if (file == null || !file.exists()) {
            return;
        }
        try {
            if (file.isFile()) {
                file.delete();
                return;
            }
            File[] listFiles = file.listFiles();
            if (listFiles != null && listFiles.length > 0) {
                for (File file2 : listFiles) {
                    if (file2.isDirectory()) {
                        gff(file2);
                    } else {
                        try {
                            file2.delete();
                        } catch (Throwable unused) {
                        }
                    }
                }
            }
            file.delete();
        } catch (Throwable unused2) {
        }
    }

    private static void rb(File file) throws IOException {
        RandomAccessFile randomAccessFile;
        long j;
        long length = file.length();
        if (length == 0) {
            bh(file);
            return;
        }
        try {
            randomAccessFile = new RandomAccessFile(file, "rwd");
            j = length - 1;
        } catch (Throwable unused) {
            randomAccessFile = null;
        }
        try {
            randomAccessFile.seek(j);
            byte readByte = randomAccessFile.readByte();
            randomAccessFile.seek(j);
            randomAccessFile.write(readByte);
            randomAccessFile.close();
        } catch (Throwable unused2) {
            if (randomAccessFile != null) {
                randomAccessFile.close();
            }
        }
    }

    private static void bh(File file) throws IOException {
        if (!file.delete() || !file.createNewFile()) {
            throw new IOException("Error recreate zero-size file ".concat(String.valueOf(file)));
        }
    }

    private static final class fxn implements Comparator<File> {
        private int fxn(long j, long j2) {
            if (j < j2) {
                return -1;
            }
            return j == j2 ? 0 : 1;
        }

        private fxn() {
        }

        /* synthetic */ fxn(AnonymousClass1 anonymousClass1) {
            this();
        }

        @Override // java.util.Comparator
        /* renamed from: fxn, reason: merged with bridge method [inline-methods] */
        public int compare(File file, File file2) {
            return fxn(file.lastModified(), file2.lastModified());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0048, code lost:
    
        if (r2 == null) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static byte[] hm(java.io.File r7) {
        /*
            r0 = 0
            if (r7 == 0) goto L4b
            boolean r1 = r7.isFile()
            if (r1 == 0) goto L4b
            boolean r1 = r7.exists()
            if (r1 == 0) goto L4b
            boolean r1 = r7.canRead()
            if (r1 == 0) goto L4b
            long r1 = r7.length()
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 <= 0) goto L4b
            long r1 = r7.length()     // Catch: java.lang.Throwable -> L47
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch: java.lang.Throwable -> L47
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L47
            r2.<init>(r7)     // Catch: java.lang.Throwable -> L47
            int r7 = r1.intValue()     // Catch: java.lang.Throwable -> L48
            byte[] r7 = new byte[r7]     // Catch: java.lang.Throwable -> L48
            int r3 = r2.read(r7)     // Catch: java.lang.Throwable -> L48
            long r3 = (long) r3     // Catch: java.lang.Throwable -> L48
            long r5 = r1.longValue()     // Catch: java.lang.Throwable -> L48
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L43
            r2.close()     // Catch: java.lang.Throwable -> L42
        L42:
            return r7
        L43:
            r2.close()     // Catch: java.lang.Throwable -> L4b
            goto L4b
        L47:
            r2 = r0
        L48:
            if (r2 == 0) goto L4b
            goto L43
        L4b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.utils.sg.hm(java.io.File):byte[]");
    }

    /* renamed from: com.bytedance.sdk.component.utils.sg$1, reason: invalid class name */
    static class AnonymousClass1 implements Comparator<File> {
        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(File file, File file2) {
            throw null;
        }
    }

    public static String fxn(Context context) {
        String fxn2 = iwp.fxn(context);
        return (TextUtils.isEmpty(fxn2) || !fxn2.contains(":")) ? fxn2 : fxn2.replace(":", Constants.ACCEPT_TIME_SEPARATOR_SERVER);
    }
}
