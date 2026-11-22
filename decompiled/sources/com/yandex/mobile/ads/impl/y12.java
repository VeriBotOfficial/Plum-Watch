package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.ko;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes5.dex */
public final class y12 {

    /* renamed from: a, reason: collision with root package name */
    private final ko f17385a;
    private final b b;

    /* JADX INFO: Access modifiers changed from: private */
    interface b {
    }

    private y12(x12 x12Var, ko koVar) {
        this.b = x12Var;
        this.f17385a = koVar;
    }

    public final List<String> a(CharSequence charSequence) {
        charSequence.getClass();
        x12 x12Var = (x12) this.b;
        x12Var.getClass();
        w12 w12Var = new w12(x12Var, this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (w12Var.hasNext()) {
            arrayList.add(w12Var.next());
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static y12 a(char c) {
        return new y12(new x12(new ko.b(c)), ko.d.c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    static abstract class a extends l<String> {
        final CharSequence d;
        final ko e;
        int g = 0;
        final boolean f = false;
        int h = Integer.MAX_VALUE;

        protected a(y12 y12Var, CharSequence charSequence) {
            this.e = y12Var.f17385a;
            this.d = charSequence;
        }
    }
}
