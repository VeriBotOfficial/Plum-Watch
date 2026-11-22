package com.baidu.mshield.utility;

import android.content.ContentProviderClient;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import io.agora.utils2.internal.CommonUtility;

/* compiled from: ProviderAccessUtil.java */
/* loaded from: classes13.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    public static final String[] f8441a = {"On7h9W1_KIkIa50wk9Fnl1friw1cdOsubmr_O-Hrgss=", "73Ry_SRX9WDHPoeAkGWfJbuntGR7RQ3rde1s6KyyCoo=", "iQirV45vitYDQfzxgr68ylBY1DWLBKje2Pl428sE27Q=", "czwe2zUrt14MfnaeH474T5prOCIik3agOnBud_KwFa0=", "JzLix2JtXzSSsVkQFD0Cnf37028Rco5rGb7_-t_C8Qk=", "lUApGLCwwTIqYrpC4ZaqkVItjc8DeoJ5fB_pxizrjnc=", "6PzPHS4JINi0q8yUj180JTMbpq1Q44DuQggknxVmVPA=", "fCbyLrInjq1BOByP4wH4mUGBidquiIKIy6zcJCBuKtk=", "qEeaB7chq_oSIUyWhq_EwETFQIu3w3myIFyGD80p_u8=", "UNzyljxPfmKANfePasqvdfmpLS4aJ1v0S1Aj2BGl75o=", "8aRmj9NoeaLTFLe54rCmNLYIZoWE7hrVdjvM3xBfHQ4=", "WtGvBTWjt2PyMX5rQclkgiNR3aDxFtoBNe1UnNpbL1I="};

    public static Bundle a(Context context, String str, Bundle bundle) {
        return a(context, str, bundle, "mshield");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Bundle a(Context context, String str, Bundle bundle, boolean z, String str2, boolean z2) {
        Bundle bundle2;
        ProviderInfo[] providerInfoArr;
        String str3;
        Bundle bundle3;
        Bundle bundle4 = null;
        try {
            try {
                providerInfoArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 8).providers;
            } catch (Throwable th) {
                a.a(th);
                providerInfoArr = null;
            }
            if (providerInfoArr != null && providerInfoArr.length > 0) {
                String[] strArr = f8441a;
                int length = strArr.length;
                int i = 0;
                boolean z3 = false;
                while (i < length) {
                    try {
                        str3 = new String(com.baidu.mshield.b.f.d.a(Base64.decode(strArr[i], 10), com.baidu.mshield.b.f.a.a(16)), "UTF-8");
                    } catch (Throwable th2) {
                        a.a(th2);
                        str3 = bundle4;
                    }
                    if (TextUtils.isEmpty(str3)) {
                        bundle3 = bundle4;
                    } else {
                        if ("mshield".equals(str3)) {
                            if (!z) {
                                return bundle4;
                            }
                            z3 = true;
                        }
                        StringBuilder sb = new StringBuilder(CommonUtility.PREFIX_URI);
                        sb.append(context.getPackageName()).append(".").append(str3).append(".ac.provider");
                        String sb2 = sb.toString();
                        com.baidu.mshield.b.c.a.b("request targetUri=" + sb2);
                        int length2 = providerInfoArr.length;
                        int i2 = 0;
                        while (i2 < length2) {
                            String str4 = providerInfoArr[i2].authority;
                            com.baidu.mshield.b.c.a.b("request authority=" + str4);
                            if (sb2.contains(str4)) {
                                Bundle a2 = a(context, str, bundle, Uri.parse(sb.toString()));
                                if (z2) {
                                    boolean z4 = a2.getBoolean("handle_flag");
                                    bundle2 = bundle4;
                                    try {
                                        String string = a2.getString("server_version");
                                        if (z4 && a(string, str2)) {
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                        a.a(th);
                                        return bundle2;
                                    }
                                }
                                return a2;
                            }
                            bundle2 = bundle4;
                            i2++;
                            bundle4 = bundle2;
                        }
                        bundle3 = bundle4;
                        if (z3) {
                            return bundle3;
                        }
                    }
                    i++;
                    bundle4 = bundle3;
                }
                return bundle4;
            }
            return null;
        } catch (Throwable th4) {
            th = th4;
            bundle2 = bundle4;
            a.a(th);
            return bundle2;
        }
    }

    public static Bundle a(Context context, String str, Bundle bundle, String str2) {
        try {
            context.getApplicationContext().getContentResolver();
            StringBuilder sb = new StringBuilder(CommonUtility.PREFIX_URI);
            sb.append(context.getPackageName()).append(".").append(str2).append(".ac.provider");
            return a(context, str, bundle, Uri.parse(sb.toString()));
        } catch (Throwable th) {
            a.a(th);
            return null;
        }
    }

    public static Bundle a(Context context, String str, Bundle bundle, Uri uri) {
        ContentProviderClient contentProviderClient;
        try {
            try {
                contentProviderClient = context.getApplicationContext().getContentResolver().acquireUnstableContentProviderClient(uri);
                try {
                    Bundle call = contentProviderClient.call(str, null, bundle);
                    contentProviderClient.close();
                    return call;
                } catch (Throwable th) {
                    th = th;
                    try {
                        a.a(th);
                        return null;
                    } finally {
                        if (contentProviderClient != null) {
                            contentProviderClient.close();
                        }
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                contentProviderClient = null;
            }
        } catch (Throwable th3) {
            a.a(th3);
            return null;
        }
    }

    public static boolean a(String str, String str2) {
        if (str.equals(str2)) {
            return true;
        }
        String[] split = str.split("\\.");
        String[] split2 = str2.split("\\.");
        for (int i = 0; i < split.length && i < split2.length; i++) {
            int intValue = Integer.valueOf(split[i]).intValue() - Integer.valueOf(split2[i]).intValue();
            if (intValue != 0) {
                return intValue > 0;
            }
        }
        return split.length > split2.length;
    }
}
