package com.amap.api.col.p0003sl;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.amap.api.col.p0003sl.l9;
import com.amap.api.map3d.R;
import com.amap.api.maps.AMapUtils;
import com.amap.api.maps.MapsInitializer;
import com.amap.api.maps.model.BaseHoleOptions;
import com.amap.api.maps.model.CircleHoleOptions;
import com.amap.api.maps.model.LatLng;
import com.amap.api.maps.model.LatLngBounds;
import com.amap.api.maps.model.PolygonHoleOptions;
import com.amap.api.maps.utils.SpatialRelationUtil;
import com.autonavi.amap.api.mapcore.IGLMapState;
import com.autonavi.amap.mapcore.DPoint;
import com.autonavi.amap.mapcore.interfaces.IMapConfig;
import com.autonavi.aps.amapapi.utils.CoreUtil;
import com.autonavi.base.ae.gmap.GLMapState;
import com.autonavi.base.amap.mapcore.AeUtil;
import com.autonavi.base.amap.mapcore.FPoint;
import com.autonavi.base.amap.mapcore.FileUtil;
import com.baidu.mapapi.http.HttpClient;
import com.tencent.connect.common.Constants;
import com.wakeup.common.utils.AdvConstance;
import java.io.File;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* compiled from: Util.java */
/* loaded from: classes11.dex */
public class t4 {

    /* renamed from: a, reason: collision with root package name */
    private static int f1885a;
    public static final /* synthetic */ int b = 0;

    static {
        FPoint.obtain();
        FPoint.obtain();
        FPoint.obtain();
        FPoint.obtain();
        new ArrayList(4);
        new ArrayList(4);
        f1885a = 0;
    }

    public static void a(Bitmap bitmap) {
    }

