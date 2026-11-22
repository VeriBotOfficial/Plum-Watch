package com.amap.api.col.p0003sl;

import android.content.Context;
import android.text.TextUtils;
import com.amap.api.services.core.ServiceSettings;
import com.anythink.expressad.video.dynview.a.a;
import com.autonavi.aps.amapapi.config.Const;
import com.umeng.analytics.pro.ak;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: DynamicStringManager.java */
/* loaded from: classes11.dex */
public class n1 {

    /* renamed from: a, reason: collision with root package name */
    private static final ConcurrentHashMap<String, String> f1784a = new ConcurrentHashMap<>();
    private static final ConcurrentHashMap<String, String> b = new ConcurrentHashMap<>();
    private static volatile boolean c = false;
    private static Context d;

    private static void a() {
        String str;
        switch (z8.b()) {
            case 0:
                str = ServiceSettings.CHINESE;
                break;
            case 1:
                str = "zh-Hant-HK";
                break;
            case 2:
            default:
                str = "en";
                break;
            case 3:
                str = "es";
                break;
            case 4:
                str = "pt";
                break;
            case 5:
                str = "fr";
                break;
            case 6:
                str = "de";
                break;
            case 7:
                str = "th";
                break;
            case 8:
                str = a.T;
                break;
            case 9:
                str = a.V;
                break;
            case 10:
                str = a.X;
                break;
            case 11:
                str = "tr";
                break;
            case 12:
                str = "he";
                break;
            case 13:
                str = "it";
                break;
            case 14:
                str = a.Y;
                break;
            case 15:
                str = Const.SP_KEY_GSM_UPLOAD_MXSIZE;
                break;
            case 16:
                str = "id";
                break;
            case 17:
                str = "vi";
                break;
            case 18:
                str = ak.az;
                break;
            case 19:
                str = "cs";
                break;
            case 20:
                str = "uk";
                break;
            case 21:
                str = "az";
                break;
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        synchronized (n1.class) {
            if (c) {
                return;
            }
            f1784a.clear();
            try {
                b();
            } catch (Exception e) {
                ja.a(e, "DynamicStringManager", "Initialization error)");
            }
            if (a(str)) {
                c = true;
            }
        }
    }

    private static void b() {
        try {
            for (String str : m4.e(d, "Localizable/strings/en/Localizable_map.strings").split("\";")) {
                if (!str.isEmpty()) {
                    int indexOf = str.indexOf("\"");
                    int indexOf2 = str.indexOf("\"=\"");
                    if (indexOf >= 0 && indexOf2 >= 0) {
                        String substring = str.substring(indexOf + 1, indexOf2);
                        String substring2 = str.substring(indexOf2 + 3);
                        if (!TextUtils.isEmpty(substring) && !TextUtils.isEmpty(substring2)) {
                            b.put(substring, substring2);
                        }
                    }
                }
            }
        } catch (Exception e) {
            ja.a(e, "DynamicStringManager", "loadEnglishLanguageFile error)");
        }
    }

    public static String a(int i) {
        if (d == null) {
            return null;
        }
        String string = y5.a().getString(i);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        if (!c) {
            a();
        }
        String str = f1784a.get(string);
        if (str != null) {
            return (TextUtils.isEmpty(str) || !str.contains("\\n")) ? str : str.replace("\\n", "\n");
        }
        String str2 = b.get(string);
        return (TextUtils.isEmpty(str2) || !str2.contains("\\n")) ? str2 : str2.replace("\\n", "\n");
    }

    public static void a(Context context) {
        d = context;
        if (c) {
            return;
        }
        a();
    }

    private static boolean a(String str) {
        try {
            for (String str2 : m4.e(d, "Localizable/strings/" + str + "/Localizable_map.strings").split("\";")) {
                if (!str2.isEmpty()) {
                    int indexOf = str2.indexOf("\"");
                    int indexOf2 = str2.indexOf("\"=\"");
                    if (indexOf >= 0 && indexOf2 >= 0) {
                        String substring = str2.substring(indexOf + 1, indexOf2);
                        String substring2 = str2.substring(indexOf2 + 3);
                        if (!TextUtils.isEmpty(substring) && !TextUtils.isEmpty(substring2)) {
                            f1784a.put(substring, substring2);
                        }
                    }
                }
            }
            return true;
        } catch (Exception e) {
            ja.a(e, "DynamicStringManager", "loadLanguageFile error)");
            return false;
        }
    }
}
