package com.anythink.core.common.f;

import android.content.Context;
import com.anythink.core.common.e.e;
import com.anythink.core.common.e.n;
import com.anythink.core.common.h.be;
import java.util.List;

/* loaded from: classes12.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    n f3801a;
    protected int b;

    protected a(Context context) {
        this.f3801a = n.a(e.a(context));
    }

    public final void a(String str, int i, int i2) {
        this.f3801a.a(this.b, str, i, i2);
    }

    public final void a(String str, long j) {
        this.f3801a.a(this.b, str, j);
    }

    public final void a(String str, String str2) {
        this.f3801a.a(str, this.b, str2);
    }

    private List<be> a() {
        return this.f3801a.a(this.b);
    }

    public final List<be> a(List<String> list) {
        return this.f3801a.a(list, this.b);
    }
}
