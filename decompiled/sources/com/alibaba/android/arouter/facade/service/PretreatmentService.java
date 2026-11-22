package com.alibaba.android.arouter.facade.service;

import android.content.Context;
import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.facade.template.IProvider;

/* loaded from: classes11.dex */
public interface PretreatmentService extends IProvider {
    boolean onPretreatment(Context context, Postcard postcard);
}
