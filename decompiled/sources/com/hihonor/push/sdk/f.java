package com.hihonor.push.sdk;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import com.hihonor.push.sdk.common.RequestHeader;
import com.xiaomi.mipush.sdk.Constants;
import java.io.Closeable;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes11.dex */
public class f {
    public static c a(Bundle bundle, c cVar) {
        if (bundle != null && cVar != null) {
            bundle.setClassLoader(cVar.getClass().getClassLoader());
            for (Class<?> cls = cVar.getClass(); cls != null; cls = cls.getSuperclass()) {
                for (Field field : cls.getDeclaredFields()) {
                    if (field.isAnnotationPresent(g.class)) {
                        try {
                            a(cVar, field, bundle);
                        } catch (IllegalAccessException | IllegalArgumentException unused) {
                            Log.e("MessageCodec", "decode, set value of the field exception, field name:" + field.getName());
                        }
                    }
                }
            }
        }
        return cVar;
    }

    public static String a(byte[] bArr) {
        if (bArr.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (byte b : bArr) {
            String hexString = Integer.toHexString(b & 255);
            if (hexString.length() == 1) {
                sb.append('0');
            }
            sb.append(hexString);
        }
        return sb.toString();
    }

    public static List<Object> a(Type type, Bundle bundle) {
        ArrayList arrayList = new ArrayList();
        while (true) {
            bundle = bundle.getBundle("_next_item_");
            if (bundle == null) {
                return arrayList;
            }
            Object obj = bundle.get("_value_");
            if (!obj.getClass().isPrimitive() && !(obj instanceof Serializable)) {
                if (obj instanceof Bundle) {
                    Bundle bundle2 = (Bundle) obj;
                    int i = bundle2.getInt("_packed_type_", -1);
                    if (i == 1) {
                        throw new InstantiationException("Nested List can not be supported");
                    }
                    if (i != 0) {
                        throw new InstantiationException("Unknown type can not be supported");
                    }
                    obj = a(bundle2, (c) ((Class) ((ParameterizedType) type).getActualTypeArguments()[0]).newInstance());
                } else {
                    continue;
                }
            }
            arrayList.add(obj);
        }
    }

    public static void a(Handler handler) {
        if (Looper.myLooper() != handler.getLooper()) {
            throw new IllegalStateException("Must be called on the handler thread");
        }
    }

    public static String b(String str, byte[] bArr) {
        if (TextUtils.isEmpty(str) || bArr == null || bArr.length < 16) {
            return "";
        }
        try {
            byte[] a2 = a(12);
            byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            Cipher cipher = Cipher.getInstance(com.alipay.sdk.m.b0.a.f);
            cipher.init(1, secretKeySpec, new GCMParameterSpec(128, a2));
            byte[] doFinal = cipher.doFinal(bytes);
            if (doFinal == null || doFinal.length == 0) {
                return "";
            }
            return a(a2) + a(doFinal);
        } catch (GeneralSecurityException e) {
            Log.e("AesGcm", "GCM encrypt data error" + e.getMessage());
            return "";
        }
    }

    public static RequestHeader a(Context context) {
        String string;
        String str = null;
        try {
            Object obj = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.get("com.hihonor.push.app_id");
            if (obj != null) {
                str = String.valueOf(obj);
            }
        } catch (PackageManager.NameNotFoundException e) {
            j.a("ConfigUtils", "getPushAppId", e);
        }
        if (TextUtils.isEmpty(str)) {
            j.a("checkPushConfig Parameter is missing");
            throw l.ERROR_NO_APPID.a();
        }
        String str2 = "checkPushAppId Parameter is " + str;
        String a2 = a(context, context.getPackageName());
        if (TextUtils.isEmpty(a2)) {
            j.a("checkPushConfig Parameter is missing.");
            throw l.ERROR_CERT_FINGERPRINT_EMPTY.a();
        }
        String str3 = "checkPushCertFingerprint Parameter is " + a2;
        RequestHeader requestHeader = new RequestHeader();
        requestHeader.setPackageName(context.getPackageName());
        requestHeader.setAppId(str);
        requestHeader.setCertificateFingerprint(a2);
        k kVar = k.b;
        requestHeader.setPushToken(kVar.b(context));
        synchronized (kVar) {
            kVar.a(context);
            SharedPreferences sharedPreferences = k.f10140a.f10130a;
            string = sharedPreferences != null ? sharedPreferences.getString("key_aaid", "") : "";
            if (TextUtils.isEmpty(string)) {
                string = UUID.randomUUID().toString().replace(Constants.ACCEPT_TIME_SEPARATOR_SERVER, "");
                String str4 = "getRandomUUID UUID =" + string;
                k.f10140a.a("key_aaid", string);
            }
        }
        requestHeader.setAAID(string);
        requestHeader.setSdkVersion(80012307);
        return requestHeader;
    }

    public static a b(Context context) {
        a aVar = new a();
        Intent intent = new Intent();
        intent.setComponent(new ComponentName("android", "com.hihonor.android.pushagentproxy.HiPushService"));
        List<ResolveInfo> queryIntentServices = context.getPackageManager().queryIntentServices(intent, 128);
        if (queryIntentServices.size() > 0) {
            Iterator<ResolveInfo> it = queryIntentServices.iterator();
            if (it.hasNext()) {
                ResolveInfo next = it.next();
                String str = next.serviceInfo.applicationInfo.packageName;
                String a2 = a(context, str);
                aVar.f10123a = str;
                aVar.c = next.serviceInfo.name;
                aVar.b = a2;
            }
        }
        return aVar;
    }

    public static void a(Closeable closeable) {
        try {
            closeable.close();
        } catch (Exception e) {
            j.a("DeflateUtil", "close", e);
        }
    }

    public static String a(String str, byte[] bArr) {
        if (TextUtils.isEmpty(str) || bArr == null || bArr.length < 16) {
            return "";
        }
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            Cipher cipher = Cipher.getInstance(com.alipay.sdk.m.b0.a.f);
            String substring = str.substring(0, 24);
            String substring2 = str.substring(24);
            if (TextUtils.isEmpty(substring) || TextUtils.isEmpty(substring2)) {
                return "";
            }
            cipher.init(2, secretKeySpec, new GCMParameterSpec(128, a(substring)));
            return new String(cipher.doFinal(a(substring2)), StandardCharsets.UTF_8);
        } catch (Exception e) {
            Log.e("AesGcm", "GCM decrypt data exception: " + e.getMessage());
            return "";
        }
    }

