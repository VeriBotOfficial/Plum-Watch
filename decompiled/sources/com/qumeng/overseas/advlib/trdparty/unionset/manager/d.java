package com.qumeng.overseas.advlib.trdparty.unionset.manager;

import com.qumeng.overseas.advlib.__remote__.utils.n;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes17.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private final String f13393a;
    private final ConcurrentHashMap<String, Boolean> b;

    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        private static final d f13394a = new d();

        private b() {
        }
    }

    public static d a() {
        return b.f13394a;
    }

    public boolean b(String str) {
        if (com.qumeng.overseas.advlib.trdparty.unionset.utils.b.a(str)) {
            n.b("AdSpeedManager", "[isRq] rqId isEmpty", new Object[0]);
            return false;
        }
        Boolean bool = this.b.get(str);
        if (bool != null) {
            n.a("AdSpeedManager", "[isRq] rqId is: " + str + " , isRq: " + bool, new Object[0]);
            return bool.booleanValue();
        }
        n.b("AdSpeedManager", "[isRq] isRq null , rqId is: " + str, new Object[0]);
        return false;
    }

    public void c(String str) {
        try {
            if (com.qumeng.overseas.advlib.trdparty.unionset.utils.b.b((Map<?, ?>) this.b)) {
                this.b.remove(str);
            }
        } catch (Throwable th) {
            n.b("AdSpeedManager", "[recycle] throwable " + th.getMessage(), new Object[0]);
        }
    }

    private d() {
        this.f13393a = "AdSpeedManager";
        this.b = new ConcurrentHashMap<>();
    }

    public void a(String str, boolean z) {
        if (com.qumeng.overseas.advlib.trdparty.unionset.utils.b.a(str)) {
            n.b("AdSpeedManager", "[setRq] rqId isEmpty", new Object[0]);
        } else {
            n.a("AdSpeedManager", "[setRq] rqId is: " + str + " , isRq: " + z, new Object[0]);
            this.b.put(str, Boolean.valueOf(z));
        }
    }

    public boolean a(String str) {
        if (com.qumeng.overseas.advlib.trdparty.unionset.utils.b.a(str)) {
            n.b("AdSpeedManager", "[consumeRq] rqId isEmpty", new Object[0]);
            return false;
        }
        boolean replace = this.b.replace(str, Boolean.TRUE, Boolean.FALSE);
        n.a("AdSpeedManager", "[consumeRq] rqId is: " + str + " , consumed: " + replace, new Object[0]);
        return replace;
    }
}
