package com.amap.api.trace;

import android.content.Context;
import com.amap.api.col.p0003sl.j9;
import com.amap.api.col.p0003sl.k9;
import com.amap.api.col.p0003sl.n1;
import com.amap.api.col.p0003sl.t4;
import com.amap.api.col.p0003sl.v8;
import com.amap.api.map3d.R;
import java.util.List;

/* loaded from: classes11.dex */
public class LBSTraceClient {
    public static final int TYPE_AMAP = 1;
    public static final int TYPE_BAIDU = 3;
    public static final int TYPE_GPS = 2;

    /* renamed from: a, reason: collision with root package name */
    private static LBSTraceBase f2226a;
    private static volatile LBSTraceClient b;
    public static final String MIN_GRASP_POINT_ERROR = n1.a(R.string.O105492_85);
    public static final String LOCATE_TIMEOUT_ERROR = n1.a(R.string.O105492_86);
    public static final String TRACE_SUCCESS = n1.a(R.string.O105492_87);

    public LBSTraceClient(Context context) throws Exception {
        a(context);
    }

    private static void a(Context context) throws Exception {
        k9 a2 = j9.a(context, t4.b());
        if (a2.f1729a != j9.e.SuccessCode) {
            throw new Exception(a2.b);
        }
        if (context != null) {
            f2226a = new v8(context.getApplicationContext());
        }
    }

    public static LBSTraceClient getInstance(Context context) throws Exception {
        if (b == null) {
            synchronized (LBSTraceClient.class) {
                if (b == null) {
                    a(context);
                    b = new LBSTraceClient();
                }
            }
        }
        return b;
    }

    public void destroy() {
        LBSTraceBase lBSTraceBase = f2226a;
        if (lBSTraceBase != null) {
            lBSTraceBase.destroy();
            f2226a = null;
            b = null;
        }
    }

    public void queryProcessedTrace(int i, List<TraceLocation> list, int i2, TraceListener traceListener) {
        LBSTraceBase lBSTraceBase = f2226a;
        if (lBSTraceBase != null) {
            lBSTraceBase.queryProcessedTrace(i, list, i2, traceListener);
        }
    }

    public void startTrace(TraceStatusListener traceStatusListener) {
        LBSTraceBase lBSTraceBase = f2226a;
        if (lBSTraceBase != null) {
            lBSTraceBase.startTrace(traceStatusListener);
        }
    }

    public void stopTrace() {
        LBSTraceBase lBSTraceBase = f2226a;
        if (lBSTraceBase != null) {
            lBSTraceBase.stopTrace();
        }
    }

    private LBSTraceClient() {
    }
}
