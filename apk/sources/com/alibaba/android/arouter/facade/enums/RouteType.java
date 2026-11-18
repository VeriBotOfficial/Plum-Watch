package com.alibaba.android.arouter.facade.enums;

/* JADX INFO: loaded from: classes7.dex */
public enum RouteType {
    ACTIVITY(0, "android.app.Activity"),
    SERVICE(1, "android.app.Service"),
    PROVIDER(2, "com.alibaba.android.arouter.facade.template.IProvider"),
    CONTENT_PROVIDER(-1, "android.app.ContentProvider"),
    BOARDCAST(-1, ""),
    METHOD(-1, ""),
    FRAGMENT(-1, "android.app.Fragment"),
    UNKNOWN(-1, "Unknown route type");

    String className;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    int f1261id;

    public int getId() {
        return this.f1261id;
    }

    public RouteType setId(int r1) {
        this.f1261id = r1;
        return this;
    }

    public String getClassName() {
        return this.className;
    }

    public RouteType setClassName(String str) {
        this.className = str;
        return this;
    }

    RouteType(int r3, String str) {
        this.f1261id = r3;
        this.className = str;
    }

    public static RouteType parse(String str) {
        for (RouteType routeType : values()) {
            if (routeType.getClassName().equals(str)) {
                return routeType;
            }
        }
        return UNKNOWN;
    }
}
