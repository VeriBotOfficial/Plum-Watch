package com.xiaomi.push;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.gov.nist.javax.sip.parser.TokenNames;
import android.net.Uri;
import android.text.TextUtils;
import com.beken.iot.smartsdk.core.pack.TransmissionUnpacked;
import com.xiaomi.mipush.sdk.Constants;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;

/* loaded from: classes4.dex */
public class ch {

    /* renamed from: a, reason: collision with root package name */
    protected static Context f14486a;

    /* renamed from: a, reason: collision with other field name */
    private static a f271a;

    /* renamed from: a, reason: collision with other field name */
    private static ch f272a;
    private static String c;
    private static String d;

    /* renamed from: a, reason: collision with other field name */
    private long f274a;

    /* renamed from: a, reason: collision with other field name */
    private cg f275a;

    /* renamed from: a, reason: collision with other field name */
    protected b f276a;

    /* renamed from: a, reason: collision with other field name */
    private String f277a;

    /* renamed from: a, reason: collision with other field name */
    protected final Map<String, ce> f278a;

    /* renamed from: b, reason: collision with other field name */
    private final long f279b;

    /* renamed from: b, reason: collision with other field name */
    private String f280b;

    /* renamed from: c, reason: collision with other field name */
    private long f281c;
    protected static final Map<String, cd> b = new HashMap();

    /* renamed from: a, reason: collision with other field name */
    protected static boolean f273a = false;

    public interface a {
        ch a(Context context, cg cgVar, b bVar, String str);
    }

    public interface b {
        String a(String str);
    }

    public static synchronized ch a() {
        ch chVar;
        synchronized (ch.class) {
            chVar = f272a;
            if (chVar == null) {
                throw new IllegalStateException("the host manager is not initialized yet.");
            }
        }
        return chVar;
    }

    public static synchronized void a(a aVar) {
        synchronized (ch.class) {
            f271a = aVar;
            f272a = null;
        }
    }

    public static synchronized void a(Context context, cg cgVar, b bVar, String str, String str2, String str3) {
        synchronized (ch.class) {
            Context applicationContext = context.getApplicationContext();
            f14486a = applicationContext;
            if (applicationContext == null) {
                f14486a = context;
            }
            if (f272a == null) {
                a aVar = f271a;
                if (aVar == null) {
                    f272a = new ch(context, cgVar, bVar, str, str2, str3);
                } else {
                    f272a = aVar.a(context, cgVar, bVar, str);
                }
            }
        }
    }

    protected ch(Context context, cg cgVar, b bVar, String str) {
        this(context, cgVar, bVar, str, null, null);
    }

    protected ch(Context context, cg cgVar, b bVar, String str, String str2, String str3) {
        this.f278a = new HashMap();
        this.f277a = "0";
        this.f274a = 0L;
        this.f279b = 15L;
        this.f281c = 0L;
        this.f280b = "isp_prov_city_country_ip";
        this.f276a = bVar;
        if (cgVar == null) {
            this.f275a = new cg() { // from class: com.xiaomi.push.ch.1
                @Override // com.xiaomi.push.cg
                public boolean a(String str4) {
                    return true;
                }
            };
        } else {
            this.f275a = cgVar;
        }
        this.f277a = str;
        c = str2 == null ? context.getPackageName() : str2;
        d = str3 == null ? g() : str3;
    }

