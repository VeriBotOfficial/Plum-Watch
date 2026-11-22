package com.yandex.mobile.ads.impl;

import android.graphics.Color;
import android.text.TextUtils;
import androidx.core.internal.view.SupportMenu;
import androidx.core.view.InputDeviceCompat;
import com.beken.iot.smartsdk.core.video.DisplayDevice;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes5.dex */
public final class sq {

    /* renamed from: a, reason: collision with root package name */
    private static final Pattern f16882a = Pattern.compile("^rgb\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");
    private static final Pattern b = Pattern.compile("^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");
    private static final Pattern c = Pattern.compile("^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d*\\.?\\d*?)\\)$");
    private static final HashMap d;

    static {
        HashMap hashMap = new HashMap();
        d = hashMap;
        ku0.a(-984833, hashMap, "aliceblue", -332841, "antiquewhite");
        ku0.a(-16711681, hashMap, "aqua", -8388652, "aquamarine");
        ku0.a(-983041, hashMap, "azure", -657956, "beige");
        ku0.a(-6972, hashMap, "bisque", -16777216, "black");
        ku0.a(-5171, hashMap, "blanchedalmond", -16776961, "blue");
        ku0.a(-7722014, hashMap, "blueviolet", -5952982, "brown");
        ku0.a(-2180985, hashMap, "burlywood", -10510688, "cadetblue");
        ku0.a(-8388864, hashMap, "chartreuse", -2987746, "chocolate");
        ku0.a(-32944, hashMap, "coral", -10185235, "cornflowerblue");
        ku0.a(-1828, hashMap, "cornsilk", -2354116, "crimson");
        ku0.a(-16711681, hashMap, "cyan", -16777077, "darkblue");
        ku0.a(-16741493, hashMap, "darkcyan", -4684277, "darkgoldenrod");
        ku0.a(-5658199, hashMap, "darkgray", -16751616, "darkgreen");
        ku0.a(-5658199, hashMap, "darkgrey", -4343957, "darkkhaki");
        ku0.a(-7667573, hashMap, "darkmagenta", -11179217, "darkolivegreen");
        ku0.a(-29696, hashMap, "darkorange", -6737204, "darkorchid");
        ku0.a(-7667712, hashMap, "darkred", -1468806, "darksalmon");
        ku0.a(-7357297, hashMap, "darkseagreen", -12042869, "darkslateblue");
        ku0.a(-13676721, hashMap, "darkslategray", -13676721, "darkslategrey");
        ku0.a(-16724271, hashMap, "darkturquoise", -7077677, "darkviolet");
        ku0.a(-60269, hashMap, "deeppink", -16728065, "deepskyblue");
        ku0.a(-9868951, hashMap, "dimgray", -9868951, "dimgrey");
        ku0.a(-14774017, hashMap, "dodgerblue", -5103070, "firebrick");
        ku0.a(-1296, hashMap, "floralwhite", -14513374, "forestgreen");
        ku0.a(-65281, hashMap, "fuchsia", -2302756, "gainsboro");
        ku0.a(-460545, hashMap, "ghostwhite", -10496, "gold");
        ku0.a(-2448096, hashMap, "goldenrod", -8355712, "gray");
        ku0.a(-16744448, hashMap, "green", -5374161, "greenyellow");
        ku0.a(-8355712, hashMap, "grey", -983056, "honeydew");
        ku0.a(-38476, hashMap, "hotpink", -3318692, "indianred");
        ku0.a(-11861886, hashMap, "indigo", -16, "ivory");
        ku0.a(-989556, hashMap, "khaki", -1644806, "lavender");
        ku0.a(-3851, hashMap, "lavenderblush", -8586240, "lawngreen");
        ku0.a(-1331, hashMap, "lemonchiffon", -5383962, "lightblue");
        ku0.a(-1015680, hashMap, "lightcoral", -2031617, "lightcyan");
        ku0.a(-329006, hashMap, "lightgoldenrodyellow", -2894893, "lightgray");
        ku0.a(-7278960, hashMap, "lightgreen", -2894893, "lightgrey");
        ku0.a(-18751, hashMap, "lightpink", -24454, "lightsalmon");
        ku0.a(-14634326, hashMap, "lightseagreen", -7876870, "lightskyblue");
        ku0.a(-8943463, hashMap, "lightslategray", -8943463, "lightslategrey");
        ku0.a(-5192482, hashMap, "lightsteelblue", -32, "lightyellow");
        ku0.a(-16711936, hashMap, "lime", -13447886, "limegreen");
        ku0.a(-331546, hashMap, "linen", -65281, "magenta");
        ku0.a(-8388608, hashMap, "maroon", -10039894, "mediumaquamarine");
        ku0.a(-16777011, hashMap, "mediumblue", -4565549, "mediumorchid");
        ku0.a(-7114533, hashMap, "mediumpurple", -12799119, "mediumseagreen");
        ku0.a(-8689426, hashMap, "mediumslateblue", -16713062, "mediumspringgreen");
        ku0.a(-12004916, hashMap, "mediumturquoise", -3730043, "mediumvioletred");
        ku0.a(-15132304, hashMap, "midnightblue", -655366, "mintcream");
        ku0.a(-6943, hashMap, "mistyrose", -6987, "moccasin");
        ku0.a(-8531, hashMap, "navajowhite", -16777088, "navy");
        ku0.a(-133658, hashMap, "oldlace", -8355840, "olive");
        ku0.a(-9728477, hashMap, "olivedrab", -23296, "orange");
        ku0.a(-47872, hashMap, "orangered", -2461482, "orchid");
        ku0.a(-1120086, hashMap, "palegoldenrod", -6751336, "palegreen");
        ku0.a(-5247250, hashMap, "paleturquoise", -2396013, "palevioletred");
        ku0.a(-4139, hashMap, "papayawhip", -9543, "peachpuff");
        ku0.a(-3308225, hashMap, "peru", -16181, "pink");
        ku0.a(-2252579, hashMap, "plum", -5185306, "powderblue");
        ku0.a(-8388480, hashMap, "purple", -10079335, "rebeccapurple");
        ku0.a(SupportMenu.CATEGORY_MASK, hashMap, "red", -4419697, "rosybrown");
        ku0.a(-12490271, hashMap, "royalblue", -7650029, "saddlebrown");
        ku0.a(-360334, hashMap, "salmon", -744352, "sandybrown");
        ku0.a(-13726889, hashMap, "seagreen", -2578, "seashell");
        ku0.a(-6270419, hashMap, "sienna", -4144960, "silver");
        ku0.a(-7876885, hashMap, "skyblue", -9807155, "slateblue");
        ku0.a(-9404272, hashMap, "slategray", -9404272, "slategrey");
        ku0.a(-1286, hashMap, "snow", -16711809, "springgreen");
        ku0.a(-12156236, hashMap, "steelblue", -2968436, "tan");
        ku0.a(-16744320, hashMap, "teal", -2572328, "thistle");
        ku0.a(-40121, hashMap, "tomato", 0, "transparent");
        ku0.a(-12525360, hashMap, "turquoise", -1146130, "violet");
        ku0.a(-663885, hashMap, "wheat", -1, "white");
        ku0.a(-657931, hashMap, "whitesmoke", InputDeviceCompat.SOURCE_ANY, "yellow");
        hashMap.put("yellowgreen", -6632142);
    }

