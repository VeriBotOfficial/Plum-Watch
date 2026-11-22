package com.anythink.core.common.v;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipInputStream;

/* loaded from: classes12.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static final int f4365a = 4096;
    private static final String b = "ATUnzipUtility";

    private static void a(ZipInputStream zipInputStream, String str) {
        BufferedOutputStream bufferedOutputStream;
        File file = new File(str);
        if (!file.getParentFile().exists()) {
            file.getParentFile().mkdirs();
        }
        BufferedOutputStream bufferedOutputStream2 = null;
        try {
            try {
                bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
            } catch (Throwable th) {
                th = th;
            }
        } catch (IOException e) {
            e = e;
        }
        try {
            byte[] bArr = new byte[4096];
            while (true) {
                int read = zipInputStream.read(bArr);
                if (read != -1) {
                    bufferedOutputStream.write(bArr, 0, read);
                } else {
                    bufferedOutputStream.close();
                    return;
                }
            }
        } catch (IOException e2) {
            e = e2;
            throw new IOException(e);
        } catch (Throwable th2) {
            th = th2;
            bufferedOutputStream2 = bufferedOutputStream;
            if (bufferedOutputStream2 != null) {
                bufferedOutputStream2.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x00ec, code lost:
    
        r12.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x00f0, code lost:
    
        r12 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x00f1, code lost:
    
        r12.getMessage();
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0101, code lost:
    
        r12.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0105, code lost:
    
        r12 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0106, code lost:
    
        r12.getMessage();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int a(java.lang.String r12, java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.core.common.v.a.a(java.lang.String, java.lang.String):int");
    }
}
