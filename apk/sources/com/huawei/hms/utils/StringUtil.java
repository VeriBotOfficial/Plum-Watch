package com.huawei.hms.utils;

import com.huawei.hms.framework.common.ExceptionCode;
import java.util.regex.Pattern;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes11.dex */
public class StringUtil {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Pattern f10776a = Pattern.compile("(^([0-9]{1,2}\\.){2}[0-9]{1,2}$)|(^([0-9]{1,2}\\.){3}[0-9]{1,3}$)");

    private StringUtil() {
    }

    public static String addByteForNum(String str, int r3, char c) {
        int length = str.length();
        if (length == r3) {
            return str;
        }
        if (length > r3) {
            return str.substring(length - r3);
        }
        StringBuffer stringBuffer = new StringBuffer();
        while (length < r3) {
            stringBuffer.append(c);
            length++;
        }
        stringBuffer.append(str);
        return stringBuffer.toString();
    }

    public static boolean checkVersion(String str) {
        return f10776a.matcher(str).find();
    }

    public static int convertVersion2Integer(String str) {
        if (!checkVersion(str)) {
            return 0;
        }
        String[] strArrSplit = str.split("\\.");
        if (strArrSplit.length < 3) {
            return 0;
        }
        int r0 = (Integer.parseInt(strArrSplit[0]) * ExceptionCode.CRASH_EXCEPTION) + (Integer.parseInt(strArrSplit[1]) * 100000) + (Integer.parseInt(strArrSplit[2]) * 1000);
        return strArrSplit.length == 4 ? r0 + Integer.parseInt(strArrSplit[3]) : r0;
    }

    public static String objDesc(Object obj) {
        return obj == null ? AbstractJsonLexerKt.NULL : obj.getClass().getName() + '@' + Integer.toHexString(obj.hashCode());
    }
}
