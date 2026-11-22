package com.baidu.ar;

import android.app.Activity;
import android.util.Log;
import com.baidu.ar.arrender.Texture;
import com.baidu.ar.i1;
import com.google.ar.core.ArCoreApk;
import com.google.ar.core.Camera;
import com.google.ar.core.CameraIntrinsics;
import com.google.ar.core.Config;
import com.google.ar.core.Session;
import com.google.ar.core.TrackingState;
import com.google.ar.core.exceptions.CameraNotAvailableException;

/* loaded from: classes12.dex */
public class d extends i1 {
    public Session b;
    public Activity c;

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f6868a;

        static {
            int[] iArr = new int[ArCoreApk.InstallStatus.values().length];
            f6868a = iArr;
            try {
                iArr[ArCoreApk.InstallStatus.INSTALL_REQUESTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6868a[ArCoreApk.InstallStatus.INSTALLED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public d(Activity activity) {
        this.c = activity;
    }

    @Override // com.baidu.ar.i1
    public void a() {
        char c;
        int i;
        super.a();
        Session session = this.b;
        if (session == null) {
            return;
        }
        try {
            Camera camera = session.update().getCamera();
            CameraIntrinsics imageIntrinsics = camera.getImageIntrinsics();
            float[] principalPoint = imageIntrinsics.getPrincipalPoint();
            float[] focalLength = imageIntrinsics.getFocalLength();
            float[] fArr = {focalLength[0], 0.0f, principalPoint[0], 0.0f, focalLength[1], principalPoint[1], 0.0f, 0.0f, 1.0f};
            float[] fArr2 = new float[16];
            camera.getPose().toMatrix(fArr2, 0);
            float atan = (float) (((Math.atan(principalPoint[0] / focalLength[0]) * 2.0d) / 3.141592653589793d) * 180.0d);
            if (camera.getTrackingState() == TrackingState.TRACKING) {
                c = 4;
                i = 0;
            } else {
                c = 4;
                i = 1;
            }
            float f = fArr2[0];
            float f2 = fArr2[c];
            float f3 = fArr2[8];
            float f4 = fArr2[1];
            float f5 = fArr2[5];
            float f6 = fArr2[9];
            float f7 = fArr2[2];
            float f8 = fArr2[6];
            float f9 = fArr2[10];
            char c2 = c;
            float f10 = fArr2[12];
            float f11 = fArr2[13];
            float f12 = fArr2[14];
            float[] fArr3 = new float[12];
            fArr3[0] = f;
            fArr3[1] = f2;
            fArr3[2] = f3;
            fArr3[3] = f4;
            fArr3[c2] = f5;
            fArr3[5] = f6;
            fArr3[6] = f7;
            fArr3[7] = f8;
            fArr3[8] = f9;
            fArr3[9] = f10;
            fArr3[10] = f11;
            fArr3[11] = f12;
            i1.a aVar = this.f6976a;
            if (aVar != null) {
                aVar.a(i, fArr, atan, fArr3, fArr2);
            }
        } catch (Exception e) {
            Log.e("ARCoreAbility", "onFrameUpdate: arcore update error.");
            e.printStackTrace();
        }
    }

    @Override // com.baidu.ar.b7
    public void a(Texture texture) {
        Session session = this.b;
        if (session == null || texture == null) {
            return;
        }
        session.setCameraTextureName(texture.getId());
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0031 A[Catch: Exception -> 0x0054, TryCatch #0 {Exception -> 0x0054, blocks: (B:7:0x002c, B:9:0x0031, B:11:0x0045), top: B:6:0x002c }] */
    @Override // com.baidu.ar.i1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean a(boolean r6) {
        /*
            r5 = this;
            com.google.ar.core.ArCoreApk r0 = com.google.ar.core.ArCoreApk.getInstance()
            android.app.Activity r1 = r5.c
            com.google.ar.core.ArCoreApk$Availability r0 = r0.checkAvailability(r1)
            com.google.ar.core.ArCoreApk$Availability r1 = com.google.ar.core.ArCoreApk.Availability.SUPPORTED_APK_TOO_OLD
            java.lang.String r2 = "ARCoreAbility"
            if (r0 != r1) goto L16
            java.lang.String r0 = "SUPPORTED_APK_TOO_OLD"
        L12:
            android.util.Log.e(r2, r0)
            goto L2b
        L16:
            com.google.ar.core.ArCoreApk$Availability r1 = com.google.ar.core.ArCoreApk.Availability.SUPPORTED_INSTALLED
            if (r0 != r1) goto L1d
            java.lang.String r0 = "SUPPORTED_INSTALLED"
            goto L12
        L1d:
            com.google.ar.core.ArCoreApk$Availability r1 = com.google.ar.core.ArCoreApk.Availability.SUPPORTED_NOT_INSTALLED
            if (r0 != r1) goto L24
            java.lang.String r0 = "SUPPORTED_NOT_INSTALLED"
            goto L12
        L24:
            com.google.ar.core.ArCoreApk$Availability r1 = com.google.ar.core.ArCoreApk.Availability.UNSUPPORTED_DEVICE_NOT_CAPABLE
            if (r0 != r1) goto L2b
            java.lang.String r0 = "UNSUPPORTED_DEVICE_NOT_CAPABLE"
            goto L12
        L2b:
            r0 = 0
            com.google.ar.core.Session r1 = r5.b     // Catch: java.lang.Exception -> L54
            r2 = 1
            if (r1 != 0) goto L53
            int[] r1 = com.baidu.ar.d.a.f6868a     // Catch: java.lang.Exception -> L54
            com.google.ar.core.ArCoreApk r3 = com.google.ar.core.ArCoreApk.getInstance()     // Catch: java.lang.Exception -> L54
            android.app.Activity r4 = r5.c     // Catch: java.lang.Exception -> L54
            com.google.ar.core.ArCoreApk$InstallStatus r3 = r3.requestInstall(r4, r0)     // Catch: java.lang.Exception -> L54
            int r3 = r3.ordinal()     // Catch: java.lang.Exception -> L54
            r1 = r1[r3]     // Catch: java.lang.Exception -> L54
            if (r1 == r2) goto L52
            com.google.ar.core.Session r1 = new com.google.ar.core.Session     // Catch: java.lang.Exception -> L54
            android.app.Activity r3 = r5.c     // Catch: java.lang.Exception -> L54
            r1.<init>(r3)     // Catch: java.lang.Exception -> L54
            r5.b = r1     // Catch: java.lang.Exception -> L54
            r5.b(r6)     // Catch: java.lang.Exception -> L54
            goto L53
        L52:
            return r0
        L53:
            return r2
        L54:
            r6 = move-exception
            r6.printStackTrace()
            com.google.ar.core.Session r6 = r5.b
            if (r6 == 0) goto L62
            r6.close()
            r6 = 0
            r5.b = r6
        L62:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baidu.ar.d.a(boolean):boolean");
    }

    public final void b(boolean z) {
        Config config = this.b.getConfig();
        config.setFocusMode(z ? Config.FocusMode.AUTO : Config.FocusMode.FIXED);
        this.b.configure(config);
    }

    @Override // com.baidu.ar.i1
    public boolean b() {
        Session session = this.b;
        if (session != null) {
            session.pause();
        }
        return super.b();
    }

    @Override // com.baidu.ar.i1
    public void c() {
        this.f6976a = null;
        Session session = this.b;
        if (session != null) {
            session.close();
            this.b = null;
        }
    }

    @Override // com.baidu.ar.i1
    public boolean d() {
        Session session = this.b;
        if (session == null) {
            return true;
        }
        try {
            session.resume();
            return true;
        } catch (CameraNotAvailableException e) {
            e.printStackTrace();
            return false;
        }
    }
}
