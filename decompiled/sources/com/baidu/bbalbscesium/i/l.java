package com.baidu.bbalbscesium.i;

import com.baidu.bbalbscesium.i.i;
import java.lang.reflect.Method;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes12.dex */
final class l extends k {
    public static final int i = 8;
    private b h;

    private static class b {

        /* renamed from: a, reason: collision with root package name */
        private Class f7394a;
        private Method b;
        private Method c;

        private b() {
            a();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long a(Object obj) throws i.a {
            try {
                return ((Long) this.c.invoke(obj, new Object[0])).longValue();
            } catch (Exception unused) {
                throw new i.a("");
            }
        }

        private void a() {
            try {
                this.f7394a = Class.forName(i.a(h.b()), true, Object.class.getClassLoader());
                this.b = i.a(this.f7394a, i.a(h.h()), new Class[]{byte[].class, Integer.TYPE, Integer.TYPE});
                this.c = i.a(this.f7394a, i.a(h.c()), null);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(Object obj, byte[] bArr, int i, int i2) throws i.a {
            try {
                this.b.invoke(obj, bArr, Integer.valueOf(i), Integer.valueOf(i2));
            } catch (Exception unused) {
                throw new i.a("");
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Object b() throws Exception {
            return this.f7394a.newInstance();
        }
    }

    public l(int i2, int i3) {
        this.f7393a = j.d;
        this.b = 4;
        this.c = 32;
        this.d = i2;
        this.e = i3;
        this.h = new b();
    }

    @Override // com.baidu.bbalbscesium.i.k
    public com.baidu.bbalbscesium.i.b a(byte[] bArr, int i2, int i3) {
        long j;
        try {
            Object b2 = this.h.b();
            this.h.a(b2, bArr, i2, i3);
            j = this.h.a(b2);
        } catch (Exception unused) {
            j = BodyPartID.bodyIdMax;
        }
        return com.baidu.bbalbscesium.i.b.a(new long[]{j});
    }
}
