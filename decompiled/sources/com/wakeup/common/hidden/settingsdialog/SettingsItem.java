package com.wakeup.common.hidden.settingsdialog;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.wakeup.common.R;

/* loaded from: classes2.dex */
public class SettingsItem extends LinearLayout {
    private TextView buttonText;

    public void initButton(String buttonStr, View.OnClickListener onButtonClick) {
        this.buttonText.setText(buttonStr);
        this.buttonText.setOnClickListener(onButtonClick);
    }

    private void initLayout(Context context) {
        ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R.layout.item_settings_dialog, this);
        this.buttonText = (TextView) findViewById(R.id.tv_item_settings_dialog);
    }

    public SettingsItem(Context context) {
        super(context);
        initLayout(context);
    }

    public SettingsItem(Context context, AttributeSet attrs) {
        super(context, attrs);
        initLayout(context);
    }

    public SettingsItem(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initLayout(context);
    }
}
