package com.wakeup.howear.rewardad;

import android.app.Activity;
import android.os.Bundle;
import com.qumeng.overseas.advlib.core.AdRequestParam;
import com.qumeng.overseas.advlib.core.IMultiAdObject;
import com.qumeng.overseas.advlib.topon.AdxAdapterConst;
import com.wakeup.common.log.LogUtils;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Ref;

/* compiled from: RewardAdHelper.kt */
@Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016¨\u0006\t"}, d2 = {"com/wakeup/howear/rewardad/RewardAdHelper$Companion$showRewardAdInternalWithState$requestParam$1", "Lcom/qumeng/overseas/advlib/core/AdRequestParam$ADLoadListener;", "onADLoaded", "", "adModel", "Lcom/qumeng/overseas/advlib/core/IMultiAdObject;", "onAdFailed", "msg", "", "app_wpOverseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RewardAdHelper$Companion$showRewardAdInternalWithState$requestParam$1 implements AdRequestParam.ADLoadListener {
    final /* synthetic */ Activity $activity;
    final /* synthetic */ String $adPlacementId;
    final /* synthetic */ Function5<Boolean, Boolean, Double, String, String, Unit> $finishOnce;
    final /* synthetic */ Function0<Unit> $onAdShow;

    /* JADX WARN: Multi-variable type inference failed */
    RewardAdHelper$Companion$showRewardAdInternalWithState$requestParam$1(Function5<? super Boolean, ? super Boolean, ? super Double, ? super String, ? super String, Unit> function5, Activity activity, String str, Function0<Unit> function0) {
        this.$finishOnce = function5;
        this.$activity = activity;
        this.$adPlacementId = str;
        this.$onAdShow = function0;
    }

    @Override // com.qumeng.overseas.advlib.core.AdRequestParam.ADLoadListener
    public void onADLoaded(final IMultiAdObject adModel) {
        if (adModel == null) {
            LogUtils.e("OverseasRewardAd", "onADLoaded null adModel");
            this.$finishOnce.invoke(false, false, Double.valueOf(0.0d), AdxAdapterConst.NETWORK_NAME, "null_admodel");
            return;
        }
        final Ref.DoubleRef doubleRef = new Ref.DoubleRef();
        final String str = this.$adPlacementId;
        adModel.setRevenueListener(new IMultiAdObject.RevenueListener() { // from class: com.wakeup.howear.rewardad.RewardAdHelper$Companion$showRewardAdInternalWithState$requestParam$1$$ExternalSyntheticLambda0
            @Override // com.qumeng.overseas.advlib.core.IMultiAdObject.RevenueListener
            public final void onRevenue(Bundle bundle) {
                RewardAdHelper$Companion$showRewardAdInternalWithState$requestParam$1.onADLoaded$lambda$0(Ref.DoubleRef.this, str, bundle);
            }
        });
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        final Ref.BooleanRef booleanRef2 = new Ref.BooleanRef();
        Activity activity = this.$activity;
        final Function0<Unit> function0 = this.$onAdShow;
        final String str2 = this.$adPlacementId;
        final Function5<Boolean, Boolean, Double, String, String, Unit> function5 = this.$finishOnce;
        adModel.showRewardVideo(activity, new AdRequestParam.ADRewardVideoListener() { // from class: com.wakeup.howear.rewardad.RewardAdHelper$Companion$showRewardAdInternalWithState$requestParam$1$onADLoaded$2
            @Override // com.qumeng.overseas.advlib.core.AdRequestParam.ADRewardVideoListener
            public void onAdClick(Bundle bundle) {
            }

            @Override // com.qumeng.overseas.advlib.core.AdRequestParam.ADRewardVideoListener
            public void onSkippedVideo(Bundle bundle) {
            }

            @Override // com.qumeng.overseas.advlib.core.AdRequestParam.ADRewardVideoListener
            public void onVideoComplete(Bundle bundle) {
            }

            @Override // com.qumeng.overseas.advlib.core.AdRequestParam.ADRewardVideoListener
            public void onAdShow(Bundle bundle) {
                Ref.BooleanRef.this.element = true;
                Function0<Unit> function02 = function0;
                if (function02 != null) {
                    function02.invoke();
                }
            }

            @Override // com.qumeng.overseas.advlib.core.AdRequestParam.ADRewardVideoListener
            public void onVideoStart(Bundle bundle) {
                if (Ref.BooleanRef.this.element) {
                    return;
                }
                Ref.BooleanRef.this.element = true;
                Function0<Unit> function02 = function0;
                if (function02 != null) {
                    function02.invoke();
                }
            }

            @Override // com.qumeng.overseas.advlib.core.AdRequestParam.ADRewardVideoListener
            public void onReward(Bundle bundle) {
                booleanRef.element = true;
            }

            @Override // com.qumeng.overseas.advlib.core.AdRequestParam.ADRewardVideoListener
            public void onVideoError(Bundle bundle) {
                double onADLoaded$currentEcpm;
                LogUtils.e("OverseasRewardAd", "onVideoError, adShown=" + Ref.BooleanRef.this.element + " placementId=" + str2);
                Function5<Boolean, Boolean, Double, String, String, Unit> function52 = function5;
                Boolean valueOf = Boolean.valueOf(Ref.BooleanRef.this.element);
                onADLoaded$currentEcpm = RewardAdHelper$Companion$showRewardAdInternalWithState$requestParam$1.onADLoaded$currentEcpm(doubleRef, adModel);
                function52.invoke(false, valueOf, Double.valueOf(onADLoaded$currentEcpm), AdxAdapterConst.NETWORK_NAME, "video_error");
            }

            @Override // com.qumeng.overseas.advlib.core.AdRequestParam.ADRewardVideoListener
            public void onAdClose(Bundle bundle) {
                double onADLoaded$currentEcpm;
                double onADLoaded$currentEcpm2;
                boolean z = booleanRef.element;
                boolean z2 = Ref.BooleanRef.this.element;
                onADLoaded$currentEcpm = RewardAdHelper$Companion$showRewardAdInternalWithState$requestParam$1.onADLoaded$currentEcpm(doubleRef, adModel);
                LogUtils.i("OverseasRewardAd", "onAdClose rewarded=" + z + " adShown=" + z2 + " ecpm=" + onADLoaded$currentEcpm);
                Function5<Boolean, Boolean, Double, String, String, Unit> function52 = function5;
                Boolean valueOf = Boolean.valueOf(booleanRef.element);
                Boolean valueOf2 = Boolean.valueOf(Ref.BooleanRef.this.element);
                onADLoaded$currentEcpm2 = RewardAdHelper$Companion$showRewardAdInternalWithState$requestParam$1.onADLoaded$currentEcpm(doubleRef, adModel);
                function52.invoke(valueOf, valueOf2, Double.valueOf(onADLoaded$currentEcpm2), AdxAdapterConst.NETWORK_NAME, null);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onADLoaded$lambda$0(Ref.DoubleRef doubleRef, String str, Bundle bundle) {
        if (bundle != null) {
            doubleRef.element = bundle.getDouble("revenue");
            LogUtils.d("OverseasRewardAd", "onRevenue revenue=" + doubleRef.element + " placementId=" + str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double onADLoaded$currentEcpm(Ref.DoubleRef doubleRef, IMultiAdObject iMultiAdObject) {
        return doubleRef.element > 0.0d ? doubleRef.element * 1000 : iMultiAdObject.getECPM();
    }

    @Override // com.qumeng.overseas.advlib.core.AdRequestParam.ADLoadListener
    public void onAdFailed(String msg) {
        LogUtils.e("OverseasRewardAd", "onAdFailed: " + msg + " placementId=" + this.$adPlacementId);
        Function5<Boolean, Boolean, Double, String, String, Unit> function5 = this.$finishOnce;
        Double valueOf = Double.valueOf(0.0d);
        if (msg == null) {
            msg = "ad_failed";
        }
        function5.invoke(false, false, valueOf, AdxAdapterConst.NETWORK_NAME, msg);
    }
}
