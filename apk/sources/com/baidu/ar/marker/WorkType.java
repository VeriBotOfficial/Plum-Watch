package com.baidu.ar.marker;

/* JADX INFO: loaded from: classes16.dex */
public enum WorkType {
    WORK_LOCALIZATION(2),
    WORK_NAVIGATION(3);

    private int value;

    WorkType(int r3) {
        this.value = r3;
    }

    public int getValue() {
        return this.value;
    }
}
