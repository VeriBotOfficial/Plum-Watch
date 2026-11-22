package com.alibaba.android.arouter.facade.service;

import android.net.Uri;
import com.alibaba.android.arouter.facade.template.IProvider;

/* loaded from: classes11.dex */
public interface PathReplaceService extends IProvider {
    String forString(String str);

    Uri forUri(Uri uri);
}
