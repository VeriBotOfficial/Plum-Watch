package com.qumeng.overseas.advlib.__remote__.ui.banner.json2view.view.utils;

import android.text.TextUtils;
import android.view.View;
import com.qumeng.overseas.advlib.__remote__.ui.banner.json2view.view.view.IView;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes17.dex */
public class e {
    private static final AtomicInteger b = new AtomicInteger(1711734784);
    public static volatile e c;

    /* renamed from: a, reason: collision with root package name */
    public Map<String, Integer> f13061a = new HashMap();

    public static View a(String str, IView iView) {
        View a2;
        if (iView == null) {
            return null;
        }
        for (int i = 0; i < iView.getChild().size(); i++) {
            String id2 = iView.getChild().get(i).getId();
            if (!TextUtils.isEmpty(id2) && id2.equals(str)) {
                return iView.getChild().get(i).getView();
            }
            IView iView2 = iView.getChild().get(i);
            if (iView2.getChild() != null && iView2.getChild().size() > 0 && (a2 = a(str, iView2)) != null) {
                return a2;
            }
        }
        return null;
    }

    public static e b() {
        if (c == null) {
            synchronized (e.class) {
                if (c == null) {
                    c = new e();
                }
            }
        }
        return c;
    }

    private void d(IView iView) {
        e(iView);
    }

    public void c(IView iView) {
        if (!TextUtils.isEmpty(iView.getId())) {
            d(iView);
        }
        if (iView.getChild() != null) {
            for (int i = 0; i < iView.getChild().size(); i++) {
                c(iView.getChild().get(i));
            }
        }
    }

    public synchronized void e(IView iView) {
        int generateViewId;
        String id2 = iView.getId();
        if (TextUtils.isEmpty(id2)) {
            return;
        }
        if (this.f13061a.containsKey(id2) && this.f13061a.get(id2).intValue() != 0) {
            iView.setIntId(this.f13061a.get(id2).intValue());
            return;
        }
        do {
            generateViewId = View.generateViewId();
        } while (generateViewId == 15);
        iView.setIntId(generateViewId);
        this.f13061a.put(id2, Integer.valueOf(generateViewId));
    }

    public static View b(IView iView) {
        IView parent = iView.getParent();
        if (parent == null) {
            return null;
        }
        if (!TextUtils.isEmpty(parent.getId()) && parent.getId().equals("rootview")) {
            return parent.getView();
        }
        return b(parent);
    }

    public static IView a(IView iView) {
        IView parent = iView.getParent();
        if (parent == null) {
            return null;
        }
        return (TextUtils.isEmpty(parent.getId()) || !parent.getId().equals("rootview")) ? a(parent) : parent;
    }

    public int a() {
        AtomicInteger atomicInteger;
        int i;
        int i2;
        do {
            atomicInteger = b;
            i = atomicInteger.get();
            i2 = i + 1;
            if (i2 > 16777215) {
                i2 = 1;
            }
        } while (!atomicInteger.compareAndSet(i, i2));
        return i;
    }

    public int a(String str) {
        String replace = str.replace("@+id/", "").replace("@+id\\/", "");
        if (!this.f13061a.containsKey(replace) || this.f13061a.get(replace) == null) {
            return 0;
        }
        return this.f13061a.get(replace).intValue();
    }
}
