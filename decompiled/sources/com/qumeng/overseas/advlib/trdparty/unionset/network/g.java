package com.qumeng.overseas.advlib.trdparty.unionset.network;

/* loaded from: classes17.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    public String f13415a;
    public long b;
    public int c = 0;
    public String d;
    public int e;
    SlotIDConfigEntity f;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private g f13416a = new g();
        private l b;

        public a(l lVar) {
            this.b = lVar;
        }

        public a adslotid(String str) {
            this.f13416a.f13415a = str;
            return this;
        }

        public g build() {
            int adType = this.b.g().getAdType();
            if (adType == 4) {
                this.f13416a.c = 12;
            } else if (adType == 6) {
                this.f13416a.c = 6;
            }
            return this.f13416a;
        }

        public a slotIDConfigEntity(SlotIDConfigEntity slotIDConfigEntity) {
            this.f13416a.f = slotIDConfigEntity;
            return this;
        }

        public a timeout(long j) {
            this.f13416a.b = j;
            return this;
        }
    }
}
