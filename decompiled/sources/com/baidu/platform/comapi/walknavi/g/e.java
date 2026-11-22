package com.baidu.platform.comapi.walknavi.g;

import android.os.Handler;
import com.baidu.ar.npc.BaiduArView;
import com.baidu.platform.comapi.walknavi.g.f;
import java.io.File;

/* compiled from: NpcSDKManager.java */
/* loaded from: classes13.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private static Handler f8712a = new Handler();
    private static final String b = "e";
    private f c;
    final Runnable d;

    /* compiled from: NpcSDKManager.java */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            e.this.c.a("\nlocal token = dfk7fghdsf7d33e\nlocal pod_name = \"turnAndGuide\"\n\nfunction run()\nlocal cfg = an.ActionPriorityConfig:new()\ncfg.forward_logic = 1\ncfg.backward_logic = 0\nlocal param = an.GpbAnimationParam:new()\nparam._speed = 1.0\nparam._repeat_count = 1\nparam._name = pod_name\nlocal id_play_pod = pod_node:play_gpb_animation(param, cfg)\nif id_play_pod == -1 then\nlocal mapData = an.MapData:new()\nmapData:put_string(\"action_type\", \"animation_failed\")\nmapData:put_string(\"token\", token)\nlua_handler:send_message_tosdk(mapData)\nreturn\nend\nlocal podFinishedHandlerId = lua_handler:register_handle(\"onTurnAndGuidePlayPodFinished\")\npod_node:set_action_completion_handler(id_play_pod, podFinishedHandlerId)\nend\nrun()\nfunction onTurnAndGuidePlayPodFinished(state, action_id)\n    local mapData = an.MapData:new()\n    mapData:put_string(\"action_id\", action_id)\n    mapData:put_string(\"action_type\", \"animation_end\")\n    mapData:put_string(\"action_name\", \"turnAndGuide\")\n    mapData:put_string(\"token\", token)\n    mapData:put_int(\"state\", state)\n    lua_handler:send_message_tosdk(mapData)\nend\n", "turnAndGuide");
        }
    }

    /* compiled from: NpcSDKManager.java */
    private static class b {

        /* renamed from: a, reason: collision with root package name */
        static final e f8714a = new e(null);
    }

    /* synthetic */ e(a aVar) {
        this();
    }

    public static e d() {
        return b.f8714a;
    }

    public void b(String str, c cVar) {
        this.c.a(str, cVar);
    }

    public String c() {
        return this.c.c();
    }

    public void e(String str) {
        this.c.c(str);
    }

    public boolean f() {
        return this.c.e();
    }

    public boolean g() {
        return this.c.f();
    }

    public boolean h() {
        return this.c.g();
    }

    public void i() {
        if (this.c.e()) {
            this.c.h();
        }
    }

    public void j() {
        if (this.c.e()) {
            this.c.i();
        }
    }

    public void k() {
        if (this.c.e()) {
            this.c.k();
        }
    }

    public void l() {
        if (this.c.e()) {
            this.c.j();
        }
    }

    public void m() {
        if (this.c.e()) {
            this.c.l();
        }
    }

    public void n() {
        this.c.m();
    }

    public void o() {
        this.c.b(true);
        this.c.a(h.a(-90.0d), 0.0d, 0.0d, "mapNPC");
        this.c.b(false);
    }

    private e() {
        this.d = new a();
        this.c = new f();
    }

    public void a(com.baidu.platform.comapi.walknavi.g.b bVar) {
        this.c.a(bVar);
    }

    public void b(String str, String str2) {
        Runnable runnable;
        Handler handler = f8712a;
        if (handler != null && (runnable = this.d) != null) {
            handler.removeCallbacks(runnable);
        }
        this.c.a(str, str2);
        f8712a.postDelayed(this.d, 30000L);
    }

    public boolean c(String str) {
        return !d().b(d().d(str));
    }

    public String d(String str) {
        return this.c.b(str);
    }

    public boolean e() {
        return this.c.d();
    }

    public void a(String str, String str2) {
        Runnable runnable;
        Handler handler = f8712a;
        if (handler != null && (runnable = this.d) != null) {
            handler.removeCallbacks(runnable);
        }
        this.c.a(str, str2);
    }

    public void c(boolean z) {
        this.c.c(z);
    }

    public boolean a(String str) {
        return this.c.a(str);
    }

    public void a(boolean z) {
        this.c.a(z);
    }

    public void b(boolean z) {
        this.c.b(z);
    }

    public void a(double d, double d2, double d3) {
        this.c.a(d, d2, d3, "mapNPC");
    }

    public BaiduArView b() {
        return this.c.b();
    }

    public void a(String str, c cVar) {
        this.c.b(str, cVar);
    }

    public boolean b(String str) {
        try {
            return new File(str).exists();
        } catch (Exception unused) {
            return false;
        }
    }

    public void a() {
        this.c.a();
    }

    public boolean a(String str, boolean z) {
        return this.c.a(str, z);
    }

    public void a(f.c cVar) {
        com.baidu.platform.comapi.wnplatform.d.a.c(b, "setNpcManagerStatusListener:" + cVar);
        this.c.a(cVar);
    }
}
