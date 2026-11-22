package oqmi;

import android.content.Context;
import android.text.TextUtils;
import com.qumeng.overseas.advlib.R;
import com.qumeng.overseas.advlib.__remote__.core.proto.utils.e;
import com.qumeng.overseas.advlib.__remote__.ui.incite.i;

/* loaded from: classes8.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public static final int f18756a = 0;
    public static final int b = 1;
    public static final int c = 2;
    public static String d = "";
    public static String e = "";
    public static String f = "";
    public static String g = "";

    public static void a(Context context) {
        if (TextUtils.isEmpty(d)) {
            d = context.getResources().getString(R.string.qm_oversea_local_opening_the_application_for_you_);
        }
        if (TextUtils.isEmpty(e)) {
            e = context.getResources().getString(R.string.qm_oversea_local_jump_app_market_download_);
        }
        if (TextUtils.isEmpty(f)) {
            f = context.getResources().getString(R.string.qm_oversea_local_jumping_details_page_);
        }
        if (TextUtils.isEmpty(g)) {
            g = context.getResources().getString(R.string.qm_oversea_local_jumping_applet_);
        }
    }

    public static void b(Context context, boolean z) {
        if (context == null) {
            return;
        }
        a(context);
        a(d, z ? 1 : 0);
    }

    public static void c(Context context, boolean z) {
        if (context == null) {
            return;
        }
        a(context);
        a(f, z ? 1 : 0);
    }

    public static void d(Context context, boolean z) {
        if (context == null) {
            return;
        }
        a(context);
        a(g, z ? 1 : 0);
    }

    public static void a(String str, int i) {
        if (i != 0 && i == 1) {
            i.d(e.a(), str);
        }
    }

    public static void a(Context context, boolean z) {
        if (context == null) {
            return;
        }
        a(context);
        a(e, z ? 1 : 0);
    }
}
