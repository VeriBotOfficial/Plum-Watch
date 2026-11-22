package com.otaliastudios.cameraview.engine.offset;

import com.otaliastudios.cameraview.CameraLogger;
import com.otaliastudios.cameraview.controls.Facing;

/* loaded from: classes17.dex */
public class Angles {
    private Facing mSensorFacing;
    private static final String TAG = "Angles";
    private static final CameraLogger LOG = CameraLogger.create(TAG);
    int mSensorOffset = 0;
    int mDisplayOffset = 0;
    int mDeviceOrientation = 0;

    public void setSensorOffset(Facing facing, int i) {
        sanitizeInput(i);
        this.mSensorFacing = facing;
        this.mSensorOffset = i;
        if (facing == Facing.FRONT) {
            this.mSensorOffset = sanitizeOutput(360 - this.mSensorOffset);
        }
        print();
    }

    public void setDisplayOffset(int i) {
        sanitizeInput(i);
        this.mDisplayOffset = i;
        print();
    }

    public void setDeviceOrientation(int i) {
        sanitizeInput(i);
        this.mDeviceOrientation = i;
        print();
    }

    private void print() {
        LOG.i("Angles changed:", "sensorOffset:", Integer.valueOf(this.mSensorOffset), "displayOffset:", Integer.valueOf(this.mDisplayOffset), "deviceOrientation:", Integer.valueOf(this.mDeviceOrientation));
    }

    public int offset(Reference reference, Reference reference2, Axis axis) {
        int absoluteOffset = absoluteOffset(reference, reference2);
        return (axis == Axis.RELATIVE_TO_SENSOR && this.mSensorFacing == Facing.FRONT) ? sanitizeOutput(360 - absoluteOffset) : absoluteOffset;
    }

    private int absoluteOffset(Reference reference, Reference reference2) {
        if (reference == reference2) {
            return 0;
        }
        if (reference2 == Reference.BASE) {
            return sanitizeOutput(360 - absoluteOffset(reference2, reference));
        }
        if (reference == Reference.BASE) {
            int i = AnonymousClass1.$SwitchMap$com$otaliastudios$cameraview$engine$offset$Reference[reference2.ordinal()];
            if (i == 1) {
                return sanitizeOutput(360 - this.mDisplayOffset);
            }
            if (i == 2) {
                return sanitizeOutput(this.mDeviceOrientation);
            }
            if (i == 3) {
                return sanitizeOutput(360 - this.mSensorOffset);
            }
            throw new RuntimeException("Unknown reference: " + reference2);
        }
        return sanitizeOutput(absoluteOffset(Reference.BASE, reference2) - absoluteOffset(Reference.BASE, reference));
    }

    /* renamed from: com.otaliastudios.cameraview.engine.offset.Angles$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$otaliastudios$cameraview$engine$offset$Reference;

        static {
            int[] iArr = new int[Reference.values().length];
            $SwitchMap$com$otaliastudios$cameraview$engine$offset$Reference = iArr;
            try {
                iArr[Reference.VIEW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$otaliastudios$cameraview$engine$offset$Reference[Reference.OUTPUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$otaliastudios$cameraview$engine$offset$Reference[Reference.SENSOR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public boolean flip(Reference reference, Reference reference2) {
        return offset(reference, reference2, Axis.ABSOLUTE) % 180 != 0;
    }

    private void sanitizeInput(int i) {
        if (i != 0 && i != 90 && i != 180 && i != 270) {
            throw new IllegalStateException("This value is not sanitized: " + i);
        }
    }

    private int sanitizeOutput(int i) {
        return (i + 360) % 360;
    }
}
