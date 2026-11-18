package com.anythink.expressad.out;

import android.content.Context;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected Map<String, Object> f5012a;
    protected Context b;

    public abstract boolean a();

    public abstract void b();

    public a() {
    }

    private a(Map<String, Object> map, Context context) {
        this.f5012a = map;
        this.b = context;
    }
}
