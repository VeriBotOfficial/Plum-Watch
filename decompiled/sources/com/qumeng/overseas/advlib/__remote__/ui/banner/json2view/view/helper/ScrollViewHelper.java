package com.qumeng.overseas.advlib.__remote__.ui.banner.json2view.view.helper;

import android.text.TextUtils;
import android.view.View;
import android.widget.ScrollView;
import com.qumeng.overseas.advlib.__remote__.ui.banner.json2view.view.view.IScrollView;
import com.qumeng.overseas.advlib.__remote__.ui.banner.json2view.view.view.IView;

/* loaded from: classes17.dex */
public class ScrollViewHelper extends ViewHelper {
    private IScrollView iView;
    private ScrollView scrollView;

    public ScrollViewHelper(IView iView, View view) {
        super(iView, view);
        this.scrollView = (ScrollView) view;
        this.iView = (IScrollView) iView;
        setScrollbars();
    }

    private void setScrollbars() {
        String scrollbars = this.iView.getScrollbars();
        if (TextUtils.isEmpty(scrollbars)) {
            return;
        }
        if (scrollbars.equals("none")) {
            this.scrollView.setVerticalScrollBarEnabled(false);
            this.scrollView.setHorizontalScrollBarEnabled(false);
        } else if (scrollbars.equals("vertical")) {
            this.scrollView.setVerticalScrollBarEnabled(true);
        } else if (scrollbars.equals("horizontal")) {
            this.scrollView.setHorizontalScrollBarEnabled(true);
        }
    }
}
