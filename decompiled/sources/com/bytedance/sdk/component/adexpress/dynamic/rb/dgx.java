package com.bytedance.sdk.component.adexpress.dynamic.rb;

import android.text.TextUtils;
import android.widget.TextView;
import com.bytedance.sdk.component.adexpress.dynamic.rb.kg;
import com.facebook.react.uimanager.ViewProps;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONObject;

/* loaded from: classes13.dex */
public class dgx {
    private static final Set<String> fxn = Collections.unmodifiableSet(new HashSet(Arrays.asList("dislike", "close", "close-fill", "webview-close")));
    private static String kg;

    /* JADX WARN: Can't wrap try/catch for region: R(9:(3:186|(1:189)|190)(2:214|(1:216)(4:217|192|(5:201|202|203|(3:205|(1:211)(1:208)|209)|212)|200))|191|192|(3:194|196|198)|201|202|203|(0)|212) */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0465 A[Catch: Exception -> 0x0476, JSONException -> 0x047a, TryCatch #2 {JSONException -> 0x047a, blocks: (B:163:0x03aa, B:165:0x03d8, B:167:0x03dd, B:169:0x03e5, B:177:0x03fa, B:179:0x0401, B:181:0x040d, B:183:0x0415, B:186:0x041c, B:190:0x0426, B:192:0x043a, B:194:0x0442, B:196:0x0448, B:198:0x0450, B:200:0x0476, B:203:0x045a, B:205:0x0465, B:209:0x046f, B:214:0x042f), top: B:162:0x03aa }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.bytedance.sdk.component.adexpress.dynamic.rb.kg.gff fxn(java.lang.String r20, java.lang.String r21, java.lang.String r22, boolean r23, boolean r24, int r25, com.bytedance.sdk.component.adexpress.dynamic.hm.tw r26, double r27, int r29, double r30, java.lang.String r32, com.bytedance.sdk.component.adexpress.kg.rlu r33) {
        /*
            Method dump skipped, instructions count: 1307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.adexpress.dynamic.rb.dgx.fxn(java.lang.String, java.lang.String, java.lang.String, boolean, boolean, int, com.bytedance.sdk.component.adexpress.dynamic.hm.tw, double, int, double, java.lang.String, com.bytedance.sdk.component.adexpress.kg.rlu):com.bytedance.sdk.component.adexpress.dynamic.rb.kg$gff");
    }

    public static String fxn(String str) {
        String[] split;
        return (TextUtils.isEmpty(str) || (split = str.split("adx:")) == null || split.length < 2) ? "" : split[1];
    }

    private static kg.gff fxn(kg.gff gffVar, String str, String str2, String str3) {
        if (str.contains("union")) {
            gffVar.fxn = 0.0f;
            gffVar.kg = 0.0f;
            return gffVar;
        }
        if (TextUtils.isEmpty(str3)) {
            str3 = fxn(str);
        }
        if (TextUtils.isEmpty(str3)) {
            gffVar.fxn = 0.0f;
            gffVar.kg = 0.0f;
            return gffVar;
        }
        return fxn(str3, str2);
    }

    public static kg.gff fxn(String str, String str2) {
        return fxn(str, str2, false);
    }

    public static kg.gff fxn(String str, String str2, boolean z) {
        kg.gff gffVar = new kg.gff();
        try {
            JSONObject jSONObject = new JSONObject(str2);
            int[] fxn2 = fxn(str, (float) kg(str2), z);
            gffVar.fxn = fxn2[0];
            gffVar.kg = fxn2[1];
            if (jSONObject.optDouble(ViewProps.LINE_HEIGHT, 1.0d) == 0.0d) {
                gffVar.kg = 0.0f;
            }
        } catch (Exception unused) {
        }
        return gffVar;
    }

    public static double kg(String str) {
        try {
            return Double.parseDouble(new JSONObject(str).optString("fontSize"));
        } catch (Throwable unused) {
            return 0.0d;
        }
    }

    public static int[] fxn(String str, float f, boolean z) {
        int[] kg2 = kg(str, f, z);
        return new int[]{com.bytedance.sdk.component.adexpress.hm.sg.kg(com.bytedance.sdk.component.adexpress.hm.fxn(), kg2[0]), com.bytedance.sdk.component.adexpress.hm.sg.kg(com.bytedance.sdk.component.adexpress.hm.fxn(), kg2[1])};
    }

    public static int[] kg(String str, float f, boolean z) {
        try {
            TextView textView = new TextView(com.bytedance.sdk.component.adexpress.hm.fxn());
            textView.setTextSize(f);
            textView.setText(str);
            textView.setIncludeFontPadding(false);
            if (z) {
                textView.setSingleLine();
            }
            textView.measure(-2, -2);
            return new int[]{textView.getMeasuredWidth() + 2, textView.getMeasuredHeight() + 2};
        } catch (Exception unused) {
            return new int[]{0, 0};
        }
    }

    public static String fxn() {
        return kg;
    }

    public static boolean kg() {
        return !TextUtils.isEmpty(kg);
    }
}
