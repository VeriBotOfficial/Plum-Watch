package com.baidu.platform.comapi.walknavi.i;

import android.content.Context;
import android.graphics.Paint;
import android.os.Bundle;
import com.autonavi.aps.amapapi.config.Const;
import com.baidu.mapapi.map.MapStatus;
import com.baidu.mapapi.model.CoordUtil;
import com.baidu.mapapi.model.inner.MapBound;
import com.baidu.mapapi.walknavi.model.RouteGuideKind;
import com.baidu.platform.comapi.basestruct.GeoPoint;
import com.baidu.platform.comapi.walknavi.segmentbrowse.widget.e;
import com.baidu.platform.comapi.wnplatform.i.d;
import com.qumeng.overseas.advlib.__remote__.framework.videoplayer.g;
import java.util.HashMap;

/* compiled from: WSegmentBrowseUtil.java */
/* loaded from: classes13.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private static int f8753a = -1;
    public static int b = 0;
    public static int c = -1;
    public static int d = -1;
    public static int e = 99999;
    public static b f = b.FIRST_GUIDANCE;
    private static HashMap<Integer, a> g = new HashMap<>();

    public static void a(a aVar) {
        HashMap<Integer, a> hashMap = g;
        if (hashMap != null) {
            hashMap.put(Integer.valueOf(g()), aVar);
        }
        o();
        j();
    }

    public static double b() {
        return 0.7d;
    }

    public static double b(int i) {
        if (i <= 30 && i > 0) {
            return 1.0d;
        }
        if (i > 150 || i <= 30) {
            return i > 150 ? 2.0d : -1.0d;
        }
        return 1.5d;
    }

    public static void c(int i) {
        f8753a = i;
        g(i);
        o();
        j();
    }

    public static a d() {
        return g.get(Integer.valueOf(f8753a));
    }

    public static double e() {
        if (g.get(Integer.valueOf(f8753a)) == null || g.get(Integer.valueOf(f8753a)).g() < 0) {
            return -1.0d;
        }
        return b(g.get(Integer.valueOf(f8753a)).g());
    }

    public static void f(int i) {
        c = i;
    }

    public static int g() {
        return f8753a;
    }

    public static int h() {
        return e;
    }

    public static int i() {
        if (k() == -1.0d) {
            return -1;
        }
        return (int) (k() * b);
    }

    public static a j() {
        return a(f8753a, -1);
    }

    public static double k() {
        a a2 = a(f8753a, -1);
        if (a2 == null || a2.g() < 0) {
            return -1.0d;
        }
        return b(a2.g());
    }

    public static int l() {
        if (m() == -1.0d) {
            return -1;
        }
        return (int) (m() * b);
    }

    public static double m() {
        a a2 = a(f8753a, -2);
        if (a2 == null || a2.g() < 0) {
            return -1.0d;
        }
        return b(a2.g());
    }

    public static int n() {
        if (p() == -1.0d) {
            return -1;
        }
        return (int) (p() * b);
    }

    public static a o() {
        return a(f8753a, 1);
    }

    public static double p() {
        a a2 = a(f8753a, 1);
        if (a2 == null || a2.g() < 0) {
            return -1.0d;
        }
        return b(a2.g());
    }

    public static int q() {
        return c;
    }

    public static b r() {
        return f;
    }

    public static int s() {
        return d;
    }

    public static void d(int i) {
        if (e != 99999 || i == -1) {
            return;
        }
        e = i;
    }

    public static int f() {
        a d2 = d();
        if (d2 == null || d2.g() < 0) {
            return -1;
        }
        double g2 = d2.g();
        return c() - ((int) ((((g2 - q()) / g2) * (e() - b())) * b));
    }

    public static void g(int i) {
        if (d != -1 || i == -1) {
            return;
        }
        d = i;
    }

    public static int c() {
        if (e() == -1.0d) {
            return -1;
        }
        return (int) (e() * b);
    }

    public static void e(int i) {
        int d2 = com.baidu.platform.comapi.wnplatform.p.q.b.b().d();
        int c2 = com.baidu.platform.comapi.wnplatform.p.q.b.b().c();
        int m = com.baidu.platform.comapi.walknavi.b.n().H().m();
        MapBound b2 = com.baidu.platform.comapi.walknavi.b.n().b(i);
        MapStatus d3 = com.baidu.platform.comapi.walknavi.b.n().t().d();
        if (d3 != null) {
            MapStatus.Builder builder = new MapStatus.Builder(d3);
            builder.rotate(0.0f);
            builder.overlook(0.0f);
            if (b2 != null) {
                float a2 = com.baidu.platform.comapi.walknavi.b.n().t().a(b2, d2, c2 - (m * 2));
                builder.target(CoordUtil.mc2ll(new GeoPoint((b2.getPtLB().getIntY() + b2.getPtRT().getIntY()) / 2, (b2.getPtLB().getIntX() + b2.getPtRT().getIntX()) / 2)));
                builder.zoom(a2);
                com.baidu.platform.comapi.wnplatform.d.a.b("setMapHighLightByUid: height:" + c2);
                com.baidu.platform.comapi.wnplatform.d.a.b("setMapHighLightByUid: topUIHeight:" + m);
                com.baidu.platform.comapi.wnplatform.d.a.b("setMapHighLightByUid: width:" + d2);
                com.baidu.platform.comapi.wnplatform.d.a.b("setMapHighLightByUid: level:" + a2);
            }
            com.baidu.platform.comapi.walknavi.b.n().t().a(builder.build(), 500);
        }
        com.baidu.platform.comapi.walknavi.b.n().s().l(i);
    }

    public static int a(Context context) {
        Paint paint = new Paint();
        paint.setTextSize(com.baidu.platform.comapi.walknavi.segmentbrowse.widget.b.a(context, 17.0f));
        int measureText = (int) paint.measureText("任");
        double d2 = (b * 0.7d) / measureText;
        com.baidu.platform.comapi.wnplatform.d.a.a("yang11", "singleCharwidth:" + measureText);
        com.baidu.platform.comapi.wnplatform.d.a.a("yang11", "num:" + d2);
        return (int) d2;
    }

    public static a a(int i) {
        HashMap<Integer, a> hashMap = g;
        if (hashMap == null || hashMap.size() < 1 || !g.containsKey(Integer.valueOf(i))) {
            return null;
        }
        com.baidu.platform.comapi.wnplatform.d.a.c("route hashmap", g.toString());
        return g.get(Integer.valueOf(i));
    }

    public static a a(int i, int i2) {
        HashMap<Integer, a> hashMap = g;
        if (hashMap != null) {
            int i3 = i + i2;
            if (hashMap.containsKey(Integer.valueOf(i3))) {
                return g.get(Integer.valueOf(i3));
            }
        }
        a aVar = new a();
        Bundle bundle = new Bundle();
        com.baidu.platform.comapi.wnplatform.d.a.c("uid******offset", "uid**" + i + "offset" + i2);
        com.baidu.platform.comapi.walknavi.b.n().s().a(i, i2, bundle);
        if (!bundle.containsKey("uid")) {
            return null;
        }
        aVar.f(bundle.getInt("uid"));
        aVar.c(e.a(bundle, "seg"));
        aVar.c(bundle.getString("usGuideText"));
        if (bundle.containsKey(Const.JSON_KEY_FLOOR)) {
            aVar.b(bundle.getString(Const.JSON_KEY_FLOOR));
        }
        if (bundle.containsKey("building")) {
            aVar.a(bundle.getString("building"));
        }
        aVar.a(e.a(bundle, false));
        aVar.b(e.a(bundle));
        int i4 = bundle.getInt("nParagraphLength");
        if (bundle.containsKey("maneuverKind")) {
            String b2 = d.b(RouteGuideKind.values()[bundle.getInt("maneuverKind")]);
            if ((i4 == 0 && b2.equals("wn_dest.png")) || (i4 != 1 && b2.equals("wn_indoor_bianjie.png"))) {
                aVar.e(20);
                d(bundle.getInt("uid"));
            } else {
                aVar.e(i4);
            }
            aVar.d(b2);
        }
        com.baidu.platform.comapi.wnplatform.d.a.c("getRouteMessageModelByUid", "wroutemessagemodel" + aVar.toString());
        g.put(Integer.valueOf(i + i2), aVar);
        return aVar;
    }

    public static void a() {
        f8753a = -1;
        d = -1;
        e = g.PLAY_PAUSE_TIME;
        f = b.FIRST_GUIDANCE;
        c = -1;
        HashMap<Integer, a> hashMap = g;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public static void a(b bVar) {
        f = bVar;
    }
}
