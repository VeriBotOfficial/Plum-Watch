package com.alipay.sdk.m.i0;

import android.util.Log;
import com.alipay.tscenter.biz.rpc.report.general.DataReportService;
import com.alipay.tscenter.biz.rpc.report.general.model.DataReportRequest;
import com.alipay.tscenter.biz.rpc.report.general.model.DataReportResult;

/* loaded from: classes11.dex */
public class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DataReportRequest f1393a;
    public final /* synthetic */ c b;

    public b(c cVar, DataReportRequest dataReportRequest) {
        this.f1393a = dataReportRequest;
        this.b = cVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        DataReportResult dataReportResult;
        DataReportResult dataReportResult2;
        DataReportService dataReportService;
        try {
            dataReportService = this.b.c;
            DataReportResult unused = c.e = dataReportService.reportData(this.f1393a);
            Log.d("APSecuritySdk", "rpc success");
        } catch (Throwable th) {
            DataReportResult unused2 = c.e = new DataReportResult();
            dataReportResult = c.e;
            dataReportResult.success = false;
            dataReportResult2 = c.e;
            dataReportResult2.resultCode = "static data rpc upload error, " + com.alipay.sdk.m.d0.a.a(th);
            Log.d("APSecuritySdk", "rpc failed:" + com.alipay.sdk.m.d0.a.a(th));
        }
    }
}
