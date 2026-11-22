package io.nats.client.support;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes6.dex */
public abstract class Encoding {
    private static final String BASE32_CHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567";
    private static final int[] BASE32_LOOKUP;
    private static final int MASK = 31;
    private static final int SHIFT = 5;

    private Encoding() {
    }

    @Deprecated
    public static byte[] base64Encode(byte[] bArr) {
        return Base64.getUrlEncoder().withoutPadding().encode(bArr);
    }

    public static byte[] base64UrlEncode(byte[] bArr) {
        return Base64.getUrlEncoder().withoutPadding().encode(bArr);
    }

    public static String toBase64Url(byte[] bArr) {
        return new String(base64UrlEncode(bArr));
    }

    public static String toBase64Url(String str) {
        return new String(base64UrlEncode(str.getBytes(StandardCharsets.US_ASCII)));
    }

    public static byte[] base64UrlDecode(byte[] bArr) {
        return Base64.getUrlDecoder().decode(bArr);
    }

    public static String fromBase64Url(String str) {
        return new String(base64UrlDecode(str.getBytes(StandardCharsets.US_ASCII)));
    }

    public static char[] base32Encode(byte[] bArr) {
        int length = bArr.length;
        int i = 8;
        int i2 = ((length + 7) * 8) / 5;
        char[] cArr = new char[i2];
        int i3 = bArr[0];
        int i4 = 0;
        int i5 = 1;
        while (true) {
            if (i <= 0 && i5 >= length) {
                break;
            }
            if (i < 5) {
                if (i5 < length) {
                    i3 = (i3 << 8) | (bArr[i5] & 255);
                    i += 8;
                    i5++;
                } else {
                    int i6 = 5 - i;
                    i3 <<= i6;
                    i += i6;
                }
            }
            int i7 = (i3 >> (i - 5)) & 31;
            i -= 5;
            cArr[i4] = BASE32_CHARS.charAt(i7);
            i4++;
        }
        int i8 = i2 - 1;
        while (i8 >= 0 && cArr[i8] == 0) {
            i8--;
        }
        int i9 = i8 + 1;
        char[] cArr2 = new char[i9];
        System.arraycopy(cArr, 0, cArr2, 0, i9);
        Arrays.fill(cArr, (char) 0);
        return cArr2;
    }

    static {
        int[] iArr = new int[256];
        BASE32_LOOKUP = iArr;
        Arrays.fill(iArr, 255);
        for (int i = 0; i < BASE32_CHARS.length(); i++) {
            BASE32_LOOKUP[BASE32_CHARS.charAt(i) - '0'] = i;
        }
    }

    public static byte[] base32Decode(char[] cArr) {
        byte[] bArr = new byte[(cArr.length * 5) / 8];
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        for (char c : cArr) {
            int i4 = c - '0';
            if (i4 >= 0) {
                int[] iArr = BASE32_LOOKUP;
                if (i4 < iArr.length) {
                    i = (i << 5) | (iArr[i4] & 31);
                    int i5 = i2 + 5;
                    if (i5 >= 8) {
                        bArr[i3] = (byte) (i >> (i2 - 3));
                        i2 -= 3;
                        i3++;
                    } else {
                        i2 = i5;
                    }
                }
            }
        }
        return bArr;
    }

    public static String jsonDecode(String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(length);
        int i = 0;
        while (i < length) {
            char charAt = str.charAt(i);
            char c = AbstractJsonLexerKt.STRING_ESC;
            if (charAt == '\\') {
                charAt = i == length + (-1) ? '\\' : str.charAt(i + 1);
                if (charAt != '\\') {
                    if (charAt == 'b') {
                        charAt = '\b';
                    } else if (charAt == 'f') {
                        charAt = '\f';
                    } else if (charAt == 'n') {
                        charAt = '\n';
                    } else if (charAt == 'r') {
                        charAt = '\r';
                    } else if (charAt != 't') {
                        c = AbstractJsonLexerKt.UNICODE_ESC;
                        if (charAt == 'u') {
                            if (i < length - 5) {
                                StringBuilder append = new StringBuilder("").append(str.charAt(i + 2)).append(str.charAt(i + 3)).append(str.charAt(i + 4));
                                i += 5;
                                sb.append(Character.toChars(Integer.parseInt(append.append(str.charAt(i)).toString(), 16)));
                                i++;
                            }
                        }
                    } else {
                        charAt = '\t';
                    }
                    i++;
                }
                charAt = c;
                i++;
            }
            sb.append(charAt);
            i++;
        }
        return sb.toString();
    }

    public static String jsonEncode(String str) {
        return jsonEncode(new StringBuilder(), str).toString();
    }

    public static StringBuilder jsonEncode(StringBuilder sb, String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt != '\f') {
                if (charAt != '\r') {
                    if (charAt != '\"') {
                        if (charAt != '/') {
                            if (charAt == '\\') {
                                sb.append("\\\\");
                            } else {
                                switch (charAt) {
                                    case '\b':
                                        sb.append("\\b");
                                        break;
                                    case '\t':
                                        sb.append("\\t");
                                        break;
                                    case '\n':
                                        sb.append("\\n");
                                        break;
                                    default:
                                        if (charAt < ' ') {
                                            sb.append(String.format("\\u%04x", Integer.valueOf(charAt)));
                                            break;
                                        } else {
                                            sb.append(charAt);
                                            break;
                                        }
                                }
                            }
                        } else {
                            sb.append("\\/");
                        }
                    } else {
                        sb.append("\\\"");
                    }
                } else {
                    sb.append("\\r");
                }
            } else {
                sb.append("\\f");
            }
        }
        return sb;
    }

    public static String uriDecode(String str) {
        try {
            return URLDecoder.decode(str.replace("+", "%2B"), "UTF-8");
        } catch (UnsupportedEncodingException unused) {
            return str;
        }
    }
}
