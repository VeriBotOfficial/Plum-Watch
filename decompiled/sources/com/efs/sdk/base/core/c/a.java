package com.efs.sdk.base.core.c;

import com.efs.sdk.base.core.model.LogDto;
import com.efs.sdk.base.core.util.Log;

/* loaded from: classes14.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    private com.efs.sdk.base.core.c.a.a f9603a;

    public abstract com.efs.sdk.base.core.c.a.a a();

    public final void a(LogDto logDto) {
        try {
            if (this.f9603a == null) {
                synchronized (this) {
                    if (this.f9603a == null) {
                        com.efs.sdk.base.core.c.a.a a2 = a();
                        this.f9603a = a2;
                        if (a2 == null) {
                            return;
                        }
                    }
                }
            }
            this.f9603a.a(logDto);
        } catch (Throwable th) {
            Log.e("efs.processor", "log handle error", th);
        }
    }
}
