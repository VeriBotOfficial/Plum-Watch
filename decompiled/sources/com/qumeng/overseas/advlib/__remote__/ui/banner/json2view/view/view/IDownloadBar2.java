package com.qumeng.overseas.advlib.__remote__.ui.banner.json2view.view.view;

import com.qumeng.overseas.advlib.R;
import com.qumeng.overseas.advlib.__remote__.core.proto.utils.e;

/* loaded from: classes17.dex */
public class IDownloadBar2 extends IView {
    private String directDownload;
    private String downloadingText;
    private String forceBold;
    private String gradientColors;
    private String pendingStyle;
    private String progressBgColor;
    private String progressColor;
    String style;
    String textColor;
    String textSize;
    private String textStyle;
    private String withoutControl;

    /* renamed from: id, reason: collision with root package name */
    String f13087id = "downloadbar";
    private String defaultText = e.a().getResources().getString(R.string.qm_oversea_download_now_new);

    public String getDefaultText() {
        return this.defaultText;
    }

    public String getDirectDownload() {
        return this.directDownload;
    }

    public String getDownloadingText() {
        return this.downloadingText;
    }

    public String getForceBold() {
        return this.forceBold;
    }

    @Override // com.qumeng.overseas.advlib.__remote__.ui.banner.json2view.view.view.IView
    public String getGradientColors() {
        return this.gradientColors;
    }

    @Override // com.qumeng.overseas.advlib.__remote__.ui.banner.json2view.view.view.IView
    public String getId() {
        return this.f13087id;
    }

    public String getPendingStyle() {
        return this.pendingStyle;
    }

    public String getProgressBgColor() {
        return this.progressBgColor;
    }

    public String getProgressColor() {
        return this.progressColor;
    }

    public String getStyle() {
        return this.style;
    }

    public String getTextColor() {
        return this.textColor;
    }

    public String getTextSize() {
        return this.textSize;
    }

    public String getTextStyle() {
        return this.textStyle;
    }

    public String getWithoutControl() {
        return this.withoutControl;
    }

    public void setDefaultText(String str) {
        this.defaultText = str;
    }

    public void setDirectDownload(String str) {
        this.directDownload = str;
    }

    public void setDownloadingText(String str) {
        this.downloadingText = str;
    }

    public void setForceBold(String str) {
        this.forceBold = str;
    }

    @Override // com.qumeng.overseas.advlib.__remote__.ui.banner.json2view.view.view.IView
    public void setGradientColors(String str) {
        this.gradientColors = str;
    }

    @Override // com.qumeng.overseas.advlib.__remote__.ui.banner.json2view.view.view.IView
    public void setId(String str) {
        this.f13087id = str;
    }

    public void setPendingStyle(String str) {
        this.pendingStyle = str;
    }

    public void setProgressBgColor(String str) {
        this.progressBgColor = str;
    }

    public void setProgressColor(String str) {
        this.progressColor = str;
    }

    public void setStyle(String str) {
        this.style = str;
    }

    public void setTextColor(String str) {
        this.textColor = str;
    }

    public void setTextSize(String str) {
        this.textSize = str;
    }

    public void setTextStyle(String str) {
        this.textStyle = str;
    }

    public void setWithoutControl(String str) {
        this.withoutControl = str;
    }
}
