package com.amap.api.col.p0003sl;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.NinePatch;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import android.os.Build;
import com.amap.api.maps.model.LatLng;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* compiled from: NinePatchTool.java */
/* loaded from: classes11.dex */
public class n4 {
    private static double a(LatLng latLng, LatLng latLng2, LatLng latLng3) {
        double d = latLng.latitude;
        double d2 = d - latLng3.latitude;
        double d3 = latLng.longitude;
        return ((d3 - latLng3.longitude) * (d - latLng2.latitude)) - ((d3 - latLng2.longitude) * d2);
    }

    private static boolean b(LatLng latLng, LatLng latLng2, LatLng latLng3) {
        double d = latLng.longitude;
        double d2 = latLng2.longitude;
        double d3 = d - d2;
        double d4 = d3 > 0.0d ? d : d2;
        if (d3 >= 0.0d) {
            d = d2;
        }
        double d5 = latLng.latitude;
        double d6 = latLng2.latitude;
        double d7 = d5 - d6;
        double d8 = d7 > 0.0d ? d5 : d6;
        if (d7 >= 0.0d) {
            d5 = d6;
        }
        double d9 = latLng3.longitude;
        if (d > d9 || d9 > d4) {
            return false;
        }
        double d10 = latLng3.latitude;
        return d5 <= d10 && d10 <= d8;
    }

