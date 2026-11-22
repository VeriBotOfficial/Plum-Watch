package com.pgl.ssdk;

import android.content.Context;
import android.gov.nist.javax.sip.header.ParameterNames;
import android.text.TextUtils;
import android.util.Base64;
import com.pgl.ssdk.ces.out.DungeonFlag;
import java.util.Arrays;
import org.apache.commons.net.ftp.FTPReply;
import org.json.JSONArray;
import org.json.JSONObject;
import org.xmind.core.ITopic;

/* loaded from: classes17.dex */
public class z {

    /* renamed from: a, reason: collision with root package name */
    private static Context f12770a;

    static class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            aa.b(z.b());
            com.pgl.ssdk.ces.a.meta(226, z.b(), null);
        }
    }

    @DungeonFlag
    private static String a(Throwable th) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("status", 3);
            jSONObject.put("exception", th.toString());
            jSONObject.put("stacktrace", Arrays.toString(th.getStackTrace()));
            jSONObject.put(ParameterNames.CAUSE, String.valueOf(th.getCause()));
            return Base64.encodeToString(jSONObject.toString().getBytes("UTF-8"), 0);
        } catch (Throwable unused) {
            return "eyJzdGF0dXMiOjN9";
        }
    }

    public static Context b() {
        return f12770a;
    }

    public static void c(Context context) {
        f12770a = context;
    }

    @DungeonFlag
    public static String b(Context context) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("status", 0);
            jSONObject.put("envcode", ((Long) com.pgl.ssdk.ces.a.meta(154, context, null)).longValue());
            jSONObject.put("bootcount", w.a(context));
            jSONObject.put("usb_debug", w.d(context));
            JSONArray[] c = w.c(context);
            if (c != null) {
                jSONObject.put("sdata", c[0]);
                jSONObject.put("sdmta", c[1]);
                jSONObject.put("curtime", System.currentTimeMillis() / 1000);
            }
            jSONObject.put("camera_count", x.a());
            jSONObject.put("sim", x.c(context));
            jSONObject.put("virtual_display", aa.a(context));
            jSONObject.put("acbs", u.b(context));
            jSONObject.put("bl_unlock", w.b(context));
            y.a(jSONObject);
            String e = v.e();
            jSONObject.put("romtype", w.c());
            jSONObject.put(ITopic.ROOT, w.e());
            if (!TextUtils.isEmpty(e)) {
                jSONObject.put("sign", e);
            }
            return (String) com.pgl.ssdk.ces.a.meta(FTPReply.ENTERING_PASSIVE_MODE, context, jSONObject.toString());
        } catch (Throwable th) {
            return a(th);
        }
    }

    public static String c() {
        String b = b(b());
        a();
        return b;
    }

    public static long a(Context context) {
        try {
            return ((Long) com.pgl.ssdk.ces.a.meta(154, context, null)).longValue();
        } catch (Throwable unused) {
            return 0L;
        }
    }

    @DungeonFlag
    public static void a() {
        ar.b(new a());
    }
}
