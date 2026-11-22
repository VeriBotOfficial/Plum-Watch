package com.baidu.platform.comapi.wnplatform.p;

import android.text.TextUtils;
import com.anythink.core.common.e.a;
import com.baidu.entity.pb.IndoorNavi;
import com.baidu.entity.pb.WalkPlan;
import com.baidu.mapapi.map.MapLanguage;
import com.baidu.mapapi.model.CoordUtil;
import com.baidu.mapapi.model.LatLng;
import com.baidu.platform.comapi.basestruct.GeoPoint;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: RoutePlanUtil.java */
/* loaded from: classes13.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    public static final String[] f8946a = {"m", "km", "米", "公里"};
    public static final String[] b = {"min", "h", "分钟", "小时"};
    public static final String[] c = {"min", "h", a.C0193a.k, "分钟", "小时", "天"};

    /* compiled from: RoutePlanUtil.java */
    public enum a {
        EN(0),
        ZH(1);

        private int d;

        a(int i) {
            this.d = i;
        }

        public int a() {
            return this.d;
        }
    }

    public static void a(int i, MapLanguage mapLanguage, StringBuffer stringBuffer) {
        a(i, mapLanguage == MapLanguage.CHINESE ? a.ZH : a.EN, stringBuffer);
    }

    public static int b() {
        if (!c()) {
            return 0;
        }
        WalkPlan N = com.baidu.platform.comapi.walknavi.b.n().N();
        int a2 = a(N);
        if (N != null && N.hasOption() && N.getOption().hasStart()) {
            String floor = N.getOption().getStart().getFloor();
            String building = N.getOption().getStart().getBuilding();
            if (!TextUtils.isEmpty(floor) && !TextUtils.isEmpty(building) && (a2 == 2 || a2 == 3)) {
                return 1;
            }
        }
        return 2;
    }

    public static boolean c() {
        WalkPlan N = com.baidu.platform.comapi.walknavi.b.n().N();
        return (N == null || N.getIndoorNavisCount() == 0) ? false : true;
    }

    public static boolean d() {
        WalkPlan N = com.baidu.platform.comapi.walknavi.b.n().N();
        return (N == null || N.getRoutesCount() != 0 || N.getIndoorNavisCount() == 0) ? false : true;
    }

    public static boolean e() {
        int a2 = a();
        return a2 == 1 || a2 == 2 || a2 == 3;
    }

    public static void a(int i, a aVar, StringBuffer stringBuffer) {
        int a2 = aVar.a();
        if (a2 != 0) {
            a2++;
        }
        if (i < 1000) {
            if (stringBuffer != null) {
                stringBuffer.append(String.format("%d%s", Integer.valueOf(i), f8946a[a2]));
                return;
            }
            return;
        }
        String str = i % 1000 == 0 ? "%.0f%s" : "%.1f%s";
        if (stringBuffer != null) {
            int i2 = i / 1000;
            if (i2 >= 100) {
                stringBuffer.append(String.format("%d%s", Integer.valueOf(i2), f8946a[a2 + 1]));
            } else {
                stringBuffer.append(String.format(str, Double.valueOf(i / 1000.0d), f8946a[a2 + 1]));
            }
        }
    }

    public static String c(WalkPlan walkPlan) {
        return (walkPlan == null || !walkPlan.hasOption() || walkPlan.getOption().getEndCount() <= 0 || walkPlan.getOption().getEnd(walkPlan.getOption().getEndCount() + (-1)) == null || !walkPlan.getOption().getEnd(walkPlan.getOption().getEndCount() + (-1)).hasFloor()) ? new String("") : walkPlan.getOption().getEnd(walkPlan.getOption().getEndCount() - 1).getFloor();
    }

    public static List<com.baidu.platform.comapi.wnplatform.j.j.a> b(WalkPlan walkPlan) {
        if (walkPlan == null) {
            return null;
        }
        int routesCount = walkPlan.getRoutesCount();
        ArrayList arrayList = new ArrayList(routesCount);
        for (int i = 0; i < routesCount; i++) {
            com.baidu.platform.comapi.wnplatform.j.j.a a2 = a(walkPlan, i);
            if (a2 != null) {
                arrayList.add(a2);
            }
        }
        return arrayList;
    }

    private static WalkPlan.Routes b(WalkPlan walkPlan, int i) {
        if (walkPlan == null) {
            return null;
        }
        int routesCount = walkPlan.getRoutesCount();
        if (i < 0 || i >= routesCount) {
            return null;
        }
        return walkPlan.getRoutes(i);
    }

    public static void a(int i, int i2, StringBuffer stringBuffer) {
        if (stringBuffer != null) {
            if (i < 60) {
                stringBuffer.append(i2 == 2 ? "少于1分钟" : "less than 1 minute");
                return;
            }
            int i3 = (i / 3600) % 24;
            int i4 = (i / 60) % 60;
            if (i < 3600) {
                stringBuffer.append(i4).append(c[i2 + 1]);
                return;
            }
            if (i < 86400) {
                stringBuffer.append(i3).append(c[i2 + 2]);
                if (i4 > 0) {
                    stringBuffer.append(i4).append(i2 == 2 ? "分" : "min");
                    return;
                }
                return;
            }
            StringBuffer append = stringBuffer.append(i / 86400);
            String[] strArr = c;
            append.append(strArr[i2 + 3]);
            if (i3 > 0) {
                stringBuffer.append(i3).append(strArr[i2 + 2]);
            }
        }
    }

    public static String a(int i, MapLanguage mapLanguage) {
        return a(i, mapLanguage == MapLanguage.CHINESE ? 2 : -1);
    }

    public static String a(int i, int i2) {
        StringBuffer stringBuffer = new StringBuffer();
        a(i, i2, stringBuffer);
        return stringBuffer.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int a(com.baidu.entity.pb.WalkPlan r9) {
        /*
            boolean r0 = d()
            r1 = 3
            r2 = 2
            r3 = 1
            r4 = 0
            if (r0 == 0) goto L11
            int r9 = r9.getIndoorNavisCount()
            if (r9 == 0) goto L5d
            return r1
        L11:
            com.baidu.platform.comapi.walknavi.b r0 = com.baidu.platform.comapi.walknavi.b.n()
            int r0 = r0.A()
            if (r9 == 0) goto L2c
            int r5 = r9.getRoutesCount()
            if (r5 <= 0) goto L2c
            int r5 = r9.getRoutesCount()
            if (r0 >= r5) goto L2c
            com.baidu.entity.pb.WalkPlan$Routes r9 = r9.getRoutes(r0)
            goto L2d
        L2c:
            r9 = 0
        L2d:
            if (r9 == 0) goto L5d
            r0 = r4
            r5 = r0
            r6 = r5
        L32:
            int r7 = r9.getLegsCount()
            if (r0 >= r7) goto L5f
            com.baidu.entity.pb.WalkPlan$Routes$Legs r7 = r9.getLegs(r0)
            com.baidu.entity.pb.WalkPlan$Routes$Legs$LegLinked r7 = r7.getLegLinked()
            if (r7 == 0) goto L4d
            boolean r8 = r7.hasPrev()
            if (r8 == 0) goto L4d
            if (r5 != 0) goto L4c
            r5 = r3
            goto L4d
        L4c:
            r6 = r3
        L4d:
            if (r7 == 0) goto L5a
            boolean r7 = r7.hasNext()
            if (r7 == 0) goto L5a
            if (r5 != 0) goto L59
            r5 = r2
            goto L5a
        L59:
            r6 = r2
        L5a:
            int r0 = r0 + 1
            goto L32
        L5d:
            r5 = r4
            r6 = r5
        L5f:
            if (r5 != r2) goto L66
            if (r6 != r3) goto L65
            r9 = 4
            return r9
        L65:
            return r3
        L66:
            if (r5 != r3) goto L6c
            if (r6 != r2) goto L6b
            return r1
        L6b:
            return r2
        L6c:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baidu.platform.comapi.wnplatform.p.g.a(com.baidu.entity.pb.WalkPlan):int");
    }

    public static com.baidu.platform.comapi.wnplatform.j.j.a a(WalkPlan walkPlan, int i) {
        List<WalkPlan.Routes.Legs> legsList;
        WalkPlan.Routes b2 = b(walkPlan, i);
        if (b2 == null || (legsList = b2.getLegsList()) == null) {
            return null;
        }
        WalkPlan.Routes.OtherInfo otherinfo = b2.getOtherinfo();
        int lightNum = (otherinfo == null || !otherinfo.hasLightNum()) ? 0 : otherinfo.getLightNum();
        ArrayList arrayList = new ArrayList();
        LatLng D = com.baidu.platform.comapi.walknavi.b.n().D();
        if (D != null) {
            arrayList.add(D);
        }
        Iterator<WalkPlan.Routes.Legs> it = legsList.iterator();
        int i2 = 0;
        int i3 = 0;
        while (it.hasNext()) {
            WalkPlan.Routes.Legs next = it.next();
            if (next.hasDuration()) {
                i2 += next.getDuration();
            }
            if (next.hasDistance()) {
                i3 += next.getDistance();
            }
            List<WalkPlan.Routes.Legs.Steps> stepsList = next.getStepsList();
            if (stepsList != null) {
                for (WalkPlan.Routes.Legs.Steps steps : stepsList) {
                    int spathCount = (steps.getSpathCount() - 5) >> 1;
                    double d = 0.0d;
                    double d2 = 0.0d;
                    int i4 = 0;
                    while (i4 < spathCount) {
                        int i5 = i4 << 1;
                        d2 += steps.getSpath(i5 + 5);
                        d += steps.getSpath(i5 + 6);
                        arrayList.add(CoordUtil.mc2ll(new GeoPoint(d, d2)));
                        i4++;
                        it = it;
                    }
                }
            }
            it = it;
        }
        LatLng h = com.baidu.platform.comapi.walknavi.b.n().h();
        if (h != null) {
            arrayList.add(h);
        }
        com.baidu.platform.comapi.wnplatform.j.j.a aVar = new com.baidu.platform.comapi.wnplatform.j.j.a();
        aVar.a(i3);
        aVar.b(i2);
        aVar.d(i);
        aVar.a(arrayList);
        aVar.c(lightNum);
        return aVar;
    }

    public static int a() {
        WalkPlan N = com.baidu.platform.comapi.walknavi.b.n().N();
        if (N != null && N.getIndoorNavisCount() != 0) {
            List<IndoorNavi> indoorNavisList = N.getIndoorNavisList();
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            for (int i4 = 0; i4 < indoorNavisList.size(); i4++) {
                IndoorNavi indoorNavi = indoorNavisList.get(i4);
                if (indoorNavi.getRoutesCount() != 0) {
                    int locLevel = indoorNavi.getRoutes(0).getLocLevel();
                    if (locLevel == 1) {
                        i++;
                    } else if (locLevel == 2) {
                        i2++;
                    } else if (locLevel == 3) {
                        i3++;
                    }
                }
            }
            r1 = i == indoorNavisList.size() ? 1 : -1;
            if (i2 + i3 == indoorNavisList.size()) {
                return i3 == indoorNavisList.size() ? 3 : 2;
            }
        }
        return r1;
    }
}
