package com.yandex.varioqub.appmetricaadapter.impl;

import com.yandex.metrica.IIdentifierCallback;
import com.yandex.varioqub.analyticadapter.AdapterIdentifiersCallback;
import java.util.Map;

/* loaded from: classes5.dex */
public final class h implements IIdentifierCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AdapterIdentifiersCallback f17610a;

    public h(AdapterIdentifiersCallback adapterIdentifiersCallback) {
        this.f17610a = adapterIdentifiersCallback;
    }

    public final void onReceive(Map map) {
        AdapterIdentifiersCallback adapterIdentifiersCallback = this.f17610a;
        String str = (String) map.get("yandex_mobile_metrica_uuid");
        if (str == null) {
            str = "";
        }
        adapterIdentifiersCallback.onSuccess(str);
    }

    public final void onRequestError(IIdentifierCallback.Reason reason) {
        this.f17610a.onError(reason.toString());
    }
}
