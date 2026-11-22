package com.efs.sdk.memleaksdk.monitor.shark;

import com.efs.sdk.memleaksdk.monitor.shark.LeakTraceReference;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 1})
/* loaded from: classes14.dex */
public final /* synthetic */ class bl {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f9839a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[LeakTraceReference.b.values().length];
        f9839a = iArr;
        iArr[LeakTraceReference.b.ARRAY_ENTRY.ordinal()] = 1;
        iArr[LeakTraceReference.b.STATIC_FIELD.ordinal()] = 2;
        iArr[LeakTraceReference.b.INSTANCE_FIELD.ordinal()] = 3;
        iArr[LeakTraceReference.b.LOCAL.ordinal()] = 4;
        int[] iArr2 = new int[LeakTraceReference.b.values().length];
        b = iArr2;
        iArr2[LeakTraceReference.b.ARRAY_ENTRY.ordinal()] = 1;
        iArr2[LeakTraceReference.b.STATIC_FIELD.ordinal()] = 2;
        iArr2[LeakTraceReference.b.INSTANCE_FIELD.ordinal()] = 3;
        iArr2[LeakTraceReference.b.LOCAL.ordinal()] = 4;
    }
}
