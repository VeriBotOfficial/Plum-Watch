package androidx.profileinstaller;

import java.util.TreeMap;

/* JADX INFO: loaded from: classes7.dex */
class DexProfileData {
    final String apkName;
    int classSetSize;
    int[] classes;
    final long dexChecksum;
    final String dexName;
    final int hotMethodRegionSize;
    long mTypeIdCount;
    final TreeMap<Integer, Integer> methods;
    final int numMethodIds;

    DexProfileData(String str, String str2, long j, long j2, int r7, int r8, int r9, int[] r10, TreeMap<Integer, Integer> treeMap) {
        this.apkName = str;
        this.dexName = str2;
        this.dexChecksum = j;
        this.mTypeIdCount = j2;
        this.classSetSize = r7;
        this.hotMethodRegionSize = r8;
        this.numMethodIds = r9;
        this.classes = r10;
        this.methods = treeMap;
    }
}
