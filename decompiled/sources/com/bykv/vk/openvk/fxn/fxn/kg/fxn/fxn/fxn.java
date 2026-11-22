package com.bykv.vk.openvk.fxn.fxn.kg.fxn.fxn;

import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes13.dex */
public class fxn implements com.bykv.vk.openvk.fxn.fxn.fxn.fxn.kg {
    private String fxn = "video_reward_full";
    private String kg = "video_brand";
    private String gff = "video_splash";
    private String hm = "video_default";
    private String rb = null;
    private String bh = null;

    /* renamed from: sg, reason: collision with root package name */
    private String f9081sg = null;
    private String tw = null;
    private String jq = null;

    @Override // com.bykv.vk.openvk.fxn.fxn.fxn.fxn.kg
    public void fxn(String str) {
        this.rb = str;
    }

    @Override // com.bykv.vk.openvk.fxn.fxn.fxn.fxn.kg
    public String gff() {
        if (this.jq == null) {
            this.jq = this.rb + File.separator + this.hm;
            File file = new File(this.jq);
            if (!file.exists()) {
                file.mkdirs();
            }
        }
        return this.jq;
    }

    @Override // com.bykv.vk.openvk.fxn.fxn.fxn.fxn.kg
    public String fxn() {
        if (this.bh == null) {
            this.bh = this.rb + File.separator + this.fxn;
            File file = new File(this.bh);
            if (!file.exists()) {
                file.mkdirs();
            }
        }
        return this.bh;
    }

    public String rb() {
        if (this.f9081sg == null) {
            this.f9081sg = this.rb + File.separator + this.kg;
            File file = new File(this.f9081sg);
            if (!file.exists()) {
                file.mkdirs();
            }
        }
        return this.f9081sg;
    }

    @Override // com.bykv.vk.openvk.fxn.fxn.fxn.fxn.kg
    public String kg() {
        if (this.tw == null) {
            this.tw = this.rb + File.separator + this.gff;
            File file = new File(this.tw);
            if (!file.exists()) {
                file.mkdirs();
            }
        }
        return this.tw;
    }

    @Override // com.bykv.vk.openvk.fxn.fxn.fxn.fxn.kg
    public synchronized void hm() {
        Set<String> set = null;
        for (com.bykv.vk.openvk.fxn.fxn.fxn.fxn.fxn fxnVar : bh()) {
            File[] fxn = fxnVar.fxn();
            if (fxn != null && fxn.length >= fxnVar.kg()) {
                if (set == null) {
                    set = sg();
                }
                int kg = fxnVar.kg() - 2;
                if (kg < 0) {
                    kg = 0;
                }
                fxn(fxnVar.fxn(), kg, set);
            }
        }
    }

    @Override // com.bykv.vk.openvk.fxn.fxn.fxn.fxn.kg
    public boolean fxn(com.bykv.vk.openvk.fxn.fxn.fxn.gff.gff gffVar) {
        if (TextUtils.isEmpty(gffVar.rb()) || TextUtils.isEmpty(gffVar.rmu())) {
            return false;
        }
        return new File(gffVar.rb(), gffVar.rmu()).exists();
    }

    @Override // com.bykv.vk.openvk.fxn.fxn.fxn.fxn.kg
    public long kg(com.bykv.vk.openvk.fxn.fxn.fxn.gff.gff gffVar) {
        if (TextUtils.isEmpty(gffVar.rb()) || TextUtils.isEmpty(gffVar.rmu())) {
            return 0L;
        }
        return com.bykv.vk.openvk.fxn.fxn.kg.hm.kg.fxn(gffVar.rb(), gffVar.rmu());
    }

    private static void fxn(File[] fileArr, int i, Set<String> set) {
        if (i >= 0 && fileArr != null) {
            try {
                if (fileArr.length > i) {
                    List asList = Arrays.asList(fileArr);
                    Collections.sort(asList, new Comparator<File>() { // from class: com.bykv.vk.openvk.fxn.fxn.kg.fxn.fxn.fxn.1
                        @Override // java.util.Comparator
                        /* renamed from: fxn, reason: merged with bridge method [inline-methods] */
                        public int compare(File file, File file2) {
                            long lastModified = file2.lastModified() - file.lastModified();
                            if (lastModified == 0) {
                                return 0;
                            }
                            return lastModified < 0 ? -1 : 1;
                        }
                    });
                    while (i < asList.size()) {
                        File file = (File) asList.get(i);
                        if (set != null && !set.contains(file.getAbsolutePath())) {
                            ((File) asList.get(i)).delete();
                        }
                        i++;
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    private List<com.bykv.vk.openvk.fxn.fxn.fxn.fxn.fxn> bh() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new com.bykv.vk.openvk.fxn.fxn.fxn.fxn.fxn(new File(fxn()).listFiles(), com.bykv.vk.openvk.fxn.fxn.kg.fxn.gff()));
        arrayList.add(new com.bykv.vk.openvk.fxn.fxn.fxn.fxn.fxn(new File(kg()).listFiles(), com.bykv.vk.openvk.fxn.fxn.kg.fxn.kg()));
        arrayList.add(new com.bykv.vk.openvk.fxn.fxn.fxn.fxn.fxn(new File(rb()).listFiles(), com.bykv.vk.openvk.fxn.fxn.kg.fxn.hm()));
        arrayList.add(new com.bykv.vk.openvk.fxn.fxn.fxn.fxn.fxn(new File(gff()).listFiles(), com.bykv.vk.openvk.fxn.fxn.kg.fxn.rb()));
        return arrayList;
    }

    private Set<String> sg() {
        HashSet hashSet = new HashSet();
        for (com.bykv.vk.openvk.fxn.fxn.kg.fxn.fxn fxnVar : com.bykv.vk.openvk.fxn.fxn.kg.fxn.fxn.fxn.values()) {
            if (fxnVar != null && fxnVar.fxn() != null) {
                com.bykv.vk.openvk.fxn.fxn.fxn.gff.gff fxn = fxnVar.fxn();
                hashSet.add(com.bykv.vk.openvk.fxn.fxn.kg.hm.kg.kg(fxn.rb(), fxn.rmu()).getAbsolutePath());
                hashSet.add(com.bykv.vk.openvk.fxn.fxn.kg.hm.kg.gff(fxn.rb(), fxn.rmu()).getAbsolutePath());
            }
        }
        for (com.bykv.vk.openvk.fxn.fxn.kg.fxn.kg.kg kgVar : com.bykv.vk.openvk.fxn.fxn.kg.fxn.kg.gff.fxn.values()) {
            if (kgVar != null && kgVar.fxn() != null) {
                com.bykv.vk.openvk.fxn.fxn.fxn.gff.gff fxn2 = kgVar.fxn();
                hashSet.add(com.bykv.vk.openvk.fxn.fxn.kg.hm.kg.kg(fxn2.rb(), fxn2.rmu()).getAbsolutePath());
                hashSet.add(com.bykv.vk.openvk.fxn.fxn.kg.hm.kg.gff(fxn2.rb(), fxn2.rmu()).getAbsolutePath());
            }
        }
        return hashSet;
    }
}
