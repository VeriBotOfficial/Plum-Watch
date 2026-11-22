package io.agora.base.internal.voiceengine;

import android.gov.nist.core.Separators;
import android.media.audiofx.AcousticEchoCanceler;
import android.media.audiofx.AudioEffect;
import android.media.audiofx.AutomaticGainControl;
import android.media.audiofx.NoiseSuppressor;
import android.os.Build;
import com.facebook.react.uimanager.ViewProps;
import io.agora.base.internal.Logging;
import java.util.UUID;

/* loaded from: classes6.dex */
public class WebRtcAudioEffects {
    private static final boolean DEBUG = false;
    private static final String TAG = "WebRtcAudioEffects";
    private static final UUID AOSP_ACOUSTIC_ECHO_CANCELER = UUID.fromString("bb392ec0-8d4d-11e0-a896-0002a5d5c51b");
    private static final UUID AOSP_NOISE_SUPPRESSOR = UUID.fromString("c06c8400-8e06-11e0-9cb6-0002a5d5c51b");
    private static final UUID AOSP_AUTOMATIC_GAIN_CONTROL = UUID.fromString("aa8130e0-66fc-11e0-bad0-0002a5d5c51b");
    private static AudioEffect.Descriptor[] cachedEffects = null;
    private AcousticEchoCanceler aec = null;
    private NoiseSuppressor ns = null;
    private AutomaticGainControl agc = null;
    private boolean shouldEnableAec = false;
    private boolean shouldEnableNs = false;
    private boolean shouldEnableAgc = false;

    public static boolean isAcousticEchoCancelerSupported() {
        return isAcousticEchoCancelerEffectAvailable();
    }

    public static boolean isNoiseSuppressorSupported() {
        return isNoiseSuppressorEffectAvailable();
    }

    public static boolean isAutomaticGainControlSupported() {
        return isAutomaticGainControlEffectAvailable();
    }

    public static boolean isAcousticEchoCancelerBlacklisted() {
        boolean contains = WebRtcAudioUtils.getBlackListedModelsForAecUsage().contains(Build.MODEL);
        if (contains) {
            Logging.w(TAG, Build.MODEL + " is blacklisted for HW AEC usage!");
        }
        return contains;
    }

    public static boolean isNoiseSuppressorBlacklisted() {
        boolean contains = WebRtcAudioUtils.getBlackListedModelsForNsUsage().contains(Build.MODEL);
        if (contains) {
            Logging.w(TAG, Build.MODEL + " is blacklisted for HW NS usage!");
        }
        return contains;
    }

    public static boolean isAutomaticGainControlBlacklisted() {
        boolean contains = WebRtcAudioUtils.getBlackListedModelsForAgcUsage().contains(Build.MODEL);
        if (contains) {
            Logging.w(TAG, Build.MODEL + " is blacklisted for HW AGC usage!");
        }
        return contains;
    }

    private static boolean isAcousticEchoCancelerExcludedByUUID() {
        for (AudioEffect.Descriptor descriptor : getAvailableEffects()) {
            if (descriptor.type.equals(AudioEffect.EFFECT_TYPE_AEC) && descriptor.uuid.equals(AOSP_ACOUSTIC_ECHO_CANCELER)) {
                return true;
            }
        }
        return false;
    }

    private static boolean isNoiseSuppressorExcludedByUUID() {
        for (AudioEffect.Descriptor descriptor : getAvailableEffects()) {
            if (descriptor.type.equals(AudioEffect.EFFECT_TYPE_NS) && descriptor.uuid.equals(AOSP_NOISE_SUPPRESSOR)) {
                return true;
            }
        }
        return false;
    }

    private static boolean isAutomaticGainControlExcludedByUUID() {
        for (AudioEffect.Descriptor descriptor : getAvailableEffects()) {
            if (descriptor.type.equals(AudioEffect.EFFECT_TYPE_AGC) && descriptor.uuid.equals(AOSP_AUTOMATIC_GAIN_CONTROL)) {
                return true;
            }
        }
        return false;
    }

    private static boolean isAcousticEchoCancelerEffectAvailable() {
        return isEffectTypeAvailable(AudioEffect.EFFECT_TYPE_AEC);
    }

