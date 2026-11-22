package com.baidu.lbsapi.auth;

import android.text.TextUtils;
import java.net.Authenticator;
import java.net.PasswordAuthentication;

/* loaded from: classes13.dex */
class j extends Authenticator {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ i f7495a;

    j(i iVar) {
        this.f7495a = iVar;
    }

    @Override // java.net.Authenticator
    protected PasswordAuthentication getPasswordAuthentication() {
        String str;
        String str2;
        String str3;
        String str4;
        str = this.f7495a.g;
        if (!TextUtils.isEmpty(str)) {
            str2 = this.f7495a.h;
            if (!TextUtils.isEmpty(str2)) {
                str3 = this.f7495a.g;
                str4 = this.f7495a.h;
                return new PasswordAuthentication(str3, str4.toCharArray());
            }
        }
        b.a("Proxy Username or Password is null");
        return null;
    }
}
