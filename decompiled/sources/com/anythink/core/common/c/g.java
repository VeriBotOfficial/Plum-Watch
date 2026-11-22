package com.anythink.core.common.c;

import android.content.Context;
import android.text.TextUtils;
import com.anythink.core.common.d.u;
import com.anythink.core.common.v.af;
import com.anythink.core.common.v.m;

/* loaded from: classes12.dex */
public final class g extends e {
    @Override // com.anythink.core.common.c.f
    public final int b() {
        return 1;
    }

    public g(Context context, String str, String str2, long j) {
        super(context, str, str2, j);
    }

    @Override // com.anythink.core.common.c.f
    public final c a() {
        String c;
        boolean z;
        if (System.currentTimeMillis() - this.h > 86400000) {
            c = m.a(this.f, this.e);
            af.b(this.f, u.b.f3741a, "det" + this.g, c);
            af.a(this.f, u.b.f3741a, "det_time_" + this.g, System.currentTimeMillis());
            z = true;
        } else {
            c = af.c(this.f, u.b.f3741a, "det" + this.g, "");
            z = false;
        }
        return new c(this.e, this.g, z, z ? System.currentTimeMillis() : this.h, !TextUtils.isEmpty(r10), c);
    }
}
