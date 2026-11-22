package com.qumeng.overseas.advlib.__remote__.ui.banner.json2view.view.view.overrideview;

import android.content.Context;
import android.gov.nist.core.Separators;
import android.graphics.Color;
import android.graphics.Paint;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.qumeng.overseas.advlib.R;
import com.qumeng.overseas.advlib.__remote__.core.proto.response.AdsObject;
import com.qumeng.overseas.advlib.__remote__.core.proto.throwable.NoSuchMaterialException;
import com.qumeng.overseas.advlib.__remote__.core.proto.utils.h;
import com.qumeng.overseas.advlib.__remote__.framework.DownloadManUtils.InstallMan;
import com.qumeng.overseas.advlib.__remote__.framework.DownloadManUtils.c;
import com.qumeng.overseas.advlib.__remote__.ui.banner.json2view.eventlistener.b;
import com.qumeng.overseas.advlib.__remote__.ui.banner.json2view.view.utils.h;
import com.qumeng.overseas.advlib.__remote__.ui.elements.IProgressIndicator;
import com.qumeng.overseas.advlib.__remote__.ui.elements.RoundRectButton;
import com.qumeng.overseas.advlib.__remote__.ui.elements.d;
import com.qumeng.overseas.advlib.__remote__.ui.elements.e;
import com.qumeng.overseas.advlib.__remote__.ui.elements.g;
import com.qumeng.overseas.advlib.__remote__.ui.elements.i;
import com.qumeng.overseas.advlib.__remote__.ui.elements.l;
import com.qumeng.overseas.advlib.__remote__.ui.elements.n;
import com.qumeng.overseas.advlib.__remote__.ui.elements.t;
import com.qumeng.overseas.advlib.__remote__.utils.bugman.a;
import com.qumeng.overseas.advlib.__remote__.utils.q;
import java.util.HashMap;

/* loaded from: classes17.dex */
public class DownloadBar2 extends d {
    public static final String STYLE_BANNER = "banner";
    public static final String STYLE_INCITE_DOWNLOAD_DIALOG = "incite_download_dialog";
    public static final String STYLE_LANDPAGE_DOWNLOAD = "land_page_download";
    public static final String STYLE_LAND_PAGE = "land_page";
    public static final String STYLE_TREASURE_TASK = "treasure_task";
    public static final String STYLE_VIDEO_END = "video_end";
    private String defaultText;
    private String mPageType;
    boolean stroke;
    String style;
    boolean textStyleBold;
    TriggerClickCallBack triggerClickCallBack;
    i.f triggerProperty;
    boolean withoutControl;

    class DownloadTrigger2 extends i {
        String style;

        public DownloadTrigger2(Context context) {
            super(context);
        }

        private boolean hasStyle() {
            return !TextUtils.isEmpty(this.style);
        }

        @Override // com.qumeng.overseas.advlib.__remote__.ui.elements.i
        protected void fillBackground(Context context, AdsObject adsObject, int i, Paint.Style style) {
            if (hasStyle()) {
                super.fillBackground(context, adsObject, i, style);
            } else if (TextUtils.isEmpty(DownloadBar2.this.controlColor)) {
                super.fillBackground(context, adsObject, i, style);
            } else {
                super.fillBackground(context, adsObject, Color.parseColor(DownloadBar2.this.controlColor), DownloadBar2.this.stroke ? Paint.Style.STROKE : Paint.Style.FILL);
            }
        }

        @Override // com.qumeng.overseas.advlib.__remote__.ui.elements.i
        protected int getControlColor(int i, Paint.Style style) {
            return hasStyle() ? super.getControlColor(i, style) : Color.parseColor(DownloadBar2.this.controlColor);
        }

        @Override // com.qumeng.overseas.advlib.__remote__.ui.elements.i
        protected String getInitHintText(AdsObject adsObject) {
            try {
                if (adsObject.getNativeMaterial().getInteractionType() == 1) {
                    return getInitHintText(adsObject, getContext().getResources().getString(R.string.qm_oversea_view_details));
                }
            } catch (NoSuchMaterialException e) {
                e.printStackTrace();
            }
            return super.getInitHintText(adsObject);
        }

        public AdsObject getmAdsObject() {
            return this.mAdsObject;
        }

        public void init() {
            init(getContext(), DownloadBar2.this.adsObject);
        }

        @Override // com.qumeng.overseas.advlib.__remote__.ui.elements.i
        public void performTriggerClick() {
            super.performTriggerClick();
            TriggerClickCallBack triggerClickCallBack = this.triggerClickCallBack;
            if (triggerClickCallBack != null) {
                triggerClickCallBack.clicked();
            }
        }

        @Override // com.qumeng.overseas.advlib.__remote__.ui.elements.i
        protected void setGravity() {
            setGravity(17);
        }

