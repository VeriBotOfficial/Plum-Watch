package com.iab.omid.library.bigosg.a;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;

/* loaded from: classes17.dex */
public final class d extends ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    private final Context f10894a;
    private final AudioManager b;
    private final a c;
    private final c d;
    private float e;

    public d(Handler handler, Context context, a aVar, c cVar) {
        super(handler);
        this.f10894a = context;
        this.b = (AudioManager) context.getSystemService("audio");
        this.c = aVar;
        this.d = cVar;
    }

    private boolean a(float f) {
        return f != this.e;
    }

    private float c() {
        return this.c.a(this.b.getStreamVolume(3), this.b.getStreamMaxVolume(3));
    }

    private void d() {
        this.d.a(this.e);
    }

    public final void a() {
        this.e = c();
        d();
        this.f10894a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    public final void b() {
        this.f10894a.getContentResolver().unregisterContentObserver(this);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        super.onChange(z);
        float c = c();
        if (a(c)) {
            this.e = c;
            d();
        }
    }
}
