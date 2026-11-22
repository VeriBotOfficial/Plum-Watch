package sg.bigo.ads.api;

import java.util.Map;

/* loaded from: classes7.dex */
public class SplashAdRequest extends b {
    public final int h;
    public final String i;

    public static class Builder extends c<Builder, SplashAdRequest> {
        private int mAppLogoResId;
        private String mAppName;

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // sg.bigo.ads.api.c
        public SplashAdRequest createAdRequest() {
            return new SplashAdRequest(this.mSlotId, this.mAppLogoResId, this.mAppName, this.mServerBidPayload);
        }

        public Builder withAppLogo(int i) {
            this.mAppLogoResId = i;
            return this;
        }

        public Builder withAppName(String str) {
            this.mAppName = str;
            return this;
        }
    }

    public SplashAdRequest(String str, int i, String str2, String str3) {
        super(str, str3);
        this.h = i;
        this.i = str2;
    }

    @Override // sg.bigo.ads.api.b
    public final int c() {
        return 12;
    }

    @Override // sg.bigo.ads.api.b
    public final Map<String, Object> d() {
        return null;
    }
}
