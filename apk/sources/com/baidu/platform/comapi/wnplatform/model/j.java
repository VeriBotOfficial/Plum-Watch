package com.baidu.platform.comapi.wnplatform.model;

import android.os.Bundle;

/* JADX INFO: compiled from: WNExternalMessageManager.java */
/* JADX INFO: loaded from: classes15.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static j f8936a;
    private a b;

    /* JADX INFO: compiled from: WNExternalMessageManager.java */
    public interface a {
        void a(int r1, int r2, int r3, Bundle bundle);
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

    public void a(int r2, int r3, int r4, Bundle bundle) {
        a aVar = this.b;
        if (aVar != null) {
            aVar.a(r2, r3, r4, bundle);
        }
    }
}
