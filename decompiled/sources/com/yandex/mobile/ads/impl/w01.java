package com.yandex.mobile.ads.impl;

import android.text.TextUtils;
import androidx.media3.common.MimeTypes;
import com.wakeup.common.DeviceFeatures;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes5.dex */
public final class w01 {

    /* renamed from: a, reason: collision with root package name */
    private static final ArrayList<a> f17208a = new ArrayList<>();
    private static final Pattern b = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");
    public static final /* synthetic */ int c = 0;

    private static final class a {
    }

    static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f17209a;

        public b(int i) {
            this.f17209a = i;
        }
    }

    public static boolean d(String str) {
        return "audio".equals(b(str));
    }

    public static boolean f(String str) {
        return "video".equals(b(str));
    }

    public static boolean e(String str) {
        return "text".equals(b(str)) || "application/cea-608".equals(str) || "application/cea-708".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/x-subrip".equals(str) || "application/ttml+xml".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-rawcc".equals(str) || "application/vobsub".equals(str) || "application/pgs".equals(str) || "application/dvbsubs".equals(str);
    }

    public static boolean a(String str, String str2) {
        b a2;
        if (str == null) {
            return false;
        }
        str.hashCode();
        switch (str) {
            case "audio/mp4a-latm":
                if (str2 != null && (a2 = a(str2)) != null) {
                    int i = a2.f17209a;
                    char c2 = i != 2 ? i != 5 ? i != 29 ? i != 42 ? i != 22 ? i != 23 ? (char) 0 : (char) 15 : (char) 0 : (char) 16 : '\f' : (char) 11 : '\n';
                    if (c2 == 0 || c2 == 16) {
                    }
                }
                break;
        }
        return false;
    }

    public static int c(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if ("audio".equals(b(str))) {
            return 1;
        }
        if ("video".equals(b(str))) {
            return 2;
        }
        if (e(str)) {
            return 3;
        }
        if ("image".equals(b(str))) {
            return 4;
        }
        if ("application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str)) {
            return 5;
        }
        if ("application/x-camera-motion".equals(str)) {
            return 6;
        }
        int size = f17208a.size();
        for (int i = 0; i < size; i++) {
            f17208a.get(i).getClass();
            if (str.equals(null)) {
                return 0;
            }
        }
        return -1;
    }

    public static int b(String str, String str2) {
        b a2;
        str.hashCode();
        switch (str) {
            case "audio/eac3-joc":
                return 18;
            case "audio/vnd.dts":
                return 7;
            case "audio/mp4a-latm":
                if (str2 == null || (a2 = a(str2)) == null) {
                    return 0;
                }
                int i = a2.f17209a;
                if (i == 2) {
                    return 10;
                }
                if (i == 5) {
                    return 11;
                }
                if (i == 29) {
                    return 12;
                }
                if (i == 42) {
                    return 16;
                }
                if (i != 22) {
                    return i != 23 ? 0 : 15;
                }
                return 1073741824;
            case "audio/ac3":
                return 5;
            case "audio/ac4":
                return 17;
            case "audio/eac3":
                return 6;
            case "audio/mpeg":
                return 9;
            case "audio/vnd.dts.hd":
                return 8;
            case "audio/true-hd":
                return 14;
            default:
                return 0;
        }
    }

    public static String a(int i) {
        if (i == 32) {
            return "video/mp4v-es";
        }
        if (i == 33) {
            return "video/avc";
        }
        if (i == 35) {
            return "video/hevc";
        }
        if (i == 64) {
            return "audio/mp4a-latm";
        }
        if (i == 163) {
            return "video/wvc1";
        }
        if (i == 177) {
            return "video/x-vnd.on2.vp9";
        }
        if (i == 165) {
            return "audio/ac3";
        }
        if (i != 166) {
            switch (i) {
                case 96:
                case 97:
                case 98:
                case 99:
                case 100:
                case 101:
                    return "video/mpeg2";
                case 102:
                case 103:
                case 104:
                    return "audio/mp4a-latm";
                case 105:
                case 107:
                    return "audio/mpeg";
                case 106:
                    return "video/mpeg";
                default:
                    switch (i) {
                        case 169:
                        case 172:
                            return "audio/vnd.dts";
                        case 170:
                        case DeviceFeatures.AI_AUDIO_SEARCH /* 171 */:
                            return "audio/vnd.dts.hd";
                        case DeviceFeatures.E_BOOK /* 173 */:
                            return "audio/opus";
                        case 174:
                            return MimeTypes.AUDIO_AC4;
                        default:
                            return null;
                    }
            }
        }
        return "audio/eac3";
    }

    static b a(String str) {
        Matcher matcher = b.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        String group = matcher.group(1);
        group.getClass();
        String group2 = matcher.group(2);
        try {
            Integer.parseInt(group, 16);
            return new b(group2 != null ? Integer.parseInt(group2) : 0);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    private static String b(String str) {
        int indexOf;
        if (str == null || (indexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, indexOf);
    }
}
