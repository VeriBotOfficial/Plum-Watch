package com.qumeng.overseas.advlib.__remote__.core.proto.utils;

import android.content.Context;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import androidx.core.app.ActivityCompat;
import com.hjq.permissions.Permission;

/* loaded from: classes17.dex */
public class y {

    /* renamed from: a, reason: collision with root package name */
    public static final int f12868a = 1;
    public static final int b = 2;
    public static final int c = 3;
    public static final int d = 4;
    public static final int e = 5;

    public static String a(Context context) {
        return ActivityCompat.checkSelfPermission(context, Permission.READ_PHONE_NUMBERS) != 0 ? "" : ((TelephonyManager) context.getSystemService("phone")).getLine1Number();
    }

    public static int b(Context context) {
        try {
            String simOperator = ((TelephonyManager) context.getSystemService("phone")).getSimOperator();
            if (TextUtils.isEmpty(simOperator)) {
                return 5;
            }
            if (!simOperator.equals("46000") && !simOperator.equals("46002") && !simOperator.equals("46004") && !simOperator.equals("46007")) {
                if (!simOperator.equals("46001") && !simOperator.equals("46006") && !simOperator.equals("46009")) {
                    if (simOperator.equals("46003") || simOperator.equals("46005")) {
                        return 3;
                    }
                    return simOperator.equals("46011") ? 3 : 4;
                }
                return 2;
            }
            return 1;
        } catch (Exception e2) {
            e2.printStackTrace();
            com.qumeng.overseas.advlib.__remote__.utils.bugman.a.a(y.class, "exp_ICliUtils_getSimOperators", String.valueOf(e2.getMessage()), (Throwable) e2);
            return 5;
        }
    }
}
