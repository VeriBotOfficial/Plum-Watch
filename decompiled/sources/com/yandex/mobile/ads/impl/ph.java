package com.yandex.mobile.ads.impl;

import android.media.AudioAttributes;
import android.os.Bundle;
import com.yandex.mobile.ads.impl.km;

/* loaded from: classes5.dex */
public final class ph implements km {
    public static final ph h = new ph(0, 0, 1, 1, 0);
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    private c g;

    static {
        new km.a() { // from class: com.yandex.mobile.ads.impl.ph$$ExternalSyntheticLambda0
            @Override // com.yandex.mobile.ads.impl.km.a
            public final km fromBundle(Bundle bundle) {
                ph a2;
                a2 = ph.a(bundle);
                return a2;
            }
        };
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final AudioAttributes f16563a;

        private c(ph phVar) {
            AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(phVar.b).setFlags(phVar.c).setUsage(phVar.d);
            int i = f92.f15466a;
            if (i >= 29) {
                a.a(usage, phVar.e);
            }
            if (i >= 32) {
                b.a(usage, phVar.f);
            }
            this.f16563a = usage.build();
        }
    }

    private ph(int i, int i2, int i3, int i4, int i5) {
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
    }

    public final c a() {
        if (this.g == null) {
            this.g = new c();
        }
        return this.g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ph a(Bundle bundle) {
        return new ph(bundle.containsKey(Integer.toString(0, 36)) ? bundle.getInt(Integer.toString(0, 36)) : 0, bundle.containsKey(Integer.toString(1, 36)) ? bundle.getInt(Integer.toString(1, 36)) : 0, bundle.containsKey(Integer.toString(2, 36)) ? bundle.getInt(Integer.toString(2, 36)) : 1, bundle.containsKey(Integer.toString(3, 36)) ? bundle.getInt(Integer.toString(3, 36)) : 1, bundle.containsKey(Integer.toString(4, 36)) ? bundle.getInt(Integer.toString(4, 36)) : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ph.class == obj.getClass()) {
            ph phVar = (ph) obj;
            if (this.b == phVar.b && this.c == phVar.c && this.d == phVar.d && this.e == phVar.e && this.f == phVar.f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.b + 527) * 31) + this.c) * 31) + this.d) * 31) + this.e) * 31) + this.f;
    }

    private static final class a {
        public static void a(AudioAttributes.Builder builder, int i) {
            builder.setAllowedCapturePolicy(i);
        }
    }

    private static final class b {
        public static void a(AudioAttributes.Builder builder, int i) {
            builder.setSpatializationBehavior(i);
        }
    }
}
