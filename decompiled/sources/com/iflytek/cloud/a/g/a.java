package com.iflytek.cloud.a.g;

import android.content.Context;
import android.text.TextUtils;
import com.iflytek.cloud.ErrorCode;
import com.iflytek.cloud.SpeechError;
import com.iflytek.cloud.b.c;
import com.iflytek.cloud.msc.util.log.DebugLog;
import com.iflytek.msc.MSC;
import com.iflytek.msc.MSCSessionInfo;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

/* loaded from: classes17.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public static Object f11140a = new Object();
    private MSCSessionInfo b = new MSCSessionInfo();

    public static void a(Context context, String str, String str2, com.iflytek.cloud.a.f.a aVar) throws SpeechError, IOException {
        byte[] bArr;
        synchronized (f11140a) {
            String a2 = c.a(context, aVar);
            if (TextUtils.isEmpty(str)) {
                if (context != null) {
                    String a3 = c.a(context);
                    if (!TextUtils.isEmpty(a3)) {
                        bArr = a3.getBytes(aVar.getParamEncoding());
                    }
                }
                bArr = null;
            } else {
                bArr = str.getBytes("utf-8");
            }
            try {
                int QMSPLogin = MSC.QMSPLogin(bArr, TextUtils.isEmpty(str2) ? null : str2.getBytes(aVar.getParamEncoding()), a2.getBytes(aVar.getParamEncoding()));
                DebugLog.LogD("[MSPLogin]ret:" + QMSPLogin);
                if (QMSPLogin != 0) {
                    throw new SpeechError(QMSPLogin);
                }
            } catch (UnsatisfiedLinkError e) {
                DebugLog.LogE(e);
                throw new SpeechError(ErrorCode.ERROR_UNSATISFIED_LINK);
            }
        }
    }

    public static boolean a() {
        boolean z;
        if (!com.iflytek.cloud.a.f.a.isEmpty()) {
            DebugLog.LogD("MscHandler is not empty while logout.");
            return false;
        }
        synchronized (f11140a) {
            z = MSC.QMSPLogOut() == 0;
        }
        return z;
    }

    public synchronized byte[] a(Context context, String str, byte[] bArr, com.iflytek.cloud.a.f.a aVar) throws SpeechError, UnsupportedEncodingException {
        byte[] QMSPUploadData;
        synchronized (f11140a) {
            String d = c.d(context, aVar);
            DebugLog.LogD("[MSPSession uploadData]enter time:" + System.currentTimeMillis());
            QMSPUploadData = MSC.QMSPUploadData(str.getBytes(aVar.getParamEncoding()), bArr, bArr.length, d.getBytes("utf-8"), this.b);
            DebugLog.LogD("[MSPSession uploaddData]leavel:" + this.b.errorcode + ",data len = " + (QMSPUploadData == null ? 0 : QMSPUploadData.length));
            int i = this.b.errorcode;
            if (i != 0 || QMSPUploadData == null) {
                throw new SpeechError(i);
            }
        }
        return QMSPUploadData;
    }

    public synchronized byte[] a(Context context, com.iflytek.cloud.a.f.a aVar) throws SpeechError, UnsupportedEncodingException {
        byte[] QMSPDownloadData;
        synchronized (f11140a) {
            String d = c.d(context, aVar);
            DebugLog.LogD("[MSPSession downloadData]enter time:" + System.currentTimeMillis());
            com.iflytek.cloud.msc.util.log.a.a("LastDataFlag", null);
            QMSPDownloadData = MSC.QMSPDownloadData(d.getBytes(aVar.getParamEncoding()), this.b);
            com.iflytek.cloud.msc.util.log.a.a("GetNotifyResult", null);
            DebugLog.LogD("[MSPSession downloadData]leavel:" + this.b.errorcode + ",data len = " + (QMSPDownloadData == null ? 0 : QMSPDownloadData.length));
            int i = this.b.errorcode;
            if (i != 0 || QMSPDownloadData == null) {
                throw new SpeechError(i);
            }
        }
        return QMSPDownloadData;
    }

    public synchronized byte[] a(Context context, com.iflytek.cloud.a.f.a aVar, String str) throws SpeechError, UnsupportedEncodingException {
        byte[] QMSPSearch;
        synchronized (f11140a) {
            String d = c.d(context, aVar);
            DebugLog.LogD("[MSPSession searchResult]enter time:" + System.currentTimeMillis());
            byte[] bytes = str.getBytes("utf-8");
            com.iflytek.cloud.msc.util.log.a.a("LastDataFlag", null);
            QMSPSearch = MSC.QMSPSearch(d.getBytes(aVar.getParamEncoding()), bytes, this.b);
            com.iflytek.cloud.msc.util.log.a.a("GetNotifyResult", null);
            DebugLog.LogD("[QMSPSearch searchResult]leavel:" + this.b.errorcode + ",data len = " + (QMSPSearch == null ? 0 : QMSPSearch.length));
            int i = this.b.errorcode;
            if (i != 0 || QMSPSearch == null) {
                throw new SpeechError(i);
            }
        }
        return QMSPSearch;
    }
}
