package com.qumeng.overseas.advlib.trdparty.unionset.utils;

import android.view.View;
import com.qumeng.overseas.advlib.__remote__.utils.n;
import com.qumeng.overseas.advlib.trdparty.unionset.utils.c;

/* loaded from: classes17.dex */
public class h extends c implements c.b {
    protected static final String l = "VideoStatusHelper";
    private static final int m = 150;
    public static final String n = "VIDEO_FINISH";
    public static final String o = "CLOSE_VIDEO";
    public static final String p = "SKIP_VIDEO";

    /* renamed from: q, reason: collision with root package name */
    public static final String f13455q = "MAX_TIME_FINISH";
    private int j;
    private a k;

    public interface a {
        void onVideoCompleted(int i, String str);

        void onVideoPlayStart(int i);

        void onVideoProgress(int i);
    }

    public h(int i, View view) {
        super(i, view);
        this.j = i;
        a((c.b) this);
    }

    public void a(String str) {
        a(this.j - this.f13445a, str);
        g();
    }

    @Override // com.qumeng.overseas.advlib.trdparty.unionset.utils.c
    public void f() {
        super.f();
    }

    @Override // com.qumeng.overseas.advlib.trdparty.unionset.utils.c
    public void g() {
        super.g();
        this.k = null;
    }

    @Override // com.qumeng.overseas.advlib.trdparty.unionset.utils.c.b
    public void onTick(int i) {
        a aVar = this.k;
        if (aVar != null) {
            aVar.onVideoProgress(this.j - i);
        }
        n.b(l, "onTick time == " + i + " ,onVideoPlayStart time = " + (this.j - 1) + " ,onVideoProgressTime = " + (this.j - (i + 1)), new Object[0]);
        if (i <= 0) {
            a(this.j, "MAX_TIME_FINISH");
            return;
        }
        if (i == this.j - 1) {
            n.b(l, "onTick onVideoPlayStart", new Object[0]);
            a aVar2 = this.k;
            if (aVar2 != null) {
                aVar2.onVideoPlayStart(0);
            }
        }
    }

    private void a(int i, String str) {
        a aVar = this.k;
        if (aVar != null) {
            aVar.onVideoCompleted(i, str);
        }
        n.a(l, "onFinish -->> " + str + " ; " + i, new Object[0]);
    }

    public void a(a aVar) {
        this.k = aVar;
    }
}