        public void setStyle(String str) {
            this.style = str;
        }

        @Override // com.qumeng.overseas.advlib.__remote__.ui.elements.i
        protected void setTriggerBackground(Context context, Paint.Style style, int i) {
            if (hasStyle()) {
                super.setTriggerBackground(context, style, i);
            }
        }

        public void setmAdsObject(AdsObject adsObject) {
            this.mAdsObject = adsObject;
        }

        @Override // com.qumeng.overseas.advlib.__remote__.ui.elements.i
        public void init(Context context, AdsObject adsObject) {
            DownloadTrigger2 downloadTrigger2;
            AdsObject adsObject2;
            e eVar;
            LinearLayout linearLayout = new LinearLayout(context);
            this.mDownBtn = linearLayout;
            linearLayout.setGravity(17);
            if (hasStyle()) {
                String str = this.style;
                str.hashCode();
                if (str.equals("smallSpaceStyle")) {
                    defaultStyle(context, adsObject, Color.parseColor(DownloadBar2.this.controlColor));
                } else {
                    defaultStyle(context, adsObject);
                }
                downloadTrigger2 = this;
                adsObject2 = adsObject;
            } else {
                DownloadBar2 downloadBar2 = DownloadBar2.this;
                if (downloadBar2.withoutControl) {
                    int parseColor = Color.parseColor(downloadBar2.controlColor);
                    DownloadBar2 downloadBar22 = DownloadBar2.this;
                    downloadTrigger2 = this;
                    adsObject2 = adsObject;
                    downloadTrigger2.withoutControl(context, adsObject2, parseColor, downloadBar22.stroke ? Paint.Style.STROKE : Paint.Style.FILL, downloadBar22.triggerProperty.isForceBold());
                } else {
                    downloadTrigger2 = this;
                    adsObject2 = adsObject;
                    fillBackground(context, adsObject2, Color.parseColor(downloadBar2.controlColor), DownloadBar2.this.stroke ? Paint.Style.STROKE : Paint.Style.FILL);
                }
            }
            try {
                if (adsObject2.getNativeMaterial().getInteractionType() != 1 || (eVar = downloadTrigger2.mControl) == null) {
                    return;
                }
                eVar.setVisibility(8);
            } catch (NoSuchMaterialException e) {
                e.printStackTrace();
            }
        }
    }

    public interface TriggerClickCallBack {
        void clicked();
    }

    static class VideoEndDownloadTrigger extends i {
        private RoundRectButton downBtn;
        private int fillColor;
        long lastClickTime;
        private String mPageType;
        private int textColor;

        public VideoEndDownloadTrigger(Context context, int i, int i2) {
            super(context);
            this.lastClickTime = 0L;
            this.mPageType = "";
            this.textColor = i;
            this.fillColor = i2;
        }

        private void reportEvent(String str, String str2) {
            HashMap hashMap = new HashMap();
            hashMap.put("opt_pageType", this.mPageType);
            hashMap.put("opt_actionType", str2);
            hashMap.put("op1", str);
            h.a(getContext(), this.mAdsObject, hashMap);
        }

        @Override // com.qumeng.overseas.advlib.__remote__.ui.elements.i
        public synchronized void UpdateProgress(int i, int i2) {
            switch (i) {
                case 6:
                    this.downBtn.setText(R.string.qm_oversea_local_immediate_experience);
                    break;
                case c.e /* 47789 */:
                    this.downBtn.setText(R.string.qm_oversea_local_download_error);
                    break;
                case c.f /* 55981 */:
                    this.downBtn.setText(R.string.qm_oversea_immediate_installation);
                    break;
                case c.i /* 55995 */:
                case c.f12915a /* 64173 */:
                    this.downBtn.setText(R.string.qm_oversea_download_now);
                    break;
                case 64206:
                    this.downBtn.setText(R.string.qm_oversea_local_continue_download);
                    break;
                case 64222:
                    this.downBtn.setText(i2 + Separators.PERCENT);
                    break;
            }
        }

        @Override // com.qumeng.overseas.advlib.__remote__.ui.elements.i
        public void init(Context context, AdsObject adsObject) {
            this.mAdsObject = adsObject;
            if (com.qumeng.overseas.advlib.__remote__.framework.videoplayer.c.Z0.equals(this.mPageType)) {
                this.fillColor = Color.parseColor("#FFDB00");
                this.textColor = Color.parseColor("#764412");
            }
            RoundRectButton build = new RoundRectButton.b(context).textSize(this.textSize).textColor(this.textColor).fillColor(this.fillColor).radius(0.1f).build();
            this.downBtn = build;
            build.setGravity(17);
            this.downBtn.setText(adsObject.native_material.interaction_type != 2 ? R.string.qm_oversea_view_details : R.string.qm_oversea_download_now);
            addView(this.downBtn, new LinearLayout.LayoutParams(-1, -1));
        }

