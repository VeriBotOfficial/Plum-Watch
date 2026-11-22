package io.agora.rtc2.video;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public class ChannelMediaRelayConfiguration {
    private Map<String, ChannelMediaInfo> destInfos;
    private ChannelMediaInfo srcInfo;

    public ChannelMediaRelayConfiguration() {
        this.srcInfo = null;
        this.destInfos = null;
        this.destInfos = new HashMap();
        this.srcInfo = new ChannelMediaInfo(null, null, 0);
    }

    public Map<String, ChannelMediaInfo> getDestChannelMediaInfos() {
        return this.destInfos;
    }

    public ChannelMediaInfo getSrcChannelMediaInfo() {
        return this.srcInfo;
    }

    public void removeDestChannelInfo(String channelName) {
        this.destInfos.remove(channelName);
    }

    public void setDestChannelInfo(String channelName, ChannelMediaInfo destInfo) {
        this.destInfos.put(channelName, destInfo);
    }

    public void setSrcChannelInfo(ChannelMediaInfo srcInfo) {
        this.srcInfo = srcInfo;
    }
}
