package io.agora.rtc2.video;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes6.dex */
public class CameraCapturerConfiguration {
    public CAMERA_DIRECTION cameraDirection;
    public CAMERA_FOCAL_LENGTH_TYPE cameraFocalLengthType;
    public String cameraId;
    public CaptureFormat captureFormat;
    public Boolean followEncodeDimensionRatio;

    public enum CAMERA_DIRECTION {
        CAMERA_REAR(0),
        CAMERA_FRONT(1),
        CAMERA_EXTRAL(2);

        private int value;

        CAMERA_DIRECTION(int v) {
            this.value = v;
        }

        public int getValue() {
            return this.value;
        }
    }

    public enum CAMERA_FOCAL_LENGTH_TYPE {
        CAMERA_FOCAL_LENGTH_DEFAULT(0),
        CAMERA_FOCAL_LENGTH_WIDE_ANGLE(1),
        CAMERA_FOCAL_LENGTH_ULTRA_WIDE(2),
        CAMERA_FOCAL_LENGTH_TELEPHOTO(3);

        private int value;

        CAMERA_FOCAL_LENGTH_TYPE(int v) {
            this.value = v;
        }

        public int getValue() {
            return this.value;
        }
    }

    public static class CaptureFormat {
        public int fps;
        public int height;
        public int width;

        public CaptureFormat() {
            this.width = 960;
            this.height = 540;
            this.fps = 15;
        }

        public CaptureFormat(int width, int height, int fps) {
            this.width = width;
            this.height = height;
            this.fps = fps;
        }

        public int getFps() {
            return this.fps;
        }

        public int getHeight() {
            return this.height;
        }

        public int getWidth() {
            return this.width;
        }

        public String toString() {
            return "CaptureFormat{width=" + this.width + ", height=" + this.height + ", fps=" + this.fps + AbstractJsonLexerKt.END_OBJ;
        }
    }

    public CameraCapturerConfiguration(CAMERA_DIRECTION cameraDirection) {
        this.cameraId = null;
        this.cameraFocalLengthType = null;
        this.followEncodeDimensionRatio = null;
        this.cameraDirection = cameraDirection;
        this.captureFormat = new CaptureFormat(0, 0, 0);
    }

    public CameraCapturerConfiguration(CAMERA_DIRECTION cameraDirection, CAMERA_FOCAL_LENGTH_TYPE cameraFocalLengthType) {
        this.cameraId = null;
        this.followEncodeDimensionRatio = null;
        this.cameraDirection = cameraDirection;
        this.cameraFocalLengthType = cameraFocalLengthType;
        this.captureFormat = new CaptureFormat(0, 0, 0);
    }

    public CameraCapturerConfiguration(CAMERA_DIRECTION cameraDirection, CAMERA_FOCAL_LENGTH_TYPE cameraFocalLengthType, CaptureFormat captureFormat) {
        this.cameraId = null;
        this.followEncodeDimensionRatio = null;
        this.cameraDirection = cameraDirection;
        this.cameraFocalLengthType = cameraFocalLengthType;
        this.captureFormat = captureFormat;
    }

    public CameraCapturerConfiguration(CAMERA_DIRECTION cameraDirection, CaptureFormat captureFormat) {
        this.cameraId = null;
        this.cameraFocalLengthType = null;
        this.followEncodeDimensionRatio = null;
        this.cameraDirection = cameraDirection;
        this.captureFormat = captureFormat;
    }

    public CameraCapturerConfiguration(CaptureFormat captureFormat) {
        this.cameraDirection = null;
        this.cameraId = null;
        this.cameraFocalLengthType = null;
        this.followEncodeDimensionRatio = null;
        this.captureFormat = captureFormat;
    }

    public CAMERA_DIRECTION getCameraDirection() {
        return this.cameraDirection;
    }

    public CAMERA_FOCAL_LENGTH_TYPE getCameraFocalLengthType() {
        return this.cameraFocalLengthType;
    }

    public String getCameraId() {
        return this.cameraId;
    }

    public CaptureFormat getCaptureFormat() {
        return this.captureFormat;
    }

    public Boolean isFollowEncodeDimensionRatio() {
        return this.followEncodeDimensionRatio;
    }

    public String toString() {
        return "CameraCapturerConfiguration{cameraDirection=" + this.cameraDirection + ", captureDimensions=" + this.captureFormat + ", cameraId=" + this.cameraId + ", followEncodeDimensionRatio=" + this.followEncodeDimensionRatio + ", cameraFocalLengthType=" + this.cameraFocalLengthType + AbstractJsonLexerKt.END_OBJ;
    }
}