        @Override // com.qumeng.overseas.advlib.__remote__.ui.elements.i, android.view.View
        public boolean onTouchEvent(MotionEvent motionEvent) {
            try {
                if (motionEvent.getAction() == 1 && System.currentTimeMillis() - this.lastClickTime >= 1500) {
                    performTriggerClick();
                }
            } catch (Exception e) {
                e.printStackTrace();
                a.a(this, "exp_DownloadBar2_onTouchEvent", String.valueOf(e.getMessage()), e);
            }
            return true;
        }

        @Override // com.qumeng.overseas.advlib.__remote__.ui.elements.i
        public void performTriggerClick() {
            try {
                TriggerClickCallBack triggerClickCallBack = this.triggerClickCallBack;
                if (triggerClickCallBack != null) {
                    triggerClickCallBack.clicked();
                }
                AdsObject adsObject = this.mAdsObject;
                if (adsObject != null) {
                    adsObject.onClickedReport();
                    if (com.qumeng.overseas.advlib.__remote__.core.proto.response.presenter.chain.a.a(getContext(), this.mAdsObject)) {
                        return;
                    }
                    String str = "page";
                    AdsObject adsObject2 = this.mAdsObject;
                    if (adsObject2.native_material.interaction_type == 2) {
                        this.canPause = true;
                        InstallMan installMan = d.installMans.get(adsObject2.getDownloadKey());
                        if (installMan != null) {
                            this.mAdsObject.setInstallMan(installMan);
                        }
                        this.mAdsObject.doStartDownload(getContext(), this.mDownloadBar);
                        str = "download";
                    } else {
                        ((View.OnClickListener) q.c(b.a(com.qumeng.overseas.advlib.__remote__.ui.banner.json2view.eventlistener.c.f, getContext(), this.mAdsObject))).onClick(this.mDownBtn);
                    }
                    String str2 = com.qumeng.overseas.advlib.__remote__.framework.videoplayer.c.N0;
                    if (String.valueOf(this.mPageType).equals(com.qumeng.overseas.advlib.__remote__.framework.videoplayer.c.Z0)) {
                        str2 = com.qumeng.overseas.advlib.__remote__.framework.videoplayer.c.M0;
                        this.mPageType = com.qumeng.overseas.advlib.__remote__.framework.videoplayer.c.Y0;
                    }
                    reportEvent(str2, str);
                }
            } catch (Exception unused) {
            }
        }

        public void setPageType(String str) {
            this.mPageType = str;
        }
    }

    public DownloadBar2(Context context) {
        super(context);
        this.textStyleBold = true;
        this.withoutControl = false;
        this.stroke = false;
        this.defaultText = com.qumeng.overseas.advlib.__remote__.core.proto.utils.e.a().getResources().getString(R.string.qm_oversea_download_now_new);
        this.mPageType = "";
    }

    private void initBanner() {
        this.downloadTrigger = new com.qumeng.overseas.advlib.__remote__.ui.elements.downloadBar.a(getContext());
        if (this.triggerProperty == null) {
            this.triggerProperty = new i.f();
        }
        this.triggerProperty.setIndicatorMap(new h.b().append(IProgressIndicator.ProgressIndicatorState.Pending, com.qumeng.overseas.advlib.__remote__.core.proto.utils.e.a().getResources().getString(R.string.qm_oversea_download_now)).append(IProgressIndicator.ProgressIndicatorState.Running, "%d%%").append(IProgressIndicator.ProgressIndicatorState.Finished, com.qumeng.overseas.advlib.__remote__.core.proto.utils.e.a().getResources().getString(R.string.qm_oversea_immediate_installation)).append(IProgressIndicator.ProgressIndicatorState.Error, com.qumeng.overseas.advlib.__remote__.core.proto.utils.e.a().getResources().getString(R.string.qm_oversea_local_retry)).append(IProgressIndicator.ProgressIndicatorState.Pause, com.qumeng.overseas.advlib.__remote__.core.proto.utils.e.a().getResources().getString(R.string.qm_oversea_local_continue_download)).append(IProgressIndicator.ProgressIndicatorState.Installed, com.qumeng.overseas.advlib.__remote__.core.proto.utils.e.a().getResources().getString(R.string.qm_oversea_open_immediately)).append(IProgressIndicator.ProgressIndicatorState.Canceled, com.qumeng.overseas.advlib.__remote__.core.proto.utils.e.a().getResources().getString(R.string.qm_oversea_download_now)).getMap());
        ((g) this.downloadTrigger).setTriggerProperty(this.triggerProperty);
        this.downloadTrigger.setmDownloadBar(this);
        ((g) this.downloadTrigger).setmAdsObject(this.adsObject);
        this.downloadTrigger.init(getContext(), this.adsObject);
    }

