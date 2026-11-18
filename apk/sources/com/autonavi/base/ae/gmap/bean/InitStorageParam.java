package com.autonavi.base.ae.gmap.bean;

import java.io.File;

/* JADX INFO: loaded from: classes16.dex */
public class InitStorageParam {
    private static final String DIR_NAME = "terrain_dem_files";
    private static final String INIT_STORAGE_DIR = "mapcache";
    private int maxFileCount;
    private long maxFileSize;
    private String path;
    private int version;

    public static class Holder {
        private static String sPath;

        public static void initPath(String str) {
            File file = new File(str);
            File file2 = new File(file, InitStorageParam.INIT_STORAGE_DIR);
            if (file.isDirectory()) {
                if (!file2.exists()) {
                    file2.mkdir();
                }
                File file3 = new File(file2, InitStorageParam.DIR_NAME);
                if (!file3.exists()) {
                    file3.mkdir();
                }
                sPath = file3.getAbsolutePath();
            }
        }
    }

    private InitStorageParam(int r1, String str, int r3, long j) {
        this.version = r1;
        this.path = str;
        this.maxFileCount = r3;
        this.maxFileSize = j;
    }

    public static InitStorageParam obtain() {
        return new InitStorageParam();
    }

    public int getMaxFileCount() {
        return this.maxFileCount;
    }

    public long getMaxFileSize() {
        return this.maxFileSize;
    }

    public String getPath() {
        return this.path;
    }

    public int getVersion() {
        return this.version;
    }

    public void setMaxFileCount(int r1) {
        this.maxFileCount = r1;
    }

    public void setMaxFileSize(long j) {
        this.maxFileSize = j;
    }

    public void setPath(String str) {
        this.path = str;
    }

    public void setVersion(int r1) {
        this.version = r1;
    }

    public String toString() {
        return "InitStorageParam{version=" + this.version + ", maxFileCount=" + this.maxFileCount + ", maxFileSize=" + this.maxFileSize + ", path='" + this.path + "'}";
    }

    public static InitStorageParam obtain(int r7, String str, int r9, long j) {
        return new InitStorageParam(r7, str, r9, j);
    }

    private InitStorageParam() {
        this(1, Holder.sPath, 1000, 300000L);
    }
}
