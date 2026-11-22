package com.baidu.mshield.b.a;

import android.content.Context;
import android.text.TextUtils;
import com.qumeng.overseas.advlib.__remote__.core.proto.utils.w;
import java.util.HashMap;

/* compiled from: SysInfoUtils.java */
/* loaded from: classes13.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    public static final HashMap<String, String> f8415a = new HashMap<>();

    public static String a(Context context) {
        return com.baidu.sec.privacy.e.a.a(context).b();
    }

    public static String b() {
        return a("arv");
    }

    public static String c(Context context) {
        try {
            String a2 = a(context);
            String a3 = com.baidu.sec.privacy.f.g.a("ro.build.display.id", "");
            if (!TextUtils.isEmpty(a2)) {
                if (a2.equalsIgnoreCase("HUAWEI")) {
                    return com.baidu.sec.privacy.f.g.a(com.alipay.sdk.m.d.a.f1367a, a3);
                }
                if (a2.equalsIgnoreCase("XIAOMI")) {
                    return com.baidu.sec.privacy.f.g.a("ro.build.version.incremental", a3);
                }
                if (a2.equalsIgnoreCase(w.d)) {
                    return com.baidu.sec.privacy.f.g.a("ro.build.version.opporom", a3);
                }
                if (a2.equalsIgnoreCase(w.f)) {
                    return com.baidu.sec.privacy.f.g.a("ro.vivo.rom.version", a3);
                }
                if (a2.equalsIgnoreCase("BBK")) {
                    return com.baidu.sec.privacy.f.g.a("ro.build.version.bbk", a3);
                }
                if (a2.equalsIgnoreCase("MEIZU")) {
                    return com.baidu.sec.privacy.f.g.a("ro.build.version.incremental", a3);
                }
                if (!a2.equalsIgnoreCase("SAMSUNG") && !a2.equalsIgnoreCase("GiONEE")) {
                    if (a2.equalsIgnoreCase("ZTE")) {
                        String a4 = com.baidu.sec.privacy.f.g.a("ro.build.rom.id", a3);
                        if (!a3.equals(a4)) {
                            return a4;
                        }
                        String a5 = com.baidu.sec.privacy.f.g.a("apps.setting.product.release", a3);
                        return a3.equals(a5) ? com.baidu.sec.privacy.f.g.a("ro.bliss.display.version", a3) : a5;
                    }
                    if (!a2.equalsIgnoreCase("LeMobile") && !a2.equalsIgnoreCase("Letv")) {
                        if (a2.equalsIgnoreCase("LENOVO")) {
                            String a6 = a();
                            if (!TextUtils.isEmpty(a6)) {
                                if (a6.equalsIgnoreCase("Lenovo A5800-D")) {
                                    return com.baidu.sec.privacy.f.g.a("ro.build.cmccdisplay.id", a3);
                                }
                                if (a6.equalsIgnoreCase("Lenovo K900")) {
                                    return com.baidu.sec.privacy.f.g.a("ro.build.version.incremental", a3);
                                }
                            }
                        } else if (!a2.equalsIgnoreCase("YuLong")) {
                            if (a2.equalsIgnoreCase("OnePlus")) {
                                return com.baidu.sec.privacy.f.g.a("ro.rom.version", a3);
                            }
                            if (a2.equalsIgnoreCase("QiKU")) {
                                return com.baidu.sec.privacy.f.g.a("ro.build.uiversion", a3);
                            }
                            if (a2.equalsIgnoreCase("nubia")) {
                                return com.baidu.sec.privacy.f.g.a("ro.build.rom.id", a3);
                            }
                            if (!a2.equalsIgnoreCase("motorola")) {
                                if (a2.equalsIgnoreCase("HTC")) {
                                    return com.baidu.sec.privacy.f.g.a("ro.build.sense.version", a3);
                                }
                                if (a2.equalsIgnoreCase("ZUK")) {
                                    return com.baidu.sec.privacy.f.g.a("ro.build.version.incremental", a3);
                                }
                                if (a2.equalsIgnoreCase("K-Touch")) {
                                    return com.baidu.sec.privacy.f.g.a("ro.yunos.version", a3);
                                }
                                if (a2.equalsIgnoreCase("MeiTu")) {
                                    return com.baidu.sec.privacy.f.g.a("ro.build.version.meios", a3);
                                }
                                if (a2.equalsIgnoreCase("DOOV")) {
                                    return com.baidu.sec.privacy.f.g.a("ro.fota.version", a3);
                                }
                                if (a2.equalsIgnoreCase("hisense")) {
                                    String a7 = a();
                                    if (!TextUtils.isEmpty(a7)) {
                                        if (a7.equalsIgnoreCase("hisense e76")) {
                                            return com.baidu.sec.privacy.f.g.a("ro.hs.ui.style", a3);
                                        }
                                        if (a7.equalsIgnoreCase("hisense e51-m")) {
                                            return com.baidu.sec.privacy.f.g.a("hw.cabl.version", a3);
                                        }
                                    }
                                } else {
                                    if (a2.equalsIgnoreCase("Changhong")) {
                                        return com.baidu.sec.privacy.f.g.a("ro.fota.version", a3);
                                    }
                                    if (a2.equalsIgnoreCase("smartisan")) {
                                        return com.baidu.sec.privacy.f.g.a("ro.smartisan.version", a3);
                                    }
                                    if (a2.equalsIgnoreCase("NM")) {
                                        return com.baidu.sec.privacy.f.g.a("ro.xh.display.version", a3);
                                    }
                                    if (a2.equalsIgnoreCase("HONOR")) {
                                        return com.baidu.sec.privacy.f.g.a(com.alipay.sdk.m.d.a.f1367a, a3);
                                    }
                                    if (a2.equalsIgnoreCase("REALME")) {
                                        return com.baidu.sec.privacy.f.g.a("ro.build.version.opporom", a3);
                                    }
                                }
                            }
                        }
                    }
                    return com.baidu.sec.privacy.f.g.a("ro.letv.release.version", a3);
                }
            }
            return a3;
        } catch (Throwable th) {
            com.baidu.sec.privacy.f.c.a(th);
            return "";
        }
    }

    public static String a() {
        return a("mod");
    }

    public static String b(Context context) {
        String a2;
        try {
            a2 = a(context);
        } catch (Throwable th) {
            com.baidu.sec.privacy.f.c.a(th);
        }
        if (TextUtils.isEmpty(a2)) {
            return "";
        }
        if (a2.equalsIgnoreCase("HUAWEI")) {
            return "EmotionUI";
        }
        if (a2.equalsIgnoreCase("HONOR")) {
            return "MagicUI";
        }
        if (a2.equalsIgnoreCase("XIAOMI")) {
            return com.baidu.sec.privacy.f.g.a("ro.miui.ui.version.name", w.f12865a);
        }
        if (a2.equalsIgnoreCase(w.d)) {
            return "ColorOS";
        }
        if (a2.equalsIgnoreCase(w.f)) {
            return com.baidu.sec.privacy.f.g.a("ro.vivo.os.name", "Funtouch");
        }
        if (a2.equalsIgnoreCase("BBK")) {
            return "BBK";
        }
        if (a2.equalsIgnoreCase("MEIZU")) {
            return com.baidu.sec.privacy.f.g.a("ro.build.user", "Flyme");
        }
        if (a2.equalsIgnoreCase("samsung")) {
            return "SAMSUNG";
        }
        if (a2.equalsIgnoreCase("GiONEE")) {
            return com.baidu.sec.privacy.f.g.a("ro.build.display.id", "Amigo");
        }
        if (!a2.equalsIgnoreCase("ZTE")) {
            return (a2.equalsIgnoreCase("LeMobile") || a2.equalsIgnoreCase("Letv")) ? "EUI" : a2.equalsIgnoreCase("LENOVO") ? "LENOVO" : a2.equalsIgnoreCase("YuLong") ? "COOLUI" : a2.equalsIgnoreCase("OnePlus") ? "H2OS" : a2.equalsIgnoreCase("QiKU") ? w.g : a2.equalsIgnoreCase("nubia") ? com.baidu.sec.privacy.f.g.a("ro.build.nubia.rom.name", "NUBIAUI") : a2.equalsIgnoreCase("motorola") ? "MOTOROLA" : a2.equalsIgnoreCase("HTC") ? "HTC Sense" : a2.equalsIgnoreCase("ZUK") ? "ZUI" : a2.equalsIgnoreCase("coolpad") ? "COOLPAD" : a2.equalsIgnoreCase("360") ? com.baidu.sec.privacy.f.g.a("ro.build.uiversion", "360") : a2.equalsIgnoreCase("K-Touch") ? "KTOUCH" : a2.equalsIgnoreCase("MeiTu") ? com.baidu.sec.privacy.f.g.a("ro.build.user", "MEITU") : a2.equalsIgnoreCase("DOOV") ? com.baidu.sec.privacy.f.g.a("ro.fota.oem", "DOOV") : a2.equalsIgnoreCase("TCL") ? "TCL" : a2.equalsIgnoreCase("Yota Devices Limited") ? "Yota" : a2.equalsIgnoreCase("lge") ? com.baidu.sec.privacy.f.g.a("ro.build.product", "LGE") : a2.equalsIgnoreCase("hisense") ? "VISION" : a2.equalsIgnoreCase("Changhong") ? "CHANGHONG" : a2.equalsIgnoreCase("Sony") ? "Sony" : a2.equalsIgnoreCase("smartisan") ? "smartisan" : a2.equalsIgnoreCase("NM") ? "newman" : a2.equalsIgnoreCase("REALME") ? "realmeUI" : "";
        }
        String a3 = a();
        return (TextUtils.isEmpty(a3) || !a3.equalsIgnoreCase("X9180")) ? com.baidu.sec.privacy.f.g.a("ro.build.nubia.rom.name", "ZTE") : "Bliss";
    }

    public static String a(String str) {
        try {
            HashMap<String, String> hashMap = f8415a;
            if (hashMap.size() <= 0) {
                return "";
            }
            synchronized (hashMap) {
                if (!hashMap.containsKey(str)) {
                    return "";
                }
                return hashMap.get(str);
            }
        } catch (Throwable th) {
            com.baidu.sec.privacy.f.c.a(th);
            return "";
        }
    }

    public static void a(HashMap<String, String> hashMap) {
        if (hashMap != null) {
            HashMap<String, String> hashMap2 = f8415a;
            synchronized (hashMap2) {
                hashMap2.putAll(hashMap);
            }
        }
    }

    public static void b(HashMap<String, String> hashMap) {
        if (hashMap != null) {
            try {
                if (hashMap.size() == 0) {
                    return;
                }
                synchronized (f8415a) {
                    for (String str : hashMap.keySet()) {
                        f8415a.put(str, hashMap.get(str));
                    }
                }
            } catch (Throwable th) {
                com.baidu.sec.privacy.f.c.a(th);
            }
        }
    }
}
