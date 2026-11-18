package com.beken.iot.smartsdk.core.gpuimage.util;

/* JADX INFO: loaded from: classes15.dex */
public enum Rotation {
    NORMAL,
    ROTATION_90,
    ROTATION_180,
    ROTATION_270;

    /* JADX INFO: renamed from: com.beken.iot.smartsdk.core.gpuimage.util.Rotation$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$beken$iot$smartsdk$core$gpuimage$util$Rotation;

        static {
            int[] r0 = new int[Rotation.values().length];
            $SwitchMap$com$beken$iot$smartsdk$core$gpuimage$util$Rotation = r0;
            try {
                r0[Rotation.NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$beken$iot$smartsdk$core$gpuimage$util$Rotation[Rotation.ROTATION_90.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$beken$iot$smartsdk$core$gpuimage$util$Rotation[Rotation.ROTATION_180.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$beken$iot$smartsdk$core$gpuimage$util$Rotation[Rotation.ROTATION_270.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public int asInt() {
        int r0 = AnonymousClass1.$SwitchMap$com$beken$iot$smartsdk$core$gpuimage$util$Rotation[ordinal()];
        if (r0 == 1) {
            return 0;
        }
        if (r0 == 2) {
            return 90;
        }
        if (r0 == 3) {
            return 180;
        }
        if (r0 == 4) {
            return 270;
        }
        throw new IllegalStateException("Unknown Rotation!");
    }

    public static Rotation fromInt(int r2) {
        if (r2 == 0) {
            return NORMAL;
        }
        if (r2 == 90) {
            return ROTATION_90;
        }
        if (r2 == 180) {
            return ROTATION_180;
        }
        if (r2 == 270) {
            return ROTATION_270;
        }
        if (r2 == 360) {
            return NORMAL;
        }
        throw new IllegalStateException(r2 + " is an unknown rotation. Needs to be either 0, 90, 180 or 270!");
    }
}
