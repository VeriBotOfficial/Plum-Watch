package com.anythink.core.common.s.a;

import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import com.anythink.core.common.s.a.b;
import com.anythink.core.common.s.a.e;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes12.dex */
public abstract class a implements SharedPreferences, SharedPreferences.Editor {

    /* renamed from: a, reason: collision with root package name */
    protected static final String f4308a = "both files error";
    protected static final String b = "parse dara failed";
    protected static final String c = "open file failed";
    protected static final String d = "map failed";
    protected static final String e = "miss cipher";
    protected static final String f = "Encrypt failed";
    static final String g = "truncate finish";
    static final String h = "gc finish";
    protected static final String i = ".kva";
    protected static final String j = ".kvb";
    protected static final String k = ".kvc";
    protected static final String l = ".tmp";
    protected static final int m = 268435456;
    protected static final int n = 1073741824;
    protected static final int p = 12;
    protected static final int r;
    protected static final int s;
    protected static final int t = 8192;
    protected static final int u = 80;
    protected int A;
    protected long B;
    protected f E;
    protected int F;
    protected int G;
    protected String K;
    protected int P;
    protected final String v;
    protected final String w;
    protected final Map<String, com.anythink.core.common.s.a.a.b> x;
    protected final com.anythink.core.common.s.a.a.a z;
    private static final byte[] S = new byte[0];
    protected static final int[] o = {0, 1, 4, 4, 8, 8};

    /* renamed from: q, reason: collision with root package name */
    protected final int f4309q = h.c;
    protected final com.anythink.core.common.s.a.a.c y = h.f4318a;
    protected final HashMap<String, b.AbstractC0214b> C = new HashMap<>();
    protected volatile boolean D = false;
    protected final List<String> H = new ArrayList();
    protected boolean I = false;
    protected boolean J = false;
    protected final m L = new m();
    protected final m M = new m();
    protected final e N = new e();
    protected final Executor O = new i();
    protected final ArrayList<C0213a> Q = new ArrayList<>();
    protected final ArrayList<SharedPreferences.OnSharedPreferenceChangeListener> R = new ArrayList<>();
    private final Handler T = new Handler(Looper.getMainLooper());

    protected static long a(long j2, int i2) {
        int i3 = (i2 & 7) << 3;
        return (j2 >>> (64 - i3)) | (j2 << i3);
    }

    protected static boolean b(int i2) {
        return (i2 & 1073741824) != 0;
    }

    private static int e(int i2) {
        return i2 & (-1073741825);
    }

    protected abstract void a(byte b2, int i2);

    protected abstract void a(int i2, int i3, int i4);

    protected abstract void a(int i2, long j2, int i3);

    protected abstract void a(long j2, long j3, int i2);

    protected abstract void a(g gVar);

    protected abstract void d(int i2);

    @Override // android.content.SharedPreferences
    public SharedPreferences.Editor edit() {
        return this;
    }

    protected abstract void f(String str);

    protected void g() {
    }

    protected abstract void g(String str);

    protected abstract void h();

    protected abstract void i();

    static {
        int b2 = l.b();
        r = b2;
        s = Math.max(b2, 32768);
    }

    protected a(String str, String str2, com.anythink.core.common.s.a.a.b[] bVarArr, com.anythink.core.common.s.a.a.a aVar) {
        this.v = str;
        this.w = str2;
        this.z = aVar;
        HashMap hashMap = new HashMap();
        if (bVarArr != null) {
            for (com.anythink.core.common.s.a.a.b bVar : bVarArr) {
                String a2 = bVar.a();
                if (hashMap.containsKey(a2)) {
                    b("duplicate encoder tag:".concat(String.valueOf(a2)));
                } else {
                    hashMap.put(a2, bVar);
                }
            }
        }
        hashMap.put("StringSet", k.f4324a);
        this.x = hashMap;
    }

    protected final int a(int i2) {
        return this.z == null ? i2 : i2 | 1073741824;
    }

    protected static int a(int i2, int i3) {
        if (i3 >= 268435456) {
            throw new IllegalStateException("data size out of limit");
        }
        int i4 = r;
        if (i3 <= i4) {
            return i4;
        }
        while (i2 < i3) {
            i2 <<= 1;
        }
        return i2;
    }

