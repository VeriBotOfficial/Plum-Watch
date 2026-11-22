package com.wakeup.howear.view.user.login;

/* loaded from: classes4.dex */
public abstract class LoginListener {
    public void onBindFail(int i, String str) {
    }

    public void onBindSuccess() {
    }

    public void onLoginCancel(LoginEnum loginEnum) {
    }

    public void onLoginFail(String str, String str2, LoginEnum loginEnum) {
    }

    public void onLoginStart(LoginEnum loginEnum) {
    }

    public abstract void onLoginSuccess(LoginEnum loginEnum);

    public void onOpenId(String str, String str2, LoginEnum loginEnum) {
    }
}
