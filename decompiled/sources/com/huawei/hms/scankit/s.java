package com.huawei.hms.scankit;

import android.graphics.Point;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.RemoteException;
import com.huawei.hms.feature.dynamic.IObjectWrapper;
import com.huawei.hms.feature.dynamic.ObjectWrapper;
import com.huawei.hms.hmsscankit.api.IRemoteFrameDecoderDelegate;
import com.swmansion.rnscreens.Screen;

/* compiled from: IRemoteFrameDecoderDelegateImpl.java */
/* loaded from: classes14.dex */
public class s extends IRemoteFrameDecoderDelegate.Stub {

    /* renamed from: a, reason: collision with root package name */
    private static volatile s f10710a = new s();
    Point b;
    int c = 0;
    Rect d;

    private s() {
    }

    public static s a() {
        return f10710a;
    }

    public synchronized Rect b(int i, int i2) {
        Rect rect = new Rect(a(i, i2));
        Point point = new Point(i, i2);
        Point point2 = this.b;
        if (point2 == null) {
            return null;
        }
        int i3 = point2.x;
        int i4 = point2.y;
        if (i3 < i4) {
            int i5 = rect.left;
            int i6 = point.y;
            rect.left = (i5 * i6) / i3;
            rect.right = (rect.right * i6) / i3;
            int i7 = rect.top;
            int i8 = point.x;
            rect.top = (i7 * i8) / i4;
            rect.bottom = (rect.bottom * i8) / i4;
        } else {
            int i9 = rect.top;
            int i10 = point.y;
            rect.top = (i9 * i10) / i4;
            rect.bottom = (rect.bottom * i10) / i4;
            int i11 = rect.left;
            int i12 = point.x;
            rect.left = (i11 * i12) / i3;
            rect.right = (rect.right * i12) / i3;
        }
        return rect;
    }

    @Override // com.huawei.hms.hmsscankit.api.IRemoteFrameDecoderDelegate
    public com.huawei.hms.scankit.aiscan.common.x[] decode(byte[] bArr, int i, int i2, int i3, int i4, IObjectWrapper iObjectWrapper) throws RemoteException {
        if (iObjectWrapper != null && (ObjectWrapper.unwrap(iObjectWrapper) instanceof Bundle)) {
            Bundle bundle = (Bundle) ObjectWrapper.unwrap(iObjectWrapper);
            this.b = (Point) bundle.getParcelable(Screen.TAG);
            this.d = (Rect) bundle.getParcelable("Rect");
        }
        if (this.d == null) {
            this.d = new Rect(-1, -1, -1, -1);
        }
        if (this.b == null) {
            this.b = new Point(1080, 1920);
        }
        com.huawei.hms.scankit.aiscan.common.r a2 = a(bArr, i, i2, i3);
        byte[] b = a2.b();
        D d = new D(a2.c(), a2.a(), i4);
        int i5 = this.c;
        this.c = i5 + 1;
        return k.b(b, d.a(i5));
    }

    private com.huawei.hms.scankit.aiscan.common.r a(byte[] bArr, int i, int i2, int i3) {
        if (i3 == 0) {
            byte[] bArr2 = new byte[bArr.length];
            for (int i4 = 0; i4 < i2; i4++) {
                for (int i5 = 0; i5 < i; i5++) {
                    bArr2[(((i5 * i2) + i2) - i4) - 1] = bArr[(i4 * i) + i5];
                }
            }
            return a(bArr2, i2, i);
        }
        if (i3 == 2) {
            byte[] bArr3 = new byte[bArr.length];
            for (int i6 = 0; i6 < i2; i6++) {
                for (int i7 = 0; i7 < i; i7++) {
                    bArr3[(((i - 1) - i7) * i2) + i6] = bArr[(i6 * i) + i7];
                }
            }
            return a(bArr3, i2, i);
        }
        if (i3 != 3) {
            return a(bArr, i, i2);
        }
        byte[] bArr4 = new byte[bArr.length];
        for (int i8 = 0; i8 < i2; i8++) {
            for (int i9 = 0; i9 < i; i9++) {
                bArr4[(((((i2 - 1) - i8) * i) + i) - 1) - i9] = bArr[(i8 * i) + i9];
            }
        }
        return a(bArr4, i, i2);
    }

    public synchronized Rect a(int i, int i2) {
        int min;
        int i3;
        int i4;
        min = Math.min(i, i2);
        i3 = (i - min) / 2;
        i4 = (i2 - min) / 2;
        return new Rect(i3, i4, i3 + min, min + i4);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.huawei.hms.scankit.aiscan.common.r a(byte[] r13, int r14, int r15) {
        /*
            Method dump skipped, instructions count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.scankit.s.a(byte[], int, int):com.huawei.hms.scankit.aiscan.common.r");
    }
}
