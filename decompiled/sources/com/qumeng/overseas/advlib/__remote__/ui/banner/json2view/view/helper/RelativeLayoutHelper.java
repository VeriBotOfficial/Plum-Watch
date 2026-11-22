package com.qumeng.overseas.advlib.__remote__.ui.banner.json2view.view.helper;

import android.text.TextUtils;
import android.view.View;
import android.widget.RelativeLayout;
import com.qumeng.overseas.advlib.__remote__.ui.banner.json2view.view.helper.util.MGravity;
import com.qumeng.overseas.advlib.__remote__.ui.banner.json2view.view.view.IRelativeLayout;
import com.qumeng.overseas.advlib.__remote__.ui.banner.json2view.view.view.IView;

/* loaded from: classes17.dex */
public class RelativeLayoutHelper extends ViewHelper {
    IRelativeLayout iRelativeData;
    RelativeLayout relativeLayout;

    public RelativeLayoutHelper(IView iView, View view) {
        super(iView, view);
        this.iRelativeData = (IRelativeLayout) iView;
        this.relativeLayout = (RelativeLayout) view;
    }

    @Override // com.qumeng.overseas.advlib.__remote__.ui.banner.json2view.view.helper.ViewHelper, com.qumeng.overseas.advlib.__remote__.ui.banner.json2view.view.helper.Helper
    public void setViewProperties() {
        super.setViewProperties();
        String gravity = this.baseView.getGravity();
        if (!TextUtils.isEmpty(gravity)) {
            this.relativeLayout.setGravity(MGravity.getGravityInt(gravity));
        }
        setAutoFitHeight();
        setAutoFitHeightByRequestParams();
    }
}
