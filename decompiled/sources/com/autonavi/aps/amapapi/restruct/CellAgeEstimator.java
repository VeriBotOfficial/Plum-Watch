package com.autonavi.aps.amapapi.restruct;

import android.content.Context;
import android.os.Handler;
import com.autonavi.aps.amapapi.config.Const;

/* loaded from: classes12.dex */
public final class CellAgeEstimator extends AgeEstimator<Cgi> {
    public CellAgeEstimator(Context context, String str, Handler handler) {
        super(context, str, handler);
    }

    @Override // com.autonavi.aps.amapapi.restruct.AgeEstimator
    int a(Cgi cgi) {
        Cgi cgi2 = cgi;
        if (cgi2 == null) {
            return 99;
        }
        return cgi2.signalStrength;
    }

    @Override // com.autonavi.aps.amapapi.restruct.AgeEstimator
    long b(Cgi cgi) {
        Cgi cgi2 = cgi;
        if (cgi2 == null) {
            return 0L;
        }
        return cgi2.lastUpdateUtcMills;
    }

    @Override // com.autonavi.aps.amapapi.restruct.AgeEstimator
    public String getKey(Cgi cgi) {
        return cgi == null ? "" : cgi.getCellKey();
    }

    @Override // com.autonavi.aps.amapapi.restruct.AgeEstimator
    void a(Cgi cgi, long j) {
        Cgi cgi2 = cgi;
        if (cgi2 != null) {
            cgi2.lastUpdateUtcMills = j;
        }
    }

    @Override // com.autonavi.aps.amapapi.restruct.AgeEstimator
    long b() {
        return Const.sCellLimitTime;
    }

    @Override // com.autonavi.aps.amapapi.restruct.AgeEstimator
    long a() {
        return Const.sCellLimitSize;
    }
}
