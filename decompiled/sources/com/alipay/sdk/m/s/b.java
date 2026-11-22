package com.alipay.sdk.m.s;

import android.content.Context;
import android.net.NetworkInfo;
import android.text.TextUtils;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.CookieManager;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;
import java.util.Map;

/* loaded from: classes11.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final String f1450a = "msp";
    public static final String b = "application/octet-stream;binary/octet-stream";
    public static final CookieManager c = new CookieManager();

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f1451a;
        public final byte[] b;
        public final Map<String, String> c;

        public a(String str, Map<String, String> map, byte[] bArr) {
            this.f1451a = str;
            this.b = bArr;
            this.c = map;
        }

        public String toString() {
            return String.format("<UrlConnectionConfigure url=%s headers=%s>", this.f1451a, this.c);
        }
    }

    /* renamed from: com.alipay.sdk.m.s.b$b, reason: collision with other inner class name */
    public static final class C0099b {

        /* renamed from: a, reason: collision with root package name */
        public final Map<String, List<String>> f1452a;
        public final String b;
        public final byte[] c;

        public C0099b(Map<String, List<String>> map, String str, byte[] bArr) {
            this.f1452a = map;
            this.b = str;
            this.c = bArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01a8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01a3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01ad A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.io.OutputStream] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.alipay.sdk.m.s.b.C0099b a(android.content.Context r12, com.alipay.sdk.m.s.b.a r13) {
        /*
            Method dump skipped, instructions count: 450
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.sdk.m.s.b.a(android.content.Context, com.alipay.sdk.m.s.b$a):com.alipay.sdk.m.s.b$b");
    }

    public static Proxy b(Context context) {
        String a2 = a(context);
        if (a2 != null && !a2.contains("wap")) {
            return null;
        }
        try {
            String property = System.getProperty("https.proxyHost");
            String property2 = System.getProperty("https.proxyPort");
            if (!TextUtils.isEmpty(property)) {
                return new Proxy(Proxy.Type.HTTP, new InetSocketAddress(property, Integer.parseInt(property2)));
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    public static String a(Context context) {
        try {
            NetworkInfo a2 = com.alipay.sdk.m.a0.b.a(null, context);
            if (a2 != null && a2.isAvailable()) {
                if (a2.getType() == 1) {
                    return "wifi";
                }
                return a2.getExtraInfo().toLowerCase();
            }
        } catch (Exception unused) {
        }
        return "none";
    }

    public static byte[] a(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        while (true) {
            int read = inputStream.read(bArr, 0, 1024);
            if (read != -1) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                byteArrayOutputStream.flush();
                return byteArrayOutputStream.toByteArray();
            }
        }
    }
}
