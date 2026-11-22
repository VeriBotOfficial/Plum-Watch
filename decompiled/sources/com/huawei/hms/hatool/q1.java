package com.huawei.hms.hatool;

import android.content.Context;
import android.os.UserManager;

/* loaded from: classes14.dex */
public class q1 {
    private static q1 c = new q1();

    /* renamed from: a, reason: collision with root package name */
    private boolean f10427a = false;
    private Context b = q0.i();

    private q1() {
    }

    public static q1 b() {
        return c;
    }

    public boolean a() {
        if (!this.f10427a) {
            Context context = this.b;
            if (context == null) {
                return false;
            }
            UserManager userManager = (UserManager) context.getSystemService("user");
            if (userManager != null) {
                this.f10427a = userManager.isUserUnlocked();
            } else {
                this.f10427a = false;
            }
        }
        return this.f10427a;
    }
}
