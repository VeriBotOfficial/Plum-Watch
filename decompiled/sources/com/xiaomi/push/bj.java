package com.xiaomi.push;

import android.content.Context;
import com.xiaomi.push.af;

/* loaded from: classes4.dex */
public class bj extends af.a {

    /* renamed from: a, reason: collision with root package name */
    private Context f14459a;

    public bj(Context context) {
        this.f14459a = context;
    }

    @Override // com.xiaomi.push.af.a
    /* renamed from: a, reason: collision with other method in class */
    public String mo11916a() {
        return "100886";
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            if (a()) {
                com.xiaomi.channel.commonutils.logger.b.c(this.f14459a.getPackageName() + " begin upload event");
                com.xiaomi.clientreport.manager.a.a(this.f14459a).m11792b();
            }
        } catch (Exception e) {
            com.xiaomi.channel.commonutils.logger.b.a(e);
        }
    }

    private boolean a() {
        return com.xiaomi.clientreport.manager.a.a(this.f14459a).m11790a().isEventUploadSwitchOpen();
    }
}
