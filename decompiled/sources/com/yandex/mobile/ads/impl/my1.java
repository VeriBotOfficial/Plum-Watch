package com.yandex.mobile.ads.impl;

import android.os.ConditionVariable;
import com.yandex.mobile.ads.impl.sm;
import java.io.File;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.TreeSet;

/* loaded from: classes5.dex */
public final class my1 implements sm {
    private static final HashSet<File> j = new HashSet<>();

    /* renamed from: a, reason: collision with root package name */
    private final File f16292a;
    private final zm b;
    private final kn c;
    private final bn d;
    private final HashMap<String, ArrayList<sm.b>> e;
    private final Random f;
    private final boolean g;
    private long h;
    private sm.a i;

    my1(File file, or0 or0Var, kn knVar, bn bnVar) {
        if (!c(file)) {
            throw new IllegalStateException("Another SimpleCache instance uses the folder: " + file);
        }
        this.f16292a = file;
        this.b = or0Var;
        this.c = knVar;
        this.d = bnVar;
        this.e = new HashMap<>();
        this.f = new Random();
        this.g = true;
        this.h = -1L;
        ConditionVariable conditionVariable = new ConditionVariable();
        new ly1(this, conditionVariable).start();
        conditionVariable.block();
    }

    public final synchronized TreeSet c(String str) {
        TreeSet treeSet;
        jn a2 = this.c.a(str);
        if (a2 != null && !a2.c()) {
            treeSet = new TreeSet((Collection) a2.b());
        }
        treeSet = new TreeSet();
        return treeSet;
    }

