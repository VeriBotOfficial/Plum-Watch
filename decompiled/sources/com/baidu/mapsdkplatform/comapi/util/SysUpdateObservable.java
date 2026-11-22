package com.baidu.mapsdkplatform.comapi.util;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes13.dex */
public class SysUpdateObservable {

    /* renamed from: a, reason: collision with root package name */
    private static volatile SysUpdateObservable f8397a;
    private List<SysUpdateObserver> b;

    private SysUpdateObservable() {
        this.b = null;
        this.b = new ArrayList();
    }

    public static SysUpdateObservable getInstance() {
        if (f8397a == null) {
            synchronized (SysUpdateObservable.class) {
                if (f8397a == null) {
                    f8397a = new SysUpdateObservable();
                }
            }
        }
        return f8397a;
    }

    public synchronized void addObserver(SysUpdateObserver sysUpdateObserver) {
        this.b.add(sysUpdateObserver);
    }

    public synchronized void clearObserver() {
        this.b.clear();
    }

    public synchronized void init(String str) {
        for (SysUpdateObserver sysUpdateObserver : this.b) {
            if (sysUpdateObserver != null) {
                sysUpdateObserver.init(str);
            }
        }
    }

    public synchronized void updateCuid(String str) {
        for (SysUpdateObserver sysUpdateObserver : this.b) {
            if (sysUpdateObserver != null) {
                sysUpdateObserver.updateCuid(str);
            }
        }
    }

    public synchronized void updateNetworkInfo(Context context) {
        for (SysUpdateObserver sysUpdateObserver : this.b) {
            if (sysUpdateObserver != null) {
                sysUpdateObserver.updateNetworkInfo(context);
            }
        }
    }

    public synchronized void updateNetworkProxy(Context context) {
        for (SysUpdateObserver sysUpdateObserver : this.b) {
            if (sysUpdateObserver != null) {
                sysUpdateObserver.updateNetworkProxy(context);
            }
        }
    }

    public synchronized void updatePhoneInfo(String str) {
        for (SysUpdateObserver sysUpdateObserver : this.b) {
            if (sysUpdateObserver != null) {
                sysUpdateObserver.updatePhoneInfo(str);
            }
        }
    }

    public synchronized void updateZid(String str) {
        for (SysUpdateObserver sysUpdateObserver : this.b) {
            if (sysUpdateObserver != null) {
                sysUpdateObserver.updateZid(str);
            }
        }
    }
}
