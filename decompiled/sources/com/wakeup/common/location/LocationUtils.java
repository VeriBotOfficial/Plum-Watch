package com.wakeup.common.location;

import android.content.Intent;
import android.location.Address;
import android.location.Criteria;
import android.location.Geocoder;
import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import android.util.Log;
import com.blankj.utilcode.util.Utils;
import com.unity3d.services.UnityAdsConstants;
import java.io.IOException;
import java.util.List;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class LocationUtils {
    private static final int TWO_MINUTES = 120000;
    private static OnLocationChangeListener mListener;
    private static android.location.LocationManager mLocationManager;
    private static MyLocationListener myLocationListener;

    public interface OnLocationChangeListener {
        void getLastKnownLocation(Location location);

        void onLocationChanged(Location location);

        void onStatusChanged(String provider, int status, Bundle extras);
    }

    private LocationUtils() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    public static boolean isGpsEnabled() {
        return ((android.location.LocationManager) Utils.getApp().getSystemService("location")).isProviderEnabled("gps");
    }

    public static boolean isLocationEnabled() {
        android.location.LocationManager locationManager = (android.location.LocationManager) Utils.getApp().getSystemService("location");
        return locationManager.isProviderEnabled("network") || locationManager.isProviderEnabled("gps");
    }

    public static void openGpsSettings() {
        Utils.getApp().startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS").addFlags(268435456));
    }

    public static boolean register(long minTime, long minDistance, OnLocationChangeListener listener) {
        if (listener == null) {
            return false;
        }
        android.location.LocationManager locationManager = (android.location.LocationManager) Utils.getApp().getSystemService("location");
        mLocationManager = locationManager;
        if (!locationManager.isProviderEnabled("network") && !mLocationManager.isProviderEnabled("gps")) {
            Log.d("LocationUtils", "无法定位，请打开定位服务");
            return false;
        }
        mListener = listener;
        String bestProvider = mLocationManager.getBestProvider(getCriteria(), true);
        Location lastKnownLocation = mLocationManager.getLastKnownLocation(bestProvider);
        if (lastKnownLocation != null) {
            listener.getLastKnownLocation(lastKnownLocation);
        }
        if (myLocationListener == null) {
            myLocationListener = new MyLocationListener();
        }
        mLocationManager.requestLocationUpdates(bestProvider, minTime, minDistance, myLocationListener);
        return true;
    }

    public static void unregister() {
        android.location.LocationManager locationManager = mLocationManager;
        if (locationManager != null) {
            MyLocationListener myLocationListener2 = myLocationListener;
            if (myLocationListener2 != null) {
                locationManager.removeUpdates(myLocationListener2);
                myLocationListener = null;
            }
            mLocationManager = null;
        }
        if (mListener != null) {
            mListener = null;
        }
    }

    private static Criteria getCriteria() {
        Criteria criteria = new Criteria();
        criteria.setAccuracy(1);
        criteria.setSpeedRequired(false);
        criteria.setCostAllowed(false);
        criteria.setBearingRequired(false);
        criteria.setAltitudeRequired(false);
        criteria.setPowerRequirement(1);
        return criteria;
    }

    public static Address getAddress(double latitude, double longitude) {
        try {
            List<Address> fromLocation = new Geocoder(Utils.getApp(), Locale.getDefault()).getFromLocation(latitude, longitude, 1);
            if (fromLocation.size() > 0) {
                return fromLocation.get(0);
            }
            return null;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String getCountryName(double latitude, double longitude) {
        Address address = getAddress(latitude, longitude);
        return address == null ? "unknown" : address.getCountryName();
    }

    public static String getLocality(double latitude, double longitude) {
        Address address = getAddress(latitude, longitude);
        return address == null ? "unknown" : address.getLocality();
    }

    public static String getStreet(double latitude, double longitude) {
        Address address = getAddress(latitude, longitude);
        return address == null ? "unknown" : address.getAddressLine(0);
    }

    public static boolean isBetterLocation(Location newLocation, Location currentBestLocation) {
        if (currentBestLocation == null) {
            return true;
        }
        long time = newLocation.getTime() - currentBestLocation.getTime();
        boolean z = time > UnityAdsConstants.Timeout.INIT_TIMEOUT_MS;
        boolean z2 = time < -120000;
        boolean z3 = time > 0;
        if (z) {
            return true;
        }
        if (z2) {
            return false;
        }
        int accuracy = (int) (newLocation.getAccuracy() - currentBestLocation.getAccuracy());
        boolean z4 = accuracy > 0;
        boolean z5 = accuracy < 0;
        boolean z6 = accuracy > 200;
        boolean isSameProvider = isSameProvider(newLocation.getProvider(), currentBestLocation.getProvider());
        if (z5) {
            return true;
        }
        if (!z3 || z4) {
            return z3 && !z6 && isSameProvider;
        }
        return true;
    }

    public static boolean isSameProvider(String provider0, String provider1) {
        if (provider0 == null) {
            return provider1 == null;
        }
        return provider0.equals(provider1);
    }

    private static class MyLocationListener implements LocationListener {
        @Override // android.location.LocationListener
        public void onProviderDisabled(String provider) {
        }

        @Override // android.location.LocationListener
        public void onProviderEnabled(String provider) {
        }

        private MyLocationListener() {
        }

        @Override // android.location.LocationListener
        public void onLocationChanged(Location location) {
            if (LocationUtils.mListener != null) {
                LocationUtils.mListener.onLocationChanged(location);
            }
        }

        @Override // android.location.LocationListener
        public void onStatusChanged(String provider, int status, Bundle extras) {
            if (LocationUtils.mListener != null) {
                LocationUtils.mListener.onStatusChanged(provider, status, extras);
            }
            if (status == 0) {
                Log.d("LocationUtils", "当前GPS状态为服务区外状态");
            } else if (status == 1) {
                Log.d("LocationUtils", "当前GPS状态为暂停服务状态");
            } else {
                if (status != 2) {
                    return;
                }
                Log.d("LocationUtils", "当前GPS状态为可见状态");
            }
        }
    }
}
