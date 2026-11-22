package com.baidu.location.indoor;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanFilter;
import android.bluetooth.le.ScanResult;
import android.bluetooth.le.ScanSettings;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes13.dex */
public class d {
    private static final char[] c = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    private static d d = null;
    private Context g;
    private BluetoothAdapter h;
    private String k;
    private String o;
    private int p;

    /* renamed from: q, reason: collision with root package name */
    private int f7742q;
    private String r;
    private ConcurrentMap<String, ScanResult> e = new ConcurrentHashMap();
    private ConcurrentMap<String, List<ScanResult>> f = new ConcurrentHashMap();
    private volatile int i = 0;

    /* renamed from: a, reason: collision with root package name */
    public volatile boolean f7741a = false;
    private volatile boolean j = false;
    private long l = -1;
    private long m = -1;
    private Object n = null;
    public long b = -1;
    private long s = 0;
    private long t = -1;
    private long u = 0;

    public class a {
        private String b;
        private String c;
        private String d;
        private int e;
        private int f;
        private int g;
        private long h;

        public a(String str, String str2, int i, long j) {
            this.b = str;
            this.c = str2;
            this.g = -i;
            this.h = j / 1000000;
        }

        public String a() {
            return this.b.toUpperCase() + ";" + this.g + ";" + this.h;
        }

        public void a(int i) {
            this.e = i;
        }

        public void a(String str) {
            this.d = str;
        }

        public String b() {
            return this.e + "," + this.f + "," + this.g;
        }

        public void b(int i) {
            this.f = i;
        }

        public void b(String str) {
            this.b = str;
        }

        public String toString() {
            return this.c + ";" + this.b + ";" + this.d + ";" + this.e + ";" + this.f + ";" + this.g + ";" + this.h;
        }
    }

    class b implements Comparator<a> {
        b() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(a aVar, a aVar2) {
            return aVar.g - aVar2.g;
        }
    }

    private d() {
    }

    private a a(ScanResult scanResult) {
        if (TextUtils.isEmpty(scanResult.getDevice().getAddress()) || scanResult.getRssi() > 0) {
            return null;
        }
        String replaceAll = scanResult.getDevice().getAddress().replaceAll(":", "");
        a aVar = new a(replaceAll, scanResult.getDevice().getName(), scanResult.getRssi(), scanResult.getTimestampNanos());
        if (scanResult.getScanRecord() != null) {
            byte[] bytes = scanResult.getScanRecord().getBytes();
            int i = 2;
            while (true) {
                if (i > 5) {
                    break;
                }
                byte b2 = bytes[i + 2];
                if ((b2 & 255) == 2 && (bytes[i + 3] & 255) == 21) {
                    int i2 = ((bytes[i + 20] & 255) * 256) + (bytes[i + 21] & 255);
                    int i3 = ((bytes[i + 22] & 255) * 256) + (bytes[i + 23] & 255);
                    if (bytes.length > 26) {
                        a(aVar, a(Arrays.copyOfRange(bytes, 9, 25)), i2, i3, replaceAll);
                        return aVar;
                    }
                } else {
                    byte b3 = bytes[i];
                    if (((b3 & 255) != 45 || (bytes[i + 1] & 255) != 36 || (b2 & 255) != 191 || (bytes[i + 3] & 255) != 22) && (b3 & 255) == 173 && (bytes[i + 1] & 255) == 119 && (b2 & 255) == 0) {
                        byte b4 = bytes[i + 3];
                    }
                    i++;
                }
            }
        }
        return aVar;
    }

    private a a(a aVar, String str, int i, int i2, String str2) {
        String[] b2;
        com.baidu.location.indoor.b b3 = c.a().b();
        if (com.baidu.location.b.c.a().dr == 1 && b3 != null && (b2 = b3.b()) != null && b2.length > 0) {
            for (String str3 : b2) {
                if (str.equalsIgnoreCase(str3)) {
                    String[] a2 = g.a(i, i2, str2);
                    try {
                        if (a2.length >= 3) {
                            i = Integer.parseInt(a2[0]);
                            i2 = Integer.parseInt(a2[1]);
                            str2 = a2[2].toUpperCase();
                        }
                    } catch (Exception unused) {
                    }
                }
            }
        }
        aVar.a(str);
        aVar.a(i);
        aVar.b(i2);
        aVar.b(str2);
        return aVar;
    }

