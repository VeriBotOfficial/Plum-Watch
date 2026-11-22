package com.mbridge.msdk.dycreator.baseview.rewardpopview;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.tools.o0;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes17.dex */
public class AcquireRewardPopViewParameters {
    public AcquireRewardPopViewBehaviourListener behaviourListener;
    public String failTip;
    public String failTitle;
    public String language;
    public String placementId;
    public List<String> rightAnswerList;
    public String slideSuccessTitle;
    public String slideTip;
    public String slideTitle;
    public String successTip;
    public String successTitle;
    public String tips;
    public String title;
    public String unitId;
    public int viewType;
    public List<String> wrongAnswerList;
    public int autoDismissTime = 5;
    public int reduceTime = 0;
    public boolean canClickMaskArea = true;
    public int viewBackLayerTopColor = -15750;
    public int viewBackLayerBottomColor = -27861;
    public int viewForegroundTopColor = -1054;
    public int viewForegroundBottomColor = -8011;
    public int buttonBackgroundLightColor = -29952;
    public int buttonBackgroundDarkColor = 871331329;
    public int titleTextColor = -1741031;
    public int tipTextColor = -7772596;
    public int buttonTextLightColor = -1;
    public int buttonTextDarkColor = -2988288;
    public int successTipTextColor = -1;
    public int failTipTextColor = -1;
    public int containerBackgroundColor = -939524096;
    public int successTitleGradientStartColor = -1043;
    public int successTitleGradientEndColor = -17041;
    public int successTitleShadowColor = -1280767;
    public int successTitleTextSize = 40;
    public float successTitleShadowRadius = 3.0f;
    public float successTitleShadowDx = 1.5f;
    public float successTitleShadowDy = 1.8f;
    public int failTitleGradientStartColor = -1;
    public int failTitleGradientEndColor = -7640251;
    public int failTitleShadowColor = -12898009;
    public int failTitleTextSize = 40;
    public float failTitleShadowRadius = 3.0f;
    public float failTitleShadowDx = 1.5f;
    public float failTitleShadowDy = 1.8f;

    public static class Builder {

        /* renamed from: a, reason: collision with root package name */
        private AcquireRewardPopViewParameters f11408a;

        public Builder(String str, String str2, int i, String str3) {
            AcquireRewardPopViewParameters acquireRewardPopViewParameters = new AcquireRewardPopViewParameters();
            this.f11408a = acquireRewardPopViewParameters;
            acquireRewardPopViewParameters.placementId = str;
            acquireRewardPopViewParameters.unitId = str2;
            acquireRewardPopViewParameters.viewType = i;
            acquireRewardPopViewParameters.language = str3;
            a(str3);
        }