    public static void a(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public static boolean a(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8) {
        double d9 = d3 - d;
        double d10 = d8 - d6;
        double d11 = d4 - d2;
        double d12 = d7 - d5;
        double d13 = (d9 * d10) - (d11 * d12);
        if (d13 == 0.0d) {
            return false;
        }
        double d14 = d2 - d6;
        double d15 = d - d5;
        double d16 = ((d12 * d14) - (d10 * d15)) / d13;
        double d17 = ((d14 * d9) - (d15 * d11)) / d13;
        return d16 >= 0.0d && d16 <= 1.0d && d17 >= 0.0d && d17 <= 1.0d;
    }

    public static String b(Context context) {
        StringBuilder append = new StringBuilder().append(FileUtil.getMapBaseStorage(context));
        String str = File.separator;
        return append.append(str).append("data").append(str).toString();
    }

    public static String c(Context context) {
        File file = new File(FileUtil.getMapBaseStorage(context), AeUtil.ROOT_DATA_PATH_NAME);
        if (!file.exists()) {
            file.mkdir();
        }
        StringBuilder append = new StringBuilder().append(file.toString());
        String str = File.separator;
        File file2 = new File(append.append(str).toString());
        if (!file2.exists()) {
            file2.mkdir();
        }
        return file.toString() + str;
    }

    public static boolean d(Context context) {
        ConnectivityManager connectivityManager;
        NetworkInfo activeNetworkInfo;
        NetworkInfo.State state;
        return (context == null || (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || (state = activeNetworkInfo.getState()) == null || state == NetworkInfo.State.DISCONNECTED || state == NetworkInfo.State.DISCONNECTING) ? false : true;
    }

    public static String a(String str, Object obj) {
        return str + "=" + String.valueOf(obj);
    }

    public static l9 b() {
        try {
            if (v0.d == null) {
                v0.d = new l9.a("3dmap", CoreUtil.STR_CONFIG_VERSION, v0.c).a(new String[]{"com.amap.api.maps", "com.amap.api.mapcore", "com.autonavi.amap.mapcore", "com.autonavi.amap", "com.autonavi.ae", "com.autonavi.base", "com.autonavi.patch", "com.amap.api.3dmap.admic", "com.amap.api.trace", "com.amap.api.trace.core"}).a(CoreUtil.STR_CONFIG_VERSION).a();
            }
            return v0.d;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static float a(IMapConfig iMapConfig, float f, float f2) {
        boolean z;
        boolean z2 = false;
        if (iMapConfig != null) {
            boolean isAbroadEnable = iMapConfig.isAbroadEnable();
            z = iMapConfig.getAbroadState() != 1;
            z2 = isAbroadEnable;
        } else {
            z = false;
        }
        float f3 = f >= 0.0f ? f : 0.0f;
        if (z2 && z) {
            float f4 = 40;
            if (f3 > f4) {
                return f4;
            }
        } else if (iMapConfig != null && iMapConfig.isTerrainEnable()) {
            float f5 = 80;
            if (f3 > f5) {
                return f5;
            }
        } else if (f > 40.0f) {
            float f6 = f2 > 15.0f ? f2 <= 16.0f ? 56 : f2 <= 17.0f ? 66 : f2 <= 18.0f ? 74 : f2 <= 18.0f ? 78 : 80 : 40;
            if (f3 > f6) {
                return f6;
            }
        }
        return f3;
    }

    private static void c(View view) {
        int i = 0;
        if (!(view instanceof ViewGroup)) {
            if (view instanceof TextView) {
                ((TextView) view).setHorizontallyScrolling(false);
            }
        } else {
            while (true) {
                ViewGroup viewGroup = (ViewGroup) view;
                if (i >= viewGroup.getChildCount()) {
                    return;
                }
                c(viewGroup.getChildAt(i));
                i++;
            }
        }
    }

    public static boolean b(List<BaseHoleOptions> list, PolygonHoleOptions polygonHoleOptions) {
        boolean z = false;
        for (int i = 0; i < list.size(); i++) {
            BaseHoleOptions baseHoleOptions = list.get(i);
            if (baseHoleOptions instanceof PolygonHoleOptions) {
                List<LatLng> points = ((PolygonHoleOptions) baseHoleOptions).getPoints();
                List<LatLng> points2 = polygonHoleOptions.getPoints();
                int i2 = 0;
                while (true) {
                    try {
                        if (i2 < points2.size()) {
                            if (a(points2.get(i2), points)) {
                                break;
                            }
                            i2++;
                        } else {
                            for (int i3 = 0; i3 < points.size(); i3++) {
                                if (!a(points.get(i3), points2)) {
                                }
                            }
                            z = a(points, points2);
                        }
                    } catch (Throwable th) {
                        ja.a(th, "Util", "isPolygon2PolygonIntersect");
                        th.printStackTrace();
                        z = false;
                    }
                }
                z = true;
                if (z) {
                    return true;
                }
            } else if (baseHoleOptions instanceof CircleHoleOptions) {
                z = b(polygonHoleOptions.getPoints(), (CircleHoleOptions) baseHoleOptions);
                if (z) {
                    return true;
                }
            } else {
                continue;
            }
        }
        return z;
    }

    public static float a(IMapConfig iMapConfig, float f) {
        if (iMapConfig != null) {
            if (f > iMapConfig.getMaxZoomLevel()) {
                return iMapConfig.getMaxZoomLevel();
            }
            if (f < iMapConfig.getMinZoomLevel()) {
                return iMapConfig.getMinZoomLevel();
            }
        } else {
            if (f > 20.0f) {
                return 20.0f;
            }
            if (f < 3.0f) {
                return 3.0f;
            }
        }
        return f;
    }

    public static String a(String... strArr) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (String str : strArr) {
            sb.append(str);
            if (i != strArr.length - 1) {
                sb.append(",");
            }
            i++;
        }
        return sb.toString();
    }

    public static Bitmap a(Bitmap bitmap, float f) {
        if (bitmap == null) {
            return null;
        }
        return Bitmap.createScaledBitmap(bitmap, (int) (bitmap.getWidth() * f), (int) (bitmap.getHeight() * f), true);
    }

    public static String a(Context context) {
        String c = c(context);
        if (c == null) {
            return null;
        }
        File file = new File(c, "VMAP2");
        if (!file.exists()) {
            file.mkdir();
        }
        return file.toString() + File.separator;
    }

    public static boolean b(List<LatLng> list, CircleHoleOptions circleHoleOptions) {
        int i;
        try {
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < list.size(); i2++) {
                arrayList.add(list.get(i2));
            }
            arrayList.add(list.get(0));
            ArrayList arrayList2 = new ArrayList();
            int i3 = 0;
            while (i3 < arrayList.size() && (i = i3 + 1) < arrayList.size()) {
                if (circleHoleOptions.getRadius() < AMapUtils.calculateLineDistance(circleHoleOptions.getCenter(), (LatLng) arrayList.get(i3)) && circleHoleOptions.getRadius() < AMapUtils.calculateLineDistance(circleHoleOptions.getCenter(), (LatLng) arrayList.get(i))) {
                    arrayList2.clear();
                    arrayList2.add(arrayList.get(i3));
                    arrayList2.add(arrayList.get(i));
                    if (circleHoleOptions.getRadius() >= AMapUtils.calculateLineDistance(circleHoleOptions.getCenter(), (LatLng) SpatialRelationUtil.calShortestDistancePoint(arrayList2, circleHoleOptions.getCenter()).second)) {
                        return true;
                    }
                    i3 = i;
                }
                return true;
            }
        } catch (Throwable th) {
            ja.a(th, "Util", "isPolygon2CircleIntersect");
            th.printStackTrace();
        }
        return false;
    }

    public static String a(int i) {
        String a2 = n1.a(R.string.O105492_292);
        String a3 = n1.a(R.string.O105492_293);
        if (i >= 8046720) {
            return "5000" + a3;
        }
        if (i >= 3218688) {
            return "2000" + a3;
        }
        if (i >= 1609344) {
            return Constants.DEFAULT_UIN + a3;
        }
        if (i >= 804672) {
            return "500" + a3;
        }
        if (i >= 321869) {
            return AdvConstance.DEVICE_FIRMWARE_UPDATE + a3;
        }
        if (i >= 160934) {
            return "100" + a3;
        }
        if (i >= 80467) {
            return "50" + a3;
        }
        if (i >= 32187) {
            return AdvConstance.MINE_PAGE + a3;
        }
        if (i >= 24140) {
            return "15" + a3;
        }
        if (i >= 16093) {
            return "10" + a3;
        }
        if (i >= 8047) {
            return "5" + a3;
        }
        if (i >= 3219) {
            return "2" + a3;
        }
        if (i >= 1609) {
            return "1" + a3;
        }
        if (i >= 610) {
            return "2000" + a2;
        }
        if (i >= 305) {
            return Constants.DEFAULT_UIN + a2;
        }
        if (i >= 152) {
            return "500" + a2;
        }
        if (i >= 61) {
            return AdvConstance.DEVICE_FIRMWARE_UPDATE + a2;
        }
        if (i >= 30) {
            return "100" + a2;
        }
        if (i >= 15) {
            return "50" + a2;
        }
        if (i >= 6) {
            return AdvConstance.MINE_PAGE + a2;
        }
        return "10" + a2;
    }

    public static boolean a(LatLng latLng, List<LatLng> list) {
        boolean z;
        if (latLng == null || list == null) {
            return false;
        }
        double d = latLng.longitude;
        double d2 = latLng.latitude;
        if (list.size() < 3) {
            return false;
        }
        if (list.get(0).equals(list.get(list.size() - 1))) {
            z = false;
        } else {
            list.add(list.get(0));
            z = true;
        }
        int i = 0;
        int i2 = 0;
        while (i < list.size() - 1) {
            try {
                double d3 = list.get(i).longitude;
                double d4 = list.get(i).latitude;
                i++;
                double d5 = list.get(i).longitude;
                double d6 = list.get(i).latitude;
                double d7 = d;
                double d8 = d2;
                d = d7;
                d2 = d8;
                if (a(d7, d8, d3, d4, d5, d6)) {
                    return true;
                }
                if (Math.abs(d6 - d4) >= 1.0E-9d) {
                    if (a(d3, d4, d, d2, 180.0d, d2)) {
                        if (d4 > d6) {
                            i2++;
                        }
                    } else if (!a(d5, d6, d, d2, 180.0d, d2)) {
                        boolean a2 = a(d3, d4, d5, d6, d, d2, 180.0d, d2);
                        d = d;
                        d2 = d2;
                        if (a2) {
                            i2++;
                        }
                    } else if (d6 > d4) {
                        i2++;
                    }
                }
            } finally {
                if (z) {
                    list.remove(list.size() - 1);
                }
            }
        }
        boolean z2 = i2 % 2 != 0;
        if (z) {
            list.remove(list.size() - 1);
        }
        return z2;
    }

    public static String b(View view) {
        StringBuilder sb = new StringBuilder();
        if (view != null) {
            try {
                if (view instanceof TextView) {
                    sb = new StringBuilder(((TextView) view).getText().toString());
                }
                if (view instanceof ViewGroup) {
                    int childCount = ((ViewGroup) view).getChildCount();
                    for (int i = 0; i < childCount; i++) {
                        String b2 = b(((ViewGroup) view).getChildAt(i));
                        if (!TextUtils.isEmpty(b2)) {
                            sb.append(HttpClient.ENDFLAG);
                            sb.append(b2);
                        }
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return sb.toString();
    }

    public static boolean a(double d, double d2, double d3, double d4, double d5, double d6) {
        return Math.abs(((d3 - d) * (d6 - d2)) - ((d5 - d) * (d4 - d2))) < 1.0E-9d && (d - d3) * (d - d5) <= 0.0d && (d2 - d4) * (d2 - d6) <= 0.0d;
    }

    public static boolean a(BaseHoleOptions baseHoleOptions, LatLng latLng) {
        if (baseHoleOptions instanceof CircleHoleOptions) {
            CircleHoleOptions circleHoleOptions = (CircleHoleOptions) baseHoleOptions;
            LatLng center = circleHoleOptions.getCenter();
            return center != null && ((double) AMapUtils.calculateLineDistance(center, latLng)) <= circleHoleOptions.getRadius();
        }
        List<LatLng> points = ((PolygonHoleOptions) baseHoleOptions).getPoints();
        if (points == null || points.size() == 0) {
            return false;
        }
        return a(latLng, points);
    }

    public static Bitmap a(View view) {
        try {
            c(view);
            view.destroyDrawingCache();
            view.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
            view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
            Bitmap drawingCache = view.getDrawingCache();
            if (drawingCache != null) {
                return drawingCache.copy(Bitmap.Config.ARGB_8888, false);
            }
            return null;
        } catch (Throwable th) {
            ja.a(th, "Utils", "getBitmapFromView");
            th.printStackTrace();
            return null;
        }
    }

    public static DPoint a(LatLng latLng) {
        double d = (latLng.longitude / 360.0d) + 0.5d;
        double sin = Math.sin(Math.toRadians(latLng.latitude));
        return DPoint.obtain(d * 1.0d, (((Math.log((sin + 1.0d) / (1.0d - sin)) * 0.5d) / (-6.283185307179586d)) + 0.5d) * 1.0d);
    }

    public static Pair<Float, LatLng> a(IMapConfig iMapConfig, IGLMapState iGLMapState, int i, int i2, int i3, int i4, LatLngBounds latLngBounds, int i5, int i6) {
        LatLng latLng;
        LatLng latLng2;
        float f;
        if (latLngBounds == null || (latLng = latLngBounds.northeast) == null || (latLng2 = latLngBounds.southwest) == null || iMapConfig == null) {
            return null;
        }
        int i7 = i5 - (i + i2);
        int i8 = i6 - (i3 + i4);
        int i9 = i7 <= 0 ? 1 : i7;
        int i10 = i8 <= 0 ? 1 : i8;
        if (iGLMapState != null && (iGLMapState instanceof GLMapState)) {
            float zoomInRect = ((GLMapState) iGLMapState).getZoomInRect(i9, i10, latLng2.longitude, latLng2.latitude, latLng.longitude, latLng.latitude);
            LatLng latLng3 = latLngBounds.southwest;
            double d = latLng3.longitude;
            LatLng latLng4 = latLngBounds.northeast;
            double d2 = latLng4.longitude;
            double d3 = (d + d2) / 2.0d;
            double d4 = latLng3.latitude;
            double d5 = latLng4.latitude;
            double d6 = (d4 + d5) / 2.0d;
            double d7 = d2 - d;
            double d8 = d5 - d4;
            if (i9 <= 0 || i10 <= 0 || d7 <= 0.0d || d8 <= 0.0d) {
                f = zoomInRect;
            } else {
                f = zoomInRect;
                double d9 = i9;
                double d10 = i10;
                d3 -= (((i + (d9 / 2.0d)) - (i5 / 2.0d)) * d7) / d9;
                d6 += (((i3 + (d10 / 2.0d)) - (i6 / 2.0d)) * d8) / d10;
            }
            return new Pair<>(Float.valueOf(f), new LatLng(d6, d3));
        }
        return null;
    }

    private static float a(float f, float f2, float f3) {
        return (float) (f3 * Math.pow(2.0d, 20.0f - f2) * f);
    }

    public static synchronized int[] a(int i, int i2, int i3, int i4, IMapConfig iMapConfig, IGLMapState iGLMapState, int i5, int i6) {
        int[] iArr;
        synchronized (t4.class) {
            int mapWidth = iMapConfig.getMapWidth();
            int mapHeight = iMapConfig.getMapHeight();
            int anchorX = iMapConfig.getAnchorX();
            int anchorY = iMapConfig.getAnchorY();
            iArr = new int[]{(int) Math.max(i3 + a(iMapConfig.getMapZoomScale(), iGLMapState.getMapZoomer(), anchorX), Math.min(i5, i - a(iMapConfig.getMapZoomScale(), iGLMapState.getMapZoomer(), mapWidth - anchorX))), (int) Math.max(i2 + a(iMapConfig.getMapZoomScale(), iGLMapState.getMapZoomer(), anchorY), Math.min(i6, i4 - a(iMapConfig.getMapZoomScale(), iGLMapState.getMapZoomer(), mapHeight - anchorY)))};
        }
        return iArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0028, code lost:
    
        r2.setPixel(r5, r6, r9);
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static byte[] a(byte[] r7, int r8, int r9, boolean r10) {
        /*
            int r0 = r7.length     // Catch: java.lang.Throwable -> L61
            r1 = 0
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeByteArray(r7, r1, r0)     // Catch: java.lang.Throwable -> L61
            android.graphics.Bitmap$Config r2 = r0.getConfig()     // Catch: java.lang.Throwable -> L61
            r3 = 1
            android.graphics.Bitmap r2 = r0.copy(r2, r3)     // Catch: java.lang.Throwable -> L61
            int r3 = r0.getWidth()     // Catch: java.lang.Throwable -> L61
            int r4 = r0.getHeight()     // Catch: java.lang.Throwable -> L61
            r5 = r1
        L18:
            if (r5 >= r3) goto L31
            r6 = r1
        L1b:
            if (r6 >= r4) goto L2e
            if (r5 == 0) goto L26
            if (r6 != 0) goto L22
            goto L26
        L22:
            r2.setPixel(r5, r6, r8)     // Catch: java.lang.Throwable -> L61
            goto L2b
        L26:
            if (r10 != 0) goto L2b
            r2.setPixel(r5, r6, r9)     // Catch: java.lang.Throwable -> L61
        L2b:
            int r6 = r6 + 1
            goto L1b
        L2e:
            int r5 = r5 + 1
            goto L18
        L31:
            r8 = 0
            java.io.ByteArrayOutputStream r9 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L4b
            r9.<init>()     // Catch: java.lang.Throwable -> L4b
            android.graphics.Bitmap$CompressFormat r10 = android.graphics.Bitmap.CompressFormat.PNG     // Catch: java.lang.Throwable -> L4c
            r1 = 100
            r2.compress(r10, r1, r9)     // Catch: java.lang.Throwable -> L4c
            byte[] r8 = r9.toByteArray()     // Catch: java.lang.Throwable -> L4c
            r9.close()     // Catch: java.lang.Throwable -> L46
            goto L56
        L46:
            r9 = move-exception
            r9.printStackTrace()     // Catch: java.lang.Throwable -> L61
            goto L56
        L4b:
            r9 = r8
        L4c:
            if (r9 == 0) goto L56
            r9.close()     // Catch: java.lang.Throwable -> L52
            goto L56
        L52:
            r9 = move-exception
            r9.printStackTrace()     // Catch: java.lang.Throwable -> L61
        L56:
            if (r8 != 0) goto L59
            r8 = r7
        L59:
            a(r2)     // Catch: java.lang.Throwable -> L61
            a(r0)     // Catch: java.lang.Throwable -> L61
            r7 = r8
            goto L65
        L61:
            r8 = move-exception
            r8.printStackTrace()
        L65:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amap.api.col.p0003sl.t4.a(byte[], int, int, boolean):byte[]");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0051 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0052 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean a(java.util.List<com.amap.api.maps.model.BaseHoleOptions> r10, com.amap.api.maps.model.CircleHoleOptions r11) {
        /*
            r0 = 0
            r1 = r0
            r2 = r1
        L3:
            int r3 = r10.size()
            if (r1 >= r3) goto L55
            java.lang.Object r3 = r10.get(r1)
            com.amap.api.maps.model.BaseHoleOptions r3 = (com.amap.api.maps.model.BaseHoleOptions) r3
            boolean r4 = r3 instanceof com.amap.api.maps.model.PolygonHoleOptions
            r5 = 1
            if (r4 == 0) goto L21
            com.amap.api.maps.model.PolygonHoleOptions r3 = (com.amap.api.maps.model.PolygonHoleOptions) r3
            java.util.List r2 = r3.getPoints()
            boolean r2 = b(r2, r11)
            if (r2 == 0) goto L52
            return r5
        L21:
            boolean r4 = r3 instanceof com.amap.api.maps.model.CircleHoleOptions
            if (r4 == 0) goto L52
            com.amap.api.maps.model.CircleHoleOptions r3 = (com.amap.api.maps.model.CircleHoleOptions) r3
            com.amap.api.maps.model.LatLng r2 = r3.getCenter()     // Catch: java.lang.Throwable -> L43
            com.amap.api.maps.model.LatLng r4 = r11.getCenter()     // Catch: java.lang.Throwable -> L43
            float r2 = com.amap.api.maps.AMapUtils.calculateLineDistance(r2, r4)     // Catch: java.lang.Throwable -> L43
            double r6 = (double) r2     // Catch: java.lang.Throwable -> L43
            double r8 = r11.getRadius()     // Catch: java.lang.Throwable -> L43
            double r2 = r3.getRadius()     // Catch: java.lang.Throwable -> L43
            double r8 = r8 + r2
            int r2 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r2 >= 0) goto L4e
            r2 = r5
            goto L4f
        L43:
            r2 = move-exception
            java.lang.String r3 = "Util"
            java.lang.String r4 = "isPolygon2CircleIntersect"
            com.amap.api.col.p0003sl.ja.a(r2, r3, r4)
            r2.printStackTrace()
        L4e:
            r2 = r0
        L4f:
            if (r2 == 0) goto L52
            return r5
        L52:
            int r1 = r1 + 1
            goto L3
        L55:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amap.api.col.p0003sl.t4.a(java.util.List, com.amap.api.maps.model.CircleHoleOptions):boolean");
    }

    private static boolean a(List<LatLng> list, List<LatLng> list2) {
        int i;
        int i2;
        int i3 = 0;
        while (i3 < list.size() && (i = i3 + 1) < list.size()) {
            try {
                int i4 = 0;
                while (i4 < list2.size() && (i2 = i4 + 1) < list2.size()) {
                    boolean a2 = n4.a(list.get(i3), list.get(i), list2.get(i4), list2.get(i2));
                    if (a2) {
                        return a2;
                    }
                    i4 = i2;
                }
                i3 = i;
            } catch (Throwable th) {
                ja.a(th, "Util", "isSegmentsIntersect");
                th.printStackTrace();
            }
        }
        return false;
    }

    public static boolean a(List<LatLng> list, PolygonHoleOptions polygonHoleOptions) {
        boolean z = false;
        z = false;
        z = false;
        if (list != null && polygonHoleOptions != null) {
            try {
                List<LatLng> points = polygonHoleOptions.getPoints();
                boolean z2 = false;
                for (int i = 0; i < points.size(); i++) {
                    try {
                        z2 = a(points.get(i), list);
                        if (!z2) {
                            return z2;
                        }
                    } catch (Throwable th) {
                        th = th;
                        z = z2;
                        ja.a(th, "PolygonDelegateImp", "isPolygonInPolygon");
                        th.printStackTrace();
                        return z;
                    }
                }
                return z2;
            } catch (Throwable th2) {
                th = th2;
            }
        }
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0040 A[LOOP:0: B:5:0x0008->B:19:0x0040, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean a(double r7, com.amap.api.maps.model.LatLng r9, java.util.List<com.amap.api.maps.model.BaseHoleOptions> r10, com.amap.api.maps.model.PolygonHoleOptions r11) {
        /*
            r0 = 1
            java.util.List r11 = r11.getPoints()     // Catch: java.lang.Throwable -> L47
            r1 = 0
            r3 = r0
            r2 = r1
        L8:
            int r4 = r11.size()     // Catch: java.lang.Throwable -> L44
            if (r2 >= r4) goto L43
            java.lang.Object r4 = r11.get(r2)     // Catch: java.lang.Throwable -> L44
            com.amap.api.maps.model.LatLng r4 = (com.amap.api.maps.model.LatLng) r4     // Catch: java.lang.Throwable -> L44
            int r5 = r10.size()     // Catch: java.lang.Throwable -> L44
            if (r5 <= 0) goto L31
            java.util.Iterator r5 = r10.iterator()     // Catch: java.lang.Throwable -> L44
        L1e:
            boolean r6 = r5.hasNext()     // Catch: java.lang.Throwable -> L44
            if (r6 == 0) goto L31
            java.lang.Object r6 = r5.next()     // Catch: java.lang.Throwable -> L44
            com.amap.api.maps.model.BaseHoleOptions r6 = (com.amap.api.maps.model.BaseHoleOptions) r6     // Catch: java.lang.Throwable -> L44
            boolean r6 = a(r6, r4)     // Catch: java.lang.Throwable -> L44
            if (r6 == 0) goto L1e
            goto L3c
        L31:
            float r3 = com.amap.api.maps.AMapUtils.calculateLineDistance(r9, r4)     // Catch: java.lang.Throwable -> L44
            double r3 = (double) r3
            int r3 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r3 < 0) goto L3c
            r3 = r0
            goto L3d
        L3c:
            r3 = r1
        L3d:
            if (r3 != 0) goto L40
            return r3
        L40:
            int r2 = r2 + 1
            goto L8
        L43:
            return r3
        L44:
            r7 = move-exception
            r0 = r3
            goto L48
        L47:
            r7 = move-exception
        L48:
            java.lang.String r8 = "CircleDelegateImp"
            java.lang.String r9 = "isPolygonInCircle"
            com.amap.api.col.p0003sl.ja.a(r7, r8, r9)
            r7.printStackTrace()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amap.api.col.p0003sl.t4.a(double, com.amap.api.maps.model.LatLng, java.util.List, com.amap.api.maps.model.PolygonHoleOptions):boolean");
    }

    public static boolean a(double d, LatLng latLng, CircleHoleOptions circleHoleOptions) {
        try {
            return ((double) AMapUtils.calculateLineDistance(circleHoleOptions.getCenter(), latLng)) <= d - circleHoleOptions.getRadius();
        } catch (Throwable th) {
            ja.a(th, "CircleDelegateImp", "isCircleInCircle");
            th.printStackTrace();
            return true;
        }
    }

    public static void a(Throwable th) {
        try {
            if (MapsInitializer.getExceptionLogger() != null) {
                MapsInitializer.getExceptionLogger().onException(th);
            }
        } catch (Throwable unused) {
        }
    }

    public static String a(String str, Context context) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            Uri parse = Uri.parse(str);
            if (parse.getAuthority() != null && parse.getAuthority().startsWith("dualstack-")) {
                return str;
            }
            e9 b2 = e9.b(context);
            String a2 = b2.a(27);
            String a3 = b2.a(26);
            if (parse.getAuthority() != null && parse.getAuthority().startsWith(a2)) {
                return parse.buildUpon().authority("dualstack-" + a3).build().toString();
            }
            return parse.buildUpon().authority("dualstack-" + parse.getAuthority()).build().toString();
        } catch (Throwable unused) {
            return str;
        }
    }

    public static Bitmap a(int[] iArr, int i, int i2, boolean z) {
        try {
            int[] iArr2 = new int[iArr.length];
            for (int i3 = 0; i3 < i2; i3++) {
                for (int i4 = 0; i4 < i; i4++) {
                    int i5 = (i3 * i) + i4;
                    int i6 = iArr[i5];
                    int i7 = (i6 & (-16711936)) | ((i6 << 16) & 16711680) | ((i6 >> 16) & 255);
                    if (z) {
                        iArr2[(((i2 - i3) - 1) * i) + i4] = i7;
                    } else {
                        iArr2[i5] = i7;
                    }
                }
            }
            Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
            createBitmap.setPixels(iArr2, 0, i, 0, 0, i, i2);
            return createBitmap;
        } catch (Throwable th) {
            ja.a(th, "Util", "rgbaToArgb");
            th.printStackTrace();
            return null;
        }
    }

    public static synchronized int a() {
        int i;
        synchronized (t4.class) {
            int i2 = f1885a + 1;
            f1885a = i2;
            if (i2 == Integer.MAX_VALUE) {
                f1885a = 0;
            }
            i = f1885a;
        }
        return i;
    }

    public static LinkedHashMap<String, String> a(String str, String str2) {
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        for (String str3 : str.split("&")) {
            if (!TextUtils.isEmpty(str3)) {
                String[] split = str3.split(str2);
                if (split.length == 2) {
                    linkedHashMap.put(split[0], split[1]);
                }
            }
        }
        return linkedHashMap;
    }
}
