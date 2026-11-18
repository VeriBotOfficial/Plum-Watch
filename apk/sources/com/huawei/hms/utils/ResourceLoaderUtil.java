package com.huawei.hms.utils;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.anythink.expressad.foundation.h.k;

/* JADX INFO: loaded from: classes11.dex */
public abstract class ResourceLoaderUtil {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Context f10775a;
    private static String b;

    public static int getAnimId(String str) {
        return f10775a.getResources().getIdentifier(str, k.f, b);
    }

    public static int getColorId(String str) {
        return f10775a.getResources().getIdentifier(str, "color", b);
    }

    public static int getDimenId(String str) {
        return f10775a.getResources().getIdentifier(str, "dimen", b);
    }

    public static Drawable getDrawable(String str) {
        return f10775a.getResources().getDrawable(getDrawableId(str));
    }

    public static int getDrawableId(String str) {
        return f10775a.getResources().getIdentifier(str, k.c, b);
    }

    public static int getIdId(String str) {
        return f10775a.getResources().getIdentifier(str, "id", b);
    }

    public static int getLayoutId(String str) {
        return f10775a.getResources().getIdentifier(str, "layout", b);
    }

    public static String getString(String str) {
        return f10775a.getResources().getString(getStringId(str));
    }

    public static int getStringId(String str) {
        return f10775a.getResources().getIdentifier(str, "string", b);
    }

    public static int getStyleId(String str) {
        return f10775a.getResources().getIdentifier(str, "style", b);
    }

    public static Context getmContext() {
        return f10775a;
    }

    public static void setmContext(Context context) {
        f10775a = context;
        b = context.getPackageName();
    }

    public static String getString(String str, Object... objArr) {
        return f10775a.getResources().getString(getStringId(str), objArr);
    }
}
