package com.xiaomi.push.service;

import android.app.Notification;
import android.content.Context;
import com.xiaomi.push.dw;
import com.xiaomi.push.hc;
import java.util.Map;

/* loaded from: classes4.dex */
public abstract class ab {
    abstract long a(Context context, dw dwVar, Map<String, String> map);

    abstract dw a(Context context, int i, String str, Map<String, String> map);

    abstract void a(hc hcVar, Map<String, String> map, int i, Notification notification);

    abstract void a(String str);

    /* renamed from: a, reason: collision with other method in class */
    abstract boolean m12404a(Context context, int i, String str, Map<String, String> map);

    abstract boolean a(Map<String, String> map, int i, Notification notification);
}
