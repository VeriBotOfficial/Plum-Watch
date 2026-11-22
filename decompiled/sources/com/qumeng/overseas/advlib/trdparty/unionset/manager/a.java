package com.qumeng.overseas.advlib.trdparty.unionset.manager;

import android.gov.nist.core.Separators;
import android.text.TextUtils;
import com.qumeng.overseas.advlib.__remote__.utils.n;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes17.dex */
public class a {
    private static final String e = "AdDataManager";
    private static final int f = 50;
    private static final int g = 5;
    private static final int h = 3;

    /* renamed from: a, reason: collision with root package name */
    private final ConcurrentHashMap<String, Map<String, com.qumeng.overseas.advlib.trdparty.unionset.network.a>> f13384a;
    private final ConcurrentHashMap<String, ArrayList<com.qumeng.overseas.advlib.trdparty.unionset.network.a>> b;
    private final ConcurrentHashMap<String, Map<String, com.qumeng.overseas.advlib.trdparty.unionset.network.a>> c;
    private volatile int d;

    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        private static final a f13385a = new a();

        private b() {
        }
    }

    private boolean a(com.qumeng.overseas.advlib.trdparty.unionset.network.a aVar, com.qumeng.overseas.advlib.trdparty.unionset.network.a aVar2) {
        return aVar == aVar2;
    }

    private void b(String str, com.qumeng.overseas.advlib.trdparty.unionset.network.a aVar) {
        Map<String, com.qumeng.overseas.advlib.trdparty.unionset.network.a> putIfAbsent;
        if (TextUtils.isEmpty(str) || aVar == null || TextUtils.isEmpty(aVar.v())) {
            n.a(e, "[P0] adslotID is null or adInfoEntity is null", new Object[0]);
            return;
        }
        String v = aVar.v();
        Map<String, com.qumeng.overseas.advlib.trdparty.unionset.network.a> map = this.f13384a.get(str);
        if (com.qumeng.overseas.advlib.trdparty.unionset.utils.b.b((Object) map) && (putIfAbsent = this.f13384a.putIfAbsent(str, (map = new HashMap<>()))) != null) {
            map = putIfAbsent;
        }
        synchronized (map) {
            com.qumeng.overseas.advlib.trdparty.unionset.network.a aVar2 = map.get(v);
            if (aVar2 == null) {
                map.put(v, aVar);
                n.a(e, "[P0] Added: ecpm=" + aVar.n() + ", NetWorkName=" + aVar.d(), new Object[0]);
            } else if (aVar.n() > aVar2.n()) {
                map.put(v, aVar);
                n.a(e, "[P0] Replaced: old=" + aVar2.n() + Separators.LPAREN + aVar2.d() + ") -> new=" + aVar.n() + Separators.LPAREN + aVar.d() + Separators.RPAREN, new Object[0]);
            } else {
                n.a(e, "[P0] Discarded: " + aVar.n() + Separators.LPAREN + aVar.d() + ") <= existing " + aVar2.n() + Separators.LPAREN + aVar2.d() + Separators.RPAREN, new Object[0]);
            }
        }
    }

    private void d(String str, com.qumeng.overseas.advlib.trdparty.unionset.network.a aVar) {
        Map<String, com.qumeng.overseas.advlib.trdparty.unionset.network.a> putIfAbsent;
        if (TextUtils.isEmpty(str) || aVar == null || TextUtils.isEmpty(aVar.v())) {
            n.a(e, "[P2] adslotID is null or adInfoEntity is null", new Object[0]);
            return;
        }
        String v = aVar.v();
        Map<String, com.qumeng.overseas.advlib.trdparty.unionset.network.a> map = this.c.get(str);
        if (com.qumeng.overseas.advlib.trdparty.unionset.utils.b.b((Object) map) && (putIfAbsent = this.c.putIfAbsent(str, (map = new HashMap<>()))) != null) {
            map = putIfAbsent;
        }
        synchronized (map) {
            com.qumeng.overseas.advlib.trdparty.unionset.network.a aVar2 = map.get(v);
            if (aVar2 == null) {
                map.put(v, aVar);
                n.a(e, "[P2] Added: ecpm=" + aVar.n() + ", NetWorkName=" + aVar.d(), new Object[0]);
            } else if (aVar.n() > aVar2.n()) {
                map.put(v, aVar);
                n.a(e, "[P2] Replaced: old=" + aVar2.n() + Separators.LPAREN + aVar2.d() + ") -> new=" + aVar.n() + Separators.LPAREN + aVar.d() + Separators.RPAREN, new Object[0]);
            } else {
                n.a(e, "[P2] Discarded: " + aVar.n() + Separators.LPAREN + aVar.d() + ") <= existing " + aVar2.n() + Separators.LPAREN + aVar2.d() + Separators.RPAREN, new Object[0]);
            }
        }
    }

    public void c() {
        this.d = b();
        n.a(e, "cacheMin: " + this.d, new Object[0]);
    }

    public void e(String str, com.qumeng.overseas.advlib.trdparty.unionset.network.a aVar) {
        if (TextUtils.isEmpty(str) || aVar == null || (!(c(this.f13384a, "P0", str, aVar) | b(this.b, "P1", str, aVar)) && !c(this.c, "P2", str, aVar))) {
            return;
        }
        n.a(e, "缓存广告已移除: adslotID=" + str + ", originalSearchId=" + aVar.r() + ", searchId=" + aVar.v() + ", adID=" + aVar.a(), new Object[0]);
    }

    private a() {
        this.f13384a = new ConcurrentHashMap<>();
        this.b = new ConcurrentHashMap<>();
        this.c = new ConcurrentHashMap<>();
    }

    public static a a() {
        return b.f13385a;
    }

    private void c(String str, com.qumeng.overseas.advlib.trdparty.unionset.network.a aVar) {
        a(this.b, "P1", str, aVar);
    }

    public void a(String str, com.qumeng.overseas.advlib.trdparty.unionset.network.a aVar) {
        if (com.qumeng.overseas.advlib.trdparty.unionset.utils.a.a(aVar, 0)) {
            a().b(str, aVar);
            n.a(e, "[P0] 数据返回, 筛选价格最高数据", new Object[0]);
        } else if (com.qumeng.overseas.advlib.trdparty.unionset.utils.a.a(aVar, 1)) {
            a().c(str, aVar);
            n.a(e, "[P1] 数据返回, 进入缓存池", new Object[0]);
        } else {
            a().d(str, aVar);
            n.a(e, "[P2] 数据返回, 筛选价格最高数据", new Object[0]);
        }
    }

    public com.qumeng.overseas.advlib.trdparty.unionset.network.a c(String str, String str2) {
        Map<String, com.qumeng.overseas.advlib.trdparty.unionset.network.a> map;
        com.qumeng.overseas.advlib.trdparty.unionset.network.a remove;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || (map = this.c.get(str)) == null) {
            return null;
        }
        synchronized (map) {
            remove = map.remove(str2);
            if (remove != null) {
                n.a(e, "[P2] Poll: Consumed Winner ecpm=" + remove.n() + ", SearchId=" + remove.v() + ", NetWorkName=" + remove.d(), new Object[0]);
            } else {
                n.a(e, "[P2] Poll: Consumed Winner ad is null!", new Object[0]);
            }
        }
        return remove;
    }

    private void a(ConcurrentHashMap<String, ArrayList<com.qumeng.overseas.advlib.trdparty.unionset.network.a>> concurrentHashMap, String str, String str2, com.qumeng.overseas.advlib.trdparty.unionset.network.a aVar) {
        ArrayList<com.qumeng.overseas.advlib.trdparty.unionset.network.a> putIfAbsent;
        if (!TextUtils.isEmpty(str2) && aVar != null) {
            n.a(e, "[" + str + "] addToCache start", new Object[0]);
            try {
                ArrayList<com.qumeng.overseas.advlib.trdparty.unionset.network.a> arrayList = concurrentHashMap.get(str2);
                if (com.qumeng.overseas.advlib.trdparty.unionset.utils.b.b((Object) arrayList) && (putIfAbsent = concurrentHashMap.putIfAbsent(str2, (arrayList = new ArrayList<>(6)))) != null) {
                    arrayList = putIfAbsent;
                }
                synchronized (arrayList) {
                    long currentTimeMillis = System.currentTimeMillis();
                    if (arrayList.size() >= 5) {
                        com.qumeng.overseas.advlib.trdparty.unionset.network.a aVar2 = arrayList.get(arrayList.size() - 1);
                        if (!a(currentTimeMillis, aVar2) && aVar.n() < aVar2.n()) {
                            n.a(e, "[" + str + "] addToCache满额: 新广告: " + aVar.d() + " ->价格(" + aVar.n() + ") < 缓存最低价广告: " + aVar2.d() + " ->价格(" + aVar2.n() + ")，放弃添加。", new Object[0]);
                            return;
                        } else {
                            arrayList.remove(arrayList.size() - 1);
                            n.a(e, "[" + str + "] addToCache满额: 移除最低价广告:" + aVar2.d() + " ->价格(" + aVar2.n() + ")，接纳高价新广告: " + aVar.d() + " ->价格(" + aVar.n() + Separators.RPAREN, new Object[0]);
                        }
                    }
                    aVar.b(currentTimeMillis);
                    aVar.c(true);
                    if (TextUtils.isEmpty(aVar.r())) {
                        aVar.d(aVar.v());
                    }
                    int i = 0;
                    while (true) {
                        if (i >= arrayList.size()) {
                            i = -1;
                            break;
                        } else if (aVar.n() > arrayList.get(i).n()) {
                            break;
                        } else {
                            i++;
                        }
                    }
                    if (i != -1) {
                        arrayList.add(i, aVar);
                    } else {
                        arrayList.add(aVar);
                    }
                    n.a(e, "[" + str + "] Added to cache success! ecpm: " + aVar.n() + ", NetWorkName: " + aVar.d() + ", cache size = " + arrayList.size(), new Object[0]);
                    return;
                }
            } catch (Exception e2) {
                n.b(e, "[" + str + "] addToCache exception: " + e2.getMessage(), new Object[0]);
                return;
            }
        }
        n.a(e, "[" + str + "] adslotID is null or adInfoEntity is null", new Object[0]);
    }

    private boolean c(ConcurrentHashMap<String, Map<String, com.qumeng.overseas.advlib.trdparty.unionset.network.a>> concurrentHashMap, String str, String str2, com.qumeng.overseas.advlib.trdparty.unionset.network.a aVar) {
        Map<String, com.qumeng.overseas.advlib.trdparty.unionset.network.a> map = concurrentHashMap.get(str2);
        if (map == null) {
            return false;
        }
        synchronized (map) {
            if (map.isEmpty()) {
                return false;
            }
            Iterator<Map.Entry<String, com.qumeng.overseas.advlib.trdparty.unionset.network.a>> it = map.entrySet().iterator();
            boolean z = false;
            while (it.hasNext()) {
                if (a(it.next().getValue(), aVar)) {
                    it.remove();
                    z = true;
                }
            }
            if (z) {
                n.a(e, "[" + str + "] Remove cached ad: adslotID=" + str2 + ", adID=" + aVar.a(), new Object[0]);
            }
            return z;
        }
    }

    public com.qumeng.overseas.advlib.trdparty.unionset.network.a b(String str, String str2) {
        Map<String, com.qumeng.overseas.advlib.trdparty.unionset.network.a> map;
        com.qumeng.overseas.advlib.trdparty.unionset.network.a remove;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || (map = this.f13384a.get(str)) == null) {
            return null;
        }
        synchronized (map) {
            remove = map.remove(str2);
            if (remove != null) {
                n.a(e, "[P0] Poll: Consumed Winner ecpm=" + remove.n() + ", SearchId=" + remove.v() + ", NetWorkName=" + remove.d(), new Object[0]);
            } else {
                n.a(e, "[P0] Poll: Consumed Winner ad is null!", new Object[0]);
            }
        }
        return remove;
    }

    public void c(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        n.a(e, "开始清理: adslotID=" + str, new Object[0]);
        a(this.b, str, System.currentTimeMillis());
    }

    public com.qumeng.overseas.advlib.trdparty.unionset.network.a b(String str, String str2, boolean z) {
        return a(this.b, "P1", str, str2, true, z);
    }

    private boolean b(ConcurrentHashMap<String, ArrayList<com.qumeng.overseas.advlib.trdparty.unionset.network.a>> concurrentHashMap, String str, String str2, com.qumeng.overseas.advlib.trdparty.unionset.network.a aVar) {
        boolean z;
        ArrayList<com.qumeng.overseas.advlib.trdparty.unionset.network.a> arrayList = concurrentHashMap.get(str2);
        if (com.qumeng.overseas.advlib.trdparty.unionset.utils.b.a((Collection<?>) arrayList)) {
            return false;
        }
        synchronized (arrayList) {
            Iterator<com.qumeng.overseas.advlib.trdparty.unionset.network.a> it = arrayList.iterator();
            z = false;
            while (it.hasNext()) {
                if (a(it.next(), aVar)) {
                    it.remove();
                    z = true;
                }
            }
            if (arrayList.isEmpty()) {
                concurrentHashMap.remove(str2, arrayList);
            }
        }
        if (z) {
            n.a(e, "[" + str + "] Remove cached ad: adslotID=" + str2 + ", adID=" + aVar.a(), new Object[0]);
        }
        return z;
    }

    public List<com.qumeng.overseas.advlib.trdparty.unionset.network.a> b(String str) {
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(str) && !com.qumeng.overseas.advlib.trdparty.unionset.utils.b.b((Object) this.b)) {
            ArrayList<com.qumeng.overseas.advlib.trdparty.unionset.network.a> arrayList2 = this.b.get(str);
            if (!com.qumeng.overseas.advlib.trdparty.unionset.utils.b.a((Collection<?>) arrayList2)) {
                synchronized (arrayList2) {
                    Iterator<com.qumeng.overseas.advlib.trdparty.unionset.network.a> it = arrayList2.iterator();
                    while (it.hasNext()) {
                        com.qumeng.overseas.advlib.trdparty.unionset.network.a next = it.next();
                        if (com.qumeng.overseas.advlib.trdparty.unionset.utils.b.a(next)) {
                            arrayList.add(next);
                        }
                    }
                }
                return arrayList;
            }
        }
        return arrayList;
    }

    private com.qumeng.overseas.advlib.trdparty.unionset.network.a a(ConcurrentHashMap<String, ArrayList<com.qumeng.overseas.advlib.trdparty.unionset.network.a>> concurrentHashMap, String str, String str2, String str3, boolean z, boolean z2) {
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        ArrayList<com.qumeng.overseas.advlib.trdparty.unionset.network.a> arrayList = concurrentHashMap.get(str2);
        if (com.qumeng.overseas.advlib.trdparty.unionset.utils.b.a((Collection<?>) arrayList)) {
            return null;
        }
        try {
            long currentTimeMillis = System.currentTimeMillis();
            synchronized (arrayList) {
                Iterator<com.qumeng.overseas.advlib.trdparty.unionset.network.a> it = arrayList.iterator();
                com.qumeng.overseas.advlib.trdparty.unionset.network.a aVar = null;
                while (it.hasNext()) {
                    com.qumeng.overseas.advlib.trdparty.unionset.network.a next = it.next();
                    if (a(currentTimeMillis, next)) {
                        it.remove();
                    } else {
                        if (z2) {
                            it.remove();
                        }
                        aVar = next;
                    }
                    if (aVar != null) {
                        break;
                    }
                }
                if (aVar == null) {
                    return null;
                }
                aVar.e(str3);
                n.a(e, "[" + str + "] Poll: Consumed Winner ( ecpm=" + aVar.n() + ") , SearchId: " + aVar.v() + " , NetWorkName: " + aVar.d() + " , isRemove: " + z2 + ", cache size: " + arrayList.size(), new Object[0]);
                if (z && com.qumeng.overseas.advlib.trdparty.unionset.utils.b.b((Collection<?>) arrayList) && z2) {
                    Iterator<com.qumeng.overseas.advlib.trdparty.unionset.network.a> it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        com.qumeng.overseas.advlib.trdparty.unionset.network.a next2 = it2.next();
                        next2.y();
                        n.a(e, "[" + str + "] Poll: Unselected ad increment fail: " + next2.d() + ", newCount=" + next2.i(), new Object[0]);
                    }
                }
                return aVar;
            }
        } catch (Exception e2) {
            n.b(e, "[" + str + "] getCachedAds exception: " + e2.getMessage(), new Object[0]);
            return null;
        }
    }

    private int b() {
        return com.qumeng.overseas.advlib.__remote__.framework.config.a.k().w();
    }

    public com.qumeng.overseas.advlib.trdparty.unionset.network.a a(String str, String str2, boolean z) {
        if (!com.qumeng.overseas.advlib.trdparty.unionset.utils.b.b(str) || !com.qumeng.overseas.advlib.trdparty.unionset.utils.b.b(str2)) {
            return null;
        }
        com.qumeng.overseas.advlib.trdparty.unionset.network.a b2 = a().b(str, str2);
        if (b2 == null) {
            b2 = a().b(str, str2, z);
            if (b2 != null) {
                n.c(e, "[P1] ".concat(z ? "展示" : "待展示, 用于请求时触发回调"), new Object[0]);
            }
        } else {
            n.c(e, "[P0] ".concat(z ? "展示" : "待展示, 用于请求时触发回调"), new Object[0]);
        }
        if (b2 == null) {
            com.qumeng.overseas.advlib.trdparty.unionset.network.a c = a().c(str, str2);
            if (c != null) {
                n.c(e, "[P2] ".concat(z ? "展示" : "待展示, 用于请求时触发回调"), new Object[0]);
            }
            return c;
        }
        if (z) {
            Map<String, com.qumeng.overseas.advlib.trdparty.unionset.network.a> map = this.c.get(str);
            if (!com.qumeng.overseas.advlib.trdparty.unionset.utils.b.a((Map<?, ?>) map)) {
                synchronized (map) {
                    map.remove(str2);
                    n.c(e, "[P2] 本次searchId请求展示的是P0或者P1, P2主动清除掉, searchId: " + str2, new Object[0]);
                }
                return b2;
            }
        }
        return b2;
    }

    public void a(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || (!a(this.f13384a, "P0", str, str2) && !a(this.c, "P2", str, str2))) {
            return;
        }
        n.a(e, "P0/P2 searchId缓存已清理: adslotID=" + str + ", searchId=" + str2, new Object[0]);
    }

    private boolean a(ConcurrentHashMap<String, Map<String, com.qumeng.overseas.advlib.trdparty.unionset.network.a>> concurrentHashMap, String str, String str2, String str3) {
        com.qumeng.overseas.advlib.trdparty.unionset.network.a remove;
        Map<String, com.qumeng.overseas.advlib.trdparty.unionset.network.a> map = concurrentHashMap.get(str2);
        if (map == null) {
            return false;
        }
        synchronized (map) {
            remove = map.remove(str3);
            if (map.isEmpty()) {
                concurrentHashMap.remove(str2, map);
            }
        }
        if (remove == null) {
            return false;
        }
        n.a(e, "[" + str + "] Remove cached ad by searchId: adslotID=" + str2 + ", searchId=" + str3 + ", adID=" + remove.a(), new Object[0]);
        return true;
    }

    private void a(ConcurrentHashMap<String, ArrayList<com.qumeng.overseas.advlib.trdparty.unionset.network.a>> concurrentHashMap, String str, long j) {
        ArrayList<com.qumeng.overseas.advlib.trdparty.unionset.network.a> arrayList = concurrentHashMap.get(str);
        if (com.qumeng.overseas.advlib.trdparty.unionset.utils.b.a((Collection<?>) arrayList)) {
            return;
        }
        synchronized (arrayList) {
            a(arrayList, j);
        }
    }

    private void a(ArrayList<com.qumeng.overseas.advlib.trdparty.unionset.network.a> arrayList, long j) {
        Iterator<com.qumeng.overseas.advlib.trdparty.unionset.network.a> it = arrayList.iterator();
        boolean z = false;
        while (it.hasNext()) {
            com.qumeng.overseas.advlib.trdparty.unionset.network.a next = it.next();
            boolean z2 = next.i() >= 3;
            boolean a2 = a(j, next);
            if (a2 || z2) {
                it.remove();
                if (n.a()) {
                    n.a(e, "doCleanup removed: expired=" + a2 + ", failCount=" + next.i() + ", searchId=" + next.v() + ", NetWorkName=" + next.d(), new Object[0]);
                }
                z = true;
            }
        }
        if (n.a()) {
            if (z) {
                n.a(e, "doCleanup finished, remain size=" + arrayList.size(), new Object[0]);
            } else {
                n.a(e, "暂未发现满足清理条件的广告", new Object[0]);
            }
        }
    }

    public void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f13384a.remove(str);
        a(this.b, str);
        this.c.remove(str);
    }

    private void a(ConcurrentHashMap<String, ArrayList<com.qumeng.overseas.advlib.trdparty.unionset.network.a>> concurrentHashMap, String str) {
        ArrayList<com.qumeng.overseas.advlib.trdparty.unionset.network.a> arrayList = concurrentHashMap.get(str);
        if (com.qumeng.overseas.advlib.trdparty.unionset.utils.b.a((Collection<?>) arrayList)) {
            return;
        }
        synchronized (arrayList) {
            if (concurrentHashMap.remove(str, arrayList)) {
                arrayList.clear();
            }
        }
    }

    private boolean a(long j, com.qumeng.overseas.advlib.trdparty.unionset.network.a aVar) {
        if (this.d <= 0) {
            this.d = 50;
        }
        return j - aVar.j() > ((long) (this.d * 60)) * 1000;
    }
}
