package androidx.camera.camera2.internal;

/* JADX INFO: loaded from: classes.dex */
public class LensFacingUtil {
    private LensFacingUtil() {
    }

    public static int getCameraSelectorLensFacing(int r3) {
        if (r3 == 0) {
            return 0;
        }
        if (r3 == 1) {
            return 1;
        }
        if (r3 == 2) {
            return 2;
        }
        throw new IllegalArgumentException("The given lens facing integer: " + r3 + " can not be recognized.");
    }

    public static int getLensFacingInt(int r3) {
        if (r3 == 0) {
            return 0;
        }
        if (r3 == 1) {
            return 1;
        }
        if (r3 == 2) {
            return 2;
        }
        throw new IllegalArgumentException("The given lens facing: " + r3 + " can not be recognized.");
    }
}
