package androidx.core.accessibilityservice;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.pm.PackageManager;

/* JADX INFO: loaded from: classes8.dex */
public final class AccessibilityServiceInfoCompat {
    public static final int CAPABILITY_CAN_FILTER_KEY_EVENTS = 8;
    public static final int CAPABILITY_CAN_REQUEST_ENHANCED_WEB_ACCESSIBILITY = 4;
    public static final int CAPABILITY_CAN_REQUEST_TOUCH_EXPLORATION = 2;
    public static final int CAPABILITY_CAN_RETRIEVE_WINDOW_CONTENT = 1;
    public static final int FEEDBACK_ALL_MASK = -1;
    public static final int FEEDBACK_BRAILLE = 32;
    public static final int FLAG_INCLUDE_NOT_IMPORTANT_VIEWS = 2;
    public static final int FLAG_REPORT_VIEW_IDS = 16;
    public static final int FLAG_REQUEST_ENHANCED_WEB_ACCESSIBILITY = 8;
    public static final int FLAG_REQUEST_FILTER_KEY_EVENTS = 32;
    public static final int FLAG_REQUEST_TOUCH_EXPLORATION_MODE = 4;

    private AccessibilityServiceInfoCompat() {
    }

    public static String loadDescription(AccessibilityServiceInfo accessibilityServiceInfo, PackageManager packageManager) {
        return accessibilityServiceInfo.loadDescription(packageManager);
    }

    public static String feedbackTypeToString(int r4) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        while (r4 > 0) {
            int r1 = 1 << Integer.numberOfTrailingZeros(r4);
            r4 &= ~r1;
            if (sb.length() > 1) {
                sb.append(", ");
            }
            if (r1 == 1) {
                sb.append("FEEDBACK_SPOKEN");
            } else if (r1 == 2) {
                sb.append("FEEDBACK_HAPTIC");
            } else if (r1 == 4) {
                sb.append("FEEDBACK_AUDIBLE");
            } else if (r1 == 8) {
                sb.append("FEEDBACK_VISUAL");
            } else if (r1 == 16) {
                sb.append("FEEDBACK_GENERIC");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public static String flagToString(int r1) {
        if (r1 == 1) {
            return "DEFAULT";
        }
        if (r1 == 2) {
            return "FLAG_INCLUDE_NOT_IMPORTANT_VIEWS";
        }
        if (r1 == 4) {
            return "FLAG_REQUEST_TOUCH_EXPLORATION_MODE";
        }
        if (r1 == 8) {
            return "FLAG_REQUEST_ENHANCED_WEB_ACCESSIBILITY";
        }
        if (r1 == 16) {
            return "FLAG_REPORT_VIEW_IDS";
        }
        if (r1 != 32) {
            return null;
        }
        return "FLAG_REQUEST_FILTER_KEY_EVENTS";
    }

    public static int getCapabilities(AccessibilityServiceInfo accessibilityServiceInfo) {
        return accessibilityServiceInfo.getCapabilities();
    }

    public static String capabilityToString(int r1) {
        if (r1 == 1) {
            return "CAPABILITY_CAN_RETRIEVE_WINDOW_CONTENT";
        }
        if (r1 == 2) {
            return "CAPABILITY_CAN_REQUEST_TOUCH_EXPLORATION";
        }
        if (r1 == 4) {
            return "CAPABILITY_CAN_REQUEST_ENHANCED_WEB_ACCESSIBILITY";
        }
        if (r1 == 8) {
            return "CAPABILITY_CAN_FILTER_KEY_EVENTS";
        }
        return "UNKNOWN";
    }
}
