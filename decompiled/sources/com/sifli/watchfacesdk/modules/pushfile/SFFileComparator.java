package com.sifli.watchfacesdk.modules.pushfile;

import java.util.Comparator;

/* loaded from: classes17.dex */
public class SFFileComparator implements Comparator<SFFile> {
    @Override // java.util.Comparator
    public int compare(SFFile sFFile, SFFile sFFile2) {
        return Long.compare(Long.valueOf(sFFile2.getTotalBytes()).longValue(), Long.valueOf(sFFile.getTotalBytes()).longValue());
    }
}