    private void initInciteDownloadDialog() {
        this.downloadTrigger = new l(getContext());
        if (this.triggerProperty == null) {
            this.triggerProperty = new i.f();
        }
        this.triggerProperty.setDefaultText(this.defaultText);
        ((g) this.downloadTrigger).setTriggerProperty(this.triggerProperty);
        this.downloadTrigger.setmDownloadBar(this);
        ((g) this.downloadTrigger).setmAdsObject(this.adsObject);
        this.downloadTrigger.init(getContext(), this.adsObject);
    }

    private void initLandPageDownloadProgress() {
        this.downloadTrigger = new n(getContext());
        if (this.triggerProperty == null) {
            this.triggerProperty = new i.f();
        }
        ((g) this.downloadTrigger).setTriggerProperty(this.triggerProperty);
        this.downloadTrigger.setmDownloadBar(this);
        ((g) this.downloadTrigger).setmAdsObject(this.adsObject);
        this.downloadTrigger.init(getContext(), this.adsObject);
    }

    private void initVideoEndDownloadTrigger() {
        VideoEndDownloadTrigger videoEndDownloadTrigger = new VideoEndDownloadTrigger(getContext(), -1, Color.parseColor("#00C882"));
        this.downloadTrigger = videoEndDownloadTrigger;
        videoEndDownloadTrigger.textSize = this.textSize;
        videoEndDownloadTrigger.setmDownloadBar(this);
        ((VideoEndDownloadTrigger) this.downloadTrigger).setPageType(this.mPageType);
        this.downloadTrigger.init(getContext(), this.adsObject);
    }

    public void downLoadInit() {
        DownloadBarInit(this.adsObject);
    }

    public AdsObject getAdsObject() {
        return this.adsObject;
    }

    public TriggerClickCallBack getTriggerClickCallBack() {
        return this.triggerClickCallBack;
    }

    public i.f getTriggerProperty() {
        return this.triggerProperty;
    }

    @Override // com.qumeng.overseas.advlib.__remote__.ui.elements.d
    public void initDownloadTrigger(AdsObject adsObject) {
        if (String.valueOf(this.style).equals(STYLE_VIDEO_END)) {
            initVideoEndDownloadTrigger();
        } else if (STYLE_INCITE_DOWNLOAD_DIALOG.equals(this.style)) {
            initInciteDownloadDialog();
        } else if (STYLE_LAND_PAGE.equals(this.style)) {
            initLandPageDownloadProgress();
        } else if ("banner".equals(this.style)) {
            initBanner();
        } else if (STYLE_TREASURE_TASK.equals(this.style)) {
            this.downloadTrigger = com.qumeng.overseas.advlib.__remote__.ui.elements.h.a(getContext(), this.triggerProperty, this, adsObject, new t(getContext()));
        } else {
            DownloadTrigger2 downloadTrigger2 = new DownloadTrigger2(getContext());
            this.downloadTrigger = downloadTrigger2;
            downloadTrigger2.textSize = this.textSize;
            downloadTrigger2.textStyleBold = this.textStyleBold;
            downloadTrigger2.setmDownloadBar(this);
            if (!TextUtils.isEmpty(this.defaultText)) {
                this.downloadTrigger.setDefaultText(this.defaultText);
            }
            ((DownloadTrigger2) this.downloadTrigger).setmAdsObject(adsObject);
            ((DownloadTrigger2) this.downloadTrigger).setStyle(this.style);
            ((DownloadTrigger2) this.downloadTrigger).init();
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(layoutParams.width == -2 ? -2 : -1, layoutParams.height == -2 ? -2 : -1);
        layoutParams2.addRule(13);
        addView(this.downloadTrigger, layoutParams2);
    }

    @Override // com.qumeng.overseas.advlib.__remote__.ui.elements.d
    public void initSignal(AdsObject adsObject) {
    }

    public DownloadBar2 setAdsObject(AdsObject adsObject) {
        this.adsObject = adsObject;
        return this;
    }

    public void setControlAndTextColor(String str, boolean z) {
        this.controlColor = str;
        this.stroke = z;
    }

    public void setDefaultText(String str) {
        this.defaultText = str;
    }

    public void setPageType(String str) {
        this.mPageType = str;
    }

    public DownloadBar2 setStyle(String str) {
        this.style = str;
        return this;
    }

    public void setTextSize(int i) {
        this.textSize = i;
    }

    public void setTextStyleBold(boolean z) {
        this.textStyleBold = z;
    }

    public void setTriggerClickCallBack(TriggerClickCallBack triggerClickCallBack) {
        this.triggerClickCallBack = triggerClickCallBack;
    }

    public void setTriggerProperty(i.f fVar) {
        this.triggerProperty = fVar;
    }

    public void setWithoutControl(boolean z) {
        this.withoutControl = z;
    }
}
