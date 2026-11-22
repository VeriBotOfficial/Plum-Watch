package com.baidu.location.f.a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.gov.nist.core.Separators;
import android.net.DhcpInfo;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.baidu.location.f.e;
import com.baidu.location.f.g;
import com.baidu.location.f.k;
import com.phancy.mini.core.resource.MiniPack;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;

/* loaded from: classes13.dex */
public class b implements com.baidu.location.f.b.a {
    private Context h;
    private boolean b = false;
    private WifiManager e = null;
    private C0348b f = null;
    private k g = null;
    private AtomicInteger i = new AtomicInteger(0);

    /* renamed from: a, reason: collision with root package name */
    public long f7657a = 0;
    private long j = 0;
    private long k = 0;
    private long l = 0;
    private long m = 0;
    private WifiInfo n = null;
    private String o = null;
    private final Object p = new Object();

    /* renamed from: q, reason: collision with root package name */
    private final Object f7658q = new Object();
    private Handler r = null;
    private String s = null;

    private static class a {

        /* renamed from: a, reason: collision with root package name */
        private static b f7659a = new b();
    }

    /* renamed from: com.baidu.location.f.a.b$b, reason: collision with other inner class name */
    private class C0348b extends BroadcastReceiver {
        private C0348b() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (context == null) {
                return;
            }
            if ((!com.baidu.location.f.b.a.d || g.i().a(intent)) && intent.getAction().equals("android.net.wifi.SCAN_RESULTS")) {
                b.this.f7657a = System.currentTimeMillis() / 1000;
                b.this.r.post(new Runnable() { // from class: com.baidu.location.f.a.b.b.1
                    @Override // java.lang.Runnable
                    public void run() {
                        b.this.j();
                        synchronized (b.this.p) {
                            b.this.p.notifyAll();
                            if (com.baidu.location.f.b.a.c && com.baidu.location.f.b.a.d) {
                                g.i().a("WifiScan finished, in callback.");
                            }
                        }
                    }
                });
            }
        }
    }

    public static b a() {
        return a.f7659a;
    }

    private k a(k kVar) {
        if (kVar != null) {
            return new k(kVar.f7689a, kVar.b);
        }
        return null;
    }

    public static boolean a(k kVar, k kVar2, float f) {
        if (kVar != null && kVar2 != null) {
            List<ScanResult> list = kVar.f7689a;
            List<ScanResult> list2 = kVar2.f7689a;
            if (list == list2) {
                return true;
            }
            if (list != null && list2 != null) {
                int size = list.size();
                int size2 = list2.size();
                if (size == 0 && size2 == 0) {
                    return true;
                }
                if (size != 0 && size2 != 0) {
                    int i = 0;
                    for (int i2 = 0; i2 < size; i2++) {
                        String str = list.get(i2) != null ? list.get(i2).BSSID : null;
                        if (str != null) {
                            int i3 = 0;
                            while (true) {
                                if (i3 >= size2) {
                                    break;
                                }
                                String str2 = list2.get(i3) != null ? list2.get(i3).BSSID : null;
                                if (str2 != null && str.equals(str2)) {
                                    i++;
                                    break;
                                }
                                i3++;
                            }
                        }
                    }
                    if (c && d) {
                        g.i().a("wifi same!" + (i / size));
                    }
                    if (i >= size * f) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return Pattern.compile("wpa|wep", 2).matcher(str).find();
    }

    private String b(long j) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(String.valueOf((int) (j & 255)));
        stringBuffer.append('.');
        stringBuffer.append(String.valueOf((int) ((j >> 8) & 255)));
        stringBuffer.append('.');
        stringBuffer.append(String.valueOf((int) ((j >> 16) & 255)));
        stringBuffer.append('.');
        stringBuffer.append(String.valueOf((int) ((j >> 24) & 255)));
        return stringBuffer.toString();
    }

    private String b(String str) {
        return str != null ? (str.contains("&") || str.contains(";")) ? str.replace("&", "_").replace(";", "_") : str : str;
    }

    private synchronized WifiInfo g() {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.l > 5000) {
            WifiManager wifiManager = this.e;
            if (wifiManager != null) {
                this.n = wifiManager.getConnectionInfo();
            }
            this.l = currentTimeMillis;
        }
        return this.n;
    }

    private void h() {
        try {
            if (this.e.isWifiEnabled() || this.e.isScanAlwaysAvailable()) {
                this.e.startScan();
                if (c && d) {
                    g.i().a("wifimanager start scan ...");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.j = System.currentTimeMillis();
        synchronized (this.p) {
            try {
                int i = this.i.get();
                if (i != 0) {
                    this.p.wait(i);
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    private String i() {
        DhcpInfo dhcpInfo;
        WifiManager wifiManager = this.e;
        if (wifiManager == null || (dhcpInfo = wifiManager.getDhcpInfo()) == null) {
            return null;
        }
        return b(dhcpInfo.gateway);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        WifiManager wifiManager = this.e;
        if (wifiManager == null) {
            return;
        }
        try {
            List<ScanResult> scanResults = wifiManager.getScanResults();
            if (c && d) {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat(MiniPack.BUILD_TIME_FORMAT);
                long currentTimeMillis = System.currentTimeMillis();
                if (scanResults != null && scanResults.size() > 0) {
                    StringBuilder sb = new StringBuilder();
                    long j = 0;
                    for (int i = 0; i < scanResults.size(); i++) {
                        if (i == 0) {
                            try {
                                j = (currentTimeMillis - scanResults.get(0).timestamp) / 1000000;
                            } catch (Exception e) {
                                e.printStackTrace();
                                j = 0;
                            }
                            sb.append(scanResults.get(0).BSSID + ";" + Math.abs(scanResults.get(0).level) + ";" + scanResults.get(0).SSID.trim() + ";" + scanResults.get(0).frequency + ";" + j + "|");
                        }
                        sb.append(scanResults.get(i).BSSID + ";" + Math.abs(scanResults.get(i).level) + ";" + scanResults.get(i).SSID.trim() + ";" + scanResults.get(i).frequency + ";" + (((currentTimeMillis - scanResults.get(i).timestamp) / 1000000) - j) + "|");
                    }
                    sb.append(Separators.HT);
                    sb.append(simpleDateFormat.format(new Date(currentTimeMillis)));
                    sb.append(Separators.HT).append(currentTimeMillis);
                    sb.append("\tnull\n");
                    g.i().a(sb.toString());
                }
            }
            if (scanResults != null) {
                k kVar = new k(scanResults, System.currentTimeMillis());
                synchronized (this.f7658q) {
                    k kVar2 = this.g;
                    if (kVar2 == null || !a(kVar, kVar2)) {
                        this.g = kVar;
                    }
                }
            }
        } catch (Exception e2) {
            if (c) {
                e2.printStackTrace();
            }
        }
    }

    public k a(long j) {
        e i;
        String str;
        if (this.e != null && j < 2147483647L) {
            if (c && d) {
                g.i().a("Wi-Fi diffTime = " + j + "mLastDiffTime = " + this.k);
            }
            if (j == this.k) {
                if (c && d) {
                    g.i().a("System.currentTimeMillis() = " + System.currentTimeMillis() + "wifi diffTime = " + j + ", mScanTime = " + this.j);
                }
                if (System.currentTimeMillis() - this.j > j) {
                    if (c && d) {
                        i = g.i();
                        str = "time is over";
                        i.a(str);
                    }
                    h();
                }
            } else {
                if (c && d) {
                    i = g.i();
                    str = "diffTime is changed";
                    i.a(str);
                }
                h();
            }
        }
        this.k = j;
        return this.g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01a1 A[Catch: Exception -> 0x0095, Error -> 0x04cb, TryCatch #3 {Error -> 0x04cb, blocks: (B:11:0x0040, B:14:0x0053, B:16:0x0057, B:18:0x005b, B:31:0x00aa, B:40:0x00d6, B:42:0x00de, B:127:0x00ee, B:130:0x00fa, B:131:0x0114, B:133:0x0118, B:135:0x011c, B:136:0x013b, B:138:0x0146, B:140:0x014a, B:58:0x0194, B:61:0x0199, B:62:0x01a7, B:64:0x01b3, B:67:0x01ca, B:69:0x01e2, B:71:0x01e8, B:78:0x020a, B:80:0x0210, B:82:0x021c, B:84:0x022c, B:88:0x0312, B:94:0x02a6, B:96:0x02aa, B:103:0x0260, B:105:0x0266, B:107:0x0272, B:109:0x0282, B:112:0x02b1, B:114:0x02b9, B:116:0x02bd, B:117:0x02e1, B:123:0x01a1, B:145:0x010b, B:147:0x010f, B:154:0x031f, B:156:0x032b, B:158:0x032f, B:161:0x0350, B:163:0x0358, B:165:0x0364, B:169:0x0373, B:170:0x037d, B:172:0x0389, B:175:0x039d, B:181:0x03b5, B:182:0x037a, B:187:0x03ba, B:189:0x03d4, B:193:0x03e7, B:196:0x0403, B:198:0x0409, B:200:0x0418, B:201:0x0430, B:203:0x0436, B:205:0x043e, B:207:0x045b, B:208:0x0447, B:210:0x0454, B:214:0x045f, B:216:0x0463, B:218:0x0467, B:219:0x0485, B:220:0x048c, B:222:0x04ac, B:224:0x04bb, B:225:0x04c5), top: B:10:0x0040 }] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0146 A[Catch: Exception -> 0x0095, Error -> 0x04cb, TryCatch #3 {Error -> 0x04cb, blocks: (B:11:0x0040, B:14:0x0053, B:16:0x0057, B:18:0x005b, B:31:0x00aa, B:40:0x00d6, B:42:0x00de, B:127:0x00ee, B:130:0x00fa, B:131:0x0114, B:133:0x0118, B:135:0x011c, B:136:0x013b, B:138:0x0146, B:140:0x014a, B:58:0x0194, B:61:0x0199, B:62:0x01a7, B:64:0x01b3, B:67:0x01ca, B:69:0x01e2, B:71:0x01e8, B:78:0x020a, B:80:0x0210, B:82:0x021c, B:84:0x022c, B:88:0x0312, B:94:0x02a6, B:96:0x02aa, B:103:0x0260, B:105:0x0266, B:107:0x0272, B:109:0x0282, B:112:0x02b1, B:114:0x02b9, B:116:0x02bd, B:117:0x02e1, B:123:0x01a1, B:145:0x010b, B:147:0x010f, B:154:0x031f, B:156:0x032b, B:158:0x032f, B:161:0x0350, B:163:0x0358, B:165:0x0364, B:169:0x0373, B:170:0x037d, B:172:0x0389, B:175:0x039d, B:181:0x03b5, B:182:0x037a, B:187:0x03ba, B:189:0x03d4, B:193:0x03e7, B:196:0x0403, B:198:0x0409, B:200:0x0418, B:201:0x0430, B:203:0x0436, B:205:0x043e, B:207:0x045b, B:208:0x0447, B:210:0x0454, B:214:0x045f, B:216:0x0463, B:218:0x0467, B:219:0x0485, B:220:0x048c, B:222:0x04ac, B:224:0x04bb, B:225:0x04c5), top: B:10:0x0040 }] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x031f A[EDGE_INSN: B:153:0x031f->B:154:0x031f BREAK  A[LOOP:0: B:37:0x00cc->B:88:0x0312], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:160:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x03ba A[Catch: Exception -> 0x0095, Error -> 0x04cb, TryCatch #3 {Error -> 0x04cb, blocks: (B:11:0x0040, B:14:0x0053, B:16:0x0057, B:18:0x005b, B:31:0x00aa, B:40:0x00d6, B:42:0x00de, B:127:0x00ee, B:130:0x00fa, B:131:0x0114, B:133:0x0118, B:135:0x011c, B:136:0x013b, B:138:0x0146, B:140:0x014a, B:58:0x0194, B:61:0x0199, B:62:0x01a7, B:64:0x01b3, B:67:0x01ca, B:69:0x01e2, B:71:0x01e8, B:78:0x020a, B:80:0x0210, B:82:0x021c, B:84:0x022c, B:88:0x0312, B:94:0x02a6, B:96:0x02aa, B:103:0x0260, B:105:0x0266, B:107:0x0272, B:109:0x0282, B:112:0x02b1, B:114:0x02b9, B:116:0x02bd, B:117:0x02e1, B:123:0x01a1, B:145:0x010b, B:147:0x010f, B:154:0x031f, B:156:0x032b, B:158:0x032f, B:161:0x0350, B:163:0x0358, B:165:0x0364, B:169:0x0373, B:170:0x037d, B:172:0x0389, B:175:0x039d, B:181:0x03b5, B:182:0x037a, B:187:0x03ba, B:189:0x03d4, B:193:0x03e7, B:196:0x0403, B:198:0x0409, B:200:0x0418, B:201:0x0430, B:203:0x0436, B:205:0x043e, B:207:0x045b, B:208:0x0447, B:210:0x0454, B:214:0x045f, B:216:0x0463, B:218:0x0467, B:219:0x0485, B:220:0x048c, B:222:0x04ac, B:224:0x04bb, B:225:0x04c5), top: B:10:0x0040 }] */
    /* JADX WARN: Removed duplicated region for block: B:229:0x04ca A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:237:0x04d6  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0199 A[Catch: Exception -> 0x0095, Error -> 0x04cb, TryCatch #3 {Error -> 0x04cb, blocks: (B:11:0x0040, B:14:0x0053, B:16:0x0057, B:18:0x005b, B:31:0x00aa, B:40:0x00d6, B:42:0x00de, B:127:0x00ee, B:130:0x00fa, B:131:0x0114, B:133:0x0118, B:135:0x011c, B:136:0x013b, B:138:0x0146, B:140:0x014a, B:58:0x0194, B:61:0x0199, B:62:0x01a7, B:64:0x01b3, B:67:0x01ca, B:69:0x01e2, B:71:0x01e8, B:78:0x020a, B:80:0x0210, B:82:0x021c, B:84:0x022c, B:88:0x0312, B:94:0x02a6, B:96:0x02aa, B:103:0x0260, B:105:0x0266, B:107:0x0272, B:109:0x0282, B:112:0x02b1, B:114:0x02b9, B:116:0x02bd, B:117:0x02e1, B:123:0x01a1, B:145:0x010b, B:147:0x010f, B:154:0x031f, B:156:0x032b, B:158:0x032f, B:161:0x0350, B:163:0x0358, B:165:0x0364, B:169:0x0373, B:170:0x037d, B:172:0x0389, B:175:0x039d, B:181:0x03b5, B:182:0x037a, B:187:0x03ba, B:189:0x03d4, B:193:0x03e7, B:196:0x0403, B:198:0x0409, B:200:0x0418, B:201:0x0430, B:203:0x0436, B:205:0x043e, B:207:0x045b, B:208:0x0447, B:210:0x0454, B:214:0x045f, B:216:0x0463, B:218:0x0467, B:219:0x0485, B:220:0x048c, B:222:0x04ac, B:224:0x04bb, B:225:0x04c5), top: B:10:0x0040 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01b3 A[Catch: Exception -> 0x0095, Error -> 0x04cb, TryCatch #3 {Error -> 0x04cb, blocks: (B:11:0x0040, B:14:0x0053, B:16:0x0057, B:18:0x005b, B:31:0x00aa, B:40:0x00d6, B:42:0x00de, B:127:0x00ee, B:130:0x00fa, B:131:0x0114, B:133:0x0118, B:135:0x011c, B:136:0x013b, B:138:0x0146, B:140:0x014a, B:58:0x0194, B:61:0x0199, B:62:0x01a7, B:64:0x01b3, B:67:0x01ca, B:69:0x01e2, B:71:0x01e8, B:78:0x020a, B:80:0x0210, B:82:0x021c, B:84:0x022c, B:88:0x0312, B:94:0x02a6, B:96:0x02aa, B:103:0x0260, B:105:0x0266, B:107:0x0272, B:109:0x0282, B:112:0x02b1, B:114:0x02b9, B:116:0x02bd, B:117:0x02e1, B:123:0x01a1, B:145:0x010b, B:147:0x010f, B:154:0x031f, B:156:0x032b, B:158:0x032f, B:161:0x0350, B:163:0x0358, B:165:0x0364, B:169:0x0373, B:170:0x037d, B:172:0x0389, B:175:0x039d, B:181:0x03b5, B:182:0x037a, B:187:0x03ba, B:189:0x03d4, B:193:0x03e7, B:196:0x0403, B:198:0x0409, B:200:0x0418, B:201:0x0430, B:203:0x0436, B:205:0x043e, B:207:0x045b, B:208:0x0447, B:210:0x0454, B:214:0x045f, B:216:0x0463, B:218:0x0467, B:219:0x0485, B:220:0x048c, B:222:0x04ac, B:224:0x04bb, B:225:0x04c5), top: B:10:0x0040 }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02aa A[Catch: Exception -> 0x0095, Error -> 0x04cb, TryCatch #3 {Error -> 0x04cb, blocks: (B:11:0x0040, B:14:0x0053, B:16:0x0057, B:18:0x005b, B:31:0x00aa, B:40:0x00d6, B:42:0x00de, B:127:0x00ee, B:130:0x00fa, B:131:0x0114, B:133:0x0118, B:135:0x011c, B:136:0x013b, B:138:0x0146, B:140:0x014a, B:58:0x0194, B:61:0x0199, B:62:0x01a7, B:64:0x01b3, B:67:0x01ca, B:69:0x01e2, B:71:0x01e8, B:78:0x020a, B:80:0x0210, B:82:0x021c, B:84:0x022c, B:88:0x0312, B:94:0x02a6, B:96:0x02aa, B:103:0x0260, B:105:0x0266, B:107:0x0272, B:109:0x0282, B:112:0x02b1, B:114:0x02b9, B:116:0x02bd, B:117:0x02e1, B:123:0x01a1, B:145:0x010b, B:147:0x010f, B:154:0x031f, B:156:0x032b, B:158:0x032f, B:161:0x0350, B:163:0x0358, B:165:0x0364, B:169:0x0373, B:170:0x037d, B:172:0x0389, B:175:0x039d, B:181:0x03b5, B:182:0x037a, B:187:0x03ba, B:189:0x03d4, B:193:0x03e7, B:196:0x0403, B:198:0x0409, B:200:0x0418, B:201:0x0430, B:203:0x0436, B:205:0x043e, B:207:0x045b, B:208:0x0447, B:210:0x0454, B:214:0x045f, B:216:0x0463, B:218:0x0467, B:219:0x0485, B:220:0x048c, B:222:0x04ac, B:224:0x04bb, B:225:0x04c5), top: B:10:0x0040 }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0312 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v45 */
    /* JADX WARN: Type inference failed for: r3v47 */
    /* JADX WARN: Type inference failed for: r3v48 */
    /* JADX WARN: Type inference failed for: r3v58 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String a(int r38, boolean r39, com.baidu.location.f.k r40, int r41) {
        /*
            Method dump skipped, instructions count: 1245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baidu.location.f.a.b.a(int, boolean, com.baidu.location.f.k, int):java.lang.String");
    }

    public synchronized String a(WifiInfo wifiInfo, String str) {
        if (wifiInfo == null && str == null) {
            return null;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.m > 1000) {
            if (wifiInfo != null) {
                this.o = wifiInfo.getBSSID();
            } else {
                this.o = str;
            }
            this.m = currentTimeMillis;
        }
        return this.o;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x014c A[EDGE_INSN: B:36:0x014c->B:37:0x014c BREAK  A[LOOP:0: B:12:0x0043->B:35:0x013c], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String a(com.baidu.location.f.k r31, int r32, java.lang.String r33, boolean r34, int r35) {
        /*
            Method dump skipped, instructions count: 576
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baidu.location.f.a.b.a(com.baidu.location.f.k, int, java.lang.String, boolean, int):java.lang.String");
    }

    public void a(int i) {
        this.i.set(i);
    }

    public void a(Context context, List<String> list) {
        if (this.b) {
            return;
        }
        this.h = context;
        this.e = (WifiManager) context.getApplicationContext().getSystemService("wifi");
        this.f = new C0348b();
        if (this.r == null) {
            this.r = new Handler(Looper.getMainLooper());
        }
        if (list == null) {
            list = new ArrayList<>();
        }
        if (!list.contains("android.net.wifi.SCAN_RESULTS")) {
            list.add("android.net.wifi.SCAN_RESULTS");
        }
        try {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                this.h.registerReceiver(this.f, new IntentFilter(it.next()));
            }
        } catch (Exception e) {
            if (c) {
                e.printStackTrace();
            }
        }
        this.b = true;
        if (c && d) {
            g.i().a("wifimanager start ...");
        }
    }

    public boolean a(k kVar, k kVar2) {
        if (kVar.f7689a == null || kVar2 == null || kVar2.f7689a == null) {
            return false;
        }
        int min = Math.min(kVar.f7689a.size(), kVar2.f7689a.size());
        for (int i = 0; i < min; i++) {
            try {
                if (kVar.f7689a.get(i) != null) {
                    String str = kVar.f7689a.get(i).BSSID;
                    String str2 = kVar2.f7689a.get(i).BSSID;
                    if (!TextUtils.isEmpty(str) && !str.equals(str2)) {
                        return false;
                    }
                }
            } catch (Exception e) {
                if (c) {
                    e.printStackTrace();
                }
                return false;
            }
        }
        return true;
    }

    public void b() {
        if (this.b) {
            try {
                this.h.unregisterReceiver(this.f);
                this.f7657a = 0L;
            } catch (Exception e) {
                if (c) {
                    e.printStackTrace();
                }
            }
            this.f = null;
            this.e = null;
            this.b = false;
            if (c && d) {
                g.i().a("wifimanager stop ...");
            }
        }
    }

    public long c() {
        return this.j;
    }

    public k d() {
        k a2;
        synchronized (this.f7658q) {
            a2 = a(this.g);
        }
        if (a2 == null || !a2.b()) {
            try {
                return this.e != null ? new k(this.e.getScanResults(), this.j) : new k(null, 0L);
            } catch (Exception e) {
                if (c) {
                    e.printStackTrace();
                }
            }
        }
        return a2;
    }

    public String e() {
        StringBuffer stringBuffer = new StringBuffer("&wf=");
        WifiInfo f = a().f();
        String a2 = a(f, (String) null);
        if (f != null && a2 != null) {
            String replace = a2.replace(":", "");
            int rssi = f.getRssi();
            String i = a().i();
            if (rssi < 0) {
                rssi = -rssi;
            }
            if (replace != null && rssi < 100 && !"020000000000".equals(replace)) {
                stringBuffer.append(replace);
                stringBuffer.append(";");
                stringBuffer.append("" + rssi + ";");
                String ssid = f.getSSID();
                if (ssid != null && (ssid.contains("&") || ssid.contains(";"))) {
                    ssid = ssid.replace("&", "_");
                }
                stringBuffer.append(ssid);
                stringBuffer.append("&wf_n=1");
                if (i != null) {
                    stringBuffer.append("&wf_gw=");
                    stringBuffer.append(i);
                }
                return stringBuffer.toString();
            }
        }
        return null;
    }

    public WifiInfo f() {
        try {
            WifiInfo g = g();
            String a2 = a(g, (String) null);
            if (g != null && a2 != null && g.getRssi() > -100) {
                if (a2 != null) {
                    String replace = a2.replace(":", "");
                    if (!"000000000000".equals(replace) && !"".equals(replace)) {
                        if ("020000000000".equals(replace)) {
                        }
                    }
                    return null;
                }
                return g;
            }
        } catch (Error | Exception unused) {
        }
        return null;
    }
}
