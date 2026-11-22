package com.tramini.plugin.api;

/* loaded from: classes2.dex */
public class TraminiConfig {
    private static TraminiInfoListener traminiInfoListener;

    public static synchronized void setTraminiInfoListener(TraminiInfoListener traminiInfoListener2) {
        synchronized (TraminiConfig.class) {
            traminiInfoListener = traminiInfoListener2;
        }
    }

    public static synchronized TraminiInfoListener getTraminiInfoListener() {
        TraminiInfoListener traminiInfoListener2;
        synchronized (TraminiConfig.class) {
            traminiInfoListener2 = traminiInfoListener;
        }
        return traminiInfoListener2;
    }
}
