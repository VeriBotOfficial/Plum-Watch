package com.anythink.core.common.v;

import android.text.TextUtils;
import com.beken.iot.smartsdk.core.pack.TransmissionUnpacked;
import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.bouncycastle.pqc.math.linearalgebra.Matrix;
import org.tensorflow.lite.schema.BuiltinOptions;

/* loaded from: classes12.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    public static final String f4415a = "czZQYTNDVjhJUWZMTmNPWUR4aWVXKzFuRzRGRW1iNS8yTVhKd2g3UlNvenZyQXFCWlVqOXlIbGcwa3VwS2R0VA==";
    public static final String c = "+3MtanYVQs8GK7W/rSpiz9FCBUEDdbqxmhgcIRH4loTvuZw20XfO51JPN6jeLkyA";
    private static final String d = "k";
    private static final String g = "ZE1XbmhiZXlLcjBKSXZMTk94M0JGa0V1bWw5Mlk1ZmpTcUdUN1I4cFpWY2lQSEFzdEM0VVhhNlFEdzFnb3orLw==";
    private static final char[] e = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', Matrix.MATRIX_TYPE_RANDOM_LT, 'M', 'N', 'O', 'P', 'Q', Matrix.MATRIX_TYPE_RANDOM_REGULAR, 'S', 'T', Matrix.MATRIX_TYPE_RANDOM_UT, 'V', 'W', 'X', 'Y', Matrix.MATRIX_TYPE_ZERO, 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', AbstractJsonLexerKt.UNICODE_ESC, 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/'};
    private static final byte[] f = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, BuiltinOptions.LogicalAndOptions, -1, -1, -1, 63, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.EqualOptions, BuiltinOptions.NotEqualOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.PowOptions, BuiltinOptions.ArgMinOptions, 58, BuiltinOptions.PackOptions, BuiltinOptions.LogicalOrOptions, 61, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, 32, BuiltinOptions.ExpOptions, 34, 35, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.CastOptions, BuiltinOptions.DequantizeOptions, BuiltinOptions.MaximumMinimumOptions, BuiltinOptions.ArgMaxOptions, BuiltinOptions.LessOptions, BuiltinOptions.NegOptions, BuiltinOptions.PadV2Options, BuiltinOptions.GreaterOptions, BuiltinOptions.GreaterEqualOptions, BuiltinOptions.LessEqualOptions, BuiltinOptions.SelectOptions, BuiltinOptions.SliceOptions, BuiltinOptions.TransposeConvOptions, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.TileOptions, -1, -1, -1, -1, -1};
    private static String h = "";
    static HashMap<String, HashMap<Character, Character>> b = new HashMap<>();
    private static Map<Character, Character> i = null;
    private static String j = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/";

    private k() {
    }

    public static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return a(str.getBytes());
    }

    public static String b(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return new String(e(str));
    }

    public static String a(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer();
        int length = bArr.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                break;
            }
            int i3 = i2 + 1;
            byte b2 = bArr[i2];
            int i4 = b2 & 255;
            if (i3 == length) {
                char[] cArr = e;
                stringBuffer.append(cArr[i4 >>> 2]);
                stringBuffer.append(cArr[(b2 & 3) << 4]);
                stringBuffer.append("==");
                break;
            }
            int i5 = i2 + 2;
            byte b3 = bArr[i3];
            if (i5 == length) {
                char[] cArr2 = e;
                stringBuffer.append(cArr2[i4 >>> 2]);
                stringBuffer.append(cArr2[((b2 & 3) << 4) | ((b3 & TransmissionUnpacked.HD_VAL_MAGIC_HB) >>> 4)]);
                stringBuffer.append(cArr2[(b3 & 15) << 2]);
                stringBuffer.append("=");
                break;
            }
            i2 += 3;
            byte b4 = bArr[i5];
            char[] cArr3 = e;
            stringBuffer.append(cArr3[i4 >>> 2]);
            stringBuffer.append(cArr3[((b2 & 3) << 4) | ((b3 & TransmissionUnpacked.HD_VAL_MAGIC_HB) >>> 4)]);
            stringBuffer.append(cArr3[((b3 & 15) << 2) | ((b4 & 192) >>> 6)]);
            stringBuffer.append(cArr3[b4 & 63]);
        }
        return stringBuffer.toString();
    }

    private static byte[] e(String str) {
        int i2;
        byte b2;
        int i3;
        byte b3;
        int i4;
        byte b4;
        int i5;
        byte b5;
        byte[] bytes = str.getBytes();
        int length = bytes.length;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(length);
        int i6 = 0;
        while (i6 < length) {
            while (true) {
                i2 = i6 + 1;
                b2 = f[bytes[i6]];
                if (i2 >= length || b2 != -1) {
                    break;
                }
                i6 = i2;
            }
            if (b2 == -1) {
                break;
            }
            while (true) {
                i3 = i2 + 1;
                b3 = f[bytes[i2]];
                if (i3 >= length || b3 != -1) {
                    break;
                }
                i2 = i3;
            }
            if (b3 == -1) {
                break;
            }
            byteArrayOutputStream.write((b2 << 2) | ((b3 & BuiltinOptions.SliceOptions) >>> 4));
            while (true) {
                i4 = i3 + 1;
                byte b6 = bytes[i3];
                if (b6 == 61) {
                    return byteArrayOutputStream.toByteArray();
                }
                b4 = f[b6];
                if (i4 >= length || b4 != -1) {
                    break;
                }
                i3 = i4;
            }
            if (b4 == -1) {
                break;
            }
            byteArrayOutputStream.write(((b3 & 15) << 4) | ((b4 & BuiltinOptions.LogicalOrOptions) >>> 2));
            while (true) {
                i5 = i4 + 1;
                byte b7 = bytes[i4];
                if (b7 == 61) {
                    return byteArrayOutputStream.toByteArray();
                }
                b5 = f[b7];
                if (i5 >= length || b5 != -1) {
                    break;
                }
                i4 = i5;
            }
            if (b5 == -1) {
                break;
            }
            byteArrayOutputStream.write(b5 | ((b4 & 3) << 6));
            i6 = i5;
        }
        return byteArrayOutputStream.toByteArray();
    }

    private static synchronized Character a(char c2, String str) {
        synchronized (k.class) {
            if (TextUtils.isEmpty(str)) {
                if (TextUtils.isEmpty(h)) {
                    h = b(g);
                }
                str = h;
            }
            HashMap<Character, Character> hashMap = b.get(str);
            if (hashMap == null) {
                hashMap = new HashMap<>();
                if (str.length() >= e.length) {
                    int i2 = 0;
                    while (true) {
                        char[] cArr = e;
                        if (i2 >= cArr.length) {
                            break;
                        }
                        hashMap.put(Character.valueOf(str.charAt(i2)), Character.valueOf(cArr[i2]));
                        i2++;
                    }
                    b.put(str, hashMap);
                }
            }
            if (hashMap.containsKey(Character.valueOf(c2))) {
                return hashMap.get(Character.valueOf(c2));
            }
            return Character.valueOf(c2);
        }
    }

    public static String c(String str) {
        return a(str, (String) null);
    }

    public static String a(String str, String str2) {
        String str3 = "";
        try {
            if (!TextUtils.isEmpty(str)) {
                char[] charArray = str.toCharArray();
                if (charArray != null && charArray.length > 0) {
                    char[] cArr = new char[charArray.length];
                    for (int i2 = 0; i2 < charArray.length; i2++) {
                        cArr[i2] = a(charArray[i2], str2).charValue();
                    }
                    str3 = new String(cArr);
                }
                return new String(e(str3));
            }
        } catch (Exception unused) {
        }
        return str3;
    }

    public static String d(String str) {
        char[] charArray;
        Character valueOf;
        try {
            if (!TextUtils.isEmpty(str) && (charArray = a(str.getBytes()).toCharArray()) != null && charArray.length > 0) {
                char[] cArr = new char[charArray.length];
                for (int i2 = 0; i2 < charArray.length; i2++) {
                    char c2 = charArray[i2];
                    if (i == null) {
                        i = new HashMap();
                        for (int i3 = 0; i3 < j.length(); i3++) {
                            i.put(Character.valueOf(j.charAt(i3)), Character.valueOf(c.charAt(i3)));
                        }
                    }
                    if (i.containsKey(Character.valueOf(c2))) {
                        valueOf = i.get(Character.valueOf(c2));
                    } else {
                        valueOf = Character.valueOf(c2);
                    }
                    cArr[i2] = valueOf.charValue();
                }
                return new String(cArr);
            }
            return "";
        } catch (Exception e2) {
            e2.printStackTrace();
            return "";
        }
    }

    private static Character a(char c2) {
        if (i == null) {
            i = new HashMap();
            for (int i2 = 0; i2 < j.length(); i2++) {
                i.put(Character.valueOf(j.charAt(i2)), Character.valueOf(c.charAt(i2)));
            }
        }
        if (i.containsKey(Character.valueOf(c2))) {
            return i.get(Character.valueOf(c2));
        }
        return Character.valueOf(c2);
    }
}