    /* renamed from: a, reason: collision with other method in class */
    static String m11960a() {
        if (f14486a == null) {
            return "unknown";
        }
        try {
            aw m11877a = av.m11877a();
            if (m11877a == null) {
                return "unknown";
            }
            if (m11877a.a() == 1) {
                return "WIFI-UNKNOWN";
            }
            return m11877a.m11887a() + Constants.ACCEPT_TIME_SEPARATOR_SERVER + m11877a.m11889b();
        } catch (Throwable unused) {
            return "unknown";
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    public cd m11962a(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("the url is empty");
        }
        return a(new URL(str).getHost(), true);
    }

    public cd b(String str) {
        return a(str, true);
    }

    public cd a(String str, boolean z) {
        cd e;
        com.xiaomi.channel.commonutils.logger.b.b("HostManager", "-->getFallbacksByHost(): host=", str, ", fetchRemoteIfNeed=", Boolean.valueOf(z));
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("the host is empty");
        }
        if (!this.f275a.a(str)) {
            return null;
        }
        cd c2 = c(str);
        return (c2 == null || !c2.b()) ? (z && av.m11884a(f14486a) && (e = e(str)) != null) ? e : new cd(str, c2) { // from class: com.xiaomi.push.ch.2

            /* renamed from: a, reason: collision with root package name */
            cd f14488a;
            final /* synthetic */ cd b;

            @Override // com.xiaomi.push.cd
            public boolean b() {
                return false;
            }

            {
                this.b = c2;
                this.f14488a = c2;
                this.f268b = this.f268b;
                if (c2 != null) {
                    this.f = c2.f;
                }
            }

            @Override // com.xiaomi.push.cd
            public synchronized ArrayList<String> a(boolean z2) {
                ArrayList<String> arrayList;
                arrayList = new ArrayList<>();
                cd cdVar = this.f14488a;
                if (cdVar != null) {
                    arrayList.addAll(cdVar.a(true));
                }
                synchronized (ch.b) {
                    cd cdVar2 = ch.b.get(this.f268b);
                    if (cdVar2 != null) {
                        Iterator<String> it = cdVar2.a(true).iterator();
                        while (it.hasNext()) {
                            String next = it.next();
                            if (arrayList.indexOf(next) == -1) {
                                arrayList.add(next);
                            }
                        }
                        arrayList.remove(this.f268b);
                        arrayList.add(this.f268b);
                    }
                }
                return arrayList;
            }

            @Override // com.xiaomi.push.cd
            public synchronized void a(String str2, cc ccVar) {
                cd cdVar = this.f14488a;
                if (cdVar != null) {
                    cdVar.a(str2, ccVar);
                }
            }
        } : c2;
    }

    protected cd c(String str) {
        ce ceVar;
        cd a2;
        synchronized (this.f278a) {
            m11966a();
            ceVar = this.f278a.get(str);
        }
        if (ceVar == null || (a2 = ceVar.a()) == null) {
            return null;
        }
        return a2;
    }

    public cd d(String str) {
        cd cdVar;
        Map<String, cd> map = b;
        synchronized (map) {
            cdVar = map.get(str);
        }
        return cdVar;
    }

    protected cd e(String str) {
        if (System.currentTimeMillis() - this.f281c <= this.f274a * 60000) {
            return null;
        }
        this.f281c = System.currentTimeMillis();
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add(str);
        cd cdVar = a(arrayList).get(0);
        if (cdVar != null) {
            this.f274a = 0L;
            return cdVar;
        }
        long j = this.f274a;
        if (j >= 15) {
            return null;
        }
        this.f274a = j + 1;
        return null;
    }