    public static synchronized d a() {
        d dVar;
        synchronized (d.class) {
            if (d == null) {
                d = new d();
            }
            dVar = d;
        }
        return dVar;
    }

    private static String a(byte[] bArr) {
        char[] cArr = new char[bArr.length * 2];
        for (int i = 0; i < bArr.length; i++) {
            byte b2 = bArr[i];
            int i2 = i * 2;
            char[] cArr2 = c;
            cArr[i2] = cArr2[(b2 & 255) >>> 4];
            cArr[i2 + 1] = cArr2[b2 & 15];
        }
        String str = new String(cArr);
        try {
            return str.toUpperCase();
        } catch (Exception unused) {
            return str;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001b, code lost:
    
        if (r3.g.getPackageManager().hasSystemFeature("android.hardware.bluetooth") != false) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean f() {
        /*
            r3 = this;
            r0 = 0
            android.content.Context r1 = r3.g     // Catch: java.lang.Exception -> L1f
            android.content.pm.PackageManager r1 = r1.getPackageManager()     // Catch: java.lang.Exception -> L1f
            java.lang.String r2 = "android.hardware.bluetooth_le"
            boolean r1 = r1.hasSystemFeature(r2)     // Catch: java.lang.Exception -> L1f
            if (r1 != 0) goto L1d
            android.content.Context r1 = r3.g     // Catch: java.lang.Exception -> L1f
            android.content.pm.PackageManager r1 = r1.getPackageManager()     // Catch: java.lang.Exception -> L1f
            java.lang.String r2 = "android.hardware.bluetooth"
            boolean r1 = r1.hasSystemFeature(r2)     // Catch: java.lang.Exception -> L1f
            if (r1 == 0) goto L23
        L1d:
            r1 = 1
            goto L24
        L1f:
            r1 = move-exception
            r1.printStackTrace()
        L23:
            r1 = r0
        L24:
            android.bluetooth.BluetoothAdapter r2 = r3.h
            if (r2 == 0) goto L34
            if (r1 != 0) goto L2b
            goto L34
        L2b:
            boolean r0 = r2.isEnabled()     // Catch: java.lang.Exception -> L30
            return r0
        L30:
            r1 = move-exception
            r1.printStackTrace()
        L34:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baidu.location.indoor.d.f():boolean");
    }

    private void g() {
        if (this.h == null) {
            return;
        }
        try {
            this.n = new ScanCallback() { // from class: com.baidu.location.indoor.d.1
                @Override // android.bluetooth.le.ScanCallback
                public void onScanResult(int i, ScanResult scanResult) {
                    long j;
                    boolean z;
                    if (d.this.e == null || scanResult.getDevice() == null || TextUtils.isEmpty(scanResult.getDevice().getAddress()) || scanResult.getRssi() <= -90) {
                        return;
                    }
                    d.this.b = System.currentTimeMillis();
                    d.this.e.put(scanResult.getDevice().getAddress(), scanResult);
                    long currentTimeMillis = System.currentTimeMillis() - d.this.s;
                    if (currentTimeMillis > 800 || currentTimeMillis < -100) {
                        d.this.e.values().size();
                        d.this.s = System.currentTimeMillis();
                        long timestampNanos = scanResult.getTimestampNanos() / 1000000;
                        try {
                            j = SystemClock.elapsedRealtimeNanos() / 1000000;
                        } catch (Error unused) {
                            j = 0;
                        }
                        Iterator it = d.this.e.entrySet().iterator();
                        while (it.hasNext()) {
                            ScanResult scanResult2 = (ScanResult) ((Map.Entry) it.next()).getValue();
                            if (timestampNanos - (scanResult2.getTimestampNanos() / 1000000) > 2500) {
                                it.remove();
                                z = true;
                            } else {
                                z = false;
                            }
                            if (j != 0 && !z && j - (scanResult2.getTimestampNanos() / 1000000) > 2500) {
                                it.remove();
                            }
                        }
                        d.this.e.values().size();
                        d.this.j();
                    }
                }
            };
            this.h.getBluetoothLeScanner().startScan((List<ScanFilter>) null, new ScanSettings.Builder().setScanMode(2).build(), (ScanCallback) this.n);
            this.f7741a = true;
            if (c.a().b() != null || com.baidu.location.g.a.a() == null) {
                return;
            }
            com.baidu.location.g.a.a().postDelayed(new Runnable() { // from class: com.baidu.location.indoor.d.2
                @Override // java.lang.Runnable
                public void run() {
                    d.this.c();
                }
            }, com.baidu.location.h.i.aU * 1000);
        } catch (Exception unused) {
        }
    }

    private void h() {
        this.e.clear();
        this.o = "";
        this.p = -1;
        this.f7742q = -1;
        this.r = "";
        this.k = "";
        this.b = -1L;
    }

    private void i() {
        if (System.currentTimeMillis() - this.u <= 10000 || c.a().b() == null) {
            return;
        }
        this.u = System.currentTimeMillis();
        Handler a2 = com.baidu.location.g.a.a();
        if (a2 != null) {
            a2.postDelayed(new Runnable() { // from class: com.baidu.location.indoor.d.3
                @Override // java.lang.Runnable
                public void run() {
                    d.this.c();
                }
            }, 1000L);
            a2.postDelayed(new Runnable() { // from class: com.baidu.location.indoor.d.4
                @Override // java.lang.Runnable
                public void run() {
                    d.this.b();
                }
            }, 2000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        ConcurrentMap<String, ScanResult> concurrentMap = this.e;
        if (concurrentMap == null || concurrentMap.values().size() <= 0) {
            return;
        }
        try {
            ArrayList arrayList = new ArrayList(this.e.values());
            StringBuilder sb = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            StringBuilder sb3 = new StringBuilder();
            com.baidu.location.indoor.b b2 = c.a().b();
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                a a2 = a((ScanResult) it.next());
                if (a2 != null) {
                    arrayList2.add(a2);
                }
            }
            if (arrayList2.size() > 0) {
                Collections.sort(arrayList2, new b());
                sb.append(((a) arrayList2.get(0)).toString());
                for (int i = 1; i < arrayList2.size(); i++) {
                    sb.append("|").append(((a) arrayList2.get(i)).toString());
                }
                if (b2 != null) {
                    int size = arrayList2.size();
                    if (size > b2.a()) {
                        size = b2.a();
                    }
                    this.p = size;
                    for (int i2 = 0; i2 < size; i2++) {
                        a aVar = (a) arrayList2.get(i2);
                        String[] c2 = b2.c();
                        if (!TextUtils.isEmpty(aVar.d) && c2 != null) {
                            for (String str : c2) {
                                if (aVar.d.equalsIgnoreCase(str)) {
                                    sb2.append(((a) arrayList2.get(i2)).a()).append("|");
                                    sb3.append(((a) arrayList2.get(i2)).b()).append("|");
                                }
                            }
                        }
                    }
                }
            }
            if (TextUtils.isEmpty(sb2) || TextUtils.isEmpty(sb2.toString())) {
                this.o = "";
            } else {
                this.o = sb2.toString();
            }
            if (TextUtils.isEmpty(sb3) || TextUtils.isEmpty(sb3.toString())) {
                this.r = "";
            } else {
                this.r = sb3.toString();
            }
            this.k = sb.toString();
            this.l = System.currentTimeMillis();
        } catch (Exception unused) {
        }
    }

    private boolean k() {
        long currentTimeMillis = System.currentTimeMillis();
        long j = this.b;
        long j2 = currentTimeMillis - j;
        if (j2 > 10000 && j > SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US && this.f7741a) {
            i();
        }
        return Math.abs(j2) <= 5000 && Math.abs(currentTimeMillis - this.l) <= 5000;
    }

    public synchronized void b() {
        if (f()) {
            if (!this.f7741a) {
                g();
            }
        }
    }

    public synchronized void c() {
        if (this.f7741a) {
            try {
                BluetoothAdapter bluetoothAdapter = this.h;
                if (bluetoothAdapter != null && bluetoothAdapter.getBluetoothLeScanner() != null) {
                    this.h.getBluetoothLeScanner().stopScan((ScanCallback) this.n);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            this.i = 0;
            this.f7741a = false;
            this.t = System.currentTimeMillis();
            Context context = this.g;
            if (context != null) {
                SharedPreferences.Editor edit = context.getSharedPreferences("BluetoothManager", 0).edit();
                edit.putLong("lastStopScanBluetoothTime", this.t);
                edit.apply();
            }
            h();
        }
    }

    public int d() {
        return this.f7742q;
    }

    public synchronized String e() {
        if (!k() || TextUtils.isEmpty(this.r)) {
            return null;
        }
        return this.r;
    }
}
