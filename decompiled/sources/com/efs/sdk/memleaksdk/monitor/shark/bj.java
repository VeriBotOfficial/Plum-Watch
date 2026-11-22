package com.efs.sdk.memleaksdk.monitor.shark;

import com.efs.sdk.memleaksdk.monitor.shark.LeakTraceObject;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 1})
/* loaded from: classes14.dex */
public final /* synthetic */ class bj {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f9836a;

    static {
        int[] iArr = new int[LeakTraceObject.b.values().length];
        f9836a = iArr;
        iArr[LeakTraceObject.b.UNKNOWN.ordinal()] = 1;
        iArr[LeakTraceObject.b.NOT_LEAKING.ordinal()] = 2;
        iArr[LeakTraceObject.b.LEAKING.ordinal()] = 3;
    }
}
