package com.anythink.basead.exoplayer.b;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.anythink.basead.exoplayer.k.af;

/* loaded from: classes11.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    c f2372a;
    private final Context b;
    private final b c;
    private final BroadcastReceiver d;

    public interface b {
        void a();
    }

    private d(Context context, b bVar) {
        this.b = (Context) com.anythink.basead.exoplayer.k.a.a(context);
        this.c = (b) com.anythink.basead.exoplayer.k.a.a(bVar);
        this.d = af.f2668a >= 21 ? new a(this, (byte) 0) : null;
    }

    private c a() {
        BroadcastReceiver broadcastReceiver = this.d;
        c a2 = c.a(broadcastReceiver == null ? null : this.b.registerReceiver(broadcastReceiver, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")));
        this.f2372a = a2;
        return a2;
    }

    private void b() {
        BroadcastReceiver broadcastReceiver = this.d;
        if (broadcastReceiver != null) {
            this.b.unregisterReceiver(broadcastReceiver);
        }
    }

    private final class a extends BroadcastReceiver {
        private a() {
        }

        /* synthetic */ a(d dVar, byte b) {
            this();
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if (isInitialStickyBroadcast()) {
                return;
            }
            c a2 = c.a(intent);
            if (a2.equals(d.this.f2372a)) {
                return;
            }
            d.this.f2372a = a2;
            b unused = d.this.c;
        }
    }
}
