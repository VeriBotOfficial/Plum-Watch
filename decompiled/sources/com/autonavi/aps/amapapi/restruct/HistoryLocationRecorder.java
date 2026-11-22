package com.autonavi.aps.amapapi.restruct;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import com.amap.api.col.p0003sl.f9;
import com.amap.location.support.bean.wifi.AmapWifi;
import com.amap.location.support.log.ALLog;
import com.autonavi.aps.amapapi.security.Encrypt;
import com.autonavi.aps.amapapi.utils.Utils;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class HistoryLocationRecorder {
    private File b;
    private Handler d;
    private String e;
    private boolean f;

    /* renamed from: a, reason: collision with root package name */
    private LinkedList<HistoryLocation> f6683a = new LinkedList<>();
    private boolean c = false;
    private Runnable g = new Runnable() { // from class: com.autonavi.aps.amapapi.restruct.HistoryLocationRecorder.1
        @Override // java.lang.Runnable
        public void run() {
            if (HistoryLocationRecorder.this.c) {
                return;
            }
            if (HistoryLocationRecorder.this.f) {
                HistoryLocationRecorder.c(HistoryLocationRecorder.this);
                HistoryLocationRecorder.this.f = false;
            }
            if (HistoryLocationRecorder.this.d != null) {
                HistoryLocationRecorder.this.d.postDelayed(HistoryLocationRecorder.this.g, 60000L);
            }
        }
    };

    public HistoryLocationRecorder(Context context, Handler handler) {
        this.e = null;
        this.d = handler;
        String path = context.getFilesDir().getPath();
        if (this.e == null) {
            this.e = Utils.getPackageNameMD5(context);
        }
        try {
            this.b = new File(path, "hisloc");
        } catch (Throwable th) {
            ALLog.d(th);
        }
        a();
        Handler handler2 = this.d;
        if (handler2 != null) {
            handler2.removeCallbacks(this.g);
            this.d.postDelayed(this.g, 60000L);
        }
    }

    static void c(HistoryLocationRecorder historyLocationRecorder) {
        StringBuilder sb = new StringBuilder();
        Iterator<HistoryLocation> it = historyLocationRecorder.f6683a.iterator();
        while (it.hasNext()) {
            try {
                sb.append(f9.c(Encrypt.aesEncrypt(it.next().toJson().getBytes("UTF-8"), historyLocationRecorder.e)) + "\n");
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
        String sb2 = sb.toString();
        if (TextUtils.isEmpty(sb2)) {
            return;
        }
        Utils.writeStringToFile(historyLocationRecorder.b, sb2, false);
    }

    public void addGpsLocation(HistoryLocation historyLocation) {
        addSysLocation(historyLocation, 1);
    }

    public void addLBSLocation(HistoryLocation historyLocation) {
        if (historyLocation != null && this.f6683a.size() > 0) {
            int i = historyLocation.locationType;
            if (i != 6 && i != 5) {
                if (this.f6683a.contains(historyLocation)) {
                    return;
                }
                if (this.f6683a.size() >= 10) {
                    this.f6683a.removeFirst();
                }
                this.f6683a.add(historyLocation);
                this.f = true;
                return;
            }
            HistoryLocation last = this.f6683a.getLast();
            if (last.longitude == historyLocation.longitude && last.latitude == historyLocation.latitude && last.radius == historyLocation.radius) {
                return;
            }
            if (this.f6683a.size() >= 10) {
                this.f6683a.removeFirst();
            }
            this.f6683a.add(historyLocation);
            this.f = true;
        }
    }

    public void addNetworkLocation(HistoryLocation historyLocation) {
        addSysLocation(historyLocation, 12);
    }

    public void addSysLocation(HistoryLocation historyLocation, int i) {
        if (historyLocation == null) {
            return;
        }
        Iterator<HistoryLocation> it = this.f6683a.iterator();
        HistoryLocation historyLocation2 = null;
        int i2 = 0;
        HistoryLocation historyLocation3 = null;
        while (it.hasNext()) {
            HistoryLocation next = it.next();
            if (next.locationType == i) {
                if (historyLocation3 == null) {
                    historyLocation3 = next;
                }
                i2++;
                historyLocation2 = next;
            }
        }
        if (historyLocation2 == null || historyLocation.time - historyLocation2.time >= 20000 || Utils.dist(new double[]{historyLocation.latitude, historyLocation.longitude, historyLocation2.latitude, historyLocation2.longitude}) >= 20.0f) {
            if (i2 >= 5) {
                this.f6683a.remove(historyLocation3);
            }
            if (this.f6683a.size() >= 10) {
                this.f6683a.removeFirst();
            }
            this.f6683a.add(historyLocation);
            this.f = true;
        }
    }

    public void destroy(boolean z) {
        if (!z) {
            this.g.run();
        }
        Handler handler = this.d;
        if (handler != null) {
            handler.removeCallbacks(this.g);
        }
        this.c = true;
    }

    public List<HistoryLocation> produceContextContent(ArrayList<Cgi> arrayList, ArrayList<AmapWifi> arrayList2) {
        if (arrayList != null && arrayList.size() > 0 && arrayList2 != null && arrayList2.size() > 0 && (arrayList.size() >= 4 || arrayList2.size() >= 20)) {
            return null;
        }
        long currentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList3 = new ArrayList();
        Iterator<HistoryLocation> it = this.f6683a.iterator();
        int i = 0;
        while (it.hasNext()) {
            HistoryLocation next = it.next();
            if (currentTimeMillis - next.time < 21600000000L) {
                arrayList3.add(next);
                i++;
            }
            if (i == 10) {
                break;
            }
        }
        return arrayList3;
    }

    public void synToDisk() {
        Handler handler = this.d;
        if (handler != null) {
            handler.removeCallbacks(this.g);
        }
        this.g.run();
    }

    private void a() {
        LinkedList<HistoryLocation> linkedList = this.f6683a;
        if (linkedList == null || linkedList.size() <= 0) {
            Iterator<String> it = Utils.readLines(this.b).iterator();
            while (it.hasNext()) {
                try {
                    String str = new String(Encrypt.aesDecrypt(f9.a(it.next()), this.e), "UTF-8");
                    HistoryLocation historyLocation = new HistoryLocation();
                    historyLocation.transformLocation(new JSONObject(str));
                    this.f6683a.add(historyLocation);
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
            }
        }
    }
}
