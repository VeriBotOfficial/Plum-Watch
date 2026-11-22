package com.inno.innosecure;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.anythink.expressad.foundation.h.k;
import com.inno.innosecure.bean.EncryptedData;
import com.jifen.open.lib.relinkerx.ReLinker;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.UUID;

@Deprecated
/* loaded from: classes17.dex */
public class InnoSecureUtils {
    private static final String TAG = "MyTestLog";
    private static int cpcVersion = 0;
    private static String localSdkVsersion = "3.1.2.200708";
    public static boolean newInterfaceInited = false;
    private static byte[] res;
    public static String sCid;
    public static int sVerifySign;
    private static String sign;
    private static String v;

    /* renamed from: com.inno.innosecure.InnoSecureUtils$1, reason: invalid class name */
    static class AnonymousClass1 implements Runnable {
        final /* synthetic */ Context val$context;
        final /* synthetic */ String val$myPackage;

        AnonymousClass1(Context context, String str) {
            this.val$context = context;
            this.val$myPackage = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            byte[] unused = InnoSecureUtils.res = InnoSecureUtils.getRes(this.val$context, InnoSecureUtils.getn(), this.val$myPackage);
            String unused2 = InnoSecureUtils.sign = InnoSecureUtils.getSign(this.val$context);
        }
    }

    /* renamed from: com.inno.innosecure.InnoSecureUtils$2, reason: invalid class name */
    static class AnonymousClass2 implements Runnable {
        final /* synthetic */ Context val$context;
        final /* synthetic */ String val$myPackage;

