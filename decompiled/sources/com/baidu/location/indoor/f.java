package com.baidu.location.indoor;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothManager;
import android.bluetooth.le.BluetoothLeScanner;
import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanResult;
import android.content.Context;
import com.iflytek.cloud.SpeechConstant;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes13.dex */
public class f {
    private static final char[] b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    private Context c;
    private BluetoothAdapter f;
    private boolean g;
    private c h;

    /* renamed from: a, reason: collision with root package name */
    com.baidu.location.indoor.b f7750a = com.baidu.location.indoor.c.a().b();
    private boolean d = false;
    private boolean e = false;
    private boolean i = false;
    private String j = null;
    private String k = null;
    private int l = -1;
    private int m = -1;
    private long n = -1;
    private ConcurrentMap<String, ScanResult> o = new ConcurrentHashMap();
    private Object p = null;

    /* renamed from: q, reason: collision with root package name */
    private long f7751q = 0;
    private boolean r = false;
    private long s = -1;

    private class a {

        /* renamed from: a, reason: collision with root package name */
        public String f7752a;
        public int b;
        public long c;

        public a(String str, int i, long j) {
            this.f7752a = str;
            this.b = i;
            this.c = j / 1000000;
        }

        public String toString() {
            return this.f7752a.toUpperCase() + ";" + this.b + ";" + this.c;
        }
    }

    private class b {

        /* renamed from: a, reason: collision with root package name */
        public String f7753a;
        public String b;
        public int c;
        public String d;
        public String e;

        public b(String str, int i, int i2, int i3, String str2) {
            this.f7753a = Integer.toHexString(i);
            this.b = Integer.toHexString(i2);
            this.c = i3;
            this.d = str;
            this.e = str2;
        }

        public String toString() {
            return this.d + "," + this.f7753a + "," + this.b + "," + this.c;
        }
    }

    public interface c {
        void a(boolean z, String str, String str2, String str3);
    }

    class d implements Comparator<b> {
        d() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(b bVar, b bVar2) {
            return bVar.c - bVar2.c;
        }
    }

    class e implements Comparator<a> {
        e() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(a aVar, a aVar2) {
            return aVar2.b - aVar.b;
        }
    }

