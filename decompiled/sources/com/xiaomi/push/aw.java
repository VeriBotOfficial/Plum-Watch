package com.xiaomi.push;

import android.net.NetworkInfo;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes4.dex */
public class aw {

    /* renamed from: a, reason: collision with root package name */
    private final NetworkInfo f14445a;

    /* renamed from: a, reason: collision with other field name */
    private final ConcurrentHashMap<String, Object> f216a = new ConcurrentHashMap<>();

    public aw(NetworkInfo networkInfo) {
        this.f14445a = networkInfo;
    }

    private <T> T a(String str) {
        char c;
        Object valueOf;
        if (!this.f216a.containsKey(str)) {
            synchronized (str) {
                if (!this.f216a.contains(str)) {
                    switch (str.hashCode()) {
                        case -830707388:
                            if (str.equals("getSubtype")) {
                                c = 2;
                                break;
                            }
                            c = 65535;
                            break;
                        case -75106384:
                            if (str.equals("getType")) {
                                c = 0;
                                break;
                            }
                            c = 65535;
                            break;
                        case -66906641:
                            if (str.equals("getSubtypeName")) {
                                c = 3;
                                break;
                            }
                            c = 65535;
                            break;
                        case 599209215:
                            if (str.equals("isConnected")) {
                                c = 4;
                                break;
                            }
                            c = 65535;
                            break;
                        case 711698955:
                            if (str.equals("getDetailedState")) {
                                c = 6;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1401392731:
                            if (str.equals("getTypeName")) {
                                c = 1;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1965583067:
                            if (str.equals("getState")) {
                                c = 5;
                                break;
                            }
                            c = 65535;
                            break;
                        default:
                            c = 65535;
                            break;
                    }
                    switch (c) {
                        case 0:
                            valueOf = Integer.valueOf(this.f14445a.getType());
                            break;
                        case 1:
                            valueOf = this.f14445a.getTypeName();
                            break;
                        case 2:
                            valueOf = Integer.valueOf(this.f14445a.getSubtype());
                            break;
                        case 3:
                            valueOf = this.f14445a.getSubtypeName();
                            break;
                        case 4:
                            valueOf = Boolean.valueOf(this.f14445a.isConnected());
                            break;
                        case 5:
                            valueOf = this.f14445a.getState();
                            break;
                        case 6:
                            valueOf = this.f14445a.getDetailedState();
                            break;
                        default:
                            valueOf = null;
                            break;
                    }
                    if (valueOf != null) {
                        this.f216a.put(str, valueOf);
                    }
                }
            }
        }
        return (T) this.f216a.get(str);
    }

    public int a() {
        return ((Integer) a("getType")).intValue();
    }

    public int b() {
        return ((Integer) a("getSubtype")).intValue();
    }

    /* renamed from: a, reason: collision with other method in class */
    public String m11887a() {
        return (String) a("getTypeName");
    }

    /* renamed from: b, reason: collision with other method in class */
    public String m11889b() {
        return (String) a("getSubtypeName");
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m11888a() {
        return ((Boolean) a("isConnected")).booleanValue();
    }

    /* renamed from: a, reason: collision with other method in class */
    public NetworkInfo.State m11886a() {
        return (NetworkInfo.State) a("getState");
    }

    /* renamed from: a, reason: collision with other method in class */
    public NetworkInfo.DetailedState m11885a() {
        return (NetworkInfo.DetailedState) a("getDetailedState");
    }
}
