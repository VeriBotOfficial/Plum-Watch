package com.baidu.ar;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes12.dex */
public class c3 extends b3 {
    public ArrayList<b3> d;

    public c3() {
        a("DetectorGroup");
    }

    public void a(b3 b3Var) {
        if (this.d == null) {
            this.d = new ArrayList<>();
        }
        this.d.add(b3Var);
    }

    public boolean b(String str) {
        Iterator<b3> it = this.d.iterator();
        while (it.hasNext()) {
            if (it.next().a().equals(str)) {
                return true;
            }
        }
        return false;
    }

    public ArrayList<b3> d() {
        return this.d;
    }
}
