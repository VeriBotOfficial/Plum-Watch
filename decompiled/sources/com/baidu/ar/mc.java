package com.baidu.ar;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes12.dex */
public class mc {
    public static volatile mc b;

    /* renamed from: a, reason: collision with root package name */
    public List<lc> f7090a = new ArrayList();

    public static mc a() {
        if (b == null) {
            synchronized (mc.class) {
                if (b == null) {
                    b = new mc();
                }
            }
        }
        return b;
    }

    public lc a(int i) {
        List<lc> list = this.f7090a;
        if (list == null) {
            return null;
        }
        for (lc lcVar : list) {
            if (lcVar != null && lcVar.f == i) {
                return lcVar;
            }
        }
        return null;
    }

    public lc a(int i, int i2, int i3) {
        List<lc> list = this.f7090a;
        if (list != null) {
            for (lc lcVar : list) {
                if (lcVar != null && lcVar.f == i) {
                    lcVar.a(i2, i3);
                    return lcVar;
                }
            }
        }
        lc lcVar2 = new lc();
        lcVar2.a(i, i2, i3);
        List<lc> list2 = this.f7090a;
        if (list2 != null) {
            list2.add(lcVar2);
        }
        return lcVar2;
    }

    public void b() {
        List<lc> list = this.f7090a;
        if (list != null) {
            for (lc lcVar : list) {
                if (lcVar != null) {
                    lcVar.b();
                }
            }
            this.f7090a.clear();
        }
        if (b != null) {
            b = null;
        }
    }
}
