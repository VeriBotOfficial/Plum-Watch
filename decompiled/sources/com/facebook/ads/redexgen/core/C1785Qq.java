package com.facebook.ads.redexgen.core;

import android.os.Debug;
import android.os.Handler;
import android.os.Looper;
import com.facebook.ads.internal.api.BuildConfigApi;
import java.util.Arrays;
import org.tensorflow.lite.schema.BuiltinOptions;

/* renamed from: com.facebook.ads.redexgen.X.Qq, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1785Qq extends Thread {
    public static byte[] A07;
    public static final String A08;
    public final int A00;
    public final Handler A01;
    public final C1787Qs A02;
    public final C2228dL A03;
    public final Runnable A04;
    public volatile long A05;
    public volatile boolean A06;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 101);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A07 = new byte[]{BuiltinOptions.CallOnceOptions, BuiltinOptions.DensifyOptions, 12, BuiltinOptions.NonMaxSuppressionV5Options, BuiltinOptions.VarHandleOptions, BuiltinOptions.BucketizeOptions, 12, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.FillOptions, BuiltinOptions.WhereOptions, BuiltinOptions.FillOptions, BuiltinOptions.SquareOptions, BuiltinOptions.WhereOptions, BuiltinOptions.AbsOptions, BuiltinOptions.GatherNdOptions, 10, 8, 3, 8, 31, 4, 14};
    }

    static {
        A02();
        A08 = C1785Qq.class.getName();
    }

    public C1785Qq(C2228dL c2228dL, C1787Qs c1787Qs) {
        this(c2228dL, c1787Qs, U7.A08(c2228dL));
    }

    public C1785Qq(C2228dL c2228dL, C1787Qs c1787Qs, int i) {
        this.A01 = new Handler(Looper.getMainLooper());
        this.A04 = new RunnableC1784Qp(this);
        this.A05 = 0L;
        this.A06 = false;
        setName(A01(0, 15, 68));
        this.A00 = i;
        this.A03 = c2228dL;
        this.A02 = c1787Qs;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        if (AbstractC1907Vl.A02(this)) {
            return;
        }
        try {
            long j = this.A00;
            while (!isInterrupted()) {
                long interval = this.A05;
                boolean z = interval == 0;
                this.A05 = j;
                if (z) {
                    this.A01.post(this.A04);
                }
                try {
                    Thread.sleep(j);
                    long interval2 = this.A05;
                    if (interval2 != 0 && !this.A06 && !Debug.isDebuggerConnected()) {
                        if (this.A02.A05()) {
                            this.A03.A08().AAy(A01(15, 7, 8), AbstractC1841Sv.A1D, new C1842Sw(this.A02.A04()));
                        }
                        this.A06 = true;
                    }
                } catch (InterruptedException unused) {
                    BuildConfigApi.isDebug();
                    return;
                }
            }
        } catch (Throwable th) {
            AbstractC1907Vl.A00(th, this);
        }
    }
}
