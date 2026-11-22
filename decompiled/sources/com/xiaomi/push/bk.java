package com.xiaomi.push;

import android.content.Context;
import com.xiaomi.push.af;

/* loaded from: classes4.dex */
public class bk extends af.a {

    /* renamed from: a, reason: collision with root package name */
    private Context f14460a;

    public bk(Context context) {
        this.f14460a = context;
    }

    @Override // com.xiaomi.push.af.a
    /* renamed from: a */
    public String mo11916a() {
        return "100887";
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            if (a()) {
                com.xiaomi.clientreport.manager.a.a(this.f14460a).c();
                com.xiaomi.channel.commonutils.logger.b.c(this.f14460a.getPackageName() + " perf begin upload");
            }
        } catch (Exception e) {
            com.xiaomi.channel.commonutils.logger.b.d("fail to send perf data. " + e);
        }
    }

    private boolean a() {
        return com.xiaomi.clientreport.manager.a.a(this.f14460a).m11790a().isPerfUploadSwitchOpen();
    }
}
