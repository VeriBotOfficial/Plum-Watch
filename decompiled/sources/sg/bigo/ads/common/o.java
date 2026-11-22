package sg.bigo.ads.common;

import android.content.Context;
import android.text.TextUtils;
import com.phancy.mini.utils.MiniStorage;
import java.io.File;
import sg.bigo.ads.common.utils.q;

/* loaded from: classes9.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public static String f19661a = "";

    public static String a(Context context) {
        if (sg.bigo.ads.common.n.d.b() && !q.a((CharSequence) f19661a)) {
            return f19661a;
        }
        if (q.a((CharSequence) f19661a)) {
            f19661a = context == null ? "" : context.getFilesDir() + File.separator + "sg_bigo_ad";
        }
        File file = new File(f19661a);
        if (!file.exists()) {
            file.mkdirs();
        }
        return f19661a;
    }

    public static boolean a(Context context, String str) {
        return str != null && str.equals(b(context));
    }

    public static String b(Context context) {
        return i(context) + File.separator + "files";
    }

    public static String b(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return MiniStorage.SCHEME_FILE + d(context) + File.separator + str;
    }

    public static String c(Context context) {
        return i(context) + File.separator + "vpaid";
    }

    public static String d(Context context) {
        return i(context) + File.separator + "thumb";
    }

    public static String e(Context context) {
        return a(context) + File.separator + "image";
    }

    public static String f(Context context) {
        return a(context) + File.separator + "icon";
    }

    public static String g(Context context) {
        return a(context) + File.separator + "omsdk";
    }

    public static String h(Context context) {
        return a(context) + File.separator + "bannerjs";
    }

    private static String i(Context context) {
        return a(context) + File.separator + "video";
    }
}
