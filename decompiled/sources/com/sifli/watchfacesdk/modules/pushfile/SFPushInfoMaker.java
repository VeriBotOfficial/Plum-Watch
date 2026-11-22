package com.sifli.watchfacesdk.modules.pushfile;

import com.sifli.siflicore.error.SFError;
import com.sifli.siflicore.error.SFException;
import com.sifli.siflicore.log.SFLog;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* loaded from: classes17.dex */
public class SFPushInfoMaker {
    private static final String TAG = "SFPushInfoMaker";
    private ISFPushInfoMakerCallback callback;

    public void makePushInfos(final ArrayList<SFFile> arrayList, final int i, final int i2, final boolean z, ISFPushInfoMakerCallback iSFPushInfoMakerCallback) {
        SFLog.i(TAG, "makePushInfos");
        this.callback = iSFPushInfoMakerCallback;
        new Thread(new Runnable() { // from class: com.sifli.watchfacesdk.modules.pushfile.SFPushInfoMaker.1
            @Override // java.lang.Runnable
            public void run() {
                SFPushInfoMaker.this.callMakePushInfos(arrayList, i, i2, z);
            }
        }).start();
        SFLog.i(TAG, "makePushInfos return");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void callMakePushInfos(ArrayList<SFFile> arrayList, int i, int i2, boolean z) {
        SFLog.i(TAG, "callMakePushInfos");
        try {
            this.callback.onMakePushInfoSuccess(innerMakePushInfos(arrayList, i, i2, z));
        } catch (Exception e) {
            SFLog.e(TAG, "callMakePushInfos exception.ex=" + e.toString());
            e.printStackTrace();
            if (e.getClass() == SFException.class) {
                SFException sFException = (SFException) e;
                this.callback.onMakePushInfoFail(new SFError(sFException.getCode(), sFException.getMessage()));
            } else {
                this.callback.onMakePushInfoFail(new SFError(100, "callMakePushInfos error." + e.getMessage()));
            }
        }
    }

    private SFPushInfos innerMakePushInfos(ArrayList<SFFile> arrayList, int i, int i2, boolean z) throws SFException {
        SFLog.i(TAG, "makePushInfos files=%d,type=%d,maxFileSliceLength=%d,withByteAlign=%s", Integer.valueOf(arrayList.size()), Integer.valueOf(i), Integer.valueOf(i2), Boolean.valueOf(z));
        if (i == 8) {
            z = false;
        }
        if (i == 3 || z) {
            SFLog.i(TAG, "padding byte...");
            SFLog.i(TAG, "");
            byte b = i == 5 ? (byte) 32 : (byte) 0;
            Iterator<SFFile> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().paddingByte(b);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        Iterator<SFFile> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            SFFile next = it2.next();
            if (next.getFileName().toLowerCase().endsWith(".gif")) {
                arrayList2.add(next);
            } else {
                arrayList3.add(next);
            }
        }
        Collections.sort(arrayList2, new SFFileComparator());
        Collections.sort(arrayList3, new SFFileComparator());
        arrayList4.addAll(arrayList3);
        arrayList4.addAll(arrayList2);
        return new SFPushInfos(i, arrayList4, i2);
    }
}
