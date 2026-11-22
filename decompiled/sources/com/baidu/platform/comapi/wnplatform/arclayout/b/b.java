package com.baidu.platform.comapi.wnplatform.arclayout.b;

import android.graphics.Paint;
import android.graphics.Path;

/* compiled from: ClipPathManager.java */
/* loaded from: classes13.dex */
public class b implements com.baidu.platform.comapi.wnplatform.arclayout.b.a {

    /* renamed from: a, reason: collision with root package name */
    protected final Path f8884a = new Path();
    private final Paint b;
    private a c;

    /* compiled from: ClipPathManager.java */
    public interface a {
        Path a(int i, int i2);

        boolean a();
    }

    public b() {
        Paint paint = new Paint(1);
        this.b = paint;
        this.c = null;
        paint.setColor(-16777216);
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        paint.setStrokeWidth(1.0f);
    }

    @Override // com.baidu.platform.comapi.wnplatform.arclayout.b.a
    public boolean a() {
        a aVar = this.c;
        return aVar != null && aVar.a();
    }

    @Override // com.baidu.platform.comapi.wnplatform.arclayout.b.a
    public Paint b() {
        return this.b;
    }

    protected Path c(int i, int i2) {
        a aVar = this.c;
        if (aVar != null) {
            return aVar.a(i, i2);
        }
        return null;
    }

    public void a(a aVar) {
        this.c = aVar;
    }

    @Override // com.baidu.platform.comapi.wnplatform.arclayout.b.a
    public void b(int i, int i2) {
        this.f8884a.reset();
        Path c = c(i, i2);
        if (c != null) {
            this.f8884a.set(c);
        }
    }

    @Override // com.baidu.platform.comapi.wnplatform.arclayout.b.a
    public Path a(int i, int i2) {
        return this.f8884a;
    }

    @Override // com.baidu.platform.comapi.wnplatform.arclayout.b.a
    public Path c() {
        return this.f8884a;
    }
}
