package com.facebook.ads.redexgen.core;

import android.os.Looper;
import com.facebook.ads.androidx.media3.common.Timeline;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.io.IOException;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.nF, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public interface InterfaceC2808nF extends InterfaceC11832s, CX, ET, C9Q {

    @MetaExoPlayerCustomization(type = {"TEMPORARY"}, value = "Temporary Noop Implementation until we completely migrate")
    public static final InterfaceC2808nF A00 = new InterfaceC2808nF() { // from class: com.facebook.ads.redexgen.X.9S
        @Override // com.facebook.ads.redexgen.core.InterfaceC11832s
        public final /* synthetic */ void ACv(C2854o0 c2854o0) {
        }

        @Override // com.facebook.ads.redexgen.core.InterfaceC11832s
        public final /* synthetic */ void ACw(List list) {
        }

        @Override // com.facebook.ads.redexgen.core.CX
        public final /* synthetic */ void AD6(int i, C2752mL c2752mL, CG cg) {
        }

        @Override // com.facebook.ads.redexgen.core.CX
        public final /* synthetic */ void ADw(int i, C2752mL c2752mL, CE ce, CG cg) {
        }

        @Override // com.facebook.ads.redexgen.core.CX
        public final /* synthetic */ void ADy(int i, C2752mL c2752mL, CE ce, CG cg, Object obj, Object obj2) {
        }

        @Override // com.facebook.ads.redexgen.core.CX
        public final /* synthetic */ void AE1(int i, C2752mL c2752mL, CE ce, CG cg, IOException iOException, boolean z) {
        }

        @Override // com.facebook.ads.redexgen.core.InterfaceC11832s
        public final /* synthetic */ void AEb(C2889ob c2889ob) {
        }

        @Override // com.facebook.ads.redexgen.core.InterfaceC11832s
        public final /* synthetic */ void AEd(C2891od c2891od) {
        }

        @Override // com.facebook.ads.redexgen.core.InterfaceC11832s
        public final /* synthetic */ void AEf(boolean z, int i) {
        }

        @Override // com.facebook.ads.redexgen.core.InterfaceC11832s
        public final /* synthetic */ void AFB() {
        }

        @Override // com.facebook.ads.redexgen.core.InterfaceC11832s
        public final /* synthetic */ void AFQ(Timeline timeline, int i) {
            AbstractC11822r.A00(this, timeline, i);
        }

        @Override // com.facebook.ads.redexgen.core.InterfaceC11832s
        public final /* synthetic */ void AFU(C2860o6 c2860o6) {
        }

        @Override // com.facebook.ads.redexgen.core.InterfaceC2808nF
        public final void AC5() {
        }

        @Override // com.facebook.ads.redexgen.core.InterfaceC2808nF
        public final void AIv(InterfaceC11902z interfaceC11902z, Looper looper) {
        }
    };

    void AC5();

    void AIv(InterfaceC11902z interfaceC11902z, Looper looper);
}
