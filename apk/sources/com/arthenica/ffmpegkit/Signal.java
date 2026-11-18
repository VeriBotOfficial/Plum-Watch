package com.arthenica.ffmpegkit;

/* JADX INFO: loaded from: classes16.dex */
public enum Signal {
    SIGINT(2),
    SIGQUIT(3),
    SIGPIPE(13),
    SIGTERM(15),
    SIGXCPU(24);

    private final int value;

    Signal(int r3) {
        this.value = r3;
    }

    public int getValue() {
        return this.value;
    }
}
