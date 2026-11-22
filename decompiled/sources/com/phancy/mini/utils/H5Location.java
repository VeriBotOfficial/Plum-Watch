package com.phancy.mini.utils;

import android.content.Context;
import android.content.Intent;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Looper;
import com.autonavi.aps.amapapi.config.Const;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: H5Location.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J$\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nH\u0007J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0016\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0010¨\u0006\u0011"}, d2 = {"Lcom/phancy/mini/utils/H5Location;", "", "()V", "getLocation", "Landroid/location/Location;", "context", "Landroid/content/Context;", "needAltitude", "", Const.JSON_KEY_ACCURACY, "", "isLocationEnabled", "openGpsSettings", "", "requestLocationSingleUpdate", "callback", "Landroid/location/LocationListener;", "phancy-mini-sdk_overseasRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class H5Location {
    public static final H5Location INSTANCE = new H5Location();

    private H5Location() {
    }

    @JvmStatic
    public static final boolean isLocationEnabled(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService("location");
        if (systemService == null || !(systemService instanceof LocationManager)) {
            return false;
        }
        LocationManager locationManager = (LocationManager) systemService;
        return locationManager.isProviderEnabled("network") || locationManager.isProviderEnabled("gps");
    }

    @JvmStatic
    public static final void openGpsSettings(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intent intent = new Intent("android.settings.LOCATION_SOURCE_SETTINGS");
        intent.setFlags(268435456);
        context.startActivity(intent);
    }

    public static /* synthetic */ Location getLocation$default(Context context, boolean z, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = 1;
        }
        return getLocation(context, z, i);
    }

    @JvmStatic
    public static final Location getLocation(Context context, boolean needAltitude, int accuracy) {
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService("location");
        if (systemService != null && (systemService instanceof LocationManager)) {
            Criteria criteria = new Criteria();
            criteria.setAccuracy(accuracy);
            criteria.setAltitudeRequired(needAltitude);
            criteria.setBearingRequired(false);
            criteria.setCostAllowed(true);
            criteria.setSpeedRequired(false);
            criteria.setPowerRequirement(3);
            LocationManager locationManager = (LocationManager) systemService;
            String bestProvider = locationManager.getBestProvider(criteria, true);
            r0 = bestProvider != null ? locationManager.getLastKnownLocation(bestProvider) : null;
            if (r0 == null) {
                r0 = locationManager.getLastKnownLocation("gps");
            }
            if (r0 == null) {
                return locationManager.getLastKnownLocation("network");
            }
        }
        return r0;
    }

    public final void requestLocationSingleUpdate(Context context, LocationListener callback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Object systemService = context.getSystemService("location");
        LocationManager locationManager = systemService instanceof LocationManager ? (LocationManager) systemService : null;
        if (locationManager != null) {
            if (locationManager.isProviderEnabled("gps")) {
                locationManager.requestSingleUpdate("gps", callback, (Looper) null);
            }
            if (locationManager.isProviderEnabled("network")) {
                locationManager.requestSingleUpdate("network", callback, (Looper) null);
            }
        }
    }
}
