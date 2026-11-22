package com.anythink.core.common.m.b;

import android.text.TextUtils;
import com.anythink.core.api.ATSDK;
import com.anythink.core.common.n.a.i;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;

/* loaded from: classes12.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private int f3994a;
    private a b;

    private c() {
    }

    public static c a(JSONObject jSONObject) {
        int[] iArr = null;
        if (jSONObject == null) {
            return null;
        }
        c cVar = new c();
        cVar.f3994a = jSONObject.optInt("net_type", 1);
        JSONObject optJSONObject = jSONObject.optJSONObject("net_d");
        if (optJSONObject != null) {
            long optLong = optJSONObject.optLong("s_timeout", 500L);
            JSONArray optJSONArray = optJSONObject.optJSONArray("s_i");
            JSONArray optJSONArray2 = optJSONObject.optJSONArray("srv");
            if (optJSONArray != null && optJSONArray.length() > 0) {
                iArr = new int[optJSONArray.length()];
                for (int i = 0; i < optJSONArray.length(); i++) {
                    iArr[i] = optJSONArray.optInt(i);
                }
            }
            ArrayList arrayList = new ArrayList();
            if (optJSONArray2 != null && optJSONArray2.length() > 0) {
                for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                    JSONObject optJSONObject2 = optJSONArray2.optJSONObject(i2);
                    if (optJSONObject2 != null) {
                        String optString = optJSONObject2.optString(IjkMediaPlayer.OnNativeInvokeListener.ARG_IP);
                        if (!TextUtils.isEmpty(optString)) {
                            arrayList.add(new b(optString, optJSONObject2.optInt("port", 57), optJSONObject2.optLong("timeout", 500L)));
                        }
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                cVar.b = new a(iArr, optLong, (b[]) arrayList.toArray(new b[0]));
            }
        }
        return cVar;
    }

    public final boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        a aVar = this.b;
        boolean z = (aVar == null || aVar.b() == null || this.b.b().length <= 0 || this.b.a() == null || this.b.a().length <= 0 || ATSDK.isCnSDK()) ? false : true;
        if (!z) {
            return z;
        }
        int[] a2 = this.b.a();
        try {
            int a3 = g.a(str);
            for (int i : a2) {
                if (a3 == i) {
                    return true;
                }
            }
        } catch (Throwable unused) {
            getClass().getSimpleName();
        }
        return false;
    }

    public final i[] a() {
        a aVar = this.b;
        i[] iVarArr = null;
        b[] b2 = aVar != null ? aVar.b() : null;
        if (b2 != null && b2.length != 0) {
            iVarArr = new i[b2.length];
            for (int i = 0; i < b2.length; i++) {
                b bVar = b2[i];
                if (bVar != null) {
                    iVarArr[i] = new com.anythink.core.common.n.a.g(bVar.a(), bVar.b(), bVar.c());
                }
            }
        }
        return iVarArr;
    }

    public final int b() {
        return this.f3994a;
    }

    private void a(int i) {
        this.f3994a = i;
    }

    private void a(a aVar) {
        this.b = aVar;
    }

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final int[] f3995a;
        private final long b;
        private final b[] c;

        public a(int[] iArr, long j, b[] bVarArr) {
            this.f3995a = iArr;
            this.b = j;
            this.c = bVarArr;
        }

        public final int[] a() {
            return this.f3995a;
        }

        public final b[] b() {
            return this.c;
        }

        private long c() {
            return this.b;
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private final String f3996a;
        private final int b;
        private final long c;

        public b(String str, int i, long j) {
            this.f3996a = str;
            this.b = i;
            this.c = j;
        }

        public final String a() {
            return this.f3996a;
        }

        public final int b() {
            return this.b;
        }

        public final long c() {
            return this.c;
        }
    }
}
