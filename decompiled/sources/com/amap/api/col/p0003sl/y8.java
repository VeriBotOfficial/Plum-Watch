package com.amap.api.col.p0003sl;

import com.amap.api.services.core.AMapException;
import com.anythink.core.api.ErrorCode;

/* compiled from: AMapCoreException.java */
/* loaded from: classes11.dex */
public class y8 extends Exception {

    /* renamed from: a, reason: collision with root package name */
    private String f1985a;
    private String b;
    private String c;
    private String d;
    private String e;
    private int f;
    private int g;
    private volatile boolean h;

    public y8(String str) {
        super(str);
        this.f1985a = "未知的错误";
        this.b = "";
        this.c = "";
        this.d = "1900";
        this.e = "UnknownError";
        this.f = -1;
        this.g = -1;
        this.h = false;
        this.f1985a = str;
        if (AMapException.AMAP_CLIENT_IO_EXCEPTION.equals(str)) {
            this.f = 21;
            this.d = "1902";
            this.e = "IOException";
        } else if ("socket 连接异常 - SocketException".equals(str)) {
            this.f = 22;
        } else if (AMapException.AMAP_CLIENT_SOCKET_TIMEOUT_EXCEPTION.equals(str)) {
            this.f = 23;
            this.d = "1802";
            this.e = "SocketTimeoutException";
        } else if (AMapException.AMAP_CLIENT_INVALID_PARAMETER.equals(str)) {
            this.f = 24;
            this.d = "1901";
            this.e = "IllegalArgumentException";
        } else if (AMapException.AMAP_CLIENT_NULLPOINT_EXCEPTION.equals(str)) {
            this.f = 25;
            this.d = "1903";
            this.e = "NullPointException";
        } else if (AMapException.AMAP_CLIENT_URL_EXCEPTION.equals(str)) {
            this.f = 26;
            this.d = "1803";
            this.e = "MalformedURLException";
        } else if (AMapException.AMAP_CLIENT_UNKNOWHOST_EXCEPTION.equals(str)) {
            this.f = 27;
            this.d = "1804";
            this.e = "UnknownHostException";
        } else if ("服务器连接失败 - UnknownServiceException".equals(str)) {
            this.f = 28;
            this.d = "1805";
            this.e = "CannotConnectToHostException";
        } else if (AMapException.AMAP_CLIENT_ERROR_PROTOCOL.equals(str)) {
            this.f = 29;
            this.d = "1801";
            this.e = "ProtocolException";
        } else if ("http连接失败 - ConnectionException".equals(str)) {
            this.f = 30;
            this.d = "1806";
            this.e = "ConnectionException";
        } else if ("服务QPS超限".equalsIgnoreCase(str)) {
            this.f = 30;
            this.d = ErrorCode.timeOutError;
            this.e = "ConnectionException";
        } else if ("未知的错误".equals(str)) {
            this.f = 31;
        } else if ("key鉴权失败".equals(str)) {
            this.f = 32;
        } else if ("限制访问的接口".equals(str)) {
            this.f = 33;
        } else if ("requeust is null".equals(str)) {
            this.f = 1;
        } else if ("request url is empty".equals(str)) {
            this.f = 2;
        } else if ("response is null".equals(str)) {
            this.f = 3;
        } else if ("thread pool has exception".equals(str)) {
            this.f = 4;
        } else if ("sdk name is invalid".equals(str)) {
            this.f = 5;
        } else if ("sdk info is null".equals(str)) {
            this.f = 6;
        } else if ("sdk packages is null".equals(str)) {
            this.f = 7;
        } else if ("线程池为空".equals(str)) {
            this.f = 8;
        } else if ("获取对象错误".equals(str)) {
            this.f = 101;
        } else if ("DNS解析失败".equals(str)) {
            this.f = 3;
        } else {
            this.f = -1;
        }
        if (AMapException.AMAP_CLIENT_IO_EXCEPTION.equals(str)) {
            this.g = 7;
            return;
        }
        if ("socket 连接异常 - SocketException".equals(str)) {
            this.g = 6;
            return;
        }
        if (AMapException.AMAP_CLIENT_SOCKET_TIMEOUT_EXCEPTION.equals(str)) {
            this.g = 2;
            return;
        }
        if (!AMapException.AMAP_CLIENT_UNKNOWHOST_EXCEPTION.equals(str)) {
            if ("http连接失败 - ConnectionException".equals(str)) {
                this.g = 6;
                return;
            } else if (!"未知的错误".equals(str) && "DNS解析失败".equals(str)) {
                this.g = 3;
                return;
            }
        }
        this.g = 9;
    }

    public int a() {
        return this.g;
    }

    public String b() {
        return this.c;
    }

    public int c() {
        return this.f;
    }

    public String d() {
        return this.f1985a;
    }

    public String e() {
        return this.b;
    }

    public String f() {
        return this.d;
    }

    public String g() {
        return this.e;
    }

    public boolean h() {
        return this.h;
    }

    public int a(int i) {
        this.g = i;
        return i;
    }

    public void b(int i) {
        this.f = i;
    }

    public void a(boolean z) {
        this.h = z;
    }

    public y8(String str, String str2, String str3) {
        this(str);
        this.b = str2;
        this.c = str3;
    }
}
