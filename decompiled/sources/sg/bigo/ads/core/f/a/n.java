package sg.bigo.ads.core.f.a;

/* loaded from: classes9.dex */
public class n {

    /* renamed from: a, reason: collision with root package name */
    private boolean f20041a;
    public final String b;
    public boolean c;
    public boolean d;

    public n(String str) {
        this.d = false;
        this.f20041a = true;
        this.b = str;
    }

    public n(String str, byte b) {
        this(str);
        this.d = true;
    }

    public String toString() {
        return "{\"Content\":\"" + this.b + "\"}";
    }
}
