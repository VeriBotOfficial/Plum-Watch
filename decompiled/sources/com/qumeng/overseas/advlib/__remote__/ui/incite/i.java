package com.qumeng.overseas.advlib.__remote__.ui.incite;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.qumeng.overseas.advlib.__remote__.core.proto.utils.s;
import com.qumeng.overseas.advlib.__remote__.core.proto.utils.w;
import com.qumeng.overseas.advlib.__remote__.ui.banner.json2view.bean.JsonStyleBean;

/* loaded from: classes17.dex */
public class i {
    public static void a(Context context, String str) {
        if (context != null) {
            if (!(context instanceof Activity) || com.qumeng.overseas.advlib.__remote__.core.proto.utils.e.a((Activity) context)) {
                Toast makeText = Toast.makeText(context, str, 1);
                try {
                    ((TextView) ((LinearLayout) makeText.getView()).getChildAt(0)).setTextSize(16.0f);
                } catch (Exception e) {
                    e.printStackTrace();
                    com.qumeng.overseas.advlib.__remote__.utils.bugman.a.a(i.class, "exp_ToastUtils_showLong", e.getMessage(), (Throwable) e);
                }
                makeText.setGravity(80, 0, s.a(context, 100.0f));
                makeText.show();
            }
        }
    }

    public static void b(Context context, String str) {
        if (context != null) {
            if (!(context instanceof Activity) || com.qumeng.overseas.advlib.__remote__.core.proto.utils.e.a((Activity) context)) {
                Toast makeText = Toast.makeText(context, str, 0);
                try {
                    ((TextView) ((LinearLayout) makeText.getView()).getChildAt(0)).setTextSize(16.0f);
                } catch (Exception e) {
                    e.printStackTrace();
                    com.qumeng.overseas.advlib.__remote__.utils.bugman.a.a(i.class, "exp_ToastUtils_showShort", e.getMessage(), (Throwable) e);
                }
                makeText.setGravity(80, 0, s.a(context, 100.0f));
                makeText.show();
            }
        }
    }

    public static void c(Context context, String str) {
        if (context != null) {
            if (!(context instanceof Activity) || com.qumeng.overseas.advlib.__remote__.core.proto.utils.e.a((Activity) context)) {
                Toast makeText = Toast.makeText(context.getApplicationContext(), str, 1);
                try {
                    ((TextView) ((LinearLayout) makeText.getView()).getChildAt(0)).setTextSize(16.0f);
                } catch (Exception e) {
                    e.printStackTrace();
                    com.qumeng.overseas.advlib.__remote__.utils.bugman.a.a(i.class, "exp_ToastUtils_showLong", e.getMessage(), (Throwable) e);
                }
                makeText.setGravity(17, 0, 0);
                makeText.show();
            }
        }
    }

    public static void d(Context context, String str) {
        TextView textView;
        if (context != null) {
            if (!(context instanceof Activity) || com.qumeng.overseas.advlib.__remote__.core.proto.utils.e.a((Activity) context)) {
                Toast makeText = Toast.makeText(context.getApplicationContext(), str, 0);
                View view = makeText.getView();
                if (view != null && (textView = (TextView) view.findViewById(R.id.message)) != null) {
                    textView.setTextSize(2, 16.0f);
                }
                makeText.setGravity(17, 0, 0);
                makeText.show();
            }
        }
    }

    public static void a(Context context, CharSequence charSequence, String str, int i, int i2, int i3) {
        int i4;
        int i5;
        if (context != null) {
            if (!(context instanceof Activity) || com.qumeng.overseas.advlib.__remote__.core.proto.utils.e.a((Activity) context)) {
                try {
                    if (a()) {
                        i4 = i2;
                        try {
                            a(context, charSequence.toString(), i4, i, i3, "exp_ToastUtils_showShort");
                            return;
                        } catch (Throwable unused) {
                            context = context;
                            i = i;
                            i5 = i3;
                        }
                    } else {
                        i4 = i2;
                        i5 = i3;
                        try {
                            Toast toast = new Toast(context);
                            JsonStyleBean a2 = com.qumeng.overseas.advlib.__remote__.ui.banner.json2view.cache.a.a(str);
                            com.qumeng.overseas.advlib.__remote__.ui.banner.json2view.b bVar = new com.qumeng.overseas.advlib.__remote__.ui.banner.json2view.b(context);
                            View a3 = bVar.a(a2);
                            ((TextView) bVar.a("toast_content")).setText(charSequence);
                            toast.setGravity(i, 0, i5);
                            toast.setView(a3);
                            toast.setDuration(i4);
                            toast.show();
                            return;
                        } catch (Throwable unused2) {
                        }
                    }
                } catch (Throwable unused3) {
                    i4 = i2;
                    i5 = i3;
                }
                a(context, charSequence.toString(), i4, i, i5, "exp_ToastUtils_showShort");
            }
        }
    }

    public static boolean a() {
        return w.g();
    }

    public static void a(Context context, String str, int i, int i2, int i3, String str2) {
        Toast makeText = Toast.makeText(context, str, i3);
        try {
            ((TextView) ((LinearLayout) makeText.getView()).getChildAt(0)).setTextSize(16.0f);
        } catch (Exception e) {
            e.printStackTrace();
            com.qumeng.overseas.advlib.__remote__.utils.bugman.a.a(i.class, str2, e.getMessage(), (Throwable) e);
        }
        makeText.setGravity(i, 0, i2);
        makeText.show();
    }
}
