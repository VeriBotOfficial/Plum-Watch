package com.qumeng.overseas.advlib.__remote__.ui.banner.json2view.view.helper;

import android.animation.Animator;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.app.Application;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import com.qumeng.overseas.advlib.__remote__.core.proto.response.NativeMaterial;
import com.qumeng.overseas.advlib.__remote__.core.proto.throwable.NoSuchMaterialException;
import com.qumeng.overseas.advlib.__remote__.core.proto.utils.s;
import com.qumeng.overseas.advlib.__remote__.framework.videoplayer.NewPlayerDeck;
import com.qumeng.overseas.advlib.__remote__.framework.videoplayer.b;
import com.qumeng.overseas.advlib.__remote__.ui.banner.json2view.view.utils.a;
import com.qumeng.overseas.advlib.__remote__.ui.banner.json2view.view.utils.e;
import com.qumeng.overseas.advlib.__remote__.ui.banner.json2view.view.utils.g;
import com.qumeng.overseas.advlib.__remote__.ui.banner.json2view.view.view.INewPlayerDeck;
import com.qumeng.overseas.advlib.__remote__.ui.banner.json2view.view.view.IView;
import com.qumeng.overseas.advlib.__remote__.ui.elements.v;
import com.qumeng.overseas.advlib.__remote__.ui.incite.taskcenter.c;
import com.qumeng.overseas.advlib.trdparty.unionset.network.XmlViewControlEntity;
import com.qumeng.overseas.advlib.ui.front.ADBrowser;
import com.xiaomi.mipush.sdk.Constants;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.Map;

/* loaded from: classes17.dex */
public class ViewHelper implements Helper {
    int autoH;
    int autoW;
    IView baseView;
    View view;

    static class MRunnable implements Runnable {
        WeakReference<View> reference;
        String viewAnimation;

        public MRunnable(View view, String str) {
            this.reference = new WeakReference<>(view);
            this.viewAnimation = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            WeakReference<View> weakReference = this.reference;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            ViewHelper.onPlaying(this.reference.get(), this.viewAnimation);
        }
    }

    public ViewHelper(IView iView, View view) {
        this.baseView = iView;
        this.view = view;
    }

    private void dismissEndView() {
        View a2;
        if (this.baseView.getAdsObject() != null && this.baseView.getAdsObject().getAdslotId().equals("7268884") && "rootview".equals(this.baseView.getId()) && "#000000".equals(this.baseView.getBackground()) && (a2 = a.a(this.view, v.e, 0)) != null) {
            ((ViewGroup) a2.getParent()).removeView(a2);
        }
    }

    private int getVisibleInt() {
        String visibility = this.baseView.getVisibility();
        if (TextUtils.isEmpty(visibility)) {
            return 0;
        }
        if (visibility.equals("invisible")) {
            return 4;
        }
        return visibility.equals("gone") ? 8 : 0;
    }

