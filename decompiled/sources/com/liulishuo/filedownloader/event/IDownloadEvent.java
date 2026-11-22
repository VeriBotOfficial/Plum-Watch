package com.liulishuo.filedownloader.event;

import com.liulishuo.filedownloader.util.FileDownloadLog;

/* loaded from: classes17.dex */
public abstract class IDownloadEvent {
    public Runnable callback = null;

    /* renamed from: id, reason: collision with root package name */
    protected final String f11239id;

    public IDownloadEvent(String str) {
        this.f11239id = str;
    }

    public IDownloadEvent(String str, boolean z) {
        this.f11239id = str;
        if (z) {
            FileDownloadLog.w(this, "do not handle ORDER any more, %s", str);
        }
    }

    public final String getId() {
        return this.f11239id;
    }
}
