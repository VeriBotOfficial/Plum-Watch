package com.bytedance.sdk.openadsdk.core.mvp.kg;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.mvp.kg.gff;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public class fxn extends gff implements Comparable<fxn> {
    public long fxn;

    protected fxn(long j, String str, gff.EnumC0520gff enumC0520gff, Boolean bool) {
        super(str, enumC0520gff, bool);
        this.fxn = j;
    }

    public long fxn() {
        return this.fxn;
    }

    public static int fxn(String str) {
        if (TextUtils.isEmpty(str)) {
            return Integer.MIN_VALUE;
        }
        String[] split = str.split(":");
        if (split.length == 3) {
            try {
                return (int) ((Integer.parseInt(split[0]) * 3600000) + (Integer.parseInt(split[1]) * 60000) + (Float.parseFloat(split[2]) * 1000.0f));
            } catch (Throwable unused) {
            }
        }
        return Integer.MIN_VALUE;
    }

    public boolean fxn(long j) {
        return this.fxn <= j && !rb();
    }

    @Override // java.lang.Comparable
    /* renamed from: fxn, reason: merged with bridge method [inline-methods] */
    public int compareTo(fxn fxnVar) {
        if (fxnVar == null) {
            return 1;
        }
        long j = this.fxn;
        long j2 = fxnVar.fxn;
        if (j > j2) {
            return 1;
        }
        return j < j2 ? -1 : 0;
    }

    /* renamed from: com.bytedance.sdk.openadsdk.core.mvp.kg.fxn$fxn, reason: collision with other inner class name */
    public static class C0519fxn {
        private final String fxn;
        private gff.EnumC0520gff gff = gff.EnumC0520gff.TRACKING_URL;
        private final long kg;

        public C0519fxn(String str, long j) {
            this.fxn = str;
            this.kg = j;
        }

        public fxn fxn() {
            return new fxn(this.kg, this.fxn, this.gff, Boolean.FALSE);
        }
    }

    public JSONObject kg() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("content", gff());
        jSONObject.put("trackingMilliseconds", this.fxn);
        return jSONObject;
    }

    public String toString() {
        return super.toString();
    }
}
