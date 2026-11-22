package com.anythink.basead.a;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;

/* loaded from: classes11.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public static final String f2235a = "a";
    private AudioManager b;
    private AudioFocusRequest c;

    public final void a(Context context) {
        this.b = (AudioManager) context.getSystemService("audio");
        this.c = new AudioFocusRequest.Builder(2).setAudioAttributes(new AudioAttributes.Builder().setUsage(1).setContentType(3).build()).setAcceptsDelayedFocusGain(false).build();
    }

    public final boolean a() {
        return this.b.requestAudioFocus(this.c) == 1;
    }

    public final void b() {
        try {
            this.b.abandonAudioFocusRequest(this.c);
        } catch (Exception unused) {
        }
    }
}
