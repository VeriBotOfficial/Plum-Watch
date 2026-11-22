package com.baidu.bdhttpdns;

import com.phancy.mini.core.api.ApiError;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.RejectedExecutionException;
import java.util.zip.GZIPInputStream;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSession;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;

/* loaded from: classes12.dex */
final class i {

    /* renamed from: a, reason: collision with root package name */
    private static volatile i f7457a = null;
    private static boolean b = true;
    private static c g;
    private String d;
    private String f;

    /* renamed from: q, reason: collision with root package name */
    private int f7458q;
    private int r;
    private String c = "180.76.76.200";
    private String e = "[240c:4006::6666]";
    private boolean h = true;
    private long i = 0;
    private final Object l = new Object();
    private ArrayList<String> m = new ArrayList<>();
    private String n = "";
    private String o = "";
    private boolean p = false;
    private int s = 10;
    private final Object k = new Object();
    private final HashSet<String> j = new HashSet<>();

    interface a {
        void a(int i, d dVar, Map<String, e> map, String str);
    }

    private class b implements Runnable {
        private String c;
        private d d;
        private a e;

        /* renamed from: a, reason: collision with root package name */
        public boolean f7459a = false;
        private boolean f = false;

        public b(String str, d dVar, a aVar) {
            this.c = str;
            this.d = dVar;
            this.e = aVar;
        }

        private String a(String str, int i) {
            if (str == null || i >= 3) {
                return null;
            }
            this.f = true;
            l.a("Using IDCServerIP(%s)", str);
            return str;
        }

        private String a(String str, d dVar) {
            String a2;
            String str2;
            long currentTimeMillis = (System.currentTimeMillis() / 1000) + 300 + i.this.i;
            String a3 = i.this.a(str, currentTimeMillis);
            if (a3 == null) {
                return null;
            }
            if (BDNetworkStateChangeReceiver.isIPv4Reachable()) {
                a2 = a(i.this.d, i.this.f7458q);
                if (a2 == null) {
                    a2 = i.this.c;
                    this.f = false;
                    l.a("Using BGPServerIp(%s)", i.this.c);
                }
                str2 = BDNetworkStateChangeReceiver.isIPv6Reachable() ? "dual_stack" : "ipv4";
            } else {
                if (!BDNetworkStateChangeReceiver.isIPv6Reachable()) {
                    return null;
                }
                a2 = a(i.this.f, i.this.r);
                if (a2 == null) {
                    a2 = i.this.e;
                    this.f = false;
                    l.a("Using BGPServerIp(%s)", i.this.e);
                }
                str2 = "ipv6";
            }
            String str3 = str2;
            String str4 = a2;
            String format = dVar.equals(d.TAG_OF_HOSTS) ? String.format("%s/v4/resolve?account_id=%s&tag=%s&sign=%s&t=%d&sdk_ver=%s&os_type=%s&alt_server_ip=true&type=%s", str4, i.this.n, str, a3, Long.valueOf(currentTimeMillis), "1.3", "android", str3) : String.format("%s/v4/resolve?account_id=%s&dn=%s&sign=%s&t=%d&sdk_ver=%s&os_type=%s&alt_server_ip=true&type=%s", str4, i.this.n, str, a3, Long.valueOf(currentTimeMillis), "1.3", "android", str3);
            return i.this.h ? String.format("https://%s", format) : String.format("http://%s", format);
        }

