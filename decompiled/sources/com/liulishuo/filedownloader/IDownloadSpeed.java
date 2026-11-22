package com.liulishuo.filedownloader;

/* loaded from: classes17.dex */
public interface IDownloadSpeed {

    public interface Lookup {
        int getSpeed();

        void setMinIntervalUpdateSpeed(int i);
    }

    public interface Monitor {
        void end(long j);

        void reset();

        void start(long j);

        void update(long j);
    }
}
