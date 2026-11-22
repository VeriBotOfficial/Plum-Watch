package com.baidu.location.f;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiConfiguration;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.telephony.CellIdentityLte;
import android.telephony.CellIdentityNr;
import android.telephony.CellInfo;
import android.telephony.CellInfoLte;
import android.telephony.CellInfoNr;
import android.telephony.CellSignalStrengthLte;
import android.telephony.CellSignalStrengthNr;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Base64;
import com.baidu.location.b.aa;
import com.baidu.location.b.p;
import com.baidu.location.b.v;
import com.baidu.location.f.g;
import com.baidu.location.pb.CellCommonValue;
import com.baidu.location.pb.CellValue;
import com.baidu.location.pb.CellValueList;
import com.baidu.location.pb.LteCellValue;
import com.baidu.location.pb.NrCellValue;
import com.google.protobuf.micro.ByteStringMicro;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes13.dex */
public class f {
    private g e;
    private b f;
    private TelephonyManager g;

    /* renamed from: a, reason: collision with root package name */
    private final String f7678a = "NetLocDataManager";
    private final int b = 2000;
    private final int c = 100;
    private final int d = 30000;
    private ConnectivityManager h = null;
    private WifiManager i = null;
    private Handler j = null;
    private String k = null;
    private boolean l = false;
    private long m = 0;
    private long n = 0;
    private long o = 0;
    private long p = 0;

    /* renamed from: q, reason: collision with root package name */
    private boolean f7679q = false;
    private boolean r = false;
    private String s = null;
    private String t = null;
    private long u = 0;

    private static class a {

        /* renamed from: a, reason: collision with root package name */
        private static final f f7680a = new f();
    }

    public class b extends e {
        private long b = 0;
        private boolean c = false;

        public b() {
        }

        @Override // com.baidu.location.f.e
        public void a(String str) {
        }

