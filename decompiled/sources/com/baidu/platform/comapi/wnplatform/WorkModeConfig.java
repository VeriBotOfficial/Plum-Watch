package com.baidu.platform.comapi.wnplatform;

import com.baidu.platform.comapi.walknavi.b;

/* loaded from: classes13.dex */
public class WorkModeConfig {

    /* renamed from: a, reason: collision with root package name */
    private int f8880a;
    private int b;
    private int c;
    private boolean d;
    private int e;

    public static class EngineNavMode {
    }

    public static class EngineNaviScene {
    }

    public static class ExtraWorkMode {
    }

    public static class GpsRecordStatus {
    }

    static class Holder {

        /* renamed from: a, reason: collision with root package name */
        static final WorkModeConfig f8881a = new WorkModeConfig();

        Holder() {
        }
    }

    public static class LaunchFroms {
    }

    public static class SDKNaviType {
    }

    public static WorkModeConfig b() {
        return Holder.f8881a;
    }

    public int a() {
        return this.b;
    }

    public void c(int i) {
        this.f8880a = i;
    }

    public boolean d() {
        return (this.b & 2) == 2;
    }

    public boolean e() {
        int i = this.f8880a;
        return i == 1 || i == 2;
    }

    public boolean f() {
        return (this.b & 4) == 4;
    }

    public boolean g() {
        return (this.b & 16) == 16;
    }

    public boolean h() {
        return (this.b & 1) == 1;
    }

    public boolean i() {
        return this.d;
    }

    public boolean j() {
        return this.f8880a == 0;
    }

    private WorkModeConfig() {
        this.e = 0;
    }

    public void a(int i) {
        this.b = i;
        if (b().i()) {
            return;
        }
        this.b &= -5;
    }

    public void b(int i) {
        this.c = i;
    }

    public int c() {
        return this.c;
    }

    public void a(boolean z) {
        this.d = z;
        b.n().s().f(z);
    }
}
