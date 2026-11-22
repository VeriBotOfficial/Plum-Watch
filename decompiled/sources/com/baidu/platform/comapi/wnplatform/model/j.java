package com.baidu.platform.comapi.wnplatform.model;

import android.os.Bundle;

/* compiled from: WNExternalMessageManager.java */
/* loaded from: classes13.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    private static j f8936a;
    private a b;

    /* compiled from: WNExternalMessageManager.java */
    public interface a {
        void a(int i, int i2, int i3, Bundle bundle);
    }

    public static j a() {
        if (f8936a == null) {
            synchronized (j.class) {
                if (f8936a == null) {
                    f8936a = new j();
                }
            }
        }
        return f8936a;
    }

    public void a(int i, int i2, int i3, Bundle bundle) {
        a aVar = this.b;
        if (aVar != null) {
            aVar.a(i, i2, i3, bundle);
        }
    }
}
