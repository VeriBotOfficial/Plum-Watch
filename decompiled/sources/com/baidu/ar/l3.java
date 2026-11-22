package com.baidu.ar;

import com.google.common.net.HttpHeaders;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.tensorflow.lite.schema.BuiltinOptions;

/* loaded from: classes12.dex */
public abstract class l3 {

    /* renamed from: a, reason: collision with root package name */
    public lb f7059a = null;

    /* JADX WARN: Code restructure failed: missing block: B:29:0x007e, code lost:
    
        if (r0 == null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0080, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0086, code lost:
    
        throw new com.baidu.ar.s7();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.baidu.ar.z4 a(java.nio.ByteBuffer r7, com.baidu.ar.lb r8) {
        /*
            java.lang.String r0 = b(r7)
            if (r0 == 0) goto L8d
            java.lang.String r1 = " "
            r2 = 3
            java.lang.String[] r1 = r0.split(r1, r2)
            int r3 = r1.length
            if (r3 != r2) goto L87
            com.baidu.ar.lb r2 = com.baidu.ar.lb.CLIENT
            if (r8 != r2) goto L19
            com.baidu.ar.z4 r8 = a(r1, r0)
            goto L1d
        L19:
            com.baidu.ar.z4 r8 = b(r1, r0)
        L1d:
            java.lang.String r0 = b(r7)
            if (r0 == 0) goto L7e
            int r1 = r0.length()
            if (r1 <= 0) goto L7e
            java.lang.String r1 = ":"
            r2 = 2
            java.lang.String[] r0 = r0.split(r1, r2)
            int r1 = r0.length
            if (r1 != r2) goto L76
            r1 = 0
            r2 = r0[r1]
            boolean r2 = r8.a(r2)
            java.lang.String r3 = ""
            java.lang.String r4 = "^ +"
            r5 = 1
            if (r2 == 0) goto L6a
            r2 = r0[r1]
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r1 = r0[r1]
            java.lang.String r1 = r8.c(r1)
            java.lang.StringBuilder r1 = r6.append(r1)
            java.lang.String r6 = "; "
            java.lang.StringBuilder r1 = r1.append(r6)
            r0 = r0[r5]
            java.lang.String r0 = r0.replaceFirst(r4, r3)
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r0 = r0.toString()
            r8.a(r2, r0)
            goto L1d
        L6a:
            r1 = r0[r1]
            r0 = r0[r5]
            java.lang.String r0 = r0.replaceFirst(r4, r3)
            r8.a(r1, r0)
            goto L1d
        L76:
            com.baidu.ar.w7 r7 = new com.baidu.ar.w7
            java.lang.String r8 = "not an http header"
            r7.<init>(r8)
            throw r7
        L7e:
            if (r0 == 0) goto L81
            return r8
        L81:
            com.baidu.ar.s7 r7 = new com.baidu.ar.s7
            r7.<init>()
            throw r7
        L87:
            com.baidu.ar.w7 r7 = new com.baidu.ar.w7
            r7.<init>()
            throw r7
        L8d:
            com.baidu.ar.s7 r8 = new com.baidu.ar.s7
            int r7 = r7.capacity()
            int r7 = r7 + 128
            r8.<init>(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baidu.ar.l3.a(java.nio.ByteBuffer, com.baidu.ar.lb):com.baidu.ar.z4");
    }

    public static z4 a(String[] strArr, String str) {
        if (!"101".equals(strArr[1])) {
            throw new w7(String.format("Invalid status code received: %s Status line: %s", strArr[1], str));
        }
        if (!"HTTP/1.1".equalsIgnoreCase(strArr[0])) {
            throw new w7(String.format("Invalid status line received: %s Status line: %s", strArr[0], str));
        }
        b5 b5Var = new b5();
        b5Var.a(Short.parseShort(strArr[1]));
        b5Var.d(strArr[2]);
        return b5Var;
    }

    public static ByteBuffer a(ByteBuffer byteBuffer) {
        ByteBuffer allocate = ByteBuffer.allocate(byteBuffer.remaining());
        byte b = BuiltinOptions.SliceOptions;
        while (byteBuffer.hasRemaining()) {
            byte b2 = byteBuffer.get();
            allocate.put(b2);
            if (b == 13 && b2 == 10) {
                allocate.limit(allocate.position() - 2);
                allocate.position(0);
                return allocate;
            }
            b = b2;
        }
        byteBuffer.position(byteBuffer.position() - allocate.position());
        return null;
    }

    public static z4 b(String[] strArr, String str) {
        if (!"GET".equalsIgnoreCase(strArr[0])) {
            throw new w7(String.format("Invalid request method received: %s Status line: %s", strArr[0], str));
        }
        if (!"HTTP/1.1".equalsIgnoreCase(strArr[2])) {
            throw new w7(String.format("Invalid status line received: %s Status line: %s", strArr[2], str));
        }
        a5 a5Var = new a5();
        a5Var.b(strArr[1]);
        return a5Var;
    }

    public static String b(ByteBuffer byteBuffer) {
        ByteBuffer a2 = a(byteBuffer);
        if (a2 == null) {
            return null;
        }
        return y1.a(a2.array(), 0, a2.limit());
    }

    public int a(int i) {
        if (i >= 0) {
            return i;
        }
        throw new t7(1002, "Negative count");
    }

    public abstract b2 a(b2 b2Var);

    public abstract c5 a(a2 a2Var);

    public abstract c5 a(a2 a2Var, pb pbVar);

    public abstract l3 a();

    public abstract z4 a(a2 a2Var, qb qbVar);

    public abstract ByteBuffer a(q4 q4Var);

    public List<ByteBuffer> a(d5 d5Var, boolean z) {
        StringBuilder append;
        String c;
        StringBuilder sb = new StringBuilder(100);
        if (d5Var instanceof a2) {
            append = sb.append("GET ").append(((a2) d5Var).a());
            c = " HTTP/1.1";
        } else {
            if (!(d5Var instanceof pb)) {
                throw new IllegalArgumentException("unknown role");
            }
            append = sb.append("HTTP/1.1 101 ");
            c = ((pb) d5Var).c();
        }
        append.append(c);
        sb.append("\r\n");
        Iterator<String> b = d5Var.b();
        while (b.hasNext()) {
            String next = b.next();
            String c2 = d5Var.c(next);
            sb.append(next);
            sb.append(": ");
            sb.append(c2);
            sb.append("\r\n");
        }
        sb.append("\r\n");
        byte[] a2 = y1.a(sb.toString());
        byte[] content = z ? d5Var.getContent() : null;
        ByteBuffer allocate = ByteBuffer.allocate((content == null ? 0 : content.length) + a2.length);
        allocate.put(a2);
        if (content != null) {
            allocate.put(content);
        }
        allocate.flip();
        return Collections.singletonList(allocate);
    }

    public abstract List<q4> a(String str, boolean z);

    public abstract List<q4> a(ByteBuffer byteBuffer, boolean z);

    public void a(lb lbVar) {
        this.f7059a = lbVar;
    }

    public abstract void a(we weVar, q4 q4Var);

    public boolean a(d5 d5Var) {
        return d5Var.c(HttpHeaders.UPGRADE).equalsIgnoreCase("websocket") && d5Var.c(HttpHeaders.CONNECTION).toLowerCase(Locale.ENGLISH).contains("upgrade");
    }

    public abstract d2 b();

    public List<ByteBuffer> b(d5 d5Var) {
        return a(d5Var, true);
    }

    public int c(d5 d5Var) {
        String c = d5Var.c(HttpHeaders.SEC_WEBSOCKET_VERSION);
        if (c.length() > 0) {
            try {
                return new Integer(c.trim()).intValue();
            } catch (NumberFormatException unused) {
            }
        }
        return -1;
    }

    public abstract List<q4> c(ByteBuffer byteBuffer);

    public abstract void c();

    public d5 d(ByteBuffer byteBuffer) {
        return a(byteBuffer, this.f7059a);
    }

    public String toString() {
        return getClass().getSimpleName();
    }
}
