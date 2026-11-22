package com.baidu.location.h;

import android.content.Context;
import android.content.pm.PackageManager;
import android.location.Location;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Base64;
import com.autonavi.aps.amapapi.config.Const;
import com.baidu.location.BDLocation;
import com.baidu.location.Jni;
import com.baidu.location.f.k;
import com.hjq.permissions.Permission;
import com.phancy.mini.core.resource.MiniPack;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Enumeration;
import java.util.Locale;
import java.util.zip.GZIPOutputStream;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocketFactory;
import org.json.JSONObject;

/* loaded from: classes13.dex */
public class i {
    public static float A = 2.2f;
    public static float B = 2.3f;
    public static float C = 3.8f;
    public static int D = 3;
    public static int E = 10;
    public static int F = 2;
    public static int G = 7;
    public static int H = 20;
    public static int I = 70;
    public static int J = 120;
    public static float K = 2.0f;
    public static float L = 10.0f;
    public static float M = 50.0f;
    public static float N = 200.0f;
    public static int O = 16;
    public static int P = 32;
    public static float Q = 0.9f;
    public static int R = 10000;
    public static float S = 0.5f;
    public static float T = 0.0f;
    public static float U = 0.1f;
    public static int V = 30;
    public static int W = 100;
    public static int X = 0;
    public static int Y = 0;
    public static int Z = 0;

    /* renamed from: a, reason: collision with root package name */
    public static boolean f7729a = false;
    public static int aA = 15;
    public static float aB = 0.75f;
    public static double aC = -0.10000000149011612d;
    public static int aD = 0;
    public static int aE = 0;
    public static int aF = 1;
    public static int aG = 1;
    public static int aH = 0;
    public static float aI = 0.8f;
    public static float aJ = 0.2f;
    public static int aK = 0;
    public static int[] aL = null;
    public static boolean aM = false;
    public static int[] aN = null;
    public static boolean aO = false;
    public static int aP = 8;
    public static int aQ = 4000;
    public static int aR = 1;
    public static boolean aS = false;
    public static int aT = -1;
    public static int aU = 10;
    public static int aV = 3;
    public static int aW = 40;
    public static double[] aX = null;
    public static int aY = 1;
    public static int aZ = 1;
    public static int aa = 420000;
    public static boolean ab = true;
    public static boolean ac = true;
    public static int ad = 20;
    public static int ae = 300;
    public static int af = 1000;
    public static int ag = Integer.MAX_VALUE;
    public static long ah = 900000;

    /* renamed from: ai, reason: collision with root package name */
    public static long f7730ai = 420000;
    public static long aj = 180000;
    public static long ak = 0;
    public static long al = 15;
    public static long am = 300000;
    public static int an = 1000;
    public static int ao = 0;
    public static int ap = 30000;
    public static int aq = 30000;
    public static float ar = 10.0f;
    public static float as = 6.0f;
    public static float at = 10.0f;
    public static int au = 60;
    public static int av = 70;
    public static int aw = 6;
    public static String ax = null;
    public static boolean ay = false;
    public static int az = 16;
    public static boolean b = false;
    public static int ba = 1;
    public static boolean c = false;
    public static boolean d = false;
    public static int e = 0;
    public static String f = "no";
    public static int g = 4;
    public static boolean h = false;
    public static boolean i = false;
    public static boolean j = false;
    public static boolean k = false;
    public static boolean l = false;
    public static boolean m = false;
    public static String n = "gcj02";
    public static String o = "";
    public static boolean p = true;

    /* renamed from: q, reason: collision with root package name */
    public static int f7731q = 3;
    public static double r = 0.0d;
    public static double s = 0.0d;
    public static double t = 0.0d;
    public static double u = 0.0d;
    public static int v = 0;
    public static byte[] w = null;
    public static boolean x = false;
    public static int y = 0;
    public static float z = 1.1f;
    private static String bg = Build.MANUFACTURER;
    public static boolean bb = false;
    public static String bc = null;
    public static int bd = -1;
    public static String be = null;
    public static String bf = null;

