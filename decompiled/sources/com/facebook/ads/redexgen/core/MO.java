package com.facebook.ads.redexgen.core;

import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import com.facebook.ads.internal.action.UserReturnTracker$UserReturnListener;
import com.facebook.ads.redexgen.core.MO;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashMap;
import org.tensorflow.lite.schema.BuiltinOptions;

/* loaded from: assets/audience_network.dex */
public final class MO {
    public static byte[] A09;
    public static String[] A0A = {"jjDsG8QlYrxY", "", "TMhFK0S9G1", "6qW7u5SP6R0wlmhQUiBuXDFp8yf", "n7Dasyj9dq5sG0xOL43e0c5rVQV9l70l", "dOqhBdKnx9bW", "a7CXWDqETze4gqUmjqRBhcRjVGu0d2y8", "nE3PHSl6bqsIePbBJ"};
    public static final String A0B;
    public Application A02;
    public MG A04;
    public UserReturnTracker$UserReturnListener A05;
    public final US A08;
    public long A01 = 0;
    public long A00 = 0;
    public String A06 = null;
    public ME A03 = null;
    public boolean A07 = false;

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A09, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 17);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A09 = new byte[]{BuiltinOptions.BroadcastToOptions, BuiltinOptions.GatherNdOptions, BuiltinOptions.IfOptions, BuiltinOptions.NonMaxSuppressionV4Options, BuiltinOptions.ReverseV2Options, BuiltinOptions.MatrixDiagOptions, 29, BuiltinOptions.RangeOptions, BuiltinOptions.AddNOptions, 29, BuiltinOptions.AssignVariableOptions, BuiltinOptions.AddNOptions, BuiltinOptions.MatrixSetDiagOptions, 29, BuiltinOptions.BroadcastToOptions, BuiltinOptions.AbsOptions, BuiltinOptions.MatrixDiagOptions, BuiltinOptions.SplitVOptions, 29, BuiltinOptions.VarHandleOptions, BuiltinOptions.MatrixDiagOptions, BuiltinOptions.RangeOptions, BuiltinOptions.FloorModOptions, BuiltinOptions.SplitVOptions, BuiltinOptions.GatherNdOptions, 29, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.WhereOptions, BuiltinOptions.MatrixDiagOptions, BuiltinOptions.GatherNdOptions, 29, BuiltinOptions.RangeOptions, BuiltinOptions.AddNOptions, BuiltinOptions.RankOptions, BuiltinOptions.MatrixDiagOptions, BuiltinOptions.GatherNdOptions, 29, BuiltinOptions.CosOptions, BuiltinOptions.AbsOptions, 29, BuiltinOptions.GatherNdOptions, BuiltinOptions.FloorModOptions, BuiltinOptions.ReverseV2Options, BuiltinOptions.ReverseV2Options, 19, 2, 1, 3, 11, 63, 20, 9, 13, 5, 18, 27, 31, 8, 27, BuiltinOptions.ExpOptions, 10, 23, 19, 27, BuiltinOptions.LogicalOrOptions, BuiltinOptions.DequantizeOptions, BuiltinOptions.MaximumMinimumOptions, BuiltinOptions.SliceOptions, BuiltinOptions.LogicalOrOptions, BuiltinOptions.LogicalAndOptions, BuiltinOptions.NotEqualOptions, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.ScatterNdOptions, BuiltinOptions.GeluOptions, BuiltinOptions.HashtableOptions, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.ReadVariableOptions, BuiltinOptions.HashtableImportOptions, BuiltinOptions.Conv3DOptions, BuiltinOptions.DensifyOptions};
    }

    static {
        A03();
        A0B = MO.class.getSimpleName();
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.facebook.ads.internal.action.UserReturnTracker$UserReturnListener] */
    public MO(US us, final Activity activity, int i) {
        this.A08 = us;
        this.A02 = activity.getApplication();
        this.A05 = new Application.ActivityLifecycleCallbacks(activity, this) { // from class: com.facebook.ads.internal.action.UserReturnTracker$UserReturnListener
            public MO A00;
            public final WeakReference<Activity> A01;

            {
                this.A01 = new WeakReference<>(activity);
                this.A00 = this;
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityCreated(Activity activity2, Bundle bundle) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityDestroyed(Activity activity2) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityPaused(Activity activity2) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityResumed(Activity activity2) {
                if (this.A00 == null) {
                    return;
                }
                Activity trackedActivity = this.A01.get();
                if (trackedActivity == null || (trackedActivity != null && activity2.equals(trackedActivity))) {
                    this.A00.A05();
                }
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivitySaveInstanceState(Activity activity2, Bundle bundle) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityStarted(Activity activity2) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityStopped(Activity activity2) {
            }
        };
    }

    public static MO A00(US us, Activity activity) {
        return A01(us, activity, Build.VERSION.SDK_INT);
    }

    public static MO A01(US us, Activity activity, int i) {
        if (activity != null && i >= 14) {
            return new MO(us, activity, i);
        }
        return null;
    }

    private void A04(String str, long j, long j2, ME me) {
        HashMap hashMap = new HashMap();
        hashMap.put(A02(54, 10, 111), Long.toString(j));
        hashMap.put(A02(45, 9, 113), Long.toString(j2));
        if (me != null) {
            hashMap.put(A02(64, 7, 66), me.name());
        }
        this.A08.ABY(str, hashMap);
    }

    public final void A05() {
        this.A00 = System.currentTimeMillis();
        if (this.A00 - this.A01 < 2000 && this.A04 != null) {
            MG mg = this.A04;
            if (A0A[2].length() != 10) {
                throw new RuntimeException();
            }
            A0A[1] = "";
            mg.AEs();
        }
        if (this.A06 != null) {
            A04(this.A06, this.A01, this.A00, this.A03);
        } else {
            Application application = this.A02;
            String A02 = A02(0, 45, 44);
            if (application != null && (this.A02.getBaseContext() instanceof C2228dL)) {
                ((C2228dL) this.A02.getBaseContext()).A08().AAy(A02(71, 9, 21), AbstractC1841Sv.A22, new C1842Sw(A02));
            }
            Log.w(A0B, A02);
        }
        if (this.A02 != null && this.A05 != null) {
            this.A02.unregisterActivityLifecycleCallbacks(this.A05);
            this.A07 = false;
        }
    }

    public final void A06(ME me) {
        this.A03 = me;
    }

    public final void A07(MG mg) {
        this.A04 = mg;
    }

    public final void A08(String str) {
        this.A06 = str;
        this.A01 = System.currentTimeMillis();
        if (this.A05 == null || this.A02 == null || this.A07) {
            A04(str, -1L, -1L, ME.A05);
        } else {
            this.A07 = true;
            this.A02.registerActivityLifecycleCallbacks(this.A05);
        }
    }
}
