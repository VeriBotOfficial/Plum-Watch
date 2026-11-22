package com.qumeng.overseas.advlib.ui.banner;

import com.qumeng.overseas.advlib.core.ICliBundle;
import com.qumeng.overseas.advlib.core.ICliUtils;
import com.qumeng.overseas.advlib.core.IMultiAdObject;

/* loaded from: classes17.dex */
public interface Banner {
    void OnBannerInit();

    void UpdateView(ICliBundle iCliBundle);

    void setADStateListener(IMultiAdObject.ADStateListener aDStateListener);

    void setPageUniqueId(int i);

    void setStateListener(ICliUtils.BannerStateListener bannerStateListener);

    void updateViewWithAds(Object obj);
}
