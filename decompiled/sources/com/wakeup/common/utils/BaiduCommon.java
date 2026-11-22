package com.wakeup.common.utils;

import kotlin.Metadata;

/* compiled from: BaiduCommon.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0011\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0011\u0010\r\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\u0012\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0011\u0010\u0014\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000f¨\u0006\u0016"}, d2 = {"Lcom/wakeup/common/utils/BaiduCommon;", "", "<init>", "()V", "MAP_CLIENT_ID", "", "MAP_CLIENT_SECRET", "MAP_CLIENT_ID_OVER", "MAP_CLIENT_SECRET_OVER", "TTS_CLIENT_ID_TEST", "TTS_CLIENT_SECRET_TEST", "TTS_CLIENT_ID", "TTS_CLIENT_SECRET", "clientId", "getClientId", "()Ljava/lang/String;", "clientSecret", "getClientSecret", "clientIdT", "getClientIdT", "clientSecretT", "getClientSecretT", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class BaiduCommon {
    public static final String MAP_CLIENT_ID = "PeMbm6ACxAqqaDuCiPup88spaWhae7Am";
    public static final String MAP_CLIENT_SECRET = "fXd3QojGIbQFNTse5QEeeCCQEEwlG6en";
    private static final String TTS_CLIENT_ID_TEST = "TEMPTestxOiwcn72B70sPP";
    private static final String TTS_CLIENT_SECRET_TEST = "zxMn1231OInaq9872384M";
    public static final BaiduCommon INSTANCE = new BaiduCommon();
    private static final String MAP_CLIENT_ID_OVER = "LlalSQezd3gP3oWD7c5X59WfDzkYbgHN";
    private static final String clientId = MAP_CLIENT_ID_OVER;
    private static final String MAP_CLIENT_SECRET_OVER = "TdkgKqkw19RMPwdexLgmyrEcnLmU2ikz";
    private static final String clientSecret = MAP_CLIENT_SECRET_OVER;
    private static final String TTS_CLIENT_ID = "wkXmalsoien9871Ka81bnak12";
    private static final String clientIdT = TTS_CLIENT_ID;
    private static final String TTS_CLIENT_SECRET = "nyqJsep812Nch83Jahsqp861";
    private static final String clientSecretT = TTS_CLIENT_SECRET;

    private BaiduCommon() {
    }

    public final String getClientId() {
        return clientId;
    }

    public final String getClientSecret() {
        return clientSecret;
    }

    public final String getClientIdT() {
        return clientIdT;
    }

    public final String getClientSecretT() {
        return clientSecretT;
    }
}
