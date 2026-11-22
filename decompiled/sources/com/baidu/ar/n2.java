package com.baidu.ar;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import com.baidu.ar.arplay.representation.Number3D;
import com.baidu.ar.bd;
import java.io.File;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class n2 {
    public static Bitmap a(BitmapFactory.Options options, boolean z, String str) {
        float f;
        int i;
        int i2;
        int i3 = options.outWidth;
        int i4 = options.outHeight;
        float f2 = ((i3 * 1.0f) / i4) * 1.0f;
        if (z) {
            i2 = 500;
            f = i3 / 500;
            i = (int) (500 / f2);
        } else {
            f = i4 / 900;
            int i5 = (int) (900 * f2);
            i = 900;
            i2 = i5;
        }
        options.outWidth = i2;
        options.outHeight = i;
        options.inSampleSize = (int) f;
        return BitmapFactory.decodeFile(str, options);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005c A[Catch: Exception -> 0x0064, TRY_LEAVE, TryCatch #0 {Exception -> 0x0064, blocks: (B:6:0x0003, B:9:0x000a, B:12:0x0019, B:16:0x0047, B:18:0x005c, B:25:0x0052), top: B:5:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0063 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Bitmap a(com.baidu.ar.bd r5, java.lang.String r6) {
        /*
            r0 = 0
            if (r5 == 0) goto L68
            com.baidu.ar.tc r1 = r5.c()     // Catch: java.lang.Exception -> L64
            if (r1 != 0) goto La
            goto L68
        La:
            com.baidu.ar.tc r5 = r5.c()     // Catch: java.lang.Exception -> L64
            java.lang.String r5 = r5.c()     // Catch: java.lang.Exception -> L64
            boolean r1 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Exception -> L64
            if (r1 == 0) goto L19
            return r0
        L19:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L64
            r1.<init>()     // Catch: java.lang.Exception -> L64
            java.lang.StringBuilder r6 = r1.append(r6)     // Catch: java.lang.Exception -> L64
            java.lang.String r1 = java.io.File.separator     // Catch: java.lang.Exception -> L64
            java.lang.StringBuilder r6 = r6.append(r1)     // Catch: java.lang.Exception -> L64
            java.lang.StringBuilder r5 = r6.append(r5)     // Catch: java.lang.Exception -> L64
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Exception -> L64
            android.graphics.BitmapFactory$Options r6 = new android.graphics.BitmapFactory$Options     // Catch: java.lang.Exception -> L64
            r6.<init>()     // Catch: java.lang.Exception -> L64
            r1 = 1
            r6.inJustDecodeBounds = r1     // Catch: java.lang.Exception -> L64
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeFile(r5, r6)     // Catch: java.lang.Exception -> L64
            int r2 = r6.outWidth     // Catch: java.lang.Exception -> L64
            int r3 = r6.outHeight     // Catch: java.lang.Exception -> L64
            r4 = 0
            if (r3 <= r2) goto L4e
            r2 = 900(0x384, float:1.261E-42)
            if (r3 <= r2) goto L59
            r6.inJustDecodeBounds = r4     // Catch: java.lang.Exception -> L64
            android.graphics.Bitmap r0 = a(r6, r4, r5)     // Catch: java.lang.Exception -> L64
            goto L5a
        L4e:
            r3 = 500(0x1f4, float:7.0E-43)
            if (r2 <= r3) goto L59
            r6.inJustDecodeBounds = r4     // Catch: java.lang.Exception -> L64
            android.graphics.Bitmap r0 = a(r6, r1, r5)     // Catch: java.lang.Exception -> L64
            goto L5a
        L59:
            r1 = r4
        L5a:
            if (r1 != 0) goto L63
            r6.inJustDecodeBounds = r4     // Catch: java.lang.Exception -> L64
            android.graphics.Bitmap r5 = android.graphics.BitmapFactory.decodeFile(r5, r6)     // Catch: java.lang.Exception -> L64
            return r5
        L63:
            return r0
        L64:
            r5 = move-exception
            r5.printStackTrace()
        L68:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baidu.ar.n2.a(com.baidu.ar.bd, java.lang.String):android.graphics.Bitmap");
    }

    public static bd a(String str) {
        String a2 = j4.a(str);
        bd bdVar = null;
        if (TextUtils.isEmpty(a2)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(a2);
            if (jSONObject.has("ar_configs")) {
                JSONArray jSONArray = jSONObject.getJSONArray("ar_configs");
                if (jSONArray.length() != 0) {
                    JSONObject jSONObject2 = (JSONObject) jSONArray.get(0);
                    if (jSONObject2.has("ar_target")) {
                        JSONObject jSONObject3 = jSONObject2.getJSONObject("ar_target");
                        bd bdVar2 = new bd();
                        try {
                            if (jSONObject3.has("targets")) {
                                JSONArray jSONArray2 = jSONObject3.getJSONArray("targets");
                                ArrayList arrayList = new ArrayList();
                                for (int i = 0; i < jSONArray2.length(); i++) {
                                    try {
                                        arrayList.add(a((JSONObject) jSONArray2.get(i), str));
                                    } catch (Exception e) {
                                        e.printStackTrace();
                                    }
                                }
                                bdVar2.a(arrayList);
                            }
                            if (jSONObject3.has("UI")) {
                                bdVar2.a(b(jSONObject3.getJSONObject("UI")));
                            }
                            if (!jSONObject.has("service")) {
                                return bdVar2;
                            }
                            bdVar2.a(a(jSONObject.getJSONObject("service")));
                            return bdVar2;
                        } catch (Exception e2) {
                            e = e2;
                            bdVar = bdVar2;
                            e.printStackTrace();
                            return bdVar;
                        }
                    }
                }
            }
            return null;
        } catch (Exception e3) {
            e = e3;
        }
    }

    public static ed a(JSONObject jSONObject) {
        ed edVar = new ed();
        try {
            if (jSONObject.has("open_track_service")) {
                edVar.a(jSONObject.getInt("open_track_service"));
                return edVar;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return edVar;
    }

    public static oc a(JSONObject jSONObject, String str) {
        oc ocVar = new oc();
        try {
            if (str.length() > 0) {
                ocVar.d(str.substring(0, str.lastIndexOf(47)));
            }
            if (jSONObject.has("id")) {
                ocVar.a(jSONObject.getString("id"));
            }
            if (jSONObject.has("name")) {
                ocVar.c(jSONObject.getString("name"));
            }
            if (jSONObject.has("model_path")) {
                ocVar.b(jSONObject.getString("model_path"));
            }
            if (jSONObject.has("template_width")) {
                ocVar.d(jSONObject.getInt("template_width"));
            }
            if (jSONObject.has("template_height")) {
                ocVar.c(jSONObject.getInt("template_height"));
            }
            if (jSONObject.has("target_width")) {
                ocVar.b(jSONObject.getInt("target_width"));
            }
            if (jSONObject.has("target_height")) {
                ocVar.a(jSONObject.getInt("target_height"));
            }
            if (jSONObject.has("centre_pos")) {
                ocVar.a(d(jSONObject.getString("centre_pos")));
                return ocVar;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ocVar;
    }

    public static bd b(String str) {
        String a2 = j4.a(str);
        if (TextUtils.isEmpty(a2)) {
            return null;
        }
        try {
            bd bdVar = new bd();
            JSONObject jSONObject = new JSONObject(a2);
            if (jSONObject.has("targets")) {
                JSONArray jSONArray = jSONObject.getJSONArray("targets");
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < jSONArray.length(); i++) {
                    try {
                        arrayList.add(a((JSONObject) jSONArray.get(i), str));
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                bdVar.a(arrayList);
            }
            if (jSONObject.has("UI")) {
                bdVar.a(b(jSONObject.getJSONObject("UI")));
            }
            if (jSONObject.has("service")) {
                bdVar.a(a(jSONObject.getJSONObject("service")));
            }
            return bdVar;
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public static tc b(JSONObject jSONObject) {
        int parseInt;
        tc tcVar = new tc();
        try {
            if (jSONObject.has("udt_tip_simple")) {
                tcVar.c(jSONObject.getString("udt_tip_simple"));
            }
            if (jSONObject.has("udt_tip_detail")) {
                tcVar.b(jSONObject.getString("udt_tip_detail"));
            }
            if (jSONObject.has("hint")) {
                tcVar.f(jSONObject.getString("hint"));
            }
            if (jSONObject.has("too_far_hint")) {
                tcVar.i(jSONObject.getString("too_far_hint"));
            }
            if (jSONObject.has("too_near_hint")) {
                tcVar.j(jSONObject.getString("too_near_hint"));
            }
            if (jSONObject.has("not_find_hint")) {
                tcVar.g(jSONObject.getString("not_find_hint"));
            }
            if (jSONObject.has("far_threshold")) {
                tcVar.a(Float.parseFloat(jSONObject.getString("far_threshold")));
            }
            if (jSONObject.has("near_threshold")) {
                tcVar.b(Float.parseFloat(jSONObject.getString("near_threshold")));
            }
            if (jSONObject.has("case_type") && (parseInt = Integer.parseInt(jSONObject.getString("case_type"))) >= 0 && parseInt < bd.a.values().length) {
                tcVar.a(bd.a.values()[parseInt]);
            }
            if (jSONObject.has("udt_mode")) {
                tcVar.d(Integer.parseInt(jSONObject.getString("udt_mode")));
            }
            if (jSONObject.has("help_url")) {
                tcVar.e(jSONObject.getString("help_url"));
            }
            if (jSONObject.has("help_url_show_once")) {
                tcVar.a(Integer.parseInt(jSONObject.getString("help_url_show_once")));
            }
            if (jSONObject.has("help_url_show_once")) {
                tcVar.a(Integer.parseInt(jSONObject.getString("help_url_show_once")));
            }
            if (jSONObject.has("slam_texture_tip")) {
                tcVar.d(jSONObject.getString("slam_texture_tip"));
            }
            if (jSONObject.has("help_url")) {
                tcVar.h(jSONObject.getString("help_url"));
            }
            if (jSONObject.has("slam_device_orientation_tip")) {
                tcVar.a(jSONObject.getString("slam_device_orientation_tip"));
            }
            if (jSONObject.has("image_target_path")) {
                tcVar.k(jSONObject.getString("image_target_path"));
            }
            if (jSONObject.has("hide_shot_immediately")) {
                tcVar.b(jSONObject.getInt("hide_shot_immediately"));
            }
            if (jSONObject.has("show_tips_by_case")) {
                tcVar.c(jSONObject.getInt("show_tips_by_case"));
                return tcVar;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return tcVar;
    }

    public static bd c(String str) {
        File file = new File(str, "res/default.json");
        File file2 = new File(str, "targets.json");
        bd a2 = file.exists() ? a(file.getAbsolutePath()) : null;
        return (a2 == null && file2.exists()) ? b(file2.getAbsolutePath()) : a2;
    }

    public static Number3D d(String str) {
        Number3D number3D = new Number3D();
        try {
            String[] split = str.split(",");
            number3D.setAll(Float.valueOf(split[0]).floatValue(), Float.valueOf(split[1]).floatValue(), Float.valueOf(split[2]).floatValue());
            return number3D;
        } catch (Exception e) {
            e.printStackTrace();
            return number3D;
        }
    }
}
