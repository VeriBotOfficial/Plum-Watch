package com.qumeng.overseas.advlib.__remote__.core.coreutils;

import android.os.Bundle;
import com.qumeng.overseas.advlib.__remote__.core.proto.utils.v;
import com.qumeng.overseas.advlib.core.AdRequestParam;
import java.io.Serializable;

/* loaded from: classes17.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public static final String f12829a = "feature_id";
    public static final String b = "incite_video_convert_landpage";
    public static final String c = "qm_rtb";

    public static <T> T a(AdRequestParam adRequestParam, String str, T t) {
        Bundle extraBundle;
        T t2;
        return (adRequestParam == null || (extraBundle = adRequestParam.getExtraBundle()) == null || !extraBundle.containsKey(str) || (t2 = (T) extraBundle.get(str)) == null) ? t : t2;
    }

    public static void b(AdRequestParam adRequestParam, String str, Object obj) {
        if (adRequestParam == null) {
            return;
        }
        Bundle extraBundle = adRequestParam.getExtraBundle();
        if (extraBundle == null) {
            extraBundle = new Bundle();
            adRequestParam.setExtraBundle(extraBundle);
        }
        if (obj instanceof Boolean) {
            extraBundle.putBoolean(str, ((Boolean) obj).booleanValue());
        } else if (obj instanceof String) {
            extraBundle.putString(str, (String) obj);
        } else if (obj instanceof Serializable) {
            extraBundle.putSerializable(str, (Serializable) obj);
        }
    }

    public static boolean a(AdRequestParam adRequestParam, String str) {
        return v.a((String) a(adRequestParam, f12829a, ""), str);
    }
}
