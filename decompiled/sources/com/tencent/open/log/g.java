package com.tencent.open.log;

import android.gov.nist.javax.sip.parser.TokenNames;
import android.text.format.Time;
import android.util.Log;
import androidx.exifinterface.media.ExifInterface;
import com.baidu.ar.util.SystemInfoUtil;
import com.xiaomi.mipush.sdk.Constants;
import com.yandex.div2.PhoneMasks;

/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final g f13659a = new g();

    public final String a(int i) {
        if (i == 1) {
            return "V";
        }
        if (i == 2) {
            return "D";
        }
        if (i == 4) {
            return TokenNames.I;
        }
        if (i == 8) {
            return ExifInterface.LONGITUDE_WEST;
        }
        if (i == 16) {
            return "E";
        }
        if (i == 32) {
            return ExifInterface.GPS_MEASUREMENT_IN_PROGRESS;
        }
        return Constants.ACCEPT_TIME_SEPARATOR_SERVER;
    }

    public String a(int i, Thread thread, long j, String str, String str2, Throwable th) {
        long j2 = j % 1000;
        Time time = new Time();
        time.set(j);
        StringBuilder sb = new StringBuilder();
        sb.append(a(i)).append('/').append(time.format("%Y-%m-%d %H:%M:%S")).append('.');
        if (j2 < 10) {
            sb.append(PhoneMasks.EXTRA_NUMBERS);
        } else if (j2 < 100) {
            sb.append('0');
        }
        sb.append(j2).append(" [");
        if (thread == null) {
            sb.append(SystemInfoUtil.NA);
        } else {
            sb.append(thread.getName());
        }
        sb.append("][").append(str).append("] ").append(str2).append('\n');
        if (th != null) {
            sb.append("* Exception : \n").append(Log.getStackTraceString(th)).append('\n');
        }
        return sb.toString();
    }
}
