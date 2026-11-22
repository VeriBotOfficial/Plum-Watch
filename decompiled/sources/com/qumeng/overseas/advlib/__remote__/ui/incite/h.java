package com.qumeng.overseas.advlib.__remote__.ui.incite;

import android.text.TextUtils;
import android.util.Base64;
import java.io.ByteArrayOutputStream;
import java.net.URLEncoder;
import java.util.zip.GZIPOutputStream;

/* loaded from: classes17.dex */
public class h {
    public static String a() {
        try {
            return !TextUtils.isEmpty(com.qumeng.overseas.advlib.__remote__.core.coreutils.a.B) ? URLEncoder.encode(com.qumeng.overseas.advlib.__remote__.core.proto.utils.a.a(com.qumeng.overseas.advlib.__remote__.core.coreutils.a.B, com.qumeng.overseas.advlib.__remote__.core.proto.utils.a.b(com.qumeng.overseas.advlib.__remote__.core.proto.utils.a.f12849a), com.qumeng.overseas.advlib.__remote__.core.proto.utils.a.b(com.qumeng.overseas.advlib.__remote__.core.proto.utils.a.c))) : "";
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(str.getBytes());
            gZIPOutputStream.flush();
            gZIPOutputStream.close();
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.flush();
            byteArrayOutputStream.close();
            return new String(Base64.encode(byteArray, 3));
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
