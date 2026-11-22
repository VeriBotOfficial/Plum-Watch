package com.iflytek.cloud.ui.b;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.iflytek.msc.MSC;
import com.luck.picture.lib.config.PictureMimeType;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;

/* loaded from: classes17.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f11216a;
    private static final String b;
    private static HashMap<String, Drawable> c;
    private static HashMap<String, Drawable> d;
    public static int e;
    public static int f;
    public static int g;
    public static int h;

    static {
        String str = MSC.isIflyVersion() ? "iflytek/" : "cmcc/";
        f11216a = str;
        b = "assets/".concat(str);
        c = new HashMap<>();
        d = new HashMap<>();
        e = 3;
        f = 4;
        g = 7;
        h = 8;
    }

    public static int[] a() {
        return new int[]{-1579033, -9933198};
    }

    public static int[] b() {
        return new int[]{20, 16};
    }

    private static InputStream c(Context context, String str) throws IOException {
        return context.getAssets().open(str);
    }

    public static View a(Context context, String str, ViewGroup viewGroup) throws Exception {
        return ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(context.getAssets().openXmlResourceParser(b + str + ".xml"), viewGroup);
    }

    public static synchronized Drawable b(Context context, String str) throws Exception {
        Drawable drawable;
        synchronized (a.class) {
            drawable = c.get(str);
            if (drawable == null) {
                drawable = a(context, str);
                c.put(str, drawable);
            }
        }
        return drawable;
    }

    private static Drawable a(Context context, String str) throws Exception {
        Drawable createFromResourceStream;
        InputStream c2 = c(context, f11216a + str + PictureMimeType.PNG);
        TypedValue typedValue = new TypedValue();
        typedValue.density = 240;
        if (Build.VERSION.SDK_INT > e) {
            createFromResourceStream = b.a(context.getResources(), typedValue, c2, str, (BitmapFactory.Options) null);
        } else {
            createFromResourceStream = Drawable.createFromResourceStream(context.getResources(), typedValue, c2, str);
        }
        if (c2 != null) {
            c2.close();
        }
        return createFromResourceStream;
    }
}
