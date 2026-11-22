package com.baidu.ar;

import com.baidu.ar.auth.ARAuth;
import com.baidu.ar.auth.FeatureCodes;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes12.dex */
public class s {

    /* renamed from: a, reason: collision with root package name */
    public static volatile Map<String, Integer> f7182a = a();
    public static volatile Map<String, Integer> b = b();

    public static Map<String, Integer> a() {
        HashMap hashMap = new HashMap();
        hashMap.put("com.baidu.ar.vo.VOAR", 1300);
        hashMap.put("com.baidu.ar.pose.PoseAR", 1400);
        hashMap.put("com.baidu.ar.stretch.StretchAR", 1400);
        hashMap.put("com.baidu.ar.gesture.GestureAR", 1500);
        return hashMap;
    }

    public static boolean a(String str) {
        if (f7182a.containsKey(str)) {
            return ARAuth.checkFeatureAuth(f7182a.get(str).intValue());
        }
        return true;
    }

    public static Map<String, Integer> b() {
        HashMap hashMap = new HashMap();
        hashMap.put("ability_face_model", 1200);
        hashMap.put("ability_face_filter", 1000);
        hashMap.put("ability_makeup_filter", 1610);
        hashMap.put("ability_vo", 1300);
        hashMap.put("ability_pose", 1400);
        hashMap.put("ability_body_detect", 1400);
        hashMap.put("ability_gesture", 1500);
        hashMap.put("ability_image_segmentation", 1700);
        hashMap.put("ability_sky_segmentation", 1900);
        hashMap.put("ability_hair_segmentation", 1800);
        hashMap.put("ability_object_detect", 2000);
        hashMap.put("ability_3d_track", Integer.valueOf(FeatureCodes.TRACK_3D));
        return hashMap;
    }

    public static boolean b(String str) {
        if (b.containsKey(str)) {
            return ARAuth.checkFeatureAuth(b.get(str).intValue());
        }
        return true;
    }

    public static boolean c(String str) {
        if (b.containsKey(str)) {
            return ARAuth.enableFeature(b.get(str).intValue());
        }
        return true;
    }
}
