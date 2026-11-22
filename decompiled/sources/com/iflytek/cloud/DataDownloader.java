package com.iflytek.cloud;

import android.content.Context;
import com.iflytek.cloud.a.f.e;
import com.iflytek.cloud.a.g.b;
import com.iflytek.cloud.msc.util.log.DebugLog;

/* loaded from: classes17.dex */
public class DataDownloader extends e {
    public DataDownloader(Context context) {
        super(context);
    }

    @Override // com.iflytek.cloud.a.f.e
    protected boolean d() {
        return true;
    }

    public int downloadData(SpeechListener speechListener) {
        try {
            this.c = new b(this.f11137a, this.mSessionParams, a("download"));
            ((b) this.c).a(new e.a(speechListener));
            return 0;
        } catch (SpeechError e) {
            int errorCode = e.getErrorCode();
            DebugLog.LogE(e);
            return errorCode;
        } catch (Throwable th) {
            DebugLog.LogE(th);
            return ErrorCode.ERROR_UNKNOWN;
        }
    }
}