    public static double a(double d2, double d3, double d4, double d5) {
        Location.distanceBetween(d2, d3, d4, d5, new float[1]);
        return r9[0];
    }

    public static int a(char c2) {
        switch (c2) {
            case '1':
                return 1;
            case '2':
                return 2;
            case '3':
                return 3;
            case '4':
                return 4;
            case '5':
                return 5;
            case '6':
                return 6;
            case '7':
                return 7;
            case '8':
                return 8;
            case '9':
                return 9;
            default:
                switch (c2) {
                    case 'A':
                        return 10;
                    case 'B':
                        return 11;
                    case 'C':
                        return 12;
                    case 'D':
                        return 13;
                    case 'E':
                        return 14;
                    case 'F':
                        return 15;
                    default:
                        switch (c2) {
                            case 'a':
                                return 10;
                            case 'b':
                                return 11;
                            case 'c':
                                return 12;
                            case 'd':
                                return 13;
                            case 'e':
                                return 14;
                            case 'f':
                                return 15;
                            default:
                                return 0;
                        }
                }
        }
    }

    public static int a(Context context, String str) {
        try {
            return context.checkPermission(str, Process.myPid(), Process.myUid()) == 0 ? 1 : 0;
        } catch (Exception unused) {
            return 1;
        }
    }

    public static int a(Object obj, String str) throws Exception {
        Method declaredMethod = obj.getClass().getDeclaredMethod(str, null);
        if (!declaredMethod.isAccessible()) {
            declaredMethod.setAccessible(true);
        }
        return ((Integer) declaredMethod.invoke(obj, null)).intValue();
    }

    public static int a(String str, String str2, String str3) {
        int indexOf;
        int length;
        int indexOf2;
        String substring;
        if (str != null && !str.equals("") && (indexOf = str.indexOf(str2)) != -1 && (indexOf2 = str.indexOf(str3, (length = indexOf + str2.length()))) != -1 && (substring = str.substring(length, indexOf2)) != null && !substring.equals("")) {
            try {
                return Integer.parseInt(substring);
            } catch (NumberFormatException unused) {
            }
        }
        return Integer.MIN_VALUE;
    }

    public static String a() {
        Calendar calendar = Calendar.getInstance();
        int i2 = calendar.get(5);
        return String.format(Locale.CHINA, "%d-%02d-%02d %02d:%02d:%02d", Integer.valueOf(calendar.get(1)), Integer.valueOf(calendar.get(2) + 1), Integer.valueOf(i2), Integer.valueOf(calendar.get(11)), Integer.valueOf(calendar.get(12)), Integer.valueOf(calendar.get(13)));
    }

    public static String a(com.baidu.location.f.a aVar, k kVar, Location location, String str, int i2) {
        return a(aVar, kVar, location, str, i2, false);
    }

