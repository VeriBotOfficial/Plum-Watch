package io.agora.rtc2.internal;

import com.wakeup.feature.device.white.record.PcmAudioUtil;

/* loaded from: classes6.dex */
public class AudioRecordingConfiguration {
    public String filePath;
    public int sampleRate = PcmAudioUtil.PCM_BYTES_PER_SEC;
    public boolean codec = true;
    public int fileRecordOption = 3;
    public int quality = 1;
    public int recordingChannel = 1;
}
