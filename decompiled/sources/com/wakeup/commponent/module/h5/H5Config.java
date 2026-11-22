package com.wakeup.commponent.module.h5;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class H5Config implements Serializable {
    private List<JsApi> apiList;
    private String content;
    private int expandImage;
    private String httpAuthHost;
    private String httpAuthPassword;
    private String httpAuthUsername;
    private boolean isFinish;
    private boolean isGoneStatusView;
    private boolean isShowTitle;
    private boolean isSupportZoom;
    private boolean showPageLoading;
    private String title;
    private TitleCallback titleCallback;
    private int titleImg;
    private String url;
    private boolean useJsHandleNativeBack;
    private int webBackgroundColor;

    private H5Config() {
    }

    public String getUrl() {
        return this.url;
    }

    public String getContent() {
        return this.content;
    }

    public String getTitle() {
        return this.title;
    }

    public List<JsApi> getApiList() {
        return this.apiList;
    }

    public boolean isSupportZoom() {
        return this.isSupportZoom;
    }

    public int getTitleImg() {
        return this.titleImg;
    }

    public int getExpandImage() {
        return this.expandImage;
    }

    public boolean isShowTitle() {
        return this.isShowTitle;
    }

    public boolean isGoneStatusView() {
        return this.isGoneStatusView;
    }

    public boolean isFinish() {
        return this.isFinish;
    }

    public boolean isUseJsHandleNativeBack() {
        return this.useJsHandleNativeBack;
    }

    public TitleCallback getTitleCallback() {
        return this.titleCallback;
    }

    public String getHttpAuthHost() {
        return this.httpAuthHost;
    }

    public String getHttpAuthUsername() {
        return this.httpAuthUsername;
    }

    public String getHttpAuthPassword() {
        return this.httpAuthPassword;
    }

    public int getWebBackgroundColor() {
        return this.webBackgroundColor;
    }

    public boolean isShowPageLoading() {
        return this.showPageLoading;
    }

    public void setTitleCallback(TitleCallback titleCallback) {
        this.titleCallback = titleCallback;
    }

    public static class Builder {
        private String content;
        private int expandImage;
        private String httpAuthHost;
        private String httpAuthPassword;
        private String httpAuthUsername;
        private boolean isSupportZoom;
        private boolean showPageLoading;
        private String title;
        private TitleCallback titleCallback;
        private int titleImg;
        private String url;
        private int webBackgroundColor;
        private final List<JsApi> apiList = new ArrayList();
        private boolean isShowTitle = true;
        private boolean isGoneStatusView = false;
        private boolean isFinish = false;
        private boolean useJsHandleNativeBack = false;

        public Builder setTitle(String str) {
            this.title = str;
            return this;
        }

        public Builder setUrl(String str) {
            this.url = str;
            return this;
        }

        public Builder setContent(String str) {
            this.content = str;
            return this;
        }

        public Builder setTitleImg(int i) {
            this.titleImg = i;
            return this;
        }

        public Builder isSupportZoom(boolean z) {
            this.isSupportZoom = z;
            return this;
        }

        public Builder setExpandImage(int i) {
            this.expandImage = i;
            return this;
        }

        public Builder addApi(JsApi jsApi) {
            if (jsApi != null && !this.apiList.contains(jsApi)) {
                this.apiList.add(jsApi);
            }
            return this;
        }

        public Builder setShowTitle(boolean z) {
            this.isShowTitle = z;
            return this;
        }

        public Builder setGoneStatusView(boolean z) {
            this.isGoneStatusView = z;
            return this;
        }

        public Builder isFinish(boolean z) {
            this.isFinish = z;
            return this;
        }

        public Builder setUseJsHandleNativeBack(boolean z) {
            this.useJsHandleNativeBack = z;
            return this;
        }

        public Builder setTitleCallback(TitleCallback titleCallback) {
            this.titleCallback = titleCallback;
            return this;
        }

        public Builder setHttpAuth(String str, String str2, String str3) {
            this.httpAuthHost = str;
            this.httpAuthUsername = str2;
            this.httpAuthPassword = str3;
            return this;
        }

        public Builder setWebBackgroundColor(int i) {
            this.webBackgroundColor = i;
            return this;
        }

        public Builder setShowPageLoading(boolean z) {
            this.showPageLoading = z;
            return this;
        }

        public H5Config build() {
            H5Config h5Config = new H5Config();
            h5Config.title = this.title;
            h5Config.url = this.url;
            h5Config.content = this.content;
            h5Config.apiList = this.apiList;
            h5Config.titleImg = this.titleImg;
            h5Config.expandImage = this.expandImage;
            h5Config.isShowTitle = this.isShowTitle;
            h5Config.isGoneStatusView = this.isGoneStatusView;
            h5Config.isFinish = this.isFinish;
            h5Config.isSupportZoom = this.isSupportZoom;
            h5Config.httpAuthHost = this.httpAuthHost;
            h5Config.httpAuthUsername = this.httpAuthUsername;
            h5Config.httpAuthPassword = this.httpAuthPassword;
            h5Config.webBackgroundColor = this.webBackgroundColor;
            h5Config.showPageLoading = this.showPageLoading;
            h5Config.useJsHandleNativeBack = this.useJsHandleNativeBack;
            h5Config.titleCallback = this.titleCallback;
            return h5Config;
        }
    }
}