    private static boolean isNoiseSuppressorEffectAvailable() {
        return isEffectTypeAvailable(AudioEffect.EFFECT_TYPE_NS);
    }

    private static boolean isAutomaticGainControlEffectAvailable() {
        return isEffectTypeAvailable(AudioEffect.EFFECT_TYPE_AGC);
    }

    public static boolean canUseAcousticEchoCanceler() {
        boolean z = (!isAcousticEchoCancelerSupported() || WebRtcAudioUtils.useWebRtcBasedAcousticEchoCanceler() || isAcousticEchoCancelerBlacklisted() || isAcousticEchoCancelerExcludedByUUID()) ? false : true;
        Logging.d(TAG, "canUseAcousticEchoCanceler: " + z);
        return z;
    }

    public static boolean canUseNoiseSuppressor() {
        boolean z = (!isNoiseSuppressorSupported() || WebRtcAudioUtils.useWebRtcBasedNoiseSuppressor() || isNoiseSuppressorBlacklisted() || isNoiseSuppressorExcludedByUUID()) ? false : true;
        Logging.d(TAG, "canUseNoiseSuppressor: " + z);
        return z;
    }

    public static boolean canUseAutomaticGainControl() {
        boolean z = (!isAutomaticGainControlSupported() || WebRtcAudioUtils.useWebRtcBasedAutomaticGainControl() || isAutomaticGainControlBlacklisted() || isAutomaticGainControlExcludedByUUID()) ? false : true;
        Logging.d(TAG, "canUseAutomaticGainControl: " + z);
        return z;
    }

    public static WebRtcAudioEffects create() {
        return new WebRtcAudioEffects();
    }

    private WebRtcAudioEffects() {
        Logging.d(TAG, "ctor" + WebRtcAudioUtils.getThreadInfo());
    }

    public boolean setAEC(boolean z) {
        Logging.d(TAG, "setAEC(" + z + Separators.RPAREN);
        if (!canUseAcousticEchoCanceler()) {
            Logging.w(TAG, "Platform AEC is not supported");
            this.shouldEnableAec = false;
            return false;
        }
        if (this.aec != null && z != this.shouldEnableAec) {
            Logging.e(TAG, "Platform AEC state can't be modified while recording");
            return false;
        }
        this.shouldEnableAec = z;
        return true;
    }

    public boolean setNS(boolean z) {
        Logging.d(TAG, "setNS(" + z + Separators.RPAREN);
        if (!canUseNoiseSuppressor()) {
            Logging.w(TAG, "Platform NS is not supported");
            this.shouldEnableNs = false;
            return false;
        }
        if (this.ns != null && z != this.shouldEnableNs) {
            Logging.e(TAG, "Platform NS state can't be modified while recording");
            return false;
        }
        this.shouldEnableNs = z;
        return true;
    }

    public boolean setAGC(boolean z) {
        Logging.d(TAG, "setAGC(" + z + Separators.RPAREN);
        if (!canUseAutomaticGainControl()) {
            Logging.w(TAG, "Platform AGC is not supported");
            this.shouldEnableAgc = false;
            return false;
        }
        if (this.agc != null && z != this.shouldEnableAgc) {
            Logging.e(TAG, "Platform AGC state can't be modified while recording");
            return false;
        }
        this.shouldEnableAgc = z;
        return true;
    }

