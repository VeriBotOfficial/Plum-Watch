package io.agora.rtc2.video;

/* loaded from: classes6.dex */
public class ChannelMediaInfo {
    public String channelName;
    public String token;
    public int uid;

    public ChannelMediaInfo(String channelName, String token, int uid) {
        this.channelName = channelName;
        this.token = token;
        this.uid = uid;
    }

    public String getChannelName() {
        return this.channelName;
    }

    public String getToken() {
        return this.token;
    }

    public int getUid() {
        return this.uid;
    }
}
