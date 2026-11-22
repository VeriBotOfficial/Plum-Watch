package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import com.yandex.mobile.ads.impl.b40;
import com.yandex.mobile.ads.impl.pz;
import com.yandex.mobile.ads.impl.sq1;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes5.dex */
public final class y30 {
    public static final rq1 h = new rq1(1);

    /* renamed from: a, reason: collision with root package name */
    private final b f17390a;
    private final CopyOnWriteArraySet<c> b;
    private int c;
    private boolean d;
    private int e;
    private boolean f;
    private List<w30> g;

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final w30 f17391a;
        public final boolean b;
        public final List<w30> c;

        public a(w30 w30Var, boolean z, ArrayList arrayList, Exception exc) {
            this.f17391a = w30Var;
            this.b = z;
            this.c = arrayList;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class b extends Handler {

        /* renamed from: a, reason: collision with root package name */
        private final HandlerThread f17392a;
        private final al2 b;
        private final c40 c;
        private final Handler d;
        private final ArrayList<w30> e;
        private final HashMap<String, d> f;
        private int g;
        private boolean h;
        private int i;
        private int j;
        private int k;

        public b(HandlerThread handlerThread, pz pzVar, qz qzVar, Handler handler, boolean z) {
            super(handlerThread.getLooper());
            this.f17392a = handlerThread;
            this.b = pzVar;
            this.c = qzVar;
            this.d = handler;
            this.i = 3;
            this.j = 5;
            this.h = z;
            this.e = new ArrayList<>();
            this.f = new HashMap<>();
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            x30 x30Var = null;
            int i = 7;
            r10 = 0;
            int i2 = 0;
            switch (message.what) {
                case 0:
                    this.g = message.arg1;
                    try {
                        ((pz) this.b).b();
                        x30Var = ((pz) this.b).a(0, 1, 2, 5, 7);
                    } catch (IOException e) {
                        et0.a("DownloadManager", "Failed to load index.", e);
                        this.e.clear();
                    } finally {
                        f92.a((Closeable) x30Var);
                    }
                    while (true) {
                        pz.a aVar = (pz.a) x30Var;
                        if (aVar.a(aVar.b() + 1)) {
                            this.e.add(((pz.a) x30Var).a());
                        } else {
                            this.d.obtainMessage(0, new ArrayList(this.e)).sendToTarget();
                            b();
                            i2 = 1;
                            this.d.obtainMessage(1, i2, this.f.size()).sendToTarget();
                            return;
                        }
                    }
                case 1:
                    this.h = message.arg1 != 0;
                    b();
                    i2 = 1;
                    this.d.obtainMessage(1, i2, this.f.size()).sendToTarget();
                    return;
                case 2:
                    this.g = message.arg1;
                    b();
                    i2 = 1;
                    this.d.obtainMessage(1, i2, this.f.size()).sendToTarget();
                    return;
                case 3:
                    String str = (String) message.obj;
                    int i3 = message.arg1;
                    if (str == null) {
                        for (int i4 = 0; i4 < this.e.size(); i4++) {
                            a(this.e.get(i4), i3);
                        }
                        try {
                            ((pz) this.b).a(i3);
                        } catch (IOException e2) {
                            et0.a("DownloadManager", "Failed to set manual stop reason", e2);
                        }
                    } else {
                        w30 a2 = a(str, false);
                        if (a2 != null) {
                            a(a2, i3);
                        } else {
                            try {
                                ((pz) this.b).a(i3, str);
                            } catch (IOException e3) {
                                et0.a("DownloadManager", "Failed to set manual stop reason: ".concat(str), e3);
                            }
                        }
                    }
                    b();
                    i2 = 1;
                    this.d.obtainMessage(1, i2, this.f.size()).sendToTarget();
                    return;
                case 4:
                    this.i = message.arg1;
                    b();
                    i2 = 1;
                    this.d.obtainMessage(1, i2, this.f.size()).sendToTarget();
                    return;
                case 5:
                    this.j = message.arg1;
                    i2 = 1;
                    this.d.obtainMessage(1, i2, this.f.size()).sendToTarget();
                    return;
                case 6:
                    a40 a40Var = (a40) message.obj;
                    int i5 = message.arg1;
                    w30 a3 = a(a40Var.b, true);
                    long currentTimeMillis = System.currentTimeMillis();
                    if (a3 != null) {
                        int i6 = a3.b;
                        long j = (i6 == 5 || i6 == 3 || i6 == 4) ? currentTimeMillis : a3.c;
                        if (i6 != 5 && i6 != 7) {
                            i = i5 != 0 ? 1 : 0;
                        }
                        a(new w30(a3.f17215a.a(a40Var), i, j, currentTimeMillis, -1L, i5, 0, new z30()));
                    } else {
                        a(new w30(a40Var, i5 != 0 ? 1 : 0, currentTimeMillis, currentTimeMillis, -1L, i5, 0, new z30()));
                    }
                    b();
                    i2 = 1;
                    this.d.obtainMessage(1, i2, this.f.size()).sendToTarget();
                    return;
                case 7:
                    String str2 = (String) message.obj;
                    w30 a4 = a(str2, true);
                    if (a4 == null) {
                        et0.b("DownloadManager", "Failed to remove nonexistent download: " + str2);
                    } else {
                        a(a4, 5, 0);
                        b();
                    }
                    i2 = 1;
                    this.d.obtainMessage(1, i2, this.f.size()).sendToTarget();
                    return;
                case 8:
                    a();
                    i2 = 1;
                    this.d.obtainMessage(1, i2, this.f.size()).sendToTarget();
                    return;
                case 9:
                    d dVar = (d) message.obj;
                    String str3 = dVar.b.b;
                    this.f.remove(str3);
                    boolean z = dVar.e;
                    if (!z) {
                        int i7 = this.k - 1;
                        this.k = i7;
                        if (i7 == 0) {
                            removeMessages(11);
                        }
                    }
                    if (dVar.h) {
                        b();
                    } else {
                        Exception exc = dVar.i;
                        if (exc != null) {
                            et0.a("DownloadManager", "Task failed: " + dVar.b + ", " + z, exc);
                        }
                        w30 a5 = a(str3, false);
                        a5.getClass();
                        int i8 = a5.b;
                        if (i8 != 2) {
                            if (i8 != 5 && i8 != 7) {
                                throw new IllegalStateException();
                            }
                            if (!z) {
                                throw new IllegalStateException();
                            }
                            if (i8 == 7) {
                                int i9 = a5.f;
                                a(a5, i9 == 0 ? 0 : 1, i9);
                                b();
                            } else {
                                this.e.remove(a(a5.f17215a.b));
                                try {
                                    ((pz) this.b).c(a5.f17215a.b);
                                } catch (IOException unused) {
                                    et0.b("DownloadManager", "Failed to remove from database");
                                }
                                this.d.obtainMessage(2, new a(a5, true, new ArrayList(this.e), null)).sendToTarget();
                            }
                        } else if (!z) {
                            w30 w30Var = new w30(a5.f17215a, exc == null ? 3 : 4, a5.c, System.currentTimeMillis(), a5.e, a5.f, exc == null ? 0 : 1, a5.h);
                            this.e.remove(a(w30Var.f17215a.b));
                            try {
                                ((pz) this.b).a(w30Var);
                            } catch (IOException e4) {
                                et0.a("DownloadManager", "Failed to update index.", e4);
                            }
                            this.d.obtainMessage(2, new a(w30Var, false, new ArrayList(this.e), exc)).sendToTarget();
                        } else {
                            throw new IllegalStateException();
                        }
                        b();
                    }
                    this.d.obtainMessage(1, i2, this.f.size()).sendToTarget();
                    return;
                case 10:
                    d dVar2 = (d) message.obj;
                    int i10 = message.arg1;
                    int i11 = message.arg2;
                    int i12 = f92.f15466a;
                    long j2 = ((i10 & BodyPartID.bodyIdMax) << 32) | (BodyPartID.bodyIdMax & i11);
                    w30 a6 = a(dVar2.b.b, false);
                    a6.getClass();
                    if (j2 == a6.e || j2 == -1) {
                        return;
                    }
                    a(new w30(a6.f17215a, a6.b, a6.c, System.currentTimeMillis(), j2, a6.f, a6.g, a6.h));
                    return;
                case 11:
                    for (int i13 = 0; i13 < this.e.size(); i13++) {
                        w30 w30Var2 = this.e.get(i13);
                        if (w30Var2.b == 2) {
                            try {
                                ((pz) this.b).a(w30Var2);
                            } catch (IOException e5) {
                                et0.a("DownloadManager", "Failed to update index.", e5);
                            }
                        }
                    }
                    sendEmptyMessageDelayed(11, 5000L);
                    return;
                case 12:
                    Iterator<d> it = this.f.values().iterator();
                    while (it.hasNext()) {
                        it.next().a(true);
                    }
                    try {
                        ((pz) this.b).b();
                    } catch (IOException e6) {
                        et0.a("DownloadManager", "Failed to update index.", e6);
                    }
                    this.e.clear();
                    this.f17392a.quit();
                    synchronized (this) {
                        notifyAll();
                    }
                    return;
                default:
                    throw new IllegalStateException();
            }
        }

        private void b() {
            int i = 0;
            for (int i2 = 0; i2 < this.e.size(); i2++) {
                w30 w30Var = this.e.get(i2);
                d dVar = this.f.get(w30Var.f17215a.b);
                int i3 = w30Var.b;
                if (i3 != 0) {
                    if (i3 != 1) {
                        if (i3 == 2) {
                            dVar.getClass();
                            if (!dVar.e) {
                                if (this.h || this.g != 0 || i >= this.i) {
                                    a(w30Var, 0, 0);
                                    dVar.a(false);
                                }
                            } else {
                                throw new IllegalStateException();
                            }
                        } else {
                            if (i3 != 5 && i3 != 7) {
                                throw new IllegalStateException();
                            }
                            if (dVar != null) {
                                if (!dVar.e) {
                                    dVar.a(false);
                                }
                            } else {
                                d dVar2 = new d(w30Var.f17215a, ((qz) this.c).a(w30Var.f17215a), w30Var.h, true, this.j, this);
                                this.f.put(w30Var.f17215a.b, dVar2);
                                dVar2.start();
                            }
                        }
                    } else if (dVar != null) {
                        if (!dVar.e) {
                            dVar.a(false);
                        } else {
                            throw new IllegalStateException();
                        }
                    }
                } else if (dVar != null) {
                    if (!dVar.e) {
                        dVar.a(false);
                    } else {
                        throw new IllegalStateException();
                    }
                } else if (this.h || this.g != 0 || this.k >= this.i) {
                    dVar = null;
                } else {
                    w30 a2 = a(w30Var, 2, 0);
                    d dVar3 = new d(a2.f17215a, ((qz) this.c).a(a2.f17215a), a2.h, false, this.j, this);
                    this.f.put(a2.f17215a.b, dVar3);
                    int i4 = this.k;
                    this.k = i4 + 1;
                    if (i4 == 0) {
                        sendEmptyMessageDelayed(11, 5000L);
                    }
                    dVar3.start();
                    dVar = dVar3;
                }
                if (dVar != null && !dVar.e) {
                    i++;
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static int a(w30 w30Var, w30 w30Var2) {
            long j = w30Var.c;
            long j2 = w30Var2.c;
            int i = f92.f15466a;
            if (j < j2) {
                return -1;
            }
            return j == j2 ? 0 : 1;
        }

        private w30 a(String str, boolean z) {
            int a2 = a(str);
            if (a2 != -1) {
                return this.e.get(a2);
            }
            if (!z) {
                return null;
            }
            try {
                return ((pz) this.b).b(str);
            } catch (IOException e) {
                et0.a("DownloadManager", "Failed to load download: " + str, e);
                return null;
            }
        }

        private int a(String str) {
            for (int i = 0; i < this.e.size(); i++) {
                if (this.e.get(i).f17215a.b.equals(str)) {
                    return i;
                }
            }
            return -1;
        }

        private w30 a(w30 w30Var) {
            int i = w30Var.b;
            if (i != 3 && i != 4) {
                int a2 = a(w30Var.f17215a.b);
                if (a2 == -1) {
                    this.e.add(w30Var);
                    Collections.sort(this.e, new y30$b$$ExternalSyntheticLambda0());
                } else {
                    boolean z = w30Var.c != this.e.get(a2).c;
                    this.e.set(a2, w30Var);
                    if (z) {
                        Collections.sort(this.e, new y30$b$$ExternalSyntheticLambda0());
                    }
                }
                try {
                    ((pz) this.b).a(w30Var);
                } catch (IOException e) {
                    et0.a("DownloadManager", "Failed to update index.", e);
                }
                this.d.obtainMessage(2, new a(w30Var, false, new ArrayList(this.e), null)).sendToTarget();
                return w30Var;
            }
            throw new IllegalStateException();
        }

        private w30 a(w30 w30Var, int i, int i2) {
            if (i != 3 && i != 4) {
                return a(new w30(w30Var.f17215a, i, w30Var.c, System.currentTimeMillis(), w30Var.e, i2, 0, w30Var.h));
            }
            throw new IllegalStateException();
        }

        private void a() {
            ArrayList arrayList = new ArrayList();
            try {
                x30 a2 = ((pz) this.b).a(3, 4);
                while (true) {
                    try {
                        pz.a aVar = (pz.a) a2;
                        if (!aVar.a(aVar.b() + 1)) {
                            break;
                        } else {
                            arrayList.add(((pz.a) a2).a());
                        }
                    } finally {
                    }
                }
                ((pz.a) a2).close();
            } catch (IOException unused) {
                et0.b("DownloadManager", "Failed to load downloads.");
            }
            for (int i = 0; i < this.e.size(); i++) {
                ArrayList<w30> arrayList2 = this.e;
                w30 w30Var = arrayList2.get(i);
                arrayList2.set(i, new w30(w30Var.f17215a, 5, w30Var.c, System.currentTimeMillis(), w30Var.e, 0, 0, w30Var.h));
            }
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                ArrayList<w30> arrayList3 = this.e;
                w30 w30Var2 = (w30) arrayList.get(i2);
                arrayList3.add(new w30(w30Var2.f17215a, 5, w30Var2.c, System.currentTimeMillis(), w30Var2.e, 0, 0, w30Var2.h));
            }
            Collections.sort(this.e, new y30$b$$ExternalSyntheticLambda0());
            try {
                ((pz) this.b).c();
            } catch (IOException e) {
                et0.a("DownloadManager", "Failed to update index.", e);
            }
            ArrayList arrayList4 = new ArrayList(this.e);
            for (int i3 = 0; i3 < this.e.size(); i3++) {
                this.d.obtainMessage(2, new a(this.e.get(i3), false, arrayList4, null)).sendToTarget();
            }
            b();
        }

        private void a(w30 w30Var, int i) {
            if (i == 0) {
                if (w30Var.b == 1) {
                    a(w30Var, 0, 0);
                }
            } else if (i != w30Var.f) {
                int i2 = w30Var.b;
                if (i2 == 0 || i2 == 2) {
                    i2 = 1;
                }
                a(new w30(w30Var.f17215a, i2, w30Var.c, System.currentTimeMillis(), w30Var.e, i, 0, w30Var.h));
            }
        }
    }

    public interface c {
        default void a(y30 y30Var, w30 w30Var) {
        }
    }

    public y30(Context context, pz pzVar, qz qzVar) {
        context.getApplicationContext();
        this.d = true;
        this.g = Collections.emptyList();
        this.b = new CopyOnWriteArraySet<>();
        Handler b2 = f92.b(new Handler.Callback() { // from class: com.yandex.mobile.ads.impl.y30$$ExternalSyntheticLambda0
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                boolean a2;
                a2 = y30.this.a(message);
                return a2;
            }
        });
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:DownloadManager");
        handlerThread.start();
        b bVar = new b(handlerThread, pzVar, qzVar, b2, this.d);
        this.f17390a = bVar;
        int a2 = new sq1(context, new sq1.b() { // from class: com.yandex.mobile.ads.impl.y30$$ExternalSyntheticLambda1
            @Override // com.yandex.mobile.ads.impl.sq1.b
            public final void a(sq1 sq1Var, int i) {
                y30.this.a(sq1Var, i);
            }
        }).a();
        this.e = a2;
        this.c = 1;
        bVar.obtainMessage(0, a2, 0).sendToTarget();
    }

    public final void a(a40 a40Var) {
        this.c++;
        this.f17390a.obtainMessage(6, 0, 0, a40Var).sendToTarget();
    }

    public final void a(qj2 qj2Var) {
        this.b.add(qj2Var);
    }

    private boolean b() {
        boolean z;
        if (!this.d && this.e != 0) {
            for (int i = 0; i < this.g.size(); i++) {
                if (this.g.get(i).b == 0) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        boolean z2 = this.f != z;
        this.f = z;
        return z2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(Message message) {
        int i = message.what;
        if (i == 0) {
            this.g = Collections.unmodifiableList((List) message.obj);
            boolean b2 = b();
            Iterator<c> it = this.b.iterator();
            while (it.hasNext()) {
                it.next().getClass();
            }
            if (b2) {
                Iterator<c> it2 = this.b.iterator();
                while (it2.hasNext()) {
                    it2.next().getClass();
                }
            }
        } else if (i == 1) {
            int i2 = message.arg1;
            int i3 = message.arg2;
            int i4 = this.c - i2;
            this.c = i4;
            if (i3 == 0 && i4 == 0) {
                Iterator<c> it3 = this.b.iterator();
                while (it3.hasNext()) {
                    it3.next().getClass();
                }
            }
        } else if (i == 2) {
            a aVar = (a) message.obj;
            this.g = Collections.unmodifiableList(aVar.c);
            w30 w30Var = aVar.f17391a;
            boolean b3 = b();
            if (aVar.b) {
                Iterator<c> it4 = this.b.iterator();
                while (it4.hasNext()) {
                    it4.next().getClass();
                }
            } else {
                Iterator<c> it5 = this.b.iterator();
                while (it5.hasNext()) {
                    it5.next().a(this, w30Var);
                }
            }
            if (b3) {
                Iterator<c> it6 = this.b.iterator();
                while (it6.hasNext()) {
                    it6.next().getClass();
                }
            }
        } else {
            throw new IllegalStateException();
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(sq1 sq1Var, int i) {
        sq1Var.getClass();
        if (this.e != i) {
            this.e = i;
            this.c++;
            this.f17390a.obtainMessage(2, i, 0).sendToTarget();
        }
        boolean b2 = b();
        Iterator<c> it = this.b.iterator();
        while (it.hasNext()) {
            it.next().getClass();
        }
        if (b2) {
            Iterator<c> it2 = this.b.iterator();
            while (it2.hasNext()) {
                it2.next().getClass();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class d extends Thread implements b40.a {
        private final a40 b;
        private final b40 c;
        private final z30 d;
        private final boolean e;
        private final int f;
        private volatile b g;
        private volatile boolean h;
        private Exception i;
        private long j;

        private d(a40 a40Var, b40 b40Var, z30 z30Var, boolean z, int i, b bVar) {
            this.b = a40Var;
            this.c = b40Var;
            this.d = z30Var;
            this.e = z;
            this.f = i;
            this.g = bVar;
            this.j = -1L;
        }

        public final void a(boolean z) {
            if (z) {
                this.g = null;
            }
            if (this.h) {
                return;
            }
            this.h = true;
            this.c.cancel();
            interrupt();
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            try {
                if (this.e) {
                    this.c.remove();
                } else {
                    long j = -1;
                    int i = 0;
                    while (!this.h) {
                        try {
                            this.c.a(this);
                            break;
                        } catch (IOException e) {
                            if (!this.h) {
                                long j2 = this.d.f17480a;
                                if (j2 != j) {
                                    i = 0;
                                    j = j2;
                                }
                                int i2 = i + 1;
                                if (i2 <= this.f) {
                                    Thread.sleep(Math.min(i * 1000, 5000));
                                    i = i2;
                                } else {
                                    throw e;
                                }
                            }
                        }
                    }
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (Exception e2) {
                this.i = e2;
            }
            b bVar = this.g;
            if (bVar != null) {
                bVar.obtainMessage(9, this).sendToTarget();
            }
        }

        public final void a(long j, long j2, float f) {
            this.d.f17480a = j2;
            this.d.b = f;
            if (j != this.j) {
                this.j = j;
                b bVar = this.g;
                if (bVar != null) {
                    bVar.obtainMessage(10, (int) (j >> 32), (int) j, this).sendToTarget();
                }
            }
        }
    }

    public final void a(String str) {
        this.c++;
        this.f17390a.obtainMessage(7, str).sendToTarget();
    }

    public final void a(c cVar) {
        this.b.remove(cVar);
    }

    public final void a() {
        if (this.d) {
            this.d = false;
            this.c++;
            this.f17390a.obtainMessage(1, 0, 0).sendToTarget();
            boolean b2 = b();
            Iterator<c> it = this.b.iterator();
            while (it.hasNext()) {
                it.next().getClass();
            }
            if (b2) {
                Iterator<c> it2 = this.b.iterator();
                while (it2.hasNext()) {
                    it2.next().getClass();
                }
            }
        }
    }
}
