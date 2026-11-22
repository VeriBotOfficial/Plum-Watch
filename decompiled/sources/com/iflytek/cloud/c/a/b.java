package com.iflytek.cloud.c.a;

import android.content.Context;
import android.text.TextUtils;
import com.iflytek.cloud.ErrorCode;
import com.iflytek.cloud.RequestListener;
import com.iflytek.cloud.SpeechConstant;
import com.iflytek.cloud.SpeechError;
import com.iflytek.cloud.SpeechUtility;
import com.iflytek.cloud.msc.util.i;
import com.iflytek.cloud.msc.util.log.DebugLog;
import org.json.JSONObject;

/* loaded from: classes17.dex */
public class b extends com.iflytek.cloud.a.f.d {
    private Context c;
    private com.iflytek.cloud.msc.util.i d;
    private RequestListener e;

    /* renamed from: a, reason: collision with root package name */
    private String f11157a = "http://openapi.openspeech.cn/webapi/wfr.do";
    private String b = "pver=1.0";
    i.a f = new a();

    class a implements i.a {
        a() {
        }

        @Override // com.iflytek.cloud.msc.util.i.a
        public void a(com.iflytek.cloud.msc.util.i iVar, byte[] bArr) {
            if (bArr != null) {
                try {
                    String str = new String(bArr, "utf-8");
                    DebugLog.LogD(str);
                    int parseInt = Integer.parseInt(new JSONObject(str).getString(SpeechUtility.TAG_RESOURCE_RET));
                    if (parseInt != 0) {
                        onError(new SpeechError(parseInt, SpeechConstant.ENG_WFR));
                        return;
                    }
                    if (b.this.e != null) {
                        com.iflytek.cloud.msc.util.log.a.a("GetNotifyResult", null);
                        b.this.e.onBufferReceived(bArr);
                    }
                    onError(null);
                } catch (Exception unused) {
                    onError(new SpeechError(20004));
                }
            }
        }

        @Override // com.iflytek.cloud.msc.util.i.a
        public void onError(SpeechError speechError) {
            if (speechError != null) {
                DebugLog.LogE("upload error. please check net state:" + speechError.getErrorCode());
            } else {
                DebugLog.LogD("upload succeed");
            }
            if (b.this.e != null) {
                b.this.e.onCompleted(speechError);
            }
        }
    }

    public b(Context context, com.iflytek.cloud.b.a aVar) {
        this.c = null;
        this.d = null;
        this.mSessionParams = aVar;
        this.c = context;
        this.d = new com.iflytek.cloud.msc.util.i();
    }

    public void cancel() {
        this.d.a();
        this.d = null;
    }

    @Override // com.iflytek.cloud.a.f.d
    public boolean destroy() {
        return super.destroy();
    }

    public int sendRequest(byte[] bArr, RequestListener requestListener) {
        try {
            this.e = requestListener;
            if (SpeechUtility.getUtility() == null) {
                return 10111;
            }
            String e = this.mSessionParams.e("server_url");
            if (TextUtils.isEmpty(e)) {
                e = this.f11157a;
            }
            String d = com.iflytek.cloud.b.c.d(this.c, this.mSessionParams);
            this.d.b(this.mSessionParams.a("timeout", 20000));
            this.d.a(1);
            this.d.a(e, this.b, bArr, d);
            this.d.a(this.f);
            com.iflytek.cloud.msc.util.log.a.a("LastDataFlag", null);
            return 0;
        } catch (Exception unused) {
            return ErrorCode.ERROR_UNKNOWN;
        }
    }
}
