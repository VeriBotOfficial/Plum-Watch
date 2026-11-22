package com.anythink.basead.ui.guidetoclickv2.picverify;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;

/* loaded from: classes11.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    protected Context f3342a;

    public abstract Paint a();

    public abstract Path a(int i);

    public abstract c a(int i, int i2, int i3);

    public void a(Context context, Canvas canvas, Path path) {
    }

    public abstract Paint b();

    public a(Context context) {
        this.f3342a = context;
    }

    private Context c() {
        return this.f3342a;
    }

    public c b(int i, int i2, int i3) {
        return a(i, i2, i3);
    }
}
