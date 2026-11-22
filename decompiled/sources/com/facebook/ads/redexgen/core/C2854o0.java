package com.facebook.ads.redexgen.core;

import android.os.Bundle;
import com.facebook.ads.androidx.media3.common.text.Cue;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.o0, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C2854o0 implements C1S {
    public final long A00;

    @MetaExoPlayerCustomization("Oculus does not work well with Google Guava")
    public final List<C2856o2> A01;
    public static final C2854o0 A03 = new C2854o0(MetaExoPlayerCustomizedCollections.A01(), 0);
    public static final String A04 = AbstractC12174a.A0h(0);
    public static final String A05 = AbstractC12174a.A0h(1);
    public static final C1R<C2854o0> A02 = new C1R() { // from class: com.facebook.ads.redexgen.X.o1
        @Override // com.facebook.ads.redexgen.core.C1R
        public final C1S A6X(Bundle bundle) {
            C2854o0 A00;
            A00 = C2854o0.A00(bundle);
            return A00;
        }
    };

    @MetaExoPlayerCustomization("Oculus does not work well with Google Guava")
    public C2854o0(List<C2856o2> list, long j) {
        this.A01 = MetaExoPlayerCustomizedCollections.A03((C2856o2[]) list.toArray(new C2856o2[0]));
        this.A00 = j;
    }

    public static final C2854o0 A00(Bundle bundle) {
        List A01;
        List<Cue> cues = bundle.getParcelableArrayList(A04);
        if (cues == null) {
            A01 = MetaExoPlayerCustomizedCollections.A01();
        } else {
            A01 = C3S.A01(C2856o2.A0I, cues);
        }
        return new C2854o0(A01, bundle.getLong(A05));
    }
}
