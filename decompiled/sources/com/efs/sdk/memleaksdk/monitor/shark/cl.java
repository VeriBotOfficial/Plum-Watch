package com.efs.sdk.memleaksdk.monitor.shark;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 1})
/* loaded from: classes14.dex */
public final /* synthetic */ class cl {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f9869a;

    static {
        int[] iArr = new int[HprofRecordTag.values().length];
        f9869a = iArr;
        iArr[HprofRecordTag.CLASS_DUMP.ordinal()] = 1;
        iArr[HprofRecordTag.INSTANCE_DUMP.ordinal()] = 2;
        iArr[HprofRecordTag.OBJECT_ARRAY_DUMP.ordinal()] = 3;
        iArr[HprofRecordTag.PRIMITIVE_ARRAY_DUMP.ordinal()] = 4;
    }
}
