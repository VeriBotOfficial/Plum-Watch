package io.appmetrica.analytics.impl;

import android.util.SparseArray;
import com.huawei.hms.support.api.entity.core.CommonCode;

/* loaded from: classes6.dex */
public final class Mc {
    public static final SparseArray c;

    /* renamed from: a, reason: collision with root package name */
    public final String f17973a;
    public final String b;

    static {
        SparseArray sparseArray = new SparseArray();
        c = sparseArray;
        EnumC3271hb enumC3271hb = EnumC3271hb.EVENT_TYPE_UNDEFINED;
        sparseArray.put(5891, new Mc("jvm", "binder"));
        EnumC3271hb enumC3271hb2 = EnumC3271hb.EVENT_TYPE_UNDEFINED;
        sparseArray.put(5890, new Mc("jvm", CommonCode.Resolution.HAS_RESOLUTION_FROM_APK));
        EnumC3271hb enumC3271hb3 = EnumC3271hb.EVENT_TYPE_UNDEFINED;
        sparseArray.put(5889, new Mc("jvm", "file"));
        EnumC3271hb enumC3271hb4 = EnumC3271hb.EVENT_TYPE_UNDEFINED;
        sparseArray.put(5897, new Mc("jni_native", "file"));
        EnumC3271hb enumC3271hb5 = EnumC3271hb.EVENT_TYPE_UNDEFINED;
        sparseArray.put(5898, new Mc("jni_native", "file"));
    }

    public Mc(String str, String str2) {
        this.f17973a = str;
        this.b = str2;
    }
}
