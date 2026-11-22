package com.facebook.ads.redexgen.core;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.util.Arrays;
import org.tensorflow.lite.schema.BuiltinOptions;

/* renamed from: com.facebook.ads.redexgen.X.8f, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C13228f {
    public static byte[] A0A;
    public static String[] A0B = {"rRI8qFzkORd3qFRWXYKq4VZ7aOLIEK5J", "8iww", "9Fk01UJleHjJYWOvUCOjDovINy", "Tv7H9N81DtUxkF43CmkgrLrGhTLdsXix", "nBkKdwNSwO57UCO3SoKJGDMTXuqjBDbM", "lOXwNuIjFjHmQAdnwK2N8OZR9kPb", "lPFUJhDD1cvxNL1LCxfPRC2f3Pky1Kvn", "6r"};
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final C2905or A07;
    public final boolean A08;
    public final AnonymousClass38[] A09;

    public static String A06(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0A, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 4);
        }
        return new String(copyOfRange);
    }

    public static void A07() {
        A0A = new byte[]{5, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.MaximumMinimumOptions, 32, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.GreaterEqualOptions, BuiltinOptions.EqualOptions, 0, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.CastOptions, BuiltinOptions.ArgMaxOptions, BuiltinOptions.LessEqualOptions, 18, BuiltinOptions.ArgMaxOptions, BuiltinOptions.SelectOptions, BuiltinOptions.NegOptions, BuiltinOptions.ArgMaxOptions, 63, 35, BuiltinOptions.DequantizeOptions, BuiltinOptions.LessEqualOptions, 11, 63, BuiltinOptions.LessEqualOptions, 35, BuiltinOptions.CastOptions, 30, BuiltinOptions.PowOptions, BuiltinOptions.PadV2Options, BuiltinOptions.LessOptions, BuiltinOptions.ExpOptions, BuiltinOptions.ReadVariableOptions, BuiltinOptions.Conv3DOptions, BuiltinOptions.ArgMinOptions, BuiltinOptions.LogicalAndOptions, BuiltinOptions.PadV2Options, BuiltinOptions.LogicalAndOptions, BuiltinOptions.SelectOptions, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.VarHandleOptions, BuiltinOptions.LessEqualOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.Conv3DOptions, BuiltinOptions.PadV2Options, 63, BuiltinOptions.LessEqualOptions, 35, BuiltinOptions.CastOptions, 30, BuiltinOptions.PowOptions, BuiltinOptions.PadV2Options, BuiltinOptions.LessOptions, BuiltinOptions.ExpOptions, 11, BuiltinOptions.DequantizeOptions, BuiltinOptions.DequantizeOptions, BuiltinOptions.CastOptions, BuiltinOptions.LessOptions, BuiltinOptions.PadV2Options, BuiltinOptions.LogicalAndOptions, BuiltinOptions.SelectOptions, BuiltinOptions.LessEqualOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.GreaterEqualOptions, BuiltinOptions.SelectOptions, BuiltinOptions.LogicalAndOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.DensifyOptions, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.VarHandleOptions, BuiltinOptions.LessEqualOptions};
    }

    static {
        A07();
    }

    public C13228f(C2905or c2905or, int i, int i2, int i3, int i4, int i5, int i6, int i7, AnonymousClass38[] anonymousClass38Arr, boolean z) {
        this.A07 = c2905or;
        this.A01 = i;
        this.A04 = i2;
        this.A05 = i3;
        this.A06 = i4;
        this.A02 = i5;
        this.A03 = i6;
        this.A00 = i7;
        this.A09 = anonymousClass38Arr;
        this.A08 = z;
    }

    public static AudioAttributes A00() {
        return new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build();
    }

    public static AudioAttributes A01(C2911oy c2911oy, boolean z) {
        if (z) {
            return A00();
        }
        return c2911oy.A01().A00;
    }

    private AudioTrack A02(C2911oy c2911oy, int i) {
        int A04 = AbstractC12174a.A04(c2911oy.A05);
        if (i != 0) {
            return new AudioTrack(A04, this.A06, this.A02, this.A03, this.A00, 1, i);
        }
        return new AudioTrack(A04, this.A06, this.A02, this.A03, this.A00, 1);
    }

    private AudioTrack A03(boolean z, C2911oy c2911oy, int i) {
        if (AbstractC12174a.A02 >= 29) {
            return A05(z, c2911oy, i);
        }
        if (AbstractC12174a.A02 >= 21) {
            return A04(z, c2911oy, i);
        }
        AudioTrack A02 = A02(c2911oy, i);
        String[] strArr = A0B;
        if (strArr[5].length() == strArr[7].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0B;
        strArr2[5] = "QYyaIvQJX9uBRZ92y0XmWMx9BnIt";
        strArr2[7] = "OM";
        return A02;
    }

    private AudioTrack A04(boolean z, C2911oy c2911oy, int i) {
        AudioFormat A0D;
        AudioAttributes A01 = A01(c2911oy, z);
        A0D = C2789mw.A0D(this.A06, this.A02, this.A03);
        return new AudioTrack(A01, A0D, this.A00, 1, i);
    }

    private AudioTrack A05(boolean z, C2911oy c2911oy, int i) {
        AudioFormat A0D;
        A0D = C2789mw.A0D(this.A06, this.A02, this.A03);
        AudioAttributes audioTrackAttributes = A01(c2911oy, z);
        AudioTrack.Builder audioFormat = new AudioTrack.Builder().setAudioAttributes(audioTrackAttributes).setAudioFormat(A0D);
        boolean z2 = true;
        AudioTrack.Builder sessionId = audioFormat.setTransferMode(1).setBufferSizeInBytes(this.A00).setSessionId(i);
        if (this.A04 != 1) {
            z2 = false;
        }
        AudioTrack build = sessionId.setOffloadedPlayback(z2).build();
        String[] strArr = A0B;
        if (strArr[4].length() == strArr[2].length()) {
            throw new RuntimeException();
        }
        A0B[1] = "btQ69Jh";
        return build;
    }

    public final long A08(long j) {
        return (1000000 * j) / this.A06;
    }

    public final long A09(long j) {
        return (1000000 * j) / this.A07.A0G;
    }

    @MetaExoPlayerCustomization(type = {"FEATURE_LOGIC"}, value = "D23918943: Monitor the audio track usage through audioTrackAllocated")
    public final AudioTrack A0A(boolean z, C2911oy c2911oy, int i) throws C8H {
        try {
            AudioTrack A03 = A03(z, c2911oy, i);
            C2789mw.A0M().incrementAndGet();
            int state = A03.getState();
            if (state == 1) {
                return A03;
            }
            try {
                A03.release();
                C2789mw.A0M().decrementAndGet();
            } catch (Exception e) {
                AnonymousClass44.A08(A06(0, 16, 69), String.format(A06(16, 55, 78), Integer.valueOf(state), Integer.valueOf(C2789mw.A0M().get())), e);
            }
            throw new C8H(state, this.A06, this.A02, this.A00, this.A07, A0D(), null, C2789mw.A0M().get());
        } catch (IllegalArgumentException | UnsupportedOperationException e2) {
            throw new C8H(0, this.A06, this.A02, this.A00, this.A07, A0D(), e2, C2789mw.A0M().get());
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.facebook.ads.redexgen.X.8F] */
    public final C8F A0B() {
        final int i = this.A03;
        final int i2 = this.A06;
        final int i3 = this.A02;
        final boolean z = this.A08;
        final boolean z2 = this.A04 == 1;
        final int i4 = this.A00;
        return new Object(i, i2, i3, z, z2, i4) { // from class: com.facebook.ads.redexgen.X.8F
            public final int A00;
            public final int A01;
            public final int A02;
            public final int A03;
            public final boolean A04;
            public final boolean A05;

            {
                this.A02 = i;
                this.A03 = i2;
                this.A01 = i3;
                this.A05 = z;
                this.A04 = z2;
                this.A00 = i4;
            }
        };
    }

    public final C13228f A0C(int i) {
        return new C13228f(this.A07, this.A01, this.A04, this.A05, this.A06, this.A02, this.A03, i, this.A09, this.A08);
    }

    public final boolean A0D() {
        return this.A04 == 1;
    }

    public final boolean A0E(C13228f c13228f) {
        return c13228f.A04 == this.A04 && c13228f.A03 == this.A03 && c13228f.A06 == this.A06 && c13228f.A02 == this.A02 && c13228f.A05 == this.A05;
    }
}
