package com.tramini.plugin.a.h;

import android.text.TextUtils;
import com.beken.iot.smartsdk.core.pack.TransmissionUnpacked;
import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.bouncycastle.pqc.math.linearalgebra.Matrix;
import org.json.JSONObject;
import org.tensorflow.lite.schema.BuiltinOptions;

/* loaded from: classes2.dex */
public class c {
    private static final String b = "c";
    private static char[] e = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', Matrix.MATRIX_TYPE_RANDOM_LT, 'M', 'N', 'O', 'P', 'Q', Matrix.MATRIX_TYPE_RANDOM_REGULAR, 'S', 'T', Matrix.MATRIX_TYPE_RANDOM_UT, 'V', 'W', 'X', 'Y', Matrix.MATRIX_TYPE_ZERO, 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', AbstractJsonLexerKt.UNICODE_ESC, 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/'};
    private static byte[] f = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, BuiltinOptions.LogicalAndOptions, -1, -1, -1, 63, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.EqualOptions, BuiltinOptions.NotEqualOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.PowOptions, BuiltinOptions.ArgMinOptions, 58, BuiltinOptions.PackOptions, BuiltinOptions.LogicalOrOptions, 61, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, 32, BuiltinOptions.ExpOptions, 34, 35, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.CastOptions, BuiltinOptions.DequantizeOptions, BuiltinOptions.MaximumMinimumOptions, BuiltinOptions.ArgMaxOptions, BuiltinOptions.LessOptions, BuiltinOptions.NegOptions, BuiltinOptions.PadV2Options, BuiltinOptions.GreaterOptions, BuiltinOptions.GreaterEqualOptions, BuiltinOptions.LessEqualOptions, BuiltinOptions.SelectOptions, BuiltinOptions.SliceOptions, BuiltinOptions.TransposeConvOptions, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.TileOptions, -1, -1, -1, -1, -1};

    /* renamed from: a, reason: collision with root package name */
    public static String f13747a = "";
    private static String g = "";
    private static Map<Character, Character> d = new HashMap();
    private static Map<Character, Character> c = new HashMap();

    private c() {
    }

    public static String a(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer();
        int length = bArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            int i2 = i + 1;
            byte b2 = bArr[i];
            int i3 = b2 & 255;
            if (i2 == length) {
                stringBuffer.append(e[i3 >>> 2]);
                stringBuffer.append(e[(b2 & 3) << 4]);
                stringBuffer.append("==");
                break;
            }
            int i4 = i + 2;
            byte b3 = bArr[i2];
            if (i4 == length) {
                stringBuffer.append(e[i3 >>> 2]);
                stringBuffer.append(e[((b2 & 3) << 4) | ((b3 & TransmissionUnpacked.HD_VAL_MAGIC_HB) >>> 4)]);
                stringBuffer.append(e[(b3 & 15) << 2]);
                stringBuffer.append("=");
                break;
            }
            i += 3;
            byte b4 = bArr[i4];
            stringBuffer.append(e[i3 >>> 2]);
            stringBuffer.append(e[((b2 & 3) << 4) | ((b3 & TransmissionUnpacked.HD_VAL_MAGIC_HB) >>> 4)]);
            stringBuffer.append(e[((b3 & 15) << 2) | ((b4 & 192) >>> 6)]);
            stringBuffer.append(e[b4 & 63]);
        }
        return stringBuffer.toString();
    }

    private static byte[] d(String str) {
        int i;
        byte b2;
        int i2;
        byte b3;
        int i3;
        byte b4;
        int i4;
        byte b5;
        byte[] bytes = str.getBytes();
        int length = bytes.length;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(length);
        int i5 = 0;
        while (i5 < length) {
            while (true) {
                i = i5 + 1;
                b2 = f[bytes[i5]];
                if (i >= length || b2 != -1) {
                    break;
                }
                i5 = i;
            }
            if (b2 == -1) {
                break;
            }
            while (true) {
                i2 = i + 1;
                b3 = f[bytes[i]];
                if (i2 >= length || b3 != -1) {
                    break;
                }
                i = i2;
            }
            if (b3 == -1) {
                break;
            }
            byteArrayOutputStream.write((b2 << 2) | ((b3 & BuiltinOptions.SliceOptions) >>> 4));
            while (true) {
                i3 = i2 + 1;
                byte b6 = bytes[i2];
                if (b6 == 61) {
                    return byteArrayOutputStream.toByteArray();
                }
                b4 = f[b6];
                if (i3 >= length || b4 != -1) {
                    break;
                }
                i2 = i3;
            }
            if (b4 == -1) {
                break;
            }
            byteArrayOutputStream.write(((b3 & 15) << 4) | ((b4 & BuiltinOptions.LogicalOrOptions) >>> 2));
            while (true) {
                i4 = i3 + 1;
                byte b7 = bytes[i3];
                if (b7 == 61) {
                    return byteArrayOutputStream.toByteArray();
                }
                b5 = f[b7];
                if (i4 >= length || b5 != -1) {
                    break;
                }
                i3 = i4;
            }
            if (b5 == -1) {
                break;
            }
            byteArrayOutputStream.write(b5 | ((b4 & 3) << 6));
            i5 = i4;
        }
        return byteArrayOutputStream.toByteArray();
    }

    private static Character a(char c2) {
        if (d == null) {
            d = new HashMap();
            for (int i = 0; i < f13747a.length(); i++) {
                d.put(Character.valueOf(g.charAt(i)), Character.valueOf(f13747a.charAt(i)));
            }
        }
        if (d.containsKey(Character.valueOf(c2))) {
            return d.get(Character.valueOf(c2));
        }
        return Character.valueOf(c2);
    }

    private static Character b(char c2) {
        if (c == null) {
            c = new HashMap();
            for (int i = 0; i < f13747a.length(); i++) {
                c.put(Character.valueOf(f13747a.charAt(i)), Character.valueOf(g.charAt(i)));
            }
        }
        if (c.containsKey(Character.valueOf(c2))) {
            return c.get(Character.valueOf(c2));
        }
        return Character.valueOf(c2);
    }

    public static String a(String str) {
        Character valueOf;
        String str2 = "";
        try {
            if (TextUtils.isEmpty(str)) {
                return "";
            }
            char[] charArray = str.toCharArray();
            if (charArray != null && charArray.length > 0) {
                char[] cArr = new char[charArray.length];
                for (int i = 0; i < charArray.length; i++) {
                    char c2 = charArray[i];
                    if (d == null) {
                        d = new HashMap();
                        for (int i2 = 0; i2 < f13747a.length(); i2++) {
                            d.put(Character.valueOf(g.charAt(i2)), Character.valueOf(f13747a.charAt(i2)));
                        }
                    }
                    if (d.containsKey(Character.valueOf(c2))) {
                        valueOf = d.get(Character.valueOf(c2));
                    } else {
                        valueOf = Character.valueOf(c2);
                    }
                    cArr[i] = valueOf.charValue();
                }
                str2 = new String(cArr);
            }
            return new String(d(str2));
        } catch (Exception e2) {
            e2.printStackTrace();
            return str2;
        }
    }

    public static String b(String str) {
        char[] charArray;
        Character valueOf;
        try {
            if (!TextUtils.isEmpty(str) && (charArray = a(str.getBytes()).toCharArray()) != null && charArray.length > 0) {
                char[] cArr = new char[charArray.length];
                for (int i = 0; i < charArray.length; i++) {
                    char c2 = charArray[i];
                    if (c == null) {
                        c = new HashMap();
                        for (int i2 = 0; i2 < f13747a.length(); i2++) {
                            c.put(Character.valueOf(f13747a.charAt(i2)), Character.valueOf(g.charAt(i2)));
                        }
                    }
                    if (c.containsKey(Character.valueOf(c2))) {
                        valueOf = c.get(Character.valueOf(c2));
                    } else {
                        valueOf = Character.valueOf(c2);
                    }
                    cArr[i] = valueOf.charValue();
                }
                return new String(cArr);
            }
            return "";
        } catch (Exception e2) {
            e2.printStackTrace();
            return "";
        }
    }

    public static void c(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("k");
            String optString2 = jSONObject.optString("v");
            if (TextUtils.isEmpty(optString) || TextUtils.isEmpty(optString2)) {
                return;
            }
            f13747a = optString;
            g = optString2;
            for (int i = 0; i < f13747a.length(); i++) {
                d.put(Character.valueOf(g.charAt(i)), Character.valueOf(f13747a.charAt(i)));
            }
            for (int i2 = 0; i2 < f13747a.length(); i2++) {
                c.put(Character.valueOf(f13747a.charAt(i2)), Character.valueOf(g.charAt(i2)));
            }
        } catch (Throwable unused) {
        }
    }
}
