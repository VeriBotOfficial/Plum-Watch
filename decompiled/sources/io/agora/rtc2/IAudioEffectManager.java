package io.agora.rtc2;

/* loaded from: classes6.dex */
public interface IAudioEffectManager {
    double getEffectsVolume();

    int pauseAllEffects();

    int pauseEffect(int soundId);

    int playEffect(int soundId, String filePath, int loop, double pitch, double pan, double gain);

    int playEffect(int soundId, String filePath, int loopCount, double pitch, double pan, double gain, boolean publish);

    int playEffect(int soundId, String filePath, int loopCount, double pitch, double pan, double gain, boolean publish, int startPos);

    int preloadEffect(int soundId, String filePath);

    int preloadEffect(int soundId, String filePath, int startPos);

    int resumeAllEffects();

    int resumeEffect(int soundId);

    int setEffectsVolume(double volume);

    int setVolumeOfEffect(int soundId, double volume);

    int stopAllEffects();

    int stopEffect(int soundId);

    int unloadEffect(int soundId);
}
