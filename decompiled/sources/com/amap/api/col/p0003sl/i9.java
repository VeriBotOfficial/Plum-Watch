package com.amap.api.col.p0003sl;

import android.content.Context;
import android.text.TextUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.URI;
import java.security.MessageDigest;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: MD5.java */
/* loaded from: classes11.dex */
public class i9 {
    public static String a(String str) {
        byte[] bArr;
        if (str == null) {
            bArr = null;
        } else {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance(m9.b("ETUQ1"));
                messageDigest.update(m9.e(str));
                bArr = messageDigest.digest();
            } catch (Throwable th) {
                th.printStackTrace();
                bArr = new byte[0];
            }
        }
        int i = m9.d;
        try {
            return m9.b(bArr);
        } catch (Throwable th2) {
            fa.a(th2, "ut", "csb2h");
            return null;
        }
    }

    public static String b(String str) {
        FileInputStream fileInputStream;
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            File file = new File(str);
            if (file.isFile() && file.exists()) {
                byte[] bArr = new byte[2048];
                MessageDigest messageDigest = MessageDigest.getInstance(m9.b("ETUQ1"));
                fileInputStream = new FileInputStream(file);
                while (true) {
                    try {
                        int read = fileInputStream.read(bArr);
                        if (read == -1) {
                            String a2 = m9.a(messageDigest.digest());
                            try {
                                fileInputStream.close();
                                return a2;
                            } catch (IOException e) {
                                fa.a(e, "MD5", "gfm");
                                return a2;
                            }
                        }
                        messageDigest.update(bArr, 0, read);
                    } catch (Throwable th) {
                        th = th;
                        try {
                            fa.a(th, "MD5", "gfm");
                            return null;
                        } finally {
                            if (fileInputStream != null) {
                                try {
                                    fileInputStream.close();
                                } catch (IOException e2) {
                                    fa.a(e2, "MD5", "gfm");
                                }
                            }
                        }
                    }
                }
            }
            return null;
        } catch (Throwable th2) {
            th = th2;
            fileInputStream = null;
        }
    }

    public static String c(String str) {
        byte[] bArr;
        if (str == null) {
            return null;
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(m9.b("ETUQ1"));
            messageDigest.update(m9.e(str));
            bArr = messageDigest.digest();
        } catch (Throwable th) {
            fa.a(th, "MD5", "gmb");
            bArr = new byte[0];
        }
        return m9.a(bArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.net.Proxy$Type] */
    public static Proxy b(Context context) {
        Proxy proxy;
        String str = "pu";
        try {
            URI uri = new URI("http://restsdk.amap.com");
            if (d9.g(context) == 0) {
                try {
                    List<Proxy> select = ProxySelector.getDefault().select(uri);
                    if (select != null && !select.isEmpty() && (proxy = select.get(0)) != null) {
                        Proxy.Type type = proxy.type();
                        str = Proxy.Type.DIRECT;
                        if (type != str) {
                            return proxy;
                        }
                    }
                } catch (Throwable th) {
                    ja.a(th, "pu", "gpsc");
                }
            }
        } catch (Throwable th2) {
            ja.a(th2, str, "gp");
        }
        return null;
    }

    private static int b() {
        try {
            return android.net.Proxy.getDefaultPort();
        } catch (Throwable th) {
            ja.a(th, "pu", "gdp");
            return -1;
        }
    }

    private static String a() {
        String str;
        try {
            str = android.net.Proxy.getDefaultHost();
        } catch (Throwable th) {
            ja.a(th, "pu", "gdh");
            str = null;
        }
        return str == null ? AbstractJsonLexerKt.NULL : str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:108:0x00d1, code lost:
    
        if (r9 != null) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00d3, code lost:
    
        r9.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00d8, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00d9, code lost:
    
        com.amap.api.col.p0003sl.ja.a(r0, "pu", "gPx2");
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x007e, code lost:
    
        if (r11 == (-1)) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0081, code lost:
    
        r15 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00b3, code lost:
    
        if (r11 == (-1)) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x00bf, code lost:
    
        if (r9 != null) goto L135;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x00f0 A[Catch: all -> 0x00f5, TRY_LEAVE, TryCatch #9 {all -> 0x00f5, blocks: (B:68:0x00e9, B:101:0x00f0), top: B:67:0x00e9 }] */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0150 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00f9 A[Catch: all -> 0x016e, TRY_ENTER, TryCatch #8 {all -> 0x016e, blocks: (B:106:0x00c8, B:66:0x00e4, B:73:0x00f9, B:75:0x010d, B:77:0x0113, B:81:0x011e, B:91:0x0125, B:93:0x012b, B:95:0x0131, B:99:0x013c), top: B:4:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0146 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v15, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v20 */
    /* JADX WARN: Type inference failed for: r10v21 */
    /* JADX WARN: Type inference failed for: r10v23 */
    /* JADX WARN: Type inference failed for: r10v24 */
    /* JADX WARN: Type inference failed for: r10v27 */
    /* JADX WARN: Type inference failed for: r10v28 */
    /* JADX WARN: Type inference failed for: r10v29 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v30, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v32 */
    /* JADX WARN: Type inference failed for: r10v34 */
    /* JADX WARN: Type inference failed for: r10v35 */
    /* JADX WARN: Type inference failed for: r10v36 */
    /* JADX WARN: Type inference failed for: r10v37 */
    /* JADX WARN: Type inference failed for: r10v38 */
    /* JADX WARN: Type inference failed for: r10v39 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v40 */
    /* JADX WARN: Type inference failed for: r10v41 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r9v0, types: [android.content.ContentResolver, android.database.Cursor] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.net.Proxy a(android.content.Context r20) {
        /*
            Method dump skipped, instructions count: 382
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amap.api.col.p0003sl.i9.a(android.content.Context):java.net.Proxy");
    }

    public static String a(byte[] bArr) {
        byte[] bArr2;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(m9.b("ETUQ1"));
            messageDigest.update(bArr);
            bArr2 = messageDigest.digest();
        } catch (Throwable th) {
            fa.a(th, "MD5", "gmb");
            bArr2 = null;
        }
        return m9.a(bArr2);
    }
}
