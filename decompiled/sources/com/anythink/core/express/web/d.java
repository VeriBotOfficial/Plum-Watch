package com.anythink.core.express.web;

import android.net.Uri;
import android.text.TextUtils;
import com.huawei.hms.support.api.entity.core.CommonCode;

/* loaded from: classes12.dex */
public final class d implements a {
    @Override // com.anythink.core.express.web.a
    public final boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String scheme = Uri.parse(str).getScheme();
        if (TextUtils.isEmpty(scheme)) {
            return false;
        }
        scheme.equals(CommonCode.Resolution.HAS_RESOLUTION_FROM_APK);
        return false;
    }
}
