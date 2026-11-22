package com.amap.api.maps.offlinemap;

import android.content.Context;
import android.os.Handler;
import com.amap.api.col.p0003sl.c2;
import com.amap.api.col.p0003sl.f2;
import com.amap.api.col.p0003sl.g9;
import com.amap.api.col.p0003sl.j9;
import com.amap.api.col.p0003sl.ja;
import com.amap.api.col.p0003sl.k9;
import com.amap.api.col.p0003sl.n1;
import com.amap.api.col.p0003sl.r4;
import com.amap.api.col.p0003sl.t4;
import com.amap.api.col.p0003sl.z1;
import com.amap.api.map3d.R;
import com.amap.api.maps.AMap;
import com.amap.api.maps.AMapException;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes11.dex */
public final class OfflineMapManager {

    /* renamed from: a, reason: collision with root package name */
    private Context f2067a;
    private OfflineMapDownloadListener b;
    private OfflineLoadedListener c;
    private Handler d;
    private Handler e;
    f2 f;
    c2 g;

    public interface OfflineLoadedListener {
        void onVerifyComplete();
    }

    public interface OfflineMapDownloadListener {
        void onCheckUpdate(boolean z, String str);

        void onDownload(int i, int i2, String str);

        void onRemove(boolean z, String str, String str2);
    }

    class a implements c2.d {

        /* renamed from: com.amap.api.maps.offlinemap.OfflineMapManager$a$a, reason: collision with other inner class name */
        class RunnableC0117a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ z1 f2069a;

            RunnableC0117a(z1 z1Var) {
                this.f2069a = z1Var;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    OfflineMapManager.this.b.onDownload(this.f2069a.k().e(), this.f2069a.getcompleteCode(), this.f2069a.getCity());
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }

        class b implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ z1 f2070a;

            b(z1 z1Var) {
                this.f2070a = z1Var;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    if (!this.f2070a.k().equals(this.f2070a.f1992q) && !this.f2070a.k().equals(this.f2070a.k)) {
                        OfflineMapManager.this.b.onCheckUpdate(false, this.f2070a.getCity());
                        return;
                    }
                    OfflineMapManager.this.b.onCheckUpdate(true, this.f2070a.getCity());
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }

        class c implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ z1 f2071a;

            c(z1 z1Var) {
                this.f2071a = z1Var;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    if (this.f2071a.k().equals(this.f2071a.k)) {
                        OfflineMapManager.this.b.onRemove(true, this.f2071a.getCity(), "");
                    } else {
                        OfflineMapManager.this.b.onRemove(false, this.f2071a.getCity(), "");
                    }
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }

        class d implements Runnable {
            d() {
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    OfflineMapManager.this.c.onVerifyComplete();
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }

        a() {
        }

        @Override // com.amap.api.col.3sl.c2.d
        public void a(z1 z1Var) {
            if (OfflineMapManager.this.b != null) {
                OfflineMapManager.this.d.post(new RunnableC0117a(z1Var));
            }
        }

        @Override // com.amap.api.col.3sl.c2.d
        public void b(z1 z1Var) {
            if (OfflineMapManager.this.b == null || z1Var == null) {
                return;
            }
            OfflineMapManager.this.d.post(new b(z1Var));
        }

        @Override // com.amap.api.col.3sl.c2.d
        public void c(z1 z1Var) {
            if (OfflineMapManager.this.b == null || z1Var == null) {
                return;
            }
            OfflineMapManager.this.d.post(new c(z1Var));
        }

        @Override // com.amap.api.col.3sl.c2.d
        public void onVerifyComplete() {
            if (OfflineMapManager.this.c != null) {
                OfflineMapManager.this.d.post(new d());
            }
        }
    }

    class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f2073a;