    public static Bundle a(c cVar, Bundle bundle) {
        if (cVar != null) {
            for (Class<?> cls = cVar.getClass(); cls != null; cls = cls.getSuperclass()) {
                for (Field field : cls.getDeclaredFields()) {
                    if (field.isAnnotationPresent(g.class)) {
                        try {
                            boolean isAccessible = field.isAccessible();
                            field.setAccessible(true);
                            a(field.getName(), field.get(cVar), bundle);
                            field.setAccessible(isAccessible);
                        } catch (IllegalAccessException | IllegalArgumentException unused) {
                            Log.e("MessageCodec", "encode, get value of the field exception, field name: " + field.getName());
                        }
                    }
                }
            }
        }
        return bundle;
    }

    public static byte[] a(int i) {
        SecureRandom secureRandom;
        try {
            byte[] bArr = new byte[i];
            synchronized (f.class) {
                try {
                    secureRandom = SecureRandom.getInstance("NativePRNGNonBlocking");
                } catch (NoSuchAlgorithmException unused) {
                    Log.w("SecureRandomUtil", "platform not support secure random NativePRNGNonBlocking");
                    try {
                        secureRandom = SecureRandom.getInstanceStrong();
                    } catch (NoSuchAlgorithmException unused2) {
                        Log.w("SecureRandomUtil", "platform not support secure random strongAlgorithms");
                        secureRandom = new SecureRandom();
                    }
                }
            }
            secureRandom.nextBytes(bArr);
            return bArr;
        } catch (Exception unused3) {
            return new byte[0];
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String a(android.content.Context r12, java.lang.String r13) {
        /*
            java.lang.String r0 = "ConfigUtils"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "getCertFingerprint pkgName="
            r1.<init>(r2)
            java.lang.StringBuilder r1 = r1.append(r13)
            java.lang.String r2 = "isOnlyOne=true"
            java.lang.StringBuilder r1 = r1.append(r2)
            r1.toString()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            android.content.pm.PackageManager r12 = r12.getPackageManager()
            r2 = 64
            r3 = 0
            android.content.pm.PackageInfo r2 = r12.getPackageInfo(r13, r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L62
            if (r2 == 0) goto L2b
            android.content.pm.Signature[] r2 = r2.signatures     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L62
            goto L31
        L2b:
            java.lang.String r2 = "Package Info is null"
            android.util.Log.e(r0, r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L62
            r2 = r3
        L31:
            if (r2 != 0) goto L69
            int r4 = android.os.Build.VERSION.SDK_INT     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L60
            r5 = 30
            if (r4 < r5) goto L5e
            r4 = 134217728(0x8000000, float:3.85186E-34)
            android.content.pm.PackageInfo r12 = r12.getPackageInfo(r13, r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L60
            if (r12 == 0) goto L59
            android.content.pm.SigningInfo r12 = r12.signingInfo     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L60
            if (r12 == 0) goto L56
            boolean r13 = r12.hasMultipleSigners()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L60
            if (r13 == 0) goto L51
            android.content.pm.Signature[] r12 = r12.getApkContentsSigners()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L60
        L4f:
            r2 = r12
            goto L69
        L51:
            android.content.pm.Signature[] r12 = r12.getSigningCertificateHistory()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L60
            goto L4f
        L56:
            java.lang.String r12 = "Package signingInfo is null"
            goto L5b
        L59:
            java.lang.String r12 = "Package info is null"
        L5b:
            android.util.Log.e(r0, r12)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L60
        L5e:
            r2 = r3
            goto L69
        L60:
            r12 = move-exception
            goto L64
        L62:
            r12 = move-exception
            r2 = r3
        L64:
            java.lang.String r13 = "getCertFingerprint"
            com.hihonor.push.sdk.j.a(r0, r13, r12)
        L69:
            r12 = 0
            if (r2 == 0) goto Lc1
            int r13 = r2.length
            if (r13 <= 0) goto Lc1
            int r13 = r2.length
            r4 = r12
        L71:
            if (r4 >= r13) goto Lc6
            r5 = r2[r4]
            byte[] r5 = r5.toByteArray()
            java.lang.String r6 = "SHA256"
            java.security.MessageDigest r6 = java.security.MessageDigest.getInstance(r6)     // Catch: java.security.NoSuchAlgorithmException -> Lb1
            byte[] r5 = r6.digest(r5)     // Catch: java.security.NoSuchAlgorithmException -> Lb1
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.security.NoSuchAlgorithmException -> Lb1
            r6.<init>()     // Catch: java.security.NoSuchAlgorithmException -> Lb1
            int r7 = r5.length     // Catch: java.security.NoSuchAlgorithmException -> Lb1
            r8 = r12
        L8a:
            if (r8 >= r7) goto Lac
            r9 = r5[r8]     // Catch: java.security.NoSuchAlgorithmException -> Lb1
            r9 = r9 & 255(0xff, float:3.57E-43)
            java.lang.String r9 = java.lang.Integer.toHexString(r9)     // Catch: java.security.NoSuchAlgorithmException -> Lb1
            java.util.Locale r10 = java.util.Locale.ENGLISH     // Catch: java.security.NoSuchAlgorithmException -> Lb1
            java.lang.String r9 = r9.toUpperCase(r10)     // Catch: java.security.NoSuchAlgorithmException -> Lb1
            int r10 = r9.length()     // Catch: java.security.NoSuchAlgorithmException -> Lb1
            r11 = 1
            if (r10 != r11) goto La6
            java.lang.String r10 = "0"
            r6.append(r10)     // Catch: java.security.NoSuchAlgorithmException -> Lb1
        La6:
            r6.append(r9)     // Catch: java.security.NoSuchAlgorithmException -> Lb1
            int r8 = r8 + 1
            goto L8a
        Lac:
            java.lang.String r5 = r6.toString()     // Catch: java.security.NoSuchAlgorithmException -> Lb1
            goto Lb8
        Lb1:
            r5 = move-exception
            java.lang.String r6 = "signatureToString"
            com.hihonor.push.sdk.j.a(r0, r6, r5)
            r5 = r3
        Lb8:
            if (r5 == 0) goto Lbe
            r1.add(r5)
            goto Lc6
        Lbe:
            int r4 = r4 + 1
            goto L71
        Lc1:
            java.lang.String r13 = "Package no signatures"
            android.util.Log.e(r0, r13)
        Lc6:
            boolean r13 = r1.isEmpty()
            if (r13 == 0) goto Lcd
            goto Ld4
        Lcd:
            java.lang.Object r12 = r1.get(r12)
            r3 = r12
            java.lang.String r3 = (java.lang.String) r3
        Ld4:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hihonor.push.sdk.f.a(android.content.Context, java.lang.String):java.lang.String");
    }

    public static byte[] a(String str) {
        if (TextUtils.isEmpty(str)) {
            return new byte[0];
        }
        String upperCase = str.toUpperCase(Locale.ENGLISH);
        int length = upperCase.length() / 2;
        byte[] bArr = new byte[length];
        try {
            byte[] bytes = upperCase.getBytes(StandardCharsets.UTF_8);
            for (int i = 0; i < length; i++) {
                int i2 = i * 2;
                bArr[i] = (byte) (((byte) (Byte.decode("0x" + new String(new byte[]{bytes[i2]}, StandardCharsets.UTF_8)).byteValue() << 4)) ^ Byte.decode("0x" + new String(new byte[]{bytes[i2 + 1]}, StandardCharsets.UTF_8)).byteValue());
            }
        } catch (NumberFormatException e) {
            Log.e("HexUtils", "hex string 2 byte array exception : " + e.getMessage());
        }
        return bArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int a(android.content.Context r5, com.hihonor.push.sdk.a r6) {
        /*
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "system/framework/hipush.jar"
            r0.<init>(r1)
            boolean r0 = r0.exists()
            r1 = 8002008(0x7a19d8, float:1.1213202E-38)
            java.lang.String r2 = "HonorApiAvailability"
            if (r0 != 0) goto L18
            java.lang.String r5 = "hipush.jar is not exit"
            android.util.Log.i(r2, r5)
            return r1
        L18:
            java.lang.String r0 = r6.f10123a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "service package name is "
            r3.<init>(r4)
            java.lang.StringBuilder r3 = r3.append(r0)
            r3.toString()
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            r4 = 0
            if (r3 == 0) goto L30
            goto L42
        L30:
            android.content.pm.PackageManager r5 = r5.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L42
            android.content.pm.ApplicationInfo r5 = r5.getApplicationInfo(r0, r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L42
            boolean r5 = r5.enabled     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L42
            if (r5 == 0) goto L3f
            com.hihonor.push.sdk.z r5 = com.hihonor.push.sdk.z.ENABLED     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L42
            goto L44
        L3f:
            com.hihonor.push.sdk.z r5 = com.hihonor.push.sdk.z.DISABLED     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L42
            goto L44
        L42:
            com.hihonor.push.sdk.z r5 = com.hihonor.push.sdk.z.NOT_INSTALLED
        L44:
            com.hihonor.push.sdk.z r3 = com.hihonor.push.sdk.z.NOT_INSTALLED
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L52
            java.lang.String r5 = "push service is not installed"
            android.util.Log.i(r2, r5)
            return r1
        L52:
            com.hihonor.push.sdk.z r1 = com.hihonor.push.sdk.z.DISABLED
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L63
            java.lang.String r5 = "push service is disabled"
            android.util.Log.i(r2, r5)
            r5 = 8002007(0x7a19d7, float:1.12132E-38)
            return r5
        L63:
            java.lang.String r5 = "android"
            boolean r5 = android.text.TextUtils.equals(r0, r5)
            if (r5 == 0) goto L76
            java.lang.String r5 = r6.b
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 != 0) goto L76
            com.hihonor.push.sdk.l r5 = com.hihonor.push.sdk.l.SUCCESS
            return r4
        L76:
            r5 = 8002006(0x7a19d6, float:1.1213199E-38)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hihonor.push.sdk.f.a(android.content.Context, com.hihonor.push.sdk.a):int");
    }

    public static void a(c cVar, Field field, Bundle bundle) {
        String name = field.getName();
        Object obj = bundle.get(name);
        if (obj instanceof Bundle) {
            try {
                Bundle bundle2 = (Bundle) obj;
                int i = bundle2.getInt("_packed_type_", -1);
                if (i == 1) {
                    obj = a(field.getGenericType(), bundle2);
                } else if (i == 0) {
                    obj = a((Bundle) obj, (c) field.getType().newInstance());
                }
            } catch (Exception unused) {
                Log.e("MessageCodec", "decode, read value of the field exception, field name: " + name);
                obj = null;
            }
        }
        if (obj != null) {
            boolean isAccessible = field.isAccessible();
            field.setAccessible(true);
            field.set(cVar, obj);
            field.setAccessible(isAccessible);
        }
    }

    public static void a(String str, Object obj, Bundle bundle) {
        if (obj != null) {
            if (obj instanceof String) {
                bundle.putString(str, (String) obj);
                return;
            }
            if (obj instanceof Integer) {
                bundle.putInt(str, ((Integer) obj).intValue());
                return;
            }
            if (obj instanceof Short) {
                bundle.putShort(str, ((Short) obj).shortValue());
                return;
            }
            if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
                return;
            }
            if (obj instanceof Float) {
                bundle.putFloat(str, ((Float) obj).floatValue());
                return;
            }
            if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
                return;
            }
            if (obj instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) obj).booleanValue());
                return;
            }
            if (obj instanceof CharSequence) {
                bundle.putCharSequence(str, (CharSequence) obj);
                return;
            }
            if (obj instanceof Parcelable) {
                bundle.putParcelable(str, (Parcelable) obj);
                return;
            }
            if (obj instanceof byte[]) {
                bundle.putByteArray(str, (byte[]) obj);
                return;
            }
            if (obj instanceof List) {
                Bundle bundle2 = null;
                for (Object obj2 : (List) obj) {
                    if (bundle2 == null) {
                        bundle2 = new Bundle();
                        bundle.putBundle(str, bundle2);
                        bundle2.putInt("_packed_type_", 1);
                    }
                    Bundle bundle3 = new Bundle();
                    a("_value_", obj2, bundle3);
                    bundle2.putBundle("_next_item_", bundle3);
                    bundle2 = bundle3;
                }
                return;
            }
            if (obj instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) obj);
            } else {
                if (!(obj instanceof c)) {
                    Log.e("MessageCodec", "cannot support type, " + str);
                    return;
                }
                Bundle a2 = a((c) obj, new Bundle());
                a2.putInt("_packed_type_", 0);
                bundle.putBundle(str, a2);
            }
        }
    }
}
