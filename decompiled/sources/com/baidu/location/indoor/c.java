package com.baidu.location.indoor;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;
import com.baidu.location.b.s;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes13.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public CopyOnWriteArrayList<com.baidu.location.indoor.b> f7738a;
    public CopyOnWriteArrayList<l> b;
    private SharedPreferences c;
    private a d;
    private boolean e;
    private com.baidu.location.indoor.b f;
    private long g;
    private String h;
    private l i;

    /* renamed from: com.baidu.location.indoor.c$1, reason: invalid class name */
    class AnonymousClass1 {
    }

    class a extends com.baidu.location.h.g {

        /* renamed from: a, reason: collision with root package name */
        public boolean f7739a;
        final /* synthetic */ c b;

        @Override // com.baidu.location.h.g
        public void a(boolean z) {
            if (z && !TextUtils.isEmpty(this.ej)) {
                try {
                    byte[] b = com.baidu.location.h.i.b(Base64.decode(new JSONObject(this.ej).optString("data").getBytes(), 0));
                    String str = b != null ? new String(b, "UTF-8") : "";
                    JSONObject jSONObject = new JSONObject(str);
                    if (this.b.c != null) {
                        this.b.c.getString("Indoor-> BleWalkNavConfig_ver", "0");
                        String string = jSONObject.has("ver") ? jSONObject.getString("ver") : null;
                        SharedPreferences.Editor edit = this.b.c.edit();
                        edit.putString("Indoor-> BleWalkNavConfig_data", str);
                        edit.putString("Indoor-> BleWalkNavConfig_ver", string);
                        edit.apply();
                        this.b.a(str);
                        long currentTimeMillis = System.currentTimeMillis() / 1000;
                        this.b.g = currentTimeMillis;
                        edit.putLong("Indoor-> BleWalkNavConfig_lastCheckTime", currentTimeMillis);
                        edit.putString("Indoor-> BleWalkNavConfig_cityCode", this.b.h);
                        edit.apply();
                    }
                } catch (Exception unused) {
                }
            }
            if (this.el != null) {
                this.el.clear();
            }
            this.f7739a = false;
        }

        @Override // com.baidu.location.h.g
        public void b() {
            this.ei = 2;
            this.b.c.getString("Indoor-> BleWalkNavConfig_ver", "0");
            this.el.put("ver", "0");
            this.el.put("newIn", "newIn");
            this.el.put("sdk", Float.valueOf(9.671f));
            this.el.put("stp", 1);
            this.el.put("city_code", this.b.h);
            String b = com.baidu.location.h.b.a().b();
            if (b == null || b.isEmpty()) {
                return;
            }
            this.el.put("cu", b);
        }
    }

    private static class b {

        /* renamed from: a, reason: collision with root package name */
        public static final c f7740a = new c(null);
    }

    private c() {
        this.c = null;
        this.d = null;
        this.e = false;
        this.f = null;
        this.g = 0L;
        this.h = "";
        this.i = null;
        this.h = s.a().a("mapcity", "");
    }

    /* synthetic */ c(AnonymousClass1 anonymousClass1) {
        this();
    }

    public static c a() {
        return b.f7740a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("city_indoor_loc_rects")) {
                JSONArray jSONArray = jSONObject.getJSONArray("city_indoor_loc_rects");
                if (jSONArray.length() > 0) {
                    ArrayList<com.baidu.location.indoor.b> arrayList = new ArrayList<>();
                    ArrayList<l> arrayList2 = new ArrayList<>();
                    for (int i = 0; i < jSONArray.length(); i++) {
                        JSONObject optJSONObject = jSONArray.optJSONObject(i);
                        if (optJSONObject != null) {
                            if (optJSONObject.has("city_code")) {
                                optJSONObject.optString("city_code");
                            }
                            a(optJSONObject, arrayList);
                            b(optJSONObject, arrayList2);
                        }
                    }
                    a(arrayList);
                    b(arrayList2);
                }
            }
        } catch (Exception unused) {
        }
    }

    private void a(ArrayList<com.baidu.location.indoor.b> arrayList) {
        CopyOnWriteArrayList<com.baidu.location.indoor.b> copyOnWriteArrayList = this.f7738a;
        if (copyOnWriteArrayList == null) {
            this.f7738a = new CopyOnWriteArrayList<>();
        } else if (copyOnWriteArrayList.size() > 0) {
            this.f7738a.clear();
        }
        if (arrayList.size() > 0) {
            this.f7738a.addAll(arrayList);
        }
    }

    private void a(JSONObject jSONObject, ArrayList<com.baidu.location.indoor.b> arrayList) {
        JSONArray optJSONArray;
        if (!jSONObject.has("indoor_loc_rect_info") || (optJSONArray = jSONObject.optJSONArray("indoor_loc_rect_info")) == null) {
            return;
        }
        for (int i = 0; i < optJSONArray.length(); i++) {
            arrayList.add(new com.baidu.location.indoor.b(optJSONArray.optJSONObject(i)));
        }
    }

    private void b(ArrayList<l> arrayList) {
        CopyOnWriteArrayList<l> copyOnWriteArrayList = this.b;
        if (copyOnWriteArrayList == null) {
            this.b = new CopyOnWriteArrayList<>();
        } else if (copyOnWriteArrayList.size() > 0) {
            this.b.clear();
        }
        if (arrayList.size() > 0) {
            this.b.addAll(arrayList);
        }
    }

    private void b(JSONObject jSONObject, ArrayList<l> arrayList) {
        JSONArray optJSONArray;
        if (!jSONObject.has("outdoor_loc_rect_info") || (optJSONArray = jSONObject.optJSONArray("outdoor_loc_rect_info")) == null) {
            return;
        }
        for (int i = 0; i < optJSONArray.length(); i++) {
            arrayList.add(new l(optJSONArray.optJSONObject(i)));
        }
    }

    public synchronized com.baidu.location.indoor.b b() {
        return this.f;
    }
}
