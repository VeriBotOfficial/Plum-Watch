package com.baidu.platform.comapi.wnplatform.model.datastruct;

/* compiled from: WSensorData.java */
/* loaded from: classes13.dex */
public class a implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public double f8930a;
    public double b;
    public double c;
    public double d;
    public double e;
    public double f;
    public double g;

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public a clone() {
        a aVar = new a();
        synchronized (this) {
            aVar.f8930a = this.f8930a;
            aVar.b = this.b;
            aVar.c = this.c;
            aVar.d = this.d;
            aVar.e = this.e;
            aVar.f = this.f;
            aVar.g = this.g;
        }
        return aVar;
    }

    public String toString() {
        return String.format("SensorData {accx:%1$f accy:%2$f accz:%3$f heading:%4$f pitch:%5$f roll:%6$f}", Double.valueOf(this.f8930a), Double.valueOf(this.b), Double.valueOf(this.c), Double.valueOf(this.d), Double.valueOf(this.e), Double.valueOf(this.f));
    }
}
