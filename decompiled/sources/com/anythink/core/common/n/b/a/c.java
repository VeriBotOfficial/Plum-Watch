package com.anythink.core.common.n.b.a;

import android.gov.nist.core.Separators;
import com.anythink.core.common.n.b.ae;
import com.anythink.core.common.n.b.ag;
import com.anythink.core.common.n.b.u;
import com.anythink.core.common.n.b.v;
import com.anythink.core.common.n.b.x;
import com.anythink.core.common.n.c.e;
import com.anythink.core.common.n.c.f;
import com.anythink.core.common.n.c.o;
import com.anythink.core.common.n.c.w;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.IDN;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.AccessControlException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes12.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f4084a;
    public static final ag d;
    public static final ae e;
    private static final Method k;
    private static final Pattern l;
    public static final String[] b = new String[0];
    public static final u c = u.a(new String[0]);
    private static final o h = o.a(f.c("efbbbf"), f.c("feff"), f.c("fffe"), f.c("0000ffff"), f.c("ffff0000"));
    private static final Charset i = Charset.forName("UTF-32BE");
    private static final Charset j = Charset.forName("UTF-32LE");
    public static final TimeZone f = TimeZone.getTimeZone("GMT");
    public static final Comparator<String> g = new Comparator() { // from class: com.anythink.core.common.n.b.a.c$$ExternalSyntheticLambda1
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int compareTo;
            compareTo = ((String) obj).compareTo((String) obj2);
            return compareTo;
        }
    };

    public static int a(char c2) {
        if (c2 >= '0' && c2 <= '9') {
            return c2 - '0';
        }
        if (c2 >= 'a' && c2 <= 'f') {
            return c2 - 'W';
        }
        if (c2 < 'A' || c2 > 'F') {
            return -1;
        }
        return c2 - '7';
    }

    static {
        byte[] bArr = new byte[0];
        f4084a = bArr;
        Method method = null;
        d = ag.a((x) null, bArr);
        e = ae.a((x) null, bArr);
        try {
            method = Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class);
        } catch (Exception unused) {
        }
        k = method;
        l = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
    }

    public static void a(Throwable th, Throwable th2) {
        Method method = k;
        if (method != null) {
            try {
                method.invoke(th, th2);
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
        }
    }

    private c() {
    }

    public static void a(long j2, long j3) {
        if (j3 < 0 || 0 > j2 || j2 < j3) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused) {
            }
        }
    }

    public static void a(Socket socket) {
        if (socket != null) {
            try {
                socket.close();
            } catch (AssertionError e2) {
                if (!a(e2)) {
                    throw e2;
                }
            } catch (RuntimeException e3) {
                throw e3;
            } catch (Exception unused) {
            }
        }
    }

    private static void a(ServerSocket serverSocket) {
        if (serverSocket != null) {
            try {
                serverSocket.close();
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused) {
            }
        }
    }

    public static boolean a(w wVar, TimeUnit timeUnit) {
        try {
            return a(wVar, 100, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    public static boolean a(w wVar, int i2, TimeUnit timeUnit) {
        long nanoTime = System.nanoTime();
        long g_ = wVar.a().f_() ? wVar.a().g_() - nanoTime : Long.MAX_VALUE;
        wVar.a().a(Math.min(g_, timeUnit.toNanos(i2)) + nanoTime);
        try {
            com.anythink.core.common.n.c.c cVar = new com.anythink.core.common.n.c.c();
            while (wVar.a_(cVar, 8192L) != -1) {
                cVar.z();
            }
            if (g_ == Long.MAX_VALUE) {
                wVar.a().f();
                return true;
            }
            wVar.a().a(nanoTime + g_);
            return true;
        } catch (InterruptedIOException unused) {
            if (g_ == Long.MAX_VALUE) {
                wVar.a().f();
                return false;
            }
            wVar.a().a(nanoTime + g_);
            return false;
        } catch (Throwable th) {
            if (g_ == Long.MAX_VALUE) {
                wVar.a().f();
            } else {
                wVar.a().a(nanoTime + g_);
            }
            throw th;
        }
    }

    public static <T> List<T> a(List<T> list) {
        return Collections.unmodifiableList(new ArrayList(list));
    }

    public static <K, V> Map<K, V> a(Map<K, V> map) {
        if (map.isEmpty()) {
            return Collections.emptyMap();
        }
        return Collections.unmodifiableMap(new LinkedHashMap(map));
    }

    @SafeVarargs
    public static <T> List<T> a(T... tArr) {
        return Collections.unmodifiableList(Arrays.asList((Object[]) tArr.clone()));
    }

    public static ThreadFactory a(final String str, final boolean z) {
        return new ThreadFactory() { // from class: com.anythink.core.common.n.b.a.c$$ExternalSyntheticLambda0
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                Thread a2;
                a2 = c.a(str, z, runnable);
                return a2;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Thread a(String str, boolean z, Runnable runnable) {
        Thread thread = new Thread(runnable, str);
        thread.setDaemon(z);
        return thread;
    }

    public static String[] a(Comparator<? super String> comparator, String[] strArr, String[] strArr2) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = strArr2.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                }
                if (comparator.compare(str, strArr2[i2]) == 0) {
                    arrayList.add(str);
                    break;
                }
                i2++;
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static boolean b(Comparator<String> comparator, String[] strArr, String[] strArr2) {
        if (strArr != null && strArr2 != null && strArr.length != 0 && strArr2.length != 0) {
            for (String str : strArr) {
                for (String str2 : strArr2) {
                    if (comparator.compare(str, str2) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static String a(v vVar, boolean z) {
        String f2;
        if (vVar.f().contains(":")) {
            f2 = "[" + vVar.f() + "]";
        } else {
            f2 = vVar.f();
        }
        return (z || vVar.g() != v.a(vVar.b())) ? f2 + ":" + vVar.g() : f2;
    }

    public static boolean a(AssertionError assertionError) {
        return (assertionError.getCause() == null || assertionError.getMessage() == null || !assertionError.getMessage().contains("getsockname failed")) ? false : true;
    }

    public static int a(Comparator<String> comparator, String[] strArr, String str) {
        int length = strArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (comparator.compare(strArr[i2], str) == 0) {
                return i2;
            }
        }
        return -1;
    }

    public static String[] a(String[] strArr, String str) {
        int length = strArr.length;
        String[] strArr2 = new String[length + 1];
        System.arraycopy(strArr, 0, strArr2, 0, strArr.length);
        strArr2[length] = str;
        return strArr2;
    }

    public static int a(String str, int i2, int i3) {
        while (i2 < i3) {
            char charAt = str.charAt(i2);
            if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                return i2;
            }
            i2++;
        }
        return i3;
    }

    public static int b(String str, int i2, int i3) {
        for (int i4 = i3 - 1; i4 >= i2; i4--) {
            char charAt = str.charAt(i4);
            if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                return i4 + 1;
            }
        }
        return i2;
    }

    public static String c(String str, int i2, int i3) {
        int a2 = a(str, i2, i3);
        return str.substring(a2, b(str, a2, i3));
    }

    public static int a(String str, int i2, int i3, String str2) {
        while (i2 < i3) {
            if (str2.indexOf(str.charAt(i2)) != -1) {
                return i2;
            }
            i2++;
        }
        return i3;
    }

    public static int a(String str, int i2, int i3, char c2) {
        while (i2 < i3) {
            if (str.charAt(i2) == c2) {
                return i2;
            }
            i2++;
        }
        return i3;
    }

    public static String a(String str) {
        InetAddress d2;
        if (str.contains(":")) {
            int i2 = 0;
            if (str.startsWith("[") && str.endsWith("]")) {
                d2 = d(str, 1, str.length() - 1);
            } else {
                d2 = d(str, 0, str.length());
            }
            if (d2 == null) {
                return null;
            }
            byte[] address = d2.getAddress();
            if (address.length != 16) {
                if (address.length == 4) {
                    return d2.getHostAddress();
                }
                throw new AssertionError("Invalid IPv6 address: '" + str + Separators.QUOTE);
            }
            int i3 = -1;
            int i4 = 0;
            int i5 = 0;
            while (i4 < address.length) {
                int i6 = i4;
                while (i6 < 16 && address[i6] == 0 && address[i6 + 1] == 0) {
                    i6 += 2;
                }
                int i7 = i6 - i4;
                if (i7 > i5 && i7 >= 4) {
                    i3 = i4;
                    i5 = i7;
                }
                i4 = i6 + 2;
            }
            com.anythink.core.common.n.c.c cVar = new com.anythink.core.common.n.c.c();
            while (i2 < address.length) {
                if (i2 == i3) {
                    cVar.l(58);
                    i2 += i5;
                    if (i2 == 16) {
                        cVar.l(58);
                    }
                } else {
                    if (i2 > 0) {
                        cVar.l(58);
                    }
                    cVar.n(((address[i2] & 255) << 8) | (address[i2 + 1] & 255));
                    i2 += 2;
                }
            }
            return cVar.u();
        }
        try {
            String lowerCase = IDN.toASCII(str).toLowerCase(Locale.US);
            if (lowerCase.isEmpty()) {
                return null;
            }
            if (d(lowerCase)) {
                return null;
            }
            return lowerCase;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    private static boolean d(String str) {
        for (int i2 = 0; i2 < str.length(); i2++) {
            char charAt = str.charAt(i2);
            if (charAt <= 31 || charAt >= 127 || " #%/:?@[\\]".indexOf(charAt) != -1) {
                return true;
            }
        }
        return false;
    }

    public static int b(String str) {
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if (charAt <= 31 || charAt >= 127) {
                return i2;
            }
        }
        return -1;
    }

    public static boolean c(String str) {
        return l.matcher(str).matches();
    }

    public static String a(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    public static Charset a(e eVar, Charset charset) {
        int a2 = eVar.a(h);
        if (a2 == -1) {
            return charset;
        }
        if (a2 == 0) {
            return StandardCharsets.UTF_8;
        }
        if (a2 == 1) {
            return StandardCharsets.UTF_16BE;
        }
        if (a2 == 2) {
            return StandardCharsets.UTF_16LE;
        }
        if (a2 == 3) {
            return i;
        }
        if (a2 == 4) {
            return j;
        }
        throw new AssertionError();
    }

    public static int a(String str, long j2, TimeUnit timeUnit) {
        if (j2 < 0) {
            throw new IllegalArgumentException(str + " < 0");
        }
        if (timeUnit == null) {
            throw new NullPointerException("unit == null");
        }
        long millis = timeUnit.toMillis(j2);
        if (millis > 2147483647L) {
            throw new IllegalArgumentException(str + " too large.");
        }
        if (millis != 0 || j2 <= 0) {
            return (int) millis;
        }
        throw new IllegalArgumentException(str + " too small.");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00d7, code lost:
    
        return r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x008e, code lost:
    
        if ((r13 - r9) != 0) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0091, code lost:
    
        r3[r11] = (byte) r14;
        r10 = r18;
        r11 = r11 + 1;
        r9 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:?, code lost:
    
        return r18;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.net.InetAddress d(java.lang.String r17, int r18, int r19) {
        /*
            Method dump skipped, instructions count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.core.common.n.b.a.c.d(java.lang.String, int, int):java.net.InetAddress");
    }

    private static boolean a(String str, int i2, int i3, byte[] bArr, int i4) {
        int i5 = i4;
        while (i2 < i3) {
            if (i5 == 16) {
                return false;
            }
            if (i5 != i4) {
                if (str.charAt(i2) != '.') {
                    return false;
                }
                i2++;
            }
            int i6 = i2;
            int i7 = 0;
            while (i6 < i3) {
                char charAt = str.charAt(i6);
                if (charAt < '0' || charAt > '9') {
                    break;
                }
                if ((i7 == 0 && i2 != i6) || (i7 = ((i7 * 10) + charAt) - 48) > 255) {
                    return false;
                }
                i6++;
            }
            if (i6 - i2 == 0) {
                return false;
            }
            bArr[i5] = (byte) i7;
            i5++;
            i2 = i6;
        }
        return i5 == i4 + 4;
    }

    private static String a(byte[] bArr) {
        int i2 = -1;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i4 < bArr.length) {
            int i6 = i4;
            while (i6 < 16 && bArr[i6] == 0 && bArr[i6 + 1] == 0) {
                i6 += 2;
            }
            int i7 = i6 - i4;
            if (i7 > i5 && i7 >= 4) {
                i2 = i4;
                i5 = i7;
            }
            i4 = i6 + 2;
        }
        com.anythink.core.common.n.c.c cVar = new com.anythink.core.common.n.c.c();
        while (i3 < bArr.length) {
            if (i3 == i2) {
                cVar.l(58);
                i3 += i5;
                if (i3 == 16) {
                    cVar.l(58);
                }
            } else {
                if (i3 > 0) {
                    cVar.l(58);
                }
                cVar.n(((bArr[i3] & 255) << 8) | (bArr[i3 + 1] & 255));
                i3 += 2;
            }
        }
        return cVar.u();
    }

    public static X509TrustManager a() {
        try {
            TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            trustManagerFactory.init((KeyStore) null);
            TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
            if (trustManagers.length == 1) {
                TrustManager trustManager = trustManagers[0];
                if (trustManager instanceof X509TrustManager) {
                    return (X509TrustManager) trustManager;
                }
            }
            throw new IllegalStateException("Unexpected default trust managers:" + Arrays.toString(trustManagers));
        } catch (GeneralSecurityException e2) {
            throw new AssertionError("No System TLS", e2);
        }
    }

    public static u b(List<com.anythink.core.common.n.b.a.e.c> list) {
        u.a aVar = new u.a();
        for (com.anythink.core.common.n.b.a.e.c cVar : list) {
            a.f4052a.a(aVar, cVar.l.a(), cVar.m.a());
        }
        return aVar.a();
    }

    public static List<com.anythink.core.common.n.b.a.e.c> a(u uVar) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < uVar.a(); i2++) {
            arrayList.add(new com.anythink.core.common.n.b.a.e.c(uVar.a(i2), uVar.b(i2)));
        }
        return arrayList;
    }

    public static String a(String str, String str2) {
        String property;
        try {
            property = System.getProperty(str);
        } catch (AccessControlException unused) {
        }
        return property != null ? property : str2;
    }

    public static boolean a(v vVar, v vVar2) {
        return vVar.f().equals(vVar2.f()) && vVar.g() == vVar2.g() && vVar.b().equals(vVar2.b());
    }
}
