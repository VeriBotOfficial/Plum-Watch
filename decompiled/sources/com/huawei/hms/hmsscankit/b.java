package com.huawei.hms.hmsscankit;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.huawei.hms.feature.dynamic.ObjectWrapper;
import com.huawei.hms.hmsscankit.api.IRemoteCreator;
import com.huawei.hms.hmsscankit.api.IRemoteHmsDecoderDelegate;
import com.huawei.hms.ml.scan.HmsScan;
import com.huawei.hms.ml.scan.HmsScanAnalyzerOptions;
import com.huawei.hms.mlsdk.common.MLFrame;
import com.huawei.hms.scankit.p.C3041pb;

/* compiled from: HmsRemoteDecoder.java */
/* loaded from: classes14.dex */
class b {

    /* renamed from: a, reason: collision with root package name */
    private static volatile IRemoteHmsDecoderDelegate f10441a;

    static HmsScan[] a(Context context, MLFrame mLFrame, HmsScanAnalyzerOptions hmsScanAnalyzerOptions) {
        HmsScan[] hmsScanArr = new HmsScan[0];
        if (f10441a == null) {
            IRemoteCreator b = j.b(context);
            if (b != null) {
                try {
                    f10441a = b.newRemoteHmsDecoderDelegate();
                } catch (RemoteException unused) {
                    com.huawei.hms.scankit.util.a.b("exception", "RemoteException");
                }
            }
            return hmsScanArr;
        }
        if (f10441a != null) {
            try {
                DetailRect detailRect = mLFrame.acquireProperty() != null ? new DetailRect(mLFrame.acquireProperty().getWidth(), mLFrame.acquireProperty().getHeight()) : new DetailRect();
                Bundle bundle = new Bundle();
                if (hmsScanAnalyzerOptions != null && hmsScanAnalyzerOptions.mode != 0) {
                    bundle.putInt(DetailRect.FORMAT_FLAG, hmsScanAnalyzerOptions.mode);
                }
                bundle.putInt(DetailRect.TYPE_TRANS, 3);
                bundle.putAll(C3041pb.a(context));
                HmsScan[] decodeInBitmap = mLFrame.readBitmap() != null ? f10441a.decodeInBitmap(detailRect, ObjectWrapper.wrap(mLFrame.readBitmap()), ObjectWrapper.wrap(bundle)) : f10441a.detectWithByteBuffer(detailRect, ObjectWrapper.wrap(mLFrame.acquireGrayByteBuffer()), ObjectWrapper.wrap(bundle));
                if (decodeInBitmap != null) {
                    return decodeInBitmap;
                }
            } catch (RemoteException unused2) {
                com.huawei.hms.scankit.util.a.b("exception", "RemoteException");
            }
        }
        return hmsScanArr;
    }
}
