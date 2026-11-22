package com.amap.api.col.p0003sl;

import android.gov.nist.core.Separators;
import android.text.TextUtils;
import com.amap.api.col.p0003sl.hb;
import com.applovin.sdk.AppLovinEventTypes;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import java.net.Proxy;
import java.util.Map;

/* compiled from: Request.java */
/* loaded from: classes11.dex */
public abstract class ob {
    public static final int DEFAULT_RETRY_TIMEOUT = 5000;
    hb.a f;
    private String h;
    private boolean i;
    private boolean j;
    int c = 20000;
    int d = 20000;
    Proxy e = null;

    /* renamed from: a, reason: collision with root package name */
    private boolean f1812a = false;
    private int b = 20000;
    private boolean g = true;
    private boolean k = false;
    private a l = a.NORMAL;
    private b m = b.FIRST_NONDEGRADE;
    private boolean n = false;

    /* compiled from: Request.java */
    public enum a {
        NORMAL(0),
        INTERRUPT_IO(1),
        NEVER(2),
        FIX(3),
        SINGLE(4);

        a(int i) {
        }
    }

    /* compiled from: Request.java */
    public enum b {
        FIRST_NONDEGRADE(0),
        NEVER_GRADE(1),
        DEGRADE_BYERROR(2),
        DEGRADE_ONLY(3),
        FIX_NONDEGRADE(4),
        FIX_DEGRADE_BYERROR(5),
        FIX_DEGRADE_ONLY(6);


        /* renamed from: a, reason: collision with root package name */
        private int f1814a;

        b(int i2) {
            this.f1814a = i2;
        }

        public final int a() {
            return this.f1814a;
        }

        public final boolean b() {
            int i2 = this.f1814a;
            return i2 == 2 || i2 == 3 || i2 == 5 || i2 == 6;
        }

        public final boolean c() {
            int i2 = this.f1814a;
            return i2 == 2 || i2 == 5;
        }

        public final boolean d() {
            return this.f1814a == 1;
        }

        public final boolean e() {
            int i2 = this.f1814a;
            return i2 == 0 || i2 == 1 || i2 == 4;
        }
    }

    /* compiled from: Request.java */
    public enum c {
        HTTP(0),
        HTTPS(1);

        c(int i) {
        }
    }

    final String a() {
        return a(getURL());
    }

    final String b() {
        return a(getIPV6URL());
    }

    public int getConntectionTimeout() {
        return this.c;
    }

    protected a getDegradeAbility() {
        return this.l;
    }

    protected b getDegradeType() {
        return this.m;
    }

    public byte[] getEntityBytes() {
        return null;
    }

    protected String getIPDNSName() {
        return "";
    }

    public String getIPV6URL() {
        return getURL();
    }

    protected String getNon_degrade_final_Host() {
        return this.h;
    }

    public abstract Map<String, String> getParams();

    public Proxy getProxy() {
        return this.e;
    }

    protected int getReal_max_timeout() {
        return this.b;
    }

    public abstract Map<String, String> getRequestHead();

    public String getSDKName() {
        return "";
    }

    public int getSoTimeout() {
        return this.d;
    }

    public abstract String getURL();

    public hb.a getUrlConnectionImpl() {
        return this.f;
    }

    protected boolean isBinary() {
        return this.f1812a;
    }

    protected boolean isHostToIP() {
        return this.g;
    }

    protected boolean isHttps() {
        return this.j;
    }

    protected boolean isIPRequest() {
        return !TextUtils.isEmpty(getIPDNSName());
    }

    protected boolean isIPV6Request() {
        return this.i;
    }

    public boolean isIgnoreGZip() {
        return false;
    }

    public boolean isKeepAlive() {
        return this.k;
    }

    public boolean isSupportIPV6() {
        return false;
    }

    protected boolean isTLSv3() {
        return this.n;
    }

    protected String parseSDKNameFromPlatInfo(String str) {
        String str2;
        String str3 = "";
        try {
            if (!TextUtils.isEmpty(str)) {
                String[] split = str.split("&");
                if (split.length > 1) {
                    int length = split.length;
                    int i = 0;
                    String str4 = "";
                    while (true) {
                        if (i >= length) {
                            str2 = "";
                            break;
                        }
                        str2 = split[i];
                        if (str2.contains("sdkversion")) {
                            str4 = str2;
                        }
                        if (str2.contains(AppLovinEventTypes.USER_VIEWED_PRODUCT)) {
                            break;
                        }
                        i++;
                    }
                    if (!TextUtils.isEmpty(str2)) {
                        String[] split2 = str2.split("=");
                        if (split2.length > 1) {
                            str3 = split2[1].trim();
                            if (!TextUtils.isEmpty(str4) && TextUtils.isEmpty(ba.a(str3))) {
                                String[] split3 = str4.split("=");
                                if (split3.length > 1) {
                                    ba.a(str3, split3[1].trim());
                                }
                            }
                        }
                    }
                }
            }
            return str3;
        } catch (Throwable th) {
            fa.a(th, DownloadCommon.DOWNLOAD_REPORT_HOST, "pnfp");
            return str3;
        }
    }

    protected String parseSdkNameFromHeader(Map<String, String> map) {
        if (map == null) {
            return null;
        }
        try {
            if (map.containsKey("platinfo")) {
                return parseSDKNameFromPlatInfo(map.get("platinfo"));
            }
            return null;
        } catch (Throwable th) {
            fa.a(th, DownloadCommon.DOWNLOAD_REPORT_HOST, "pnfh");
            return null;
        }
    }

    protected String parseSdkNameFromRequest() {
        String str;
        try {
            str = getSDKName();
            try {
                return TextUtils.isEmpty(str) ? this.f1812a ? parseSDKNameFromPlatInfo(((ib) this).getPlatInfo()) : parseSdkNameFromHeader(getRequestHead()) : str;
            } catch (Throwable th) {
                th = th;
                fa.a(th, DownloadCommon.DOWNLOAD_REPORT_HOST, "pnfr");
                return str;
            }
        } catch (Throwable th2) {
            th = th2;
            str = "";
        }
    }

    public void setBinary(boolean z) {
        this.f1812a = z;
    }

    public final void setConnectionTimeout(int i) {
        this.c = i;
    }

    public void setDegradeAbility(a aVar) {
        this.l = aVar;
    }

    public void setDegradeType(b bVar) {
        this.m = bVar;
    }

    public void setHostToIP(boolean z) {
        this.g = z;
    }

    public void setHttpProtocol(c cVar) {
        this.j = cVar == c.HTTPS;
    }

    public void setIPV6Request(boolean z) {
        this.i = z;
    }

    public void setKeepAlive(boolean z) {
        this.k = z;
    }

    public void setNon_degrade_final_Host(String str) {
        this.h = str;
    }

    public final void setProxy(Proxy proxy) {
        this.e = proxy;
    }

    public void setReal_max_timeout(int i) {
        this.b = i;
    }

    public final void setSoTimeout(int i) {
        this.d = i;
    }

    public void setTLSv3(boolean z) {
        this.n = z;
    }

    public void setUrlConnectionImpl(hb.a aVar) {
        this.f = aVar;
    }

    private String a(String str) {
        Map<String, String> params;
        byte[] entityBytes = getEntityBytes();
        if (entityBytes == null || entityBytes.length == 0 || (params = getParams()) == null) {
            return str;
        }
        String a2 = lb.a(params);
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(str).append(Separators.QUESTION).append(a2);
        return stringBuffer.toString();
    }
}
