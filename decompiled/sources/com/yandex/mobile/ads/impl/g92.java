package com.yandex.mobile.ads.impl;

import com.google.common.net.HttpHeaders;
import com.yandex.mobile.ads.impl.gi0;
import com.yandex.mobile.ads.impl.qf0;
import com.yandex.mobile.ads.impl.w50;
import com.yandex.mobile.ads.impl.yp1;
import com.yandex.mobile.ads.impl.zq1;
import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import kotlin.ExceptionsKt;
import kotlin.UShort;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import okio.Buffer;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.ByteString;
import okio.Options;

/* loaded from: classes5.dex */
public final class g92 {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f15568a;
    public static final qf0 b = qf0.b.a(new String[0]);
    public static final yq1 c;
    public static final TimeZone d;
    private static final Regex e;
    public static final boolean f;
    public static final String g;

    public static final int a(byte b2) {
        return b2 & 255;
    }

    public static final int a(char c2) {
        if ('0' <= c2 && c2 < ':') {
            return c2 - '0';
        }
        if ('a' <= c2 && c2 < 'g') {
            return c2 - 'W';
        }
        if ('A' > c2 || c2 >= 'G') {
            return -1;
        }
        return c2 - '7';
    }

    public static final int a(short s) {
        return s & UShort.MAX_VALUE;
    }

    public static final long a(int i) {
        return i & 2147483647L;
    }

    public static final void a(ArrayList arrayList, Object obj) {
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        if (arrayList.contains(obj)) {
            return;
        }
        arrayList.add(obj);
    }

    public static final boolean c(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return StringsKt.equals(name, "Authorization", true) || StringsKt.equals(name, "Cookie", true) || StringsKt.equals(name, "Proxy-Authorization", true) || StringsKt.equals(name, HttpHeaders.SET_COOKIE, true);
    }

