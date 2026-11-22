package com.baidu.platform.comapi.wnplatform.p;

import android.text.TextUtils;
import com.baidu.ar.marker.model.SegmentTypeCons;
import com.baidu.entity.pb.WalkPlan;
import com.baidu.mapapi.model.CoordUtil;
import com.baidu.platform.comapi.basestruct.ComplexPt;
import com.baidu.platform.comapi.basestruct.Point;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.List;

/* compiled from: StepSplitUtilsNDof.java */
/* loaded from: classes13.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    private static ArrayList<a> f8949a = null;
    private static boolean b = false;

    /* compiled from: StepSplitUtilsNDof.java */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public Point f8950a;
        public String b;
        public int c;
        public int d;
        public String e;
    }

    /* compiled from: StepSplitUtilsNDof.java */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public String f8951a;
        public String b;
        public int c;
        public String d;
        public ArrayList<Point> e;
    }

    public static String a(WalkPlan walkPlan) {
        return (walkPlan == null || !walkPlan.hasOption() || walkPlan.getOption().getEndCount() <= 0 || walkPlan.getOption().getEnd(walkPlan.getOption().getEndCount() + (-1)) == null) ? "" : walkPlan.getOption().getEnd(walkPlan.getOption().getEndCount() - 1).getFloor();
    }

    private static void a(WalkPlan walkPlan, int i) {
        if (walkPlan == null || i >= walkPlan.getRoutesCount()) {
            return;
        }
        boolean isEmpty = walkPlan.getArGuideList().isEmpty();
        WalkPlan.Routes routes = walkPlan.getRoutes(i);
        f8949a = new ArrayList<>();
        for (int i2 = 0; i2 < routes.getLegsCount(); i2++) {
            WalkPlan.Routes.Legs legs = routes.getLegs(i2);
            for (int i3 = 0; i3 < legs.getStepsCount(); i3++) {
                WalkPlan.Routes.Legs.Steps steps = legs.getSteps(i3);
                ArrayList<Point> arrayList = ComplexPt.createComplexPt(steps.getSpathList()).mGeoPt.get(0);
                for (int i4 = 0; i4 < arrayList.size(); i4++) {
                    a aVar = new a();
                    aVar.f8950a = arrayList.get(i4);
                    aVar.b = a(i2, i3, i4);
                    aVar.e = steps.getName();
                    if (isEmpty && i4 == arrayList.size() - 1) {
                        aVar.c = 2;
                        aVar.d = steps.getDistance();
                    }
                    f8949a.add(aVar);
                }
            }
        }
        int size = f8949a.size();
        if (size > 0) {
            if (TextUtils.isEmpty(a(walkPlan))) {
                f8949a.get(size - 1).c = 101;
            } else {
                f8949a.get(size - 1).c = 102;
            }
        }
    }

    public static String a(int i, int i2, int i3) {
        return i + Constants.ACCEPT_TIME_SEPARATOR_SERVER + i2 + Constants.ACCEPT_TIME_SEPARATOR_SERVER + i3;
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0128  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.ArrayList<com.baidu.platform.comapi.wnplatform.p.i.b> a(com.baidu.entity.pb.WalkPlan r17, int r18, com.baidu.mapapi.map.MapLanguage r19) {
        /*
            Method dump skipped, instructions count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baidu.platform.comapi.wnplatform.p.i.a(com.baidu.entity.pb.WalkPlan, int, com.baidu.mapapi.map.MapLanguage):java.util.ArrayList");
    }

    private static int a(ArrayList<Point> arrayList) {
        int i = 0;
        int i2 = 0;
        while (i < arrayList.size() && i != arrayList.size() - 1) {
            Point point = arrayList.get(i);
            i++;
            i2 += (int) CoordUtil.getDistance(point, arrayList.get(i));
        }
        return i2;
    }

    private static ArrayList<Point> a(List<a> list) {
        ArrayList<Point> arrayList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            arrayList.add(list.get(i).f8950a);
        }
        return arrayList;
    }

    private static void a(b bVar, int i) {
        if (i == 1 || i == 2 || i == 7) {
            bVar.b = SegmentTypeCons.SEGMENT_KAKE_TURN;
            return;
        }
        if (i == 3) {
            bVar.b = SegmentTypeCons.SEGMENT_ENTER_FOOT_BRIDGE;
            return;
        }
        if (i == 4) {
            bVar.b = SegmentTypeCons.SEGMENT_ENTER_TUNNEL;
            return;
        }
        if (i == 14) {
            bVar.b = SegmentTypeCons.SEGMENT_OUT_TUNNEL;
            return;
        }
        if (i != 5 && i != 6 && i != 8 && i != 9 && i != 10 && i != 11 && i != 12 && i != 13) {
            if (i == 101) {
                bVar.b = SegmentTypeCons.SEGMENT_TERMINAL;
                return;
            } else {
                if (i == 102) {
                    bVar.b = SegmentTypeCons.SEGMENT_TERMINAL_GUIDE;
                    return;
                }
                return;
            }
        }
        bVar.b = SegmentTypeCons.SEGMENT_GO_CROSS;
        if (i == 8) {
            bVar.d = SegmentTypeCons.SEGMENT_DIRECTIONTYPE_TURN_LEFT;
            return;
        }
        if (i == 9) {
            bVar.d = SegmentTypeCons.SEGMENT_DIRECTIONTYPE_TURN_RIGHT;
            return;
        }
        if (i == 10) {
            bVar.d = SegmentTypeCons.SEGMENT_DIRECTIONTYPE_TURN_LEFT_FRONT;
            return;
        }
        if (i == 11) {
            bVar.d = SegmentTypeCons.SEGMENT_DIRECTIONTYPE_TURN_LEFT_BACK;
            return;
        }
        if (i == 12) {
            bVar.d = SegmentTypeCons.SEGMENT_DIRECTIONTYPE_TURN_RIGHT_FRONT;
        } else if (i == 13) {
            bVar.d = SegmentTypeCons.SEGMENT_DIRECTIONTYPE_TURN_RIGHT_BACK;
        } else {
            bVar.d = "";
        }
    }

    private static void a(String str, int i) {
        for (int i2 = 0; i2 < f8949a.size(); i2++) {
            if (str.equals(f8949a.get(i2).b)) {
                f8949a.get(i2).c = i;
                return;
            }
        }
    }
}