        @Override // com.baidu.location.f.e
        public boolean a(Intent intent) {
            String action = intent.getAction();
            if (action.equals("android.net.wifi.SCAN_RESULTS")) {
                final boolean booleanExtra = intent.getBooleanExtra("resultsUpdated", true);
                f.this.n = System.currentTimeMillis() / 1000;
                if (f.this.j == null) {
                    return true;
                }
                f.this.j.post(new Runnable() { // from class: com.baidu.location.f.f.b.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (!f.this.l) {
                            f.this.l = booleanExtra;
                        }
                        p.c().j();
                        if (com.baidu.location.indoor.h.a().e()) {
                            com.baidu.location.indoor.h.a().f7757a.obtainMessage(41).sendToTarget();
                        }
                        if (System.currentTimeMillis() - v.b() <= 5000) {
                            aa.a().c();
                        }
                    }
                });
            } else if (action.equals("android.net.wifi.STATE_CHANGE")) {
                if (!((NetworkInfo) intent.getParcelableExtra("networkInfo")).getState().equals(NetworkInfo.State.CONNECTED) || System.currentTimeMillis() - this.b < 5000) {
                    return false;
                }
                this.b = System.currentTimeMillis();
                if (!this.c) {
                    this.c = true;
                    return false;
                }
                if (f.this.j == null) {
                    return false;
                }
            }
            return true;
        }

        @Override // com.baidu.location.f.e
        public boolean a(List<CellInfo> list) {
            com.baidu.location.c.b.a().e();
            return true;
        }
    }

    static class c implements Comparator<ScanResult> {
        c() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(ScanResult scanResult, ScanResult scanResult2) {
            return scanResult2.level - scanResult.level;
        }
    }

    private static class d implements Comparator<h> {
        private d() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(h hVar, h hVar2) {
            return hVar.d != hVar2.d ? Integer.compare(hVar2.d, hVar.d) : Long.compare(hVar2.e, hVar.e);
        }
    }

    public static f a() {
        return a.f7680a;
    }

    private h a(CellInfo cellInfo) {
        long elapsedRealtimeNanos;
        int i = Build.VERSION.SDK_INT;
        if (!(cellInfo instanceof CellInfoLte)) {
            CellIdentityNr cellIdentityNr = null;
            if (i < 29 || !(cellInfo instanceof CellInfoNr)) {
                return null;
            }
            j jVar = new j();
            try {
                cellIdentityNr = (CellIdentityNr) ((CellInfoNr) cellInfo).getCellIdentity();
            } catch (Throwable th) {
                th.printStackTrace();
            }
            CellSignalStrengthNr cellSignalStrengthNr = (CellSignalStrengthNr) ((CellInfoNr) cellInfo).getCellSignalStrength();
            if (cellIdentityNr != null) {
                jVar.f7686a = 6;
                jVar.b = cellIdentityNr.getMccString();
                jVar.c = cellIdentityNr.getMncString();
                jVar.h = cellIdentityNr.getNci();
                jVar.i = cellIdentityNr.getPci();
                jVar.j = cellIdentityNr.getTac();
                if (jVar.j == Integer.MAX_VALUE) {
                    try {
                        j jVar2 = jVar;
                        jVar.j = a(cellIdentityNr);
                    } catch (Throwable unused) {
                    }
                }
                if (jVar.j == Integer.MAX_VALUE) {
                    try {
                        j jVar3 = jVar;
                        jVar.j = a(cellIdentityNr.toString());
                    } catch (Throwable unused2) {
                    }
                }
                jVar.k = cellIdentityNr.getNrarfcn();
            }
            if (cellInfo.isRegistered()) {
                jVar.d = 1;
            }
            jVar.f = cellInfo.getCellConnectionStatus();
            jVar.l = Math.abs(cellSignalStrengthNr.getSsRsrp());
            jVar.g = Math.abs(cellSignalStrengthNr.getSsRsrp());
            jVar.m = Math.abs(cellSignalStrengthNr.getSsRsrq());
            jVar.n = cellSignalStrengthNr.getSsSinr();
            jVar.o = Math.abs(cellSignalStrengthNr.getCsiRsrp());
            jVar.p = Math.abs(cellSignalStrengthNr.getCsiRsrq());
            jVar.f7688q = cellSignalStrengthNr.getCsiSinr();
            try {
                if (i >= 30) {
                    elapsedRealtimeNanos = SystemClock.elapsedRealtime() - cellInfo.getTimestampMillis();
                    j jVar4 = jVar;
                } else {
                    elapsedRealtimeNanos = (SystemClock.elapsedRealtimeNanos() - cellInfo.getTimeStamp()) / 1000000;
                    j jVar5 = jVar;
                }
                jVar.e = System.currentTimeMillis() - elapsedRealtimeNanos;
            } catch (Error unused3) {
                jVar.e = System.currentTimeMillis();
            }
            return jVar;
        }
        i iVar = new i();
        CellInfoLte cellInfoLte = (CellInfoLte) cellInfo;
        CellIdentityLte cellIdentity = cellInfoLte.getCellIdentity();
        CellSignalStrengthLte cellSignalStrength = cellInfoLte.getCellSignalStrength();
        iVar.f7686a = 3;
        if (cellInfo.isRegistered()) {
            iVar.d = 1;
        }
        iVar.h = cellIdentity.getCi();
        iVar.i = cellIdentity.getPci();
        iVar.j = cellIdentity.getTac();
        iVar.r = cellSignalStrength.getTimingAdvance();
        if (i >= 28) {
            iVar.b = cellIdentity.getMccString();
            iVar.c = cellIdentity.getMncString();
            iVar.f = cellInfo.getCellConnectionStatus();
            iVar.l = cellIdentity.getBandwidth();
        } else {
            if (cellIdentity.getMcc() != Integer.MAX_VALUE) {
                iVar.b = String.valueOf(cellIdentity.getMcc());
            }
            if (cellIdentity.getMnc() != Integer.MAX_VALUE) {
                iVar.c = String.valueOf(cellIdentity.getMnc());
            }
        }
        iVar.k = cellIdentity.getEarfcn();
        if (i >= 29) {
            iVar.m = Math.abs(cellSignalStrength.getRssi());
        }
        iVar.n = Math.abs(cellSignalStrength.getRsrp());
        iVar.g = Math.abs(cellSignalStrength.getRsrp());
        iVar.o = cellSignalStrength.getRsrq();
        int rssnr = cellSignalStrength.getRssnr();
        if (rssnr == Integer.MAX_VALUE && cellInfo.isRegistered()) {
            rssnr = w();
        }
        iVar.p = rssnr;
        iVar.f7687q = cellSignalStrength.getCqi();
        try {
            if (i >= 30) {
                long elapsedRealtime = SystemClock.elapsedRealtime() - cellInfo.getTimestampMillis();
                i iVar2 = iVar;
                iVar.e = System.currentTimeMillis() - elapsedRealtime;
            } else {
                long elapsedRealtimeNanos2 = (SystemClock.elapsedRealtimeNanos() - cellInfo.getTimeStamp()) / 1000000;
                i iVar3 = iVar;
                iVar.e = System.currentTimeMillis() - elapsedRealtimeNanos2;
            }
            return iVar;
        } catch (Error unused4) {
            iVar.e = System.currentTimeMillis();
            return iVar;
        }
    }

    private String a(TelephonyManager telephonyManager) {
        StringBuffer stringBuffer = new StringBuffer();
        String simOperator = telephonyManager.getSimOperator();
        if (TextUtils.isEmpty(simOperator) || simOperator.length() < 5) {
            simOperator = "";
        }
        stringBuffer.append(simOperator).append("|").append(d(telephonyManager.getSimOperatorName()));
        return stringBuffer.toString();
    }

    private String a(List<CellInfo> list, int i, int[] iArr, boolean z, int i2, int[] iArr2, boolean z2) {
        ArrayList arrayList = new ArrayList();
        if (i != 1 && com.baidu.location.b.c.a().cb != 1) {
            return null;
        }
        boolean z3 = com.baidu.location.b.c.a().cb != 1 && z;
        Iterator<CellInfo> it = list.iterator();
        while (it.hasNext()) {
            h a2 = a(it.next());
            if (a2 != null) {
                arrayList.add(a2);
            }
        }
        return a(a(arrayList, i2), iArr, z3, iArr2, z2);
    }

    private String a(List<h> list, int[] iArr, boolean z, int[] iArr2, boolean z2) {
        if (list == null || list.size() == 0) {
            return null;
        }
        CellValueList cellValueList = new CellValueList();
        for (h hVar : list) {
            CellValue cellValue = new CellValue();
            CellCommonValue cellCommonValue = new CellCommonValue();
            if (!z2 || iArr2[0] == 1) {
                cellCommonValue.setCellType(hVar.f7686a);
            }
            if (hVar.b != null && (!z2 || iArr2[1] == 1)) {
                cellCommonValue.setMcc(ByteStringMicro.copyFromUtf8(hVar.b));
            }
            if (hVar.c != null && (!z2 || iArr2[2] == 1)) {
                cellCommonValue.setMnc(ByteStringMicro.copyFromUtf8(hVar.c));
            }
            if (!z2 || iArr2[3] == 1) {
                cellCommonValue.setRegistered(hVar.d);
            }
            if (!z2 || iArr2[4] == 1) {
                cellCommonValue.setTimestamp(hVar.e);
            }
            if (hVar.f != Integer.MAX_VALUE && (!z2 || iArr2[5] == 1)) {
                cellCommonValue.setCellconnectionstatus(hVar.f);
            }
            cellValue.setCellCommonValue(cellCommonValue);
            if (hVar instanceof i) {
                LteCellValue lteCellValue = new LteCellValue();
                i iVar = (i) hVar;
                if (iVar.h != Integer.MAX_VALUE && (!z || iArr[0] == 1)) {
                    lteCellValue.setCi(iVar.h);
                }
                if (iVar.i != Integer.MAX_VALUE && (!z || iArr[1] == 1)) {
                    lteCellValue.setPci(iVar.i);
                }
                if (iVar.j != Integer.MAX_VALUE && (!z || iArr[2] == 1)) {
                    lteCellValue.setTac(iVar.j);
                }
                if (iVar.k != Integer.MAX_VALUE && (!z || iArr[3] == 1)) {
                    lteCellValue.setEarfcn(iVar.k);
                }
                if (iVar.l != Integer.MAX_VALUE && (!z || iArr[4] == 1)) {
                    lteCellValue.setBandwidth(iVar.l);
                }
                if (iVar.m != Integer.MAX_VALUE && (!z || iArr[5] == 1)) {
                    lteCellValue.setRssi(iVar.m);
                }
                if (iVar.n != Integer.MAX_VALUE && (!z || iArr[6] == 1)) {
                    lteCellValue.setRsrp(iVar.n);
                }
                if (iVar.o != Integer.MAX_VALUE && (!z || iArr[7] == 1)) {
                    lteCellValue.setRsrq(iVar.o);
                }
                if (iVar.p != Integer.MAX_VALUE && (!z || iArr[8] == 1)) {
                    lteCellValue.setRssnr(iVar.p);
                }
                if (iVar.f7687q != Integer.MAX_VALUE && (!z || iArr[9] == 1)) {
                    lteCellValue.setCqi(iVar.f7687q);
                }
                if (iVar.r != Integer.MAX_VALUE && (!z || iArr[10] == 1)) {
                    lteCellValue.setTimingadvance(iVar.r);
                }
                cellValue.setLteCellValue(lteCellValue);
            } else if (hVar instanceof j) {
                NrCellValue nrCellValue = new NrCellValue();
                j jVar = (j) hVar;
                if (jVar.h != Long.MAX_VALUE && (!z || iArr[0] == 1)) {
                    nrCellValue.setCi(jVar.h);
                }
                if (jVar.i != Integer.MAX_VALUE && (!z || iArr[1] == 1)) {
                    nrCellValue.setPci(jVar.i);
                }
                if (jVar.j != Integer.MAX_VALUE && (!z || iArr[2] == 1)) {
                    nrCellValue.setTac(jVar.j);
                }
                if (jVar.k != Integer.MAX_VALUE && (!z || iArr[11] == 1)) {
                    nrCellValue.setNrarfcn(jVar.k);
                }
                if (jVar.l != Integer.MAX_VALUE && (!z || iArr[12] == 1)) {
                    nrCellValue.setSsrsrp(jVar.l);
                }
                if (jVar.m != Integer.MAX_VALUE && (!z || iArr[13] == 1)) {
                    nrCellValue.setSsrsrq(jVar.m);
                }
                if (jVar.n != Integer.MAX_VALUE && (!z || iArr[14] == 1)) {
                    nrCellValue.setSssinr(jVar.n);
                }
                if (jVar.o != Integer.MAX_VALUE && (!z || iArr[15] == 1)) {
                    nrCellValue.setCsirsrp(jVar.o);
                }
                if (jVar.p != Integer.MAX_VALUE && (!z || iArr[16] == 1)) {
                    nrCellValue.setCsirsrq(jVar.p);
                }
                if (jVar.f7688q != Integer.MAX_VALUE && (!z || iArr[17] == 1)) {
                    nrCellValue.setCsisinr(jVar.f7688q);
                }
                cellValue.setNrCellValue(nrCellValue);
            }
            cellValueList.addCellValue(cellValue);
        }
        return Base64.encodeToString(cellValueList.toByteArray(), 0);
    }

    private static List<h> a(List<h> list, int i) {
        if (list.isEmpty()) {
            return null;
        }
        if (list.size() == 1) {
            return list;
        }
        Collections.sort(list.subList(0, list.size()), new d());
        int size = list.size();
        if (i >= 0) {
            size = Math.min(list.size(), i);
        }
        return list.subList(0, size);
    }

    private void a(TelephonyManager telephonyManager, int i, int[] iArr, boolean z, int i2, int[] iArr2, boolean z2) {
        if (telephonyManager != null) {
            try {
                try {
                    this.k = a(this.e.d(), i, iArr, z, i2, iArr2, z2);
                } catch (Throwable unused) {
                }
            } catch (Throwable unused2) {
            }
        }
    }

    private boolean a(com.baidu.location.f.a aVar, int i, int i2) {
        return false;
    }

    private boolean a(k kVar, long j) {
        long j2;
        long j3;
        long j4;
        long j5 = 1000;
        try {
            j2 = SystemClock.elapsedRealtimeNanos() / 1000;
        } catch (Error | Exception unused) {
            j2 = 0;
        }
        boolean z = j2 > 0;
        if (!z || kVar.f7689a == null || kVar.f7689a.size() == 0) {
            return false;
        }
        int size = kVar.f7689a.size();
        if (size > 16) {
            size = 16;
        }
        long j6 = 0;
        long j7 = 0;
        int i = 0;
        while (true) {
            j3 = j5;
            if (i >= size) {
                break;
            }
            if (kVar.f7689a.get(i) != null && kVar.f7689a.get(i).level != 0 && z) {
                try {
                    j4 = (j2 - kVar.f7689a.get(i).timestamp) / 1000000;
                } catch (Error | Exception unused2) {
                    j4 = 0;
                }
                j6 += j4;
                if (j4 > j7) {
                    j7 = j4;
                }
            }
            i++;
            j5 = j3;
        }
        return j7 * j3 > j || (j6 / ((long) size)) * j3 > j;
    }

    private String b(String str) {
        if (str != null && str.length() > com.baidu.location.b.c.a().dm) {
            str = str.substring(0, com.baidu.location.b.c.a().dm);
        }
        return str != null ? (str.contains("&") || str.contains(";")) ? str.replace("&", "_").replace(";", "_") : str : str;
    }

    private String c(String str) {
        return str != null ? (str.contains("&") || str.contains(";")) ? str.replace("&", "_").replace(";", "_") : str : str;
    }

    private String d(String str) {
        return TextUtils.isEmpty(str) ? "" : str.matches(".*[\\u4E00-\\u9FA5\\u3400-\\u4DBF\\uF900-\\uFAFF]+.*") ? str.contains("移动") ? "cmcc" : str.contains("联通") ? "unicom" : str.contains("电信") ? "ctcc" : str.contains("广电") ? "cbn" : str.contains("铁通") ? "tietong" : "" : str;
    }

    private synchronized String v() {
        String str;
        str = this.k;
        return (str == null || str.length() == 0) ? null : this.k.replace("\n", "");
    }

    private int w() {
        try {
            TelephonyManager telephonyManager = this.g;
            if (telephonyManager != null) {
                return com.baidu.location.h.i.a(telephonyManager.getSignalStrength(), "getLteRssnr");
            }
            return Integer.MAX_VALUE;
        } catch (Exception unused) {
            return Integer.MAX_VALUE;
        }
    }

    private String x() {
        StringBuffer stringBuffer = new StringBuffer();
        if (!TextUtils.isEmpty(this.s)) {
            stringBuffer.append("&sim_info=");
            stringBuffer.append(this.s);
        }
        if (!TextUtils.isEmpty(this.t)) {
            stringBuffer.append("&sim_info2=");
            stringBuffer.append(this.t);
        }
        return stringBuffer.toString();
    }

    public int a(CellIdentityNr cellIdentityNr) {
        try {
            return com.baidu.location.h.i.a(cellIdentityNr, "getHwTac");
        } catch (Throwable unused) {
            return -1;
        }
    }

    public int a(k kVar) {
        int i;
        for (int i2 = 0; i2 < kVar.a(); i2++) {
            if (kVar.f7689a.get(i2) != null && (i = -kVar.f7689a.get(i2).level) > 0) {
                return i;
            }
        }
        return 0;
    }

    public int a(String str) {
        if (str == null || !str.contains("mNrTac")) {
            return -1;
        }
        Matcher matcher = Pattern.compile("mNrTac=(.+?)\\}").matcher(str.replace(" ", ""));
        while (true) {
            int i = -1;
            while (matcher.find()) {
                if (matcher.groupCount() >= 1) {
                    try {
                        i = Integer.parseInt(matcher.group(1));
                    } catch (Throwable unused) {
                    }
                }
            }
            return i;
        }
    }

    public com.baidu.location.f.a a(com.baidu.location.f.a aVar, TelephonyManager telephonyManager) {
        g gVar = this.e;
        if (gVar != null) {
            return gVar.a(aVar, telephonyManager);
        }
        return null;
    }

    public k a(int i) {
        g gVar = this.e;
        if (gVar != null) {
            return gVar.f(i);
        }
        return null;
    }

    public String a(int i, k kVar) {
        boolean z = true;
        if (kVar.a() < 1) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer(512);
        int size = kVar.f7689a.size();
        if (size <= i) {
            i = size;
        }
        for (int i2 = 0; i2 < i; i2++) {
            if (kVar.f7689a.get(i2) != null && kVar.f7689a.get(i2).level != 0 && kVar.f7689a.get(i2).BSSID != null) {
                if (z) {
                    z = false;
                } else {
                    stringBuffer.append("|");
                }
                stringBuffer.append(kVar.f7689a.get(i2).BSSID.replace(":", ""));
                int i3 = kVar.f7689a.get(i2).level;
                if (i3 < 0) {
                    i3 = -i3;
                }
                stringBuffer.append(String.format(Locale.CHINA, ";%d;", Integer.valueOf(i3)));
            }
        }
        if (z) {
            return null;
        }
        return stringBuffer.toString();
    }

    public String a(int i, boolean z, k kVar, int i2) {
        g gVar = this.e;
        if (gVar != null) {
            return gVar.a(i, z, kVar, i2);
        }
        return null;
    }

    public String a(WifiInfo wifiInfo, String str) {
        g gVar = this.e;
        if (gVar != null) {
            return gVar.a(wifiInfo, str);
        }
        return null;
    }

    public String a(com.baidu.location.f.a aVar) {
        g gVar = this.e;
        if (gVar != null) {
            return gVar.a(aVar);
        }
        return null;
    }

    public String a(k kVar, int i, String str, boolean z, int i2) {
        g gVar = this.e;
        if (gVar != null) {
            return gVar.a(kVar, i, str, z, i2);
        }
        return null;
    }

    public synchronized void a(Context context) {
        if (this.e == null) {
            return;
        }
        try {
            this.g = (TelephonyManager) context.getSystemService("phone");
            this.i = (WifiManager) context.getSystemService("wifi");
            this.h = (ConnectivityManager) context.getSystemService("connectivity");
            b(context);
            if (Looper.myLooper() != null) {
                this.j = new Handler();
            }
            this.e.a(g.a.GET_ALL_DATA);
            a(true);
            this.e.b(true);
            this.e.d(30);
            this.e.a(false);
            this.e.a(context, new ArrayList());
        } catch (Exception unused) {
        }
    }

    public void a(boolean z) {
        int i;
        g gVar;
        g gVar2 = this.e;
        if (gVar2 == null || this.r == z) {
            return;
        }
        if (z) {
            gVar2.a(100);
            gVar = this.e;
            i = 2000;
        } else {
            i = 0;
            gVar2.a(0);
            gVar = this.e;
        }
        gVar.c(i);
        this.r = z;
    }

    public boolean a(long j) {
        long currentTimeMillis = System.currentTimeMillis() - this.o;
        if (currentTimeMillis >= 0 && currentTimeMillis <= 2000) {
            return false;
        }
        this.o = System.currentTimeMillis();
        if (com.baidu.location.h.i.g != 4) {
            a(0);
        }
        g gVar = this.e;
        return gVar != null && gVar.c() - j > 0;
    }

    public boolean a(com.baidu.location.f.a aVar, com.baidu.location.f.a aVar2) {
        g gVar = this.e;
        if (gVar != null) {
            return gVar.a(aVar, aVar2);
        }
        return false;
    }

    public boolean a(k kVar, k kVar2, float f) {
        boolean a2 = kVar2.a(kVar, f);
        long currentTimeMillis = System.currentTimeMillis() - com.baidu.location.b.b.c;
        if (currentTimeMillis <= 0 || currentTimeMillis >= 30000 || !a2 || d(kVar2) - d(kVar) <= 30) {
            return a2;
        }
        return false;
    }

    public long b(k kVar) {
        long j;
        long j2;
        if (kVar.f7689a == null || kVar.f7689a.size() == 0) {
            return 0L;
        }
        try {
            j = SystemClock.elapsedRealtimeNanos() / 1000;
        } catch (Error | Exception unused) {
            j = 0;
        }
        boolean z = j > 0;
        if (!z) {
            return 0L;
        }
        int size = kVar.f7689a.size();
        if (size > 16) {
            size = 16;
        }
        long j3 = 2147483647L;
        for (int i = 0; i < size; i++) {
            if (kVar.f7689a.get(i) != null && kVar.f7689a.get(i).level != 0 && z) {
                try {
                    j2 = (j - kVar.f7689a.get(i).timestamp) / 1000000;
                } catch (Error | Exception unused2) {
                    j2 = 0;
                }
                if (j2 < j3) {
                    j3 = j2;
                }
            }
        }
        if (!z) {
            j3 = 0;
        }
        if (j3 < 0) {
            return 0L;
        }
        return j3;
    }

    public String b(int i, k kVar) {
        if (i == 0) {
            return null;
        }
        int i2 = 1;
        if (kVar.a() < 1) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer(256);
        int size = kVar.f7689a.size();
        if (size > com.baidu.location.h.i.O) {
            size = com.baidu.location.h.i.O;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            if (kVar.f7689a.get(i4) != null) {
                if ((i2 & i) != 0 && kVar.f7689a.get(i4).BSSID != null) {
                    stringBuffer.append(i3 == 0 ? "&ssid=" : "|");
                    stringBuffer.append(kVar.f7689a.get(i4).BSSID.replace(":", ""));
                    stringBuffer.append(";");
                    stringBuffer.append(c(kVar.f7689a.get(i4).SSID));
                    i3++;
                }
                i2 <<= 1;
            }
        }
        return stringBuffer.toString();
    }

    public String b(com.baidu.location.f.a aVar) {
        if (this.e != null) {
            return this.e.c(aVar) + "&cl_list=" + v() + x();
        }
        return null;
    }

    public synchronized void b() {
        if (this.e == null) {
            this.e = new g();
        }
        try {
            b bVar = new b();
            this.f = bVar;
            g gVar = this.e;
            if (gVar != null) {
                gVar.a(bVar);
            }
        } catch (Exception unused) {
        }
    }

    public void b(Context context) {
        TelephonyManager createForSubscriptionId;
        TelephonyManager createForSubscriptionId2;
        if (context != null && this.s == null && this.t == null) {
            try {
                SubscriptionManager subscriptionManager = (SubscriptionManager) context.getSystemService("telephony_subscription_service");
                TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                if (subscriptionManager == null || telephonyManager == null || Build.VERSION.SDK_INT < 29) {
                    return;
                }
                int[] subscriptionIds = subscriptionManager.getSubscriptionIds(0);
                int[] subscriptionIds2 = subscriptionManager.getSubscriptionIds(1);
                int i = -1;
                int i2 = (subscriptionIds == null || subscriptionIds.length <= 0) ? -1 : subscriptionIds[0];
                if (subscriptionIds2 != null && subscriptionIds2.length > 0) {
                    i = subscriptionIds2[0];
                }
                if (SubscriptionManager.isValidSubscriptionId(i2) && (createForSubscriptionId2 = telephonyManager.createForSubscriptionId(i2)) != null) {
                    this.s = a(createForSubscriptionId2);
                }
                if (!SubscriptionManager.isValidSubscriptionId(i) || (createForSubscriptionId = telephonyManager.createForSubscriptionId(i)) == null) {
                    return;
                }
                this.t = a(createForSubscriptionId);
            } catch (Exception unused) {
            }
        }
    }

    public boolean b(long j) {
        k u;
        try {
            if ((!this.i.isWifiEnabled() && !this.i.isScanAlwaysAvailable()) || m() || (u = u()) == null) {
                return false;
            }
            return a(u, j);
        } catch (Exception | NoSuchMethodError unused) {
            return false;
        }
    }

    public long c(k kVar) {
        long j;
        long j2;
        if (kVar.f7689a != null && kVar.f7689a.size() != 0) {
            try {
                j = SystemClock.elapsedRealtimeNanos() / 1000;
            } catch (Error | Exception unused) {
                j = 0;
            }
            boolean z = j > 0;
            if (z) {
                int size = kVar.f7689a.size();
                if (size > 16) {
                    size = 16;
                }
                long j3 = 0;
                for (int i = 0; i < size; i++) {
                    if (kVar.f7689a.get(i) != null && kVar.f7689a.get(i).level != 0 && z) {
                        try {
                            j2 = (j - kVar.f7689a.get(i).timestamp) / 1000000;
                        } catch (Error | Exception unused2) {
                            j2 = 0;
                        }
                        if (j2 > j3) {
                            j3 = j2;
                        }
                    }
                }
                return j3;
            }
        }
        return 0L;
    }

    public HashSet<String> c(com.baidu.location.f.a aVar) {
        g gVar = this.e;
        if (gVar != null) {
            return gVar.b(aVar);
        }
        return null;
    }

    public void c() {
        g gVar = this.e;
        if (gVar != null) {
            gVar.b();
        }
    }

    public long d(k kVar) {
        long j;
        long j2;
        if (kVar.a() != 0) {
            try {
                j = SystemClock.elapsedRealtimeNanos() / 1000;
            } catch (Error | Exception unused) {
                j = 0;
            }
            boolean z = j > 0;
            if (z) {
                int size = kVar.f7689a.size();
                if (size > 16) {
                    size = 16;
                }
                long j3 = 0;
                long j4 = 0;
                long j5 = 0;
                for (int i = 0; i < size; i++) {
                    if (kVar.f7689a.get(i) != null && kVar.f7689a.get(i).level != 0 && z) {
                        try {
                            j2 = (j - kVar.f7689a.get(i).timestamp) / 1000000;
                        } catch (Error | Exception unused2) {
                            j2 = 0;
                        }
                        j5 += j2;
                        j3++;
                        if (j2 > j4) {
                            j4 = j2;
                        }
                    }
                }
                return j3 > 1 ? (j5 - j4) / (j3 - 1) : j4;
            }
        }
        return 0L;
    }

    public String d(com.baidu.location.f.a aVar) {
        StringBuffer stringBuffer = new StringBuffer(128);
        stringBuffer.append(aVar.b + 23);
        stringBuffer.append("H");
        stringBuffer.append(aVar.f7646a + 45);
        stringBuffer.append("K");
        stringBuffer.append(aVar.d + 54);
        stringBuffer.append("Q");
        stringBuffer.append(aVar.c + 203);
        return stringBuffer.toString();
    }

    public synchronized void d() {
        c();
        this.g = null;
        this.i = null;
        this.f = null;
        this.s = null;
        this.t = null;
    }

    public boolean e() {
        g gVar = this.e;
        if (gVar != null) {
            return gVar.e();
        }
        return false;
    }

    public synchronized com.baidu.location.f.a f() {
        try {
            try {
                g gVar = this.e;
                if (gVar == null) {
                    return null;
                }
                gVar.b(1000);
                a(this.g, com.baidu.location.h.i.aK, com.baidu.location.h.i.aL, com.baidu.location.h.i.aM, com.baidu.location.h.i.aP, com.baidu.location.h.i.aN, com.baidu.location.h.i.aO);
                com.baidu.location.f.a e = this.e.e(30000);
                this.f7679q = a(e, 30000, com.baidu.location.b.c.a().dI);
                return e;
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public int g() {
        NetworkInfo activeNetworkInfo;
        try {
            ConnectivityManager connectivityManager = this.h;
            if (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null) {
                return 0;
            }
            return activeNetworkInfo.getSubtype();
        } catch (Exception unused) {
            return 0;
        }
    }

    public String h() {
        int i = -1;
        try {
            TelephonyManager telephonyManager = this.g;
            if (telephonyManager != null) {
                i = telephonyManager.getSimState();
            }
        } catch (Exception unused) {
        }
        return "&sim=" + i;
    }

    public void i() {
        this.u = 0L;
    }

    public boolean j() {
        long currentTimeMillis = System.currentTimeMillis();
        long j = this.m;
        if (currentTimeMillis - j > 0 && currentTimeMillis - j <= 5000) {
            return false;
        }
        this.m = currentTimeMillis;
        i();
        return k();
    }

    public boolean k() {
        long currentTimeMillis = System.currentTimeMillis();
        g gVar = this.e;
        long c2 = gVar != null ? gVar.c() : 0L;
        long j = currentTimeMillis - c2;
        if (j > 0) {
            long j2 = this.u;
            if (j <= j2 + 5000 || currentTimeMillis - (this.n * 1000) <= j2 + 5000) {
                return false;
            }
            if (Build.VERSION.SDK_INT >= 28 && j < 25000) {
                return false;
            }
            if (m() && !n() && j <= this.u + 10000) {
                return false;
            }
        }
        return a(c2);
    }

    public long l() {
        g gVar = this.e;
        if (gVar != null) {
            return gVar.c();
        }
        return 0L;
    }

    public boolean m() {
        try {
            ConnectivityManager connectivityManager = this.h;
            if (connectivityManager != null) {
                return connectivityManager.getNetworkInfo(1).isConnected();
            }
            return false;
        } catch (Error | Exception unused) {
            return false;
        }
    }

    public boolean n() {
        return false;
    }

    public List<WifiConfiguration> o() {
        try {
            WifiManager wifiManager = this.i;
            if (wifiManager != null) {
                return wifiManager.getConfiguredNetworks();
            }
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public String p() {
        WifiManager wifiManager = this.i;
        if (wifiManager == null) {
            return "";
        }
        try {
            return !wifiManager.isWifiEnabled() ? this.i.isScanAlwaysAvailable() ? "&wifio=1" : "" : "&wifio=1";
        } catch (Exception | NoSuchMethodError unused) {
            return "";
        }
    }

    public String q() {
        if (this.e == null || com.baidu.location.h.i.g == 4) {
            return null;
        }
        return this.e.f();
    }

    public WifiInfo r() {
        g gVar;
        if (com.baidu.location.h.i.g == 4 || (gVar = this.e) == null) {
            return null;
        }
        return gVar.g();
    }

    public boolean s() {
        try {
            if (!this.i.isWifiEnabled()) {
                if (!this.i.isScanAlwaysAvailable()) {
                    return false;
                }
            }
            return true;
        } catch (Exception | NoSuchMethodError unused) {
            return false;
        }
    }

    public String t() {
        k u;
        if (com.baidu.location.b.c.a().dl == 0 || (u = u()) == null || u.a() < 1) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (ScanResult scanResult : u.f7689a) {
            if (scanResult != null && scanResult.level != 0 && scanResult.BSSID != null) {
                arrayList.add(scanResult);
            }
        }
        Collections.sort(arrayList, new c());
        int min = Math.min(com.baidu.location.b.c.a().dn, arrayList.size());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < min; i++) {
            String replace = ((ScanResult) arrayList.get(i)).BSSID.replace(":", "");
            String b2 = b(((ScanResult) arrayList.get(i)).SSID);
            int i2 = ((ScanResult) arrayList.get(i)).level;
            if (i2 < 0) {
                i2 = -i2;
            }
            sb.append(replace + "," + b2 + "," + i2).append(";");
        }
        return sb.toString();
    }

    public k u() {
        return (this.e == null || com.baidu.location.h.i.g == 4) ? new k(null, 0L) : this.e.h();
    }
}
