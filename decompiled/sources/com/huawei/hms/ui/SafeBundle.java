package com.huawei.hms.ui;

import android.os.Bundle;
import com.huawei.hms.base.ui.LogUtil;

/* loaded from: classes14.dex */
public class SafeBundle {

    /* renamed from: a, reason: collision with root package name */
    private final Bundle f10751a;

    public SafeBundle() {
        this(new Bundle());
    }

    public boolean containsKey(String str) {
        try {
            return this.f10751a.containsKey(str);
        } catch (Exception unused) {
            LogUtil.e("SafeBundle", "containsKey exception. key:");
            return false;
        }
    }

    public Object get(String str) {
        try {
            return this.f10751a.get(str);
        } catch (Exception e) {
            LogUtil.e("SafeBundle", "get exception: " + e.getMessage(), true);
            return null;
        }
    }

    public Bundle getBundle() {
        return this.f10751a;
    }

    public int getInt(String str) {
        return getInt(str, 0);
    }

    public String getString(String str) {
        try {
            return this.f10751a.getString(str);
        } catch (Exception e) {
            LogUtil.e("SafeBundle", "getString exception: " + e.getMessage(), true);
            return "";
        }
    }

    public boolean isEmpty() {
        try {
            return this.f10751a.isEmpty();
        } catch (Exception unused) {
            LogUtil.e("SafeBundle", "isEmpty exception");
            return true;
        }
    }

    public int size() {
        try {
            return this.f10751a.size();
        } catch (Exception unused) {
            LogUtil.e("SafeBundle", "size exception");
            return 0;
        }
    }

    public String toString() {
        return this.f10751a.toString();
    }

    public SafeBundle(Bundle bundle) {
        this.f10751a = bundle == null ? new Bundle() : bundle;
    }

    public int getInt(String str, int i) {
        try {
            return this.f10751a.getInt(str, i);
        } catch (Exception e) {
            LogUtil.e("SafeBundle", "getInt exception: " + e.getMessage(), true);
            return i;
        }
    }

    public String getString(String str, String str2) {
        try {
            return this.f10751a.getString(str, str2);
        } catch (Exception e) {
            LogUtil.e("SafeBundle", "getString exception: " + e.getMessage(), true);
            return str2;
        }
    }
}
