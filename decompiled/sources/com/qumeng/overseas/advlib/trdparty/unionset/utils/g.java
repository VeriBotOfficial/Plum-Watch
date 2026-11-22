package com.qumeng.overseas.advlib.trdparty.unionset.utils;

import android.view.View;
import com.qumeng.overseas.advlib.__remote__.utils.n;
import com.qumeng.overseas.advlib.trdparty.unionset.utils.c;

/* loaded from: classes17.dex */
public class g extends c implements c.b {
    private static final int k = 180;
    public static final String l = "VIDEO_FINISH";
    public static final String m = "CLOSE_VIDEO";
    public static final String n = "SKIP_VIDEO";
    public static final String o = "MAX_TIME_FINISH";
    private a j;

    public interface a {
        void onFinish(int i, String str);
    }

    public g(View view) {
        super(180, view);
        a((c.b) this);
    }

    public void a(String str) {
        a(180 - this.f13445a, str);
        g();
    }

    @Override // com.qumeng.overseas.advlib.trdparty.unionset.utils.c
    public void f() {
        super.f();
    }

    @Override // com.qumeng.overseas.advlib.trdparty.unionset.utils.c
    public void g() {
        super.g();
        this.j = null;
    }

    @Override // com.qumeng.overseas.advlib.trdparty.unionset.utils.c.b
    public void onTick(int i) {
        if (i <= 0) {
            a(180, "MAX_TIME_FINISH");
        }
    }

    private void a(int i, String str) {
        a aVar = this.j;
        if (aVar != null) {
            aVar.onFinish(i, str);
        }
        n.a("CountdownHelper", "onFinish -->> " + str + " ; " + i, new Object[0]);
    }

    public void a(a aVar) {
        this.j = aVar;
    }
}
