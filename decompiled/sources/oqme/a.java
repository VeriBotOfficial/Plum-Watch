package oqme;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes8.dex */
public abstract class a {
    public static final String A = "sp_splash_height_sensitivity_count";
    public static final String B = "sp_req_total_count";
    public static final String C = "sp_req_adslot_count";
    public static final String D = "sp_req_total_count_by_day";
    public static final String E = "sp_req_adslot_count_by_day";
    public static final String F = "sp_style_overseas_json_version_gzip";
    public static final String G = "sp_style_overseas_json_version_length";
    public static final String H = "sp_cache_report_map";
    public static final String I = "sp_incite_specialcashtask_sid_unlimited";
    public static final String J = "sp_incite_specialcashtask";
    public static final String K = "sp_incite_specialcashtask_sid";
    public static final String L = "sp_incite_specialcashtask_multi";
    public static final String M = "sp_twist_count_";
    public static final String N = "sp_treasure_exist_task_adx";
    public static final String O = "sp_treasure_exist_and_complete_task_adx";
    public static final String P = "sp_country_id";
    public static final String Q = "sp_qm_blocker_last_scan_time";
    public static final String R = "sp_qm_blocker_detected_packages";
    private static final String S = "com.qumeng.overseas.advlib";
    public static final String T = "sp_external_api_count";
    public static final String U = "sp_external_api_data";
    public static final String V = "sp_in_reader_msg_surplus_timemill";
    public static final String W = "sp_click_slot_channel_task_complete";
    public static final String X = "sp_click_slot_pkg_task_complete";
    public static final String Y = "sp_global_kouLing_count";
    public static final String Z = "sp_personal_recommend_switch";

    /* renamed from: a, reason: collision with root package name */
    public static final String f18747a = "phoneAppList";
    public static final String a0 = "sp_auto_open_information";
    public static final String b = "phoneAppListNew";
    public static final String b0 = "sp_installed_ads_info";
    public static final String c = "sp_video_sound";
    public static final String c0 = "sp_click_ad_info";
    public static final String d = "sp_video_sound_reset_time";
    public static final String d0 = "sp_pwd_key";
    public static final String e = "sp_report_app_list_time";
    public static final String e0 = "sp_max_ad_req_count";
    public static final String f = "sp_report_age_divine_time";
    public static final String f0 = "sp_min_interval_time";
    public static final String g = "sp_website_map";
    public static final String g0 = "sp_exchange_rate_config";
    public static final String h = "sp_is_new_day";
    private static SharedPreferences h0 = null;
    public static final String i = "sp_is_x_day";
    private static SharedPreferences.Editor i0 = null;
    public static final String j = "sp_dev_android_id";
    public static final String k = "sp_dev_ga_id";
    public static final String l = "sp_bidding_config";
    public static final String m = "sp_bidding_config_current_id";
    public static final String n = "sp_bidding_config_ids";
    public static final String o = "sp_ab_config";
    public static final String p = "sp_mtl_config";

    /* renamed from: q, reason: collision with root package name */
    public static final String f18748q = "sp_mtl_config_current_id";
    public static final String r = "sp_ab_test_id";
    public static final String s = "sp_dsp_first_click";
    public static final String t = "sp_splash_ad_dp_count";
    public static final String u = "sp_auto_click_last_time";
    public static final String v = "sp_app_use_time";
    public static final String w = "sp_fake_dialog_show";
    public static final String x = "sp_auto_interaction_dialog_show";
    public static final String y = "sp_auto_float_angle_show";
    public static final String z = "sp_auto_float_angle_clk";

    public static void a(String str, String str2) {
        a();
        SharedPreferences.Editor editor = i0;
        if (editor != null) {
            editor.putString(str, str2);
            i0.apply();
        }
    }

    public static void b(String str, long j2) {
        a();
        SharedPreferences.Editor editor = i0;
        if (editor != null) {
            editor.putLong(str, j2);
            i0.apply();
        }
    }

    public static void c(String str, String str2) {
        a();
        SharedPreferences.Editor editor = i0;
        if (editor != null) {
            editor.putString(str, str2);
            i0.apply();
        }
    }

