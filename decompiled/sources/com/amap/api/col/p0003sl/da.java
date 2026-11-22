package com.amap.api.col.p0003sl;

import android.os.Build;
import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: RomIdentifier.java */
/* loaded from: classes11.dex */
public final class da {

    /* renamed from: a, reason: collision with root package name */
    private static volatile ca f1611a;
    private static final AtomicBoolean b = new AtomicBoolean(false);

    /* compiled from: RomIdentifier.java */
    static class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            synchronized (da.class) {
                if (da.f1611a == null) {
                    try {
                        ca unused = da.f1611a = da.c();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    private da() {
    }

    static /* synthetic */ ca c() {
        ca a2 = a(Build.MANUFACTURER);
        if (!"".equals(a2.a())) {
            return a2;
        }
        Iterator it = Arrays.asList(ca.MIUI.a(), ca.Flyme.a(), ca.RH.a(), ca.ColorOS.a(), ca.FuntouchOS.a(), ca.SmartisanOS.a(), ca.AmigoOS.a(), ca.Sense.a(), ca.LG.a(), ca.Google.a(), ca.NubiaUI.a()).iterator();
        while (it.hasNext()) {
            ca a3 = a((String) it.next());
            if (!"".equals(a3.a())) {
                return a3;
            }
        }
        return ca.Other;
    }

    public static ca a() {
        if (f1611a == null && b.compareAndSet(false, true)) {
            new Thread(new a(), "RI").start();
        }
        return f1611a;
    }

    private static String b(String str) {
        BufferedReader bufferedReader;
        BufferedReader bufferedReader2 = null;
        if (!TextUtils.isEmpty(null)) {
            throw null;
        }
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec("getprop ".concat(str)).getInputStream()), 1024);
            try {
                String readLine = bufferedReader.readLine();
                bufferedReader.close();
                try {
                    bufferedReader.close();
                } catch (IOException unused) {
                }
                return readLine;
            } catch (IOException unused2) {
                if (bufferedReader == null) {
                    return null;
                }
                try {
                    bufferedReader.close();
                    return null;
                } catch (IOException unused3) {
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                bufferedReader2 = bufferedReader;
                if (bufferedReader2 != null) {
                    try {
                        bufferedReader2.close();
                    } catch (IOException unused4) {
                    }
                }
                throw th;
            }
        } catch (IOException unused5) {
            bufferedReader = null;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private static ca a(String str) {
        if (str != null && str.length() > 0) {
            ca caVar = ca.MIUI;
            if (str.equalsIgnoreCase(caVar.a())) {
                if (!TextUtils.isEmpty(b("ro.miui.ui.version.name"))) {
                    String b2 = b("ro.build.version.incremental");
                    a(caVar, b2);
                    caVar.b(b2);
                    return caVar;
                }
            } else {
                ca caVar2 = ca.Flyme;
                if (str.equalsIgnoreCase(caVar2.a())) {
                    String b3 = b("ro.flyme.published");
                    String b4 = b("ro.meizu.setupwizard.flyme");
                    if (!TextUtils.isEmpty(b3) || !TextUtils.isEmpty(b4)) {
                        String b5 = b("ro.build.display.id");
                        a(caVar2, b5);
                        caVar2.b(b5);
                        return caVar2;
                    }
                } else {
                    ca caVar3 = ca.RH;
                    if (str.equalsIgnoreCase(caVar3.a())) {
                        String b6 = b(com.alipay.sdk.m.d.a.f1367a);
                        if (!TextUtils.isEmpty(b6)) {
                            a(caVar3, b6);
                            caVar3.b(b6);
                            return caVar3;
                        }
                    } else {
                        ca caVar4 = ca.ColorOS;
                        if (str.equalsIgnoreCase(caVar4.a())) {
                            String b7 = b("ro.build.version.opporom");
                            if (!TextUtils.isEmpty(b7)) {
                                a(caVar4, b7);
                                caVar4.b(b7);
                                return caVar4;
                            }
                        } else {
                            ca caVar5 = ca.FuntouchOS;
                            if (str.equalsIgnoreCase(caVar5.a())) {
                                String b8 = b("ro.vivo.os.build.display.id");
                                if (!TextUtils.isEmpty(b8)) {
                                    a(caVar5, b8);
                                    caVar5.b(b8);
                                    return caVar5;
                                }
                            } else {
                                ca caVar6 = ca.SmartisanOS;
                                if (str.equalsIgnoreCase(caVar6.a())) {
                                    String b9 = b("ro.smartisan.version");
                                    if (!TextUtils.isEmpty(b9)) {
                                        a(caVar6, b9);
                                        caVar6.b(b9);
                                        return caVar6;
                                    }
                                } else {
                                    ca caVar7 = ca.AmigoOS;
                                    if (str.equalsIgnoreCase(caVar7.a())) {
                                        String b10 = b("ro.build.display.id");
                                        if (!TextUtils.isEmpty(b10) && b10.matches("amigo([\\d.]+)[a-zA-Z]*")) {
                                            a(caVar7, b10);
                                            caVar7.b(b10);
                                            return caVar7;
                                        }
                                    } else {
                                        ca caVar8 = ca.EUI;
                                        if (str.equalsIgnoreCase(caVar8.a())) {
                                            String b11 = b("ro.letv.release.version");
                                            if (!TextUtils.isEmpty(b11)) {
                                                a(caVar8, b11);
                                                caVar8.b(b11);
                                                return caVar8;
                                            }
                                        } else {
                                            ca caVar9 = ca.Sense;
                                            if (str.equalsIgnoreCase(caVar9.a())) {
                                                String b12 = b("ro.build.sense.version");
                                                if (!TextUtils.isEmpty(b12)) {
                                                    a(caVar9, b12);
                                                    caVar9.b(b12);
                                                    return caVar9;
                                                }
                                            } else {
                                                ca caVar10 = ca.LG;
                                                if (str.equalsIgnoreCase(caVar10.a())) {
                                                    String b13 = b("sys.lge.lgmdm_version");
                                                    if (!TextUtils.isEmpty(b13)) {
                                                        a(caVar10, b13);
                                                        caVar10.b(b13);
                                                        return caVar10;
                                                    }
                                                } else {
                                                    ca caVar11 = ca.Google;
                                                    if (str.equalsIgnoreCase(caVar11.a())) {
                                                        if ("android-google".equals(b("ro.com.google.clientidbase"))) {
                                                            String b14 = b("ro.build.version.release");
                                                            caVar11.a(Build.VERSION.SDK_INT);
                                                            caVar11.b(b14);
                                                            return caVar11;
                                                        }
                                                    } else {
                                                        ca caVar12 = ca.NubiaUI;
                                                        if (str.equalsIgnoreCase(caVar12.a())) {
                                                            String b15 = b("ro.build.nubia.rom.code");
                                                            if (!TextUtils.isEmpty(b15)) {
                                                                a(caVar12, b15);
                                                                caVar12.b(b15);
                                                                return caVar12;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return ca.Other;
        }
        return ca.Other;
    }

    private static void a(ca caVar, String str) {
        Matcher matcher = Pattern.compile("([\\d.]+)[^\\d]*").matcher(str);
        if (matcher.find()) {
            try {
                String group = matcher.group(1);
                caVar.a(group);
                caVar.a(Integer.parseInt(group.split("\\.")[0]));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
