package com.anythink.basead.webtemplet;

import android.net.Uri;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes11.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public static final String f3475a = "atwt:";
    private static final String[] b = {f3475a};
    private static final Pattern c = Pattern.compile("atwt://(.+?)#(.+?)/(.+?)(\\?(.*?))?");
    private static Map<String, String> d = new HashMap();

    static {
        for (com.anythink.core.express.d.c cVar : com.anythink.core.express.d.c.values()) {
            d.put(cVar.a(), cVar.b());
        }
    }

    public static boolean a(String str) {
        for (String str2 : b) {
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static Pattern b(String str) {
        if (f3475a.equals(str)) {
            return c;
        }
        return null;
    }

    private static String g(String str) {
        char[] cArr = {'\'', AbstractJsonLexerKt.STRING_ESC};
        StringBuffer stringBuffer = new StringBuffer(1000);
        stringBuffer.setLength(0);
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt <= 255) {
                int i2 = 0;
                while (true) {
                    if (i2 < 2) {
                        if (cArr[i2] == charAt) {
                            stringBuffer.append("\\".concat(String.valueOf(charAt)));
                            break;
                        }
                        i2++;
                    } else {
                        stringBuffer.append(charAt);
                        break;
                    }
                }
            } else {
                stringBuffer.append("\\u");
                String upperCase = Integer.toHexString(charAt >>> '\b').toUpperCase();
                if (upperCase.length() == 1) {
                    stringBuffer.append("0");
                }
                stringBuffer.append(upperCase);
                String upperCase2 = Integer.toHexString(charAt & 255).toUpperCase();
                if (upperCase2.length() == 1) {
                    stringBuffer.append("0");
                }
                stringBuffer.append(upperCase2);
            }
        }
        return new String(stringBuffer);
    }

    public static boolean c(String str) {
        return d(str).startsWith("image");
    }

    public static String d(String str) {
        String str2 = d.get(h(str));
        return str2 == null ? "" : str2;
    }

    private static String h(String str) {
        String path;
        int lastIndexOf;
        return (TextUtils.isEmpty(str) || (path = Uri.parse(str).getPath()) == null || (lastIndexOf = path.lastIndexOf(".")) == -1) ? "" : path.substring(lastIndexOf + 1);
    }

    public static String e(String str) {
        return TextUtils.isEmpty(str) ? str : com.anythink.core.common.v.k.a(str);
    }

    public static String f(String str) {
        return TextUtils.isEmpty(str) ? str : com.anythink.core.common.v.k.b(str);
    }
}
