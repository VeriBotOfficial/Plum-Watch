package com.qumeng.overseas.advlib.__remote__.__bootstrap__;

import com.qumeng.overseas.advlib.__remote__.core.proto.utils.z;
import com.qumeng.overseas.advlib.__remote__.utils.n;

/* loaded from: classes17.dex */
public class LibInit {
    public static String aisdk_bootstrap_version = "10.443";
    public static final String aisdk_lib_version = "1.049";
    public static int aisdk_whole_vc = 0;
    public static String aisdk_whole_vn = "";

    public static void Init(String str) {
        n.c("aisdk_init", "AIclicash AiSDK (core) version %s loaded from bootstrap %s", "1.049", str);
        aisdk_bootstrap_version = str;
        aisdk_whole_vc = calculateSdkVersion(str);
        aisdk_whole_vn = z.b(z.b("1.049") + "." + (aisdk_bootstrap_version.isEmpty() ? "0" : z.b(aisdk_bootstrap_version)));
    }

    private static int calculateSdkVersion(String str) {
        if (str != null) {
            try {
                if (!str.isEmpty()) {
                    String replace = "1.049".replace(".", "");
                    String replace2 = str.replace(".", "");
                    if (replace2.isEmpty()) {
                        return 0;
                    }
                    return (Integer.parseInt(replace) * 1000000) + Integer.parseInt(replace2);
                }
            } catch (Exception unused) {
            }
        }
        return 0;
    }
}
