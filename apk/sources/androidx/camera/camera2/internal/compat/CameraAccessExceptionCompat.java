package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.CameraAccessException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class CameraAccessExceptionCompat extends Exception {
    public static final int CAMERA_CHARACTERISTICS_CREATION_ERROR = 10002;
    public static final int CAMERA_DEPRECATED_HAL = 1000;
    public static final int CAMERA_DISABLED = 1;
    public static final int CAMERA_DISCONNECTED = 2;
    public static final int CAMERA_ERROR = 3;
    public static final int CAMERA_IN_USE = 4;
    public static final int CAMERA_UNAVAILABLE_DO_NOT_DISTURB = 10001;
    public static final int MAX_CAMERAS_IN_USE = 5;
    private final CameraAccessException mCameraAccessException;
    private final int mReason;
    static final Set<Integer> PLATFORM_ERRORS = Collections.unmodifiableSet(new HashSet(Arrays.asList(4, 5, 1, 2, 3)));
    static final Set<Integer> COMPAT_ERRORS = Collections.unmodifiableSet(new HashSet(Arrays.asList(10001, 10002)));

    @Retention(RetentionPolicy.SOURCE)
    public @interface AccessError {
    }

    public CameraAccessExceptionCompat(int r3) {
        super(getDefaultMessage(r3));
        this.mReason = r3;
        this.mCameraAccessException = PLATFORM_ERRORS.contains(Integer.valueOf(r3)) ? new CameraAccessException(r3) : null;
    }

    public CameraAccessExceptionCompat(int r3, String str) {
        super(getCombinedMessage(r3, str));
        this.mReason = r3;
        this.mCameraAccessException = PLATFORM_ERRORS.contains(Integer.valueOf(r3)) ? new CameraAccessException(r3, str) : null;
    }

    public CameraAccessExceptionCompat(int r3, String str, Throwable th) {
        super(getCombinedMessage(r3, str), th);
        this.mReason = r3;
        this.mCameraAccessException = PLATFORM_ERRORS.contains(Integer.valueOf(r3)) ? new CameraAccessException(r3, str, th) : null;
    }

    public CameraAccessExceptionCompat(int r3, Throwable th) {
        super(getDefaultMessage(r3), th);
        this.mReason = r3;
        this.mCameraAccessException = PLATFORM_ERRORS.contains(Integer.valueOf(r3)) ? new CameraAccessException(r3, null, th) : null;
    }

    private CameraAccessExceptionCompat(CameraAccessException cameraAccessException) {
        super(cameraAccessException.getMessage(), cameraAccessException.getCause());
        this.mReason = cameraAccessException.getReason();
        this.mCameraAccessException = cameraAccessException;
    }

    public final int getReason() {
        return this.mReason;
    }

    public CameraAccessException toCameraAccessException() {
        return this.mCameraAccessException;
    }

    public static CameraAccessExceptionCompat toCameraAccessExceptionCompat(CameraAccessException cameraAccessException) {
        if (cameraAccessException == null) {
            throw new NullPointerException("cameraAccessException should not be null");
        }
        return new CameraAccessExceptionCompat(cameraAccessException);
    }

    private static String getDefaultMessage(int r1) {
        if (r1 == 1) {
            return "The camera is disabled due to a device policy, and cannot be opened.";
        }
        if (r1 == 2) {
            return "The camera device is removable and has been disconnected from the Android device, or the camera service has shut down the connection due to a higher-priority access request for the camera device.";
        }
        if (r1 == 3) {
            return "The camera device is currently in the error state; no further calls to it will succeed.";
        }
        if (r1 == 4) {
            return "The camera device is in use already";
        }
        if (r1 == 5) {
            return "The system-wide limit for number of open cameras has been reached, and more camera devices cannot be opened until previous instances are closed.";
        }
        if (r1 == 10001) {
            return "Some API 28 devices cannot access the camera when the device is in \"Do Not Disturb\" mode. The camera will not be accessible until \"Do Not Disturb\" mode is disabled.";
        }
        if (r1 != 10002) {
            return null;
        }
        return "Failed to create CameraCharacteristics.";
    }

    private static String getCombinedMessage(int r1, String str) {
        return String.format("%s (%d): %s", getProblemString(r1), Integer.valueOf(r1), str);
    }

    private static String getProblemString(int r1) {
        if (r1 == 1) {
            return "CAMERA_DISABLED";
        }
        if (r1 == 2) {
            return "CAMERA_DISCONNECTED";
        }
        if (r1 == 3) {
            return "CAMERA_ERROR";
        }
        if (r1 == 4) {
            return "CAMERA_IN_USE";
        }
        if (r1 == 5) {
            return "MAX_CAMERAS_IN_USE";
        }
        if (r1 == 1000) {
            return "CAMERA_DEPRECATED_HAL";
        }
        if (r1 == 10001) {
            return "CAMERA_UNAVAILABLE_DO_NOT_DISTURB";
        }
        if (r1 == 10002) {
            return "CAMERA_CHARACTERISTICS_CREATION_ERROR";
        }
        return "<UNKNOWN ERROR>";
    }
}
