package com.wakeup.commponent.module.ad;

import android.app.Activity;
import com.alibaba.android.arouter.facade.template.IProvider;
import com.anythink.core.common.k;
import com.autonavi.aps.amapapi.config.Const;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function5;

/* compiled from: RewardAdService.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u009b\u0001\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2y\u0010\n\u001au\u0012\u0013\u0012\u00110\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0013\u0012\u00110\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0010\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0012\u0012\u0015\u0012\u0013\u0018\u00010\u0007¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0013\u0012\u0015\u0012\u0013\u0018\u00010\u0007¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\u00030\u000bH&J\b\u0010\u0015\u001a\u00020\fH&¨\u0006\u0016"}, d2 = {"Lcom/wakeup/commponent/module/ad/RewardAdService;", "Lcom/alibaba/android/arouter/facade/template/IProvider;", "showRewardAd", "", Const.STR_PROCESS_TAG, "Landroid/app/Activity;", "placementId", "", "timeoutMs", "", "callback", "Lkotlin/Function5;", "", "Lkotlin/ParameterName;", "name", "rewarded", "adShown", "", k.H, "adPlatform", "errorCode", "isShowRewardAd", "commponent_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface RewardAdService extends IProvider {
    boolean isShowRewardAd();

    void showRewardAd(Activity activity, String placementId, long timeoutMs, Function5<? super Boolean, ? super Boolean, ? super Double, ? super String, ? super String, Unit> callback);
}
