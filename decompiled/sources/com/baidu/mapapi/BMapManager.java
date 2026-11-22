package com.baidu.mapapi;

import android.content.Context;
import com.baidu.mapsdkplatform.comapi.BMapManagerInternal;

/* loaded from: classes13.dex */
public class BMapManager {
    public static void destroy() {
        BMapManagerInternal.getInstance().c();
    }

    public static Context getContext() {
        try {
            return BMapManagerInternal.getInstance().d();
        } catch (IllegalStateException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void init() {
        try {
            BMapManagerInternal.getInstance().e();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }
    }
}
