package com.wakeup.howear.view.user.login;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: LoginEnum.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/wakeup/howear/view/user/login/LoginEnum;", "", "platform", "", "<init>", "(Ljava/lang/String;II)V", "getPlatform", "()I", "WECHAT", "QQ", "GOOGLE", "ACCOUNT_PASSWORD", "ONE_KEY", "SMS_CODE", "app_wpOverseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class LoginEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ LoginEnum[] $VALUES;
    private final int platform;
    public static final LoginEnum WECHAT = new LoginEnum("WECHAT", 0, 1);
    public static final LoginEnum QQ = new LoginEnum("QQ", 1, 2);
    public static final LoginEnum GOOGLE = new LoginEnum("GOOGLE", 2, 5);
    public static final LoginEnum ACCOUNT_PASSWORD = new LoginEnum("ACCOUNT_PASSWORD", 3, 21);
    public static final LoginEnum ONE_KEY = new LoginEnum("ONE_KEY", 4, 22);
    public static final LoginEnum SMS_CODE = new LoginEnum("SMS_CODE", 5, 23);

    private static final /* synthetic */ LoginEnum[] $values() {
        return new LoginEnum[]{WECHAT, QQ, GOOGLE, ACCOUNT_PASSWORD, ONE_KEY, SMS_CODE};
    }

    public static EnumEntries<LoginEnum> getEntries() {
        return $ENTRIES;
    }

    private LoginEnum(String str, int i, int i2) {
        this.platform = i2;
    }

    public final int getPlatform() {
        return this.platform;
    }

    static {
        LoginEnum[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    public static LoginEnum valueOf(String str) {
        return (LoginEnum) Enum.valueOf(LoginEnum.class, str);
    }

    public static LoginEnum[] values() {
        return (LoginEnum[]) $VALUES.clone();
    }
}
