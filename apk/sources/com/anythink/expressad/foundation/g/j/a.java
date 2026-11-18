package com.anythink.expressad.foundation.g.j;

import android.media.MediaPlayer;

/* JADX INFO: loaded from: classes16.dex */
public final class a {
    private String b;
    private MediaPlayer c;
    private volatile boolean d;
    private volatile MediaPlayer.OnPreparedListener f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Object f4913a = new Object();
    private volatile boolean e = false;

    static /* synthetic */ boolean a(a aVar) {
        aVar.e = true;
        return true;
    }

    private void a(MediaPlayer mediaPlayer, String str) {
        this.c = mediaPlayer;
        this.b = str;
        this.d = true;
        this.c.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: com.anythink.expressad.foundation.g.j.a.1
            @Override // android.media.MediaPlayer.OnPreparedListener
            public final void onPrepared(MediaPlayer mediaPlayer2) {
                synchronized (a.this.f4913a) {
                    a.a(a.this);
                    if (a.this.f != null) {
                        a.this.f.onPrepared(mediaPlayer2);
                    }
                }
            }
        });
        try {
            this.c.prepareAsync();
        } catch (Throwable unused) {
        }
    }

    private boolean a() {
        boolean z;
        synchronized (this.f4913a) {
            z = this.d;
        }
        return z;
    }

    private boolean b() {
        boolean z;
        synchronized (this.f4913a) {
            z = this.e;
        }
        return z;
    }

    private void a(MediaPlayer.OnPreparedListener onPreparedListener) {
        synchronized (this.f4913a) {
            this.f = onPreparedListener;
        }
    }

    private String c() {
        return this.b;
    }

    private MediaPlayer d() {
        return this.c;
    }
}
