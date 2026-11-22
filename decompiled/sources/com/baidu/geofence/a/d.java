package com.baidu.geofence.a;

import android.gov.nist.javax.sip.header.ParameterNames;
import android.text.TextUtils;
import com.baidu.location.Jni;
import com.baidu.location.b.x;
import com.baidu.location.h.g;
import com.baidu.location.h.i;
import com.google.android.material.timepicker.TimeModel;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import org.json.JSONObject;

/* loaded from: classes13.dex */
public class d extends g {

    /* renamed from: a, reason: collision with root package name */
    private int f7483a;
    private List<String> b = null;
    private boolean c = false;
    private boolean d = false;
    private ArrayList<StringBuilder> e;
    private a f;

    public interface a {
        void clear();
    }

    public d() {
        this.el = new HashMap();
        this.f7483a = 0;
    }

    public void a(a aVar) {
        this.f = aVar;
    }

    public void a(ArrayList<StringBuilder> arrayList) {
        this.e = arrayList;
    }

    @Override // com.baidu.location.h.g
    public void a(boolean z) {
        this.d = false;
        if (z && this.ej != null) {
            try {
                new JSONObject(this.ej);
                a aVar = this.f;
                if (aVar != null) {
                    aVar.clear();
                }
                this.d = true;
            } catch (Exception unused) {
            }
        }
        boolean z2 = this.d;
        if (!z2) {
            this.f7483a++;
        }
        if (z2) {
            this.f7483a = 0;
        }
        this.b.clear();
        this.c = false;
    }

    public boolean a(String[] strArr) {
        if (!this.c && this.f7483a < 10) {
            if (strArr != null) {
                for (String str : strArr) {
                    if (this.b == null) {
                        this.b = new ArrayList();
                    }
                    this.b.add(Jni.encode(str));
                }
            }
            List<String> list = this.b;
            if (list != null && list.size() > 0) {
                this.c = true;
                ExecutorService c = x.a().c();
                if (c != null) {
                    a(c, i.d());
                } else {
                    e(i.d());
                }
                return true;
            }
        }
        return false;
    }

    @Override // com.baidu.location.h.g
    public void b() {
        Map<String, Object> map;
        StringBuilder sb;
        String str;
        String str2;
        this.el.clear();
        this.el.put(DownloadCommon.DOWNLOAD_REPORT_QUERY_TIMEOUT, "cltrw");
        this.eh = i.d();
        for (int i = 0; i < this.b.size(); i++) {
            ArrayList<StringBuilder> arrayList = this.e;
            if (arrayList == null || arrayList.isEmpty()) {
                map = this.el;
                sb = new StringBuilder("cltr[");
            } else if (TextUtils.isEmpty(this.e.get(i).toString())) {
                map = this.el;
                sb = new StringBuilder("cltr[");
            } else {
                map = this.el;
                str2 = "cltr[" + i + "]";
                str = this.b.get(i) + "&" + Jni.encode(this.e.get(i).toString());
                map.put(str2, str);
            }
            str2 = sb.append(i).append("]").toString();
            str = this.b.get(i);
            map.put(str2, str);
        }
        this.el.put(ParameterNames.INFO, Jni.encode(com.baidu.location.h.b.a().e() + "&isgeofence=1"));
        this.el.put("trtm", String.format(Locale.CHINA, TimeModel.NUMBER_FORMAT, Long.valueOf(System.currentTimeMillis())));
        this.b.clear();
    }
}