    private ArrayList<cd> a(ArrayList<String> arrayList) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        m11971e();
        synchronized (this.f278a) {
            m11966a();
            for (String str : this.f278a.keySet()) {
                if (!arrayList.contains(str)) {
                    arrayList.add(str);
                }
            }
        }
        Map<String, cd> map = b;
        synchronized (map) {
            for (Object obj : map.values().toArray()) {
                cd cdVar = (cd) obj;
                if (!cdVar.b()) {
                    b.remove(cdVar.f268b);
                }
            }
        }
        if (!arrayList.contains(b())) {
            arrayList.add(b());
        }
        ArrayList<cd> arrayList2 = new ArrayList<>(arrayList.size());
        for (int i = 0; i < arrayList.size(); i++) {
            arrayList2.add(null);
        }
        try {
            String str2 = av.d(f14486a) ? "wifi" : "wap";
            String a2 = a(arrayList, str2, this.f277a, true);
            if (!TextUtils.isEmpty(a2)) {
                JSONObject jSONObject3 = new JSONObject(a2);
                com.xiaomi.channel.commonutils.logger.b.b(a2);
                if ("OK".equalsIgnoreCase(jSONObject3.getString("S"))) {
                    JSONObject jSONObject4 = jSONObject3.getJSONObject(TokenNames.R);
                    String string = jSONObject4.getString("province");
                    String string2 = jSONObject4.getString("city");
                    String string3 = jSONObject4.getString("isp");
                    String string4 = jSONObject4.getString(IjkMediaPlayer.OnNativeInvokeListener.ARG_IP);
                    String string5 = jSONObject4.getString("country");
                    JSONObject jSONObject5 = jSONObject4.getJSONObject(str2);
                    com.xiaomi.channel.commonutils.logger.b.c("get bucket: net=" + string3 + ", hosts=" + jSONObject5.toString());
                    int i2 = 0;
                    while (i2 < arrayList.size()) {
                        String str3 = arrayList.get(i2);
                        JSONArray optJSONArray = jSONObject5.optJSONArray(str3);
                        if (optJSONArray == null) {
                            com.xiaomi.channel.commonutils.logger.b.m11781a("no bucket found for " + str3);
                            jSONObject = jSONObject5;
                        } else {
                            cd cdVar2 = new cd(str3);
                            int i3 = 0;
                            while (i3 < optJSONArray.length()) {
                                String string6 = optJSONArray.getString(i3);
                                if (TextUtils.isEmpty(string6)) {
                                    jSONObject2 = jSONObject5;
                                } else {
                                    jSONObject2 = jSONObject5;
                                    cdVar2.a(new ck(string6, optJSONArray.length() - i3));
                                }
                                i3++;
                                jSONObject5 = jSONObject2;
                            }
                            jSONObject = jSONObject5;
                            arrayList2.set(i2, cdVar2);
                            cdVar2.g = string5;
                            cdVar2.c = string;
                            cdVar2.e = string3;
                            cdVar2.f = string4;
                            cdVar2.d = string2;
                            if (jSONObject4.has("stat-percent")) {
                                cdVar2.a(jSONObject4.getDouble("stat-percent"));
                            }
                            if (jSONObject4.has("stat-domain")) {
                                cdVar2.b(jSONObject4.getString("stat-domain"));
                            }
                            if (jSONObject4.has("ttl")) {
                                cdVar2.a(jSONObject4.getInt("ttl") * 1000);
                            }
                            m11965a(cdVar2.a());
                        }
                        i2++;
                        jSONObject5 = jSONObject;
                    }
                    JSONObject optJSONObject = jSONObject4.optJSONObject("reserved");
                    if (optJSONObject != null) {
                        long j = jSONObject4.has("reserved-ttl") ? jSONObject4.getInt("reserved-ttl") * 1000 : 604800000L;
                        Iterator<String> keys = optJSONObject.keys();
                        while (keys.hasNext()) {
                            String next = keys.next();
                            JSONArray optJSONArray2 = optJSONObject.optJSONArray(next);
                            if (optJSONArray2 == null) {
                                com.xiaomi.channel.commonutils.logger.b.m11781a("no bucket found for " + next);
                            } else {
                                cd cdVar3 = new cd(next);
                                cdVar3.a(j);
                                for (int i4 = 0; i4 < optJSONArray2.length(); i4++) {
                                    String string7 = optJSONArray2.getString(i4);
                                    if (!TextUtils.isEmpty(string7)) {
                                        cdVar3.a(new ck(string7, optJSONArray2.length() - i4));
                                    }
                                }
                                Map<String, cd> map2 = b;
                                synchronized (map2) {
                                    if (this.f275a.a(next)) {
                                        map2.put(next, cdVar3);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } catch (Exception e) {
            com.xiaomi.channel.commonutils.logger.b.m11781a("failed to get bucket " + e.getMessage());
        }
        for (int i5 = 0; i5 < arrayList.size(); i5++) {
            cd cdVar4 = arrayList2.get(i5);
            if (cdVar4 != null) {
                a(arrayList.get(i5), cdVar4);
            }
        }
        m11969c();
        return arrayList2;
    }

    protected String b() {
        return "resolver.msg.xiaomi.net";
    }

    protected String a(ArrayList<String> arrayList, String str, String str2, boolean z) {
        ArrayList<String> arrayList2 = new ArrayList<>();
        ArrayList<au> arrayList3 = new ArrayList();
        arrayList3.add(new as("type", str));
        if (str.equals("wap")) {
            arrayList3.add(new as("conpt", a(av.m11880a(f14486a))));
        }
        if (z) {
            arrayList3.add(new as("reserved", "1"));
        }
        arrayList3.add(new as(CommonUrlParts.UUID, str2));
        arrayList3.add(new as("list", bc.a(arrayList, ",")));
        arrayList3.add(new as("countrycode", com.xiaomi.push.service.b.a(f14486a).b()));
        arrayList3.add(new as("push_sdk_vc", String.valueOf(60001)));
        String b2 = b();
        cd c2 = c(b2);
        String format = String.format(Locale.US, "https://%1$s/gslb/?ver=5.0", b2);
        if (c2 == null) {
            arrayList2.add(format);
            Map<String, cd> map = b;
            synchronized (map) {
                cd cdVar = map.get(b2);
                if (cdVar != null) {
                    Iterator<String> it = cdVar.a(true).iterator();
                    while (it.hasNext()) {
                        arrayList2.add(String.format(Locale.US, "https://%1$s/gslb/?ver=5.0", it.next()));
                    }
                }
            }
        } else {
            arrayList2 = c2.a(format);
        }
        Iterator<String> it2 = arrayList2.iterator();
        IOException e = null;
        while (it2.hasNext()) {
            Uri.Builder buildUpon = Uri.parse(it2.next()).buildUpon();
            for (au auVar : arrayList3) {
                buildUpon.appendQueryParameter(auVar.a(), auVar.b());
            }
            try {
                b bVar = this.f276a;
                if (bVar == null) {
                    return av.a(f14486a, new URL(buildUpon.toString()));
                }
                return bVar.a(buildUpon.toString());
            } catch (IOException e2) {
                e = e2;
            }
        }
        if (e == null) {
            return null;
        }
        com.xiaomi.channel.commonutils.logger.b.m11781a("network exception: " + e.getMessage());
        throw e;
    }

    /* renamed from: a, reason: collision with other method in class */
    public void m11964a() {
        synchronized (this.f278a) {
            this.f278a.clear();
        }
    }

    public String c() {
        StringBuilder sb = new StringBuilder();
        synchronized (this.f278a) {
            for (Map.Entry<String, ce> entry : this.f278a.entrySet()) {
                sb.append(entry.getKey());
                sb.append(":\n");
                sb.append(entry.getValue().toString());
                sb.append("\n");
            }
        }
        return sb.toString();
    }

    public void a(String str, cd cdVar) {
        if (TextUtils.isEmpty(str) || cdVar == null) {
            throw new IllegalArgumentException("the argument is invalid " + str + ", " + cdVar);
        }
        if (this.f275a.a(str)) {
            synchronized (this.f278a) {
                m11966a();
                if (this.f278a.containsKey(str)) {
                    this.f278a.get(str).a(cdVar);
                } else {
                    ce ceVar = new ce(str);
                    ceVar.a(cdVar);
                    this.f278a.put(str, ceVar);
                }
            }
        }
    }

    /* renamed from: b, reason: collision with other method in class */
    public void m11967b() {
        ArrayList<String> arrayList;
        synchronized (this.f278a) {
            m11966a();
            arrayList = new ArrayList<>(this.f278a.keySet());
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ce ceVar = this.f278a.get(arrayList.get(size));
                if (ceVar != null && ceVar.a() != null) {
                    arrayList.remove(size);
                }
            }
        }
        ArrayList<cd> a2 = a(arrayList);
        for (int i = 0; i < arrayList.size(); i++) {
            if (a2.get(i) != null) {
                a(arrayList.get(i), a2.get(i));
            }
        }
    }

    protected String d() {
        BufferedInputStream bufferedInputStream;
        FileInputStream fileInputStream;
        File file;
        try {
            file = new File(f14486a.getFilesDir(), f());
        } catch (Throwable th) {
            th = th;
            bufferedInputStream = null;
            fileInputStream = null;
        }
        if (!file.isFile()) {
            x.a((Closeable) null);
            x.a((Closeable) null);
            return null;
        }
        fileInputStream = new FileInputStream(file);
        try {
            bufferedInputStream = new BufferedInputStream(fileInputStream);
            try {
                String str = new String(h.a(m11961a(), x.a((InputStream) bufferedInputStream)), StandardCharsets.UTF_8);
                com.xiaomi.channel.commonutils.logger.b.b("load host fallbacks = ".concat(str));
                return str;
            } catch (Throwable th2) {
                th = th2;
                try {
                    com.xiaomi.channel.commonutils.logger.b.m11781a("load host exception " + th.getMessage());
                    return null;
                } finally {
                    x.a((Closeable) bufferedInputStream);
                    x.a((Closeable) fileInputStream);
                }
            }
        } catch (Throwable th3) {
            th = th3;
            bufferedInputStream = null;
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    protected boolean m11966a() {
        synchronized (this.f278a) {
            if (f273a) {
                return true;
            }
            f273a = true;
            this.f278a.clear();
            try {
                String d2 = d();
                if (!TextUtils.isEmpty(d2)) {
                    m11968b(d2);
                    com.xiaomi.channel.commonutils.logger.b.b("loading the new hosts succeed");
                    return true;
                }
            } catch (Throwable th) {
                com.xiaomi.channel.commonutils.logger.b.m11781a("load bucket failure: " + th.getMessage());
            }
            return false;
        }
    }

    public static void a(String str, String str2) {
        Map<String, cd> map = b;
        cd cdVar = map.get(str);
        synchronized (map) {
            if (cdVar == null) {
                cd cdVar2 = new cd(str);
                cdVar2.a(604800000L);
                cdVar2.m11953a(str2);
                map.put(str, cdVar2);
            } else {
                cdVar.m11953a(str2);
            }
        }
    }

    /* renamed from: c, reason: collision with other method in class */
    public void m11969c() {
        FileOutputStream fileOutputStream;
        BufferedOutputStream bufferedOutputStream;
        Exception e;
        synchronized (this.f278a) {
            BufferedOutputStream bufferedOutputStream2 = null;
            try {
                String jSONObject = m11963a().toString();
                com.xiaomi.channel.commonutils.logger.b.b("persist host fallbacks = " + jSONObject);
                if (TextUtils.isEmpty(jSONObject)) {
                    fileOutputStream = null;
                } else {
                    fileOutputStream = f14486a.openFileOutput(f(), 0);
                    try {
                        bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
                        try {
                            try {
                                bufferedOutputStream.write(h.b(m11961a(), jSONObject.getBytes(StandardCharsets.UTF_8)));
                                bufferedOutputStream.flush();
                                bufferedOutputStream2 = bufferedOutputStream;
                            } catch (Exception e2) {
                                e = e2;
                                com.xiaomi.channel.commonutils.logger.b.m11781a("persist bucket failure: " + e.getMessage());
                                x.a(bufferedOutputStream);
                                x.a(fileOutputStream);
                            }
                        } catch (Throwable th) {
                            th = th;
                            bufferedOutputStream2 = bufferedOutputStream;
                            x.a(bufferedOutputStream2);
                            x.a(fileOutputStream);
                            throw th;
                        }
                    } catch (Exception e3) {
                        bufferedOutputStream = null;
                        e = e3;
                    } catch (Throwable th2) {
                        th = th2;
                        x.a(bufferedOutputStream2);
                        x.a(fileOutputStream);
                        throw th;
                    }
                }
                x.a(bufferedOutputStream2);
            } catch (Exception e4) {
                bufferedOutputStream = null;
                e = e4;
                fileOutputStream = null;
            } catch (Throwable th3) {
                th = th3;
                fileOutputStream = null;
            }
            x.a(fileOutputStream);
        }
    }

    /* renamed from: d, reason: collision with other method in class */
    public void m11970d() {
        String e = e();
        try {
            File file = new File(f14486a.getFilesDir(), e);
            if (file.exists()) {
                com.xiaomi.channel.commonutils.logger.b.m11781a("Delete old host fallbacks file " + e + (file.delete() ? " successful." : " failed."));
            } else {
                com.xiaomi.channel.commonutils.logger.b.b("Old host fallbacks file " + e + " does not exist.");
            }
        } catch (Exception e2) {
            com.xiaomi.channel.commonutils.logger.b.m11781a("Delete old host fallbacks file " + e + " error: " + e2.getMessage());
        }
    }

    protected String e() {
        if ("com.xiaomi.xmsf".equals(c)) {
            return c;
        }
        return c + ":pushservice";
    }

    private String f() {
        return "host_fallbacks";
    }

    /* renamed from: a, reason: collision with other method in class */
    private byte[] m11961a() {
        return bb.m11909a(f14486a.getPackageName() + "_key_salt");
    }

    private String g() {
        try {
            PackageInfo packageInfo = f14486a.getPackageManager().getPackageInfo(f14486a.getPackageName(), 16384);
            if (packageInfo != null) {
                return packageInfo.versionName;
            }
            return "0";
        } catch (Exception unused) {
            return "0";
        }
    }

    /* renamed from: e, reason: collision with other method in class */
    public void m11971e() {
        String next;
        synchronized (this.f278a) {
            Iterator<ce> it = this.f278a.values().iterator();
            while (it.hasNext()) {
                it.next().a(true);
            }
            while (true) {
                Iterator<String> it2 = this.f278a.keySet().iterator();
                while (it2.hasNext()) {
                    next = it2.next();
                    if (this.f278a.get(next).m11956a().isEmpty()) {
                        break;
                    }
                }
                this.f278a.remove(next);
            }
        }
    }

    static String a(String str) {
        try {
            int length = str.length();
            byte[] bytes = str.getBytes("UTF-8");
            for (int i = 0; i < bytes.length; i++) {
                byte b2 = bytes[i];
                int i2 = b2 & TransmissionUnpacked.HD_VAL_MAGIC_HB;
                if (i2 != 240) {
                    bytes[i] = (byte) (((b2 & 15) ^ ((byte) (((b2 >> 4) + length) & 15))) | i2);
                }
            }
            return new String(bytes);
        } catch (UnsupportedEncodingException unused) {
            return str;
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    public void m11965a(String str) {
        this.f280b = str;
    }

    /* renamed from: a, reason: collision with other method in class */
    protected JSONObject m11963a() {
        JSONObject jSONObject;
        synchronized (this.f278a) {
            jSONObject = new JSONObject();
            jSONObject.put("ver", 2);
            JSONArray jSONArray = new JSONArray();
            Iterator<ce> it = this.f278a.values().iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next().m11957a());
            }
            jSONObject.put("data", jSONArray);
            JSONArray jSONArray2 = new JSONArray();
            Iterator<cd> it2 = b.values().iterator();
            while (it2.hasNext()) {
                jSONArray2.put(it2.next().m11952a());
            }
            jSONObject.put("reserved", jSONArray2);
        }
        return jSONObject;
    }

    /* renamed from: b, reason: collision with other method in class */
    protected void m11968b(String str) {
        synchronized (this.f278a) {
            this.f278a.clear();
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.optInt("ver") != 2) {
                throw new JSONException("Bad version");
            }
            JSONArray optJSONArray = jSONObject.optJSONArray("data");
            if (optJSONArray != null) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    ce a2 = new ce().a(optJSONArray.getJSONObject(i));
                    this.f278a.put(a2.m11955a(), a2);
                }
            }
            JSONArray optJSONArray2 = jSONObject.optJSONArray("reserved");
            if (optJSONArray2 != null) {
                for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                    JSONObject jSONObject2 = optJSONArray2.getJSONObject(i2);
                    String optString = jSONObject2.optString("host");
                    if (!TextUtils.isEmpty(optString)) {
                        try {
                            cd a3 = new cd(optString).a(jSONObject2);
                            b.put(a3.f268b, a3);
                            com.xiaomi.channel.commonutils.logger.b.m11781a("load local reserved host for " + a3.f268b);
                        } catch (JSONException unused) {
                            com.xiaomi.channel.commonutils.logger.b.m11781a("parse reserved host fail.");
                        }
                    }
                }
            }
        }
    }
}