    public f(Context context) {
        this.g = false;
        this.c = context;
        if (this.f == null) {
            try {
                this.f = ((BluetoothManager) context.getSystemService(SpeechConstant.BLUETOOTH)).getAdapter();
                this.g = this.c.getPackageManager().hasSystemFeature("android.hardware.bluetooth_le");
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    private b a(String str, int i, int i2, int i3, String str2, com.baidu.location.indoor.b bVar) {
        String str3;
        int i4;
        int i5;
        String str4;
        String[] b2;
        if (bVar == null) {
            return null;
        }
        if (com.baidu.location.b.c.a().dr != 1 || (b2 = bVar.b()) == null || b2.length <= 0) {
            str3 = str;
            i4 = i;
            i5 = i2;
            str4 = str2;
        } else {
            int i6 = i;
            int i7 = i2;
            String str5 = str2;
            for (String str6 : b2) {
                if (str.equalsIgnoreCase(str6)) {
                    String[] a2 = g.a(i6, i7, str5);
                    try {
                        if (a2.length >= 3) {
                            i6 = Integer.parseInt(a2[0]);
                            i7 = Integer.parseInt(a2[1]);
                            str5 = a2[2].toUpperCase();
                        }
                    } catch (Exception unused) {
                    }
                }
            }
            str3 = str;
            i4 = i6;
            i5 = i7;
            str4 = str5;
        }
        return new b(str3, i4, i5, i3, str4);
    }

    private String a(List<a> list, int i) {
        StringBuilder sb = new StringBuilder();
        Collections.sort(list, new e());
        sb.append(list.get(0).toString());
        for (int i2 = 1; i2 < list.size() && i2 < i; i2++) {
            sb.append("|").append(list.get(i2).toString());
        }
        this.l = list.size();
        return sb.toString();
    }

    public static String a(byte[] bArr) {
        char[] cArr = new char[bArr.length * 2];
        for (int i = 0; i < bArr.length; i++) {
            byte b2 = bArr[i];
            int i2 = i * 2;
            char[] cArr2 = b;
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

    private void a(ConcurrentMap<String, ScanResult> concurrentMap) {
        byte[] bArr;
        ArrayList<ScanResult> arrayList = new ArrayList(concurrentMap.values());
        ArrayList arrayList2 = new ArrayList();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        for (ScanResult scanResult : arrayList) {
            byte[] bytes = scanResult.getScanRecord().getBytes();
            if (bytes.length >= 26) {
                b a2 = a(bytes, scanResult.getRssi(), scanResult.getDevice().getAddress().replaceAll(":", ""));
                if (a2 != null) {
                    arrayList4.add(a2);
                    bArr = bytes;
                    arrayList3.add(new a(a2.e, scanResult.getRssi(), scanResult.getTimestampNanos()));
                } else {
                    bArr = bytes;
                }
                String a3 = a(Arrays.copyOfRange(bArr, 9, 25));
                arrayList2.add(a3);
                hashMap.put(a3, scanResult.getDevice().getName());
                hashMap2.put(a3, a(Arrays.copyOfRange(bArr, 0, 9)));
                if (hashMap3.get(a3) == null) {
                    hashMap3.put(a3, 0);
                }
                hashMap3.put(a3, Integer.valueOf(((Integer) hashMap3.get(a3)).intValue() + 1));
            }
        }
        String str = null;
        int i = 0;
        for (String str2 : hashMap3.keySet()) {
            if (((Integer) hashMap3.get(str2)).intValue() > i) {
                i = ((Integer) hashMap3.get(str2)).intValue();
                str = str2;
            }
        }
        boolean z = i > 3;
        c cVar = this.h;
        if (cVar != null && this.d) {
            cVar.a(z, str, (String) hashMap.get(str), (String) hashMap2.get(str));
            this.d = false;
        }
        if (arrayList3.size() > 2) {
            this.j = a(arrayList3, 32);
            this.k = b(arrayList4, 32);
        } else {
            this.j = "";
            this.k = "";
        }
        if (this.i && com.baidu.location.indoor.c.a().b() != null && h() && !this.r && i()) {
            g();
        }
    }

    private String b(List<b> list, int i) {
        if (list == null || list.size() <= 0) {
            this.m = 0;
            return "";
        }
        StringBuilder sb = new StringBuilder();
        Collections.sort(list, new d());
        sb.append(list.get(0).toString());
        for (int i2 = 1; i2 < list.size() && i2 < i; i2++) {
            sb.append("|").append(list.get(i2).toString());
        }
        this.m = list.size();
        return sb.toString();
    }

    private void g() {
        a();
    }

    private boolean h() {
        return System.currentTimeMillis() - this.n > 5000;
    }

    private boolean i() {
        return System.currentTimeMillis() - this.s > 5000;
    }

    private void j() {
        this.j = "";
        this.k = "";
        this.m = -1;
        this.l = -1;
        this.n = -1L;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x006b A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean k() {
        /*
            r7 = this;
            java.lang.String r0 = ""
            java.io.File r1 = new java.io.File
            android.content.Context r2 = r7.c
            java.io.File r2 = r2.getCacheDir()
            java.lang.String r3 = "ibct"
            r1.<init>(r2, r3)
            boolean r2 = r1.exists()
            r3 = 0
            if (r2 != 0) goto L17
            return r3
        L17:
            r2 = 0
            java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch: java.lang.Exception -> L42
            java.io.FileReader r5 = new java.io.FileReader     // Catch: java.lang.Exception -> L42
            r5.<init>(r1)     // Catch: java.lang.Exception -> L42
            r4.<init>(r5)     // Catch: java.lang.Exception -> L42
            r1 = r2
            r2 = r0
        L24:
            java.lang.String r1 = r4.readLine()     // Catch: java.lang.Exception -> L40
            if (r1 == 0) goto L3c
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L40
            r5.<init>()     // Catch: java.lang.Exception -> L40
            java.lang.StringBuilder r2 = r5.append(r2)     // Catch: java.lang.Exception -> L40
            java.lang.StringBuilder r2 = r2.append(r1)     // Catch: java.lang.Exception -> L40
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Exception -> L40
            goto L24
        L3c:
            r4.close()     // Catch: java.lang.Exception -> L42
            goto L4a
        L40:
            r2 = move-exception
            goto L46
        L42:
            r1 = move-exception
            r6 = r2
            r2 = r1
            r1 = r6
        L46:
            r2.printStackTrace()
            r2 = r1
        L4a:
            if (r2 == 0) goto L6d
            java.lang.String r1 = r2.trim()
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L57
            goto L6d
        L57:
            java.lang.Long r0 = java.lang.Long.valueOf(r2)     // Catch: java.lang.Exception -> L6d
            long r0 = r0.longValue()     // Catch: java.lang.Exception -> L6d
            long r4 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L6d
            long r4 = r4 - r0
            r0 = 259200(0x3f480, double:1.28062E-318)
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 >= 0) goto L6d
            r0 = 1
            return r0
        L6d:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baidu.location.indoor.f.k():boolean");
    }

    private void l() {
        try {
            FileWriter fileWriter = new FileWriter(new File(this.c.getCacheDir(), "ibct"));
            fileWriter.write(System.currentTimeMillis() + "");
            fileWriter.flush();
            fileWriter.close();
        } catch (Exception unused) {
        }
    }

    public b a(byte[] bArr, int i, String str) {
        com.baidu.location.indoor.b b2;
        int i2 = -i;
        if (str == null || i2 < 0 || (b2 = com.baidu.location.indoor.c.a().b()) == null) {
            return null;
        }
        for (int i3 = 2; i3 <= 5; i3++) {
            byte b3 = bArr[i3 + 2];
            if ((b3 & 255) == 2 && (bArr[i3 + 3] & 255) == 21) {
                String a2 = a(Arrays.copyOfRange(bArr, 9, 25));
                String[] c2 = b2.c();
                if (c2 != null && c2.length > 0) {
                    for (String str2 : c2) {
                        if (a2.equalsIgnoreCase(str2)) {
                            return a(a2, (bArr[i3 + 21] & 255) + ((bArr[i3 + 20] & 255) * 256), ((bArr[i3 + 22] & 255) * 256) + (bArr[i3 + 23] & 255), i2, str, b2);
                        }
                    }
                }
                return null;
            }
            byte b4 = bArr[i3];
            if (((b4 & 255) != 45 || (bArr[i3 + 1] & 255) != 36 || (b3 & 255) != 191 || (bArr[i3 + 3] & 255) != 22) && (b4 & 255) == 173 && (bArr[i3 + 1] & 255) == 119 && (b3 & 255) == 0) {
                byte b5 = bArr[i3 + 3];
            }
        }
        return null;
    }

    public boolean a() {
        BluetoothAdapter bluetoothAdapter = this.f;
        if (bluetoothAdapter != null && this.g) {
            try {
                return bluetoothAdapter.isEnabled();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return false;
    }

    public boolean a(c cVar) {
        if (this.d || this.e) {
            return false;
        }
        this.e = true;
        if (!a() || k()) {
            return false;
        }
        l();
        this.h = cVar;
        return true;
    }

    public void b() {
        this.e = false;
        this.d = false;
        this.r = false;
        this.s = -1L;
    }

    public void c() {
        if (this.i) {
            try {
                BluetoothLeScanner bluetoothLeScanner = this.f.getBluetoothLeScanner();
                if (bluetoothLeScanner != null) {
                    bluetoothLeScanner.stopScan((ScanCallback) this.p);
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
            this.i = false;
            this.r = false;
            this.s = -1L;
            j();
        }
    }

    public String d() {
        a(this.o);
        return this.j;
    }

    public long e() {
        return this.n;
    }

    public boolean f() {
        return System.currentTimeMillis() - this.n <= 20000;
    }
}
