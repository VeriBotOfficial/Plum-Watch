package com.iflytek.cloud;

import android.content.Context;
import android.graphics.Bitmap;
import com.iflytek.cloud.a.f.d;
import com.iflytek.cloud.c.a.a;

/* loaded from: classes17.dex */
public class FaceDetector extends d {

    /* renamed from: a, reason: collision with root package name */
    private static FaceDetector f11070a;
    private a b;

    private FaceDetector(Context context) throws SpeechError {
        try {
            this.b = new a(context, null);
        } catch (UnsatisfiedLinkError unused) {
            throw new SpeechError(ErrorCode.ERROR_UNSATISFIED_LINK);
        }
    }

    public static synchronized FaceDetector createDetector(Context context, String str) throws SpeechError {
        FaceDetector faceDetector;
        synchronized (FaceDetector.class) {
            synchronized (d.sSync) {
                if (f11070a == null && SpeechUtility.getUtility() != null) {
                    f11070a = new FaceDetector(context);
                }
                faceDetector = f11070a;
            }
        }
        return faceDetector;
    }

    public static synchronized FaceDetector getDetector() {
        FaceDetector faceDetector;
        synchronized (FaceDetector.class) {
            faceDetector = f11070a;
        }
        return faceDetector;
    }

    @Override // com.iflytek.cloud.a.f.d
    public synchronized boolean destroy() {
        a aVar;
        aVar = this.b;
        synchronized (this) {
            this.b = null;
        }
        return r0;
        if (aVar != null) {
            aVar.a();
        }
        boolean destroy = super.destroy();
        if (destroy) {
            synchronized (d.sSync) {
                f11070a = null;
            }
        }
        return destroy;
    }

    public synchronized String detectARGB(Bitmap bitmap) {
        String a2;
        synchronized (this) {
            a aVar = this.b;
            a2 = aVar != null ? aVar.a(bitmap) : null;
        }
        return a2;
        return a2;
    }

    public synchronized String detectGray(Bitmap bitmap) {
        String b;
        synchronized (this) {
            a aVar = this.b;
            b = aVar != null ? aVar.b(bitmap) : null;
        }
        return b;
        return b;
    }

    public synchronized String trackNV21(byte[] bArr, int i, int i2, int i3, int i4) {
        String a2;
        synchronized (this) {
            a aVar = this.b;
            a2 = aVar != null ? aVar.a(bArr, i, i2, i3, i4) : null;
        }
        return a2;
        return a2;
    }
}
