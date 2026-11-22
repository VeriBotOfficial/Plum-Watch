package com.baidu.platform.comapi.logstatistics;

import com.baidu.platform.comapi.JNIInitializer;
import com.baidu.platform.comapi.util.JsonBuilder;
import com.baidu.platform.comapi.util.SysOSUtil;
import com.baidu.platform.comjni.base.logstatistics.NALogStatistics;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes13.dex */
public class LogStatistics {

    /* renamed from: a, reason: collision with root package name */
    private NALogStatistics f8569a;
    private ArrayList<c> b;

    private static class b {

        /* renamed from: a, reason: collision with root package name */
        private static final LogStatistics f8570a = new LogStatistics();
    }

    private boolean b() {
        if (this.f8569a != null) {
            return true;
        }
        this.f8569a = new NALogStatistics();
        return true;
    }

    public static LogStatistics getInstance() {
        return b.f8570a;
    }

    public static void onAddLog(int i, int i2, String str, String str2) {
        getInstance().a(new com.baidu.platform.comapi.logstatistics.b(i, i2, str, str2));
    }

    public void a() {
        NALogStatistics nALogStatistics = this.f8569a;
        if (nALogStatistics != null) {
            nALogStatistics.dispose();
            this.f8569a = null;
        }
    }

    private LogStatistics() {
        this.f8569a = null;
        this.b = new ArrayList<>();
        b();
    }

    public void a(int i, int i2, String str, Map<String, Object> map) {
        String str2;
        if (map == null || map.size() <= 0) {
            str2 = null;
        } else {
            JsonBuilder jsonBuilder = new JsonBuilder();
            jsonBuilder.object();
            for (String str3 : map.keySet()) {
                Object obj = map.get(str3);
                if (obj != null) {
                    jsonBuilder.key(str3).value(obj);
                }
            }
            jsonBuilder.endObject();
            str2 = jsonBuilder.getJson();
        }
        a(i, i2, str, str2);
    }

    public boolean a(int i, int i2, String str, String str2) {
        if (this.f8569a == null) {
            return false;
        }
        if (JNIInitializer.isDebug() || JNIInitializer.isBaseLineRelease()) {
            a(new com.baidu.platform.comapi.logstatistics.b(i, i2, str, str2));
        }
        return this.f8569a.a(i, i2, SysOSUtil.getInstance().getNetType(), str, str2);
    }

    public boolean a(com.baidu.platform.comapi.logstatistics.b bVar) {
        ArrayList<c> arrayList = this.b;
        if (arrayList == null || arrayList.isEmpty()) {
            return false;
        }
        Iterator<c> it = this.b.iterator();
        while (it.hasNext()) {
            it.next().a(bVar);
        }
        return false;
    }
}
