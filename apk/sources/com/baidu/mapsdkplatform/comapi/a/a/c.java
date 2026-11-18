package com.baidu.mapsdkplatform.comapi.a.a;

import java.io.File;
import java.util.Comparator;

/* JADX INFO: compiled from: SortClassByTime.java */
/* JADX INFO: loaded from: classes15.dex */
public class c implements Comparator {
    @Override // java.util.Comparator
    public int compare(Object obj, Object obj2) {
        try {
            return ((File) obj2).getName().split("_")[2].compareTo(((File) obj).getName().split("_")[2]);
        } catch (Exception unused) {
            return 0;
        }
    }
}
