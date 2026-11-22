package com.otaliastudios.cameraview;

import com.otaliastudios.cameraview.controls.Audio;
import com.otaliastudios.cameraview.controls.AudioCodec;
import com.otaliastudios.cameraview.controls.Control;
import com.otaliastudios.cameraview.controls.Engine;
import com.otaliastudios.cameraview.controls.Facing;
import com.otaliastudios.cameraview.controls.Flash;
import com.otaliastudios.cameraview.controls.Grid;
import com.otaliastudios.cameraview.controls.Hdr;
import com.otaliastudios.cameraview.controls.Mode;
import com.otaliastudios.cameraview.controls.PictureFormat;
import com.otaliastudios.cameraview.controls.Preview;
import com.otaliastudios.cameraview.controls.VideoCodec;
import com.otaliastudios.cameraview.controls.WhiteBalance;
import com.otaliastudios.cameraview.gesture.GestureAction;
import com.otaliastudios.cameraview.size.AspectRatio;
import com.otaliastudios.cameraview.size.Size;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes17.dex */
public abstract class CameraOptions {
    protected boolean autoFocusSupported;
    protected float exposureCorrectionMaxValue;
    protected float exposureCorrectionMinValue;
    protected boolean exposureCorrectionSupported;
    protected float previewFrameRateMaxValue;
    protected float previewFrameRateMinValue;
    protected boolean zoomSupported;
    protected Set<WhiteBalance> supportedWhiteBalance = new HashSet(5);
    protected Set<Facing> supportedFacing = new HashSet(2);
    protected Set<Flash> supportedFlash = new HashSet(4);
    protected Set<Hdr> supportedHdr = new HashSet(2);
    protected Set<Size> supportedPictureSizes = new HashSet(15);
    protected Set<Size> supportedVideoSizes = new HashSet(5);
    protected Set<AspectRatio> supportedPictureAspectRatio = new HashSet(4);
    protected Set<AspectRatio> supportedVideoAspectRatio = new HashSet(3);
    protected Set<PictureFormat> supportedPictureFormats = new HashSet(2);
    protected Set<Integer> supportedFrameProcessingFormats = new HashSet(2);

    protected CameraOptions() {
    }

    public final boolean supports(Control control) {
        return getSupportedControls(control.getClass()).contains(control);
    }

    /* renamed from: com.otaliastudios.cameraview.CameraOptions$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$otaliastudios$cameraview$gesture$GestureAction;

        static {
            int[] iArr = new int[GestureAction.values().length];
            $SwitchMap$com$otaliastudios$cameraview$gesture$GestureAction = iArr;
            try {
                iArr[GestureAction.AUTO_FOCUS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$otaliastudios$cameraview$gesture$GestureAction[GestureAction.TAKE_PICTURE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$otaliastudios$cameraview$gesture$GestureAction[GestureAction.FILTER_CONTROL_1.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$otaliastudios$cameraview$gesture$GestureAction[GestureAction.FILTER_CONTROL_2.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$otaliastudios$cameraview$gesture$GestureAction[GestureAction.NONE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$otaliastudios$cameraview$gesture$GestureAction[GestureAction.ZOOM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$otaliastudios$cameraview$gesture$GestureAction[GestureAction.EXPOSURE_CORRECTION.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public final boolean supports(GestureAction gestureAction) {
        switch (AnonymousClass1.$SwitchMap$com$otaliastudios$cameraview$gesture$GestureAction[gestureAction.ordinal()]) {
            case 1:
                return isAutoFocusSupported();
            case 2:
            case 3:
            case 4:
            case 5:
                return true;
            case 6:
                return isZoomSupported();
            case 7:
                return isExposureCorrectionSupported();
            default:
                return false;
        }
    }

    public final <T extends Control> Collection<T> getSupportedControls(Class<T> cls) {
        if (cls.equals(Audio.class)) {
            return Arrays.asList(Audio.values());
        }
        if (cls.equals(Facing.class)) {
            return getSupportedFacing();
        }
        if (cls.equals(Flash.class)) {
            return getSupportedFlash();
        }
        if (cls.equals(Grid.class)) {
            return Arrays.asList(Grid.values());
        }
        if (cls.equals(Hdr.class)) {
            return getSupportedHdr();
        }
        if (cls.equals(Mode.class)) {
            return Arrays.asList(Mode.values());
        }
        if (cls.equals(VideoCodec.class)) {
            return Arrays.asList(VideoCodec.values());
        }
        if (cls.equals(AudioCodec.class)) {
            return Arrays.asList(AudioCodec.values());
        }
        if (cls.equals(WhiteBalance.class)) {
            return getSupportedWhiteBalance();
        }
        if (cls.equals(Engine.class)) {
            return Arrays.asList(Engine.values());
        }
        if (cls.equals(Preview.class)) {
            return Arrays.asList(Preview.values());
        }
        if (cls.equals(PictureFormat.class)) {
            return getSupportedPictureFormats();
        }
        return Collections.emptyList();
    }

    public final Collection<Size> getSupportedPictureSizes() {
        return Collections.unmodifiableSet(this.supportedPictureSizes);
    }

    public final Collection<AspectRatio> getSupportedPictureAspectRatios() {
        return Collections.unmodifiableSet(this.supportedPictureAspectRatio);
    }

    public final Collection<Size> getSupportedVideoSizes() {
        return Collections.unmodifiableSet(this.supportedVideoSizes);
    }

    public final Collection<AspectRatio> getSupportedVideoAspectRatios() {
        return Collections.unmodifiableSet(this.supportedVideoAspectRatio);
    }

    public final Collection<Facing> getSupportedFacing() {
        return Collections.unmodifiableSet(this.supportedFacing);
    }

    public final Collection<Flash> getSupportedFlash() {
        return Collections.unmodifiableSet(this.supportedFlash);
    }

    public final Collection<WhiteBalance> getSupportedWhiteBalance() {
        return Collections.unmodifiableSet(this.supportedWhiteBalance);
    }

    public final Collection<Hdr> getSupportedHdr() {
        return Collections.unmodifiableSet(this.supportedHdr);
    }

    public final Collection<PictureFormat> getSupportedPictureFormats() {
        return Collections.unmodifiableSet(this.supportedPictureFormats);
    }

    public final Collection<Integer> getSupportedFrameProcessingFormats() {
        return Collections.unmodifiableSet(this.supportedFrameProcessingFormats);
    }

    public final boolean isZoomSupported() {
        return this.zoomSupported;
    }

    public final boolean isAutoFocusSupported() {
        return this.autoFocusSupported;
    }

    public final boolean isExposureCorrectionSupported() {
        return this.exposureCorrectionSupported;
    }

    public final float getExposureCorrectionMinValue() {
        return this.exposureCorrectionMinValue;
    }

    public final float getExposureCorrectionMaxValue() {
        return this.exposureCorrectionMaxValue;
    }

    public final float getPreviewFrameRateMinValue() {
        return this.previewFrameRateMinValue;
    }

    public final float getPreviewFrameRateMaxValue() {
        return this.previewFrameRateMaxValue;
    }
}
