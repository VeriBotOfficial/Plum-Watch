package com.efs.sdk.base.core.config;

import android.content.Context;
import android.os.Message;
import android.util.Pair;
import android.webkit.ValueCallback;
import com.efs.sdk.base.observer.IEfsReporterObserver;
import com.efs.sdk.base.processor.action.ILogEncryptAction;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes14.dex */
public class GlobalEnvStruct {

    /* renamed from: a, reason: collision with root package name */
    private String f9615a;
    private String b;
    private String i;
    public Context mAppContext;

    /* renamed from: q, reason: collision with root package name */
    private ILogEncryptAction f9616q;
    private boolean c = true;
    private boolean d = false;
    private boolean e = true;
    private boolean f = false;
    private Boolean g = null;
    private boolean h = false;
    private String j = "";
    private String k = "";
    private boolean l = false;
    private boolean m = false;
    public long configRefreshDelayMills = 5000;
    private long n = 10000;
    private long o = 10000;
    private Map<String, String> p = new HashMap(5);
    private ConcurrentHashMap<Integer, List<ValueCallback<Pair<Message, Message>>>> r = new ConcurrentHashMap<>();
    private List<IEfsReporterObserver> s = new ArrayList(5);

    public String getAppid() {
        return this.f9615a;
    }

    public void setAppid(String str) {
        this.f9615a = str;
    }

    public String getSecret() {
        return this.b;
    }

    public void setSecret(String str) {
        this.b = str;
    }

    public String getUid() {
        return this.i;
    }

    public void setUid(String str) {
        this.i = str;
    }

    public String getLogUid() {
        return this.j;
    }

    public void setLogUid(String str) {
        this.j = str;
    }

    public String getLogDid() {
        return this.k;
    }

    public void setLogDid(String str) {
        this.k = str;
    }

    public boolean isOpenCodeLog() {
        return this.l;
    }

    public void setOpenCodeLog(boolean z) {
        this.l = z;
    }

    public long getLogSendDelayMills() {
        return this.n;
    }

    public long getLogSendIntervalMills() {
        return this.o;
    }

    public Map<String, String> getPublicParamMap() {
        Map<String, String> map = this.p;
        return map == null ? Collections.emptyMap() : map;
    }

    public void addPublicParams(Map<String, String> map) {
        if (map == null || map.size() <= 0) {
            return;
        }
        HashMap hashMap = new HashMap(this.p);
        hashMap.putAll(map);
        this.p = hashMap;
    }

    public ILogEncryptAction getLogEncryptAction() {
        return this.f9616q;
    }

    public void setLogEncryptAction(ILogEncryptAction iLogEncryptAction) {
        this.f9616q = iLogEncryptAction;
    }

    public boolean isIntl() {
        return this.m;
    }

    public void setIsIntl(boolean z) {
        this.m = z;
    }

    public boolean isEnableWaStat() {
        return this.c;
    }

    public void setEnableWaStat(boolean z) {
        this.c = z;
    }

    public boolean isEnablePaBackup() {
        return this.d;
    }

    public void setEnablePaBackup(boolean z) {
        this.d = z;
    }

    public boolean isEnableSendLog() {
        return this.e;
    }

    public void setEnableSendLog(boolean z) {
        this.e = z;
    }

    public boolean isDebug() {
        return this.f;
    }

    public void setDebug(boolean z) {
        this.f = z;
    }

    public boolean isPrintLogDetail() {
        return this.h;
    }

    public void setPrintLogDetail(boolean z) {
        this.h = z;
    }

    public void registerCallback(int i, ValueCallback<Pair<Message, Message>> valueCallback) {
        if (valueCallback == null) {
            return;
        }
        List<ValueCallback<Pair<Message, Message>>> list = this.r.get(Integer.valueOf(i));
        if (list == null) {
            list = new LinkedList<>();
            this.r.putIfAbsent(Integer.valueOf(i), list);
        }
        list.add(valueCallback);
    }

    public List<ValueCallback<Pair<Message, Message>>> getCallback(int i) {
        if (!this.r.containsKey(Integer.valueOf(i)) || this.r.get(Integer.valueOf(i)) == null) {
            return Collections.emptyList();
        }
        return this.r.get(Integer.valueOf(i));
    }

    public void addConfigObserver(IEfsReporterObserver iEfsReporterObserver) {
        if (this.s.contains(iEfsReporterObserver)) {
            return;
        }
        this.s.add(iEfsReporterObserver);
    }

    public List<IEfsReporterObserver> getEfsReporterObservers() {
        return this.s;
    }
}
