package com.baidu.location.b;

import android.content.Context;
import android.content.SharedPreferences;
import com.baidu.bdhttpdns.BDHttpDns;
import com.baidu.bdhttpdns.BDHttpDnsResult;
import com.baidu.location.BDLocation;
import com.baidu.location.Jni;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import okhttp3.Dns;

/* loaded from: classes13.dex */
public class l {

    /* renamed from: a, reason: collision with root package name */
    private boolean f7558a;
    private long b;
    private Context c;
    private BDHttpDns d;

    private static class a {

        /* renamed from: a, reason: collision with root package name */
        private static final l f7559a = new l();
    }

    public static class b implements Dns {

        /* renamed from: a, reason: collision with root package name */
        private static b f7560a;
        private BDHttpDns b;

        private b(BDHttpDns bDHttpDns) {
            this.b = bDHttpDns;
        }

        public static b a(BDHttpDns bDHttpDns) {
            if (f7560a == null) {
                f7560a = new b(bDHttpDns);
            }
            return f7560a;
        }

        @Override // okhttp3.Dns
        public List<InetAddress> lookup(String str) throws UnknownHostException {
            if (!com.baidu.location.h.d.b.equals(str)) {
                return Dns.SYSTEM.lookup(str);
            }
            BDHttpDnsResult syncResolve = this.b.syncResolve(str, true);
            ArrayList<String> ipv6List = syncResolve.getIpv6List();
            ArrayList<String> ipv4List = syncResolve.getIpv4List();
            String str2 = (ipv6List == null || ipv6List.isEmpty()) ? (ipv4List == null || ipv4List.isEmpty()) ? null : ipv4List.get(0) : "[" + ipv6List.get(0) + "]";
            return str2 != null ? Arrays.asList(InetAddress.getAllByName(str2)) : Dns.SYSTEM.lookup(str);
        }
    }

    private l() {
        this.f7558a = true;
        this.b = 0L;
    }

    public static l a() {
        return a.f7559a;
    }

    private void a(BDLocation bDLocation, Context context) {
        double longitude;
        double latitude;
        String str;
        double[] dArr = new double[2];
        String coorType = bDLocation.getCoorType();
        if ("wgs84".equals(coorType)) {
            dArr[0] = bDLocation.getLongitude();
            dArr[1] = bDLocation.getLatitude();
        } else {
            double[] dArr2 = new double[2];
            if ("bd09ll".equals(coorType)) {
                longitude = bDLocation.getLongitude();
                latitude = bDLocation.getLatitude();
                str = BDLocation.BDLOCATION_BD09LL_TO_GCJ02;
            } else if ("bd09".equals(coorType)) {
                longitude = bDLocation.getLongitude();
                latitude = bDLocation.getLatitude();
                str = BDLocation.BDLOCATION_BD09_TO_GCJ02;
            } else {
                dArr2[0] = bDLocation.getLongitude();
                dArr2[1] = bDLocation.getLatitude();
                dArr = Jni.coorEncrypt(dArr2[0], dArr2[1], "gcj2wgs");
            }
            dArr2 = Jni.coorEncrypt(longitude, latitude, str);
            dArr = Jni.coorEncrypt(dArr2[0], dArr2[1], "gcj2wgs");
        }
        boolean a2 = com.baidu.location.h.f.a().a(dArr[0], dArr[1]);
        try {
            this.b = System.currentTimeMillis();
            SharedPreferences a3 = s.a(context);
            if (a3 != null) {
                SharedPreferences.Editor edit = a3.edit();
                edit.putBoolean("IsDomestic", a2);
                edit.putLong("update_result_time", this.b);
                edit.apply();
            }
            if (a2) {
                com.baidu.location.h.d.a();
            } else {
                com.baidu.location.h.d.b();
            }
        } catch (Exception unused) {
        }
    }

    public void a(Context context) {
        if (c.a().eb == 0) {
            return;
        }
        this.c = context;
        this.f7558a = s.a(context).getBoolean("IsDomestic", true);
        this.b = s.a(context).getLong("update_result_time", 0L);
        if (this.f7558a) {
            com.baidu.location.h.d.a();
            return;
        }
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList("loc.map.baidu.com"));
        BDHttpDns service = BDHttpDns.getService(context);
        this.d = service;
        try {
            service.setAccountID("110001");
            this.d.setSecret("nHpsFU98hcqhzFWY17Ht");
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
        this.d.setHttpsRequestEnable(true);
        this.d.setNetworkSwitchPolicy(true, true);
        this.d.setCachePolicy(BDHttpDns.CachePolicy.POLICY_TOLERANT);
        this.d.setPreResolveHosts(arrayList);
    }

    public void a(BDLocation bDLocation) {
        if (c.a().eb != 1 || bDLocation.getLongitude() == Double.MIN_VALUE || bDLocation.getLatitude() == Double.MIN_VALUE || System.currentTimeMillis() - this.b <= c.a().ec) {
            return;
        }
        a(bDLocation, this.c);
    }

    public boolean a(String str) {
        try {
            String host = new URL(str).getHost();
            if (this.f7558a) {
                return false;
            }
            return com.baidu.location.h.d.b.equals(host);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public int b() {
        return this.f7558a ? 1 : 0;
    }

    public String b(String str) {
        if (!this.f7558a) {
            try {
                String host = new URL(str).getHost();
                if (host != null && !host.isEmpty()) {
                    BDHttpDnsResult syncResolve = this.d.syncResolve(host, true);
                    ArrayList<String> ipv6List = syncResolve.getIpv6List();
                    ArrayList<String> ipv4List = syncResolve.getIpv4List();
                    String str2 = (ipv6List == null || ipv6List.isEmpty()) ? (ipv4List == null || ipv4List.isEmpty()) ? null : ipv4List.get(0) : "[" + ipv6List.get(0) + "]";
                    if (str2 != null) {
                        return str.replaceFirst(host, str2);
                    }
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
        return str;
    }

    public Dns c() {
        return this.f7558a ? Dns.SYSTEM : b.a(this.d);
    }
}