    protected final void a() {
        com.anythink.core.common.s.a.a.b[] bVarArr = (com.anythink.core.common.s.a.a.b[]) this.x.values().toArray(new com.anythink.core.common.s.a.a.b[this.x.size()]);
        String str = "temp_" + this.w;
        g gVar = new g(this.v, str, bVarArr, this.z, 2);
        gVar.V = false;
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, b.AbstractC0214b> entry : this.C.entrySet()) {
            String key = entry.getKey();
            b.AbstractC0214b value = entry.getValue();
            if (value instanceof b.i) {
                b.i iVar = (b.i) value;
                if (iVar.f) {
                    arrayList.add((String) iVar.c);
                    String a2 = a(iVar, (com.anythink.core.common.s.a.a.a) null);
                    if (a2 != null) {
                        gVar.putString(key, a2);
                    }
                } else {
                    gVar.putString(key, (String) iVar.c);
                }
            } else if (value instanceof b.c) {
                gVar.putBoolean(key, ((b.c) value).b);
            } else if (value instanceof b.f) {
                gVar.putInt(key, ((b.f) value).b);
            } else if (value instanceof b.g) {
                gVar.putLong(key, ((b.g) value).b);
            } else if (value instanceof b.e) {
                gVar.putFloat(key, ((b.e) value).b);
            } else if (value instanceof b.d) {
                gVar.b(key, ((b.d) value).b);
            } else if (value instanceof b.a) {
                b.a aVar = (b.a) value;
                if (aVar.f) {
                    arrayList.add((String) aVar.c);
                    byte[] a3 = a(aVar, (com.anythink.core.common.s.a.a.a) null);
                    if (a3 != null) {
                        gVar.a(key, a3);
                    }
                } else {
                    gVar.a(key, (byte[]) aVar.c);
                }
            } else if (value instanceof b.h) {
                b.h hVar = (b.h) value;
                if (hVar.f) {
                    arrayList.add((String) hVar.c);
                    Object a4 = a(hVar, (com.anythink.core.common.s.a.a.a) null);
                    if (a4 != null && hVar.b != null) {
                        gVar.a(key, (String) a4, (com.anythink.core.common.s.a.a.b<String>) hVar.b);
                    }
                } else if (hVar.b != null) {
                    gVar.a(key, (String) hVar.c, (com.anythink.core.common.s.a.a.b<String>) hVar.b);
                }
            }
        }
        gVar.contains("");
        this.E = gVar.E;
        this.B = gVar.B;
        this.A = gVar.A;
        e();
        this.C.clear();
        this.C.putAll(gVar.C);
        a(gVar);
        while (gVar.N.a()) {
            try {
                Thread.sleep(10L);
            } catch (Exception unused) {
            }
        }
        File file = new File(this.v, str);
        String str2 = this.v + this.w;
        l.a(file, str2);
        l.c(file);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            l.c(new File(str2, (String) it.next()));
        }
        this.I = false;
    }

    protected final boolean a(File file) {
        f fVar;
        long length = file.length();
        if (length != 0 && length < 268435456) {
            int i2 = (int) length;
            int a2 = a(r, i2);
            f fVar2 = this.E;
            if (fVar2 != null && fVar2.f4316a.length == a2) {
                fVar = this.E;
                fVar.b = 0;
            } else {
                f fVar3 = new f(new byte[a2]);
                this.E = fVar3;
                fVar = fVar3;
            }
            l.a(file, fVar.f4316a, i2);
            int c2 = fVar.c();
            if (c2 < 0) {
                return false;
            }
            int i3 = (-1073741825) & c2;
            boolean b2 = b(c2);
            long d2 = fVar.d();
            this.A = i3 + 12;
            if (i3 >= 0 && i3 <= i2 - 12 && d2 == fVar.b(12, i3) && a(b2)) {
                this.B = d2;
                return true;
            }
        }
        return false;
    }

    protected final void a(final String str) {
        h.a().execute(new Runnable() { // from class: com.anythink.core.common.s.a.a$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                a.this.q(str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void q(String str) {
        if (this.N.a(str)) {
            return;
        }
        l.c(new File(this.v + this.w, str));
    }

    protected final void b() {
        try {
            l.c(new File(this.v, this.w + k));
            l.c(new File(this.v, this.w + ".tmp"));
        } catch (Exception e2) {
            a(e2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:128:0x01da, code lost:
    
        throw new java.lang.Exception(com.anythink.core.common.s.a.a.b);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final boolean a(boolean r18) {
        /*
            Method dump skipped, instructions count: 507
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.core.common.s.a.a.a(boolean):boolean");
    }

    private void a(int i2, String str, int i3, int i4, com.anythink.core.common.s.a.a.a aVar) {
        int length;
        f fVar;
        if (aVar == null) {
            fVar = this.E;
            length = i2;
        } else {
            System.arraycopy(this.E.f4316a, this.E.b, new byte[i2], 0, i2);
            byte[] b2 = aVar.b();
            f fVar2 = new f(b2);
            length = b2.length;
            fVar = fVar2;
        }
        int a2 = fVar.a() & 255;
        String d2 = fVar.d(a2);
        com.anythink.core.common.s.a.a.b bVar = this.x.get(d2);
        int i5 = length - (a2 + 1);
        if (i5 < 0) {
            throw new Exception(b);
        }
        if (bVar != null) {
            try {
                b.h hVar = new b.h(i3, i4 + 2, bVar.a(fVar.f4316a, fVar.b, i5), i2, false);
                hVar.b = bVar;
                this.C.put(str, hVar);
                return;
            } catch (Exception e2) {
                a(e2);
                return;
            }
        }
        b("object with tag: " + d2 + " without encoder");
    }

    private static void h(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("key is empty");
        }
    }

    private static void f(int i2) {
        if (i2 > 255) {
            throw new IllegalArgumentException("key's length must less than 256");
        }
    }

    /* renamed from: com.anythink.core.common.s.a.a$a, reason: collision with other inner class name */
    protected static class C0213a implements Comparable<C0213a> {

        /* renamed from: a, reason: collision with root package name */
        int f4310a;
        int b;

        @Override // java.lang.Comparable
        public final /* bridge */ /* synthetic */ int compareTo(C0213a c0213a) {
            return this.f4310a - c0213a.f4310a;
        }

        C0213a(int i, int i2) {
            this.f4310a = i;
            this.b = i2;
        }

        private int a(C0213a c0213a) {
            return this.f4310a - c0213a.f4310a;
        }
    }

    private static void a(ArrayList<C0213a> arrayList) {
        Collections.sort(arrayList);
        int i2 = 0;
        C0213a c0213a = arrayList.get(0);
        int size = arrayList.size();
        for (int i3 = 1; i3 < size; i3++) {
            C0213a c0213a2 = arrayList.get(i3);
            if (c0213a2.f4310a == c0213a.b) {
                c0213a.b = c0213a2.b;
            } else {
                i2++;
                if (i2 != i3) {
                    arrayList.set(i2, c0213a2);
                }
                c0213a = c0213a2;
            }
        }
        int i4 = i2 + 1;
        if (size > i4) {
            arrayList.subList(i4, size).clear();
        }
    }

    protected final void c(int i2) {
        ArrayList<C0213a> arrayList = this.Q;
        Collections.sort(arrayList);
        C0213a c0213a = arrayList.get(0);
        int size = arrayList.size();
        boolean z = true;
        int i3 = 0;
        for (int i4 = 1; i4 < size; i4++) {
            C0213a c0213a2 = arrayList.get(i4);
            if (c0213a2.f4310a == c0213a.b) {
                c0213a.b = c0213a2.b;
            } else {
                i3++;
                if (i3 != i4) {
                    arrayList.set(i3, c0213a2);
                }
                c0213a = c0213a2;
            }
        }
        int i5 = i3 + 1;
        if (size > i5) {
            arrayList.subList(i5, size).clear();
        }
        C0213a c0213a3 = this.Q.get(0);
        int i6 = c0213a3.f4310a;
        int i7 = this.A;
        int i8 = i7 - this.P;
        int i9 = i8 - 12;
        int i10 = i8 - i6;
        int i11 = i7 - i6;
        boolean z2 = i9 < i11 + i10;
        if (!z2) {
            this.B ^= this.E.b(i6, i11);
        }
        int size2 = this.Q.size();
        int i12 = size2 - 1;
        int i13 = this.A - this.Q.get(i12).b;
        int i14 = i13 > 0 ? size2 : i12;
        int[] iArr = new int[i14];
        int[] iArr2 = new int[i14];
        int i15 = c0213a3.f4310a;
        int i16 = c0213a3.b;
        int i17 = 1;
        while (i17 < size2) {
            boolean z3 = z;
            C0213a c0213a4 = this.Q.get(i17);
            int i18 = i17;
            int i19 = c0213a4.f4310a - i16;
            int i20 = size2;
            System.arraycopy(this.E.f4316a, i16, this.E.f4316a, i15, i19);
            int i21 = i18 - 1;
            iArr[i21] = i16;
            iArr2[i21] = i16 - i15;
            i15 += i19;
            i16 = c0213a4.b;
            i17 = i18 + 1;
            z = z3;
            size2 = i20;
            z2 = z2;
        }
        boolean z4 = z2;
        if (i13 > 0) {
            System.arraycopy(this.E.f4316a, i16, this.E.f4316a, i15, i13);
            iArr[i12] = i16;
            iArr2[i12] = i16 - i15;
        }
        e();
        if (z4) {
            this.B = this.E.b(12, i9);
        } else {
            this.B ^= this.E.b(i6, i10);
        }
        this.A = i8;
        a(i6, i2, i10);
        for (b.AbstractC0214b abstractC0214b : this.C.values()) {
            if (abstractC0214b.f4311a > i6) {
                int i22 = abstractC0214b.f4311a;
                int i23 = i14 - 1;
                int i24 = 0;
                while (true) {
                    if (i24 > i23) {
                        break;
                    }
                    int i25 = (i24 + i23) >>> 1;
                    int i26 = iArr[i25];
                    if (i26 >= i22) {
                        if (i26 <= i22) {
                            i23 = i25;
                            break;
                        }
                        i23 = i25 - 1;
                    } else {
                        i24 = i25 + 1;
                    }
                }
                int i27 = iArr2[i23];
                abstractC0214b.f4311a -= i27;
                if (abstractC0214b.a() >= 6) {
                    ((b.j) abstractC0214b).d -= i27;
                }
            }
        }
        c(h);
    }

    private void a(int i2, int[] iArr, int[] iArr2) {
        for (b.AbstractC0214b abstractC0214b : this.C.values()) {
            if (abstractC0214b.f4311a > i2) {
                int i3 = abstractC0214b.f4311a;
                int length = iArr.length - 1;
                int i4 = 0;
                while (true) {
                    if (i4 > length) {
                        break;
                    }
                    int i5 = (i4 + length) >>> 1;
                    int i6 = iArr[i5];
                    if (i6 >= i3) {
                        if (i6 <= i3) {
                            length = i5;
                            break;
                        }
                        length = i5 - 1;
                    } else {
                        i4 = i5 + 1;
                    }
                }
                int i7 = iArr2[length];
                abstractC0214b.f4311a -= i7;
                if (abstractC0214b.a() >= 6) {
                    ((b.j) abstractC0214b).d -= i7;
                }
            }
        }
    }

    protected final void a(File file, File file2) {
        try {
            if (a(file)) {
                return;
            }
        } catch (IOException e2) {
            b(e2);
        }
        c();
        try {
            if (a(file2)) {
                return;
            }
        } catch (IOException e3) {
            b(e3);
        }
        c();
    }

    protected final void c() {
        d();
        j();
    }

    protected void d() {
        this.A = 12;
        this.B = 0L;
        this.C.clear();
        this.M.a();
        this.L.a();
        e();
    }

    private void j() {
        f fVar = this.E;
        if (fVar == null || fVar.f4316a.length != r) {
            this.E = new f(r);
        } else {
            this.E.a(4, 0L);
        }
        this.E.a(0, a(0));
    }

    private void b(int i2, int i3) {
        this.P += i3 - i2;
        this.Q.add(new C0213a(i2, i3));
    }

    protected final void e() {
        this.P = 0;
        this.Q.clear();
    }

    protected final void b(String str) {
        com.anythink.core.common.s.a.a.c cVar = this.y;
        if (cVar != null) {
            cVar.b(this.w, new Exception(str));
        }
    }

    protected final void a(Exception exc) {
        com.anythink.core.common.s.a.a.c cVar = this.y;
        if (cVar != null) {
            cVar.b(this.w, exc);
        }
    }

    protected final void b(Exception exc) {
        com.anythink.core.common.s.a.a.c cVar = this.y;
        if (cVar != null) {
            cVar.a(this.w, exc);
        }
    }

    protected final void c(String str) {
        com.anythink.core.common.s.a.a.c cVar = this.y;
        if (cVar != null) {
            cVar.a(this.w, str);
        }
    }

    protected final int f() {
        return this.A <= 16384 ? 8192 : 16384;
    }

    @Override // android.content.SharedPreferences
    public synchronized boolean contains(String str) {
        return this.C.containsKey(str);
    }

    private synchronized boolean i(String str) {
        return getBoolean(str, false);
    }

    @Override // android.content.SharedPreferences
    public synchronized boolean getBoolean(String str, boolean z) {
        b.AbstractC0214b abstractC0214b = this.C.get(str);
        if (abstractC0214b != null && abstractC0214b.a() == 1) {
            return ((b.c) abstractC0214b).b;
        }
        return z;
    }

    private int j(String str) {
        return getInt(str, 0);
    }

    @Override // android.content.SharedPreferences
    public synchronized int getInt(String str, int i2) {
        b.AbstractC0214b abstractC0214b = this.C.get(str);
        if (abstractC0214b != null && abstractC0214b.a() == 2) {
            return ((b.f) abstractC0214b).b;
        }
        return i2;
    }

    private float k(String str) {
        return getFloat(str, 0.0f);
    }

    @Override // android.content.SharedPreferences
    public synchronized float getFloat(String str, float f2) {
        b.AbstractC0214b abstractC0214b = this.C.get(str);
        if (abstractC0214b != null && abstractC0214b.a() == 3) {
            return ((b.e) abstractC0214b).b;
        }
        return f2;
    }

    private long l(String str) {
        return getLong(str, 0L);
    }

    @Override // android.content.SharedPreferences
    public synchronized long getLong(String str, long j2) {
        b.AbstractC0214b abstractC0214b = this.C.get(str);
        if (abstractC0214b != null && abstractC0214b.a() == 4) {
            return ((b.g) abstractC0214b).b;
        }
        return j2;
    }

    private double m(String str) {
        return a(str, 0.0d);
    }

    public final synchronized double a(String str, double d2) {
        b.AbstractC0214b abstractC0214b = this.C.get(str);
        if (abstractC0214b != null && abstractC0214b.a() == 5) {
            return ((b.d) abstractC0214b).b;
        }
        return d2;
    }

    private String n(String str) {
        return getString(str, "");
    }

    @Override // android.content.SharedPreferences
    public synchronized String getString(String str, String str2) {
        b.AbstractC0214b abstractC0214b = this.C.get(str);
        if (abstractC0214b != null && abstractC0214b.a() == 6) {
            b.i iVar = (b.i) abstractC0214b;
            if (iVar.f) {
                Object a2 = this.M.a(str);
                if (a2 instanceof String) {
                    return (String) a2;
                }
                String a3 = a(iVar, this.z);
                if (a3 != null && !a3.isEmpty()) {
                    this.M.a(str, a3);
                    return a3;
                }
                remove(str);
                return str2;
            }
            return (String) iVar.c;
        }
        return str2;
    }

    private String a(b.i iVar, com.anythink.core.common.s.a.a.a aVar) {
        String str = (String) iVar.c;
        byte[] bArr = (byte[]) this.L.a(str);
        if (bArr == null) {
            try {
                bArr = l.b(new File(this.v + this.w, str));
            } catch (Exception e2) {
                a(e2);
            }
        }
        if (bArr != null) {
            if (aVar != null) {
                bArr = aVar.b();
            }
            if (bArr != null) {
                return new String(bArr, StandardCharsets.UTF_8);
            }
            return null;
        }
        return null;
    }

    private byte[] o(String str) {
        return b(str, S);
    }

    private synchronized byte[] b(String str, byte[] bArr) {
        b.AbstractC0214b abstractC0214b = this.C.get(str);
        if (abstractC0214b != null && abstractC0214b.a() == 7) {
            b.a aVar = (b.a) abstractC0214b;
            if (aVar.f) {
                Object a2 = this.M.a(str);
                if (a2 instanceof byte[]) {
                    return (byte[]) a2;
                }
                byte[] a3 = a(aVar, this.z);
                if (a3 != null && a3.length != 0) {
                    this.M.a(str, a3);
                    return a3;
                }
                remove(str);
                return bArr;
            }
            return (byte[]) aVar.c;
        }
        return bArr;
    }

    private byte[] a(b.a aVar, com.anythink.core.common.s.a.a.a aVar2) {
        String str = (String) aVar.c;
        byte[] bArr = (byte[]) this.L.a(str);
        if (bArr == null) {
            try {
                bArr = l.b(new File(this.v + this.w, str));
            } catch (Exception e2) {
                a(e2);
                return null;
            }
        }
        if (bArr != null) {
            return aVar2 != null ? aVar2.b() : bArr;
        }
        return null;
    }

    public final synchronized <T> T d(String str) {
        b.AbstractC0214b abstractC0214b = this.C.get(str);
        if (abstractC0214b != null && abstractC0214b.a() == 8) {
            b.h hVar = (b.h) abstractC0214b;
            if (hVar.f) {
                T t2 = (T) this.M.a(str);
                if (t2 != null) {
                    return t2;
                }
                T t3 = (T) a(hVar, this.z);
                if (t3 == null) {
                    remove(str);
                    return null;
                }
                this.M.a(str, t3);
                return t3;
            }
            return (T) hVar.c;
        }
        return null;
    }

    private Object a(b.h hVar, com.anythink.core.common.s.a.a.a aVar) {
        String str = (String) hVar.c;
        byte[] bArr = (byte[]) this.L.a(str);
        if (bArr == null) {
            try {
                bArr = l.b(new File(this.v + this.w, str));
            } catch (Exception e2) {
                a(e2);
                return null;
            }
        }
        if (bArr != null) {
            if (aVar != null) {
                bArr = aVar.b();
            }
            int i2 = bArr[0] & 255;
            String a2 = this.E.a(bArr, 1, i2);
            com.anythink.core.common.s.a.a.b bVar = this.x.get(a2);
            if (bVar != null) {
                hVar.b = bVar;
                int i3 = i2 + 1;
                return bVar.a(bArr, i3, bArr.length - i3);
            }
            b(new Exception("No encoder for tag:".concat(String.valueOf(a2))));
            return null;
        }
        b(new Exception("Read object data failed"));
        return null;
    }

    private synchronized Set<String> p(String str) {
        return (Set) d(str);
    }

    @Override // android.content.SharedPreferences
    public Set<String> getStringSet(String str, Set<String> set) {
        Set<String> p2 = p(str);
        return p2 != null ? p2 : set;
    }

    @Override // android.content.SharedPreferences.Editor
    public synchronized SharedPreferences.Editor putBoolean(String str, boolean z) {
        if (this.J) {
            return this;
        }
        h(str);
        g();
        b.AbstractC0214b abstractC0214b = this.C.get(str);
        if (abstractC0214b != null && abstractC0214b.a() != 1) {
            remove(str);
            abstractC0214b = null;
        }
        b.c cVar = (b.c) abstractC0214b;
        if (cVar == null) {
            if (!a(str, (byte) 1)) {
                return this;
            }
            int i2 = this.E.b;
            this.E.a(z ? (byte) 1 : (byte) 0);
            i();
            this.C.put(str, new b.c(i2, z));
            f(str);
        } else if (cVar.b != z) {
            cVar.b = z;
            a(z ? (byte) 1 : (byte) 0, cVar.f4311a);
            f(str);
        }
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public synchronized SharedPreferences.Editor putInt(String str, int i2) {
        if (this.J) {
            return this;
        }
        h(str);
        g();
        b.AbstractC0214b abstractC0214b = this.C.get(str);
        if (abstractC0214b != null && abstractC0214b.a() != 2) {
            remove(str);
            abstractC0214b = null;
        }
        b.f fVar = (b.f) abstractC0214b;
        if (fVar == null) {
            if (!a(str, (byte) 2)) {
                return this;
            }
            int i3 = this.E.b;
            f fVar2 = this.E;
            com.anythink.core.common.s.a.a.a aVar = this.z;
            fVar2.b(aVar != null ? aVar.c() : i2);
            i();
            this.C.put(str, new b.f(i3, i2));
            f(str);
        } else if (fVar.b != i2) {
            com.anythink.core.common.s.a.a.a aVar2 = this.z;
            int c2 = aVar2 != null ? aVar2.c() : i2;
            long a2 = ((this.z != null ? this.E.a(fVar.f4311a) : fVar.b) ^ c2) & BodyPartID.bodyIdMax;
            fVar.b = i2;
            a(c2, a2, fVar.f4311a);
            f(str);
        }
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public synchronized SharedPreferences.Editor putFloat(String str, float f2) {
        if (this.J) {
            return this;
        }
        h(str);
        g();
        b.AbstractC0214b abstractC0214b = this.C.get(str);
        if (abstractC0214b != null && abstractC0214b.a() != 3) {
            remove(str);
            abstractC0214b = null;
        }
        b.e eVar = (b.e) abstractC0214b;
        if (eVar == null) {
            if (!a(str, (byte) 3)) {
                return this;
            }
            int i2 = this.E.b;
            this.E.b(a(f2));
            i();
            this.C.put(str, new b.e(i2, f2));
            f(str);
        } else if (eVar.b != f2) {
            int a2 = a(f2);
            long a3 = (this.E.a(eVar.f4311a) ^ a2) & BodyPartID.bodyIdMax;
            eVar.b = f2;
            a(a2, a3, eVar.f4311a);
            f(str);
        }
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public synchronized SharedPreferences.Editor putLong(String str, long j2) {
        Throwable th;
        a aVar;
        try {
            try {
                if (this.J) {
                    return this;
                }
                h(str);
                g();
                b.AbstractC0214b abstractC0214b = this.C.get(str);
                if (abstractC0214b != null) {
                    try {
                        if (abstractC0214b.a() != 4) {
                            remove(str);
                            abstractC0214b = null;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                }
                b.g gVar = (b.g) abstractC0214b;
                if (gVar == null) {
                    if (!a(str, (byte) 4)) {
                        return this;
                    }
                    int i2 = this.E.b;
                    f fVar = this.E;
                    com.anythink.core.common.s.a.a.a aVar2 = this.z;
                    fVar.a(aVar2 != null ? aVar2.e() : j2);
                    i();
                    this.C.put(str, new b.g(i2, j2));
                    f(str);
                } else if (gVar.b != j2) {
                    com.anythink.core.common.s.a.a.a aVar3 = this.z;
                    long e2 = aVar3 != null ? aVar3.e() : j2;
                    long c2 = (this.z != null ? this.E.c(gVar.f4311a) : gVar.b) ^ e2;
                    gVar.b = j2;
                    aVar = this;
                    aVar.a(e2, c2, gVar.f4311a);
                    f(str);
                    return aVar;
                }
                aVar = this;
                return aVar;
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    public final synchronized SharedPreferences.Editor b(String str, double d2) {
        Throwable th;
        a aVar;
        try {
            try {
                if (this.J) {
                    return this;
                }
                h(str);
                g();
                b.AbstractC0214b abstractC0214b = this.C.get(str);
                if (abstractC0214b != null) {
                    try {
                        if (abstractC0214b.a() != 5) {
                            remove(str);
                            abstractC0214b = null;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                }
                b.d dVar = (b.d) abstractC0214b;
                if (dVar == null) {
                    if (!a(str, (byte) 5)) {
                        return this;
                    }
                    int i2 = this.E.b;
                    this.E.a(a(d2));
                    i();
                    this.C.put(str, new b.d(i2, d2));
                    f(str);
                } else if (dVar.b != d2) {
                    long a2 = a(d2);
                    long c2 = a2 ^ this.E.c(dVar.f4311a);
                    dVar.b = d2;
                    aVar = this;
                    aVar.a(a2, c2, dVar.f4311a);
                    f(str);
                    return aVar;
                }
                aVar = this;
                return aVar;
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    @Override // android.content.SharedPreferences.Editor
    public synchronized SharedPreferences.Editor putString(String str, String str2) {
        if (this.J) {
            return this;
        }
        h(str);
        if (str2 == null) {
            remove(str);
        } else {
            b.AbstractC0214b abstractC0214b = this.C.get(str);
            if (abstractC0214b != null && abstractC0214b.a() != 6) {
                remove(str);
                abstractC0214b = null;
            }
            b.i iVar = (b.i) abstractC0214b;
            if (iVar != null && !iVar.f && str2.equals(iVar.c)) {
                return this;
            }
            g();
            if (this.z != null || str2.length() * 3 >= this.f4309q) {
                byte[] bytes = str2.isEmpty() ? S : str2.getBytes(StandardCharsets.UTF_8);
                com.anythink.core.common.s.a.a.a aVar = this.z;
                if (aVar != null) {
                    bytes = aVar.a();
                }
                byte[] bArr = bytes;
                if (bArr == null) {
                    a(new Exception(f));
                    return this;
                }
                a(str, str2, bArr, iVar, (byte) 6);
            } else {
                int b2 = f.b(str2);
                if (iVar == null) {
                    int b3 = f.b(str);
                    f(b3);
                    int i2 = b3 + 4;
                    this.G = i2 + b2;
                    k();
                    this.E.a((byte) 6);
                    a(str, b3);
                    b(str2, b2);
                    HashMap<String, b.AbstractC0214b> hashMap = this.C;
                    int i3 = this.F;
                    hashMap.put(str, new b.i(i3, i3 + i2, str2, b2, false));
                    i();
                } else {
                    int i4 = iVar.f4311a - iVar.d;
                    boolean z = false;
                    if (iVar.e == b2) {
                        this.B ^= this.E.b(iVar.f4311a, iVar.e);
                        if (b2 == str2.length()) {
                            str2.getBytes(0, b2, this.E.f4316a, iVar.f4311a);
                        } else {
                            this.E.b = iVar.f4311a;
                            this.E.a(str2);
                        }
                        this.F = iVar.f4311a;
                        this.G = b2;
                    } else {
                        this.G = i4 + b2;
                        k();
                        this.E.a((byte) 6);
                        int i5 = i4 - 3;
                        System.arraycopy(this.E.f4316a, iVar.d + 1, this.E.f4316a, this.E.b, i5);
                        this.E.b += i5;
                        b(str2, b2);
                        a((byte) 6, iVar.d, iVar.f4311a + iVar.e);
                        r1 = iVar.f ? (String) iVar.c : null;
                        iVar.f = false;
                        iVar.d = this.F;
                        iVar.f4311a = this.F + i4;
                        iVar.e = b2;
                        z = true;
                    }
                    iVar.c = str2;
                    i();
                    if (z) {
                        h();
                    }
                    if (r1 != null) {
                        g(r1);
                    }
                }
            }
            f(str);
        }
        return this;
    }

    private void a(String str, String str2, b.i iVar) {
        int b2 = f.b(str2);
        if (iVar == null) {
            int b3 = f.b(str);
            f(b3);
            int i2 = b3 + 4;
            this.G = i2 + b2;
            k();
            this.E.a((byte) 6);
            a(str, b3);
            b(str2, b2);
            HashMap<String, b.AbstractC0214b> hashMap = this.C;
            int i3 = this.F;
            hashMap.put(str, new b.i(i3, i2 + i3, str2, b2, false));
            i();
            return;
        }
        int i4 = iVar.f4311a - iVar.d;
        boolean z = false;
        if (iVar.e == b2) {
            this.B ^= this.E.b(iVar.f4311a, iVar.e);
            if (b2 == str2.length()) {
                str2.getBytes(0, b2, this.E.f4316a, iVar.f4311a);
            } else {
                this.E.b = iVar.f4311a;
                this.E.a(str2);
            }
            this.F = iVar.f4311a;
            this.G = b2;
        } else {
            this.G = i4 + b2;
            k();
            this.E.a((byte) 6);
            int i5 = i4 - 3;
            System.arraycopy(this.E.f4316a, iVar.d + 1, this.E.f4316a, this.E.b, i5);
            this.E.b += i5;
            b(str2, b2);
            a((byte) 6, iVar.d, iVar.f4311a + iVar.e);
            r1 = iVar.f ? (String) iVar.c : null;
            iVar.f = false;
            iVar.d = this.F;
            iVar.f4311a = this.F + i4;
            iVar.e = b2;
            z = true;
        }
        iVar.c = str2;
        i();
        if (z) {
            h();
        }
        if (r1 != null) {
            g(r1);
        }
    }

    public final synchronized SharedPreferences.Editor a(String str, byte[] bArr) {
        Throwable th;
        a aVar;
        try {
            try {
                if (this.J) {
                    return this;
                }
                h(str);
                try {
                    if (bArr == null) {
                        remove(str);
                        aVar = this;
                    } else {
                        g();
                        b.AbstractC0214b abstractC0214b = this.C.get(str);
                        b.AbstractC0214b abstractC0214b2 = abstractC0214b;
                        if (abstractC0214b != null) {
                            byte a2 = abstractC0214b.a();
                            abstractC0214b2 = abstractC0214b;
                            if (a2 != 7) {
                                remove(str);
                                abstractC0214b2 = null;
                            }
                        }
                        b.a aVar2 = (b.a) abstractC0214b2;
                        com.anythink.core.common.s.a.a.a aVar3 = this.z;
                        byte[] a3 = aVar3 != null ? aVar3.a() : bArr;
                        if (a3 == null) {
                            a(new Exception(f));
                            return this;
                        }
                        aVar = this;
                        aVar.a(str, bArr, a3, aVar2, (byte) 7);
                        f(str);
                    }
                    return aVar;
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    public final synchronized <T> SharedPreferences.Editor a(String str, T t2, com.anythink.core.common.s.a.a.b<T> bVar) {
        Throwable th;
        byte[] bArr;
        try {
            try {
                if (this.J) {
                    return this;
                }
                h(str);
                if (bVar == null) {
                    throw new IllegalArgumentException("Encoder is null");
                }
                String a2 = bVar.a();
                if (a2.isEmpty() || a2.length() > 50) {
                    throw new IllegalArgumentException("Invalid encoder tag:".concat(String.valueOf(a2)));
                }
                if (!this.x.containsKey(a2)) {
                    throw new IllegalArgumentException("Encoder hasn't been registered");
                }
                try {
                    if (t2 == null) {
                        remove(str);
                        return this;
                    }
                    b.AbstractC0214b abstractC0214b = null;
                    try {
                        bArr = bVar.a(t2);
                    } catch (Exception e2) {
                        a(e2);
                        bArr = null;
                    }
                    if (bArr == null) {
                        remove(str);
                        return this;
                    }
                    g();
                    b.AbstractC0214b abstractC0214b2 = this.C.get(str);
                    if (abstractC0214b2 == null || abstractC0214b2.a() == 8) {
                        abstractC0214b = abstractC0214b2;
                    } else {
                        remove(str);
                    }
                    b.h hVar = (b.h) abstractC0214b;
                    int b2 = f.b(a2);
                    f fVar = new f(b2 + 1 + bArr.length);
                    fVar.a((byte) b2);
                    fVar.a(a2);
                    fVar.a(bArr);
                    byte[] bArr2 = fVar.f4316a;
                    com.anythink.core.common.s.a.a.a aVar = this.z;
                    if (aVar != null) {
                        bArr2 = aVar.a();
                    }
                    byte[] bArr3 = bArr2;
                    if (bArr3 == null) {
                        return this;
                    }
                    a(str, t2, bArr3, hVar, (byte) 8);
                    f(str);
                    return this;
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    @Override // android.content.SharedPreferences.Editor
    public synchronized SharedPreferences.Editor putStringSet(String str, Set<String> set) {
        if (this.J) {
            return this;
        }
        if (set == null) {
            remove(str);
        } else {
            a(str, (String) set, (com.anythink.core.common.s.a.a.b<String>) k.f4324a);
        }
        return this;
    }

    protected final synchronized void e(final String str) {
        if (this.R.isEmpty()) {
            return;
        }
        Iterator<SharedPreferences.OnSharedPreferenceChangeListener> it = this.R.iterator();
        while (it.hasNext()) {
            final SharedPreferences.OnSharedPreferenceChangeListener next = it.next();
            this.T.post(new Runnable() { // from class: com.anythink.core.common.s.a.a$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    a.this.a(next, str);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener, String str) {
        onSharedPreferenceChangeListener.onSharedPreferenceChanged(this, str);
    }

    @Override // android.content.SharedPreferences
    public synchronized void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        if (onSharedPreferenceChangeListener == null) {
            return;
        }
        if (!this.R.contains(onSharedPreferenceChangeListener)) {
            this.R.add(onSharedPreferenceChangeListener);
        }
    }

    @Override // android.content.SharedPreferences
    public synchronized void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.R.remove(onSharedPreferenceChangeListener);
    }

    @Override // android.content.SharedPreferences
    public synchronized Map<String, Object> getAll() {
        Object valueOf;
        int size = this.C.size();
        if (size == 0) {
            return new HashMap();
        }
        HashMap hashMap = new HashMap(((size * 4) / 3) + 1);
        for (Map.Entry<String, b.AbstractC0214b> entry : this.C.entrySet()) {
            String key = entry.getKey();
            b.AbstractC0214b value = entry.getValue();
            switch (value.a()) {
                case 1:
                    valueOf = Boolean.valueOf(((b.c) value).b);
                    break;
                case 2:
                    valueOf = Integer.valueOf(((b.f) value).b);
                    break;
                case 3:
                    valueOf = Float.valueOf(((b.e) value).b);
                    break;
                case 4:
                    valueOf = Long.valueOf(((b.g) value).b);
                    break;
                case 5:
                    valueOf = Double.valueOf(((b.d) value).b);
                    break;
                case 6:
                    b.i iVar = (b.i) value;
                    if (iVar.f) {
                        valueOf = a(iVar, this.z);
                        break;
                    } else {
                        valueOf = iVar.c;
                        break;
                    }
                case 7:
                    b.a aVar = (b.a) value;
                    if (aVar.f) {
                        valueOf = a(aVar, this.z);
                        break;
                    } else {
                        valueOf = aVar.c;
                        break;
                    }
                case 8:
                    b.h hVar = (b.h) value;
                    if (hVar.f) {
                        valueOf = a(hVar, this.z);
                        break;
                    } else {
                        valueOf = ((b.h) value).c;
                        break;
                    }
                default:
                    valueOf = null;
                    break;
            }
            if (valueOf != null) {
                hashMap.put(key, valueOf);
            }
        }
        return hashMap;
    }

    public synchronized void a(Map<String, Object> map, Map<Class, com.anythink.core.common.s.a.a.b> map2) {
        if (this.J) {
            return;
        }
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (key != null && !key.isEmpty()) {
                if (value instanceof String) {
                    putString(key, (String) value);
                } else if (value instanceof Boolean) {
                    putBoolean(key, ((Boolean) value).booleanValue());
                } else if (value instanceof Integer) {
                    putInt(key, ((Integer) value).intValue());
                } else if (value instanceof Long) {
                    putLong(key, ((Long) value).longValue());
                } else if (value instanceof Float) {
                    putFloat(key, ((Float) value).floatValue());
                } else if (value instanceof Double) {
                    b(key, ((Double) value).doubleValue());
                } else if (value instanceof byte[]) {
                    a(key, (byte[]) value);
                } else {
                    if (value instanceof Set) {
                        Set<String> set = (Set) value;
                        if (set.isEmpty() || (set.iterator().next() instanceof String)) {
                            putStringSet(key, set);
                        }
                    }
                    if (map2 != null) {
                        com.anythink.core.common.s.a.a.b bVar = map2.get(value.getClass());
                        if (bVar != null) {
                            a(key, (String) value, (com.anythink.core.common.s.a.a.b<String>) bVar);
                        } else {
                            b(new Exception("missing encoder for type:" + value.getClass()));
                        }
                    } else {
                        b(new Exception("missing encoders"));
                    }
                }
            }
        }
    }

    private void a(Map<String, Object> map) {
        a(map, (Map<Class, com.anythink.core.common.s.a.a.b>) null);
    }

    private void a(String str, Object obj, Map<Class, com.anythink.core.common.s.a.a.b> map) {
        if (obj instanceof Set) {
            Set<String> set = (Set) obj;
            if (set.isEmpty() || (set.iterator().next() instanceof String)) {
                putStringSet(str, set);
                return;
            }
        }
        if (map != null) {
            com.anythink.core.common.s.a.a.b bVar = map.get(obj.getClass());
            if (bVar != null) {
                a(str, (String) obj, (com.anythink.core.common.s.a.a.b<String>) bVar);
                return;
            } else {
                b(new Exception("missing encoder for type:" + obj.getClass()));
                return;
            }
        }
        b(new Exception("missing encoders"));
    }

    private void k() {
        d(this.G);
        int i2 = this.A;
        this.F = i2;
        this.A = this.G + i2;
        this.E.b = i2;
    }

    private boolean a(String str, byte b2) {
        return a(str, b2, o[b2]);
    }

    private boolean a(String str, byte b2, int i2) {
        if (this.z != null) {
            com.anythink.core.common.s.a.a.a aVar = this.z;
            str.getBytes(StandardCharsets.UTF_8);
            byte[] a2 = aVar.a();
            if (a2 == null) {
                a(new Exception(f));
                return false;
            }
            int length = a2.length;
            a(length, i2, b2);
            this.E.a((byte) length);
            System.arraycopy(a2, 0, this.E.f4316a, this.E.b, length);
            this.E.b += length;
            return true;
        }
        int b3 = f.b(str);
        a(b3, i2, b2);
        a(str, b3);
        return true;
    }

    private void a(int i2, int i3, byte b2) {
        f(i2);
        this.G = i2 + 2 + i3;
        k();
        this.E.a(b2);
    }

    private void a(String str, int i2) {
        this.E.a((byte) i2);
        if (i2 == str.length()) {
            str.getBytes(0, i2, this.E.f4316a, this.E.b);
            this.E.b += i2;
            return;
        }
        this.E.a(str);
    }

    protected void a(byte b2, int i2, int i3) {
        b(i2, i3);
        this.B ^= ((this.E.f4316a[i2] ^ r8) & 255) << ((i2 & 7) << 3);
        this.E.f4316a[i2] = (byte) (b2 | Byte.MIN_VALUE);
    }

    protected void a(int i2, byte[] bArr) {
        int length = bArr.length;
        this.B ^= this.E.b(i2, length);
        this.E.b = i2;
        this.E.a(bArr);
        this.B = this.E.b(i2, length) ^ this.B;
    }

    private int a(float f2) {
        int floatToRawIntBits = Float.floatToRawIntBits(f2);
        com.anythink.core.common.s.a.a.a aVar = this.z;
        return aVar != null ? aVar.c() : floatToRawIntBits;
    }

    private long a(double d2) {
        long doubleToRawLongBits = Double.doubleToRawLongBits(d2);
        com.anythink.core.common.s.a.a.a aVar = this.z;
        return aVar != null ? aVar.e() : doubleToRawLongBits;
    }

    private void b(String str, int i2) {
        this.E.a((short) i2);
        if (i2 == str.length()) {
            str.getBytes(0, i2, this.E.f4316a, this.E.b);
        } else {
            this.E.a(str);
        }
    }

    private void a(String str, Object obj, byte[] bArr, b.j jVar, byte b2) {
        if (jVar == null) {
            a(str, obj, bArr, b2);
        } else if (!jVar.f && jVar.e == bArr.length) {
            a(jVar.f4311a, bArr);
            jVar.c = obj;
        } else {
            a(str, obj, bArr, jVar);
        }
    }

    private void a(String str, Object obj, byte[] bArr, byte b2) {
        int length;
        b.AbstractC0214b hVar;
        int a2 = a(str, bArr, b2);
        if (a2 > 0) {
            boolean z = this.K != null;
            if (z) {
                this.M.a(str, obj);
                obj = this.K;
                this.K = null;
                length = 32;
            } else {
                length = bArr.length;
            }
            Object obj2 = obj;
            int i2 = length;
            if (b2 == 6) {
                hVar = new b.i(this.F, a2, (String) obj2, i2, z);
            } else if (b2 == 7) {
                hVar = new b.a(this.F, a2, obj2, i2, z);
            } else {
                hVar = new b.h(this.F, a2, obj2, i2, z);
            }
            this.C.put(str, hVar);
            i();
        }
    }

    private void a(String str, Object obj, byte[] bArr, b.j jVar) {
        int a2 = a(str, bArr, jVar.a());
        if (a2 > 0) {
            String str2 = jVar.f ? (String) jVar.c : null;
            a(jVar.a(), jVar.d, jVar.f4311a + jVar.e);
            boolean z = this.K != null;
            jVar.d = this.F;
            jVar.f4311a = a2;
            jVar.f = z;
            if (z) {
                this.M.a(str, obj);
                jVar.c = this.K;
                jVar.e = 32;
                this.K = null;
            } else {
                jVar.c = obj;
                jVar.e = bArr.length;
            }
            i();
            h();
            if (str2 != null) {
                g(str2);
            }
        }
    }

    private int a(final String str, final byte[] bArr, byte b2) {
        this.K = null;
        if (bArr.length < this.f4309q) {
            return b(str, bArr, b2);
        }
        c("Large value, key: " + str + ", size: " + bArr.length);
        final String a2 = l.a();
        byte[] bArr2 = new byte[32];
        a2.getBytes(0, 32, bArr2, 0);
        int b3 = b(str, bArr2, (byte) (b2 | 64));
        if (b3 > 0) {
            this.L.a(a2, bArr);
            this.N.a(a2, new e.a() { // from class: com.anythink.core.common.s.a.a$$ExternalSyntheticLambda1
                @Override // com.anythink.core.common.s.a.e.a
                public final void execute(AtomicBoolean atomicBoolean) {
                    a.this.a(a2, bArr, str, atomicBoolean);
                }
            });
            this.K = a2;
        }
        return b3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str, byte[] bArr, String str2, AtomicBoolean atomicBoolean) {
        if (atomicBoolean.get() || l.a(new File(this.v + this.w, str), bArr, atomicBoolean)) {
            return;
        }
        c("Write large value with key:" + str2 + " failed");
    }

    private int b(String str, byte[] bArr, byte b2) {
        if (!a(str, b2, bArr.length + 2)) {
            return 0;
        }
        this.E.a((short) bArr.length);
        int i2 = this.E.b;
        this.E.a(bArr);
        return i2;
    }
}