    protected static void onPlaying(View view, String str) {
        startViewAnimation(view, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String replaceUrlGrand(String str) {
        return TextUtils.isEmpty(str) ? "" : str.replace(Helper._AND_, "&").replace(Helper._DEVICECODE_, com.qumeng.overseas.advlib.__remote__.core.coreutils.a.B).replace(Helper._TKID_, com.qumeng.overseas.advlib.__remote__.core.coreutils.a.K);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBusiness() {
        dismissEndView();
    }

    private void setClick() {
        if (TextUtils.isEmpty(this.baseView.getH5clickurl())) {
            return;
        }
        this.view.setOnClickListener(new View.OnClickListener() { // from class: com.qumeng.overseas.advlib.__remote__.ui.banner.json2view.view.helper.ViewHelper.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (ViewHelper.this.baseView.getH5clickurl().startsWith("http")) {
                    ViewHelper viewHelper = ViewHelper.this;
                    String replaceUrlGrand = viewHelper.replaceUrlGrand(viewHelper.baseView.getH5clickurl());
                    Intent intent = new Intent(ViewHelper.this.view.getContext(), (Class<?>) ADBrowser.class);
                    if (ViewHelper.this.baseView.getAdsObject() != null) {
                        intent.putExtra("mHaveClicked", ViewHelper.this.baseView.getAdsObject().ismHaveClicked());
                    }
                    intent.setAction(replaceUrlGrand);
                    if (ViewHelper.this.view.getContext() instanceof Application) {
                        intent.setFlags(268435456);
                    }
                    ViewHelper.this.view.getContext().startActivity(intent);
                }
            }
        });
    }

    private void setOnPlayingListener(final NewPlayerDeck newPlayerDeck, final long j) {
        newPlayerDeck.addOnPlayingStateChangeListener(new b.a() { // from class: com.qumeng.overseas.advlib.__remote__.ui.banner.json2view.view.helper.ViewHelper.3
            boolean isOnPlay = false;

            @Override // com.qumeng.overseas.advlib.__remote__.framework.videoplayer.b.a
            public void onVideoStateChanged(int i, long j2) {
                if (i != 1) {
                    return;
                }
                boolean z = this.isOnPlay;
                if (z || j2 / 1000 < j) {
                    if (z) {
                        newPlayerDeck.removeOnPlayingStateChangeListener(this);
                    }
                } else {
                    ViewHelper viewHelper = ViewHelper.this;
                    ViewHelper.onPlaying(viewHelper.view, viewHelper.baseView.getViewAnimation());
                    this.isOnPlay = true;
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOnVideoPlayingListener() {
        IView a2;
        String listenVideoPlaying = this.baseView.getListenVideoPlaying();
        if (TextUtils.isEmpty(listenVideoPlaying)) {
            return;
        }
        try {
            int parseInt = Integer.parseInt(listenVideoPlaying);
            if (parseInt > 0 && (a2 = e.a(this.baseView)) != null) {
                View a3 = e.a(INewPlayerDeck.idDesc, a2);
                if (a3 instanceof NewPlayerDeck) {
                    setOnPlayingListener((NewPlayerDeck) a3, parseInt);
                } else {
                    View view = this.view;
                    view.postDelayed(new MRunnable(view, this.baseView.getViewAnimation()), parseInt * 1000);
                }
            }
        } catch (NumberFormatException e) {
            com.qumeng.overseas.advlib.__remote__.utils.bugman.a.a((Class) getClass(), "NumberFormatException_ViewHelper_setOnVideoPlayingListener", (Throwable) e);
            e.printStackTrace();
        }
    }

    private void setTag() {
        String tag = this.baseView.getTag();
        if (TextUtils.isEmpty(tag)) {
            return;
        }
        this.view.setTag(tag);
    }

    private static void startAnimation(View view, String str, String str2) {
        try {
            String[] split = str2.split(",");
            if (split != null && split.length >= 4) {
                int parseInt = Integer.parseInt(split[1]);
                String[] split2 = split[2].split(Constants.ACCEPT_TIME_SEPARATOR_SERVER);
                int length = split2.length;
                float[] fArr = new float[length];
                for (int i = 0; i < length; i++) {
                    String replace = split2[i].replace("minus", Constants.ACCEPT_TIME_SEPARATOR_SERVER);
                    split2[i] = replace;
                    if (replace.endsWith("dp")) {
                        fArr[i] = g.a(view.getContext(), Float.parseFloat(split2[i].replace("dp", "")));
                    } else if (split2[i].endsWith("dip")) {
                        fArr[i] = g.b(view.getContext(), Float.parseFloat(split2[i].replace("dip", "")));
                    } else {
                        fArr[i] = Float.parseFloat(split2[i]);
                    }
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, str, fArr);
                ofFloat.setDuration(parseInt);
                String str3 = split[3];
                ofFloat.setInterpolator(new LinearInterpolator());
                ofFloat.setRepeatCount(Integer.parseInt(str3));
                ofFloat.addListener(new Animator.AnimatorListener() { // from class: com.qumeng.overseas.advlib.__remote__.ui.banner.json2view.view.helper.ViewHelper.1
                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationCancel(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationRepeat(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationStart(Animator animator) {
                    }
                });
                ofFloat.start();
            }
        } catch (NumberFormatException e) {
            com.qumeng.overseas.advlib.__remote__.utils.bugman.a.a(ViewHelper.class, "NumberFormatException_ViewHelper_startAnimation", (Throwable) e);
            e.printStackTrace();
        } catch (IllegalArgumentException e2) {
            com.qumeng.overseas.advlib.__remote__.utils.bugman.a.a(ViewHelper.class, "IllegalArgumentException_ViewHelper_startAnimation", (Throwable) e2);
            e2.printStackTrace();
        } catch (Exception e3) {
            com.qumeng.overseas.advlib.__remote__.utils.bugman.a.a(ViewHelper.class, "exp_ViewHelper_startAnimation", (Throwable) e3);
            e3.printStackTrace();
        }
    }

    private void startBackgroundAnimation(Drawable drawable) {
        String backgroundAnimation = this.baseView.getBackgroundAnimation();
        if (!TextUtils.isEmpty(backgroundAnimation) && backgroundAnimation.contains("color") && (drawable instanceof GradientDrawable)) {
            startColorAnimation((GradientDrawable) drawable);
        }
    }

    private void startColorAnimation(GradientDrawable gradientDrawable) {
        try {
            String[] split = this.baseView.getBackgroundAnimation().split(",");
            if (split != null && split.length >= 2) {
                int parseInt = Integer.parseInt(split[1]);
                String[] split2 = this.baseView.getColorList().split(Constants.ACCEPT_TIME_SEPARATOR_SERVER);
                int length = split2.length;
                int[] iArr = new int[length];
                for (int i = 0; i < length; i++) {
                    iArr[i] = Color.parseColor(split2[i]);
                }
                ObjectAnimator ofInt = ObjectAnimator.ofInt(gradientDrawable, "Color", iArr);
                ofInt.setDuration(parseInt);
                ofInt.setEvaluator(new ArgbEvaluator());
                ofInt.start();
            }
        } catch (NumberFormatException e) {
            com.qumeng.overseas.advlib.__remote__.utils.bugman.a.a((Class) getClass(), "NumberFormatException_ViewHelper_startColorAnimation", (Throwable) e);
            e.printStackTrace();
        } catch (IllegalArgumentException e2) {
            com.qumeng.overseas.advlib.__remote__.utils.bugman.a.a((Class) getClass(), "IllegalArgumentException_ViewHelper_startColorAnimation", (Throwable) e2);
            e2.printStackTrace();
        } catch (Exception e3) {
            com.qumeng.overseas.advlib.__remote__.utils.bugman.a.a((Class) getClass(), "exp_ViewHelper_startColorAnimation", (Throwable) e3);
            e3.printStackTrace();
        }
    }

    private static void startColorChangeAnimation(View view, String str) {
        try {
            String[] split = str.split(",");
            if (split != null && split.length >= 4) {
                int parseInt = Integer.parseInt(split[1]);
                String[] split2 = split[2].split(Constants.ACCEPT_TIME_SEPARATOR_SERVER);
                int length = split2.length;
                int[] iArr = new int[length];
                for (int i = 0; i < length; i++) {
                    iArr[i] = Color.parseColor(split2[i]);
                }
                if (view.getBackground() instanceof GradientDrawable) {
                    ObjectAnimator ofInt = ObjectAnimator.ofInt((GradientDrawable) view.getBackground(), "Color", iArr);
                    ofInt.setDuration(parseInt);
                    ofInt.setEvaluator(new ArgbEvaluator());
                    ofInt.setRepeatCount(Integer.parseInt(split[3]));
                    ofInt.start();
                }
            }
        } catch (NumberFormatException e) {
            com.qumeng.overseas.advlib.__remote__.utils.bugman.a.a(ViewHelper.class, "NumberFormatException_ViewHelper_startColorChangeAnimation", (Throwable) e);
            e.printStackTrace();
        } catch (IllegalArgumentException e2) {
            com.qumeng.overseas.advlib.__remote__.utils.bugman.a.a(ViewHelper.class, "IllegalArgumentException_ViewHelper_startColorChangeAnimation", (Throwable) e2);
            e2.printStackTrace();
        } catch (Exception e3) {
            com.qumeng.overseas.advlib.__remote__.utils.bugman.a.a(ViewHelper.class, "exp_ViewHelper_startColorChangeAnimation", (Throwable) e3);
            e3.printStackTrace();
        }
    }

    protected static void startViewAnimation(View view, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        for (String str2 : str.split(Constants.WAVE_SEPARATOR)) {
            if (str2.contains("scaleX")) {
                startAnimation(view, "scaleX", str2);
            } else if (str2.contains("scaleY")) {
                startAnimation(view, "scaleY", str2);
            } else if (str2.contains("translationX")) {
                startAnimation(view, "translationX", str2);
            } else if (str2.contains("translationY")) {
                startAnimation(view, "translationY", str2);
            } else if (str2.contains("alpha")) {
                startAnimation(view, "alpha", str2);
            } else if (str2.contains("colorChange")) {
                startColorChangeAnimation(view, str2);
            } else if (str2.contains("visible")) {
                view.setVisibility(0);
            } else if (str2.contains("invisible")) {
                view.setVisibility(4);
            } else if (str2.contains("gone")) {
                view.setVisibility(8);
            }
        }
    }

    public float aopRadius(float f) {
        return -1.0f;
    }

    protected void hideView() {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.view.getLayoutParams();
        marginLayoutParams.width = 0;
        marginLayoutParams.height = 0;
        marginLayoutParams.leftMargin = 0;
        marginLayoutParams.rightMargin = 0;
        marginLayoutParams.topMargin = 0;
        marginLayoutParams.bottomMargin = 0;
        this.view.setLayoutParams(marginLayoutParams);
        this.view.setPadding(0, 0, 0, 0);
        this.view.setVisibility(4);
    }

    protected void setAlpha() {
        try {
            String alpha = this.baseView.getAlpha();
            if (TextUtils.isEmpty(alpha)) {
                return;
            }
            this.view.setAlpha(Float.parseFloat(alpha));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setAutoFitHeight() {
        if (g.b(this.baseView.getAutoFitHeight())) {
            try {
                NativeMaterial nativeMaterial = this.baseView.getAdsObject().getNativeMaterial();
                if (nativeMaterial.height == 0 || nativeMaterial.width == 0) {
                    return;
                }
                int i = this.view.getContext().getResources().getDisplayMetrics().widthPixels;
                int i2 = (int) (nativeMaterial.height * (i / nativeMaterial.width));
                ViewGroup.LayoutParams layoutParams = this.view.getLayoutParams();
                layoutParams.width = i;
                this.autoW = i;
                if (i2 > i) {
                    layoutParams.height = -1;
                    this.autoH = -1;
                } else {
                    layoutParams.height = i2;
                    this.autoH = i2;
                }
                this.view.setLayoutParams(layoutParams);
            } catch (NoSuchMaterialException e) {
                com.qumeng.overseas.advlib.__remote__.utils.bugman.a.a((Class) getClass(), "NoSuchMaterialException_ViewHelper_setAutoFitHeight", (Throwable) e);
                e.printStackTrace();
            }
        }
    }

    public void setAutoFitHeightByRequestParams() {
        try {
            int a2 = s.a(this.baseView.getAdsObject().bannerWidth);
            int a3 = s.a(this.baseView.getAdsObject().bannerHeight);
            if (a2 <= 0 || a3 <= 0) {
                return;
            }
            ViewGroup.LayoutParams layoutParams = this.view.getLayoutParams();
            if (g.b(this.baseView.getAdapterMediaWH())) {
                layoutParams.width = a2;
                layoutParams.height = a3;
            } else {
                if (g.b(this.baseView.getAdapterMediaWidth())) {
                    layoutParams.width = a2;
                }
                if (g.b(this.baseView.getAdapterMediaHeight())) {
                    layoutParams.height = a3;
                }
            }
            this.view.setLayoutParams(layoutParams);
        } catch (Exception e) {
            com.qumeng.overseas.advlib.__remote__.utils.bugman.a.a((Class) getClass(), "NoSuchMaterialException_ViewHelper_setAutoFitHeightByRequestParams", (Throwable) e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void setBackground(final android.view.View r15) {
        /*
            Method dump skipped, instructions count: 444
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.qumeng.overseas.advlib.__remote__.ui.banner.json2view.view.helper.ViewHelper.setBackground(android.view.View):void");
    }

    protected void setClipChildren() {
        String clipChildren = this.baseView.getClipChildren();
        if (TextUtils.isEmpty(clipChildren)) {
            return;
        }
        View view = this.view;
        if (view instanceof ViewGroup) {
            ((ViewGroup) view).setClipChildren(g.b(clipChildren));
        }
    }

    protected void setMargin() {
        String margin = TextUtils.isEmpty(this.baseView.getConfigMargin()) ? this.baseView.getMargin() : this.baseView.getConfigMargin();
        String leftMargin = TextUtils.isEmpty(this.baseView.getConfigMarginLeft()) ? this.baseView.getLeftMargin() : this.baseView.getConfigMarginLeft();
        String rightMargin = TextUtils.isEmpty(this.baseView.getConfigMarginRight()) ? this.baseView.getRightMargin() : this.baseView.getConfigMarginRight();
        String topMargin = TextUtils.isEmpty(this.baseView.getConfigMarginTop()) ? this.baseView.getTopMargin() : this.baseView.getConfigMarginTop();
        String bottomMargin = TextUtils.isEmpty(this.baseView.getConfigMarginBottom()) ? this.baseView.getBottomMargin() : this.baseView.getConfigMarginBottom();
        int a2 = (int) g.a(this.view.getContext(), margin);
        int a3 = a2 == 0 ? (int) g.a(this.view.getContext(), leftMargin) : a2;
        int a4 = a2 == 0 ? (int) g.a(this.view.getContext(), rightMargin) : a2;
        int a5 = a2 == 0 ? (int) g.a(this.view.getContext(), topMargin) : a2;
        if (a2 == 0) {
            a2 = (int) g.a(this.view.getContext(), bottomMargin);
        }
        try {
            if (this.view.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.view.getLayoutParams();
                marginLayoutParams.setMargins(a3, a5, a4, a2);
                this.view.setLayoutParams(marginLayoutParams);
            }
        } catch (Exception e) {
            com.qumeng.overseas.advlib.__remote__.utils.bugman.a.a((Class) getClass(), "exp_ViewHelper_setMargin", (Throwable) e);
            e.printStackTrace();
        }
    }

    protected void setPadding() {
        int a2 = (int) g.a(this.view.getContext(), this.baseView.getPadding());
        int a3 = a2 == 0 ? (int) g.a(this.view.getContext(), this.baseView.getPaddingLeft()) : a2;
        int a4 = a2 == 0 ? (int) g.a(this.view.getContext(), this.baseView.getPaddingTop()) : a2;
        int a5 = a2 == 0 ? (int) g.a(this.view.getContext(), this.baseView.getPaddingRight()) : a2;
        if (a2 == 0) {
            a2 = (int) g.a(this.view.getContext(), this.baseView.getPaddingBottom());
        }
        this.view.setPadding(a3, a4, a5, a2);
    }

    protected void setShadow() {
        try {
            String shadowColor = this.baseView.getShadowColor();
            String shadowRadius = this.baseView.getShadowRadius();
            String radius = this.baseView.getRadius();
            String background = this.baseView.getBackground();
            int a2 = !TextUtils.isEmpty(radius) ? (int) g.a(this.view.getContext(), radius) : 0;
            if (!TextUtils.isEmpty(shadowColor) && !TextUtils.isEmpty(shadowRadius) && !TextUtils.isEmpty(background)) {
                c.a(this.view, Color.parseColor(background), a2, Color.parseColor(shadowColor), (int) g.a(this.view.getContext(), shadowRadius));
            } else {
                if (TextUtils.isEmpty(shadowColor) || TextUtils.isEmpty(shadowRadius)) {
                    return;
                }
                c.a(this.view, a2, Color.parseColor(shadowColor), (int) g.a(this.view.getContext(), shadowRadius));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.qumeng.overseas.advlib.__remote__.ui.banner.json2view.view.helper.Helper
    public void setViewProperties() {
        setVisible();
        setPadding();
        setMargin();
        setBackground(this.view);
        setClipChildren();
        setAlpha();
        setClick();
        if (TextUtils.isEmpty(this.baseView.getListenVideoPlaying())) {
            startViewAnimation(this.view, this.baseView.getViewAnimation());
        }
        this.view.post(new Runnable() { // from class: com.qumeng.overseas.advlib.__remote__.ui.banner.json2view.view.helper.ViewHelper.2
            @Override // java.lang.Runnable
            public void run() {
                ViewHelper.this.setBusiness();
                ViewHelper.this.setOnVideoPlayingListener();
            }
        });
        setTag();
        setShadow();
    }

    protected void setVisible() {
        Map<String, Integer> map;
        int visibleInt = getVisibleInt();
        if (this.view.getVisibility() != visibleInt) {
            this.view.setVisibility(visibleInt);
        }
        String showWithFeatureCode = this.baseView.getShowWithFeatureCode();
        String showWithOutFeatureCode = this.baseView.getShowWithOutFeatureCode();
        String showWithParams = this.baseView.getShowWithParams();
        String showWithoutParams = this.baseView.getShowWithoutParams();
        String showWithABConfig = this.baseView.getShowWithABConfig();
        if (TextUtils.isEmpty(showWithOutFeatureCode)) {
            if (!TextUtils.isEmpty(showWithFeatureCode)) {
                if (this.baseView.getAdsObject() == null || !this.baseView.getAdsObject().hasExpFeature(showWithFeatureCode)) {
                    hideView();
                } else {
                    this.view.setVisibility(0);
                }
            }
        } else if (this.baseView.getAdsObject() == null || this.baseView.getAdsObject().hasExpFeature(showWithOutFeatureCode)) {
            hideView();
        } else {
            this.view.setVisibility(0);
        }
        if (!TextUtils.isEmpty(showWithABConfig)) {
            XmlViewControlEntity z = com.qumeng.overseas.advlib.__remote__.framework.config.a.k().z();
            if (z == null || (map = z.viewVisibleMap) == null) {
                this.view.setVisibility(8);
            } else {
                Integer num = map.get(showWithABConfig);
                this.view.setVisibility((num != null ? num.intValue() : 0) == 1 ? 0 : 8);
            }
        }
        if (!TextUtils.isEmpty(showWithParams)) {
            if (showWithParams.contains("=")) {
                String[] split = showWithParams.split("=");
                if (split.length <= 1) {
                    this.view.setVisibility(8);
                    return;
                } else if (this.baseView.getAdsObject().getStash(split[0], "").toString().equals(split[1])) {
                    this.view.setVisibility(0);
                    return;
                } else {
                    this.view.setVisibility(8);
                    return;
                }
            }
            if (TextUtils.equals(showWithParams, "isDspAd")) {
                this.view.setVisibility(8);
                return;
            }
            Serializable stash = this.baseView.getAdsObject().getStash(showWithParams, "");
            if (stash == null || TextUtils.isEmpty(stash.toString())) {
                this.view.setVisibility(8);
                return;
            } else {
                this.view.setVisibility(0);
                return;
            }
        }
        if (TextUtils.isEmpty(showWithoutParams)) {
            return;
        }
        if (showWithoutParams.contains("=")) {
            String[] split2 = showWithoutParams.split("=");
            if (split2.length <= 1) {
                this.view.setVisibility(0);
                return;
            } else if (this.baseView.getAdsObject().getStash(split2[0], "").toString().equals(split2[1])) {
                this.view.setVisibility(8);
                return;
            } else {
                this.view.setVisibility(0);
                return;
            }
        }
        if (TextUtils.equals(showWithoutParams, "isDspAd")) {
            this.view.setVisibility(0);
            return;
        }
        Serializable stash2 = this.baseView.getAdsObject().getStash(showWithoutParams, "");
        if (stash2 == null || TextUtils.isEmpty(stash2.toString())) {
            this.view.setVisibility(0);
        } else {
            this.view.setVisibility(8);
        }
    }
}
