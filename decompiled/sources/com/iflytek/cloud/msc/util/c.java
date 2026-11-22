package com.iflytek.cloud.msc.util;

import java.util.HashMap;
import java.util.concurrent.ConcurrentLinkedQueue;

/* loaded from: classes17.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private HashMap<String, ConcurrentLinkedQueue<byte[]>> f11186a = new HashMap<>();

    public void a(String str, byte[] bArr) {
        if (this.f11186a.containsKey(str)) {
            this.f11186a.get(str).add(bArr);
            return;
        }
        ConcurrentLinkedQueue<byte[]> concurrentLinkedQueue = new ConcurrentLinkedQueue<>();
        concurrentLinkedQueue.add(bArr);
        this.f11186a.put(str, concurrentLinkedQueue);
    }

    public void a() {
        for (String str : this.f11186a.keySet()) {
            FileUtil.saveFile(this.f11186a.get(str), str);
        }
    }
}