    public static Drawable a(Context context, String str) throws Exception {
        int i;
        Bitmap bitmap;
        Bitmap bitmap2;
        InputStream d = m4.d(context, str);
        if (d == null) {
            bitmap2 = null;
        } else {
            Bitmap decodeStream = BitmapFactory.decodeStream(d);
            int width = decodeStream.getWidth();
            int height = decodeStream.getHeight();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            for (int i2 = 0; i2 < 32; i2++) {
                byteArrayOutputStream.write(0);
            }
            int i3 = width - 2;
            int[] iArr = new int[i3];
            decodeStream.getPixels(iArr, 0, width, 1, 0, i3, 1);
            boolean z = iArr[0] == -16777216;
            boolean z2 = iArr[width + (-3)] == -16777216;
            int i4 = 0;
            int i5 = 0;
            for (int i6 = 0; i6 < i3; i6++) {
                if (i4 != iArr[i6]) {
                    i5++;
                    a(byteArrayOutputStream, i6);
                    i4 = iArr[i6];
                }
            }
            if (z2) {
                i5++;
                a(byteArrayOutputStream, i3);
            }
            int i7 = i5 + 1;
            if (z) {
                i7 = i5;
            }
            if (z2) {
                i7--;
            }
            int i8 = i7;
            int i9 = height - 2;
            int[] iArr2 = new int[i9];
            int i10 = i5;
            decodeStream.getPixels(iArr2, 0, 1, 0, 1, 1, i9);
            boolean z3 = iArr2[0] == -16777216;
            boolean z4 = iArr2[height + (-3)] == -16777216;
            int i11 = 0;
            int i12 = 0;
            for (int i13 = 0; i13 < i9; i13++) {
                if (i11 != iArr2[i13]) {
                    i12++;
                    a(byteArrayOutputStream, i13);
                    i11 = iArr2[i13];
                }
            }
            if (z4) {
                i12++;
                a(byteArrayOutputStream, i9);
            }
            int i14 = i12 + 1;
            if (z3) {
                i14 = i12;
            }
            if (z4) {
                i14--;
            }
            int i15 = 0;
            while (true) {
                i = i8 * i14;
                if (i15 >= i) {
                    break;
                }
                a(byteArrayOutputStream, 1);
                i15++;
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArray[0] = 1;
            byteArray[1] = (byte) i10;
            byteArray[2] = (byte) i12;
            byteArray[3] = (byte) i;
            int width2 = decodeStream.getWidth();
            int i16 = width2 - 2;
            int[] iArr3 = new int[i16];
            decodeStream.getPixels(iArr3, 0, i16, 1, decodeStream.getHeight() - 1, i16, 1);
            int i17 = 0;
            while (true) {
                if (i17 >= i16) {
                    break;
                }
                if (-16777216 == iArr3[i17]) {
                    a(byteArray, 12, i17);
                    break;
                }
                i17++;
            }
            int i18 = width2 - 3;
            while (true) {
                if (i18 < 0) {
                    break;
                }
                if (-16777216 == iArr3[i18]) {
                    a(byteArray, 16, (i16 - i18) - 2);
                    break;
                }
                i18--;
            }
            int height2 = decodeStream.getHeight();
            int i19 = height2 - 2;
            int[] iArr4 = new int[i19];
            decodeStream.getPixels(iArr4, 0, 1, decodeStream.getWidth() - 1, 0, 1, i19);
            int i20 = 0;
            while (true) {
                if (i20 >= i19) {
                    break;
                }
                if (-16777216 == iArr4[i20]) {
                    a(byteArray, 20, i20);
                    break;
                }
                i20++;
            }
            int i21 = height2 - 3;
            while (true) {
                if (i21 < 0) {
                    break;
                }
                if (-16777216 == iArr4[i21]) {
                    a(byteArray, 24, (i19 - i21) - 2);
                    break;
                }
                i21--;
            }
            if (NinePatch.isNinePatchChunk(byteArray)) {
                bitmap = Bitmap.createBitmap(decodeStream, 1, 1, decodeStream.getWidth() - 2, decodeStream.getHeight() - 2);
                t4.a(decodeStream);
                if (Build.VERSION.SDK_INT >= 28) {
                    Method declaredMethod = bitmap.getClass().getDeclaredMethod("setNinePatchChunk", byte[].class);
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(bitmap, byteArray);
                } else {
                    Field declaredField = bitmap.getClass().getDeclaredField("mNinePatchChunk");
                    declaredField.setAccessible(true);
                    declaredField.set(bitmap, byteArray);
                }
            } else {
                bitmap = decodeStream;
            }
            d.close();
            bitmap2 = bitmap;
        }
        if (bitmap2.getNinePatchChunk() == null) {
            return new BitmapDrawable(context.getResources(), bitmap2);
        }
        Rect rect = new Rect();
        byte[] ninePatchChunk = bitmap2.getNinePatchChunk();
        rect.left = a(ninePatchChunk, 12);
        rect.right = a(ninePatchChunk, 16);
        rect.top = a(ninePatchChunk, 20);
        rect.bottom = a(ninePatchChunk, 24);
        return new NinePatchDrawable(context.getResources(), bitmap2, bitmap2.getNinePatchChunk(), rect, null);
    }

    public static void b(Context context, String str, String str2, Object obj) {
        if (context == null) {
            return;
        }
        SharedPreferences.Editor edit = context.getSharedPreferences(str, 0).edit();
        if (obj instanceof String) {
            edit.putString(str2, (String) obj);
        } else if (obj instanceof Integer) {
            edit.putInt(str2, ((Integer) obj).intValue());
        } else if (obj instanceof Boolean) {
            edit.putBoolean(str2, ((Boolean) obj).booleanValue());
        } else if (obj instanceof Float) {
            edit.putFloat(str2, ((Float) obj).floatValue());
        } else if (obj instanceof Long) {
            edit.putLong(str2, ((Long) obj).longValue());
        } else {
            edit.putString(str2, obj.toString());
        }
        edit.apply();
    }

    public static boolean a(LatLng latLng, LatLng latLng2, LatLng latLng3, LatLng latLng4) {
        double a2 = a(latLng3, latLng4, latLng);
        double a3 = a(latLng3, latLng4, latLng2);
        double a4 = a(latLng, latLng2, latLng3);
        double a5 = a(latLng, latLng2, latLng4);
        if (((a2 > 0.0d && a3 < 0.0d) || (a2 < 0.0d && a3 > 0.0d)) && ((a4 > 0.0d && a5 < 0.0d) || (a4 < 0.0d && a5 > 0.0d))) {
            return true;
        }
        if (a2 == 0.0d && b(latLng3, latLng4, latLng)) {
            return true;
        }
        if (a3 == 0.0d && b(latLng3, latLng4, latLng2)) {
            return true;
        }
        if (a4 == 0.0d && b(latLng, latLng2, latLng3)) {
            return true;
        }
        return a5 == 0.0d && b(latLng, latLng2, latLng4);
    }

    public static String a(Context context, String str, String str2, String str3) {
        Object a2 = a(context, str, str2, (Object) str3);
        return a2 != null ? (String) a2 : str3;
    }

    public static Long a(Context context, String str, String str2, Long l) {
        Object a2 = a(context, str, str2, (Object) l);
        return a2 != null ? (Long) a2 : l;
    }

    private static Object a(Context context, String str, String str2, Object obj) {
        if (context == null) {
            return null;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences(str, 0);
        if (obj instanceof String) {
            return sharedPreferences.getString(str2, (String) obj);
        }
        if (obj instanceof Integer) {
            return Integer.valueOf(sharedPreferences.getInt(str2, ((Integer) obj).intValue()));
        }
        if (obj instanceof Boolean) {
            return Boolean.valueOf(sharedPreferences.getBoolean(str2, ((Boolean) obj).booleanValue()));
        }
        if (obj instanceof Float) {
            return Float.valueOf(sharedPreferences.getFloat(str2, ((Float) obj).floatValue()));
        }
        if (obj instanceof Long) {
            return Long.valueOf(sharedPreferences.getLong(str2, ((Long) obj).longValue()));
        }
        return null;
    }

    private static void a(OutputStream outputStream, int i) throws IOException {
        outputStream.write(i & 255);
        outputStream.write((i >> 8) & 255);
        outputStream.write((i >> 16) & 255);
        outputStream.write((i >> 24) & 255);
    }

    private static void a(byte[] bArr, int i, int i2) {
        bArr[i] = (byte) i2;
        bArr[i + 1] = (byte) (i2 >> 8);
        bArr[i + 2] = (byte) (i2 >> 16);
        bArr[i + 3] = (byte) (i2 >> 24);
    }

    private static int a(byte[] bArr, int i) {
        byte b = bArr[i];
        byte b2 = bArr[i + 1];
        byte b3 = bArr[i + 2];
        return (bArr[i + 3] << 24) | (b & 255) | (b2 << 8) | (b3 << 16);
    }
}
