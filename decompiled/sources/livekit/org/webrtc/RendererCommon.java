package livekit.org.webrtc;

import android.graphics.Point;
import android.opengl.Matrix;
import android.view.View;

/* loaded from: classes8.dex */
public class RendererCommon {
    private static final float BALANCED_VISIBLE_FRACTION = 0.5625f;

    public interface GlDrawer {
        void drawOes(int oesTextureId, float[] texMatrix, int frameWidth, int frameHeight, int viewportX, int viewportY, int viewportWidth, int viewportHeight);

        void drawRgb(int textureId, float[] texMatrix, int frameWidth, int frameHeight, int viewportX, int viewportY, int viewportWidth, int viewportHeight);

        void drawYuv(int[] yuvTextures, float[] texMatrix, int frameWidth, int frameHeight, int viewportX, int viewportY, int viewportWidth, int viewportHeight);

        void release();
    }

    public interface RendererEvents {
        void onFirstFrameRendered();

        void onFrameResolutionChanged(int videoWidth, int videoHeight, int rotation);
    }

    public enum ScalingType {
        SCALE_ASPECT_FIT,
        SCALE_ASPECT_FILL,
        SCALE_ASPECT_BALANCED
    }

    public static class VideoLayoutMeasure {
        private float visibleFractionMatchOrientation = RendererCommon.convertScalingTypeToVisibleFraction(ScalingType.SCALE_ASPECT_BALANCED);
        private float visibleFractionMismatchOrientation = RendererCommon.convertScalingTypeToVisibleFraction(ScalingType.SCALE_ASPECT_BALANCED);

        public void setScalingType(ScalingType scalingType) {
            setScalingType(scalingType, scalingType);
        }

        public void setScalingType(ScalingType scalingTypeMatchOrientation, ScalingType scalingTypeMismatchOrientation) {
            this.visibleFractionMatchOrientation = RendererCommon.convertScalingTypeToVisibleFraction(scalingTypeMatchOrientation);
            this.visibleFractionMismatchOrientation = RendererCommon.convertScalingTypeToVisibleFraction(scalingTypeMismatchOrientation);
        }

        public void setVisibleFraction(float visibleFractionMatchOrientation, float visibleFractionMismatchOrientation) {
            this.visibleFractionMatchOrientation = visibleFractionMatchOrientation;
            this.visibleFractionMismatchOrientation = visibleFractionMismatchOrientation;
        }

        public Point measure(int widthSpec, int heightSpec, int frameWidth, int frameHeight) {
            float f;
            int defaultSize = View.getDefaultSize(Integer.MAX_VALUE, widthSpec);
            int defaultSize2 = View.getDefaultSize(Integer.MAX_VALUE, heightSpec);
            if (frameWidth == 0 || frameHeight == 0 || defaultSize == 0 || defaultSize2 == 0) {
                return new Point(defaultSize, defaultSize2);
            }
            float f2 = frameWidth / frameHeight;
            if ((f2 > 1.0f) == (((float) defaultSize) / ((float) defaultSize2) > 1.0f)) {
                f = this.visibleFractionMatchOrientation;
            } else {
                f = this.visibleFractionMismatchOrientation;
            }
            Point displaySize = RendererCommon.getDisplaySize(f, f2, defaultSize, defaultSize2);
            if (View.MeasureSpec.getMode(widthSpec) == 1073741824) {
                displaySize.x = defaultSize;
            }
            if (View.MeasureSpec.getMode(heightSpec) == 1073741824) {
                displaySize.y = defaultSize2;
            }
            return displaySize;
        }
    }

    public static float[] getLayoutMatrix(boolean mirror, float videoAspectRatio, float displayAspectRatio) {
        float f;
        float f2;
        if (displayAspectRatio > videoAspectRatio) {
            f2 = videoAspectRatio / displayAspectRatio;
            f = 1.0f;
        } else {
            f = displayAspectRatio / videoAspectRatio;
            f2 = 1.0f;
        }
        if (mirror) {
            f *= -1.0f;
        }
        float[] fArr = new float[16];
        Matrix.setIdentityM(fArr, 0);
        Matrix.scaleM(fArr, 0, f, f2, 1.0f);
        adjustOrigin(fArr);
        return fArr;
    }

    public static android.graphics.Matrix convertMatrixToAndroidGraphicsMatrix(float[] matrix4x4) {
        float[] fArr = {matrix4x4[0], matrix4x4[4], matrix4x4[12], matrix4x4[1], matrix4x4[5], matrix4x4[13], matrix4x4[3], matrix4x4[7], matrix4x4[15]};
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        matrix.setValues(fArr);
        return matrix;
    }

    public static float[] convertMatrixFromAndroidGraphicsMatrix(android.graphics.Matrix matrix) {
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        return new float[]{fArr[0], fArr[3], 0.0f, fArr[6], fArr[1], fArr[4], 0.0f, fArr[7], 0.0f, 0.0f, 1.0f, 0.0f, fArr[2], fArr[5], 0.0f, fArr[8]};
    }

    public static Point getDisplaySize(ScalingType scalingType, float videoAspectRatio, int maxDisplayWidth, int maxDisplayHeight) {
        return getDisplaySize(convertScalingTypeToVisibleFraction(scalingType), videoAspectRatio, maxDisplayWidth, maxDisplayHeight);
    }

    private static void adjustOrigin(float[] matrix) {
        float f = matrix[12] - ((matrix[0] + matrix[4]) * 0.5f);
        matrix[12] = f;
        float f2 = matrix[13] - ((matrix[1] + matrix[5]) * 0.5f);
        matrix[13] = f2;
        matrix[12] = f + 0.5f;
        matrix[13] = f2 + 0.5f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static float convertScalingTypeToVisibleFraction(ScalingType scalingType) {
        int ordinal = scalingType.ordinal();
        if (ordinal == 0) {
            return 1.0f;
        }
        if (ordinal == 1) {
            return 0.0f;
        }
        if (ordinal == 2) {
            return 0.5625f;
        }
        throw new IllegalArgumentException();
    }

    public static Point getDisplaySize(float minVisibleFraction, float videoAspectRatio, int maxDisplayWidth, int maxDisplayHeight) {
        if (minVisibleFraction == 0.0f || videoAspectRatio == 0.0f) {
            return new Point(maxDisplayWidth, maxDisplayHeight);
        }
        return new Point(Math.min(maxDisplayWidth, Math.round((maxDisplayHeight / minVisibleFraction) * videoAspectRatio)), Math.min(maxDisplayHeight, Math.round((maxDisplayWidth / minVisibleFraction) / videoAspectRatio)));
    }
}
