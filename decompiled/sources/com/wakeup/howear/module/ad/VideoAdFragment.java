package com.wakeup.howear.module.ad;

import android.os.Bundle;
import com.qumeng.overseas.advlib.__remote__.ui.front._imp_adbrowser;
import com.wakeup.common.base.BaseFragment;
import com.wakeup.common.nativead.entity.NativeAdItemEntity;
import com.wakeup.feature.wkvideo.WKVideoViewModel;
import com.wakeup.feature.wkvideo.activity.PlayRangeActivityKt;
import com.wakeup.howear.databinding.FragmentBlackVideoAdBinding;
import kotlin.Metadata;

/* compiled from: VideoAdFragment.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\fH\u0016J\u0010\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0007H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/wakeup/howear/module/ad/VideoAdFragment;", "Lcom/wakeup/common/base/BaseFragment;", "Lcom/wakeup/feature/wkvideo/WKVideoViewModel;", "Lcom/wakeup/howear/databinding/FragmentBlackVideoAdBinding;", "<init>", "()V", "isAdCollecting", "", "adEntity", "Lcom/wakeup/common/nativead/entity/NativeAdItemEntity;", "isFromFeed", "initData", "", _imp_adbrowser.ACTIVITY_RESUME, "onHiddenChanged", "hidden", "app_wpOverseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class VideoAdFragment extends BaseFragment<WKVideoViewModel, FragmentBlackVideoAdBinding> {
    private NativeAdItemEntity adEntity;
    private boolean isAdCollecting;
    private boolean isFromFeed;

    @Override // com.wakeup.common.base.BaseFragment
    public void initData() {
        super.initData();
        Bundle arguments = getArguments();
        this.isFromFeed = arguments != null ? arguments.getBoolean(PlayRangeActivityKt.PARAM_BLACK_VIDEO_AD_FROM) : true;
    }

    @Override // com.wakeup.common.base.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (isVisible()) {
            getMBinding().layoutBlackVideoAdContainer.setVisibility(8);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean hidden) {
        super.onHiddenChanged(hidden);
        if (hidden || !isVisible()) {
            return;
        }
        getMBinding().layoutBlackVideoAdContainer.setVisibility(8);
    }
}
