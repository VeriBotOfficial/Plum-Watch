package com.amap.api.col.p0003sl;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Point;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.view.SurfaceHolder;
import com.amap.api.col.p0003sl.oc;
import com.amap.api.maps.model.CameraPosition;
import com.amap.api.maps.model.LatLng;
import com.autonavi.amap.mapcore.AbstractCameraUpdateMessage;
import com.autonavi.amap.mapcore.DPoint;
import com.autonavi.amap.mapcore.VirtualEarthProjection;
import com.autonavi.base.amap.api.mapcore.IGLSurfaceView;
import com.xiaomi.mipush.sdk.Constants;
import java.net.URLEncoder;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.TimeZone;
import java.util.TreeMap;
import java.util.UUID;
import java.util.concurrent.BlockingQueue;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: LocationFactory.java */
/* loaded from: classes11.dex */
public class x {
    public static pc a(int i, int i2, BlockingQueue<Runnable> blockingQueue, String str) {
        return pc.a(new oc.a().a(i).b(i2).a(blockingQueue).a(str).a());
    }

    public static pc b(String str) {
        return pc.a(new oc.a().a(str).a());
    }

    public static String c(String str) {
        if (str == null) {
            return null;
        }
        try {
            return URLEncoder.encode(str, "UTF-8").replace("+", "%20").replace("*", "%2A").replace("%7E", Constants.WAVE_SEPARATOR);
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public static void b(String str, String str2, boolean z) {
        if (str2 != null && z) {
            try {
                Log.e(str, str2);
            } catch (Throwable th) {
                fa.a(th, "Log", "logE");
            }
        }
    }

    public static void c(Context context, String str, String str2, Object obj) {
        String simpleName = obj.getClass().getSimpleName();
        SharedPreferences.Editor edit = context.getSharedPreferences(str, 0).edit();
        if ("String".equals(simpleName)) {
            edit.putString(str2, (String) obj);
        } else if ("Integer".equals(simpleName)) {
            edit.putInt(str2, ((Integer) obj).intValue());
        } else if ("Boolean".equals(simpleName)) {
            edit.putBoolean(str2, ((Boolean) obj).booleanValue());
        } else if ("Float".equals(simpleName)) {
            edit.putFloat(str2, ((Float) obj).floatValue());
        } else if ("Long".equals(simpleName)) {
            edit.putLong(str2, ((Long) obj).longValue());
        }
        edit.commit();
    }

    public static AbstractCameraUpdateMessage a() {
        l1 l1Var = new l1();
        l1Var.nowType = AbstractCameraUpdateMessage.Type.zoomBy;
        l1Var.amount = -1.0f;
        return l1Var;
    }

    public static void b(Context context, String str, String str2, Object obj) {
        String simpleName = obj.getClass().getSimpleName();
        SharedPreferences.Editor edit = context.getSharedPreferences(str, 0).edit();
        if ("String".equals(simpleName)) {
            edit.putString(str2, (String) obj);
        } else if ("Integer".equals(simpleName)) {
            edit.putInt(str2, ((Integer) obj).intValue());
        } else if ("Boolean".equals(simpleName)) {
            edit.putBoolean(str2, ((Boolean) obj).booleanValue());
        } else if ("Float".equals(simpleName)) {
            edit.putFloat(str2, ((Float) obj).floatValue());
        } else if ("Long".equals(simpleName)) {
            edit.putLong(str2, ((Long) obj).longValue());
        }
        edit.commit();
    }

    public static int a(Context context, float f) {
        return (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static void a(IGLSurfaceView iGLSurfaceView, int i, int i2, int i3, int i4, int i5, int i6) {
        SurfaceHolder holder;
        if (i4 > 0 && (holder = iGLSurfaceView.getHolder()) != null) {
            holder.setFormat(-3);
        }
        iGLSurfaceView.setEGLContextFactory(new i4());
        iGLSurfaceView.setEGLConfigChooser(new h4(i, i2, i3, i4, i5, i6));
    }

    public static void c(String str, String str2, boolean z) {
        if (str2 != null && z) {
            try {
                Log.w(str, str2);
            } catch (Throwable th) {
                fa.a(th, "Log", "logW");
            }
        }
    }

    public static PublicKey a(String str) throws Exception {
        try {
            return KeyFactory.getInstance(m9.b("EUlNB")).generatePublic(new X509EncodedKeySpec(w9.a(str)));
        } catch (NullPointerException unused) {
            throw new Exception("公钥数据为空");
        } catch (NoSuchAlgorithmException unused2) {
            throw new Exception("无此算法");
        } catch (InvalidKeySpecException unused3) {
            throw new Exception("公钥非法");
        }
    }

    public static String a(String str, String str2, String str3) throws Exception {
        byte[] bArr;
        String str4 = str.toUpperCase() + "&%2F&" + c(str2);
        String str5 = str3 + "&";
        String str6 = null;
        if (TextUtils.isEmpty(str5) || TextUtils.isEmpty(str4)) {
            bArr = null;
        } else {
            Mac mac = Mac.getInstance("HmacSHA1");
            mac.init(new SecretKeySpec(str5.getBytes("UTF-8"), "UTF-8"));
            bArr = mac.doFinal(str4.getBytes("UTF-8"));
        }
        if (bArr != null && bArr.length != 0) {
            str6 = Base64.encodeToString(bArr, 0);
        }
        return str6.replace("=", "%3D");
    }

    public static AbstractCameraUpdateMessage a(float f, Point point) {
        l1 l1Var = new l1();
        l1Var.nowType = AbstractCameraUpdateMessage.Type.zoomBy;
        l1Var.amount = f;
        l1Var.focus = point;
        return l1Var;
    }

    public static void a(String str, String str2, boolean z) {
        if (str2 != null && z) {
            try {
                Log.d(str, str2);
            } catch (Throwable th) {
                fa.a(th, "Log", "logD");
            }
        }
    }

    public static Object a(Context context, String str, String str2, Object obj) {
        String simpleName = obj.getClass().getSimpleName();
        SharedPreferences sharedPreferences = context.getSharedPreferences(str, 0);
        if ("String".equals(simpleName)) {
            return sharedPreferences.getString(str2, (String) obj);
        }
        if ("Integer".equals(simpleName)) {
            return Integer.valueOf(sharedPreferences.getInt(str2, ((Integer) obj).intValue()));
        }
        if ("Boolean".equals(simpleName)) {
            return Boolean.valueOf(sharedPreferences.getBoolean(str2, ((Boolean) obj).booleanValue()));
        }
        if ("Float".equals(simpleName)) {
            return Float.valueOf(sharedPreferences.getFloat(str2, ((Float) obj).floatValue()));
        }
        if ("Long".equals(simpleName)) {
            return Long.valueOf(sharedPreferences.getLong(str2, ((Long) obj).longValue()));
        }
        return null;
    }

    public static String a(Map<String, String> map, String str) {
        TreeMap treeMap = new TreeMap();
        treeMap.put("AccessKeyId", str);
        treeMap.put("SignatureMethod", "HMAC-SHA1");
        treeMap.put("SignatureVersion", "1.0");
        treeMap.put("SignatureNonce", UUID.randomUUID().toString());
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        treeMap.put("Timestamp", simpleDateFormat.format(date));
        treeMap.putAll(map);
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : treeMap.entrySet()) {
            arrayList.add(((String) entry.getKey()) + "=" + c((String) entry.getValue()));
        }
        StringBuilder sb = new StringBuilder("");
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            sb.append((String) it.next()).append("&");
        }
        return sb.toString().substring(0, r3.length() - 1);
    }

    public static AbstractCameraUpdateMessage a(CameraPosition cameraPosition) {
        LatLng latLng;
        j1 j1Var = new j1();
        j1Var.nowType = AbstractCameraUpdateMessage.Type.newCameraPosition;
        if (cameraPosition != null && (latLng = cameraPosition.target) != null) {
            DPoint latLongToPixelsDouble = VirtualEarthProjection.latLongToPixelsDouble(latLng.latitude, latLng.longitude, 20);
            j1Var.geoPoint = new DPoint(latLongToPixelsDouble.x, latLongToPixelsDouble.y);
            j1Var.zoom = cameraPosition.zoom;
            j1Var.bearing = cameraPosition.bearing;
            j1Var.tilt = cameraPosition.tilt;
            j1Var.cameraPosition = cameraPosition;
        }
        return j1Var;
    }

    public static AbstractCameraUpdateMessage a(Point point) {
        j1 j1Var = new j1();
        j1Var.nowType = AbstractCameraUpdateMessage.Type.newCameraPosition;
        j1Var.geoPoint = new DPoint(point.x, point.y);
        return j1Var;
    }

    public static AbstractCameraUpdateMessage a(float f) {
        j1 j1Var = new j1();
        j1Var.nowType = AbstractCameraUpdateMessage.Type.newCameraPosition;
        j1Var.bearing = f;
        return j1Var;
    }
}
