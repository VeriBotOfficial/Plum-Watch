package io.agora.rtc2.live;

import androidx.media3.extractor.OpusUtil;
import com.wakeup.feature.device.white.record.PcmAudioUtil;
import io.agora.rtc2.video.AgoraImage;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes6.dex */
public class LiveTranscoding {
    private ArrayList<AgoraImage> backgroundImageList;

    @Deprecated
    public int userCount;
    private ArrayList<AgoraImage> watermarkList;
    public int width = 360;
    public int height = 640;
    public int videoBitrate = 400;
    public VideoCodecProfileType videoCodecProfile = VideoCodecProfileType.HIGH;
    public VideoCodecType videoCodecType = VideoCodecType.H264;
    public int videoGop = 30;
    public int videoFramerate = 15;

    @Deprecated
    public boolean lowLatency = false;
    public AudioSampleRateType audioSampleRate = AudioSampleRateType.TYPE_44100;
    public int audioBitrate = 48;
    public int audioChannels = 1;
    public AudioCodecProfileType audioCodecProfile = AudioCodecProfileType.LC_AAC;
    private Map<String, Boolean> advancedFeatures = new HashMap();

    @Deprecated
    public int backgroundColor = -16777216;
    public String userConfigExtraInfo = null;

    @Deprecated
    public String metadata = null;
    private Map<Integer, TranscodingUser> transcodingUsers = new HashMap();

    public enum AudioCodecProfileType {
        LC_AAC(0),
        HE_AAC(1),
        HE_AAC_V2(2);

        private int value;

        AudioCodecProfileType(int v) {
            this.value = v;
        }

        public static int getValue(AudioCodecProfileType type) {
            return type.value;
        }
    }

    public enum AudioSampleRateType {
        TYPE_32000(PcmAudioUtil.PCM_BYTES_PER_SEC),
        TYPE_44100(44100),
        TYPE_48000(OpusUtil.SAMPLE_RATE);

        private int value;

        AudioSampleRateType(int v) {
            this.value = v;
        }

        public static int getValue(AudioSampleRateType type) {
            return type.value;
        }
    }

    public static class TranscodingUser {
        public int audioChannel;
        public int height;
        public String userId;
        public int width;
        public int x;
        public int y;
        public int zOrder;
        public int uid = 0;
        public float alpha = 1.0f;
    }

    public enum VideoCodecProfileType {
        BASELINE(66),
        MAIN(77),
        HIGH(100);

        private int value;

        VideoCodecProfileType(int v) {
            this.value = v;
        }

        public static int getValue(VideoCodecProfileType type) {
            return type.value;
        }
    }

    public enum VideoCodecType {
        H264(1),
        H265(2);

        private int value;

        VideoCodecType(int v) {
            this.value = v;
        }

        public static int getValue(VideoCodecType type) {
            return type.value;
        }
    }

    public void addBackgroundImage(AgoraImage backgroundImage) {
        if (this.backgroundImageList == null) {
            this.backgroundImageList = new ArrayList<>();
        }
        this.backgroundImageList.add(backgroundImage);
    }

    public int addUser(TranscodingUser user) {
        if (user == null) {
            return -2;
        }
        this.transcodingUsers.put(Integer.valueOf(user.uid), user);
        this.userCount = this.transcodingUsers.size();
        return 0;
    }

    public void addWatermark(AgoraImage watermark) {
        if (this.watermarkList == null) {
            this.watermarkList = new ArrayList<>();
        }
        this.watermarkList.add(watermark);
    }

    public Map<String, Boolean> getAdvancedFeatures() {
        return this.advancedFeatures;
    }

    public int getBackgroundColor() {
        return this.backgroundColor;
    }

    public ArrayList<AgoraImage> getBackgroundImageList() {
        return this.backgroundImageList;
    }

    @Deprecated
    public int getBlue() {
        return this.backgroundColor & 255;
    }

    @Deprecated
    public int getGreen() {
        return (this.backgroundColor >> 8) & 255;
    }

    @Deprecated
    public int getRed() {
        return (this.backgroundColor >> 16) & 255;
    }

    public int getUserCount() {
        return this.transcodingUsers.size();
    }

    public final ArrayList<TranscodingUser> getUsers() {
        return new ArrayList<>(this.transcodingUsers.values());
    }

    public ArrayList<AgoraImage> getWatermarkList() {
        return this.watermarkList;
    }

    public boolean removeBackgroundImage(AgoraImage backgroundImage) {
        ArrayList<AgoraImage> arrayList = this.backgroundImageList;
        if (arrayList == null) {
            return false;
        }
        return arrayList.remove(backgroundImage);
    }

    public int removeUser(int uid) {
        if (!this.transcodingUsers.containsKey(Integer.valueOf(uid))) {
            return -2;
        }
        this.transcodingUsers.remove(Integer.valueOf(uid));
        this.userCount = this.transcodingUsers.size();
        return 0;
    }

    public boolean removeWatermark(AgoraImage watermark) {
        ArrayList<AgoraImage> arrayList = this.watermarkList;
        if (arrayList == null) {
            return false;
        }
        return arrayList.remove(watermark);
    }

    public void setAdvancedFeatures(String featureName, Boolean opened) {
        this.advancedFeatures.put(featureName, opened);
    }

    public void setBackgroundColor(int color) {
        this.backgroundColor = color;
    }

    public void setBackgroundColor(int red, int green, int blue) {
        this.backgroundColor = (red << 16) | (green << 8) | blue;
    }

    @Deprecated
    public void setBlue(int blue) {
        this.backgroundColor = blue | (getRed() << 16) | (getGreen() << 8);
    }

    @Deprecated
    public void setGreen(int green) {
        int i = green << 8;
        this.backgroundColor = i | (getRed() << 16) | getBlue();
    }

    @Deprecated
    public void setRed(int red) {
        this.backgroundColor = (red << 16) | (getGreen() << 8) | getBlue();
    }

    public void setUsers(ArrayList<TranscodingUser> users) {
        this.transcodingUsers.clear();
        if (users != null) {
            Iterator<TranscodingUser> it = users.iterator();
            while (it.hasNext()) {
                TranscodingUser next = it.next();
                this.transcodingUsers.put(Integer.valueOf(next.uid), next);
            }
        }
        this.userCount = this.transcodingUsers.size();
    }

    public void setUsers(Map<Integer, TranscodingUser> users) {
        this.transcodingUsers.clear();
        if (users != null) {
            this.transcodingUsers.putAll(users);
        }
        this.userCount = this.transcodingUsers.size();
    }
}
