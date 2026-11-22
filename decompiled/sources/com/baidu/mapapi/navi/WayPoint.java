package com.baidu.mapapi.navi;

import java.util.List;

/* loaded from: classes13.dex */
public class WayPoint {

    /* renamed from: a, reason: collision with root package name */
    private List<WayPointInfo> f8054a;

    public WayPoint(List<WayPointInfo> list) {
        if (list == null) {
            return;
        }
        this.f8054a = list;
    }

    public List<WayPointInfo> getViaPoints() {
        return this.f8054a;
    }
}
