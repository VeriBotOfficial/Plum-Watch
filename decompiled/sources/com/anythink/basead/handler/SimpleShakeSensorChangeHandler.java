package com.anythink.basead.handler;

/* loaded from: classes11.dex */
public class SimpleShakeSensorChangeHandler extends BaseShakeSensorChangeHandlerImp {
    ATShackSensorListener d;
    public float lastX = 0.0f;
    public float lastY = 0.0f;
    public float lastZ = 0.0f;
    public long lastCallBackTimeMs = 0;
    private int e = 10;
    private long f = 5000;

    @Override // com.anythink.basead.handler.IShackSensorChangeHandler
    public void initSetting(ShakeSensorSetting shakeSensorSetting) {
        if (shakeSensorSetting != null) {
            this.e = shakeSensorSetting.getShakeStrength();
            this.f = shakeSensorSetting.getShakeTimeMs();
        }
    }

    @Override // com.anythink.basead.handler.IShackSensorChangeHandler
    public void setListener(ATShackSensorListener aTShackSensorListener) {
        this.d = aTShackSensorListener;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x006f, code lost:
    
        if (java.lang.Math.abs(r0 - r12) > r11.e) goto L20;
     */
    @Override // com.anythink.basead.handler.IShackSensorChangeHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean handleSensorData(android.hardware.SensorEvent r12) {
        /*
            r11 = this;
            com.anythink.basead.handler.ATShackSensorListener r0 = r11.d
            r1 = 0
            if (r0 == 0) goto L96
            float[] r0 = r12.values
            if (r0 == 0) goto L96
            float[] r0 = r12.values
            int r0 = r0.length
            r2 = 3
            if (r0 < r2) goto L96
            float[] r0 = r12.values
            r2 = r0[r1]
            float r2 = -r2
            r3 = 1
            r4 = r0[r3]
            float r4 = -r4
            r5 = 2
            r0 = r0[r5]
            float r0 = -r0
            r11.a(r12)
            int r12 = (int) r2
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            int r5 = (int) r4
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            int r6 = (int) r0
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Object[] r12 = new java.lang.Object[]{r12, r5, r6}
            java.lang.String r5 = "handleSensorData lastx:%d,lasty:%d,lastz:%d"
            java.lang.String.format(r5, r12)
            float r12 = r11.lastX
            r5 = 0
            int r6 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r6 == 0) goto L4b
            float r12 = r2 - r12
            float r12 = java.lang.Math.abs(r12)
            int r6 = r11.e
            float r6 = (float) r6
            int r12 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1))
            if (r12 > 0) goto L71
        L4b:
            float r12 = r11.lastY
            int r6 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r6 == 0) goto L5e
            float r12 = r4 - r12
            float r12 = java.lang.Math.abs(r12)
            int r6 = r11.e
            float r6 = (float) r6
            int r12 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1))
            if (r12 > 0) goto L71
        L5e:
            float r12 = r11.lastZ
            int r5 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r5 == 0) goto L90
            float r12 = r0 - r12
            float r12 = java.lang.Math.abs(r12)
            int r5 = r11.e
            float r5 = (float) r5
            int r12 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r12 <= 0) goto L90
        L71:
            long r5 = java.lang.System.currentTimeMillis()
            long r7 = r11.lastCallBackTimeMs
            long r7 = r5 - r7
            long r9 = r11.f
            int r12 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r12 <= 0) goto L90
            r11.b()
            com.anythink.basead.handler.ATShackSensorListener r12 = r11.d
            boolean r12 = r12.onShakeTrigger()
            if (r12 == 0) goto L90
            r11.lastCallBackTimeMs = r5
            r11.a()
            return r3
        L90:
            r11.lastX = r2
            r11.lastY = r4
            r11.lastZ = r0
        L96:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.basead.handler.SimpleShakeSensorChangeHandler.handleSensorData(android.hardware.SensorEvent):boolean");
    }

    @Override // com.anythink.basead.handler.BaseShakeSensorChangeHandlerImp
    protected final void a() {
        super.a();
        this.lastX = 0.0f;
        this.lastY = 0.0f;
        this.lastZ = 0.0f;
    }
}
