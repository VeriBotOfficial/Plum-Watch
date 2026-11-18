package com.baidu.location.indoor;

import android.location.Location;
import androidx.camera.video.AudioStats;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
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
        double latitude = AudioStats.AUDIO_AMPLITUDE_NONE;
        double longitude = 0.0d;
        for (int r4 = 0; r4 < locationArr.length; r4++) {
            latitude += locationArr[r4].getLatitude();
            longitude += locationArr[r4].getLongitude();
            this.f7776a.add(locationArr[r4]);
        }
        if (this.c == null) {
            Location location = new Location("gps");
            this.c = location;
            location.setLatitude(latitude / ((double) locationArr.length));
            this.c.setLongitude(longitude / ((double) locationArr.length));
        }
    }

    public String a() {
        return this.b;
    }
}
