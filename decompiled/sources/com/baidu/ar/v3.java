package com.baidu.ar;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.baidu.ar.bean.ARConfig;
import com.baidu.ar.constants.ARConfigKey;
import com.baidu.ar.statistic.StatisticApiImpl;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes12.dex */
public class v3 extends Handler {

    /* renamed from: a, reason: collision with root package name */
    public u3 f7256a;
    public Map<String, String> b;

    public v3(Looper looper, u3 u3Var) {
        super(looper);
        this.f7256a = u3Var;
        this.b = new HashMap();
    }

    public void a(int i, Object obj) {
        if (obj instanceof t3) {
            t3 t3Var = (t3) obj;
            if (!TextUtils.isEmpty(ARConfig.getARKey())) {
                t3Var.a("ar_key", ARConfig.getARKey());
            }
            t3Var.a(ARConfigKey.AR_ID, ARConfig.getARId());
            t3Var.a(ARConfigKey.AR_FROM, ARConfig.getArFrom());
            t3Var.a("ar_type", String.valueOf(ARConfig.getARType()));
            if (!this.b.isEmpty()) {
                t3Var.a(this.b);
            }
        }
        Message obtainMessage = obtainMessage();
        obtainMessage.what = i;
        obtainMessage.obj = obj;
        sendMessage(obtainMessage);
    }

    public void a(String str, String str2) {
        this.b.put(str, str2);
    }

    public void a(Map<String, String> map) {
        if (map != null) {
            this.b.putAll(map);
        }
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        super.handleMessage(message);
        int i = message.what;
        if (i == 20) {
            this.f7256a.f((t3) message.obj);
            return;
        }
        if (i == 21) {
            this.f7256a.a((List<String>) message.obj);
            return;
        }
        switch (i) {
            case 1:
                this.f7256a.c();
                break;
            case 2:
                this.f7256a.a((t3) message.obj);
                break;
            case 3:
                this.f7256a.e((t3) message.obj);
                break;
            case 4:
                this.f7256a.d((t3) message.obj);
                break;
            case 5:
                this.f7256a.c((t3) message.obj);
                break;
            case 6:
                this.f7256a.b((t3) message.obj);
                break;
            default:
                switch (i) {
                    case 97:
                        this.f7256a.a(((Long) message.obj).longValue());
                        break;
                    case 98:
                        this.f7256a.b(((Long) message.obj).longValue());
                        break;
                    case 99:
                        this.f7256a.a();
                        StatisticApiImpl statisticApiImpl = (StatisticApiImpl) message.obj;
                        if (statisticApiImpl != null) {
                            statisticApiImpl.doRelease();
                        }
                        message.obj = null;
                        break;
                }
        }
    }
}