        AnonymousClass2(Context context, String str) {
            this.val$context = context;
            this.val$myPackage = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                byte[] unused = InnoSecureUtils.res = InnoSecureUtils.getRes(this.val$context, InnoSecureUtils.getn(), this.val$myPackage);
                String unused2 = InnoSecureUtils.sign = InnoSecureUtils.getSign(this.val$context);
            } catch (Throwable unused3) {
            }
        }
    }

    /* renamed from: com.inno.innosecure.InnoSecureUtils$3, reason: invalid class name */
    static class AnonymousClass3 implements Runnable {
        final /* synthetic */ Context val$context;
        final /* synthetic */ String val$myPackage;

        AnonymousClass3(Context context, String str) {
            this.val$context = context;
            this.val$myPackage = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            byte[] unused = InnoSecureUtils.res = InnoSecureUtils.getRes(this.val$context, InnoSecureUtils.getn(), this.val$myPackage);
            String unused2 = InnoSecureUtils.sign = InnoSecureUtils.getSign(this.val$context);
        }
    }

    /* renamed from: com.inno.innosecure.InnoSecureUtils$4, reason: invalid class name */
    static class AnonymousClass4 implements Runnable {
        final /* synthetic */ Context val$context;
        final /* synthetic */ String val$myPackage;

        AnonymousClass4(Context context, String str) {
            this.val$context = context;
            this.val$myPackage = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            byte[] unused = InnoSecureUtils.res = InnoSecureUtils.getRes(this.val$context, InnoSecureUtils.getn(), this.val$myPackage);
            String unused2 = InnoSecureUtils.sign = InnoSecureUtils.getSign(this.val$context);
        }
    }

    /* renamed from: com.inno.innosecure.InnoSecureUtils$5, reason: invalid class name */
    static class AnonymousClass5 implements Runnable {
        final /* synthetic */ Context val$context;
        final /* synthetic */ String val$myPackage;

        AnonymousClass5(Context context, String str) {
            this.val$context = context;
            this.val$myPackage = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            byte[] unused = InnoSecureUtils.res = InnoSecureUtils.getRes(this.val$context, InnoSecureUtils.getn(), this.val$myPackage);
            String unused2 = InnoSecureUtils.sign = InnoSecureUtils.getSign(this.val$context);
        }
    }

    static {
        try {
            System.loadLibrary("InnoSecure");
        } catch (Throwable th) {
            Log.e(TAG, "InnoSecure load failed:   " + th.toString());
        }
    }

    private static void checkLib(Context context) {
        try {
            try {
                ReLinker.loadLibrary(context, "InnoSecure");
            } catch (Throwable unused) {
                System.loadLibrary("InnoSecure");
            }
        } catch (Throwable unused2) {
        }
    }

    private static void checkParams() {
        if (newInterfaceInited) {
            return;
        }
        Log.e(TAG, "此API已过时！！！请使用新方法代替！！！");
    }

    private static native byte[] decode(byte[] bArr, String str, byte[] bArr2, int i);

    public static byte[] decodeSo(Context context, byte[] bArr) {
        return decodeSo(context, bArr, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] getRes(Context context, String str, String str2) {
        int resource1;
        InputStream inputStream;
        if (str2 == null || str2.equals("")) {
            str2 = context.getPackageName();
        }
        try {
            resource1 = getResource1(context, str, str2);
            if (resource1 == 0) {
                resource1 = getResource(context, str);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        if (resource1 == 0) {
            return null;
        }
        try {
            inputStream = context.getResources().openRawResource(resource1);
        } catch (Exception e) {
            e.printStackTrace();
            inputStream = null;
        }
        if (inputStream != null) {
            try {
                byte[] bArr = new byte[inputStream.available()];
                inputStream.read(bArr);
                return bArr;
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return null;
    }

    private static int getResource(Context context, String str) {
        try {
            return context.getResources().getIdentifier(str, k.c, context.getPackageName());
        } catch (Throwable th) {
            th.printStackTrace();
            return 0;
        }
    }

    private static int getResource1(Context context, String str, String str2) {
        try {
            Field field = Class.forName(str2 + ".R$drawable").getField(str);
            if (field == null) {
                return 0;
            }
            return field.getInt(str);
        } catch (Throwable th) {
            th.printStackTrace();
            return 0;
        }
    }

    public static synchronized String getSign(Context context) {
        String charsString;
        synchronized (InnoSecureUtils.class) {
            try {
                charsString = context.getPackageManager().getPackageInfo(context.getPackageName(), 64).signatures[0].toCharsString();
            } catch (Throwable th) {
                Log.e(TAG, "出错1:   " + th.toString());
                return "error";
            }
        }
        return charsString;
    }

    public static String getVersion(Context context) {
        return getVersion(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native String getn();

    private static native String getv(byte[] bArr);

    public static void init(Context context) {
        checkLib(context);
        try {
            res = getRes(context, getn(), null);
            sign = getSign(context);
        } catch (Throwable unused) {
        }
    }

    private static native byte[] secure(String str, String str2, String str3, byte[] bArr, String str4, int i);

    public static byte[] secureData(Context context, byte[] bArr, String str) {
        checkLib(context);
        if (bArr == null) {
            return null;
        }
        try {
            String str2 = "12345678-1234-1234-1234-123456789012";
            UUID randomUUID = UUID.randomUUID();
            if (randomUUID != null && randomUUID.toString().length() == 36) {
                str2 = randomUUID.toString();
            }
            String str3 = str2;
            if (res == null || sign == null) {
                res = getRes(context, getn(), str);
                sign = getSign(context);
            }
            if (res != null && sign != null) {
                if (TextUtils.isEmpty(sCid)) {
                    Log.e(TAG, "初始化未设置cid!!!!!");
                }
                return secureData(bArr, bArr.length, str3, sign, res, sCid, sVerifySign);
            }
            return null;
        } catch (Throwable th) {
            try {
                th.printStackTrace();
                return null;
            } catch (Throwable th2) {
                Log.e(TAG, "出错2:   " + th2.toString());
                return null;
            }
        }
    }

    private static native byte[] secureData(byte[] bArr, int i, String str, String str2, byte[] bArr2, String str3, int i2);

    public static byte[] secureSo(Context context, String str) {
        return secureSo(context, str, null);
    }

    public static EncryptedData secureSoWithReturnCode(Context context, String str, String str2) throws Exception {
        String str3;
        byte[] bArr;
        checkLib(context);
        EncryptedData encryptedData = new EncryptedData(0);
        if (str != null) {
            try {
                if (!str.equals("")) {
                    try {
                        String str4 = "12345678-1234-1234-1234-123456789012";
                        UUID randomUUID = UUID.randomUUID();
                        if (randomUUID != null && randomUUID.toString().length() == 36) {
                            str4 = randomUUID.toString();
                        }
                        str3 = str4;
                        if (res == null || sign == null) {
                            res = getRes(context, getn(), str2);
                            sign = getSign(context);
                        }
                        bArr = res;
                    } catch (Throwable th) {
                        encryptedData.setResultCode(4);
                        encryptedData.setExceptionInfo("1st: " + th.toString());
                    }
                    if (bArr == null) {
                        encryptedData.setResultCode(2);
                        return encryptedData;
                    }
                    String str5 = sign;
                    if (str5 == null) {
                        encryptedData.setResultCode(3);
                        return encryptedData;
                    }
                    encryptedData.setEncodedData(secure(str, str3, str5, bArr, sCid, sVerifySign));
                    if (encryptedData.getEncodedData() == null || encryptedData.getEncodedData().length == 0) {
                        encryptedData.setResultCode(5);
                        return encryptedData;
                    }
                    return encryptedData;
                }
            } catch (Throwable th2) {
                encryptedData.setResultCode(4);
                encryptedData.setExceptionInfo("2nd: " + th2.toString());
                return encryptedData;
            }
        }
        encryptedData.setResultCode(1);
        return encryptedData;
    }

    public static void setCid(String str) {
        sCid = str;
    }

    public static void setCpc(int i) {
        cpcVersion = i;
        if (i == 4) {
            setSdkVersion("3.0.0.190911");
        }
    }

    public static void setSdkVersion(String str) {
        localSdkVsersion = str;
    }

    public static byte[] decodeSo(Context context, byte[] bArr, String str) {
        String str2;
        checkLib(context);
        if (bArr != null) {
            try {
                if (bArr.length != 0) {
                    try {
                        if (res == null || sign == null) {
                            res = getRes(context, getn(), str);
                            sign = getSign(context);
                        }
                        byte[] bArr2 = res;
                        if (bArr2 != null && (str2 = sign) != null) {
                            return decode(bArr, str2, bArr2, sVerifySign);
                        }
                    } catch (Throwable unused) {
                    }
                    return null;
                }
            } catch (Throwable th) {
                Log.e(TAG, "出错2:   " + th.toString());
            }
        }
        return null;
    }

    public static String getVersion(Context context, String str) {
        checkLib(context);
        try {
            if (TextUtils.isEmpty(v)) {
                return v;
            }
            String vVar = getv(getRes(context, getn(), str));
            v = vVar;
            return vVar;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static byte[] secureSo(Context context, String str, String str2) {
        checkLib(context);
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            try {
                String str3 = "12345678-1234-1234-1234-123456789012";
                UUID randomUUID = UUID.randomUUID();
                if (randomUUID != null && randomUUID.toString().length() == 36) {
                    str3 = randomUUID.toString();
                }
                String str4 = str3;
                if (res == null || sign == null) {
                    res = getRes(context, getn(), str2);
                    sign = getSign(context);
                }
                if (res != null && sign != null) {
                    if (TextUtils.isEmpty(sCid)) {
                        Log.e(TAG, "初始化未设置cid!!!!!");
                    }
                    return secure(str, str4, sign, res, sCid, sVerifySign);
                }
                return null;
            } catch (Throwable th) {
                th.printStackTrace();
                return null;
            }
        } catch (Throwable th2) {
            Log.e(TAG, "出错2:   " + th2.toString());
            return null;
        }
    }

    public static void init(Context context, String str) {
        checkLib(context);
        try {
            res = getRes(context, getn(), str);
            sign = getSign(context);
        } catch (Throwable unused) {
        }
    }
}
