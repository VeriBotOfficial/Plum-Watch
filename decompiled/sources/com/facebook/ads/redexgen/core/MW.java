package com.facebook.ads.redexgen.core;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;
import org.tensorflow.lite.schema.BuiltinOptions;

/* loaded from: assets/audience_network.dex */
public final class MW {
    public static MW A08;
    public static byte[] A09;
    public static final String A0A;
    public boolean A01;
    public final SQ A03;
    public final String A04;
    public final Executor A07;
    public final CountDownLatch A05 = new CountDownLatch(1);
    public final CountDownLatch A06 = new CountDownLatch(1);
    public final MV A02 = new MV();
    public String A00 = null;

    public static String A03(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A09, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 24);
        }
        return new String(copyOfRange);
    }

    public static void A09() {
        A09 = new byte[]{BuiltinOptions.FloorDivOptions, 64, BuiltinOptions.AddNOptions, BuiltinOptions.ArgMinOptions, BuiltinOptions.GreaterOptions, BuiltinOptions.HardSwishOptions, BuiltinOptions.DepthToSpaceOptions, BuiltinOptions.RangeOptions, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.HardSwishOptions, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.GatherNdOptions, BuiltinOptions.CosOptions, BuiltinOptions.WhileOptions, BuiltinOptions.BucketizeOptions, BuiltinOptions.CosOptions, BuiltinOptions.IfOptions, BuiltinOptions.WhereOptions, 20, BuiltinOptions.AbsOptions, BuiltinOptions.SquareOptions, BuiltinOptions.AbsOptions, BuiltinOptions.FloorModOptions, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.HardSwishOptions, BuiltinOptions.HardSwishOptions, BuiltinOptions.AbsOptions, BuiltinOptions.SplitVOptions, BuiltinOptions.Conv3DOptions, BuiltinOptions.SplitVOptions, BuiltinOptions.MatrixDiagOptions, 5, BuiltinOptions.NonMaxSuppressionV4Options, BuiltinOptions.GatherNdOptions, BuiltinOptions.NonMaxSuppressionV4Options, BuiltinOptions.SquareOptions, BuiltinOptions.RankOptions, BuiltinOptions.FloorDivOptions, BuiltinOptions.WhereOptions, BuiltinOptions.ReverseV2Options, BuiltinOptions.FloorDivOptions, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.WhileOptions, BuiltinOptions.SignOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.CosOptions, BuiltinOptions.CosOptions, BuiltinOptions.MirrorPadOptions, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.ZerosLikeOptions};
    }

    static {
        A09();
        A0A = MW.class.getSimpleName();
    }

    public MW(SQ sq, boolean z, Executor executor, String str) {
        this.A03 = sq.A02();
        this.A04 = str;
        this.A07 = executor;
        if (z) {
            A0A();
        }
    }

    public static synchronized MW A01(SQ sq) {
        MW mw;
        synchronized (MW.class) {
            if (A08 == null) {
                A08 = new MW(sq, true, XU.A06, A03(0, 0, 18));
            }
            mw = A08;
        }
        return mw;
    }

    private String A04(String str) {
        String A03 = A03(0, 0, 18);
        try {
            synchronized (this) {
                File file = new File(this.A03.getFilesDir(), str);
                if (file.exists() && file.length() > 0) {
                    FileInputStream fileInputStream = new FileInputStream(file);
                    byte[] data = new byte[(int) file.length()];
                    fileInputStream.read(data);
                    fileInputStream.close();
                    String fileContent = A03(0, 5, 12);
                    A03 = new String(data, fileContent);
                }
            }
        } catch (FileNotFoundException e) {
            this.A03.A08().AAy(A03(36, 17, 60), AbstractC1841Sv.A17, new C1842Sw(e));
        } catch (IOException e2) {
            this.A03.A08().AAy(A03(36, 17, 60), AbstractC1841Sv.A19, new C1842Sw(e2));
        }
        return A03;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A07() {
        String A03 = A03(36, 17, 60);
        try {
            this.A02.A08(A04(this.A04 + A03(23, 13, 51)));
            this.A02.A0A(A04(A03(5, 18, 34)));
        } catch (C1842Sw e) {
            A0M();
            this.A03.A08().AAy(A03, AbstractC1841Sv.A18, e);
        } catch (JSONException e2) {
            A0M();
            this.A03.A08().AAy(A03, AbstractC1841Sv.A1A, new C1842Sw(e2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A08() {
        String adsFrequencyCappingDataList;
        synchronized (this.A02) {
            adsFrequencyCappingDataList = this.A02.A05().toString();
        }
        A0G(A0K(), adsFrequencyCappingDataList);
    }

    private final void A0A() {
        this.A07.execute(new C2543ii(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void A0E(N2 n2, String str, boolean z) {
        n2.A07(z);
        if (n2.A08() || n2.A09()) {
            this.A02.A07(str);
        } else {
            this.A02.A09(str);
        }
    }

    private void A0F(String str) {
        File file = new File(this.A03.getFilesDir(), str);
        if (file.exists()) {
            file.delete();
        }
    }

    private final synchronized void A0G(String str, String str2) {
        A0H(this.A04 + A03(23, 13, 51), str.getBytes());
        A0H(A03(5, 18, 34), str2.getBytes());
    }

    private void A0H(String str, byte[] bArr) {
        try {
            synchronized (this) {
                File file = new File(this.A03.getFilesDir(), str);
                FileOutputStream fout = new FileOutputStream(file);
                fout.write(bArr);
                fout.close();
            }
        } catch (FileNotFoundException e) {
            this.A03.A08().AAy(A03(36, 17, 60), AbstractC1841Sv.A17, new C1842Sw(e));
        } catch (IOException e2) {
            this.A03.A08().AAy(A03(36, 17, 60), AbstractC1841Sv.A19, new C1842Sw(e2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A0J(String str) {
        boolean z = false;
        try {
            synchronized (this.A02) {
                z = this.A02.A05().get(str) instanceof N2;
            }
        } catch (JSONException e) {
            this.A03.A08().AAy(A03(36, 17, 60), AbstractC1841Sv.A1A, new C1842Sw(e));
        }
        return z;
    }

    public final String A0K() {
        return this.A02.A04();
    }

    public final void A0L() {
        if (!this.A01 || this.A00 == null) {
            return;
        }
        this.A07.execute(new C2541ie(this, this.A00));
    }

    public final synchronized void A0M() {
        A0F(this.A04 + A03(5, 18, 34));
        A0F(this.A04 + A03(23, 13, 51));
    }

    public final void A0N(String str) {
        if (!this.A01) {
            return;
        }
        this.A00 = str;
        this.A07.execute(new Cif(this, str));
    }

    public final void A0O(JSONObject jSONObject) {
        this.A01 = U7.A1D(this.A03);
        if (!this.A01) {
            return;
        }
        this.A07.execute(new C2542ih(this, jSONObject));
    }
}