    public static int b(String str) {
        return a(str, false);
    }

    private static int a(String str, boolean z) {
        int parseInt;
        if (!TextUtils.isEmpty(str)) {
            String replace = str.replace(" ", "");
            if (replace.charAt(0) == '#') {
                int parseLong = (int) Long.parseLong(replace.substring(1), 16);
                if (replace.length() == 7) {
                    return (-16777216) | parseLong;
                }
                if (replace.length() == 9) {
                    return ((parseLong & 255) << 24) | (parseLong >>> 8);
                }
                throw new IllegalArgumentException();
            }
            if (replace.startsWith("rgba")) {
                Matcher matcher = (z ? c : b).matcher(replace);
                if (matcher.matches()) {
                    if (z) {
                        String group = matcher.group(4);
                        group.getClass();
                        parseInt = (int) (Float.parseFloat(group) * 255.0f);
                    } else {
                        String group2 = matcher.group(4);
                        group2.getClass();
                        parseInt = Integer.parseInt(group2, 10);
                    }
                    String group3 = matcher.group(1);
                    group3.getClass();
                    int parseInt2 = Integer.parseInt(group3, 10);
                    String group4 = matcher.group(2);
                    group4.getClass();
                    int parseInt3 = Integer.parseInt(group4, 10);
                    String group5 = matcher.group(3);
                    group5.getClass();
                    return Color.argb(parseInt, parseInt2, parseInt3, Integer.parseInt(group5, 10));
                }
            } else if (replace.startsWith(DisplayDevice.TYPE_DEF_RGB)) {
                Matcher matcher2 = f16882a.matcher(replace);
                if (matcher2.matches()) {
                    String group6 = matcher2.group(1);
                    group6.getClass();
                    int parseInt4 = Integer.parseInt(group6, 10);
                    String group7 = matcher2.group(2);
                    group7.getClass();
                    int parseInt5 = Integer.parseInt(group7, 10);
                    String group8 = matcher2.group(3);
                    group8.getClass();
                    return Color.rgb(parseInt4, parseInt5, Integer.parseInt(group8, 10));
                }
            } else {
                Integer num = (Integer) d.get(fg.b(replace));
                if (num != null) {
                    return num.intValue();
                }
            }
            throw new IllegalArgumentException();
        }
        throw new IllegalArgumentException();
    }

    public static int a(String str) {
        return a(str, true);
    }
}
