package com.xiaomi.push;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.service.notification.StatusBarNotification;
import android.text.TextUtils;
import android.widget.RemoteViews;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public abstract class dy extends dw {

    /* renamed from: a, reason: collision with root package name */
    private int f14546a;

    /* renamed from: a, reason: collision with other field name */
    protected Bitmap f424a;

    /* renamed from: a, reason: collision with other field name */
    private RemoteViews f425a;

    /* renamed from: a, reason: collision with other field name */
    protected CharSequence f426a;

    /* renamed from: a, reason: collision with other field name */
    private String f427a;

    /* renamed from: a, reason: collision with other field name */
    private ArrayList<Notification.Action> f428a;

    /* renamed from: a, reason: collision with other field name */
    protected Map<String, String> f429a;

    /* renamed from: a, reason: collision with other field name */
    private boolean f430a;
    private int b;

    /* renamed from: b, reason: collision with other field name */
    protected CharSequence f431b;

    /* renamed from: b, reason: collision with other field name */
    private boolean f432b;

    /* renamed from: a, reason: collision with other method in class */
    protected abstract String mo12100a();

    protected void a(int i, Notification.Action action) {
    }

    /* renamed from: a */
    protected abstract boolean mo12094a();

    protected abstract String b();

    public dy(Context context, String str) {
        this(context, 0, str);
    }

    public dy(Context context, int i, String str) {
        super(context);
        this.f428a = new ArrayList<>();
        this.b = 0;
        this.f427a = str;
        this.f14546a = i;
        m12096c();
    }

    @Override // android.app.Notification.Builder
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public dy setContentTitle(CharSequence charSequence) {
        this.f426a = charSequence;
        return this;
    }

    @Override // android.app.Notification.Builder
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public dy setContentText(CharSequence charSequence) {
        this.f431b = charSequence;
        return this;
    }

    @Override // android.app.Notification.Builder
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public dy setLargeIcon(Bitmap bitmap) {
        this.f424a = bitmap;
        return this;
    }

    @Override // com.xiaomi.push.dw
    public dw a(Map<String, String> map) {
        this.f429a = map;
        return this;
    }

    @Override // android.app.Notification.Builder
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public dy addAction(int i, CharSequence charSequence, PendingIntent pendingIntent) {
        addAction(new Notification.Action(i, charSequence, pendingIntent));
        return this;
    }

    @Override // android.app.Notification.Builder
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public dy addAction(Notification.Action action) {
        if (action != null) {
            this.f428a.add(action);
        }
        int i = this.b;
        this.b = i + 1;
        a(i, action);
        return this;
    }

    /* renamed from: c, reason: collision with other method in class */
    private boolean m12097c() {
        Map<String, String> map = this.f429a;
        return map != null && Boolean.parseBoolean(map.get("custom_builder_set_title"));
    }

    @Override // com.xiaomi.push.dw
    /* renamed from: a */
    protected void mo12093a() {
        super.mo12093a();
        Bundle bundle = new Bundle();
        if (m12098d()) {
            bundle.putBoolean("mipush.customCopyLayout", this.f432b);
        } else {
            bundle.putBoolean("mipush.customCopyLayout", false);
        }
        bundle.putBoolean("miui.customHeight", false);
        bundle.putBoolean("mipush.customNotification", true);
        bundle.putInt("mipush.customLargeIconId", a("large_icon"));
        if (this.f428a.size() > 0) {
            Notification.Action[] actionArr = new Notification.Action[this.f428a.size()];
            this.f428a.toArray(actionArr);
            bundle.putParcelableArray("mipush.customActions", actionArr);
        }
        if (m12097c() || !com.xiaomi.push.service.ag.m12423a(a().getContentResolver())) {
            d();
        } else {
            bundle.putCharSequence("mipush.customTitle", this.f426a);
            bundle.putCharSequence("mipush.customContent", this.f431b);
        }
        addExtras(bundle);
    }

    /* renamed from: c, reason: collision with other method in class */
    private void m12096c() {
        int a2 = a(a().getResources(), c(), "layout", a().getPackageName());
        if (a2 != 0) {
            this.f425a = new RemoteViews(a().getPackageName(), a2);
            this.f430a = mo12094a();
        } else {
            com.xiaomi.channel.commonutils.logger.b.m11781a("create RemoteViews failed, no such layout resource was found");
        }
    }

    /* renamed from: b, reason: collision with other method in class */
    protected final void m12102b() {
        super.setContentTitle(this.f426a);
        super.setContentText(this.f431b);
        Bitmap bitmap = this.f424a;
        if (bitmap != null) {
            super.setLargeIcon(bitmap);
        }
    }

    private void d() {
        super.setContentTitle(this.f426a);
        super.setContentText(this.f431b);
    }

    private String c() {
        boolean e = e();
        this.f432b = e;
        return e ? b() : mo12100a();
    }

    /* renamed from: a, reason: collision with other method in class */
    public final RemoteViews m12099a() {
        return this.f425a;
    }

    /* renamed from: b, reason: collision with other method in class */
    protected final boolean m12103b() {
        return this.f430a;
    }

    protected void a(int i) {
        Bitmap a2 = a();
        if (a2 != null) {
            m12099a().setImageViewBitmap(i, a2);
            return;
        }
        int b = g.b(a(), this.f427a);
        if (b != 0) {
            m12099a().setImageViewResource(i, b);
        }
    }

    private Bitmap a() {
        return com.xiaomi.push.service.x.a(g.m12178a(a(), this.f427a));
    }

    /* renamed from: d, reason: collision with other method in class */
    private boolean m12098d() {
        return (TextUtils.isEmpty(b()) || TextUtils.isEmpty(this.f427a)) ? false : true;
    }

    private boolean e() {
        return m12098d() && f();
    }

    private boolean f() {
        List<StatusBarNotification> m12421b = com.xiaomi.push.service.af.a(a(), this.f427a).m12421b();
        if (m12421b != null && !m12421b.isEmpty()) {
            for (StatusBarNotification statusBarNotification : m12421b) {
                if (statusBarNotification.getId() == this.f14546a) {
                    if (statusBarNotification.getNotification() == null) {
                        return false;
                    }
                    return !r0.extras.getBoolean("mipush.customCopyLayout", true);
                }
            }
        }
        return false;
    }

    protected int a(float f) {
        return (int) ((f * a().getResources().getDisplayMetrics().density) + 0.5f);
    }

    protected Bitmap a(Bitmap bitmap, float f) {
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
        canvas.drawRoundRect(new RectF(rect), f, f, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, rect, rect, paint);
        if (!bitmap.isRecycled()) {
            bitmap.recycle();
        }
        return createBitmap;
    }

    /* renamed from: a, reason: collision with other method in class */
    protected final boolean m12101a(int i) {
        return ((((double) Color.red(i)) * 0.299d) + (((double) Color.green(i)) * 0.587d)) + (((double) Color.blue(i)) * 0.114d) < 192.0d;
    }
}