        b(String str) {
            this.f2073a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                OfflineMapManager.this.g.h(this.f2073a);
            } catch (AMapException e) {
                ja.a(e, "OfflineMapManager", "downloadByProvinceName");
            }
        }
    }

    class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f2074a;

        c(String str) {
            this.f2074a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            OfflineMapManager.this.g.g(this.f2074a);
        }
    }

    public OfflineMapManager(Context context, OfflineMapDownloadListener offlineMapDownloadListener) throws Exception {
        k9 a2 = j9.a(context, t4.b());
        if (a2.f1729a != j9.e.SuccessCode) {
            throw new Exception(a2.b);
        }
        this.b = offlineMapDownloadListener;
        this.f2067a = context.getApplicationContext();
        this.d = new Handler(this.f2067a.getMainLooper());
        this.e = new Handler(this.f2067a.getMainLooper());
        a(context);
        g9.a().a(this.f2067a);
    }

    public void destroy() {
        try {
            c2 c2Var = this.g;
            if (c2Var != null) {
                c2Var.a();
            }
            this.b = null;
            Handler handler = this.d;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
            this.d = null;
            Handler handler2 = this.e;
            if (handler2 != null) {
                handler2.removeCallbacksAndMessages(null);
            }
            this.e = null;
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void downloadByCityCode(String str) throws AMapException {
        try {
            this.g.i(str);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void downloadByCityName(String str) throws AMapException {
        try {
            this.g.h(str);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void downloadByProvinceName(String str) throws AMapException {
        try {
            if (!t4.d(this.f2067a)) {
                throw new AMapException(AMapException.ERROR_CONNECTION);
            }
            OfflineMapProvince itemByProvinceName = getItemByProvinceName(str);
            if (itemByProvinceName == null) {
                throw new AMapException(AMapException.ERROR_INVALID_PARAMETER);
            }
            Iterator<OfflineMapCity> it = itemByProvinceName.getCityList().iterator();
            while (it.hasNext()) {
                this.e.post(new b(it.next().getCity()));
            }
        } catch (Throwable th) {
            if (th instanceof AMapException) {
                throw th;
            }
            ja.a(th, "OfflineMapManager", "downloadByProvinceName");
        }
    }

    public ArrayList<OfflineMapCity> getDownloadOfflineMapCityList() {
        ArrayList<OfflineMapCity> arrayList;
        f2 f2Var = this.f;
        synchronized (f2Var.f1648a) {
            arrayList = new ArrayList<>();
            Iterator<OfflineMapProvince> it = f2Var.f1648a.iterator();
            while (it.hasNext()) {
                OfflineMapProvince next = it.next();
                if (next != null) {
                    for (OfflineMapCity offlineMapCity : next.getCityList()) {
                        if (offlineMapCity.getState() == 4 || offlineMapCity.getState() == 7) {
                            arrayList.add(offlineMapCity);
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    public ArrayList<OfflineMapProvince> getDownloadOfflineMapProvinceList() {
        ArrayList<OfflineMapProvince> arrayList;
        f2 f2Var = this.f;
        synchronized (f2Var.f1648a) {
            arrayList = new ArrayList<>();
            Iterator<OfflineMapProvince> it = f2Var.f1648a.iterator();
            while (it.hasNext()) {
                OfflineMapProvince next = it.next();
                if (next != null && (next.getState() == 4 || next.getState() == 7)) {
                    arrayList.add(next);
                }
            }
        }
        return arrayList;
    }

    public ArrayList<OfflineMapCity> getDownloadingCityList() {
        ArrayList<OfflineMapCity> arrayList;
        f2 f2Var = this.f;
        synchronized (f2Var.f1648a) {
            arrayList = new ArrayList<>();
            Iterator<OfflineMapProvince> it = f2Var.f1648a.iterator();
            while (it.hasNext()) {
                OfflineMapProvince next = it.next();
                if (next != null) {
                    for (OfflineMapCity offlineMapCity : next.getCityList()) {
                        if (f2Var.a(offlineMapCity.getState())) {
                            arrayList.add(offlineMapCity);
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    public ArrayList<OfflineMapProvince> getDownloadingProvinceList() {
        ArrayList<OfflineMapProvince> arrayList;
        f2 f2Var = this.f;
        synchronized (f2Var.f1648a) {
            arrayList = new ArrayList<>();
            Iterator<OfflineMapProvince> it = f2Var.f1648a.iterator();
            while (it.hasNext()) {
                OfflineMapProvince next = it.next();
                if (next != null && f2Var.a(next.getState())) {
                    arrayList.add(next);
                }
            }
        }
        return arrayList;
    }

    public OfflineMapCity getItemByCityCode(String str) {
        f2 f2Var = this.f;
        f2Var.getClass();
        if (str == null || "".equals(str)) {
            return null;
        }
        synchronized (f2Var.f1648a) {
            Iterator<OfflineMapProvince> it = f2Var.f1648a.iterator();
            while (it.hasNext()) {
                Iterator<OfflineMapCity> it2 = it.next().getCityList().iterator();
                while (it2.hasNext()) {
                    OfflineMapCity next = it2.next();
                    if (next.getCode().equals(str)) {
                        return next;
                    }
                }
            }
            return null;
        }
    }

    public OfflineMapCity getItemByCityName(String str) {
        f2 f2Var = this.f;
        f2Var.getClass();
        if (str == null || "".equals(str)) {
            return null;
        }
        synchronized (f2Var.f1648a) {
            Iterator<OfflineMapProvince> it = f2Var.f1648a.iterator();
            while (it.hasNext()) {
                Iterator<OfflineMapCity> it2 = it.next().getCityList().iterator();
                while (it2.hasNext()) {
                    OfflineMapCity next = it2.next();
                    if (next.getCity().trim().equalsIgnoreCase(str.trim())) {
                        return next;
                    }
                }
            }
            return null;
        }
    }

    public OfflineMapProvince getItemByProvinceName(String str) {
        return this.f.a(str);
    }

    public ArrayList<OfflineMapCity> getOfflineMapCityList() {
        f2 f2Var = this.f;
        f2Var.getClass();
        ArrayList<OfflineMapCity> arrayList = new ArrayList<>();
        synchronized (f2Var.f1648a) {
            Iterator<OfflineMapProvince> it = f2Var.f1648a.iterator();
            while (it.hasNext()) {
                Iterator<OfflineMapCity> it2 = it.next().getCityList().iterator();
                while (it2.hasNext()) {
                    arrayList.add(it2.next());
                }
            }
        }
        return arrayList;
    }

    public ArrayList<OfflineMapProvince> getOfflineMapProvinceList() {
        return this.f.b();
    }

    public void pause() {
        this.g.d();
    }

    public void pauseByName(String str) {
        this.g.f(str);
    }

    public void remove(String str) {
        try {
            if (this.g.d(str)) {
                this.g.g(str);
                return;
            }
            OfflineMapProvince a2 = this.f.a(str);
            if (a2 != null && a2.getCityList() != null) {
                Iterator<OfflineMapCity> it = a2.getCityList().iterator();
                while (it.hasNext()) {
                    this.e.post(new c(it.next().getCity()));
                }
                return;
            }
            OfflineMapDownloadListener offlineMapDownloadListener = this.b;
            if (offlineMapDownloadListener != null) {
                offlineMapDownloadListener.onRemove(false, str, n1.a(R.string.O105492_84));
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void restart() {
    }

    public void setOnOfflineLoadedListener(OfflineLoadedListener offlineLoadedListener) {
        this.c = offlineLoadedListener;
    }

    public void stop() {
        this.g.c();
    }

    public void updateOfflineCityByCode(String str) throws AMapException {
        OfflineMapCity itemByCityCode = getItemByCityCode(str);
        if (itemByCityCode == null || itemByCityCode.getCity() == null) {
            throw new AMapException(AMapException.ERROR_INVALID_PARAMETER);
        }
        this.g.a(itemByCityCode.getCity());
    }

    public void updateOfflineCityByName(String str) throws AMapException {
        this.g.a(str);
    }

    public void updateOfflineMapProvinceByName(String str) throws AMapException {
        this.g.a(str);
    }

    private void a(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f2067a = applicationContext;
        c2.n = false;
        c2 a2 = c2.a(applicationContext);
        this.g = a2;
        a2.a(new a());
        try {
            this.g.b();
            this.f = this.g.j;
            r4.d(context);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public OfflineMapManager(Context context, OfflineMapDownloadListener offlineMapDownloadListener, AMap aMap) {
        this.b = offlineMapDownloadListener;
        this.f2067a = context.getApplicationContext();
        this.d = new Handler(this.f2067a.getMainLooper());
        this.e = new Handler(this.f2067a.getMainLooper());
        try {
            a(context);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
