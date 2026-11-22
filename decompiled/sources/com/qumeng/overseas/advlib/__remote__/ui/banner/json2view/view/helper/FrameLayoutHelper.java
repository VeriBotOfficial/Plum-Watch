package com.qumeng.overseas.advlib.__remote__.ui.banner.json2view.view.helper;

import android.view.View;
import com.qumeng.overseas.advlib.__remote__.ui.banner.json2view.view.view.IView;

/* loaded from: classes17.dex */
public class FrameLayoutHelper extends ViewHelper {
    public FrameLayoutHelper(IView iView, View view) {
        super(iView, view);
    }

    @Override // com.qumeng.overseas.advlib.__remote__.ui.banner.json2view.view.helper.ViewHelper, com.qumeng.overseas.advlib.__remote__.ui.banner.json2view.view.helper.Helper
    public void setViewProperties() {
        super.setViewProperties();
        setAutoFitHeight();
        setAutoFitHeightByRequestParams();
    }
}
