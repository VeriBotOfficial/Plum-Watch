package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.Button;
import com.bytedance.sdk.component.utils.jz;
import com.bytedance.sdk.openadsdk.utils.wc;

/* loaded from: classes14.dex */
public class sg extends Button {
    public sg(Context context) {
        super(context);
        fxn();
    }

    private void fxn() {
        setId(com.bytedance.sdk.openadsdk.utils.xdg.gs);
        Context context = getContext();
        setLayoutParams(new ViewGroup.LayoutParams(-1, wc.kg(context, 48.0f)));
        setBackground(com.bytedance.sdk.openadsdk.utils.dgx.fxn(context, "tt_browser_download_selector"));
        setText(jz.fxn(context, "tt_video_download_apk"));
        setTextColor(-1);
        setTextSize(2, 16.0f);
    }
}
