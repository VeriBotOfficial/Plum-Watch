package com.efs.sdk.memleaksdk.monitor.shark;

import com.efs.sdk.memleaksdk.monitor.shark.LeakTraceObject;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 1})
/* loaded from: classes14.dex */
public final /* synthetic */ class as {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f9787a;
    public static final /* synthetic */ int[] b;
    public static final /* synthetic */ int[] c;
    public static final /* synthetic */ int[] d;

    static {
        int[] iArr = new int[LeakTraceObject.b.values().length];
        f9787a = iArr;
        iArr[LeakTraceObject.b.LEAKING.ordinal()] = 1;
        iArr[LeakTraceObject.b.UNKNOWN.ordinal()] = 2;
        iArr[LeakTraceObject.b.NOT_LEAKING.ordinal()] = 3;
        int[] iArr2 = new int[LeakTraceObject.b.values().length];
        b = iArr2;
        iArr2[LeakTraceObject.b.LEAKING.ordinal()] = 1;
        iArr2[LeakTraceObject.b.UNKNOWN.ordinal()] = 2;
        iArr2[LeakTraceObject.b.NOT_LEAKING.ordinal()] = 3;
        int[] iArr3 = new int[LeakTraceObject.b.values().length];
        c = iArr3;
        iArr3[LeakTraceObject.b.UNKNOWN.ordinal()] = 1;
        iArr3[LeakTraceObject.b.NOT_LEAKING.ordinal()] = 2;
        iArr3[LeakTraceObject.b.LEAKING.ordinal()] = 3;
        int[] iArr4 = new int[LeakTraceObject.b.values().length];
        d = iArr4;
        iArr4[LeakTraceObject.b.UNKNOWN.ordinal()] = 1;
        iArr4[LeakTraceObject.b.LEAKING.ordinal()] = 2;
        iArr4[LeakTraceObject.b.NOT_LEAKING.ordinal()] = 3;
    }
}
