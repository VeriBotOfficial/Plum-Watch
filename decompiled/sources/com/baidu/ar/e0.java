package com.baidu.ar;

import com.baidu.ar.callback.ICallbackWith;
import com.baidu.ar.callback.IError;

/* loaded from: classes12.dex */
public abstract class e0<InT, OutT> implements s5<InT, OutT> {

    /* renamed from: a, reason: collision with root package name */
    public e0<OutT, ?> f6896a;
    public OutT b;
    public boolean c;
    public boolean d;
    public boolean e;
    public int f;
    public String g;
    public boolean h;

    public class a implements ICallbackWith<OutT> {
        public a() {
        }

        @Override // com.baidu.ar.callback.ICallbackWith
        public void run(OutT outt) {
            e0.this.c = true;
            e0.this.b = outt;
            if (e0.this.h || e0.this.f6896a == null) {
                return;
            }
            e0.this.f6896a.a(outt);
        }
    }

    public class b implements IError {
        public b() {
        }

        @Override // com.baidu.ar.callback.IError
        public void onError(int i, String str, Exception exc) {
            e0.this.a(i, str);
        }
    }

    public class c implements IError {
        public c() {
        }

        @Override // com.baidu.ar.callback.IError
        public void onError(int i, String str, Exception exc) {
            e0.this.b(i, str);
            if (e0.this.h || e0.this.f6896a == null) {
                return;
            }
            e0.this.f6896a.a(i, str);
        }
    }

    public final void a() {
        e0<OutT, ?> e0Var;
        if (this.h || !this.c || (e0Var = this.f6896a) == null) {
            return;
        }
        if (this.e) {
            e0Var.a(this.f, this.g);
        } else {
            if (this.d) {
                return;
            }
            e0Var.a(this.b);
        }
    }

    public final void a(int i, String str) {
        this.c = true;
        this.d = true;
        a(i, str, new c());
    }

    public void a(int i, String str, IError iError) {
        if (iError != null) {
            iError.onError(i, str, null);
        }
    }

    public final void a(InT r3) {
        if (this.h) {
            return;
        }
        a((e0<InT, OutT>) r3, new a(), new b());
    }

    public abstract void a(InT r1, ICallbackWith<OutT> iCallbackWith, IError iError);

    public abstract void b();

    public final void b(int i, String str) {
        this.e = true;
        this.f = i;
        this.g = str;
    }

    @Override // com.baidu.ar.callback.ICancellable
    public void cancel() {
        this.h = true;
        b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> s5<OutT, T> d(e0<OutT, T> e0Var) {
        this.f6896a = e0Var;
        a();
        return e0Var;
    }
}
