package com.huawei.agconnect;

import java.util.Arrays;

/* JADX INFO: loaded from: classes16.dex */
public final class AGCRoutePolicy {
    private final int route;
    public static final AGCRoutePolicy UNKNOWN = new AGCRoutePolicy(0);
    public static final AGCRoutePolicy CHINA = new AGCRoutePolicy(1);
    public static final AGCRoutePolicy GERMANY = new AGCRoutePolicy(2);
    public static final AGCRoutePolicy RUSSIA = new AGCRoutePolicy(3);
    public static final AGCRoutePolicy SINGAPORE = new AGCRoutePolicy(4);

    private AGCRoutePolicy(int r1) {
        this.route = r1;
    }

    private int hash(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.route == ((AGCRoutePolicy) obj).route;
    }

    public String getRouteName() {
        int r0 = this.route;
        if (r0 == 1) {
            return "CN";
        }
        if (r0 == 2) {
            return "DE";
        }
        if (r0 != 3) {
            return r0 != 4 ? "UNKNOWN" : "SG";
        }
        return "RU";
    }

    public int hashCode() {
        return hash(Integer.valueOf(this.route));
    }
}