    public static boolean d() {
        return (h0 == null || i0 == null) ? false : true;
    }

    public static Set<String> e(String str) {
        a();
        SharedPreferences sharedPreferences = h0;
        if (sharedPreferences != null) {
            return sharedPreferences.getStringSet(str, null);
        }
        return null;
    }

    public static void f(String str) {
        c(j, str);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        com.qumeng.overseas.advlib.__remote__.core.coreutils.a.F = str;
    }

    public static void g(String str) {
        a();
        SharedPreferences.Editor editor = i0;
        if (editor != null) {
            editor.remove(str);
            i0.apply();
        }
    }

    public static void h(String str) {
        c(k, str);
    }

    public static <T> T d(String str) {
        try {
            a();
            String string = h0.getString(str, "");
            if (TextUtils.isEmpty(string)) {
                return null;
            }
            return (T) new ObjectInputStream(new ByteArrayInputStream(Base64.decode(string, 0))).readObject();
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public static boolean e() {
        try {
            Class.forName("com.tencent.mmkv.MMKV");
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static void a(String str, long j2) {
        a();
        SharedPreferences.Editor editor = i0;
        if (editor != null) {
            editor.putLong(str, j2);
            i0.apply();
        }
    }

    public static String b(String str, String str2) {
        a();
        SharedPreferences sharedPreferences = h0;
        if (sharedPreferences != null) {
            return sharedPreferences.getString(str, str2);
        }
        return "";
    }

    public static long c(String str) {
        a();
        SharedPreferences sharedPreferences = h0;
        if (sharedPreferences != null) {
            return sharedPreferences.getLong(str, 0L);
        }
        return 0L;
    }

    public static String c() {
        return b(k, "");
    }

    public static void a(String str, Set<String> set) {
        a();
        SharedPreferences.Editor editor = i0;
        if (editor != null) {
            editor.putStringSet(str, set);
            i0.apply();
        }
    }

    public static void b(String str, Set<String> set) {
        a();
        SharedPreferences.Editor editor = i0;
        if (editor != null) {
            editor.putStringSet(str, set);
            i0.apply();
        }
    }

    public static void a(String str, int i2) {
        a();
        SharedPreferences.Editor editor = i0;
        if (editor != null) {
            editor.putInt(str, i2);
            i0.apply();
        }
    }

    public static int b(String str) {
        a();
        SharedPreferences sharedPreferences = h0;
        if (sharedPreferences != null) {
            return sharedPreferences.getInt(str, 0);
        }
        return 0;
    }

    public static void a(String str, String... strArr) {
        a();
        SharedPreferences.Editor editor = i0;
        if (editor != null) {
            editor.putStringSet(str, new HashSet(Arrays.asList(strArr)));
            i0.apply();
        }
    }

    public static void b(String str, boolean z2) {
        a();
        SharedPreferences.Editor editor = i0;
        if (editor != null) {
            editor.putBoolean(str, z2);
            i0.apply();
        }
    }

    public static boolean a(String str) {
        a();
        SharedPreferences sharedPreferences = h0;
        if (sharedPreferences != null) {
            return sharedPreferences.getBoolean(str, false);
        }
        return false;
    }

    public static String b() {
        return b(j, "");
    }

    public static boolean a(String str, boolean z2) {
        a();
        SharedPreferences sharedPreferences = h0;
        return sharedPreferences != null ? sharedPreferences.getBoolean(str, z2) : z2;
    }

    public static <T> boolean a(String str, T t2) {
        try {
            a();
            if (t2 == null) {
                i0.putString(str, "");
                i0.apply();
                return true;
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            new ObjectOutputStream(byteArrayOutputStream).writeObject(t2);
            i0.putString(str, new String(Base64.encode(byteArrayOutputStream.toByteArray(), 0)));
            i0.apply();
            return true;
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    public static void a() {
        if (h0 == null || i0 == null) {
            SharedPreferences a2 = oqmg.a.a("com.qumeng.overseas.advlib");
            h0 = a2;
            if (a2 != null) {
                i0 = a2.edit();
            }
        }
    }
}