    public my1(File file, or0 or0Var, k60 k60Var) {
        this(file, or0Var, new kn(k60Var, file), new bn(k60Var));
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:? -> B:12:0x001c). Please report as a decompilation issue!!! */
    @Override // com.yandex.mobile.ads.impl.sm
    public final synchronized fn e(String str, long j2, long j3) throws InterruptedException, sm.a {
        try {
            a();
            while (true) {
                fn c = c(str, j2, j3);
                long j4 = j3;
                long j5 = j2;
                String str2 = str;
                if (c != null) {
                    return c;
                }
                try {
                    wait();
                    str = str2;
                    j2 = j5;
                    j3 = j4;
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    @Override // com.yandex.mobile.ads.impl.sm
    public final synchronized long d(String str, long j2, long j3) {
        jn a2;
        if (j3 == -1) {
            j3 = Long.MAX_VALUE;
        }
        a2 = this.c.a(str);
        return a2 != null ? a2.a(j2, j3) : -j3;
    }

    @Override // com.yandex.mobile.ads.impl.sm
    public final synchronized long b(String str, long j2, long j3) {
        long j4;
        long j5 = j3 == -1 ? Long.MAX_VALUE : j2 + j3;
        long j6 = j5 >= 0 ? j5 : Long.MAX_VALUE;
        long j7 = j2;
        j4 = 0;
        while (j7 < j6) {
            long d = d(str, j7, j6 - j7);
            if (d > 0) {
                j4 += d;
            } else {
                d = -d;
            }
            j7 += d;
        }
        return j4;
    }

    @Override // com.yandex.mobile.ads.impl.sm
    public final synchronized nz b(String str) {
        return this.c.b(str);
    }

    private void a(oy1 oy1Var) {
        this.c.c(oy1Var.b).a(oy1Var);
        ArrayList<sm.b> arrayList = this.e.get(oy1Var.b);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size).a(this, oy1Var);
            }
        }
        this.b.a(this, oy1Var);
    }

    private void c(fn fnVar) {
        jn a2 = this.c.a(fnVar.b);
        if (a2 == null || !a2.a(fnVar)) {
            return;
        }
        if (this.d != null) {
            String name = fnVar.f.getName();
            try {
                this.d.a(name);
            } catch (IOException unused) {
                rv0.a("Failed to remove file index entry for: ", name, "SimpleCache");
            }
        }
        this.c.d(a2.b);
        ArrayList<sm.b> arrayList = this.e.get(fnVar.b);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size).a(fnVar);
            }
        }
        this.b.a(fnVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        long j2;
        if (!this.f16292a.exists()) {
            try {
                a(this.f16292a);
            } catch (sm.a e) {
                this.i = e;
                return;
            }
        }
        File[] listFiles = this.f16292a.listFiles();
        if (listFiles == null) {
            String str = "Failed to list cache directory files: " + this.f16292a;
            et0.b("SimpleCache", str);
            this.i = new sm.a(str);
            return;
        }
        int length = listFiles.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                j2 = -1;
                break;
            }
            File file = listFiles[i];
            String name = file.getName();
            if (name.endsWith(".uid")) {
                try {
                    j2 = Long.parseLong(name.substring(0, name.indexOf(46)), 16);
                    break;
                } catch (NumberFormatException unused) {
                    et0.b("SimpleCache", "Malformed UID file: " + file);
                    file.delete();
                }
            }
            i++;
        }
        this.h = j2;
        if (j2 == -1) {
            try {
                this.h = b(this.f16292a);
            } catch (IOException e2) {
                String str2 = "Failed to create cache UID: " + this.f16292a;
                et0.a("SimpleCache", str2, e2);
                this.i = new sm.a(str2, e2);
                return;
            }
        }
        try {
            this.c.a(this.h);
            bn bnVar = this.d;
            if (bnVar != null) {
                bnVar.a(this.h);
                HashMap a2 = this.d.a();
                a(this.f16292a, true, listFiles, a2);
                this.d.a(a2.keySet());
            } else {
                a(this.f16292a, true, listFiles, null);
            }
            this.c.b();
            try {
                this.c.c();
            } catch (Throwable th) {
                et0.a("SimpleCache", "Storing index file failed", th);
            }
        } catch (Throwable th2) {
            String str3 = "Failed to initialize cache indices: " + this.f16292a;
            et0.a("SimpleCache", str3, th2);
            this.i = new sm.a(str3, th2);
        }
    }

    @Override // com.yandex.mobile.ads.impl.sm
    public final synchronized void a(String str, es esVar) throws sm.a {
        sm.a aVar;
        a();
        this.c.a(str, esVar);
        try {
            this.c.c();
        } finally {
        }
    }

    public final synchronized void a() throws sm.a {
        sm.a aVar = this.i;
        if (aVar != null) {
            throw aVar;
        }
    }

    @Override // com.yandex.mobile.ads.impl.sm
    public final synchronized void b(fn fnVar) {
        jn a2 = this.c.a(fnVar.b);
        a2.getClass();
        a2.a(fnVar.c);
        this.c.d(a2.b);
        notifyAll();
    }

    private static long b(File file) throws IOException {
        long nextLong = new SecureRandom().nextLong();
        long abs = nextLong == Long.MIN_VALUE ? 0L : Math.abs(nextLong);
        File file2 = new File(file, Long.toString(abs, 16) + ".uid");
        if (file2.createNewFile()) {
            return abs;
        }
        throw new IOException("Failed to create UID file: " + file2);
    }

    @Override // com.yandex.mobile.ads.impl.sm
    public final synchronized void a(File file, long j2) throws sm.a {
        if (file.exists()) {
            if (j2 == 0) {
                file.delete();
                return;
            }
            oy1 a2 = oy1.a(file, j2, -9223372036854775807L, this.c);
            a2.getClass();
            jn a3 = this.c.a(a2.b);
            a3.getClass();
            if (a3.c(a2.c, a2.d)) {
                long b = a3.a().b();
                if (b != -1 && a2.c + a2.d > b) {
                    throw new IllegalStateException();
                }
                if (this.d != null) {
                    try {
                        this.d.a(file.getName(), a2.d, a2.g);
                    } catch (IOException e) {
                        throw new sm.a(e);
                    }
                }
                a(a2);
                try {
                    this.c.c();
                    notifyAll();
                    return;
                } finally {
                    sm.a aVar = new sm.a(e);
                }
            }
            throw new IllegalStateException();
        }
    }

    private void c() {
        ArrayList arrayList = new ArrayList();
        Iterator<jn> it = this.c.a().iterator();
        while (it.hasNext()) {
            Iterator<oy1> it2 = it.next().b().iterator();
            while (it2.hasNext()) {
                oy1 next = it2.next();
                if (next.f.length() != next.d) {
                    arrayList.add(next);
                }
            }
        }
        for (int i = 0; i < arrayList.size(); i++) {
            c((fn) arrayList.get(i));
        }
    }

    @Override // com.yandex.mobile.ads.impl.sm
    public final synchronized fn c(String str, long j2, long j3) throws sm.a {
        oy1 b;
        oy1 oy1Var;
        boolean z;
        a();
        jn a2 = this.c.a(str);
        if (a2 == null) {
            oy1Var = oy1.a(str, j2, j3);
        } else {
            while (true) {
                b = a2.b(j2, j3);
                if (!b.e || b.f.length() == b.d) {
                    break;
                }
                c();
            }
            oy1Var = b;
        }
        if (oy1Var.e) {
            if (this.g) {
                File file = oy1Var.f;
                file.getClass();
                String name = file.getName();
                long j4 = oy1Var.d;
                long currentTimeMillis = System.currentTimeMillis();
                bn bnVar = this.d;
                if (bnVar != null) {
                    try {
                        bnVar.a(name, j4, currentTimeMillis);
                    } catch (IOException unused) {
                        et0.d("SimpleCache", "Failed to update index with new touch timestamp.");
                    }
                    z = false;
                } else {
                    z = true;
                }
                oy1 a3 = this.c.a(str).a(oy1Var, currentTimeMillis, z);
                ArrayList<sm.b> arrayList = this.e.get(oy1Var.b);
                if (arrayList != null) {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        arrayList.get(size).a(this, oy1Var, a3);
                    }
                }
                this.b.a(this, oy1Var, a3);
                oy1Var = a3;
            }
            return oy1Var;
        }
        if (this.c.c(str).d(j2, oy1Var.d)) {
            return oy1Var;
        }
        return null;
    }

    private static synchronized boolean c(File file) {
        boolean add;
        synchronized (my1.class) {
            add = j.add(file.getAbsoluteFile());
        }
        return add;
    }

    private static void a(File file) throws sm.a {
        if (file.mkdirs() || file.isDirectory()) {
            return;
        }
        String str = "Failed to create cache directory: " + file;
        et0.b("SimpleCache", str);
        throw new sm.a(str);
    }

    private void a(File file, boolean z, File[] fileArr, HashMap hashMap) {
        long j2;
        long j3;
        if (fileArr == null || fileArr.length == 0) {
            if (z) {
                return;
            }
            file.delete();
            return;
        }
        for (File file2 : fileArr) {
            String name = file2.getName();
            if (z && name.indexOf(46) == -1) {
                a(file2, false, file2.listFiles(), hashMap);
            } else if (!z || (!name.startsWith("monetization_cached_content_index.exi") && !name.endsWith(".uid"))) {
                an anVar = hashMap != null ? (an) hashMap.remove(name) : null;
                if (anVar != null) {
                    j2 = anVar.f15020a;
                    j3 = anVar.b;
                } else {
                    j2 = -1;
                    j3 = -9223372036854775807L;
                }
                oy1 a2 = oy1.a(file2, j2, j3, this.c);
                if (a2 != null) {
                    a(a2);
                } else {
                    file2.delete();
                }
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.sm
    public final synchronized void a(String str) {
        Iterator it = c(str).iterator();
        while (it.hasNext()) {
            c((fn) it.next());
        }
    }

    @Override // com.yandex.mobile.ads.impl.sm
    public final synchronized void a(fn fnVar) {
        c(fnVar);
    }

    @Override // com.yandex.mobile.ads.impl.sm
    public final synchronized File a(String str, long j2, long j3) throws sm.a {
        File file;
        long currentTimeMillis;
        int i;
        a();
        jn a2 = this.c.a(str);
        a2.getClass();
        if (a2.c(j2, j3)) {
            if (!this.f16292a.exists()) {
                a(this.f16292a);
                c();
            }
            this.b.a(this, j3);
            file = new File(this.f16292a, Integer.toString(this.f.nextInt(10)));
            if (!file.exists()) {
                a(file);
            }
            currentTimeMillis = System.currentTimeMillis();
            i = a2.f15931a;
            int i2 = oy1.k;
        } else {
            throw new IllegalStateException();
        }
        return new File(file, i + "." + j2 + "." + currentTimeMillis + ".v3.exo");
    }
}
