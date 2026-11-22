package com.bytedance.adsdk.ugeno.fxn;

import android.gov.nist.core.Separators;
import android.text.TextUtils;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.bytedance.adsdk.ugeno.fxn.gff;
import com.caverock.androidsvg.SVGParser;
import com.facebook.react.uimanager.ViewProps;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes13.dex */
public class hm {
    public static int fxn(int i) {
        if (i < 0) {
            return -1;
        }
        if (i == 0) {
            return Integer.MIN_VALUE;
        }
        return i - 1;
    }

    public static List<gff> fxn(String str, JSONObject jSONObject) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = new JSONArray(str);
            if (jSONArray.length() <= 0) {
                return null;
            }
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    arrayList.add(fxn(optJSONObject, jSONObject));
                }
            }
            return arrayList;
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    public static gff fxn(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null) {
            return null;
        }
        gff gffVar = new gff();
        gffVar.kg(com.bytedance.adsdk.ugeno.sg.gff.fxn(com.bytedance.adsdk.ugeno.gff.kg.fxn(jSONObject.optString("delay"), jSONObject2), 0L));
        gffVar.gff(com.bytedance.adsdk.ugeno.gff.kg.fxn(jSONObject.optString("name"), jSONObject2));
        gffVar.kg(com.bytedance.adsdk.ugeno.sg.gff.fxn(com.bytedance.adsdk.ugeno.gff.kg.fxn(jSONObject.optString("playState"), jSONObject2), 1));
        gffVar.fxn(Math.max(com.bytedance.adsdk.ugeno.sg.gff.fxn(com.bytedance.adsdk.ugeno.gff.kg.fxn(jSONObject.optString("duration"), jSONObject2), 0L), 0L));
        gffVar.fxn(com.bytedance.adsdk.ugeno.sg.gff.fxn(com.bytedance.adsdk.ugeno.gff.kg.fxn(jSONObject.optString("playCount"), jSONObject2), 1));
        gffVar.fxn(com.bytedance.adsdk.ugeno.gff.kg.fxn(jSONObject.optString("playDirection"), jSONObject2));
        gffVar.fxn(kg(jSONObject.optString(ViewProps.TRANSFORM_ORIGIN), jSONObject2));
        gffVar.kg(com.bytedance.adsdk.ugeno.gff.kg.fxn(jSONObject.optString("timingFunction", "linear"), jSONObject2));
        gffVar.fxn(jSONObject.optJSONObject("effect"));
        gffVar.fxn(fxn(jSONObject.optJSONArray("keyframes"), jSONObject2));
        return gffVar;
    }

    public static Map<String, TreeMap<Float, String>> fxn(JSONArray jSONArray, JSONObject jSONObject) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i);
            if (optJSONObject != null) {
                float optDouble = (float) optJSONObject.optDouble("offset");
                Iterator<String> keys = optJSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    TreeMap treeMap = (TreeMap) hashMap.get(next);
                    if (!TextUtils.equals(next, "offset")) {
                        if (hashMap.containsKey(next) && treeMap != null) {
                            treeMap.put(Float.valueOf(optDouble), com.bytedance.adsdk.ugeno.gff.kg.fxn(optJSONObject.optString(next), jSONObject));
                        } else {
                            TreeMap treeMap2 = new TreeMap();
                            treeMap2.put(Float.valueOf(optDouble), com.bytedance.adsdk.ugeno.gff.kg.fxn(optJSONObject.optString(next), jSONObject));
                            hashMap.put(next, treeMap2);
                        }
                    }
                }
            }
        }
        return hashMap;
    }

    public static int fxn(String str) {
        int hashCode = str.hashCode();
        if (hashCode == -1408024454) {
            return str.equals(SVGParser.XML_STYLESHEET_ATTR_ALTERNATE) ? 2 : 1;
        }
        if (hashCode != -1039745817) {
            return 1;
        }
        str.equals("normal");
        return 1;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static Interpolator kg(String str) {
        char c;
        switch (str.hashCode()) {
            case -1965072618:
                if (str.equals("ease_in")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1102672091:
                if (str.equals("linear")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -787702915:
                if (str.equals("ease_out")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 1065009829:
                if (str.equals("ease_in_out")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0) {
            return new AccelerateInterpolator();
        }
        if (c == 1) {
            return new AccelerateDecelerateInterpolator();
        }
        if (c == 2) {
            return new DecelerateInterpolator();
        }
        return new LinearInterpolator();
    }

    public static float[] gff(String str) {
        float[] fArr = {0.0f, 0.0f};
        JSONArray fxn = com.bytedance.adsdk.ugeno.sg.kg.fxn(str, (JSONArray) null);
        if (fxn != null && fxn.length() == 2) {
            fArr[0] = (float) fxn.optDouble(0);
            fArr[1] = (float) fxn.optDouble(1);
        }
        return fArr;
    }

    public static gff.fxn kg(String str, JSONObject jSONObject) {
        JSONArray fxn;
        if (TextUtils.isEmpty(str) || (fxn = com.bytedance.adsdk.ugeno.sg.kg.fxn(str, (JSONArray) null)) == null || fxn.length() != 2) {
            return null;
        }
        gff.fxn fxnVar = new gff.fxn();
        fxnVar.fxn = com.bytedance.adsdk.ugeno.gff.kg.fxn(fxn.optString(0), jSONObject);
        fxnVar.kg = com.bytedance.adsdk.ugeno.gff.kg.fxn(fxn.optString(1), jSONObject);
        return fxnVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int fxn(String str, int i) {
        int i2 = i / 2;
        if (!TextUtils.isEmpty(str)) {
            str.hashCode();
            switch (str) {
                case "bottom":
                case "right":
                    return i;
                case "center":
                    break;
                case "top":
                case "left":
                    return 0;
                default:
                    try {
                        if (str.endsWith(Separators.PERCENT)) {
                            return (int) ((i * Float.parseFloat(str.substring(0, str.length() - 1))) / 100.0f);
                        }
                        return Integer.parseInt(str);
                    } catch (NumberFormatException unused) {
                        break;
                    }
            }
        }
        return i2;
    }
}
