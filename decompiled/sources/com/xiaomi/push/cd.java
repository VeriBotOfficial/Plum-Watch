package com.xiaomi.push;

import android.text.TextUtils;
import com.baidu.platform.comapi.map.MapBundleKey;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;

/* loaded from: classes4.dex */
public class cd {

    /* renamed from: a, reason: collision with other field name */
    private long f265a;

    /* renamed from: a, reason: collision with other field name */
    public String f266a;

    /* renamed from: b, reason: collision with other field name */
    public String f268b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    protected String h;
    private String i;

    /* renamed from: a, reason: collision with other field name */
    private ArrayList<ck> f267a = new ArrayList<>();

    /* renamed from: a, reason: collision with root package name */
    private double f14483a = 0.1d;
    private String j = "s.mi1.cc";
    private long b = 86400000;

    public cd(String str) {
        this.f266a = "";
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("the host is empty");
        }
        this.f265a = System.currentTimeMillis();
        this.f267a.add(new ck(str, -1));
        this.f266a = ch.m11960a();
        this.f268b = str;
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m11954a() {
        return TextUtils.equals(this.f266a, ch.m11960a());
    }

    public boolean a(cd cdVar) {
        return TextUtils.equals(this.f266a, cdVar.f266a);
    }

    public boolean b() {
        return System.currentTimeMillis() - this.f265a < this.b;
    }

    public void a(long j) {
        if (j <= 0) {
            throw new IllegalArgumentException("the duration is invalid " + j);
        }
        this.b = j;
    }

    boolean c() {
        long j = this.b;
        if (864000000 >= j) {
            j = 864000000;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j2 = this.f265a;
        if (currentTimeMillis - j2 <= j) {
            return currentTimeMillis - j2 > this.b && this.f266a.startsWith("WIFI-");
        }
        return true;
    }

    public ArrayList<String> a(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("the url is empty.");
        }
        URL url = new URL(str);
        if (TextUtils.equals(url.getHost(), this.f268b)) {
            ArrayList<String> arrayList = new ArrayList<>();
            Iterator<String> it = a(true).iterator();
            while (it.hasNext()) {
                cf a2 = cf.a(it.next(), url.getPort());
                arrayList.add(new URL(url.getProtocol(), a2.m11959a(), a2.a(), url.getFile()).toString());
            }
            return arrayList;
        }
        throw new IllegalArgumentException("the url is not supported by the fallback");
    }

    public void a(String str, long j, long j2) {
        try {
            b(new URL(str).getHost(), j, j2);
        } catch (MalformedURLException unused) {
        }
    }

    public void b(String str, long j, long j2) {
        a(str, 0, j, j2, null);
    }

    public void a(String str, long j, long j2, Exception exc) {
        try {
            b(new URL(str).getHost(), j, j2, exc);
        } catch (MalformedURLException unused) {
        }
    }

    public void b(String str, long j, long j2, Exception exc) {
        a(str, -1, j, j2, exc);
    }

