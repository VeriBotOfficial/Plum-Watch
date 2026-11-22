package com.otaliastudios.cameraview.internal;

import android.os.Build;
import android.util.Range;
import com.otaliastudios.cameraview.CameraLogger;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes17.dex */
public class FpsRangeValidator {
    private static final CameraLogger LOG = CameraLogger.create("FpsRangeValidator");
    private static final Map<String, List<Range<Integer>>> sIssues;

    static {
        HashMap hashMap = new HashMap();
        sIssues = hashMap;
        hashMap.put("Google Pixel 4", Arrays.asList(new Range(15, 60)));
        hashMap.put("Google Pixel 4a", Arrays.asList(new Range(15, 60)));
    }

    public static boolean validate(Range<Integer> range) {
        CameraLogger cameraLogger = LOG;
        cameraLogger.i("Build.MODEL:", Build.MODEL, "Build.BRAND:", Build.BRAND, "Build.MANUFACTURER:", Build.MANUFACTURER);
        List<Range<Integer>> list = sIssues.get(Build.MANUFACTURER + " " + Build.MODEL);
        if (list == null || !list.contains(range)) {
            return true;
        }
        cameraLogger.i("Dropping range:", range);
        return false;
    }
}
