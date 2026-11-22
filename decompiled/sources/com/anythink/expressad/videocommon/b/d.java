package com.anythink.expressad.videocommon.b;

import android.text.TextUtils;
import com.anythink.expressad.videocommon.b.i;
import java.util.Iterator;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes12.dex */
public final class d implements i.c {

    /* renamed from: a, reason: collision with root package name */
    private static String f5515a = "DownLoadH5SourceListener";
    private ConcurrentMap<String, d> b;
    private n c;
    private CopyOnWriteArrayList<i.d> d;
    private String e;
    private String f;

    @Override // com.anythink.expressad.videocommon.b.i.c
    public final void a() {
    }

    public d(ConcurrentMap<String, d> concurrentMap, n nVar, i.d dVar, String str, String str2) {
        CopyOnWriteArrayList<i.d> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        this.d = copyOnWriteArrayList;
        this.b = concurrentMap;
        this.c = nVar;
        copyOnWriteArrayList.add(dVar);
        this.e = str;
        this.f = str2;
    }

    public final void a(i.d dVar) {
        this.d.add(dVar);
    }

    @Override // com.anythink.expressad.videocommon.b.i.c
    public final void a(String str, String str2) {
        String str3;
        ConcurrentMap<String, d> concurrentMap;
        try {
            concurrentMap = this.b;
        } catch (Exception e) {
            if (com.anythink.expressad.a.f4564a) {
                e.printStackTrace();
            }
            try {
                str3 = e.getMessage();
            } catch (Throwable th) {
                th.getMessage();
                str3 = "";
            }
        }
        if (concurrentMap == null) {
            Iterator<i.d> it = this.d.iterator();
            while (it.hasNext()) {
                i.d next = it.next();
                if (next != null) {
                    next.a(str2, "mResDownloadingMap  is null");
                    this.d.remove(next);
                }
            }
            return;
        }
        if (concurrentMap.containsKey(this.f)) {
            this.b.remove(this.f);
        }
        if (!TextUtils.isEmpty(str)) {
            String a2 = this.c.a(str2, str);
            if (TextUtils.isEmpty(a2)) {
                Iterator<i.d> it2 = this.d.iterator();
                while (it2.hasNext()) {
                    i.d next2 = it2.next();
                    if (next2 != null) {
                        next2.a(str2);
                        this.d.remove(next2);
                    }
                }
                return;
            }
            str3 = "data save failed:".concat(String.valueOf(a2));
        } else {
            str3 = "response data is error";
        }
        Iterator<i.d> it3 = this.d.iterator();
        while (it3.hasNext()) {
            i.d next3 = it3.next();
            if (next3 != null) {
                next3.a(str2, str3);
            }
        }
    }

    @Override // com.anythink.expressad.videocommon.b.i.c
    public final void a(String str) {
        ConcurrentMap<String, d> concurrentMap;
        try {
            concurrentMap = this.b;
        } catch (Exception e) {
            if (com.anythink.expressad.a.f4564a) {
                e.printStackTrace();
            }
            try {
                str = e.getMessage();
            } catch (Throwable th) {
                th.getMessage();
            }
        }
        if (concurrentMap == null) {
            Iterator<i.d> it = this.d.iterator();
            while (it.hasNext()) {
                i.d next = it.next();
                if (next != null) {
                    next.a(this.e, "mResDownloadingMap  is null");
                    this.d.remove(next);
                }
            }
            return;
        }
        if (concurrentMap.containsKey(this.f)) {
            this.b.remove(this.f);
        }
        Iterator<i.d> it2 = this.d.iterator();
        while (it2.hasNext()) {
            i.d next2 = it2.next();
            if (next2 != null) {
                next2.a(this.e, str);
                this.d.remove(next2);
            }
        }
    }
}
