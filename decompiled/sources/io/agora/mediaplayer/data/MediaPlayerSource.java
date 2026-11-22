package io.agora.mediaplayer.data;

import io.agora.mediaplayer.IMediaPlayerCustomDataProvider;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes6.dex */
public class MediaPlayerSource {
    Boolean isAgoraSource;
    Boolean isLiveSource;
    long startPos = 0;
    boolean enableCache = false;
    boolean enableMultiAudioTrack = false;
    String url = null;
    String uri = null;
    boolean autoPlay = true;
    IMediaPlayerCustomDataProvider provider = null;

    public void enableAgoraSource(boolean isAgoraSource) {
        this.isAgoraSource = Boolean.valueOf(isAgoraSource);
    }

    public void enableLiveSource(boolean isLiveSource) {
        this.isLiveSource = Boolean.valueOf(isLiveSource);
    }

    public IMediaPlayerCustomDataProvider getProvider() {
        return this.provider;
    }

    public long getStartPos() {
        return this.startPos;
    }

    public String getUri() {
        return this.uri;
    }

    public String getUrl() {
        return this.url;
    }

    public Boolean isAgoraSource() {
        return this.isAgoraSource;
    }

    public boolean isAutoPlay() {
        return this.autoPlay;
    }

    public boolean isEnableCache() {
        return this.enableCache;
    }

    public boolean isEnableMultiAudioTrack() {
        return this.enableMultiAudioTrack;
    }

    public Boolean isLiveSource() {
        return this.isLiveSource;
    }

    public void setAutoPlay(boolean autoPlay) {
        this.autoPlay = autoPlay;
    }

    public void setEnableCache(boolean enableCache) {
        this.enableCache = enableCache;
    }

    public void setEnableMultiAudioTrack(boolean enableMultiAudioTrack) {
        this.enableMultiAudioTrack = enableMultiAudioTrack;
    }

    public void setProvider(IMediaPlayerCustomDataProvider provider) {
        this.provider = provider;
    }

    public void setStartPos(long startPos) {
        this.startPos = startPos;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String toString() {
        StringBuilder append = new StringBuilder("MediaPlayerSource{url='").append(this.url).append("', uri='").append(this.uri).append("', startPos=").append(this.startPos).append(", enableCache=").append(this.enableCache).append(", autoPlay=").append(this.autoPlay).append(", enableMultiAudioTrack=").append(this.enableMultiAudioTrack).append(", isLiveSource=");
        Boolean bool = this.isLiveSource;
        StringBuilder append2 = append.append(bool != null ? Boolean.valueOf(bool.booleanValue()) : null).append(", isAgoraSource=");
        Boolean bool2 = this.isAgoraSource;
        return append2.append(bool2 != null ? Boolean.valueOf(bool2.booleanValue()) : null).append(", provider=").append(this.provider).append(AbstractJsonLexerKt.END_OBJ).toString();
    }
}
