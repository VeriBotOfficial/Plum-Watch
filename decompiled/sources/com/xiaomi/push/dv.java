package com.xiaomi.push;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.RemoteViews;

/* loaded from: classes4.dex */
public class dv extends dy {

    /* renamed from: a, reason: collision with root package name */
    private int f14543a;
    private Bitmap b;
    private Bitmap c;

    @Override // com.xiaomi.push.dy, android.app.Notification.Builder
    /* renamed from: a */
    public dy setLargeIcon(Bitmap bitmap) {
        return this;
    }

    @Override // com.xiaomi.push.dy
    protected String b() {
        return null;
    }

    public dv(Context context, String str) {
        super(context, str);
        this.f14543a = 16777216;
    }

    @Override // com.xiaomi.push.dy
    /* renamed from: a */
    protected String mo12100a() {
        return "notification_banner";
    }

    @Override // com.xiaomi.push.dy
    /* renamed from: a, reason: collision with other method in class */
    protected boolean mo12094a() {
        if (!j.m12357a()) {
            return false;
        }
        Resources resources = mo12100a().getResources();
        String packageName = mo12100a().getPackageName();
        return (a(mo12100a().getResources(), "bg", "id", mo12100a().getPackageName()) == 0 || a(resources, "icon", "id", packageName) == 0 || a(resources, "title", "id", packageName) == 0 || j.a(mo12100a()) < 9) ? false : true;
    }

    @Override // com.xiaomi.push.dy
    /* renamed from: a */
    public dv setLargeIcon(Bitmap bitmap) {
        if (b() && bitmap != null) {
            if (bitmap.getWidth() == 984 && 184 <= bitmap.getHeight() && bitmap.getHeight() <= 1678) {
                this.b = bitmap;
                return this;
            }
            com.xiaomi.channel.commonutils.logger.b.m11781a("colorful notification banner image resolution error, must belong to [984*184, 984*1678]");
        }
        return this;
    }

    public dv b(Bitmap bitmap) {
        if (b() && bitmap != null) {
            this.c = bitmap;
        }
        return this;
    }

    @Override // com.xiaomi.push.dw
    /* renamed from: a */
    public dv mo12095a(String str) {
        if (b() && !TextUtils.isEmpty(str)) {
            try {
                this.f14543a = Color.parseColor(str);
                return this;
            } catch (Exception unused) {
                com.xiaomi.channel.commonutils.logger.b.m11781a("parse banner notification image text color error");
            }
        }
        return this;
    }

    @Override // com.xiaomi.push.dy, com.xiaomi.push.dw
    /* renamed from: a, reason: collision with other method in class */
    public void mo12093a() {
        if (b() && this.b != null) {
            super.mo12093a();
            Resources resources = mo12100a().getResources();
            String packageName = mo12100a().getPackageName();
            int a2 = a(resources, "bg", "id", packageName);
            if (j.a(mo12100a()) >= 10) {
                mo12100a().setImageViewBitmap(a2, a(this.b, 30.0f));
            } else {
                mo12100a().setImageViewBitmap(a2, this.b);
            }
            int a3 = a(resources, "icon", "id", packageName);
            if (this.c != null) {
                mo12100a().setImageViewBitmap(a3, this.c);
            } else {
                a(a3);
            }
            int a4 = a(resources, "title", "id", packageName);
            mo12100a().setTextViewText(a4, this.f426a);
            if (this.f429a != null && this.f14543a == 16777216) {
                mo12095a(this.f429a.get("notification_image_text_color"));
            }
            RemoteViews a5 = mo12100a();
            int i = this.f14543a;
            a5.setTextColor(a4, (i == 16777216 || !a(i)) ? -1 : -16777216);
            setCustomContentView(mo12100a());
            Bundle bundle = new Bundle();
            bundle.putBoolean("miui.customHeight", true);
            addExtras(bundle);
            return;
        }
        b();
    }
}
