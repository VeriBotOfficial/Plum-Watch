package com.wakeup.feature.health.util;

/* loaded from: classes3.dex */
public class NumberConvertUtil {
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00dd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String formatNum(java.lang.String r9, java.lang.Boolean r10) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            if (r0 == 0) goto L7
            goto L55
        L7:
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            r1 = 0
            if (r10 != 0) goto L13
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r1)
        L13:
            android.app.Application r2 = com.blankj.utilcode.util.Utils.getApp()
            int r3 = com.wakeup.commonui.R.string.fatigue_tip_05
            java.lang.String r2 = r2.getString(r3)
            android.app.Application r3 = com.blankj.utilcode.util.Utils.getApp()
            int r4 = com.wakeup.commonui.R.string.fatigue_tip_06
            java.lang.String r3 = r3.getString(r4)
            java.math.BigDecimal r4 = new java.math.BigDecimal
            java.lang.String r5 = "1000"
            r4.<init>(r5)
            java.math.BigDecimal r5 = new java.math.BigDecimal
            java.lang.String r6 = "10000"
            r5.<init>(r6)
            java.math.BigDecimal r6 = new java.math.BigDecimal
            java.lang.String r7 = "100000000"
            r6.<init>(r7)
            java.math.BigDecimal r7 = new java.math.BigDecimal
            r7.<init>(r9)
            boolean r10 = r10.booleanValue()
            r8 = 1
            if (r10 == 0) goto L59
            int r10 = r7.compareTo(r4)
            if (r10 == 0) goto L56
            int r10 = r7.compareTo(r4)
            if (r10 != r8) goto L55
            goto L56
        L55:
            return r9
        L56:
            java.lang.String r9 = "999+"
            return r9
        L59:
            int r9 = r7.compareTo(r5)
            r10 = -1
            java.lang.String r4 = ""
            if (r9 != r10) goto L66
            r0.append(r7)
            goto L8e
        L66:
            int r9 = r7.compareTo(r5)
            if (r9 != 0) goto L72
            int r9 = r7.compareTo(r5)
            if (r9 == r8) goto L78
        L72:
            int r9 = r7.compareTo(r6)
            if (r9 != r10) goto L81
        L78:
            java.math.BigDecimal r9 = r7.divide(r5)
            java.lang.String r9 = r9.toString()
            goto L9a
        L81:
            int r9 = r7.compareTo(r6)
            if (r9 == 0) goto L91
            int r9 = r7.compareTo(r6)
            if (r9 != r8) goto L8e
            goto L91
        L8e:
            r9 = r4
            r2 = r9
            goto L9a
        L91:
            java.math.BigDecimal r9 = r7.divide(r6)
            java.lang.String r9 = r9.toString()
            r2 = r3
        L9a:
            boolean r3 = r4.equals(r9)
            java.lang.String r4 = "0"
            if (r3 != 0) goto Ld7
            java.lang.String r3 = "."
            int r3 = r9.indexOf(r3)
            if (r3 != r10) goto Lb2
            java.lang.StringBuffer r9 = r0.append(r9)
            r9.append(r2)
            goto Ld7
        Lb2:
            int r10 = r3 + 1
            int r5 = r3 + 2
            java.lang.String r10 = r9.substring(r10, r5)
            boolean r10 = r10.equals(r4)
            if (r10 != 0) goto Lcc
            java.lang.String r9 = r9.substring(r1, r5)
            java.lang.StringBuffer r9 = r0.append(r9)
            r9.append(r2)
            goto Ld7
        Lcc:
            java.lang.String r9 = r9.substring(r1, r3)
            java.lang.StringBuffer r9 = r0.append(r9)
            r9.append(r2)
        Ld7:
            int r9 = r0.length()
            if (r9 != 0) goto Lde
            return r4
        Lde:
            java.lang.String r9 = r0.toString()
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.wakeup.feature.health.util.NumberConvertUtil.formatNum(java.lang.String, java.lang.Boolean):java.lang.String");
    }
}
