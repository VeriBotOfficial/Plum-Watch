package com.wakeup.common.utils.binary;

/* loaded from: classes2.dex */
public class CharSequenceUtils {
    static boolean regionMatches(final CharSequence cs, final boolean ignoreCase, final int thisStart, final CharSequence substring, final int start, final int length) {
        if ((cs instanceof String) && (substring instanceof String)) {
            return ((String) cs).regionMatches(ignoreCase, thisStart, (String) substring, start, length);
        }
        while (true) {
            int i = length - 1;
            if (length <= 0) {
                return true;
            }
            int i2 = thisStart + 1;
            char charAt = cs.charAt(thisStart);
            int i3 = start + 1;
            char charAt2 = substring.charAt(start);
            if (charAt != charAt2) {
                if (!ignoreCase) {
                    return false;
                }
                if (Character.toUpperCase(charAt) != Character.toUpperCase(charAt2) && Character.toLowerCase(charAt) != Character.toLowerCase(charAt2)) {
                    return false;
                }
            }
            thisStart = i2;
            length = i;
            start = i3;
        }
    }
}