    public void a(String str, int i, long j, long j2, Exception exc) {
        a(str, new cc(i, j, j2, exc));
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        r1.a(r5);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized void a(java.lang.String r4, com.xiaomi.push.cc r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.util.ArrayList<com.xiaomi.push.ck> r0 = r3.f267a     // Catch: java.lang.Throwable -> L20
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L20
        L7:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L1e
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L20
            com.xiaomi.push.ck r1 = (com.xiaomi.push.ck) r1     // Catch: java.lang.Throwable -> L20
            java.lang.String r2 = r1.f284a     // Catch: java.lang.Throwable -> L20
            boolean r2 = android.text.TextUtils.equals(r4, r2)     // Catch: java.lang.Throwable -> L20
            if (r2 == 0) goto L7
            r1.a(r5)     // Catch: java.lang.Throwable -> L20
        L1e:
            monitor-exit(r3)
            return
        L20:
            r4 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L20
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.cd.a(java.lang.String, com.xiaomi.push.cc):void");
    }

    /* renamed from: a, reason: collision with other method in class */
    public synchronized ArrayList<String> m11951a() {
        return a(false);
    }

    public synchronized ArrayList<String> a(boolean z) {
        ArrayList<String> arrayList;
        int size = this.f267a.size();
        ck[] ckVarArr = new ck[size];
        this.f267a.toArray(ckVarArr);
        Arrays.sort(ckVarArr);
        arrayList = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            ck ckVar = ckVarArr[i];
            if (z) {
                arrayList.add(ckVar.f284a);
            } else {
                int indexOf = ckVar.f284a.indexOf(":");
                if (indexOf != -1) {
                    arrayList.add(ckVar.f284a.substring(0, indexOf));
                } else {
                    arrayList.add(ckVar.f284a);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a, reason: collision with other method in class */
    public synchronized void m11953a(String str) {
        a(new ck(str));
    }

    synchronized void a(ck ckVar) {
        c(ckVar.f284a);
        this.f267a.add(ckVar);
    }

    public synchronized void a(String[] strArr) {
        int i;
        int size = this.f267a.size() - 1;
        while (true) {
            i = 0;
            if (size < 0) {
                break;
            }
            int length = strArr.length;
            while (true) {
                if (i < length) {
                    if (TextUtils.equals(this.f267a.get(size).f284a, strArr[i])) {
                        this.f267a.remove(size);
                        break;
                    }
                    i++;
                }
            }
            size--;
        }
        Iterator<ck> it = this.f267a.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            ck next = it.next();
            if (next.f14490a > i2) {
                i2 = next.f14490a;
            }
        }
        while (i < strArr.length) {
            a(new ck(strArr[i], (strArr.length + i2) - i));
            i++;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f266a);
        sb.append("\n");
        sb.append(a());
        Iterator<ck> it = this.f267a.iterator();
        while (it.hasNext()) {
            ck next = it.next();
            sb.append("\n");
            sb.append(next.toString());
        }
        sb.append("\n");
        return sb.toString();
    }

    public synchronized String a() {
        if (!TextUtils.isEmpty(this.i)) {
            return this.i;
        }
        if (TextUtils.isEmpty(this.e)) {
            return "hardcode_isp";
        }
        String a2 = bc.a(new String[]{this.e, this.c, this.d, this.g, this.f}, "_");
        this.i = a2;
        return a2;
    }

    public void b(String str) {
        this.j = str;
    }

    public void a(double d) {
        this.f14483a = d;
    }

    /* renamed from: a, reason: collision with other method in class */
    public synchronized JSONObject m11952a() {
        JSONObject jSONObject;
        jSONObject = new JSONObject();
        jSONObject.put("net", this.f266a);
        jSONObject.put("ttl", this.b);
        jSONObject.put("pct", this.f14483a);
        jSONObject.put("ts", this.f265a);
        jSONObject.put("city", this.d);
        jSONObject.put("prv", this.c);
        jSONObject.put(MapBundleKey.OfflineMapKey.OFFLINE_CITY_TYPE, this.g);
        jSONObject.put("isp", this.e);
        jSONObject.put(IjkMediaPlayer.OnNativeInvokeListener.ARG_IP, this.f);
        jSONObject.put("host", this.f268b);
        jSONObject.put("xf", this.h);
        JSONArray jSONArray = new JSONArray();
        Iterator<ck> it = this.f267a.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next().a());
        }
        jSONObject.put("fbs", jSONArray);
        return jSONObject;
    }

    public synchronized cd a(JSONObject jSONObject) {
        this.f266a = jSONObject.optString("net");
        this.b = jSONObject.getLong("ttl");
        this.f14483a = jSONObject.getDouble("pct");
        this.f265a = jSONObject.getLong("ts");
        this.d = jSONObject.optString("city");
        this.c = jSONObject.optString("prv");
        this.g = jSONObject.optString(MapBundleKey.OfflineMapKey.OFFLINE_CITY_TYPE);
        this.e = jSONObject.optString("isp");
        this.f = jSONObject.optString(IjkMediaPlayer.OnNativeInvokeListener.ARG_IP);
        this.f268b = jSONObject.optString("host");
        this.h = jSONObject.optString("xf");
        JSONArray jSONArray = jSONObject.getJSONArray("fbs");
        for (int i = 0; i < jSONArray.length(); i++) {
            a(new ck().a(jSONArray.getJSONObject(i)));
        }
        return this;
    }

    private synchronized void c(String str) {
        Iterator<ck> it = this.f267a.iterator();
        while (it.hasNext()) {
            if (TextUtils.equals(it.next().f284a, str)) {
                it.remove();
            }
        }
    }
}
