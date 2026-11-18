package androidx.media3.common.util;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes8.dex */
public final class RepeatModeUtil {
    public static final int REPEAT_TOGGLE_MODE_ALL = 2;
    public static final int REPEAT_TOGGLE_MODE_NONE = 0;
    public static final int REPEAT_TOGGLE_MODE_ONE = 1;

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface RepeatToggleModes {
    }

    public static boolean isRepeatModeEnabled(int r3, int r4) {
        if (r3 == 0) {
            return true;
        }
        if (r3 != 1) {
            return r3 == 2 && (r4 & 2) != 0;
        }
        return (r4 & 1) != 0;
    }

    private RepeatModeUtil() {
    }

    public static int getNextRepeatMode(int r3, int r4) {
        for (int r0 = 1; r0 <= 2; r0++) {
            int r1 = (r3 + r0) % 3;
            if (isRepeatModeEnabled(r1, r4)) {
                return r1;
            }
        }
        return r3;
    }
}
