package com.huawei.hms.activity.internal;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes14.dex */
public class ForegroundBusResponseMgr {
    private static final ForegroundBusResponseMgr b = new ForegroundBusResponseMgr();

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, BusResponseCallback> f10229a = new HashMap();

    public static ForegroundBusResponseMgr getInstance() {
        return b;
    }

    public BusResponseCallback get(String str) {
        BusResponseCallback busResponseCallback;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        synchronized (this.f10229a) {
            busResponseCallback = this.f10229a.get(str);
        }
        return busResponseCallback;
    }

    public void registerObserver(String str, BusResponseCallback busResponseCallback) {
        if (TextUtils.isEmpty(str) || busResponseCallback == null) {
            return;
        }
        synchronized (this.f10229a) {
            if (!this.f10229a.containsKey(str)) {
                this.f10229a.put(str, busResponseCallback);
            }
        }
    }

    public void unRegisterObserver(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        synchronized (this.f10229a) {
            this.f10229a.remove(str);
        }
    }
}
