package com.qumeng.overseas.advlib.core;

import android.os.Bundle;

/* loaded from: classes17.dex */
public class ICliUtils {

    public interface BannerStateListener {
        void onADDeliveredResult(boolean z, String str);

        void onADEventTriggered(int i, Bundle bundle);

        void onADShown();
    }

    public interface a {
        void onContentDelivered(ICliBundle iCliBundle);
    }
}
