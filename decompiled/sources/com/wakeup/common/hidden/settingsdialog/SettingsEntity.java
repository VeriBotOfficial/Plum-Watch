package com.wakeup.common.hidden.settingsdialog;

import android.view.View;

/* loaded from: classes2.dex */
public class SettingsEntity {
    private String buttonText;
    private View.OnClickListener onButtonClick;

    public SettingsEntity(String buttonText, View.OnClickListener onButtonClick) {
        this.buttonText = buttonText;
        this.onButtonClick = onButtonClick;
    }

    public String getButtonText() {
        return this.buttonText;
    }

    public View.OnClickListener getOnButtonClick() {
        return this.onButtonClick;
    }
}
