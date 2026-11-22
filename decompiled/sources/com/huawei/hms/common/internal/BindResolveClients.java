package com.huawei.hms.common.internal;

import java.util.ArrayList;
import java.util.ListIterator;

/* loaded from: classes14.dex */
public class BindResolveClients {
    private static final Object b = new Object();

    /* renamed from: a, reason: collision with root package name */
    private ArrayList<ResolveClientBean> f10299a;

    private static class b {

        /* renamed from: a, reason: collision with root package name */
        private static final BindResolveClients f10300a = new BindResolveClients();
    }

    public static BindResolveClients getInstance() {
        return b.f10300a;
    }

    public boolean isClientRegistered(ResolveClientBean resolveClientBean) {
        boolean contains;
        synchronized (b) {
            contains = this.f10299a.contains(resolveClientBean);
        }
        return contains;
    }

    public void notifyClientReconnect() {
        synchronized (b) {
            ListIterator<ResolveClientBean> listIterator = this.f10299a.listIterator();
            while (listIterator.hasNext()) {
                listIterator.next().clientReconnect();
            }
            this.f10299a.clear();
        }
    }

    public void register(ResolveClientBean resolveClientBean) {
        if (resolveClientBean == null) {
            return;
        }
        synchronized (b) {
            if (!this.f10299a.contains(resolveClientBean)) {
                this.f10299a.add(resolveClientBean);
            }
        }
    }

    public void unRegister(ResolveClientBean resolveClientBean) {
        if (resolveClientBean == null) {
            return;
        }
        synchronized (b) {
            if (this.f10299a.contains(resolveClientBean)) {
                ListIterator<ResolveClientBean> listIterator = this.f10299a.listIterator();
                while (true) {
                    if (!listIterator.hasNext()) {
                        break;
                    } else if (resolveClientBean.equals(listIterator.next())) {
                        listIterator.remove();
                        break;
                    }
                }
            }
        }
    }

    public void unRegisterAll() {
        synchronized (b) {
            this.f10299a.clear();
        }
    }

    private BindResolveClients() {
        this.f10299a = new ArrayList<>();
    }
}
