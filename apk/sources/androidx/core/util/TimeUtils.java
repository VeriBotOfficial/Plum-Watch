package androidx.core.util;

import com.baidu.mapapi.http.HttpClient;
import java.io.PrintWriter;

/* JADX INFO: loaded from: classes8.dex */
public final class TimeUtils {
    public static final int HUNDRED_DAY_FIELD_LEN = 19;
    private static final int SECONDS_PER_DAY = 86400;
    private static final int SECONDS_PER_HOUR = 3600;
    private static final int SECONDS_PER_MINUTE = 60;
    private static final Object sFormatSync = new Object();
    private static char[] sFormatStr = new char[24];

    private static int accumField(int r2, int r3, boolean z, int r5) {
        if (r2 > 99 || (z && r5 >= 3)) {
            return r3 + 3;
        }
        if (r2 > 9 || (z && r5 >= 2)) {
            return r3 + 2;
        }
        if (z || r2 > 0) {
            return r3 + 1;
        }
        return 0;
    }

    private static int printField(char[] cArr, int r3, char c, int r5, boolean z, int r7) {
        int r1;
        if (!z && r3 <= 0) {
            return r5;
        }
        if ((!z || r7 < 3) && r3 <= 99) {
            r1 = r5;
        } else {
            int r0 = r3 / 100;
            cArr[r5] = (char) (r0 + 48);
            r1 = r5 + 1;
            r3 -= r0 * 100;
        }
        if ((z && r7 >= 2) || r3 > 9 || r5 != r1) {
            int r6 = r3 / 10;
            cArr[r1] = (char) (r6 + 48);
            r1++;
            r3 -= r6 * 10;
        }
        cArr[r1] = (char) (r3 + 48);
        cArr[r1 + 1] = c;
        return r1 + 2;
    }

    private static int formatDurationLocked(long j, int r19) {
        char c;
        int r6;
        int r1;
        int r13;
        int r0;
        int r8;
        long j2 = j;
        if (sFormatStr.length < r19) {
            sFormatStr = new char[r19];
        }
        char[] cArr = sFormatStr;
        if (j2 == 0) {
            int r2 = r19 - 1;
            while (r2 > 0) {
                cArr[0] = ' ';
            }
            cArr[0] = '0';
            return 1;
        }
        if (j2 > 0) {
            c = '+';
        } else {
            j2 = -j2;
            c = '-';
        }
        int r12 = (int) (j2 % 1000);
        int r3 = (int) Math.floor(j2 / 1000);
        if (r3 > 86400) {
            r6 = r3 / 86400;
            r3 -= 86400 * r6;
        } else {
            r6 = 0;
        }
        if (r3 > 3600) {
            r1 = r3 / 3600;
            r3 -= r1 * 3600;
        } else {
            r1 = 0;
        }
        if (r3 > 60) {
            int r7 = r3 / 60;
            r13 = r3 - (r7 * 60);
            r0 = r7;
        } else {
            r13 = r3;
            r0 = 0;
        }
        if (r19 != 0) {
            int r9 = accumField(r6, 1, false, 0);
            int r10 = r9 + accumField(r1, 1, r9 > 0, 2);
            int r11 = r10 + accumField(r0, 1, r10 > 0, 2);
            int r14 = r11 + accumField(r13, 1, r11 > 0, 2);
            r8 = 0;
            for (int r15 = r14 + accumField(r12, 2, true, r14 > 0 ? 3 : 0) + 1; r15 < r19; r15++) {
                cArr[r8] = ' ';
                r8++;
            }
        } else {
            r8 = 0;
        }
        cArr[r8] = c;
        int r16 = r8 + 1;
        boolean z = r19 != 0;
        int r17 = printField(cArr, r6, 'd', r16, false, 0);
        int r18 = printField(cArr, r1, 'h', r17, r17 != r16, z ? 2 : 0);
        int r20 = printField(cArr, r0, 'm', r18, r18 != r16, z ? 2 : 0);
        int r21 = printField(cArr, r13, 's', r20, r20 != r16, z ? 2 : 0);
        int r4 = printField(cArr, r12, 'm', r21, true, (!z || r21 == r16) ? 0 : 3);
        cArr[r4] = 's';
        return r4 + 1;
    }

    public static void formatDuration(long j, StringBuilder sb) {
        synchronized (sFormatSync) {
            sb.append(sFormatStr, 0, formatDurationLocked(j, 0));
        }
    }

    public static void formatDuration(long j, PrintWriter printWriter, int r5) {
        synchronized (sFormatSync) {
            printWriter.print(new String(sFormatStr, 0, formatDurationLocked(j, r5)));
        }
    }

    public static void formatDuration(long j, PrintWriter printWriter) {
        formatDuration(j, printWriter, 0);
    }

    public static void formatDuration(long j, long j2, PrintWriter printWriter) {
        if (j == 0) {
            printWriter.print(HttpClient.ENDFLAG);
        } else {
            formatDuration(j - j2, printWriter, 0);
        }
    }

    private TimeUtils() {
    }
}
