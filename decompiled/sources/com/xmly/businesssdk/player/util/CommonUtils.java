package com.xmly.businesssdk.player.util;

import android.app.ActivityManager;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.autonavi.aps.amapapi.config.Const;
import com.luck.picture.lib.config.PictureMimeType;
import com.xmly.businesssdk.BusinessSDK;
import java.util.Collection;
import java.util.List;

/* loaded from: classes3.dex */
public class CommonUtils {
    public static void closeInputMethod(EditText editText) {
        InputMethodManager inputMethodManager = (InputMethodManager) editText.getContext().getSystemService("input_method");
        if (inputMethodManager.isActive()) {
            inputMethodManager.hideSoftInputFromWindow(editText.getWindowToken(), 2);
        }
    }

    public static int dp2Px(float f) {
        return (int) ((getResources().getDisplayMetrics().density * f) + 0.5f);
    }

    public static int dpToPx(float f) {
        int i = (int) f;
        if (i == 0) {
            return 0;
        }
        if (i > 0) {
            try {
                return (int) getResources().getDimension(getResources().getIdentifier("dp_" + i, "dimen", BusinessSDK.INSTANCE.getContext().getPackageName()));
            } catch (Exception unused) {
            }
        }
        return (int) ((getResources().getDisplayMetrics().density * f) + 0.5f);
    }

    public static Drawable getDrawable(int i) {
        Drawable drawable = getResources().getDrawable(i);
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        return drawable;
    }

    public static String getImageTypeFromUrl(String str) {
        if (str == null || str.isEmpty()) {
            return "Unknown";
        }
        String lowerCase = str.split("\\?")[0].split("#")[0].toLowerCase();
        return lowerCase.endsWith(".gif") ? "GIF" : (lowerCase.endsWith(PictureMimeType.PNG) || lowerCase.endsWith(PictureMimeType.JPG) || lowerCase.endsWith(".jpeg") || lowerCase.endsWith(PictureMimeType.BMP)) ? "Image" : "Unknown";
    }

    public static String getProcessName(Context context, int i) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService(Const.STR_PROCESS_TAG)).getRunningAppProcesses();
        if (runningAppProcesses == null || runningAppProcesses.isEmpty()) {
            return null;
        }
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.pid == i) {
                return runningAppProcessInfo.processName;
            }
        }
        return null;
    }

    private static Resources getResources() {
        return BusinessSDK.INSTANCE.getContext().getResources();
    }

    public static int getSafeInteger(String str) {
        if (str == null) {
            return 0;
        }
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    public static long getSafeLong(String str) {
        if (str == null) {
            return 0L;
        }
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return 0L;
        }
    }

    public static int getScreenWidth(Context context) {
        return context.getResources().getDisplayMetrics().widthPixels;
    }

    public static boolean isNullOrEmpty(Collection collection) {
        return collection == null || collection.isEmpty();
    }

    public static int px2Dip(Context context, float f) {
        return (int) ((f / context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static int spToPx(float f) {
        int i = (int) f;
        if (i == 0) {
            return 0;
        }
        if (i > 0) {
            try {
                return (int) getResources().getDimension(getResources().getIdentifier("sp_" + i, "dimen", BusinessSDK.INSTANCE.getContext().getPackageName()));
            } catch (Exception unused) {
            }
        }
        return (int) ((getResources().getDisplayMetrics().density * f) + 0.5f);
    }
}
