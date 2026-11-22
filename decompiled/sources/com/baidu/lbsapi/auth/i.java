package com.baidu.lbsapi.auth;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import android.text.TextUtils;
import java.io.UnsupportedEncodingException;
import java.net.Authenticator;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;

/* loaded from: classes13.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    private Context f7494a;
    private String e;
    private String g;
    private String h;
    private String b = null;
    private HashMap c = null;
    private String d = null;
    private int f = -1;

    public i(Context context) {
        this.f7494a = context;
    }

    private String a(Context context) {
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager == null) {
                return null;
            }
            if (Build.VERSION.SDK_INT >= 29) {
                NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
                if (networkCapabilities != null) {
                    return networkCapabilities.hasTransport(1) ? "WIFI" : networkCapabilities.hasTransport(0) ? "CELLULAR" : networkCapabilities.hasTransport(3) ? "ETHERNET" : networkCapabilities.hasTransport(6) ? "LoWPAN" : networkCapabilities.hasTransport(4) ? "VPN" : networkCapabilities.hasTransport(5) ? "WifiAware" : "wifi";
                }
                return "wifi";
            }
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null && activeNetworkInfo.isAvailable()) {
                String extraInfo = activeNetworkInfo.getExtraInfo();
                return extraInfo != null ? (extraInfo.trim().toLowerCase().equals("cmwap") || extraInfo.trim().toLowerCase().equals("uniwap") || extraInfo.trim().toLowerCase().equals("3gwap") || extraInfo.trim().toLowerCase().equals("ctwap")) ? extraInfo.trim().toLowerCase().equals("ctwap") ? "ctwap" : "cmwap" : "wifi" : "wifi";
            }
            return null;
        } catch (Exception e) {
            if (b.f7488a) {
                e.printStackTrace();
            }
            return null;
        }
    }

    private static String a(HashMap hashMap) throws UnsupportedEncodingException {
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (Map.Entry entry : hashMap.entrySet()) {
            if (z) {
                z = false;
            } else {
                sb.append("&");
            }
            sb.append(URLEncoder.encode((String) entry.getKey(), "UTF-8"));
            sb.append("=");
            sb.append(URLEncoder.encode((String) entry.getValue(), "UTF-8"));
        }
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:113:0x01c6, code lost:
    
        if (com.baidu.lbsapi.auth.b.f7488a == false) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0193, code lost:
    
        if (com.baidu.lbsapi.auth.b.f7488a == false) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0163, code lost:
    
        if (com.baidu.lbsapi.auth.b.f7488a == false) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0102, code lost:
    
        if (com.baidu.lbsapi.auth.b.f7488a == false) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0104, code lost:
    
        r13.printStackTrace();
     */
    /* JADX WARN: Removed duplicated region for block: B:105:0x019d A[Catch: all -> 0x0130, TryCatch #8 {all -> 0x0130, blocks: (B:8:0x002c, B:131:0x0135, B:133:0x0139, B:134:0x013c, B:117:0x0168, B:119:0x016c, B:120:0x016f, B:103:0x0199, B:105:0x019d, B:106:0x01a0), top: B:7:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01bf A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x016c A[Catch: all -> 0x0130, TryCatch #8 {all -> 0x0130, blocks: (B:8:0x002c, B:131:0x0135, B:133:0x0139, B:134:0x013c, B:117:0x0168, B:119:0x016c, B:120:0x016f, B:103:0x0199, B:105:0x019d, B:106:0x01a0), top: B:7:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x018c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0139 A[Catch: all -> 0x0130, TryCatch #8 {all -> 0x0130, blocks: (B:8:0x002c, B:131:0x0135, B:133:0x0139, B:134:0x013c, B:117:0x0168, B:119:0x016c, B:120:0x016f, B:103:0x0199, B:105:0x019d, B:106:0x01a0), top: B:7:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x015b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01cc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00fa A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b1 A[Catch: all -> 0x0109, TryCatch #4 {all -> 0x0109, blocks: (B:55:0x00ad, B:57:0x00b1, B:58:0x00ce), top: B:54:0x00ad }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00f5 A[Catch: Exception -> 0x011a, IOException -> 0x011c, MalformedURLException -> 0x011e, all -> 0x0120, TRY_LEAVE, TryCatch #0 {all -> 0x0120, blocks: (B:10:0x0030, B:68:0x010e, B:70:0x0116, B:71:0x0119, B:61:0x00ed, B:63:0x00f5, B:19:0x008d, B:21:0x0095), top: B:9:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x010c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0116 A[Catch: Exception -> 0x011a, IOException -> 0x011c, MalformedURLException -> 0x011e, all -> 0x0120, TryCatch #0 {all -> 0x0120, blocks: (B:10:0x0030, B:68:0x010e, B:70:0x0116, B:71:0x0119, B:61:0x00ed, B:63:0x00f5, B:19:0x008d, B:21:0x0095), top: B:9:0x0030 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(javax.net.ssl.HttpsURLConnection r13) {
        /*
            Method dump skipped, instructions count: 554
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baidu.lbsapi.auth.i.a(javax.net.ssl.HttpsURLConnection):void");
    }

    private HashMap b(HashMap hashMap) {
        HashMap hashMap2 = new HashMap();
        Iterator it = hashMap.keySet().iterator();
        while (it.hasNext()) {
            String str = ((String) it.next()).toString();
            hashMap2.put(str, hashMap.get(str));
        }
        return hashMap2;
    }

    private HttpsURLConnection b() {
        String str;
        URLConnection openConnection;
        try {
            URL url = new URL(this.b);
            b.a("https URL: " + this.b);
            String a2 = a(this.f7494a);
            if (a2 != null && !a2.equals("")) {
                if (TextUtils.isEmpty(this.e) || this.f == -1) {
                    b.a("checkNetwork = " + a2);
                    openConnection = url.openConnection();
                } else {
                    b.a("Proxy mProxyHost: = " + this.e + " mProxyPort: " + this.f);
                    Proxy proxy = new Proxy(Proxy.Type.SOCKS, new InetSocketAddress(this.e, this.f));
                    Authenticator.setDefault(new j(this));
                    openConnection = url.openConnection(proxy);
                }
                HttpsURLConnection httpsURLConnection = (HttpsURLConnection) openConnection;
                httpsURLConnection.setHostnameVerifier(new k(this));
                httpsURLConnection.setDoInput(true);
                httpsURLConnection.setDoOutput(true);
                httpsURLConnection.setRequestMethod("POST");
                httpsURLConnection.setConnectTimeout(50000);
                httpsURLConnection.setReadTimeout(50000);
                return httpsURLConnection;
            }
            b.c("Current network is not available.");
            this.d = ErrorMessage.a(-10, "Current network is not available.");
            return null;
        } catch (MalformedURLException e) {
            if (b.f7488a) {
                e.printStackTrace();
                b.a(e.getMessage());
            }
            str = "Auth server could not be parsed as a URL.";
            this.d = ErrorMessage.a(-11, str);
            return null;
        } catch (Exception e2) {
            if (b.f7488a) {
                e2.printStackTrace();
                b.a(e2.getMessage());
            }
            str = "Init httpsurlconnection failed.";
            this.d = ErrorMessage.a(-11, str);
            return null;
        }
    }

    protected String a(HashMap hashMap, String str, int i, String str2, String str3) {
        HashMap b = b(hashMap);
        this.c = b;
        this.b = (String) b.get("url");
        this.e = str;
        this.f = i;
        this.g = str2;
        this.h = str3;
        HttpsURLConnection b2 = b();
        if (b2 == null) {
            b.c("syncConnect failed,httpsURLConnection is null");
        } else {
            a(b2);
        }
        return this.d;
    }

    protected boolean a() {
        b.a("checkNetwork start");
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) this.f7494a.getSystemService("connectivity");
            if (connectivityManager == null) {
                return false;
            }
            if (Build.VERSION.SDK_INT >= 29) {
                NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
                return networkCapabilities != null && networkCapabilities.hasCapability(12) && networkCapabilities.hasCapability(16);
            }
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo == null || !activeNetworkInfo.isAvailable()) {
                return false;
            }
            b.a("checkNetwork end");
            return true;
        } catch (Exception e) {
            if (b.f7488a) {
                e.printStackTrace();
            }
            return false;
        }
    }
}
