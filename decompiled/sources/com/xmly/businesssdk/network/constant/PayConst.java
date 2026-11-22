package com.xmly.businesssdk.network.constant;

import kotlin.Metadata;

/* compiled from: PayConst.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/xmly/businesssdk/network/constant/PayConst;", "", "()V", "ACCESS_ACCOUNT_TYPE", "", "BENEFIT_URL", "", "PAY_ALBUM", "PAY_TRACK", "PAY_VIP", "RETURN_ERROR_URL", "RETURN_URL", "business-sdk_wakeRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class PayConst {
    public static final int ACCESS_ACCOUNT_TYPE = 1;
    public static final String BENEFIT_URL = "https://wear.ximalaya.com/gatekeeper/aiot-h5s#/wear-app/exchange-vip";
    public static final PayConst INSTANCE = new PayConst();
    public static final String PAY_ALBUM = "confirmPayAlbum_";
    public static final String PAY_TRACK = "confirmPayTrack_";
    public static final String PAY_VIP = "confirmPayVIP_";
    public static final String RETURN_ERROR_URL = "http://error.ximalayaos.com/fmxos_platform";
    public static final String RETURN_URL = "http://api.ximalaya.com/ximalayaos-home-h5-view-project/cashierDesk/pay#/verify-pay";

    private PayConst() {
    }
}
