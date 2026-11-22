package com.xmly.businesssdk.player.core.interceptor;

/* loaded from: classes3.dex */
public interface PlayerInterceptor {

    public static class DefaultPlayerInterceptor implements PlayerInterceptor {
        @Override // com.xmly.businesssdk.player.core.interceptor.PlayerInterceptor
        public String convertAudioUrl(String str) {
            return str;
        }
    }

    String convertAudioUrl(String str);
}
