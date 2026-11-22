package com.wakeup.feature.newsdaily.ui;

import android.app.Activity;
import android.view.View;
import com.autonavi.aps.amapapi.config.Const;
import com.blankj.utilcode.util.BarUtils;
import com.wakeup.feature.newsdaily.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NewsUiHelper.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t¨\u0006\n"}, d2 = {"Lcom/wakeup/feature/newsdaily/ui/NewsUiHelper;", "", "<init>", "()V", "applyStatusBarHeader", "", Const.STR_PROCESS_TAG, "Landroid/app/Activity;", "header", "Landroid/view/View;", "feature-newsdaily_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class NewsUiHelper {
    public static final NewsUiHelper INSTANCE = new NewsUiHelper();

    private NewsUiHelper() {
    }

    public final void applyStatusBarHeader(Activity activity, View header) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(header, "header");
        BarUtils.addMarginTopEqualStatusBarHeight(header);
        int dimensionPixelSize = header.getResources().getDimensionPixelSize(R.dimen.news_header_vertical_padding);
        header.setPadding(header.getPaddingLeft(), dimensionPixelSize, header.getPaddingRight(), dimensionPixelSize);
    }
}
