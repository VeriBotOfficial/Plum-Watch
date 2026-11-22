package com.amap.api.col.p0003sl;

import android.content.Context;
import android.text.TextUtils;
import com.amap.api.services.core.AMapException;
import java.io.ByteArrayOutputStream;

/* compiled from: StatisticsEntity.java */
/* loaded from: classes11.dex */
public class yb {

    /* renamed from: a, reason: collision with root package name */
    private Context f1987a;
    private String b;
    private String c;
    private String d;
    private String e;

    public yb(Context context, String str, String str2, String str3) throws y8 {
        if (TextUtils.isEmpty(str3) || str3.length() > 256) {
            throw new y8(AMapException.AMAP_CLIENT_INVALID_PARAMETER);
        }
        this.f1987a = context.getApplicationContext();
        this.c = str;
        this.d = str2;
        this.b = str3;
    }

    public void a(String str) throws y8 {
        if (TextUtils.isEmpty(str) || str.length() > 65536) {
            throw new y8(AMapException.AMAP_CLIENT_INVALID_PARAMETER);
        }
        this.e = str;
    }

    public byte[] a() {
        ByteArrayOutputStream byteArrayOutputStream;
        int i;
        byte[] a2;
        byte[] bArr = new byte[0];
        try {
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
            } catch (Throwable th) {
                th.printStackTrace();
            }
        } catch (Throwable th2) {
            th = th2;
            byteArrayOutputStream = null;
        }
        try {
            m9.a(byteArrayOutputStream, this.c);
            m9.a(byteArrayOutputStream, this.d);
            m9.a(byteArrayOutputStream, this.b);
            m9.a(byteArrayOutputStream, String.valueOf(d9.g(this.f1987a)));
            try {
                i = (int) (System.currentTimeMillis() / 1000);
            } catch (Throwable unused) {
                i = 0;
            }
            byteArrayOutputStream.write(new byte[]{(byte) ((i >> 24) & 255), (byte) ((i >> 16) & 255), (byte) ((i >> 8) & 255), (byte) (i & 255)});
            if (TextUtils.isEmpty(this.e)) {
                a2 = new byte[]{0, 0};
            } else {
                byte[] e = m9.e(this.e);
                if (e == null) {
                    a2 = new byte[]{0, 0};
                } else {
                    a2 = m9.a(e.length, 2);
                }
            }
            byteArrayOutputStream.write(a2);
            byteArrayOutputStream.write(m9.e(this.e));
            bArr = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
        } catch (Throwable th3) {
            th = th3;
            try {
                ja.a(th, "se", "tds");
                if (byteArrayOutputStream != null) {
                    byteArrayOutputStream.close();
                }
                return bArr;
            } catch (Throwable th4) {
                if (byteArrayOutputStream != null) {
                    try {
                        byteArrayOutputStream.close();
                    } catch (Throwable th5) {
                        th5.printStackTrace();
                    }
                }
                throw th4;
            }
        }
        return bArr;
    }
}
