package com.alipay.android.phone.mrpc.core;

import com.autonavi.aps.amapapi.config.Const;
import org.apache.http.HttpResponse;
import org.apache.http.conn.ConnectionKeepAliveStrategy;
import org.apache.http.protocol.HttpContext;

/* loaded from: classes11.dex */
class f implements ConnectionKeepAliveStrategy {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f1278a;

    public f(d dVar) {
        this.f1278a = dVar;
    }

    @Override // org.apache.http.conn.ConnectionKeepAliveStrategy
    public long getKeepAliveDuration(HttpResponse httpResponse, HttpContext httpContext) {
        return Const.MIN_TIME_LOADLASTLOCFROMDB;
    }
}
