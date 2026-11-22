package com.otaliastudios.cameraview.internal;

import android.media.CamcorderProfile;
import com.otaliastudios.cameraview.CameraLogger;
import com.otaliastudios.cameraview.size.Size;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes17.dex */
public class CamcorderProfiles {
    private static Map<Size, Integer> sizeToProfileMap;
    private static final String TAG = "CamcorderProfiles";
    private static final CameraLogger LOG = CameraLogger.create(TAG);

    static {
        HashMap hashMap = new HashMap();
        sizeToProfileMap = hashMap;
        hashMap.put(new Size(176, 144), 2);
        sizeToProfileMap.put(new Size(320, 240), 7);
        sizeToProfileMap.put(new Size(352, 288), 3);
        sizeToProfileMap.put(new Size(720, 480), 4);
        sizeToProfileMap.put(new Size(1280, 720), 5);
        sizeToProfileMap.put(new Size(1920, 1080), 6);
        sizeToProfileMap.put(new Size(3840, 2160), 8);
    }

    public static CamcorderProfile get(String str, Size size) {
        try {
            return get(Integer.parseInt(str), size);
        } catch (NumberFormatException unused) {
            LOG.w("NumberFormatException for Camera2 id:", str);
            return CamcorderProfile.get(0);
        }
    }

    public static CamcorderProfile get(int i, Size size) {
        final long width = size.getWidth() * size.getHeight();
        ArrayList arrayList = new ArrayList(sizeToProfileMap.keySet());
        Collections.sort(arrayList, new Comparator<Size>() { // from class: com.otaliastudios.cameraview.internal.CamcorderProfiles.1
            @Override // java.util.Comparator
            public int compare(Size size2, Size size3) {
                long abs = Math.abs((size2.getWidth() * size2.getHeight()) - width);
                long abs2 = Math.abs((size3.getWidth() * size3.getHeight()) - width);
                if (abs < abs2) {
                    return -1;
                }
                return abs == abs2 ? 0 : 1;
            }
        });
        while (arrayList.size() > 0) {
            int intValue = sizeToProfileMap.get((Size) arrayList.remove(0)).intValue();
            if (CamcorderProfile.hasProfile(i, intValue)) {
                return CamcorderProfile.get(i, intValue);
            }
        }
        return CamcorderProfile.get(i, 0);
    }
}