    public void enable(int i) {
        Logging.d(TAG, "enable(audioSession=" + i + Separators.RPAREN);
        assertTrue(this.aec == null);
        assertTrue(this.ns == null);
        assertTrue(this.agc == null);
        boolean isAcousticEchoCancelerSupported = isAcousticEchoCancelerSupported();
        String str = ViewProps.ENABLED;
        if (isAcousticEchoCancelerSupported && this.shouldEnableAec) {
            AcousticEchoCanceler create = AcousticEchoCanceler.create(i);
            this.aec = create;
            if (create != null) {
                boolean enabled = create.getEnabled();
                boolean z = this.shouldEnableAec && canUseAcousticEchoCanceler();
                if (this.aec.setEnabled(z) != 0) {
                    Logging.e(TAG, "Failed to set the AcousticEchoCanceler state");
                }
                Logging.d(TAG, "AcousticEchoCanceler: was " + (enabled ? ViewProps.ENABLED : "disabled") + ", enable: " + z + ", is now: " + (this.aec.getEnabled() ? ViewProps.ENABLED : "disabled"));
            } else {
                Logging.e(TAG, "Failed to create the AcousticEchoCanceler instance");
            }
        }
        if (isNoiseSuppressorSupported() && this.shouldEnableNs) {
            NoiseSuppressor create2 = NoiseSuppressor.create(i);
            this.ns = create2;
            if (create2 != null) {
                boolean enabled2 = create2.getEnabled();
                boolean z2 = this.shouldEnableNs && canUseNoiseSuppressor();
                if (this.ns.setEnabled(z2) != 0) {
                    Logging.e(TAG, "Failed to set the NoiseSuppressor state");
                }
                Logging.d(TAG, "NoiseSuppressor: was " + (enabled2 ? ViewProps.ENABLED : "disabled") + ", enable: " + z2 + ", is now: " + (this.ns.getEnabled() ? ViewProps.ENABLED : "disabled"));
            } else {
                Logging.e(TAG, "Failed to create the NoiseSuppressor instance");
            }
        }
        if (isAutomaticGainControlSupported() && this.shouldEnableAgc) {
            AutomaticGainControl create3 = AutomaticGainControl.create(i);
            this.agc = create3;
            if (create3 != null) {
                boolean enabled3 = create3.getEnabled();
                boolean z3 = this.shouldEnableAgc && canUseAutomaticGainControl();
                if (this.agc.setEnabled(z3) != 0) {
                    Logging.e(TAG, "Failed to set the AutomaticGainControl state");
                }
                StringBuilder append = new StringBuilder("AutomaticGainControl: was ").append(enabled3 ? ViewProps.ENABLED : "disabled").append(", enable: ").append(z3).append(", is now: ");
                if (!this.agc.getEnabled()) {
                    str = "disabled";
                }
                Logging.d(TAG, append.append(str).toString());
                return;
            }
            Logging.e(TAG, "Failed to create the AutomaticGainControl instance");
        }
    }

    public void release() {
        Logging.d(TAG, "release");
        AcousticEchoCanceler acousticEchoCanceler = this.aec;
        if (acousticEchoCanceler != null) {
            acousticEchoCanceler.release();
            this.aec = null;
            this.shouldEnableAec = false;
        }
        NoiseSuppressor noiseSuppressor = this.ns;
        if (noiseSuppressor != null) {
            noiseSuppressor.release();
            this.ns = null;
            this.shouldEnableNs = false;
        }
        AutomaticGainControl automaticGainControl = this.agc;
        if (automaticGainControl != null) {
            automaticGainControl.release();
            this.agc = null;
            this.shouldEnableAgc = false;
        }
    }

    private boolean effectTypeIsVoIP(UUID uuid) {
        if (!WebRtcAudioUtils.runningOnJellyBeanMR2OrHigher()) {
            return false;
        }
        if (AudioEffect.EFFECT_TYPE_AEC.equals(uuid) && isAcousticEchoCancelerSupported()) {
            return true;
        }
        return AudioEffect.EFFECT_TYPE_NS.equals(uuid) && isNoiseSuppressorSupported();
    }

    private static void assertTrue(boolean z) {
        if (!z) {
            throw new AssertionError("Expected condition to be true");
        }
    }

    private static AudioEffect.Descriptor[] getAvailableEffects() {
        AudioEffect.Descriptor[] descriptorArr = cachedEffects;
        if (descriptorArr != null) {
            return descriptorArr;
        }
        AudioEffect.Descriptor[] queryEffects = AudioEffect.queryEffects();
        cachedEffects = queryEffects;
        return queryEffects;
    }

    private static boolean isEffectTypeAvailable(UUID uuid) {
        AudioEffect.Descriptor[] availableEffects = getAvailableEffects();
        if (availableEffects == null) {
            return false;
        }
        for (AudioEffect.Descriptor descriptor : availableEffects) {
            if (descriptor.type.equals(uuid)) {
                return true;
            }
        }
        return false;
    }
}
