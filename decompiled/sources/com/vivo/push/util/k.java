package com.vivo.push.util;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.text.TextUtils;
import com.vivo.push.model.InsideNotificationItem;

/* compiled from: DefaultNotifyDataAdapter.java */
/* loaded from: classes2.dex */
public final class k implements BaseNotifyDataAdapter {
    private static int e;
    private static int f;

    /* renamed from: a, reason: collision with root package name */
    private Resources f14159a;
    private String b;
    private String c;
    private String d;

    private static boolean a(int i) {
        return (i == -1 || i == 0) ? false : true;
    }

    @Override // com.vivo.push.util.BaseNotifyDataAdapter
    public final int getNotifyMode(InsideNotificationItem insideNotificationItem) {
        return 2;
    }

    @Override // com.vivo.push.util.BaseNotifyDataAdapter
    public final void init(Context context) {
        this.b = context.getPackageName();
        this.f14159a = context.getResources();
        this.c = m.a();
        this.d = Build.VERSION.RELEASE;
    }

    @Override // com.vivo.push.util.BaseNotifyDataAdapter
    public final int getDefaultNotifyIcon() {
        int a2;
        if (a(e)) {
            return e;
        }
        String str = this.d;
        if (!a(str)) {
            t.d("DefaultNotifyDataAdapter", "getNotifyIconByArdVersion isSystemCodeUsable is false ");
            a2 = -1;
        } else {
            a2 = a(str, "_notifyicon");
        }
        e = a2;
        if (a(a2)) {
            return e;
        }
        String str2 = this.c;
        while (true) {
            t.d("DefaultNotifyDataAdapter", "getNotifyIconByRomVersion codeReg = ".concat(String.valueOf(str2)));
            if (TextUtils.isEmpty(str2)) {
                return this.f14159a.getIdentifier("vivo_push_notifyicon", com.anythink.expressad.foundation.h.k.c, this.b);
            }
            int identifier = this.f14159a.getIdentifier("vivo_push_rom" + str2 + "_notifyicon", com.anythink.expressad.foundation.h.k.c, this.b);
            if (identifier > 0) {
                t.d("DefaultNotifyDataAdapter", "getNotifyIconByRomVersion find notifyicon = vivo_push_rom" + str2 + "_notifyicon");
                return identifier;
            }
            str2 = str2.substring(0, str2.length() - 1);
        }
    }

    @Override // com.vivo.push.util.BaseNotifyDataAdapter
    public final int getDefaultSmallIconId() {
        int a2;
        if (a(f)) {
            return f;
        }
        String str = this.d;
        if (!a(str)) {
            t.d("DefaultNotifyDataAdapter", "getSmallIconByArdVersion isSystemCodeUsable is false ");
            a2 = -1;
        } else {
            a2 = a(str, "_icon");
        }
        f = a2;
        if (a(a2)) {
            return f;
        }
        String str2 = this.c;
        while (true) {
            t.d("DefaultNotifyDataAdapter", "getSmallIconByRomVersion codeReg = ".concat(String.valueOf(str2)));
            if (TextUtils.isEmpty(str2)) {
                return this.f14159a.getIdentifier("vivo_push_icon", com.anythink.expressad.foundation.h.k.c, this.b);
            }
            int identifier = this.f14159a.getIdentifier("vivo_push_rom" + str2 + "_icon", com.anythink.expressad.foundation.h.k.c, this.b);
            if (identifier > 0) {
                t.d("DefaultNotifyDataAdapter", "getSmallIconByRomVersion find smallIcon = vivo_push_rom" + str2 + "_icon");
                return identifier;
            }
            str2 = str2.substring(0, str2.length() - 1);
        }
    }

    private static boolean a(String str) {
        if (!TextUtils.isEmpty(str)) {
            return true;
        }
        t.d("DefaultNotifyDataAdapter", "systemVersion is not suit ");
        return false;
    }

    private int a(String str, String str2) {
        t.d("DefaultNotifyDataAdapter", "getIcon systemVersion = " + str + " suffix= " + str2);
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            String[] split = str.split("\\.");
            if (split != null && split.length > 0) {
                str = split[0];
            }
            try {
                for (int parseInt = Integer.parseInt(str); parseInt > 0; parseInt--) {
                    String str3 = "vivo_push_ard" + parseInt + str2;
                    t.c("DefaultNotifyDataAdapter", "get notify icon : ".concat(String.valueOf(str3)));
                    int identifier = this.f14159a.getIdentifier(str3, com.anythink.expressad.foundation.h.k.c, this.b);
                    if (identifier > 0) {
                        t.c("DefaultNotifyDataAdapter", "find notify icon : ".concat(String.valueOf(str3)));
                        return identifier;
                    }
                }
            } catch (Exception e2) {
                t.a("DefaultNotifyDataAdapter", e2);
            }
        }
        return -1;
    }
}
