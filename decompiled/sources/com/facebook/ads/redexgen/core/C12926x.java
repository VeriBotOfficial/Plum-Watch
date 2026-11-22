package com.facebook.ads.redexgen.core;

import com.facebook.ads.androidx.media3.common.Timeline;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;

/* renamed from: com.facebook.ads.redexgen.X.6x, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C12926x {
    public static final C2752mL A0E = new C2752mL(new Object());
    public final int A00;
    public final long A01;
    public final long A02;
    public final Timeline A03;
    public final C2752mL A04;
    public final C2752mL A05;
    public final C2742mA A06;
    public final EL A07;

    @MetaExoPlayerCustomization(type = {"NEW_CLASS_ARG"}, value = "Start Stall Logging")
    public final EnumC2481hX A08;

    @MetaExoPlayerCustomization(type = {"NEW_CLASS_ARG"}, value = "Determine if stall is from Audio for logging")
    public final boolean A09;
    public final boolean A0A;
    public volatile long A0B;
    public volatile long A0C;
    public volatile long A0D;

    public C12926x(Timeline timeline, long j, C2742mA c2742mA, EL el) {
        this(timeline, A0E, j, -9223372036854775807L, 1, false, c2742mA, el, A0E, j, j, j, EnumC2481hX.A09, false);
    }

    @MetaExoPlayerCustomization(type = {"FEATURE_LOGIC"}, value = "Customized to call base constructor")
    public C12926x(Timeline timeline, C2752mL c2752mL, long j, long j2, int i, boolean z, C2742mA c2742mA, EL el, C2752mL c2752mL2, long j3, long j4, long j5) {
        this(timeline, c2752mL, j, j2, i, z, c2742mA, el, c2752mL2, j3, j4, j5, EnumC2481hX.A09, false);
    }

    @MetaExoPlayerCustomization(type = {"FEATURE_LOGIC"}, value = "Customized to add new parameters")
    public C12926x(@MetaExoPlayerCustomization(type = {"NEW_METHOD_ARGS"}) Timeline timeline, @MetaExoPlayerCustomization(type = {"NEW_METHOD_ARGS"}) C2752mL c2752mL, long j, long j2, int i, boolean z, C2742mA c2742mA, EL el, C2752mL c2752mL2, long j3, long j4, long j5, EnumC2481hX enumC2481hX, boolean z2) {
        this.A03 = timeline;
        this.A05 = c2752mL;
        this.A02 = j;
        this.A01 = j2;
        this.A0C = j;
        this.A00 = i;
        this.A0A = z;
        this.A06 = c2742mA;
        this.A07 = el;
        this.A04 = c2752mL2;
        this.A0B = j3;
        this.A0D = j4;
        this.A0C = j5;
        this.A08 = enumC2481hX;
        this.A09 = z2;
    }

    public static void A00(C12926x c12926x, C12926x c12926x2) {
        c12926x2.A0C = c12926x.A0C;
        c12926x2.A0B = c12926x.A0B;
        c12926x2.A0D = c12926x.A0D;
    }

    public final C12926x A01(int i) {
        C12926x c12926x = new C12926x(this.A03, this.A05, this.A02, this.A01, i, this.A0A, this.A06, this.A07, this.A04, this.A0B, this.A0D, this.A0C, this.A08, this.A09);
        A00(this, c12926x);
        return c12926x;
    }

    @MetaExoPlayerCustomization(type = {"FEATURE_LOGIC"}, value = "Stall Reason Logging in Hero")
    public final C12926x A02(int i, EnumC2481hX enumC2481hX, boolean z) {
        C12926x c12926x = new C12926x(this.A03, this.A05, this.A02, this.A01, i, this.A0A, this.A06, this.A07, this.A04, this.A0B, this.A0D, this.A0C, enumC2481hX, z);
        A00(this, c12926x);
        return c12926x;
    }

    @MetaExoPlayerCustomization(type = {"FEATURE_LOGIC"}, value = "To track Audio Stalls for Logging")
    public final C12926x A03(int i, boolean z) {
        C12926x c12926x = new C12926x(this.A03, this.A05, this.A02, this.A01, i, this.A0A, this.A06, this.A07, this.A04, this.A0B, this.A0D, this.A0C, this.A08, z);
        A00(this, c12926x);
        return c12926x;
    }

    public final C12926x A04(Timeline timeline) {
        C12926x c12926x = new C12926x(timeline, this.A05, this.A02, this.A01, this.A00, this.A0A, this.A06, this.A07, this.A04, this.A0B, this.A0D, this.A0C, this.A08, this.A09);
        A00(this, c12926x);
        return c12926x;
    }

    public final C12926x A05(C2752mL c2752mL) {
        return new C12926x(this.A03, this.A05, this.A02, this.A01, this.A00, this.A0A, this.A06, this.A07, c2752mL, this.A0B, this.A0D, this.A0C, this.A08, this.A09);
    }

    public final C12926x A06(C2752mL c2752mL, long j, long j2, long j3) {
        long j4 = j2;
        Timeline timeline = this.A03;
        if (!c2752mL.A00()) {
            j4 = -9223372036854775807L;
        }
        return new C12926x(timeline, c2752mL, j, j4, this.A00, this.A0A, this.A06, this.A07, this.A04, this.A0B, j3, j);
    }

    public final C12926x A07(C2742mA c2742mA, EL el) {
        C12926x c12926x = new C12926x(this.A03, this.A05, this.A02, this.A01, this.A00, this.A0A, c2742mA, el, this.A04, this.A0B, this.A0D, this.A0C, this.A08, this.A09);
        A00(this, c12926x);
        return c12926x;
    }

    public final C12926x A08(boolean z) {
        C12926x c12926x = new C12926x(this.A03, this.A05, this.A02, this.A01, this.A00, z, this.A06, this.A07, this.A04, this.A0B, this.A0D, this.A0C, this.A08, this.A09);
        A00(this, c12926x);
        return c12926x;
    }
}
