package com.tencent.mm.opensdk.a;

import android.content.Context;
import android.content.SharedPreferences;
import com.tencent.mm.opensdk.utils.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONObject;

/* loaded from: classes2.dex */
final class i {
    private static final ExecutorService at = Executors.newSingleThreadExecutor(new j());

    interface a {
        void a(b bVar);
    }

    static final class b {
        String J;
        long aq;
        String partnerId;

        b() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static JSONObject a(SharedPreferences sharedPreferences) {
        try {
            String string = sharedPreferences.getString("pending_map", null);
            if (string != null && string.length() > 0) {
                return new JSONObject(string);
            }
        } catch (Throwable unused) {
        }
        return new JSONObject();
    }

    static void a(Context context, String str, a aVar) {
        try {
            at.execute(new m(context != null ? c(context) : null, str, aVar));
        } catch (Throwable th) {
            Log.w("MicroMsg.SDK.PayReport", "store resolve submit ex: " + th.getMessage());
            try {
                aVar.a(new b());
            } catch (Throwable unused) {
            }
        }
    }

    static void a(Context context, String str, String str2) {
        if (context == null || str == null || str.length() == 0 || str2 == null) {
            return;
        }
        try {
            at.execute(new l(c(context), str, str2));
        } catch (Throwable th) {
            Log.w("MicroMsg.SDK.PayReport", "store remove submit ex: " + th.getMessage());
        }
    }

    static void a(Context context, String str, String str2, long j, String str3) {
        if (context == null || str == null || str.length() == 0 || str2 == null) {
            return;
        }
        try {
            at.execute(new k(c(context), str2, j, str3, str));
        } catch (Throwable th) {
            Log.w("MicroMsg.SDK.PayReport", "store save submit ex: " + th.getMessage());
        }
    }

    static /* synthetic */ void a(JSONObject jSONObject) {
        while (jSONObject.length() > 8) {
            try {
                Iterator<String> keys = jSONObject.keys();
                String str = null;
                long j = Long.MAX_VALUE;
                while (keys.hasNext()) {
                    String next = keys.next();
                    JSONObject optJSONObject = jSONObject.optJSONObject(next);
                    long optLong = optJSONObject != null ? optJSONObject.optLong("w", 0L) : 0L;
                    if (optLong < j) {
                        str = next;
                        j = optLong;
                    }
                }
                if (str == null) {
                    return;
                } else {
                    jSONObject.remove(str);
                }
            } catch (Throwable unused) {
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean a(JSONObject jSONObject, long j) {
        int i = 0;
        try {
            ArrayList arrayList = new ArrayList();
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                JSONObject optJSONObject = jSONObject.optJSONObject(next);
                long optLong = optJSONObject != null ? optJSONObject.optLong("w", 0L) : 0L;
                if (optLong <= 0 || j - optLong > 600000) {
                    arrayList.add(next);
                }
            }
            boolean z = false;
            while (i < arrayList.size()) {
                try {
                    jSONObject.remove((String) arrayList.get(i));
                    i++;
                    z = true;
                } catch (Throwable unused) {
                    return z;
                }
            }
            return z;
        } catch (Throwable unused2) {
            return false;
        }
    }

    private static Context c(Context context) {
        Context applicationContext;
        try {
            applicationContext = context.getApplicationContext();
        } catch (Throwable unused) {
        }
        return applicationContext != null ? applicationContext : context;
    }
}
