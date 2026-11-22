package com.xiaomi.push;

import android.app.Notification;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.RemoteViews;
import java.util.Map;

/* loaded from: classes4.dex */
public class dw extends Notification.Builder {

    /* renamed from: a, reason: collision with root package name */
    private Context f14544a;

    public dw a(Map<String, String> map) {
        return this;
    }

    /* renamed from: a */
    protected void mo12093a() {
    }

    public dw(Context context) {
        super(context);
        this.f14544a = context;
    }

    protected Context a() {
        return this.f14544a;
    }

    public int a(Resources resources, String str, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        return resources.getIdentifier(str, str2, str3);
    }

    public final int a(String str) {
        return a(a().getResources(), str, "id", a().getPackageName());
    }

    @Override // android.app.Notification.Builder
    public Notification build() {
        mo12093a();
        return super.build();
    }

    @Override // android.app.Notification.Builder
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public dw addExtras(Bundle bundle) {
        super.addExtras(bundle);
        return this;
    }

    @Override // android.app.Notification.Builder
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public dw setCustomContentView(RemoteViews remoteViews) {
        super.setCustomContentView(remoteViews);
        return this;
    }

    /* renamed from: a, reason: collision with other method in class */
    public dw mo12095a(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                ax.a((Object) this, "setColor", Integer.valueOf(Color.parseColor(str)));
                return this;
            } catch (Exception e) {
                com.xiaomi.channel.commonutils.logger.b.d("fail to set color. " + e);
            }
        }
        return this;
    }
}
