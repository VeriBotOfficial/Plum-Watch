package com.qumeng.overseas.advlib.__remote__.framework.debug;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.provider.Settings;
import android.util.Log;
import com.qumeng.overseas.advlib.__remote__.utils.n;

/* loaded from: classes17.dex */
public class b {
    private static final String b = "FloatingWindowPermissionManager";
    private static volatile b c;

    /* renamed from: a, reason: collision with root package name */
    private Dialog f12929a;

    class a implements d {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f12930a;

        a(Context context) {
            this.f12930a = context;
        }

        @Override // com.qumeng.overseas.advlib.__remote__.framework.debug.b.d
        public void confirmResult(boolean z) {
            if (!z) {
                n.a(b.b, "user manually refuse OVERLAY_PERMISSION", new Object[0]);
                return;
            }
            try {
                b.d(this.f12930a);
            } catch (Exception e) {
                n.b(b.b, Log.getStackTraceString(e), new Object[0]);
            }
        }
    }

    /* renamed from: com.qumeng.overseas.advlib.__remote__.framework.debug.b$b, reason: collision with other inner class name */
    class DialogInterfaceOnClickListenerC0800b implements DialogInterface.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ d f12931a;

        DialogInterfaceOnClickListenerC0800b(d dVar) {
            this.f12931a = dVar;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            this.f12931a.confirmResult(false);
            dialogInterface.dismiss();
        }
    }

    class c implements DialogInterface.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ d f12932a;

        c(d dVar) {
            this.f12932a = dVar;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            this.f12932a.confirmResult(true);
            dialogInterface.dismiss();
        }
    }

    private interface d {
        void confirmResult(boolean z);
    }

    public static b a() {
        if (c == null) {
            synchronized (b.class) {
                if (c == null) {
                    c = new b();
                }
            }
        }
        return c;
    }

    public static boolean c(Context context) {
        Boolean bool = Boolean.TRUE;
        try {
            bool = (Boolean) Settings.class.getDeclaredMethod("canDrawOverlays", Context.class).invoke(null, context);
        } catch (Exception e) {
            n.b(b, Log.getStackTraceString(e), new Object[0]);
        }
        return bool.booleanValue();
    }

    public static void d(Context context) throws NoSuchFieldException, IllegalAccessException {
        Intent intent = new Intent(Settings.class.getDeclaredField("ACTION_MANAGE_OVERLAY_PERMISSION").get(null).toString());
        intent.setFlags(268435456);
        intent.setData(Uri.parse("package:" + context.getPackageName()));
        context.startActivity(intent);
    }

    private void b(Context context) {
        a(context, new a(context));
    }

    public boolean a(Context context) {
        if (c(context)) {
            this.f12929a = null;
            return true;
        }
        b(context);
        this.f12929a = null;
        return false;
    }

    private void a(Context context, d dVar) {
        a(context, "您的手机没有授予悬浮窗权限，请开启后再试", dVar);
    }

    private void a(Context context, String str, d dVar) {
        Dialog dialog = this.f12929a;
        if (dialog != null && dialog.isShowing()) {
            this.f12929a.dismiss();
        }
        AlertDialog create = new AlertDialog.Builder(context).setCancelable(true).setTitle("").setMessage(str).setPositiveButton("现在去开启", new c(dVar)).setNegativeButton("暂不开启", new DialogInterfaceOnClickListenerC0800b(dVar)).create();
        this.f12929a = create;
        create.show();
    }
}
