package com.baidu.platform.comapi.walknavi.g.i;

import android.content.Context;
import android.text.TextUtils;
import com.baidu.ar.npc.ArBridge;
import com.baidu.ar.npc.BaiduArView;
import com.yandex.div.core.DivActionHandler;
import java.util.HashMap;

/* compiled from: ARManager.java */
/* loaded from: classes13.dex */
public class c implements ArBridge.MessageHandler {

    /* renamed from: a, reason: collision with root package name */
    private Context f8726a;
    private BaiduArView b;
    private com.baidu.platform.comapi.walknavi.g.i.f.a c;
    private boolean d = false;
    private boolean e = false;

    /* compiled from: ARManager.java */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Thread.sleep(200L);
                com.baidu.platform.comapi.walknavi.g.i.i.a.b().a();
            } catch (Exception e) {
                com.baidu.platform.comapi.walknavi.g.i.k.a.a("statistic exception when destroy: " + e.getMessage());
            }
        }
    }

    public c(Context context, com.baidu.platform.comapi.walknavi.g.i.f.a aVar) {
        this.f8726a = context.getApplicationContext();
        this.c = aVar;
    }

    public void a() {
        com.baidu.platform.comapi.walknavi.g.i.k.a.a("destroy");
        this.d = true;
        BaiduArView baiduArView = this.b;
        if (baiduArView != null) {
            baiduArView.onPause();
        }
        ArBridge.getInstance().removeMessageHandeler(this);
        ArBridge.getInstance().destroyCase();
        com.baidu.platform.comapi.walknavi.g.i.i.a.b().a("end_ar");
        new Thread(new a()).start();
    }

    public BaiduArView b() {
        if (this.b == null) {
            this.b = new BaiduArView(this.f8726a);
        }
        return this.b;
    }

    public void c() {
        com.baidu.platform.comapi.walknavi.g.i.k.a.a("pause");
        this.d = true;
        BaiduArView baiduArView = this.b;
        if (baiduArView != null) {
            baiduArView.onPause();
        }
    }

    public void d() {
        com.baidu.platform.comapi.walknavi.g.i.k.a.a("pauseByUser");
        this.d = true;
        ArBridge.getInstance().onPauseByUser();
    }

    public void e() {
        com.baidu.platform.comapi.walknavi.g.i.k.a.a("resume");
        this.d = false;
        BaiduArView baiduArView = this.b;
        if (baiduArView != null) {
            baiduArView.onResume();
        }
    }

    public void f() {
        com.baidu.platform.comapi.walknavi.g.i.k.a.a("resumeByUser");
        this.d = false;
        ArBridge.getInstance().onResumeByUser();
    }

    @Override // com.baidu.ar.npc.ArBridge.MessageHandler
    public void handleMessage(int i, int i2, HashMap<String, Object> hashMap) {
        com.baidu.platform.comapi.walknavi.g.i.k.a.a("aMessageType = " + i + ", aParams = " + hashMap);
        com.baidu.platform.comapi.walknavi.g.i.f.a aVar = this.c;
        if (aVar == null) {
            com.baidu.platform.comapi.walknavi.g.i.k.a.a("ARCallback is null");
            return;
        }
        if (i == 9) {
            if (hashMap != null) {
                try {
                    if (Integer.parseInt(String.valueOf(hashMap.get("succeeded"))) == 1) {
                        this.e = true;
                    }
                } catch (Exception e) {
                    com.baidu.platform.comapi.walknavi.g.i.k.a.a("MSG_CASE_INIT_COMPLETED error: " + e.getMessage());
                }
            }
            this.c.a(1, hashMap);
            return;
        }
        if (i == 1001) {
            aVar.a(4, hashMap);
            return;
        }
        if (i == 1003) {
            aVar.a(5, hashMap);
            return;
        }
        if (i == 1005) {
            aVar.a(6, hashMap);
            return;
        }
        if (i == 1007) {
            aVar.a(7, hashMap);
            return;
        }
        if (i != 1901) {
            return;
        }
        if (DivActionHandler.DivActionReason.ANIMATION_END.equalsIgnoreCase(hashMap.get("action_type").toString())) {
            this.c.a(2, hashMap);
        } else if ("click".equalsIgnoreCase(hashMap.get("action_type").toString())) {
            this.c.a(3, hashMap);
        } else if ("animation_failed".equalsIgnoreCase(hashMap.get("action_type").toString())) {
            this.c.a(8, hashMap);
        }
    }

    public void a(String str, String str2) {
        com.baidu.platform.comapi.walknavi.g.i.k.a.a("runScript, mIsPaused=" + this.d + ", mInitCompleted=" + this.e);
        if (this.d || !this.e) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            com.baidu.platform.comapi.walknavi.g.i.k.a.a("lua is null");
        } else {
            com.baidu.platform.comapi.walknavi.g.i.k.a.a("runScript, lua: " + str);
            ArBridge.getInstance().sendLuaScriptToEngine(str.replace("dfk7fghdsf7d33e", str2));
        }
    }

    public void a(float f, float f2, float f3, String str) {
        com.baidu.platform.comapi.walknavi.g.i.k.a.a("setEuler, mIsPaused=" + this.d + ", mInitCompleted=" + this.e);
        if (this.d || !this.e) {
            return;
        }
        ArBridge.getInstance().setEuler(f, f2, f3, str);
    }

    public void a(float f) {
        com.baidu.platform.comapi.walknavi.g.i.k.a.a("setFrustum, mIsPaused=" + this.d + ", mInitCompleted=" + this.e);
        if (this.d || !this.e) {
            return;
        }
        float width = (b().getWidth() == 0 || b().getHeight() == 0) ? 0.0f : b().getWidth() / b().getHeight();
        com.baidu.platform.comapi.walknavi.g.i.k.a.a("setFrustum, aspect=" + width);
        ArBridge.getInstance().setFrustum(f, width);
    }
}
