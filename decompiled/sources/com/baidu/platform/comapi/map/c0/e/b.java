package com.baidu.platform.comapi.map.c0.e;

import android.util.Pair;
import android.view.MotionEvent;
import com.baidu.platform.comapi.map.c0.a;
import com.baidu.platform.comapi.map.c0.d;

/* compiled from: MoveDetector.java */
/* loaded from: classes13.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public a.C0399a f8633a;
    public a.C0399a b;
    public a.C0399a c;
    public MotionEvent d;
    private a f;
    public d e = new d();
    private boolean g = false;

    /* compiled from: MoveDetector.java */
    public interface a {
        boolean a(b bVar);

        boolean a(b bVar, MotionEvent motionEvent);

        boolean b(b bVar);
    }

    public b(a aVar) {
        this.f = aVar;
    }

    private void a() {
        this.e.b();
        this.f8633a = null;
        this.b = null;
        this.c = null;
        this.g = true;
        this.f.b(this);
    }

    private void c(MotionEvent motionEvent) {
        a.C0399a a2 = a.C0399a.a(motionEvent);
        a.C0399a c0399a = this.c;
        if (c0399a == null) {
            c0399a = a2;
        }
        this.b = c0399a;
        this.c = a2;
        if (this.f8633a == null) {
            this.f8633a = a2;
        }
    }

    public void b(MotionEvent motionEvent) {
        this.d = motionEvent;
        int action = motionEvent.getAction();
        if (action == 2) {
            if (this.g) {
                a(motionEvent);
                return;
            } else {
                if (motionEvent.getPointerCount() == 2) {
                    a();
                    return;
                }
                return;
            }
        }
        if (action != 6) {
            if (action == 261) {
                if (this.g) {
                    return;
                }
                a();
                return;
            } else if (action != 262) {
                return;
            }
        }
        if (this.g) {
            b();
        }
    }

    private void a(MotionEvent motionEvent) {
        this.e.a(motionEvent);
        Pair<a.d, a.d> c = this.e.c();
        if (motionEvent.getPointerCount() == 2) {
            if (Math.abs(((a.d) c.first).f8625a) > 0.0d || Math.abs(((a.d) c.first).b) > 0.0d || Math.abs(((a.d) c.second).f8625a) > 0.0d || Math.abs(((a.d) c.second).b) > 0.0d) {
                c(motionEvent);
                this.f.a(this, motionEvent);
            }
        }
    }

    private void b() {
        this.e.a();
        this.g = false;
        this.f.a(this);
    }
}
