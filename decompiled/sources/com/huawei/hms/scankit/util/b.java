package com.huawei.hms.scankit.util;

import android.app.Activity;
import android.app.AppOpsManager;
import android.content.ContentUris;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.net.Uri;
import android.os.Build;
import android.os.Process;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.WindowManager;
import com.huawei.hms.framework.common.SystemPropUtils;
import com.huawei.hms.hmsscankit.ScanUtil;
import com.huawei.hms.ml.scan.HmsScan;
import com.huawei.hms.ml.scan.HmsScanBase;
import com.qumeng.overseas.advlib.__remote__.core.proto.utils.w;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

/* compiled from: Utils.java */
/* loaded from: classes14.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private static String f10713a;
    private static String b;

    public static boolean a(int[][] iArr, int i) {
        return i >= 0 && i < iArr.length;
    }

    public static int b(int i) {
        if (i == 0) {
            return 0;
        }
        if (i == HmsScanBase.QRCODE_SCAN_TYPE) {
            return 256;
        }
        if (i == HmsScanBase.AZTEC_SCAN_TYPE) {
            return 4096;
        }
        if (i == HmsScanBase.DATAMATRIX_SCAN_TYPE) {
            return 16;
        }
        if (i == HmsScanBase.PDF417_SCAN_TYPE) {
            return 2048;
        }
        if (i == HmsScanBase.CODE39_SCAN_TYPE) {
            return 2;
        }
        if (i == HmsScanBase.CODE93_SCAN_TYPE) {
            return 4;
        }
        if (i == HmsScanBase.CODE128_SCAN_TYPE) {
            return 1;
        }
        if (i == HmsScanBase.EAN13_SCAN_TYPE) {
            return 32;
        }
        if (i == HmsScanBase.EAN8_SCAN_TYPE) {
            return 64;
        }
        if (i == HmsScanBase.ITF14_SCAN_TYPE) {
            return 128;
        }
        if (i == HmsScanBase.UPCCODE_A_SCAN_TYPE) {
            return 512;
        }
        if (i == HmsScanBase.UPCCODE_E_SCAN_TYPE) {
            return 1024;
        }
        if (i == HmsScanBase.CODABAR_SCAN_TYPE) {
            return 8;
        }
        return i;
    }

    public static int c(Context context) {
        int identifier;
        if (context.getResources() == null || (identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android")) <= 0) {
            return 0;
        }
        return context.getResources().getDimensionPixelSize(identifier);
    }

    public static boolean d(Context context) {
        return (context instanceof Activity) && ((Activity) context).isInMultiWindowMode();
    }

    public static boolean e(Context context) {
        try {
            return "CN".equalsIgnoreCase(SystemPropUtils.getProperty("get", "ro.hw.country", "android.os.SystemProperties", "UNKNOWN"));
        } catch (RuntimeException | Exception unused) {
            return false;
        }
    }

    public static boolean f(Context context) {
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        return Math.sqrt(Math.pow((double) (((float) displayMetrics.widthPixels) / displayMetrics.xdpi), 2.0d) + Math.pow((double) (((float) displayMetrics.heightPixels) / displayMetrics.ydpi), 2.0d)) >= 5.5d;
    }

    public static boolean g(Context context) {
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        return Math.sqrt(Math.pow((double) (((float) displayMetrics.widthPixels) / displayMetrics.xdpi), 2.0d) + Math.pow((double) (((float) displayMetrics.heightPixels) / displayMetrics.ydpi), 2.0d)) >= 8.0d && ((float) displayMetrics.widthPixels) / ((float) displayMetrics.heightPixels) > 1.3f;
    }

    public static boolean h(Context context) {
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        return Math.sqrt(Math.pow((double) (((float) displayMetrics.widthPixels) / displayMetrics.xdpi), 2.0d) + Math.pow((double) (((float) displayMetrics.heightPixels) / displayMetrics.ydpi), 2.0d)) >= 7.0d;
    }

    public static boolean i(Context context) {
        return Settings.Global.getInt(context.getContentResolver(), b(), 0) == 0;
    }

    public static boolean a(int[] iArr, int i) {
        return i >= 0 && i < iArr.length;
    }

    public static boolean a(byte[] bArr, int i) {
        return i >= 0 && i < bArr.length;
    }

    public static boolean a(byte[][] bArr, int i) {
        return i >= 0 && i < bArr.length;
    }

    public static boolean c(Activity activity) {
        int rotation = activity.getWindowManager().getDefaultDisplay().getRotation();
        return rotation == 0 || rotation == 2;
    }

    public static boolean a(String[] strArr, int i) {
        return i >= 0 && i < strArr.length;
    }

    public static boolean a(float[] fArr, int i) {
        return i >= 0 && i < fArr.length;
    }

    public static HmsScan[] a(HmsScan[] hmsScanArr) {
        if (hmsScanArr != null && hmsScanArr.length != 0) {
            for (HmsScan hmsScan : hmsScanArr) {
                if (hmsScan != null) {
                    hmsScan.scanType = b(hmsScan.scanType);
                }
            }
        }
        return hmsScanArr;
    }

    public static int a(int i) {
        if (i > 0 && i < 8192) {
            if (((i - 1) & i) == 0) {
                return i;
            }
            int i2 = HmsScanBase.AZTEC_SCAN_TYPE;
            r0 = (i & i2) != 0 ? b(i2) : 0;
            int i3 = HmsScanBase.CODABAR_SCAN_TYPE;
            if ((i & i3) != 0) {
                r0 |= b(i3);
            }
            int i4 = HmsScanBase.CODE39_SCAN_TYPE;
            if ((i & i4) != 0) {
                r0 |= b(i4);
            }
            int i5 = HmsScanBase.CODE93_SCAN_TYPE;
            if ((i & i5) != 0) {
                r0 |= b(i5);
            }
            int i6 = HmsScanBase.CODE128_SCAN_TYPE;
            if ((i & i6) != 0) {
                r0 |= b(i6);
            }
            int i7 = HmsScanBase.DATAMATRIX_SCAN_TYPE;
            if ((i & i7) != 0) {
                r0 |= b(i7);
            }
            int i8 = HmsScanBase.EAN8_SCAN_TYPE;
            if ((i & i8) != 0) {
                r0 |= b(i8);
            }
            int i9 = HmsScanBase.EAN13_SCAN_TYPE;
            if ((i & i9) != 0) {
                r0 |= b(i9);
            }
            int i10 = HmsScanBase.QRCODE_SCAN_TYPE;
            if ((i & i10) != 0) {
                r0 |= b(i10);
            }
            int i11 = HmsScanBase.ITF14_SCAN_TYPE;
            if ((i & i11) != 0) {
                r0 |= b(i11);
            }
            int i12 = HmsScanBase.PDF417_SCAN_TYPE;
            if ((i & i12) != 0) {
                r0 |= b(i12);
            }
            int i13 = HmsScanBase.UPCCODE_A_SCAN_TYPE;
            if ((i & i13) != 0) {
                r0 |= b(i13);
            }
            int i14 = HmsScanBase.UPCCODE_E_SCAN_TYPE;
            if ((i & i14) != 0) {
                return b(i14) | r0;
            }
        }
        return r0;
    }

    private static String b() {
        String str = Build.BRAND;
        return (TextUtils.isEmpty(str) || str.equalsIgnoreCase("HUAWEI")) ? "navigationbar_is_min" : str.equalsIgnoreCase("XIAOMI") ? "force_fsg_nav_bar" : (str.equalsIgnoreCase(w.f) || str.equalsIgnoreCase(w.d)) ? "navigation_gesture_on" : "navigationbar_is_min";
    }

    public static boolean b(Activity activity) {
        return a(activity) == 102;
    }

    public static boolean b(Context context) {
        if (a(context) && TextUtils.isEmpty(b)) {
            b = context.getSharedPreferences("scanExt", 0).getString("scanExt", "unSet");
        }
        return "forbid".equals(b);
    }

    private static String b(Context context, Intent intent) {
        Uri data = new Intent(intent).getData();
        if (DocumentsContract.isDocumentUri(context, data)) {
            String documentId = DocumentsContract.getDocumentId(data);
            if ("com.android.providers.media.documents".equals(data.getAuthority())) {
                return a(context, MediaStore.Images.Media.EXTERNAL_CONTENT_URI, "_id=" + documentId.split(":")[1]);
            }
            if ("com.android.providers.downloads.documents".equals(data.getAuthority())) {
                try {
                    return a(context, ContentUris.withAppendedId(Uri.parse("content://downloads/public_downloads"), Long.parseLong(documentId)), (String) null);
                } catch (NumberFormatException unused) {
                    a.b("ScankitUtils", "NumberFormatException in withAppendedId");
                    return null;
                } catch (Exception unused2) {
                    a.b("ScankitUtils", "Exception in withAppendedId");
                    return null;
                }
            }
        } else if ("content".equalsIgnoreCase(data.getScheme())) {
            return a(context, data, (String) null);
        }
        return null;
    }

    public static Bitmap a(Bitmap bitmap, int i, int i2) {
        if (bitmap.getWidth() <= 0 || bitmap.getHeight() <= 0) {
            return null;
        }
        return a(bitmap, i / bitmap.getWidth(), i2 / bitmap.getHeight());
    }

    public static Bitmap a(Bitmap bitmap, float f, float f2) {
        if (f <= 0.0f || f2 <= 0.0f) {
            return null;
        }
        float f3 = 1.0f / f;
        float f4 = 1.0f / f2;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i = (int) (width * f);
        int i2 = (int) (height * f2);
        int[] iArr = new int[width * height];
        bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
        int[] iArr2 = new int[i * i2];
        for (int i3 = 0; i3 < i2; i3++) {
            for (int i4 = 0; i4 < i; i4++) {
                iArr2[(i3 * i) + i4] = iArr[(((int) (i3 * f4)) * width) + ((int) (i4 * f3))];
            }
        }
        Log.d(">>>", "dstPixels:" + i + " x " + i2);
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        createBitmap.setPixels(iArr2, 0, i, 0, 0, i, i2);
        return createBitmap;
    }

    public static int a(Context context, String str) {
        return context.checkPermission(str, Process.myPid(), Process.myUid()) == -1 ? -1 : 0;
    }

    public static String a(String str) {
        return AppOpsManager.permissionToOp(str);
    }

    public static ResolveInfo a(Intent intent, String str, Activity activity) {
        intent.setPackage(str);
        List<ResolveInfo> queryIntentActivities = activity.getPackageManager().queryIntentActivities(intent, 0);
        if (queryIntentActivities.isEmpty()) {
            return null;
        }
        return queryIntentActivities.get(0);
    }

    public static int a(Activity activity) {
        try {
            Class<?> cls = Class.forName("com.huawei.android.app.ActivityManagerEx");
            Method declaredMethod = cls.getDeclaredMethod("getActivityWindowMode", Activity.class);
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke(cls, activity);
            if (invoke == null) {
                return -1;
            }
            return Integer.valueOf(String.valueOf(invoke)).intValue();
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | NumberFormatException | InvocationTargetException unused) {
            return -1;
        }
    }

    public static boolean a(Context context) {
        if (TextUtils.isEmpty(f10713a)) {
            try {
                f10713a = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.getString("scanExt", "unSet");
            } catch (PackageManager.NameNotFoundException unused) {
                Log.e("scanerror", "checkPermission NameNotFoundException");
            } catch (Exception unused2) {
                Log.e("scanerror", "checkPermission Exception");
            }
        }
        return "readUri".equals(f10713a);
    }

    public static Bitmap a(Bitmap bitmap, float f) {
        if (bitmap == null) {
            return null;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Matrix matrix = new Matrix();
        matrix.setRotate(f, width / 2, height / 2);
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, false);
        if (!createBitmap.equals(bitmap) && !bitmap.isRecycled()) {
            bitmap.recycle();
        }
        return createBitmap;
    }

    public static Bitmap a(Bitmap bitmap, int i) {
        if (i == 0) {
            return a(bitmap, 90.0f);
        }
        if (i != 2) {
            return i != 3 ? bitmap : a(bitmap, 180.0f);
        }
        return a(bitmap, 270.0f);
    }

    public static Bitmap a(Context context, Intent intent) {
        Bitmap a2;
        Bitmap compressBitmap;
        if (!a(context)) {
            String b2 = b(context, intent);
            if (TextUtils.isEmpty(b2)) {
                return null;
            }
            if (Build.VERSION.SDK_INT > 28 && context.getApplicationInfo() != null && context.getApplicationInfo().targetSdkVersion > 28) {
                a.a("ScanBitmap", "compressBitmap above android 29");
                compressBitmap = ScanUtil.compressBitmapForAndroid29(context, b2);
            } else {
                a.a("ScanBitmap", "compressBitmap below android 29");
                compressBitmap = ScanUtil.compressBitmap(context, b2);
            }
            if (compressBitmap != null) {
                return compressBitmap;
            }
            a.a("ScanBitmap", "compressBitmap above android 29");
            return ScanUtil.compressBitmapForAndroid29(context, b2);
        }
        Uri data = intent.getData();
        if (data == null || (a2 = a(context, data)) == null) {
            return null;
        }
        return a2;
    }

    private static String a(Context context, Uri uri, String str) {
        try {
            Cursor query = context.getContentResolver().query(uri, new String[]{"_data"}, str, null, null);
            if (query != null) {
                r1 = query.moveToFirst() ? query.getString(query.getColumnIndex("_data")) : null;
                query.close();
            }
            return r1;
        } catch (IllegalStateException unused) {
            a.b("ScankitUtils", "IllegalStateException in getImagePath");
            return null;
        } catch (Exception unused2) {
            a.b("ScankitUtils", "Exception in getImagePath");
            return null;
        }
    }

    public static Bitmap a(Context context, Uri uri) {
        InputStream inputStream;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        InputStream inputStream2 = null;
        try {
            try {
                inputStream = context.getApplicationContext().getContentResolver().openInputStream(uri);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (IOException unused) {
            inputStream = null;
        } catch (Throwable th) {
            th = th;
        }
        if (inputStream == null) {
            if (inputStream != null) {
                inputStream.close();
            }
            return null;
        }
        try {
            byte[] a2 = a(inputStream);
            BitmapFactory.decodeByteArray(a2, 0, a2.length, options);
            a(context, options);
            Bitmap decodeByteArray = BitmapFactory.decodeByteArray(a2, 0, a2.length, options);
            if (inputStream != null) {
                try {
                    inputStream.close();
                    return decodeByteArray;
                } catch (IOException e2) {
                    e2.printStackTrace();
                }
            }
            return decodeByteArray;
        } catch (IOException unused2) {
            if (inputStream != null) {
                inputStream.close();
            }
            return null;
        } catch (Throwable th2) {
            th = th2;
            inputStream2 = inputStream;
            if (inputStream2 != null) {
                try {
                    inputStream2.close();
                } catch (IOException e3) {
                    e3.printStackTrace();
                }
            }
            throw th;
        }
    }

    public static byte[] a(InputStream inputStream) throws IOException {
        byte[] bArr = new byte[1024];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
                return byteArray;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(android.content.Context r9, android.graphics.BitmapFactory.Options r10) {
        /*
            java.lang.String r0 = "exception"
            int r1 = r10.outWidth
            int r2 = r10.outHeight
            if (r1 == 0) goto L5f
            if (r2 != 0) goto Lb
            goto L5f
        Lb:
            if (r1 <= r2) goto Le
            r1 = r2
        Le:
            java.lang.String r2 = "activity"
            r3 = 0
            r4 = 1
            java.lang.Object r9 = r9.getSystemService(r2)     // Catch: java.lang.Exception -> L35 java.lang.NullPointerException -> L3b
            android.app.ActivityManager r9 = (android.app.ActivityManager) r9     // Catch: java.lang.Exception -> L35 java.lang.NullPointerException -> L3b
            android.app.ActivityManager$MemoryInfo r2 = new android.app.ActivityManager$MemoryInfo     // Catch: java.lang.Exception -> L35 java.lang.NullPointerException -> L3b
            r2.<init>()     // Catch: java.lang.Exception -> L35 java.lang.NullPointerException -> L3b
            r9.getMemoryInfo(r2)     // Catch: java.lang.Exception -> L35 java.lang.NullPointerException -> L3b
            r5 = 4652218415073722368(0x4090000000000000, double:1024.0)
            r7 = 4613937818241073152(0x4008000000000000, double:3.0)
            double r5 = java.lang.Math.pow(r5, r7)     // Catch: java.lang.Exception -> L35 java.lang.NullPointerException -> L3b
            long r7 = r2.totalMem     // Catch: java.lang.Exception -> L35 java.lang.NullPointerException -> L3b
            double r7 = (double) r7
            double r7 = r7 / r5
            r5 = 4617878467915022336(0x4016000000000000, double:5.5)
            int r9 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r9 >= 0) goto L33
            goto L40
        L33:
            r9 = r3
            goto L41
        L35:
            java.lang.String r9 = "Exception"
            com.huawei.hms.scankit.util.a.b(r0, r9)
            goto L40
        L3b:
            java.lang.String r9 = "NullPointerException"
            com.huawei.hms.scankit.util.a.b(r0, r9)
        L40:
            r9 = r4
        L41:
            if (r9 == 0) goto L46
            r9 = 1200(0x4b0, float:1.682E-42)
            goto L48
        L46:
            r9 = 3000(0xbb8, float:4.204E-42)
        L48:
            if (r1 <= r9) goto L52
            float r0 = (float) r1
            float r9 = (float) r9
            float r0 = r0 / r9
            int r9 = java.lang.Math.round(r0)
            goto L53
        L52:
            r9 = r4
        L53:
            r10.inSampleSize = r9
            r10.inJustDecodeBounds = r3
            android.graphics.Bitmap$Config r9 = android.graphics.Bitmap.Config.ARGB_8888
            r10.inPreferredConfig = r9
            r10.inPurgeable = r4
            r10.inInputShareable = r4
        L5f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.scankit.util.b.a(android.content.Context, android.graphics.BitmapFactory$Options):void");
    }

    public static boolean a() {
        String str = Build.BRAND;
        return str != null && str.toLowerCase().equals("samsung");
    }
}
