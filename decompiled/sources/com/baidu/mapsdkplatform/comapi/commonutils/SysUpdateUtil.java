package com.baidu.mapsdkplatform.comapi.commonutils;

import android.content.Context;
import android.text.TextUtils;
import com.baidu.mapapi.NetworkUtil;
import com.baidu.mapapi.common.SysOSUtil;
import com.baidu.mapsdkplatform.comapi.util.SyncSysInfo;
import com.baidu.mapsdkplatform.comapi.util.SysUpdateObserver;
import com.baidu.platform.comapi.b.b;
import com.baidu.platform.comapi.util.e;
import com.baidu.platform.comjni.map.commonmemcache.NACommonMemCache;
import com.umeng.analytics.pro.ak;

/* loaded from: classes13.dex */
public class SysUpdateUtil implements SysUpdateObserver {

    /* renamed from: a, reason: collision with root package name */
    private static NACommonMemCache f8348a;

    public SysUpdateUtil() {
        f8348a = e.b();
    }

    @Override // com.baidu.mapsdkplatform.comapi.util.SysUpdateObserver
    public void init(String str) {
        if (f8348a != null) {
            if (TextUtils.isEmpty(str)) {
                str = SyncSysInfo.getPhoneInfoCache();
            }
            f8348a.b(str);
        }
    }

    @Override // com.baidu.mapsdkplatform.comapi.util.SysUpdateObserver
    public void updateCuid(String str) {
        NACommonMemCache nACommonMemCache = f8348a;
        if (nACommonMemCache != null) {
            nACommonMemCache.a("cuid", str);
        }
    }

    @Override // com.baidu.mapsdkplatform.comapi.util.SysUpdateObserver
    public void updateNetworkInfo(Context context) {
        NetworkUtil.updateNetworkProxy(context);
    }

    @Override // com.baidu.mapsdkplatform.comapi.util.SysUpdateObserver
    public void updateNetworkProxy(Context context) {
        b.a().b(SysOSUtil.getNetType());
    }

    @Override // com.baidu.mapsdkplatform.comapi.util.SysUpdateObserver
    public void updatePhoneInfo(String str) {
        NACommonMemCache nACommonMemCache = f8348a;
        if (nACommonMemCache != null) {
            String a2 = nACommonMemCache.a("logstatistics");
            f8348a.b(str);
            f8348a.b("logstatistics", a2);
        }
    }

    @Override // com.baidu.mapsdkplatform.comapi.util.SysUpdateObserver
    public void updateZid(String str) {
        NACommonMemCache nACommonMemCache = f8348a;
        if (nACommonMemCache != null) {
            nACommonMemCache.a(ak.al, str);
        }
    }
}
