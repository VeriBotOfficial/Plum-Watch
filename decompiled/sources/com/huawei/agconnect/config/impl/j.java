package com.huawei.agconnect.config.impl;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes12.dex */
class j implements d {

    /* renamed from: a, reason: collision with root package name */
    private final Context f10182a;
    private final String b;

    j(Context context, String str) {
        this.f10182a = context;
        this.b = str;
    }

    private static String a(String str) {
        try {
            return "agc_" + Hex.encodeHexString(a(str.getBytes("UTF-8")));
        } catch (UnsupportedEncodingException | NoSuchAlgorithmException unused) {
            return "";
        }
    }

    private static byte[] a(byte[] bArr) throws NoSuchAlgorithmException {
        return MessageDigest.getInstance("SHA-256").digest(bArr);
    }

    @Override // com.huawei.agconnect.config.impl.d
    public String a(String str, String str2) {
        int identifier;
        String a2 = a(str);
        if (!TextUtils.isEmpty(a2) && (identifier = this.f10182a.getResources().getIdentifier(a2, "string", this.b)) != 0) {
            try {
                return this.f10182a.getResources().getString(identifier);
            } catch (Resources.NotFoundException unused) {
            }
        }
        return str2;
    }
}
