package com.qumeng.overseas.advlib.__remote__.ui.banner.json2view.view.helper;

import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import com.qumeng.overseas.advlib.__remote__.ui.banner.json2view.view.helper.util.MGravity;
import com.qumeng.overseas.advlib.__remote__.ui.banner.json2view.view.view.ILinearLayout;
import com.qumeng.overseas.advlib.__remote__.ui.banner.json2view.view.view.IView;

/* loaded from: classes17.dex */
public class LinearLayoutHelper extends ViewHelper {
    public LinearLayoutHelper(IView iView, View view) {
        super(iView, view);
    }

    @Override // com.qumeng.overseas.advlib.__remote__.ui.banner.json2view.view.helper.ViewHelper, com.qumeng.overseas.advlib.__remote__.ui.banner.json2view.view.helper.Helper
    public void setViewProperties() {
        super.setViewProperties();
        setAutoFitHeight();
        setAutoFitHeightByRequestParams();
        String orientation = ((ILinearLayout) this.baseView).getOrientation();
        if (TextUtils.isEmpty(orientation) || orientation.equals("horizontal")) {
            ((LinearLayout) this.view).setOrientation(0);
        } else {
            ((LinearLayout) this.view).setOrientation(1);
        }
        String gravity = this.baseView.getGravity();
        if (TextUtils.isEmpty(gravity)) {
            return;
        }
        ((LinearLayout) this.view).setGravity(MGravity.getGravityInt(gravity));
    }
}
