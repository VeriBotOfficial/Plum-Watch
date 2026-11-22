package com.qumeng.overseas.advlib.core;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import java.util.Map;

/* loaded from: classes17.dex */
public class i implements _factory {
    public static volatile boolean d = false;
    private static i e;

    /* renamed from: a, reason: collision with root package name */
    private _factory f13269a = null;
    private final Context b;
    private final QMConfig c;

    private i(QMConfig qMConfig) {
        this.c = qMConfig;
        this.b = qMConfig.getContext();
        e = this;
        c();
    }

    private boolean a() {
        if (this.f13269a == null) {
            Log.e("ICliFactory", "repeat loadInstance!");
            c();
        }
        if (this.f13269a != null) {
            return true;
        }
        Log.e("ICliFactory", "Instance not present!");
        return false;
    }

    private void b() {
        _factory _factoryVar = (_factory) com.qumeng.overseas.advlib.common.a.c().a(_factory.class, this.b, this.c, com.qumeng.overseas.advlib.__bootstrap__.a.f12775a);
        this.f13269a = _factoryVar;
        if (_factoryVar != null) {
            d = true;
        }
    }

    private void c() {
        if (com.qumeng.overseas.advlib.common.a.c().b(_factory.class) == null) {
            Log.i("ICliFactory", "Well, our remote class didn't load yet, invoke _bootstrap() ...");
            com.qumeng.overseas.advlib.__bootstrap__.a.a(this.c);
        }
        b();
    }

    @Override // com.qumeng.overseas.advlib.core._factory
    public IMultiAdRequest createNativeMultiAdRequest() {
        return (IMultiAdRequest) com.qumeng.overseas.advlib.common.a.c().a(IMultiAdRequest.class, new Object[0]);
    }

    @Override // com.qumeng.overseas.advlib.core._factory
    public void mediaTrace(String str, String str2, String str3, Map<String, String> map) {
        if (a()) {
            this.f13269a.mediaTrace(str, str2, str3, map);
        }
    }

    @Override // com.qumeng.overseas.advlib.core._factory
    public void notifyMsg(int i, Bundle bundle) {
        if (a()) {
            this.f13269a.notifyMsg(i, bundle);
        }
    }

    @Override // com.qumeng.overseas.advlib.core._factory, java.lang.Runnable
    public void run() {
        if (a()) {
            this.f13269a.run();
        }
    }

    @Override // com.qumeng.overseas.advlib.core._factory
    public void setImageAutoDownload(boolean z) {
        if (a()) {
            this.f13269a.setImageAutoDownload(z);
        }
    }

    @Override // com.qumeng.overseas.advlib.core._factory
    public void setMediaUserId(String str) {
        if (a()) {
            this.f13269a.setMediaUserId(str);
        }
    }

    @Override // com.qumeng.overseas.advlib.core._factory
    public void terminate() {
        if (a()) {
            this.f13269a.terminate();
        }
    }

    @Override // com.qumeng.overseas.advlib.core._factory
    public void useDebugServer(boolean z) {
        if (a()) {
            this.f13269a.useDebugServer(z);
        }
    }

    @Override // com.qumeng.overseas.advlib.core._factory
    public void whenPermDialogReturns(int i, String[] strArr, int[] iArr) {
        if (a()) {
            this.f13269a.whenPermDialogReturns(i, strArr, iArr);
        }
    }

    @Override // com.qumeng.overseas.advlib.core._factory
    public void useDebugServer(int i) {
        if (a()) {
            this.f13269a.useDebugServer(i);
        }
    }

    public static i a(QMConfig qMConfig) {
        i iVar = e;
        return iVar != null ? iVar : new i(qMConfig);
    }
}