        /* JADX WARN: Removed duplicated region for block: B:6:0x003c  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0074  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private void a(java.lang.String r6) {
            /*
                Method dump skipped, instructions count: 293
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.dycreator.baseview.rewardpopview.AcquireRewardPopViewParameters.Builder.a(java.lang.String):void");
        }

        public AcquireRewardPopViewParameters build() {
            return this.f11408a;
        }

        public Builder setAutoDismissTime(int i) {
            this.f11408a.autoDismissTime = i;
            return this;
        }

        public Builder setBehaviourListener(AcquireRewardPopViewBehaviourListener acquireRewardPopViewBehaviourListener) {
            this.f11408a.behaviourListener = acquireRewardPopViewBehaviourListener;
            return this;
        }

        public Builder setButtonBackgroundDarkColor(int i) {
            this.f11408a.buttonBackgroundDarkColor = i;
            return this;
        }

        public Builder setButtonBackgroundLightColor(int i) {
            this.f11408a.buttonBackgroundLightColor = i;
            return this;
        }

        public Builder setButtonTextDarkColor(int i) {
            this.f11408a.buttonTextDarkColor = i;
            return this;
        }

        public Builder setButtonTextLightColor(int i) {
            this.f11408a.buttonTextLightColor = i;
            return this;
        }

        public Builder setCanClickMaskArea(boolean z) {
            this.f11408a.canClickMaskArea = z;
            return this;
        }

        public Builder setContainerBackgroundColor(int i) {
            this.f11408a.containerBackgroundColor = i;
            return this;
        }

        public Builder setFailTip(String str) {
            this.f11408a.failTip = str;
            return this;
        }

        public Builder setFailTipTextColor(int i) {
            this.f11408a.failTipTextColor = i;
            return this;
        }

        public Builder setFailTitle(String str) {
            this.f11408a.failTitle = str;
            return this;
        }

        public Builder setFailTitleGradientEndColor(int i) {
            this.f11408a.failTitleGradientEndColor = i;
            return this;
        }

        public Builder setFailTitleGradientStartColor(int i) {
            this.f11408a.failTitleGradientStartColor = i;
            return this;
        }

        public Builder setFailTitleShadowColor(int i) {
            this.f11408a.failTitleShadowColor = i;
            return this;
        }

        public Builder setFailTitleShadowDx(float f) {
            this.f11408a.failTitleShadowDx = f;
            return this;
        }

        public Builder setFailTitleShadowDy(float f) {
            this.f11408a.failTitleShadowDy = f;
            return this;
        }

        public Builder setFailTitleShadowRadius(float f) {
            this.f11408a.failTitleShadowRadius = f;
            return this;
        }

        public Builder setFailTitleTextSize(int i) {
            this.f11408a.failTitleTextSize = i;
            return this;
        }

        public Builder setReduceTime(int i) {
            this.f11408a.reduceTime = i;
            return this;
        }

        public Builder setRightAnswerList(ArrayList<String> arrayList) {
            this.f11408a.rightAnswerList = arrayList;
            return this;
        }

        public Builder setSlideSuccessTitle(String str) {
            this.f11408a.slideSuccessTitle = str;
            return this;
        }

        public Builder setSlideTip(String str) {
            this.f11408a.slideTip = str;
            return this;
        }

        public Builder setSlideTitle(String str) {
            this.f11408a.slideTitle = str;
            return this;
        }

        public Builder setSuccessTip(String str) {
            this.f11408a.successTip = str;
            return this;
        }

        public Builder setSuccessTipTextColor(int i) {
            this.f11408a.successTipTextColor = i;
            return this;
        }

        public Builder setSuccessTitle(String str) {
            this.f11408a.successTitle = str;
            return this;
        }

        public Builder setSuccessTitleGradientEndColor(int i) {
            this.f11408a.successTitleGradientEndColor = i;
            return this;
        }

        public Builder setSuccessTitleGradientStartColor(int i) {
            this.f11408a.successTitleGradientStartColor = i;
            return this;
        }

        public Builder setSuccessTitleShadowColor(int i) {
            this.f11408a.successTitleShadowColor = i;
            return this;
        }

        public Builder setSuccessTitleShadowDx(float f) {
            this.f11408a.successTitleShadowDx = f;
            return this;
        }

        public Builder setSuccessTitleShadowDy(float f) {
            this.f11408a.successTitleShadowDy = f;
            return this;
        }

        public Builder setSuccessTitleShadowRadius(float f) {
            this.f11408a.successTitleShadowRadius = f;
            return this;
        }

        public Builder setSuccessTitleTextSize(int i) {
            this.f11408a.successTitleTextSize = i;
            return this;
        }

        public Builder setTipTextColor(int i) {
            this.f11408a.tipTextColor = i;
            return this;
        }

        public Builder setTips(String str) {
            this.f11408a.tips = str;
            return this;
        }

        public Builder setTitle(String str) {
            this.f11408a.title = str;
            return this;
        }

        public Builder setTitleTextColor(int i) {
            this.f11408a.titleTextColor = i;
            return this;
        }

        public Builder setViewBackLayerBottomColor(int i) {
            this.f11408a.viewBackLayerBottomColor = i;
            return this;
        }

        public Builder setViewBackLayerTopColor(int i) {
            this.f11408a.viewBackLayerTopColor = i;
            return this;
        }

        public Builder setViewForegroundBottomColor(int i) {
            this.f11408a.viewForegroundBottomColor = i;
            return this;
        }

        public Builder setViewForegroundTopColor(int i) {
            this.f11408a.viewForegroundTopColor = i;
            return this;
        }

        public Builder setWrongAnswerList(ArrayList<String> arrayList) {
            this.f11408a.wrongAnswerList = arrayList;
            return this;
        }
    }

    public static Builder builder(String str, String str2, int i, String str3) {
        if (TextUtils.isEmpty(str2)) {
            o0.b("AcquireRewardPopViewParameters", "Unit id must not null.");
            return null;
        }
        if (i == 0) {
            i = 1;
        }
        if (TextUtils.isEmpty(str3)) {
            str3 = "EN";
        }
        return new Builder(str, str2, i, str3);
    }
}
