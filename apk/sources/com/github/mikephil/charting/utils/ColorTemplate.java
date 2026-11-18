package com.github.mikephil.charting.utils;

import android.content.res.Resources;
import android.graphics.Color;
import com.facebook.imageutils.JfifUtil;
import com.wakeup.common.DeviceFeatures;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.net.telnet.TelnetCommand;

/* JADX INFO: loaded from: classes11.dex */
public class ColorTemplate {
    public static final int COLOR_NONE = 1122867;
    public static final int COLOR_SKIP = 1122868;
    public static final int[] LIBERTY_COLORS = {Color.rgb(207, TelnetCommand.EL, TelnetCommand.AYT), Color.rgb(148, 212, 212), Color.rgb(136, 180, 187), Color.rgb(118, 174, DeviceFeatures.AUDIO_MEMORANDUM), Color.rgb(42, 109, 130)};
    public static final int[] JOYFUL_COLORS = {Color.rgb(JfifUtil.MARKER_EOI, 80, 138), Color.rgb(254, 149, 7), Color.rgb(254, 247, 120), Color.rgb(106, 167, 134), Color.rgb(53, DeviceFeatures.SLEEP_APNEA, 209)};
    public static final int[] PASTEL_COLORS = {Color.rgb(64, 89, 128), Color.rgb(149, 165, 124), Color.rgb(JfifUtil.MARKER_EOI, 184, 162), Color.rgb(DeviceFeatures.DIAL_THUMB, 134, 134), Color.rgb(DeviceFeatures.MAP_MODE, 48, 80)};
    public static final int[] COLORFUL_COLORS = {Color.rgb(193, 37, 82), Color.rgb(255, 102, 0), Color.rgb(TelnetCommand.AO, 199, 0), Color.rgb(106, 150, 31), Color.rgb(DeviceFeatures.MAP_MODE, 100, 53)};
    public static final int[] VORDIPLOM_COLORS = {Color.rgb(192, 255, 140), Color.rgb(255, 247, 140), Color.rgb(255, 208, 140), Color.rgb(140, 234, 255), Color.rgb(255, 140, 157)};
    public static final int[] MATERIAL_COLORS = {rgb("#2ecc71"), rgb("#f1c40f"), rgb("#e74c3c"), rgb("#3498db")};

    public static int colorWithAlpha(int r1, int r2) {
        return (r1 & 16777215) | ((r2 & 255) << 24);
    }

    public static int rgb(String str) {
        int r2 = (int) Long.parseLong(str.replace("#", ""), 16);
        return Color.rgb((r2 >> 16) & 255, (r2 >> 8) & 255, r2 & 255);
    }

    public static int getHoloBlue() {
        return Color.rgb(51, 181, 229);
    }

    public static List<Integer> createColors(Resources resources, int[] r5) {
        ArrayList arrayList = new ArrayList();
        for (int r0 : r5) {
            arrayList.add(Integer.valueOf(resources.getColor(r0)));
        }
        return arrayList;
    }

    public static List<Integer> createColors(int[] r4) {
        ArrayList arrayList = new ArrayList();
        for (int r0 : r4) {
            arrayList.add(Integer.valueOf(r0));
        }
        return arrayList;
    }
}
