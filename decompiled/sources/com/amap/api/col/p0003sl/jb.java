package com.amap.api.col.p0003sl;

import com.amap.api.col.p0003sl.ob;

/* compiled from: DownloadManager.java */
/* loaded from: classes11.dex */
public class jb {

    /* renamed from: a, reason: collision with root package name */
    private lb f1715a;
    private ob b;
    private long c;
    private long d;

    /* compiled from: DownloadManager.java */
    public interface a {
        void onDownload(byte[] bArr, long j);

        void onException(Throwable th);

        void onFinish();

        void onStop();
    }

    public jb(ob obVar) {
        this(obVar, 0L, -1L);
    }

    public void a(a aVar) {
        try {
            lb lbVar = new lb();
            this.f1715a = lbVar;
            lbVar.b(this.d);
            this.f1715a.a(this.c);
            if (hb.a().c(this.b)) {
                this.b.setDegradeType(ob.b.NEVER_GRADE);
                this.f1715a.a(this.b, aVar);
            } else {
                this.b.setDegradeType(ob.b.DEGRADE_ONLY);
                this.f1715a.a(this.b, aVar);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public jb(ob obVar, long j, long j2) {
        this(obVar, j, j2, false);
    }

    public jb(ob obVar, long j, long j2, boolean z) {
        this.b = obVar;
        this.c = j;
        this.d = j2;
        obVar.setHttpProtocol(z ? ob.c.HTTPS : ob.c.HTTP);
        this.b.setDegradeAbility(ob.a.SINGLE);
    }

    public void a() {
        lb lbVar = this.f1715a;
        if (lbVar != null) {
            lbVar.a();
        }
    }
}
