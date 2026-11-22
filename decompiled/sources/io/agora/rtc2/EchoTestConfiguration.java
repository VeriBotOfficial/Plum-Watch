package io.agora.rtc2;

import android.view.SurfaceView;

/* loaded from: classes6.dex */
public class EchoTestConfiguration {
    public String channelId;
    public boolean enableAudio;
    public boolean enableVideo;
    public int intervalInSeconds;
    public String token;
    public SurfaceView view;

    public EchoTestConfiguration() {
        this.intervalInSeconds = 2;
        this.view = null;
        this.enableAudio = true;
        this.enableVideo = true;
        this.token = null;
        this.channelId = null;
    }

    public EchoTestConfiguration(SurfaceView view, boolean enableAudio, boolean enableVideo, String token, String channelId) {
        this(view, enableAudio, enableVideo, token, channelId, 10);
    }

    public EchoTestConfiguration(SurfaceView view, boolean enableAudio, boolean enableVideo, String token, String channelId, int intervalInSeconds) {
        this.view = view;
        this.enableAudio = enableAudio;
        this.enableVideo = enableVideo;
        this.token = token;
        this.channelId = channelId;
        this.intervalInSeconds = intervalInSeconds;
    }
}
