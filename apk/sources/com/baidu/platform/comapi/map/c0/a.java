package com.baidu.platform.comapi.map.c0;

import android.view.MotionEvent;
import androidx.camera.video.AudioStats;

/* JADX INFO: compiled from: Base.java */
/* JADX INFO: loaded from: classes15.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0486a f8621a = new C0486a(new b(AudioStats.AUDIO_AMPLITUDE_NONE, AudioStats.AUDIO_AMPLITUDE_NONE), new b(1.0d, AudioStats.AUDIO_AMPLITUDE_NONE));
    public static final C0486a b = new C0486a(new b(AudioStats.AUDIO_AMPLITUDE_NONE, AudioStats.AUDIO_AMPLITUDE_NONE), new b(AudioStats.AUDIO_AMPLITUDE_NONE, 1.0d));
    public static final C0486a c = new C0486a(new b(AudioStats.AUDIO_AMPLITUDE_NONE, 1.0d), new b(AudioStats.AUDIO_AMPLITUDE_NONE, AudioStats.AUDIO_AMPLITUDE_NONE));

    /* JADX INFO: renamed from: com.baidu.platform.comapi.map.c0.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: Base.java */
    public static class C0486a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public b f8622a;
        public b b;

        public C0486a(b bVar, b bVar2) {
            this.f8622a = bVar;
            this.b = bVar2;
        }

        public b a() {
            b bVar = this.f8622a;
            double d = bVar.f8623a;
            b bVar2 = this.b;
            return new b((d + bVar2.f8623a) / 2.0d, (bVar.b + bVar2.b) / 2.0d);
        }

        public double b() {
            b bVar = this.f8622a;
            double d = bVar.f8623a;
            b bVar2 = this.b;
            double d2 = d - bVar2.f8623a;
            double d3 = bVar.b - bVar2.b;
            return Math.sqrt((d2 * d2) + (d3 * d3));
        }

        public d c() {
            b bVar = this.b;
            double d = bVar.f8623a;
            b bVar2 = this.f8622a;
            return new d(d - bVar2.f8623a, bVar.b - bVar2.b);
        }

        public String toString() {
            return C0486a.class.getSimpleName() + "  a : " + this.f8622a.toString() + " b : " + this.b.toString();
        }

        public static C0486a a(MotionEvent motionEvent) {
            return new C0486a(new b(motionEvent.getX(0), motionEvent.getY(0)), new b(motionEvent.getX(1), motionEvent.getY(1)));
        }
    }

    /* JADX INFO: compiled from: Base.java */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public double f8623a;
        public double b;

        public b(double d, double d2) {
            this.f8623a = d;
            this.b = d2;
        }

        public String toString() {
            return b.class.getSimpleName() + " x : " + this.f8623a + " y : " + this.b;
        }
    }

    /* JADX INFO: compiled from: Base.java */
    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final double f8624a;
        public final double b;
        public final d c;

        public c(C0486a c0486a, C0486a c0486a2) {
            this.c = new d(c0486a.a(), c0486a2.a());
            this.b = c0486a2.b() / c0486a.b();
            this.f8624a = d.a(c0486a.c(), c0486a2.c());
        }

        public String toString() {
            return c.class.getSimpleName() + " rotate : " + this.f8624a + " scale : " + (this.b * 100.0d) + " move : " + this.c.toString();
        }
    }

    /* JADX INFO: compiled from: Base.java */
    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public double f8625a;
        public double b;

        public d(double d, double d2) {
            this.f8625a = d;
            this.b = d2;
        }

        public static double a(d dVar, d dVar2) {
            double dAtan2 = Math.atan2(dVar.b, dVar.f8625a) - Math.atan2(dVar2.b, dVar2.f8625a);
            if (dAtan2 > 3.141592653589793d) {
                dAtan2 -= 6.283185307179586d;
            } else if (dAtan2 < -3.141592653589793d) {
                dAtan2 += 6.283185307179586d;
            }
            return (dAtan2 * 180.0d) / 3.141592653589793d;
        }

        public String toString() {
            return d.class.getSimpleName() + " x : " + this.f8625a + " y : " + this.b;
        }

        public d(b bVar, b bVar2) {
            this.f8625a = bVar2.f8623a - bVar.f8623a;
            this.b = bVar2.b - bVar.b;
        }
    }
}
