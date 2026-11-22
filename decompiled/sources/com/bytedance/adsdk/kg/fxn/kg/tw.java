package com.bytedance.adsdk.kg.fxn.kg;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes13.dex */
public class tw {
    private final List<fxn<com.bytedance.adsdk.kg.gff.kg.zu, Path>> fxn;
    private final List<com.bytedance.adsdk.kg.gff.kg.tw> gff;
    private final List<fxn<Integer, Integer>> kg;

    public tw(List<com.bytedance.adsdk.kg.gff.kg.tw> list) {
        this.gff = list;
        this.fxn = new ArrayList(list.size());
        this.kg = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            this.fxn.add(list.get(i).kg().fxn());
            this.kg.add(list.get(i).gff().fxn());
        }
    }

    public List<com.bytedance.adsdk.kg.gff.kg.tw> fxn() {
        return this.gff;
    }

    public List<fxn<com.bytedance.adsdk.kg.gff.kg.zu, Path>> kg() {
        return this.fxn;
    }

    public List<fxn<Integer, Integer>> gff() {
        return this.kg;
    }
}
