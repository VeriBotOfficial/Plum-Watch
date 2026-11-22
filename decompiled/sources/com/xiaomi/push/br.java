package com.xiaomi.push;

import android.content.Context;
import android.text.TextUtils;

/* loaded from: classes4.dex */
public class br extends bt {
    public br(String str, String str2, String[] strArr, String str3) {
        super(str, str2, strArr, str3);
    }

    public static br a(Context context, String str, int i) {
        com.xiaomi.channel.commonutils.logger.b.b("delete  messages when db size is too bigger");
        String m11925a = bx.a(context).m11925a(str);
        if (TextUtils.isEmpty(m11925a)) {
            return null;
        }
        StringBuilder sb = new StringBuilder("rowDataId in (select ");
        sb.append("rowDataId from " + m11925a);
        sb.append(" order by createTimeStamp asc limit ?)");
        return new br(str, sb.toString(), new String[]{String.valueOf(i)}, "a job build to delete history message");
    }

    private void a(long j) {
        if (this.f259a == null || this.f259a.length <= 0) {
            return;
        }
        this.f259a[0] = String.valueOf(j);
    }

    @Override // com.xiaomi.push.bx.a
    public void a(Context context, Object obj) {
        if (obj instanceof Long) {
            long longValue = ((Long) obj).longValue();
            long a2 = cb.a(a());
            long j = bp.f241a;
            if (a2 > j) {
                long j2 = (long) ((((a2 - j) * 1.2d) / j) * longValue);
                a(j2);
                bo.a(context).a("begin delete " + j2 + "noUpload messages , because db size is " + a2 + "B");
                super.a(context, obj);
                return;
            }
            com.xiaomi.channel.commonutils.logger.b.b("db size is suitable");
        }
    }
}