    public static final int b(int i, int i2, String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        int i3 = i2 - 1;
        if (i <= i3) {
            while (true) {
                char charAt = str.charAt(i3);
                if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                    return i3 + 1;
                }
                if (i3 == i) {
                    break;
                }
                i3--;
            }
        }
        return i;
    }

    public static final String[] b(String[] strArr, String[] other, Comparator<? super String> comparator) {
        Intrinsics.checkNotNullParameter(strArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = other.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (comparator.compare(str, other[i]) == 0) {
                    arrayList.add(str);
                    break;
                }
                i++;
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static final w50.b a(final w50.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        return new w50.b() { // from class: com.yandex.mobile.ads.impl.g92$$ExternalSyntheticLambda1
            @Override // com.yandex.mobile.ads.impl.w50.b
            public final w50 a(nn nnVar) {
                w50 a2;
                a2 = g92.a(w50.this, nnVar);
                return a2;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w50 a(w50 this_asFactory, nn it) {
        Intrinsics.checkNotNullParameter(this_asFactory, "$this_asFactory");
        Intrinsics.checkNotNullParameter(it, "it");
        return this_asFactory;
    }

    public static final boolean a(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return e.matches(str);
    }

    static {
        byte[] bArr = new byte[0];
        f15568a = bArr;
        c = zq1.a.a(bArr);
        yp1.a.a(bArr);
        Options.Companion companion = Options.INSTANCE;
        ByteString.Companion companion2 = ByteString.INSTANCE;
        companion.of(companion2.decodeHex("efbbbf"), companion2.decodeHex("feff"), companion2.decodeHex("fffe"), companion2.decodeHex("0000ffff"), companion2.decodeHex("ffff0000"));
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        Intrinsics.checkNotNull(timeZone);
        d = timeZone;
        e = new Regex("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
        f = false;
        String name = fe1.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        g = StringsKt.removeSuffix(StringsKt.removePrefix(name, (CharSequence) "com.monetization.ads.embedded.okhttp.src.main.kotlin.okhttplib."), (CharSequence) "Client");
    }

    public static final int a(long j, TimeUnit timeUnit) {
        Intrinsics.checkNotNullParameter("timeout", "name");
        if (j < 0) {
            throw new IllegalStateException("timeout < 0".toString());
        }
        if (timeUnit != null) {
            long millis = timeUnit.toMillis(j);
            if (millis > 2147483647L) {
                throw new IllegalArgumentException("timeout too large.".toString());
            }
            if (millis != 0 || j <= 0) {
                return (int) millis;
            }
            throw new IllegalArgumentException("timeout too small.".toString());
        }
        throw new IllegalStateException("unit == null".toString());
    }

    public static final void a(Closeable closeable) {
        Intrinsics.checkNotNullParameter(closeable, "<this>");
        try {
            closeable.close();
        } catch (RuntimeException e2) {
            throw e2;
        } catch (Exception unused) {
        }
    }

    public static final <T> List<T> b(List<? extends T> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        List<T> unmodifiableList = Collections.unmodifiableList(CollectionsKt.toMutableList((Collection) list));
        Intrinsics.checkNotNullExpressionValue(unmodifiableList, "unmodifiableList(...)");
        return unmodifiableList;
    }

    public static final void a(Socket socket) {
        Intrinsics.checkNotNullParameter(socket, "<this>");
        try {
            socket.close();
        } catch (AssertionError e2) {
            throw e2;
        } catch (RuntimeException e3) {
            if (!Intrinsics.areEqual(e3.getMessage(), "bio == null")) {
                throw e3;
            }
        } catch (Exception unused) {
        }
    }

    public static final int a(int i, int i2, String str, String delimiters) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(delimiters, "delimiters");
        while (i < i2) {
            if (StringsKt.contains$default((CharSequence) delimiters, str.charAt(i), false, 2, (Object) null)) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static final int a(String str, char c2, int i, int i2) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        while (i < i2) {
            if (str.charAt(i) == c2) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static final String a(String format, Object... args) {
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(args, "args");
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        Locale locale = Locale.US;
        Object[] copyOf = Arrays.copyOf(args, args.length);
        String format2 = String.format(locale, format, Arrays.copyOf(copyOf, copyOf.length));
        Intrinsics.checkNotNullExpressionValue(format2, "format(...)");
        return format2;
    }

    public static final boolean a(String[] strArr, String[] strArr2, Comparator<? super String> comparator) {
        Intrinsics.checkNotNullParameter(strArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (strArr.length != 0 && strArr2 != null && strArr2.length != 0) {
            for (String str : strArr) {
                Iterator it = ArrayIteratorKt.iterator(strArr2);
                while (it.hasNext()) {
                    if (comparator.compare(str, (String) it.next()) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final long a(vq1 vq1Var) {
        Intrinsics.checkNotNullParameter(vq1Var, "<this>");
        String a2 = vq1Var.g().a("Content-Length");
        if (a2 != null) {
            Intrinsics.checkNotNullParameter(a2, "<this>");
            try {
                return Long.parseLong(a2);
            } catch (NumberFormatException unused) {
            }
        }
        return -1L;
    }

    @SafeVarargs
    public static final <T> List<T> a(T... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Object[] objArr = (Object[]) elements.clone();
        List<T> unmodifiableList = Collections.unmodifiableList(CollectionsKt.listOf(Arrays.copyOf(objArr, objArr.length)));
        Intrinsics.checkNotNullExpressionValue(unmodifiableList, "unmodifiableList(...)");
        return unmodifiableList;
    }

    public static final int a(int i, int i2, String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        while (i < i2) {
            char charAt = str.charAt(i);
            if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static final boolean a(Socket socket, BufferedSource source) {
        Intrinsics.checkNotNullParameter(socket, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        try {
            int soTimeout = socket.getSoTimeout();
            try {
                socket.setSoTimeout(1);
                return !source.exhausted();
            } finally {
                socket.setSoTimeout(soTimeout);
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    public static final int a(BufferedSource bufferedSource) throws IOException {
        Intrinsics.checkNotNullParameter(bufferedSource, "<this>");
        return (bufferedSource.readByte() & 255) | ((bufferedSource.readByte() & 255) << 16) | ((bufferedSource.readByte() & 255) << 8);
    }

    public static final int a(Buffer buffer) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        int i = 0;
        while (!buffer.exhausted() && buffer.getByte(0L) == 61) {
            i++;
            buffer.readByte();
        }
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0051, code lost:
    
        if (r5 == Long.MAX_VALUE) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0077, code lost:
    
        r11.timeout().deadlineNanoTime(r0 + r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x007f, code lost:
    
        return r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006f, code lost:
    
        r11.timeout().clearDeadline();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006d, code lost:
    
        if (r5 != Long.MAX_VALUE) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean a(okio.Source r11, int r12, java.util.concurrent.TimeUnit r13) throws java.io.IOException {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            java.lang.String r0 = "timeUnit"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            long r0 = java.lang.System.nanoTime()
            okio.Timeout r2 = r11.getThis$0()
            boolean r2 = r2.getHasDeadline()
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r2 == 0) goto L27
            okio.Timeout r2 = r11.getThis$0()
            long r5 = r2.deadlineNanoTime()
            long r5 = r5 - r0
            goto L28
        L27:
            r5 = r3
        L28:
            okio.Timeout r2 = r11.getThis$0()
            long r7 = (long) r12
            long r12 = r13.toNanos(r7)
            long r12 = java.lang.Math.min(r5, r12)
            long r12 = r12 + r0
            r2.deadlineNanoTime(r12)
            okio.Buffer r12 = new okio.Buffer     // Catch: java.lang.Throwable -> L54 java.io.InterruptedIOException -> L6a
            r12.<init>()     // Catch: java.lang.Throwable -> L54 java.io.InterruptedIOException -> L6a
        L3e:
            r7 = 8192(0x2000, double:4.0474E-320)
            long r7 = r11.read(r12, r7)     // Catch: java.lang.Throwable -> L54 java.io.InterruptedIOException -> L6a
            r9 = -1
            int r13 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r13 == 0) goto L4e
            r12.clear()     // Catch: java.lang.Throwable -> L54 java.io.InterruptedIOException -> L6a
            goto L3e
        L4e:
            int r12 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            r13 = 1
            if (r12 != 0) goto L77
            goto L6f
        L54:
            r12 = move-exception
            int r13 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r13 != 0) goto L61
            okio.Timeout r11 = r11.getThis$0()
            r11.clearDeadline()
            goto L69
        L61:
            okio.Timeout r11 = r11.getThis$0()
            long r0 = r0 + r5
            r11.deadlineNanoTime(r0)
        L69:
            throw r12
        L6a:
            int r12 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            r13 = 0
            if (r12 != 0) goto L77
        L6f:
            okio.Timeout r11 = r11.getThis$0()
            r11.clearDeadline()
            goto L7f
        L77:
            okio.Timeout r11 = r11.getThis$0()
            long r0 = r0 + r5
            r11.deadlineNanoTime(r0)
        L7f:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.g92.a(okio.Source, int, java.util.concurrent.TimeUnit):boolean");
    }

    public static final ThreadFactory a(final String name, final boolean z) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new ThreadFactory() { // from class: com.yandex.mobile.ads.impl.g92$$ExternalSyntheticLambda0
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                Thread a2;
                a2 = g92.a(name, z, runnable);
                return a2;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Thread a(String name, boolean z, Runnable runnable) {
        Intrinsics.checkNotNullParameter(name, "$name");
        Thread thread = new Thread(runnable, name);
        thread.setDaemon(z);
        return thread;
    }

    public static final qf0 a(List<lf0> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        qf0.a aVar = new qf0.a();
        for (lf0 lf0Var : list) {
            aVar.a(lf0Var.f16110a.utf8(), lf0Var.b.utf8());
        }
        return aVar.a();
    }

    public static final String a(gi0 gi0Var, boolean z) {
        String g2;
        Intrinsics.checkNotNullParameter(gi0Var, "<this>");
        if (StringsKt.contains$default((CharSequence) gi0Var.g(), (CharSequence) ":", false, 2, (Object) null)) {
            g2 = "[" + gi0Var.g() + "]";
        } else {
            g2 = gi0Var.g();
        }
        if (!z && gi0Var.i() == gi0.b.a(gi0Var.k())) {
            return g2;
        }
        return g2 + ":" + gi0Var.i();
    }

    public static final int a(int i, String str) {
        if (str == null) {
            return i;
        }
        try {
            long parseLong = Long.parseLong(str);
            if (parseLong > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            if (parseLong < 0) {
                return 0;
            }
            return (int) parseLong;
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    public static final Exception a(IOException iOException, List suppressed) {
        Intrinsics.checkNotNullParameter(iOException, "<this>");
        Intrinsics.checkNotNullParameter(suppressed, "suppressed");
        if (suppressed.size() > 1) {
            System.out.getClass();
        }
        Iterator it = suppressed.iterator();
        while (it.hasNext()) {
            ExceptionsKt.addSuppressed(iOException, (Exception) it.next());
        }
        return iOException;
    }

    public static final void a(BufferedSink bufferedSink, int i) throws IOException {
        Intrinsics.checkNotNullParameter(bufferedSink, "<this>");
        bufferedSink.writeByte((i >>> 16) & 255);
        bufferedSink.writeByte((i >>> 8) & 255);
        bufferedSink.writeByte(i & 255);
    }
}
