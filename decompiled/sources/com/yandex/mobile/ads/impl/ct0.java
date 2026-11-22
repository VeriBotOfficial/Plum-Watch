package com.yandex.mobile.ads.impl;

import android.location.Location;
import com.yandex.mobile.ads.impl.jo1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class ct0 {

    /* renamed from: a, reason: collision with root package name */
    private final Object f15222a;

    public ct0(Object taskObject) {
        Intrinsics.checkNotNullParameter(taskObject, "taskObject");
        this.f15222a = taskObject;
    }

    public final boolean b() {
        Object a2 = jo1.a.a(this.f15222a, "isComplete", new Object[0]);
        Boolean bool = a2 instanceof Boolean ? (Boolean) a2 : null;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public final Location a() {
        Object a2 = jo1.a.a(this.f15222a, "getResult", new Object[0]);
        if (a2 instanceof Location) {
            return (Location) a2;
        }
        return null;
    }
}
