package com.baidu.mapapi.tts;

import android.content.Context;

/* JADX INFO: loaded from: classes15.dex */
public class WNTTsInitConfig {
    public String appKey;
    public String authsn;
    public Context context;
    public String secretKey;

    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Context f8192a;
        private String b;
        private String c;
        private String d;

        public Builder appKey(String str) {
            this.b = str;
            return this;
        }

        public Builder authSn(String str) {
            this.d = str;
            return this;
        }

        public WNTTsInitConfig build() {
            return new WNTTsInitConfig(this.f8192a, this.b, this.c, this.d);
        }

        public Builder context(Context context) {
            this.f8192a = context;
            return this;
        }

        public Builder secretKey(String str) {
            this.c = str;
            return this;
        }
    }

    private WNTTsInitConfig(Context context, String str, String str2, String str3) {
        this.context = context;
        this.appKey = str;
        this.secretKey = str2;
        this.authsn = str3;
    }
}
