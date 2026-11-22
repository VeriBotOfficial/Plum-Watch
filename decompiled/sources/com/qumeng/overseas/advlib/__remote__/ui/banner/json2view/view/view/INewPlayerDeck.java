package com.qumeng.overseas.advlib.__remote__.ui.banner.json2view.view.view;

/* loaded from: classes17.dex */
public class INewPlayerDeck extends IView {
    public static final String idDesc = "newPlayerDeck";
    private String autoPlay;
    private String endType;
    private String endviewStyle;
    private String excludeCorner;

    /* renamed from: id, reason: collision with root package name */
    private String f13089id = idDesc;
    private String popupwindowType = "1";
    private String previewStyle;
    private String scaleType;
    private String showDownload;
    private String showProgress;

    public static String getIdDesc() {
        return idDesc;
    }

    public String getAutoPlay() {
        return this.autoPlay;
    }

    public String getEndType() {
        return this.endType;
    }

    public String getEndviewStyle() {
        return this.endviewStyle;
    }

    public String getExcludeCorner() {
        return this.excludeCorner;
    }

    @Override // com.qumeng.overseas.advlib.__remote__.ui.banner.json2view.view.view.IView
    public String getId() {
        return this.f13089id;
    }

    public String getPopupwindowType() {
        return this.popupwindowType;
    }

    public String getPreviewStyle() {
        return this.previewStyle;
    }

    public String getScaleType() {
        return this.scaleType;
    }

    public String getShowDownload() {
        return this.showDownload;
    }

    public String getShowProgress() {
        return this.showProgress;
    }

    public void setAutoPlay(String str) {
        this.autoPlay = str;
    }

    public void setEndType(String str) {
        this.endType = str;
    }

    public void setEndviewStyle(String str) {
        this.endviewStyle = str;
    }

    public void setExcludeCorner(String str) {
        this.excludeCorner = str;
    }

    @Override // com.qumeng.overseas.advlib.__remote__.ui.banner.json2view.view.view.IView
    public void setId(String str) {
        this.f13089id = str;
    }

    public void setPopupwindowType(String str) {
        this.popupwindowType = str;
    }

    public void setPreviewStyle(String str) {
        this.previewStyle = str;
    }

    public void setScaleType(String str) {
        this.scaleType = str;
    }

    public void setShowDownload(String str) {
        this.showDownload = str;
    }

    public void setShowProgress(String str) {
        this.showProgress = str;
    }
}
