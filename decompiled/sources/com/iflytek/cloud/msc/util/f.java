package com.iflytek.cloud.msc.util;

import android.content.Context;
import com.iflytek.cloud.msc.util.log.DebugLog;
import com.iflytek.cloud.util.FileDownloadListener;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes17.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    private static f f11187a;
    private Context e;
    private b f;
    private final String g = "download_uri";
    private final String h = "file_path";
    private final String i = "file_md5";
    protected Object j = new Object();
    private com.iflytek.cloud.msc.util.l.a k = new a();
    private HashMap<Long, com.iflytek.cloud.b.a> b = new HashMap<>();
    private HashMap<Long, String> d = new HashMap<>();
    private HashMap<Long, FileDownloadListener> c = new HashMap<>();

    class a implements com.iflytek.cloud.msc.util.l.a {
        a() {
        }
    }

    private f(Context context) {
        this.f = null;
        this.e = context;
        this.f = b.a(this.e);
    }

    public static f a(Context context) {
        if (f11187a == null) {
            f11187a = new f(context);
        }
        return f11187a;
    }

    public int a(String str, String str2, String str3, FileDownloadListener fileDownloadListener) {
        long a2 = a(str, str2, str3);
        if (this.b.size() > 0 && a2 != 0) {
            this.c.put(Long.valueOf(a2), fileDownloadListener);
            return -1;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (fileDownloadListener != null) {
            this.c.put(Long.valueOf(currentTimeMillis), fileDownloadListener);
        }
        com.iflytek.cloud.b.a aVar = new com.iflytek.cloud.b.a();
        aVar.b("download_uri", str);
        aVar.b("file_path", str2);
        aVar.b("file_md5", str3);
        this.b.put(Long.valueOf(currentTimeMillis), aVar);
        DebugLog.LogD("tempFile:" + this.f.a(str, (String) null));
        return 0;
    }

    private long a(String str, String str2, String str3) {
        synchronized (this.j) {
            for (Map.Entry<Long, com.iflytek.cloud.b.a> entry : this.b.entrySet()) {
                long longValue = entry.getKey().longValue();
                com.iflytek.cloud.b.a value = entry.getValue();
                if (value.a("download_uri").equals(str) && value.a("file_path").equals(str2) && value.a("file_md5").equals(str3)) {
                    return longValue;
                }
            }
            return 0L;
        }
    }
}
