package com.autonavi.aps.amapapi.restruct;

import android.content.Context;
import android.os.Handler;
import com.amap.location.support.bean.wifi.AmapWifi;
import com.autonavi.aps.amapapi.config.Const;

/* loaded from: classes12.dex */
public final class WifiAgeEstimator extends AgeEstimator<AmapWifi> {
    public WifiAgeEstimator(Context context, String str, Handler handler) {
        super(context, str, handler);
    }

    @Override // com.autonavi.aps.amapapi.restruct.AgeEstimator
    int a(AmapWifi amapWifi) {
        AmapWifi amapWifi2 = amapWifi;
        return amapWifi2 == null ? Const.I_DEF_CGI_SIG : amapWifi2.rssi;
    }

    @Override // com.autonavi.aps.amapapi.restruct.AgeEstimator
    long b(AmapWifi amapWifi) {
        AmapWifi amapWifi2 = amapWifi;
        if (amapWifi2 == null) {
            return 0L;
        }
        return amapWifi2.lastUpdateUtcMills;
    }

    @Override // com.autonavi.aps.amapapi.restruct.AgeEstimator
    public String getKey(AmapWifi amapWifi) {
        return amapWifi == null ? "" : amapWifi.getKey();
    }

    @Override // com.autonavi.aps.amapapi.restruct.AgeEstimator
    void a(AmapWifi amapWifi, long j) {
        AmapWifi amapWifi2 = amapWifi;
        if (amapWifi2 != null) {
            amapWifi2.lastUpdateUtcMills = j;
        }
    }

    @Override // com.autonavi.aps.amapapi.restruct.AgeEstimator
    long b() {
        return Const.sWifLimitTime;
    }

    @Override // com.autonavi.aps.amapapi.restruct.AgeEstimator
    long a() {
        return Const.sWifLimitSize;
    }
}
