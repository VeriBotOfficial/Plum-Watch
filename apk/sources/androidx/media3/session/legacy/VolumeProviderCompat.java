package androidx.media3.session.legacy;

import android.media.VolumeProvider;
import android.os.Build;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes7.dex */
public abstract class VolumeProviderCompat {
    public static final int VOLUME_CONTROL_ABSOLUTE = 2;
    public static final int VOLUME_CONTROL_FIXED = 0;
    public static final int VOLUME_CONTROL_RELATIVE = 1;
    private Callback callback;
    private final String controlId;
    private final int controlType;
    private int currentVolume;
    private final int maxVolume;
    private VolumeProvider volumeProviderFwk;

    public static abstract class Callback {
        public abstract void onVolumeChanged(VolumeProviderCompat volumeProviderCompat);
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface ControlType {
    }

    public void onAdjustVolume(int r1) {
    }

    public void onSetVolumeTo(int r1) {
    }

    public VolumeProviderCompat(int r2, int r3, int r4) {
        this(r2, r3, r4, null);
    }

    public VolumeProviderCompat(int r1, int r2, int r3, String str) {
        this.controlType = r1;
        this.maxVolume = r2;
        this.currentVolume = r3;
        this.controlId = str;
    }

    public final int getMaxVolume() {
        return this.maxVolume;
    }

    public final void setCurrentVolume(int r2) {
        this.currentVolume = r2;
        ((VolumeProvider) getVolumeProvider()).setCurrentVolume(r2);
        Callback callback = this.callback;
        if (callback != null) {
            callback.onVolumeChanged(this);
        }
    }

    public void setCallback(Callback callback) {
        this.callback = callback;
    }

    public Object getVolumeProvider() {
        if (this.volumeProviderFwk == null) {
            if (Build.VERSION.SDK_INT >= 30) {
                this.volumeProviderFwk = new VolumeProvider(this.controlType, this.maxVolume, this.currentVolume, this.controlId) { // from class: androidx.media3.session.legacy.VolumeProviderCompat.1
                    @Override // android.media.VolumeProvider
                    public void onSetVolumeTo(int r2) {
                        VolumeProviderCompat.this.onSetVolumeTo(r2);
                    }

                    @Override // android.media.VolumeProvider
                    public void onAdjustVolume(int r2) {
                        VolumeProviderCompat.this.onAdjustVolume(r2);
                    }
                };
            } else {
                this.volumeProviderFwk = new VolumeProvider(this.controlType, this.maxVolume, this.currentVolume) { // from class: androidx.media3.session.legacy.VolumeProviderCompat.2
                    @Override // android.media.VolumeProvider
                    public void onSetVolumeTo(int r2) {
                        VolumeProviderCompat.this.onSetVolumeTo(r2);
                    }

                    @Override // android.media.VolumeProvider
                    public void onAdjustVolume(int r2) {
                        VolumeProviderCompat.this.onAdjustVolume(r2);
                    }
                };
            }
        }
        return this.volumeProviderFwk;
    }
}
