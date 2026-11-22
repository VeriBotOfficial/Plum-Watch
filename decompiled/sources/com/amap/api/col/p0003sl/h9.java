package com.amap.api.col.p0003sl;

import android.net.Uri;
import android.text.TextUtils;

/* compiled from: IPV6Request.java */
/* loaded from: classes11.dex */
public abstract class h9 extends ob {
    @Override // com.amap.api.col.p0003sl.ob
    public String getIPV6URL() {
        if (TextUtils.isEmpty(getURL())) {
            return getURL();
        }
        String url = getURL();
        Uri parse = Uri.parse(url);
        return parse.getAuthority().startsWith("dualstack-") ? url : parse.getAuthority().startsWith("restsdk.amap.com") ? parse.buildUpon().authority("dualstack-arestapi.amap.com").build().toString() : parse.buildUpon().authority("dualstack-" + parse.getAuthority()).build().toString();
    }

    @Override // com.amap.api.col.p0003sl.ob
    public boolean isSupportIPV6() {
        return true;
    }
}
