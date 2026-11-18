package com.autonavi.base.ae.gmap;

/* JADX INFO: loaded from: classes16.dex */
public class GLEngineIDController {
    private static final String TAG = "GLEngineIDController";
    private static GLEngineIDController sController = new GLEngineIDController();
    private int engineIDIndex = 10000;

    private GLEngineIDController() {
    }

    public static GLEngineIDController getController() {
        return sController;
    }

    public synchronized int generate() {
        int r0;
        r0 = this.engineIDIndex + 1;
        this.engineIDIndex = r0;
        return r0;
    }
}
