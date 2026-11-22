package com.sifli.watchfacesdk.modules.pushfile;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes17.dex */
public class SFPushInfos implements ISFPushInfos {
    private long completedBytes = 0;
    private ArrayList<SFFile> files;
    private int maxFileSliceLength;
    private long totalBytes;
    private int type;

    public SFPushInfos(int i, ArrayList<SFFile> arrayList, int i2) {
        this.type = i;
        this.files = arrayList;
        this.maxFileSliceLength = i2;
        computeTotalBytes();
    }

    public String briefDes() {
        StringBuilder sb = new StringBuilder();
        Iterator<SFFile> it = this.files.iterator();
        while (it.hasNext()) {
            sb.append(it.next().briefDes());
        }
        return String.format("SFPushInfo : type=%d,maxFileSliceLength=%d,files=%s", Integer.valueOf(this.type), Integer.valueOf(this.maxFileSliceLength), sb.toString());
    }

    private void computeTotalBytes() {
        Iterator<SFFile> it = this.files.iterator();
        long j = 0;
        while (it.hasNext()) {
            j += it.next().getTotalBytes();
        }
        this.totalBytes = j;
    }

    @Override // com.sifli.watchfacesdk.modules.pushfile.ISFPushInfos
    public long getTotalBytes() {
        return this.totalBytes;
    }

    public void setMaxFileSliceLength(int i) {
        this.maxFileSliceLength = i;
    }

    public int getMaxFileSliceLength() {
        return this.maxFileSliceLength;
    }

    public ArrayList<SFFile> getFiles() {
        return this.files;
    }

    public SFFile getFileAtIndex(int i) {
        ArrayList<SFFile> arrayList = this.files;
        if (arrayList != null && i >= 0 && i < arrayList.size()) {
            return this.files.get(i);
        }
        return null;
    }

    public boolean hasFile() {
        ArrayList<SFFile> arrayList = this.files;
        return arrayList != null && arrayList.size() > 0;
    }

    @Override // com.sifli.watchfacesdk.modules.pushfile.ISFPushInfos
    public long getCompletedBytes() {
        return this.completedBytes;
    }

    @Override // com.sifli.watchfacesdk.modules.pushfile.ISFPushInfos
    public void completeFile(SFFile sFFile) {
        sFFile.setSend(true);
        Iterator<SFFile> it = this.files.iterator();
        long j = 0;
        while (it.hasNext()) {
            SFFile next = it.next();
            if (next.isSend()) {
                j += next.getTotalBytes();
            }
        }
        this.completedBytes = j;
    }

    public void setCompletedBytes(long j) {
        this.completedBytes = j;
    }

    public int getType() {
        return this.type;
    }
}
