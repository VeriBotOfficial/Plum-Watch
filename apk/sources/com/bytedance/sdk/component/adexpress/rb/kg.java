package com.bytedance.sdk.component.adexpress.rb;

/* JADX INFO: loaded from: classes15.dex */
public interface kg {
    String adInfo();

    String appInfo();

    void changeVideoState(String str);

    void clickEvent(String str);

    void dynamicTrack(String str);

    void fxn(String str);

    String getCurrentVideoState();

    String getData(String str);

    String getTemplateInfo();

    void initRenderFinish();

    void muteVideo(String str);

    void renderDidFinish(String str);

    void skipVideo();

    void videoFrameChanged(String str);
}
