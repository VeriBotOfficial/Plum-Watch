package io.agora.rtc2.audio;

/* loaded from: classes6.dex */
public interface IAudioSpectrumObserver {
    boolean onLocalAudioSpectrum(AudioSpectrumInfo data);

    boolean onRemoteAudioSpectrum(UserAudioSpectrumInfo[] userAudioSpectrumInfos, int spectrumNumber);
}
