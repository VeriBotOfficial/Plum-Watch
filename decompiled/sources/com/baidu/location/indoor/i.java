package com.baidu.location.indoor;

import android.location.Location;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes13.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    private List<Location> f7776a;
    private String b;
    private Location c = null;

    i(String str, Location[] locationArr) {
        if (locationArr == null || locationArr.length <= 0) {
            return;
        }
        a(locationArr);
        this.b = str;
    }

    private void a(Location[] locationArr) {
        if (locationArr == null || locationArr.length <= 0) {
            return;
        }
        if (this.f7776a == null) {
            this.f7776a = new ArrayList();
        }
        double d = 0.0d;
        double d2 = 0.0d;
        for (int i = 0; i < locationArr.length; i++) {
            d += locationArr[i].getLatitude();
            d2 += locationArr[i].getLongitude();
            this.f7776a.add(locationArr[i]);
        }
        if (this.c == null) {
            Location location = new Location("gps");
            this.c = location;
            location.setLatitude(d / locationArr.length);
            this.c.setLongitude(d2 / locationArr.length);
        }
    }

    public String a() {
        return this.b;
    }
}
