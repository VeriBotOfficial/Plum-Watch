package com.sifli.watchfacelibrary;

import java.util.Comparator;

/* loaded from: classes17.dex */
public class WatchfaceFileComparator implements Comparator<WatchfaceFile> {
    private static final String EXTENSION_GIF = "gif";

    @Override // java.util.Comparator
    public int compare(WatchfaceFile watchfaceFile, WatchfaceFile watchfaceFile2) {
        int compare;
        if (watchfaceFile.getFileExtension().equals("gif") && watchfaceFile2.getFileExtension().equals("gif")) {
            if (watchfaceFile.getFileData().length == watchfaceFile2.getFileData().length) {
                compare = watchfaceFile.getFilePath().compareTo(watchfaceFile2.getFilePath());
            } else {
                compare = Integer.compare(watchfaceFile.getFileData().length, watchfaceFile2.getFileData().length);
            }
        } else {
            if (watchfaceFile.getFileExtension().equals("gif")) {
                return 1;
            }
            if (watchfaceFile2.getFileExtension().equals("gif")) {
                return -1;
            }
            if (watchfaceFile.getFileData().length == watchfaceFile2.getFileData().length) {
                compare = watchfaceFile.getFilePath().compareTo(watchfaceFile2.getFilePath());
            } else {
                compare = Integer.compare(watchfaceFile.getFileData().length, watchfaceFile2.getFileData().length);
            }
        }
        return compare * (-1);
    }
}