        private void a() {
            String a2 = a(this.c, this.d);
            l.a("Request url is :%s", a2);
            if (a2 != null) {
                a(a2);
            } else {
                this.e.a(-1, this.d, null, this.c);
                l.a("Httpdns request failed for  %s(%s), get url error", this.d.toString(), this.c);
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:106:0x021d, code lost:
        
            if (com.baidu.bdhttpdns.BDNetworkStateChangeReceiver.isIPv6Reachable() != false) goto L66;
         */
        /* JADX WARN: Code restructure failed: missing block: B:119:0x01d1, code lost:
        
            if (com.baidu.bdhttpdns.BDNetworkStateChangeReceiver.isIPv6Reachable() != false) goto L66;
         */
        /* JADX WARN: Code restructure failed: missing block: B:67:0x0170, code lost:
        
            if (com.baidu.bdhttpdns.BDNetworkStateChangeReceiver.isIPv6Reachable() != false) goto L66;
         */
        /* JADX WARN: Code restructure failed: missing block: B:68:0x0172, code lost:
        
            r12.b.r = 0;
            r2 = r2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:93:0x026a, code lost:
        
            if (com.baidu.bdhttpdns.BDNetworkStateChangeReceiver.isIPv6Reachable() != false) goto L66;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:58:0x0152  */
        /* JADX WARN: Removed duplicated region for block: B:61:0x015b  */
        /* JADX WARN: Removed duplicated region for block: B:70:0x0270  */
        /* JADX WARN: Type inference failed for: r13v31, types: [com.baidu.bdhttpdns.i$a] */
        /* JADX WARN: Type inference failed for: r1v0 */
        /* JADX WARN: Type inference failed for: r1v30 */
        /* JADX WARN: Type inference failed for: r1v31 */
        /* JADX WARN: Type inference failed for: r1v4, types: [java.net.HttpURLConnection] */
        /* JADX WARN: Type inference failed for: r1v9 */
        /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.String] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private void a(java.lang.String r13) {
            /*
                Method dump skipped, instructions count: 691
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.baidu.bdhttpdns.i.b.a(java.lang.String):void");
        }

        @Override // java.lang.Runnable
        public void run() {
            int i;
            a();
            if (this.f7459a) {
                l.a("Retry for %s(%s).", this.d.toString(), this.c);
                a();
            }
            synchronized (i.this.k) {
                if (!this.d.equals(d.TAG_OF_HOSTS)) {
                    for (String str : this.c.split(",")) {
                        i.this.j.remove(str);
                    }
                }
            }
            synchronized (i.this.l) {
                if (this.d.equals(d.DNLIST_HOSTS)) {
                    for (String str2 : this.c.split(",")) {
                        i.this.m.remove(str2);
                    }
                }
            }
        }
    }

    private class c implements HostnameVerifier {
        private c() {
        }

        @Override // javax.net.ssl.HostnameVerifier
        public boolean verify(String str, SSLSession sSLSession) {
            return HttpsURLConnection.getDefaultHostnameVerifier().verify("httpdns.baidubce.com", sSLSession);
        }
    }

    public enum d {
        DNLIST_HOSTS,
        TAG_OF_HOSTS
    }

    public class e {
        private final ArrayList<String> b;
        private final ArrayList<String> c;
        private final long d;

        public e(ArrayList<String> arrayList, ArrayList<String> arrayList2, long j) {
            this.b = arrayList;
            this.c = arrayList2;
            this.d = j;
        }

        public ArrayList<String> a() {
            return this.b;
        }

        public ArrayList<String> b() {
            return this.c;
        }

        public long c() {
            return this.d;
        }
    }

    private i() {
        g = new c();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0039 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private long a(java.lang.String r8, org.json.JSONObject r9, org.json.JSONObject r10) {
        /*
            r7 = this;
            java.lang.String r0 = "ttl"
            r1 = -1
            if (r9 == 0) goto Ld
            long r3 = r9.getLong(r0)     // Catch: org.json.JSONException -> Lb
            goto Le
        Lb:
            r9 = move-exception
            goto L15
        Ld:
            r3 = r1
        Le:
            if (r10 == 0) goto L22
            long r8 = r10.getLong(r0)     // Catch: org.json.JSONException -> Lb
            goto L23
        L15:
            r9.printStackTrace()
            java.lang.String r9 = "Httpdns request failed, host(%s), response has no ttl, will use defaults ttl(60s)"
            java.lang.Object[] r8 = new java.lang.Object[]{r8}
            com.baidu.bdhttpdns.l.a(r9, r8)
            return r1
        L22:
            r8 = r1
        L23:
            r5 = 0
            int r10 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r10 <= 0) goto L32
            int r0 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r0 <= 0) goto L32
            int r10 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r10 >= 0) goto L39
            goto L34
        L32:
            if (r10 <= 0) goto L35
        L34:
            return r3
        L35:
            int r10 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r10 <= 0) goto L3a
        L39:
            return r8
        L3a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baidu.bdhttpdns.i.a(java.lang.String, org.json.JSONObject, org.json.JSONObject):long");
    }

    static i a() {
        if (f7457a == null) {
            synchronized (i.class) {
                if (f7457a == null) {
                    f7457a = new i();
                }
            }
        }
        return f7457a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String a(InputStream inputStream, HttpURLConnection httpURLConnection) {
        String contentEncoding = httpURLConnection.getContentEncoding();
        if (contentEncoding != null) {
            try {
                if (contentEncoding.contains("gzip")) {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    int contentLength = httpURLConnection.getContentLength();
                    if (contentLength <= 0) {
                        contentLength = 1024;
                        byte[] bArr = new byte[1024];
                        while (true) {
                            int read = inputStream.read(bArr);
                            if (-1 == read) {
                                break;
                            }
                            byteArrayOutputStream.write(bArr, 0, read);
                        }
                    } else {
                        byte[] bArr2 = new byte[contentLength];
                        inputStream.read(bArr2);
                        byteArrayOutputStream.write(bArr2, 0, contentLength);
                    }
                    byteArrayOutputStream.flush();
                    byteArrayOutputStream.close();
                    return a(byteArrayOutputStream.toByteArray(), contentLength);
                }
            } catch (UnsupportedEncodingException e2) {
                e2.printStackTrace();
                return null;
            } catch (IOException e3) {
                e3.printStackTrace();
                return null;
            }
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
        StringBuilder sb = new StringBuilder();
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                bufferedReader.close();
                return sb.toString();
            }
            sb.append(readLine);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String a(String str, long j) {
        return com.baidu.bdhttpdns.e.e(String.format("%s-%s-%d", str, e(), Long.valueOf(j)));
    }

    private String a(byte[] bArr, int i) {
        byte[] bArr2 = new byte[i];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            GZIPInputStream gZIPInputStream = new GZIPInputStream(new ByteArrayInputStream(bArr), i);
            do {
                int read = gZIPInputStream.read(bArr2, 0, i);
                byteArrayOutputStream.write(bArr2, 0, read);
                if (read == -1) {
                    break;
                }
            } while (!b(byteArrayOutputStream.toString()));
            gZIPInputStream.close();
            return byteArrayOutputStream.toString();
        } catch (IOException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    private ArrayList<String> a(String str, String str2, JSONObject jSONObject) {
        JSONArray optJSONArray = jSONObject.optJSONArray(IjkMediaPlayer.OnNativeInvokeListener.ARG_IP);
        if (optJSONArray == null || optJSONArray.length() == 0) {
            l.a("Httpdns request warning, host(%s), response has no ip field in %s", str2, str);
            return null;
        }
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 0; i < optJSONArray.length(); i++) {
            String optString = optJSONArray.optString(i);
            if (optString == null || optString.isEmpty()) {
                l.a("Httpdns request warning, host(%s), response of data get ip error in %s", str2, str);
            } else if (com.baidu.bdhttpdns.e.a(optString) || com.baidu.bdhttpdns.e.b(optString)) {
                arrayList.add(optString);
            } else {
                l.a("Httpdns request warning, host(%s), response of data get invalid ip(%s) in %s", str2, optString, str);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a(Boolean bool) {
        if (bool.booleanValue()) {
            if (BDNetworkStateChangeReceiver.isIPv4Reachable()) {
                int i = this.f7458q + 1;
                this.f7458q = i;
                l.a("requestV4IDCFailNum: %s", Integer.valueOf(i));
            } else if (BDNetworkStateChangeReceiver.isIPv6Reachable()) {
                int i2 = this.r + 1;
                this.r = i2;
                l.a("requestV6IDCFailNum: %s", Integer.valueOf(i2));
            }
        }
    }

    private String b(String str, String str2, JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            return jSONObject.getString("msg");
        } catch (JSONException e2) {
            e2.printStackTrace();
            l.a("Httpdns request failed, host(%s), response has no msg in %s ", str2, str);
            return null;
        }
    }

    public static boolean b(String str) {
        try {
            new JSONObject(str);
            return true;
        } catch (JSONException unused) {
            return false;
        }
    }

    Map a(String str, String str2) {
        ArrayList<String> arrayList;
        ArrayList<String> arrayList2;
        i iVar = this;
        HashMap hashMap = new HashMap();
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("serverip")) {
                JSONObject optJSONObject = jSONObject.optJSONObject("serverip");
                JSONArray optJSONArray = optJSONObject.optJSONArray("ipv4");
                if (optJSONArray != null && optJSONArray.length() > 0) {
                    iVar.d = optJSONArray.optString(0);
                }
                JSONArray optJSONArray2 = optJSONObject.optJSONArray("ipv6");
                if (optJSONArray2 != null && optJSONArray2.length() > 0) {
                    iVar.f = "[" + optJSONArray2.optString(0) + "]";
                }
            }
            JSONObject optJSONObject2 = jSONObject.optJSONObject("data");
            if (optJSONObject2 == null) {
                l.a("Httpdns request failed, hostsOrTag(%s), response has empty data", str2);
                return null;
            }
            Iterator<String> keys = optJSONObject2.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                JSONObject optJSONObject3 = optJSONObject2.optJSONObject(next);
                JSONObject optJSONObject4 = optJSONObject3.optJSONObject("ipv4");
                JSONObject optJSONObject5 = optJSONObject3.optJSONObject("ipv6");
                long a2 = iVar.a(next, optJSONObject4, optJSONObject5);
                if (a2 < 0) {
                    hashMap.put(next, null);
                } else {
                    String b2 = iVar.b("ipv4Obj", next, optJSONObject4);
                    String b3 = iVar.b("ipv6Obj", next, optJSONObject5);
                    if (b2 == null || b2.isEmpty()) {
                        l.a("Host(%s) ipv4Msg(%s), will deprecated the ipv4List result", next, b2);
                        arrayList = null;
                    } else {
                        arrayList = iVar.a("ipv4Obj", next, optJSONObject4);
                    }
                    if (b3 == null || b3.isEmpty()) {
                        l.a("Host(%s) ipv6Msg(%s), will deprecated the ipv6List result", next, b3);
                        arrayList2 = null;
                    } else {
                        arrayList2 = iVar.a("ipv6Obj", next, optJSONObject5);
                    }
                    if ((arrayList == null || arrayList.isEmpty()) && (arrayList2 == null || arrayList2.isEmpty())) {
                        l.a("Httpdns request failed, host(%s), response has no valid ip", next);
                        hashMap.put(next, null);
                    } else {
                        hashMap.put(next, iVar.new e(arrayList, arrayList2, a2));
                    }
                    iVar = this;
                }
            }
            return hashMap;
        } catch (JSONException e2) {
            e2.printStackTrace();
            l.a("Httpdns request failed, hostsOrTag(%s), response parse data json error", str2);
            return null;
        }
    }

    Map a(String str, String str2, d dVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("isMsgOK", false);
        hashMap.put("isSignExpired", false);
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("msg");
            if (optString == null || optString.isEmpty()) {
                l.a("Httpdns request failed for %s(%s), response lack of msg", dVar.toString(), str2);
                return hashMap;
            }
            if (!"SignatureExpired".equals(optString)) {
                if (ApiError.ERROR_MSG_OK.equals(optString)) {
                    hashMap.put("isMsgOK", true);
                    return hashMap;
                }
                l.a("Httpdns request failed for %s(%s), response msg(%s) is not ok", dVar.toString(), str2, optString);
                return hashMap;
            }
            int optInt = jSONObject.optInt("timestamp");
            if (optInt == 0) {
                l.a("Httpdns request failed for %s(%s), response get invalid timestamp", dVar.toString(), str2);
                return hashMap;
            }
            this.i = optInt - (System.currentTimeMillis() / 1000);
            hashMap.put("isSignExpired", true);
            return hashMap;
        } catch (JSONException e2) {
            e2.printStackTrace();
            l.a("Httpdns request failed for %s(%s), response parse json error", dVar.toString(), str2);
            return hashMap;
        }
    }

    public void a(String str) {
        synchronized (this.l) {
            if (!this.m.contains(str)) {
                this.m.add(str);
            }
        }
    }

    void a(String str, d dVar, a aVar) {
        if (str == null || str.isEmpty()) {
            return;
        }
        synchronized (this.k) {
            if (dVar.equals(d.DNLIST_HOSTS)) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(Arrays.asList(str.split(",")));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    String str2 = (String) it.next();
                    if (this.j.contains(str2)) {
                        l.a("Httpdns request request for host(%s) is in processing，will exclude it.", str2);
                        it.remove();
                    } else {
                        this.j.add(str2);
                    }
                }
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < arrayList.size(); i++) {
                    sb.append((String) arrayList.get(i)).append(",");
                }
                str = sb.toString().replaceAll("^,*|,*$", "");
            }
            if (str != null && !str.isEmpty()) {
                try {
                    m.a().b().execute(new b(str, dVar, aVar));
                } catch (RejectedExecutionException e2) {
                    e2.printStackTrace();
                    l.a("Httpdns request failed, host(%s), async tasks has exceed the maximum thread limit.", str);
                }
            }
        }
    }

    public void a(ArrayList<String> arrayList, a aVar) {
        ArrayList arrayList2 = new ArrayList(new HashSet(arrayList));
        int i = 0;
        int i2 = 0;
        while (i < arrayList2.size()) {
            String str = "";
            int i3 = 0;
            while (true) {
                int i4 = this.s;
                if (i3 >= i4 || (i = i3 + (i4 * i2)) >= arrayList2.size()) {
                    break;
                }
                str = str + ((String) arrayList2.get(i)) + ",";
                i3++;
            }
            i2++;
            if (str != null && !str.isEmpty()) {
                String substring = str.substring(0, str.length() - 1);
                l.a("Hosts for httpdns request is (%s) ", substring);
                a(substring, d.DNLIST_HOSTS, aVar);
            }
        }
    }

    void a(boolean z) {
        this.h = z;
    }

    public void b() {
        this.f7458q = 0;
        this.r = 0;
        this.d = null;
        this.f = null;
    }

    public void b(boolean z) {
        this.p = z;
    }

    public ArrayList c() {
        return this.m;
    }

    void c(String str) {
        this.n = str;
    }

    public int d() {
        return this.s;
    }

    void d(String str) {
        String f = com.baidu.bdhttpdns.e.f(str);
        this.o = f;
        if (f == null) {
            this.o = str;
            b = false;
        }
    }

    String e() {
        return !b ? this.o : com.baidu.bdhttpdns.e.g(this.o);
    }

    boolean f() {
        return this.p;
    }
}