    public static String a(com.baidu.location.f.a aVar, k kVar, Location location, String str, int i2, boolean z2) {
        String b2;
        StringBuffer stringBuffer = new StringBuffer(2048);
        if (aVar != null && (b2 = com.baidu.location.f.f.a().b(aVar)) != null) {
            stringBuffer.append(b2);
        }
        if (kVar != null) {
            String a2 = com.baidu.location.f.f.a().a(i2 == 0 ? O : aA, true, kVar, az);
            if (a2 != null) {
                stringBuffer.append(a2);
            }
        }
        if (location != null) {
            String b3 = (e == 0 || i2 == 0) ? com.baidu.location.f.d.b(location) : com.baidu.location.f.d.c(location);
            if (b3 != null) {
                stringBuffer.append(b3);
            }
        }
        String a3 = b.a().a(i2 == 0);
        if (a3 != null) {
            stringBuffer.append(a3);
        }
        if (str != null) {
            stringBuffer.append(str);
        }
        String d2 = com.baidu.location.c.c.a().d();
        if (!TextUtils.isEmpty(d2)) {
            stringBuffer.append("&bc=").append(d2);
        }
        stringBuffer.append(com.baidu.location.f.d.a().n());
        String a4 = com.baidu.location.f.f.a().a(aVar);
        if (a4 != null && a4.length() + stringBuffer.length() < 2000) {
            stringBuffer.append(a4);
        }
        String stringBuffer2 = stringBuffer.toString();
        if (location != null && kVar != null) {
            try {
                float speed = location.getSpeed();
                int i3 = e;
                int a5 = com.baidu.location.f.f.a().a(kVar);
                int a6 = kVar.a();
                boolean z3 = kVar.d;
                if (speed < as && ((i3 == 1 || i3 == 0) && (a5 < au || z3))) {
                    f7731q = 1;
                    return stringBuffer2;
                }
                if (speed < at && ((i3 == 1 || i3 == 0 || i3 == 3) && (a5 < av || a6 > aw))) {
                    f7731q = 2;
                    return stringBuffer2;
                }
            } catch (Exception unused) {
                f7731q = 3;
                return stringBuffer2;
            }
        }
        f7731q = 3;
        return stringBuffer2;
    }

    public static String a(String str) {
        return Jni.en1(o + ";" + str);
    }

    public static String a(byte[] bArr, String str, boolean z2) {
        StringBuilder sb = new StringBuilder();
        for (byte b2 : bArr) {
            String hexString = Integer.toHexString(b2 & 255);
            if (z2) {
                hexString = hexString.toUpperCase();
            }
            if (hexString.length() == 1) {
                sb.append("0");
            }
            sb.append(hexString).append(str);
        }
        return sb.toString();
    }

