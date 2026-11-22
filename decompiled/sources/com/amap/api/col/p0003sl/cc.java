package com.amap.api.col.p0003sl;

import android.content.Context;
import android.text.TextUtils;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.spec.InvalidKeySpecException;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

/* compiled from: HeaderAddStrategy.java */
/* loaded from: classes11.dex */
public class cc extends gc {
    private String c;
    private ab d;
    private Object[] e;

    public cc(Context context, gc gcVar, ab abVar, String str, Object... objArr) {
        super(gcVar);
        this.c = str;
        this.d = abVar;
        this.e = objArr;
    }

    @Override // com.amap.api.col.p0003sl.gc
    protected byte[] b(byte[] bArr) throws CertificateException, NoSuchAlgorithmException, IOException, BadPaddingException, IllegalBlockSizeException, NoSuchPaddingException, InvalidKeyException, InvalidKeySpecException {
        String str;
        String c = m9.c(bArr);
        if (TextUtils.isEmpty(c)) {
            return null;
        }
        try {
            str = String.format(m9.b(this.c), this.e);
        } catch (Throwable th) {
            th.printStackTrace();
            ja.a(th, "ofm", "gpj");
            str = "";
        }
        String c2 = m9.c(this.d.b(m9.e(str)));
        StringBuilder sb = new StringBuilder("{\"pinfo\":\"");
        sb.append(c2).append("\",\"els\":[");
        sb.append(c);
        sb.append("]}");
        return m9.e(sb.toString());
    }
}
