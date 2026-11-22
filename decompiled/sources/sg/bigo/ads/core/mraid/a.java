package sg.bigo.ads.core.mraid;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;

/* loaded from: classes9.dex */
final class a extends ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    private float f20073a;
    private final Context b;
    private final InterfaceC1107a c;

    /* renamed from: sg.bigo.ads.core.mraid.a$a, reason: collision with other inner class name */
    public interface InterfaceC1107a {
        void a(float f);
    }

    a(Handler handler, Context context, InterfaceC1107a interfaceC1107a) {
        super(handler);
        this.f20073a = -1.0f;
        this.b = context.getApplicationContext();
        this.c = interfaceC1107a;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        super.onChange(z);
        float streamVolume = ((AudioManager) this.b.getSystemService("audio")) != null ? 100.0f * (r4.getStreamVolume(3) / r4.getStreamMaxVolume(3)) : 100.0f;
        if (streamVolume != this.f20073a) {
            this.f20073a = streamVolume;
            sg.bigo.ads.common.t.a.a(0, 3, "AudioVolumeContentObserver", String.format("Volume change, current value: %s", Float.valueOf(streamVolume)));
            InterfaceC1107a interfaceC1107a = this.c;
            if (interfaceC1107a != null) {
                interfaceC1107a.a(this.f20073a);
            }
        }
    }
}