    public static String a(byte[] bArr, boolean z2) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.reset();
            messageDigest.update(bArr);
            return a(messageDigest.digest(), "", z2);
        } catch (NoSuchAlgorithmException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static boolean a(double d2, double d3) {
        return Math.abs(d2 - d3) <= 1.192092896E-7d;
    }

    public static boolean a(float f2, float f3) {
        return Math.abs(f2 - f3) <= 1.1920929E-7f;
    }

    public static boolean a(Context context) {
        NetworkInfo[] networkInfoArr;
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager != null) {
            try {
                networkInfoArr = connectivityManager.getAllNetworkInfo();
            } catch (Exception unused) {
                networkInfoArr = null;
            }
            if (networkInfoArr != null) {
                for (NetworkInfo networkInfo : networkInfoArr) {
                    if (networkInfo.getState() == NetworkInfo.State.CONNECTED) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static boolean a(Location location) {
        String str;
        if (location != null && (str = bg) != null && Const.BRAND_HUAWEI.equalsIgnoreCase(str)) {
            try {
                Bundle extras = location.getExtras();
                if (extras != null) {
                    if ((extras.getInt("SourceType") & 128) == 128) {
                        return true;
                    }
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public static boolean a(BDLocation bDLocation) {
        int locType = bDLocation.getLocType();
        return (locType > 100 && locType < 200) || locType == 62;
    }

    public static boolean a(int[] iArr, int i2) {
        if (iArr != null && iArr.length >= i2) {
            for (int i3 : iArr) {
                if (i3 == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    public static byte[] a(byte[] bArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
        } catch (IOException e2) {
            e2.printStackTrace();
        }
        return byteArrayOutputStream.toByteArray();
    }

    public static int b(Context context) {
        try {
            return Settings.Global.getInt(context.getContentResolver(), "airplane_mode_on", 0);
        } catch (Exception unused) {
            return 2;
        }
    }

    public static Object b(Object obj, String str) throws Exception {
        Field declaredField = obj.getClass().getDeclaredField(str);
        declaredField.setAccessible(true);
        return declaredField.get(obj);
    }

    public static String b(String str) {
        BufferedReader bufferedReader;
        BufferedReader bufferedReader2 = null;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec("getprop " + str).getInputStream()), 1024);
            try {
                String readLine = bufferedReader.readLine();
                bufferedReader.close();
                try {
                    bufferedReader.close();
                } catch (IOException unused) {
                }
                if (TextUtils.isEmpty(readLine)) {
                    return null;
                }
                return readLine;
            } catch (Exception unused2) {
                if (bufferedReader != null) {
                    try {
                        bufferedReader.close();
                    } catch (IOException unused3) {
                    }
                }
                return null;
            } catch (Throwable th) {
                th = th;
                bufferedReader2 = bufferedReader;
                if (bufferedReader2 != null) {
                    try {
                        bufferedReader2.close();
                    } catch (IOException unused4) {
                    }
                }
                throw th;
            }
        } catch (Exception unused5) {
            bufferedReader = null;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static boolean b() {
        return false;
    }

    public static boolean b(Context context, String str) {
        try {
            context.getPackageManager().getPackageInfo(str, 1);
            return true;
        } catch (PackageManager.NameNotFoundException e2) {
            e2.printStackTrace();
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0047 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static byte[] b(byte[] r4) {
        /*
            r0 = 0
            if (r4 == 0) goto L50
            int r1 = r4.length
            if (r1 != 0) goto L7
            goto L50
        L7:
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream
            r1.<init>()
            java.io.ByteArrayInputStream r2 = new java.io.ByteArrayInputStream
            r2.<init>(r4)
            r4 = 0
            java.util.zip.GZIPInputStream r3 = new java.util.zip.GZIPInputStream     // Catch: java.lang.Throwable -> L2b java.io.IOException -> L2f
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L2b java.io.IOException -> L2f
            r4 = 2048(0x800, float:2.87E-42)
            byte[] r4 = new byte[r4]     // Catch: java.io.IOException -> L29 java.lang.Throwable -> L44
        L1b:
            int r2 = r3.read(r4)     // Catch: java.io.IOException -> L29 java.lang.Throwable -> L44
            if (r2 < 0) goto L25
            r1.write(r4, r0, r2)     // Catch: java.io.IOException -> L29 java.lang.Throwable -> L44
            goto L1b
        L25:
            r3.close()     // Catch: java.io.IOException -> L3b
            goto L3f
        L29:
            r4 = move-exception
            goto L32
        L2b:
            r0 = move-exception
            r3 = r4
            r4 = r0
            goto L45
        L2f:
            r0 = move-exception
            r3 = r4
            r4 = r0
        L32:
            r4.printStackTrace()     // Catch: java.lang.Throwable -> L44
            if (r3 == 0) goto L3f
            r3.close()     // Catch: java.io.IOException -> L3b
            goto L3f
        L3b:
            r4 = move-exception
            r4.printStackTrace()
        L3f:
            byte[] r4 = r1.toByteArray()
            return r4
        L44:
            r4 = move-exception
        L45:
            if (r3 == 0) goto L4f
            r3.close()     // Catch: java.io.IOException -> L4b
            goto L4f
        L4b:
            r0 = move-exception
            r0.printStackTrace()
        L4f:
            throw r4
        L50:
            byte[] r4 = new byte[r0]
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baidu.location.h.i.b(byte[]):byte[]");
    }

    public static int c(Context context) {
        try {
            return Settings.Secure.getInt(context.getContentResolver(), "location_mode", -1);
        } catch (Exception unused) {
            return -1;
        }
    }

    public static long c(String str) {
        try {
            return new SimpleDateFormat(MiniPack.BUILD_TIME_FORMAT).parse(str).getTime() / 1000;
        } catch (Exception unused) {
            return 0L;
        }
    }

    public static String c() {
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                Enumeration<InetAddress> inetAddresses = networkInterfaces.nextElement().getInetAddresses();
                while (inetAddresses.hasMoreElements()) {
                    InetAddress nextElement = inetAddresses.nextElement();
                    if (!nextElement.isLoopbackAddress() && (nextElement instanceof Inet6Address) && nextElement.getHostAddress() != null && !nextElement.getHostAddress().startsWith("fe80:")) {
                        return nextElement.getHostAddress();
                    }
                }
            }
            return "";
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String d() {
        return d.l;
    }

    public static boolean d(Context context) {
        int i2;
        if (context == null) {
            return true;
        }
        try {
            i2 = a(context, Permission.ACCESS_COARSE_LOCATION);
        } catch (Exception e2) {
            e2.printStackTrace();
            i2 = 1;
        }
        boolean z2 = i2 == 1;
        if (!z2) {
            return z2;
        }
        try {
            return Settings.Secure.getInt(context.getContentResolver(), "location_mode", 1) != 0 ? z2 : false;
        } catch (Exception unused) {
            return z2;
        }
    }

    public static byte[] d(String str) {
        char[] charArray = str.toCharArray();
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = i2 * 2;
            bArr[i2] = (byte) ((a(charArray[i3 + 1]) | (a(charArray[i3]) << 4)) & 255);
        }
        return bArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String e() {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 0
            r2 = 28
            if (r0 > r2) goto L20
            java.lang.String r0 = android.os.Environment.getExternalStorageState()     // Catch: java.lang.Exception -> L1c
            java.lang.String r3 = "mounted"
            boolean r0 = r0.equals(r3)     // Catch: java.lang.Exception -> L1c
            if (r0 == 0) goto L20
            java.io.File r0 = android.os.Environment.getExternalStorageDirectory()     // Catch: java.lang.Exception -> L1c
            java.lang.String r0 = r0.getPath()     // Catch: java.lang.Exception -> L1c
            goto L21
        L1c:
            r0 = move-exception
            r0.printStackTrace()
        L20:
            r0 = r1
        L21:
            if (r0 != 0) goto L3d
            int r3 = android.os.Build.VERSION.SDK_INT
            if (r3 <= r2) goto L3d
            android.content.Context r2 = com.baidu.location.f.getServiceContext()
            if (r2 == 0) goto L3d
            android.content.Context r0 = com.baidu.location.f.getServiceContext()     // Catch: java.lang.Exception -> L3c
            java.lang.String r2 = android.os.Environment.DIRECTORY_MOVIES     // Catch: java.lang.Exception -> L3c
            java.io.File r0 = r0.getExternalFilesDir(r2)     // Catch: java.lang.Exception -> L3c
            java.lang.String r0 = r0.getAbsolutePath()     // Catch: java.lang.Exception -> L3c
            goto L3d
        L3c:
            r0 = r1
        L3d:
            if (r0 == 0) goto L66
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L61
            r2.<init>()     // Catch: java.lang.Exception -> L61
            java.lang.StringBuilder r2 = r2.append(r0)     // Catch: java.lang.Exception -> L61
            java.lang.String r3 = "/baidu/tempdata"
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.lang.Exception -> L61
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Exception -> L61
            java.io.File r3 = new java.io.File     // Catch: java.lang.Exception -> L61
            r3.<init>(r2)     // Catch: java.lang.Exception -> L61
            boolean r2 = r3.exists()     // Catch: java.lang.Exception -> L61
            if (r2 != 0) goto L66
            r3.mkdirs()     // Catch: java.lang.Exception -> L61
            goto L66
        L61:
            r0 = move-exception
            r0.printStackTrace()
            goto L67
        L66:
            r1 = r0
        L67:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baidu.location.h.i.e():java.lang.String");
    }

    public static String e(Context context) {
        StringBuilder append;
        int a2 = a(context, Permission.ACCESS_COARSE_LOCATION);
        int a3 = a(context, Permission.ACCESS_FINE_LOCATION);
        if (Build.VERSION.SDK_INT >= 29) {
            append = new StringBuilder("&per=").append(a2).append("|").append(a3).append("|").append(a(context, Permission.ACCESS_BACKGROUND_LOCATION));
        } else {
            append = new StringBuilder("&per=").append(a2).append("|").append(a3);
        }
        return append.toString();
    }

    public static String e(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("enc3")) {
                return new String(b(Base64.decode(jSONObject.optString("enc3").getBytes(), 0)), "UTF-8");
            }
        } catch (Exception unused) {
        }
        return str;
    }

    public static String f() {
        String e2 = e();
        if (e2 == null) {
            return null;
        }
        return e2 + "/baidu/tempdata";
    }

    public static String f(Context context) {
        int i2 = -1;
        if (context != null) {
            try {
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
                if (activeNetworkInfo != null && activeNetworkInfo.isAvailable()) {
                    i2 = activeNetworkInfo.getType();
                }
            } catch (Throwable unused) {
            }
        }
        return "&netc=" + i2;
    }

    public static String g() {
        try {
            File file = new File(com.baidu.location.f.getServiceContext().getFilesDir() + File.separator + "lldt");
            if (!file.exists()) {
                file.mkdirs();
            }
            return file.getAbsolutePath();
        } catch (Exception unused) {
            return null;
        }
    }

    public static String g(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (Exception unused) {
            return null;
        }
    }

    public static int h(Context context) {
        int a2 = a(context, Permission.ACCESS_FINE_LOCATION) | a(context, Permission.ACCESS_COARSE_LOCATION);
        if (c(context) != 0 && a2 == 1) {
            return 1;
        }
        if (c(context) == 0 || a2 == 1) {
            return (c(context) >= 1 || a2 != 1) ? 0 : -1;
        }
        return -2;
    }

    public static String h() {
        try {
            File file = new File(com.baidu.location.f.getServiceContext().getFilesDir() + File.separator + "/baidu/tempdata");
            if (!file.exists()) {
                file.mkdirs();
            }
            return com.baidu.location.f.getServiceContext().getFilesDir().getPath();
        } catch (Exception unused) {
            return null;
        }
    }

    public static String i() {
        try {
            File file = new File(com.baidu.location.f.getServiceContext().getFilesDir() + File.separator + "/baidu/tempdata");
            if (!file.exists()) {
                file.mkdirs();
            }
            return com.baidu.location.f.getServiceContext().getFilesDir().getPath() + File.separator + "/baidu/tempdata";
        } catch (Exception unused) {
            return null;
        }
    }

    public static boolean i(Context context) {
        if (context == null) {
            return false;
        }
        return Build.VERSION.SDK_INT >= 31 && a(context, Permission.ACCESS_FINE_LOCATION) == 0 && a(context, Permission.ACCESS_COARSE_LOCATION) == 1;
    }

    public static String j() {
        return b("ro.mediatek.platform");
    }

    public static boolean j(Context context) {
        ConnectivityManager connectivityManager;
        NetworkCapabilities networkCapabilities;
        if (context == null) {
            return false;
        }
        try {
            connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        } catch (Exception unused) {
        }
        if (Build.VERSION.SDK_INT >= 29) {
            Network activeNetwork = connectivityManager.getActiveNetwork();
            return activeNetwork != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) != null && networkCapabilities.hasCapability(12) && networkCapabilities.hasCapability(16);
        }
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo == null) {
            return false;
        }
        return activeNetworkInfo.isConnected();
    }

    public static SSLSocketFactory k() throws Exception {
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        sSLContext.init(null, null, new SecureRandom());
        return sSLContext.getSocketFactory();
    }

    public static HostnameVerifier l() {
        return new HostnameVerifier() { // from class: com.baidu.location.h.i.1
            @Override // javax.net.ssl.HostnameVerifier
            public boolean verify(String str, SSLSession sSLSession) {
                return HttpsURLConnection.getDefaultHostnameVerifier().verify(str, sSLSession);
            }
        };
    }
}
