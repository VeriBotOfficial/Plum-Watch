package androidx.media;

import android.media.VolumeProvider;
import android.os.Build;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes8.dex */
public abstract class VolumeProviderCompat {
    public static final int VOLUME_CONTROL_ABSOLUTE = 2;
    public static final int VOLUME_CONTROL_FIXED = 0;
    public static final int VOLUME_CONTROL_RELATIVE = 1;
    private Callback mCallback;
    private final String mControlId;
    private final int mControlType;
    private int mCurrentVolume;
    private final int mMaxVolume;
    private VolumeProvider mVolumeProviderFwk;

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
        this.mControlType = r1;
        this.mMaxVolume = r2;
        this.mCurrentVolume = r3;
        this.mControlId = str;
    }

    public final int getCurrentVolume() {
        return this.mCurrentVolume;
    }

    public final int getVolumeControl() {
        return this.mControlType;
    }

    public final int getMaxVolume() {
        return this.mMaxVolume;
    }

    public final void setCurrentVolume(int r2) {
        this.mCurrentVolume = r2;
        Api21Impl.setCurrentVolume((VolumeProvider) getVolumeProvider(), r2);
        Callback callback = this.mCallback;
        if (callback != null) {
            callback.onVolumeChanged(this);
        }
    }

    public final String getVolumeControlId() {
        return this.mControlId;
    }

    public void setCallback(Callback callback) {
        this.mCallback = callback;
    }

    public Object getVolumeProvider() {
        if (this.mVolumeProviderFwk == null) {
            if (Build.VERSION.SDK_INT >= 30) {
                this.mVolumeProviderFwk = new VolumeProvider(this.mControlType, this.mMaxVolume, this.mCurrentVolume, this.mControlId) { // from class: androidx.media.VolumeProviderCompat.1
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
                this.mVolumeProviderFwk = new VolumeProvider(this.mControlType, this.mMaxVolume, this.mCurrentVolume) { // from class: androidx.media.VolumeProviderCompat.2
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
        return this.mVolumeProviderFwk;
    }

    private static class Api21Impl {
        private Api21Impl() {
        }

        static void setCurrentVolume(VolumeProvider volumeProvider, int r1) {
            volumeProvider.setCurrentVolume(r1);
        }
    }
}
