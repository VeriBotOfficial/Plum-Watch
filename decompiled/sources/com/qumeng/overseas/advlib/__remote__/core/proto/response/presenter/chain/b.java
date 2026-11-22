package com.qumeng.overseas.advlib.__remote__.core.proto.response.presenter.chain;

import android.util.SparseArray;
import android.view.View;
import com.qumeng.overseas.advlib.__remote__.core.proto.response.AdsObject;

/* loaded from: classes17.dex */
public class b {
    public static String g = "b";

    /* renamed from: a, reason: collision with root package name */
    private com.qumeng.overseas.advlib.__remote__.core.proto.response.presenter.chain.a f12841a;
    private SparseArray<com.qumeng.overseas.advlib.__remote__.core.proto.response.presenter.base.c> b;
    private AdsObject c;
    private int d;
    private com.qumeng.overseas.advlib.__remote__.core.proto.response.presenter.base.b e;
    private View f;

    class a implements com.qumeng.overseas.advlib.__remote__.core.proto.response.presenter.base.b {
        a() {
        }

        @Override // com.qumeng.overseas.advlib.__remote__.core.proto.response.presenter.base.b
        public void processNextBehavior(boolean z) {
            if (z) {
                b.this.g();
            }
        }
    }

    b(com.qumeng.overseas.advlib.__remote__.core.proto.response.presenter.chain.a aVar) {
        this.f12841a = aVar;
        this.c = aVar.b();
        this.b = this.f12841a.c();
    }

    private boolean e() {
        AdsObject adsObject = this.c;
        if (adsObject == null) {
            return false;
        }
        try {
            return ((Boolean) adsObject.getStash("isPostEvent", Boolean.TRUE)).booleanValue();
        } catch (Exception e) {
            e.printStackTrace();
            return true;
        }
    }

    private com.qumeng.overseas.advlib.__remote__.core.proto.response.presenter.base.c f() {
        int i = this.d;
        if (i < 0 || i >= this.b.size()) {
            return null;
        }
        SparseArray<com.qumeng.overseas.advlib.__remote__.core.proto.response.presenter.base.c> sparseArray = this.b;
        int i2 = this.d;
        this.d = i2 + 1;
        return sparseArray.get(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        com.qumeng.overseas.advlib.__remote__.core.proto.response.presenter.base.c f = f();
        if (f != null) {
            f.a(this.e, this);
        }
    }

    private void h() {
        a();
        g();
    }

    public AdsObject b() {
        return this.c;
    }

    public com.qumeng.overseas.advlib.__remote__.core.proto.response.presenter.chain.a c() {
        return this.f12841a;
    }

    public View d() {
        return this.f;
    }

    public void a(View view) {
        if (this.c == null) {
            return;
        }
        this.f = view;
        h();
        if (this.f12841a.e() && e()) {
            this.c.onClickedReportWithPosition(com.qumeng.overseas.advlib.__remote__.core.proto.response.presenter.helper.a.a(view));
        }
    }

    private void a() {
        if (this.e == null) {
            this.e = new a();
        }
    }
}
