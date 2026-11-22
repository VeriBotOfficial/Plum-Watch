package com.baidu.platform.comapi.wnplatform.p;

import com.baidu.mapapi.map.BaiduMap;

/* compiled from: IndoorMapUtils.java */
/* loaded from: classes13.dex */
public class e {
    public static void a(String str, String str2, boolean z) {
        BaiduMap map;
        com.baidu.platform.comapi.wnplatform.walkmap.c t = com.baidu.platform.comapi.walknavi.b.n().t();
        if (t != null && t.e() != null && (map = t.e().getMap()) != null) {
            map.switchBaseIndoorMapFloor(str, str2);
        }
        if (z) {
            com.baidu.platform.comapi.walknavi.b.n().s().a(str2, str);
            com.baidu.platform.comapi.walknavi.i.c.a(com.baidu.platform.comapi.walknavi.i.b.GUIDING_TO_SEGMENTBROWSE);
            com.baidu.platform.comapi.walknavi.b.n().l().run("强诱导转到分段");
            com.baidu.platform.comapi.walknavi.b.n().s().u();
        }
    }

    public static void a(boolean z) {
        BaiduMap map;
        com.baidu.platform.comapi.wnplatform.walkmap.c t = com.baidu.platform.comapi.walknavi.b.n().t();
        if (t == null || t.e() == null || (map = t.e().getMap()) == null) {
            return;
        }
        map.setIndoorEnable(z);
    }
}
