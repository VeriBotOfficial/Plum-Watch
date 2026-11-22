package com.qumeng.overseas.advlib.__remote__.core.proto.universe;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import com.qumeng.overseas.advlib.__remote__.core.proto.utils.d;
import com.qumeng.overseas.advlib.__remote__.framework.imageloader.l;
import com.qumeng.overseas.advlib.__remote__.utils.JSONBeanFrm;
import com.qumeng.overseas.advlib.__remote__.utils.bugman.a;
import com.qumeng.overseas.advlib.__remote__.utils.network.c;
import com.qumeng.overseas.advlib.core.ICliBundle;
import com.qumeng.overseas.advlib.core.m;
import com.umeng.analytics.pro.ak;
import java.io.Serializable;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes17.dex */
public abstract class MaterialImpl extends JSONBeanFrm implements m {
    private static final Handler sHandler = new Handler(Looper.getMainLooper());
    private Map<String, Serializable> __stash = new HashMap();
    private Map<String, String> __headerMap = Collections.EMPTY_MAP;

    public enum MonitorType {
        onShow,
        onClick,
        onWin
    }

    public void AsyncRcvReport(Context context, String str, String... strArr) {
        HashMap hashMap = new HashMap();
        hashMap.put(ak.aH, str);
        if (!d.a((Object[]) strArr)) {
            for (int i = 0; i < strArr.length; i++) {
                String str2 = strArr[i];
                if (!TextUtils.isEmpty(str2)) {
                    hashMap.put("op" + (i + 1), str2);
                }
            }
        }
        c.a(context, this, str, hashMap);
    }

    public void addHeader(String str, String str2) {
        if (this.__headerMap == Collections.EMPTY_MAP) {
            this.__headerMap = new HashMap();
        }
        this.__headerMap.put(str, str2);
    }

    public abstract void doClick(View view);

    public String getClickUrl() {
        return getMaterial().getClickUrl();
    }

    public final ICliBundle getFalseICliBundle() {
        ICliBundle iCliBundle = new ICliBundle();
        iCliBundle.tbundle.putSerializable("datamodel", this);
        return iCliBundle;
    }

    @Override // com.qumeng.overseas.advlib.core.m
    public Map<String, String> getGlobalRcvHeader() {
        return this.__headerMap;
    }

    public int getIdeaId() {
        return ((Integer) getStash("idea_id", 0)).intValue();
    }

    public m getMaterial() {
        return DumbMaterial.getInstance();
    }

    public String getSDKSearchID() {
        Serializable stash = getStash("sdk_searchId", "");
        return stash instanceof String ? (String) stash : String.valueOf(stash);
    }

    public String getSearchID() {
        Serializable stash = getStash("searchid", "");
        return stash instanceof String ? (String) stash : String.valueOf(stash);
    }

    public <T extends Serializable> T getStash(String str) {
        try {
            return (T) this.__stash.get(str);
        } catch (ClassCastException unused) {
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            a.a(this, "exp_MaterialImpl_getStash", String.valueOf(e.getMessage()), e);
            return null;
        }
    }

    public abstract void onClickedReport();

    public abstract void onClickedReportWithPosition(Map<String, Integer> map);

    public abstract void onDpClickedReport();

    public abstract void onPlayingStateChanged(int i, long j);

    public abstract void onScaleShowedReportURL(int i);

    public abstract void onShowedReport();

    public void performImageDownload() {
        List<String> bmpUrlList = getBmpUrlList();
        if (d.a((Collection<? extends Object>) bmpUrlList)) {
            return;
        }
        Iterator<String> it = bmpUrlList.iterator();
        while (it.hasNext()) {
            l.c().preload(it.next());
        }
    }

    @Override // com.qumeng.overseas.advlib.core.m
    public final void post(Runnable runnable, long j) {
        sHandler.postDelayed(runnable, j);
    }

    public void putAllStash(Map<String, ? extends Serializable> map) {
        this.__stash.putAll(map);
    }

    @Override // com.qumeng.overseas.advlib.core.m
    public <T extends Serializable> void putStash(String str, T t) {
        this.__stash.put(str, t);
    }

    @Override // com.qumeng.overseas.advlib.core.m
    public void setGlobalRcvHeader(Map<String, String> map) {
        if (d.a((Map<? extends Object, ? extends Object>) map)) {
            return;
        }
        Map<String, String> map2 = this.__headerMap;
        if (map2 == Collections.EMPTY_MAP) {
            this.__headerMap = map;
        } else {
            map2.putAll(map);
        }
    }

    public Serializable toBinderHappy() {
        HashMap hashMap = new HashMap();
        hashMap.put("__datamodel", marshal().toString());
        hashMap.putAll(this.__stash);
        return hashMap;
    }

    public ICliBundle toICliBundle() {
        return getFalseICliBundle();
    }

    public String getClickUrl(Map<String, Integer> map) {
        return getMaterial().getClickUrl(map);
    }

    public m getMaterial(String str) {
        return DumbMaterial.getInstance();
    }

    @Override // com.qumeng.overseas.advlib.core.m
    public final void post(Runnable runnable) {
        sHandler.post(runnable);
    }

    public <T extends Serializable> T getStash(String str, T t) {
        T t2 = (T) this.__stash.get(str);
        return (t2 == null || ((t2 instanceof String) && TextUtils.isEmpty((String) t2))) ? t : t2;
    }
}
