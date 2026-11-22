package com.reactnativecommunity.netinfo.types;

import android.net.NetworkInfo;
import com.efs.sdk.base.core.util.NetworkUtil;
import javax.annotation.Nullable;

/* loaded from: classes17.dex */
public enum CellularGeneration {
    CG_2G(NetworkUtil.NETWORK_CLASS_2G),
    CG_3G(NetworkUtil.NETWORK_CLASS_3G),
    CG_4G(NetworkUtil.NETWORK_CLASS_4G),
    CG_5G(NetworkUtil.NETWORK_CLASS_5G);

    public final String label;

    CellularGeneration(String str) {
        this.label = str;
    }

    @Nullable
    public static CellularGeneration fromNetworkInfo(@Nullable NetworkInfo networkInfo) {
        if (networkInfo == null) {
            return null;
        }
        int subtype = networkInfo.getSubtype();
        if (subtype == 20) {
            return CG_5G;
        }
        switch (subtype) {
        }
        return null;
    }
}
