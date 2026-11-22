package com.anythink.basead.exoplayer.h;

import com.anythink.basead.exoplayer.h.r;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;

/* loaded from: classes11.dex */
final class u implements r, r.a {

    /* renamed from: a, reason: collision with root package name */
    public final r[] f2590a;
    private final h c;
    private r.a e;
    private af f;
    private r[] g;
    private z h;
    private final ArrayList<r> d = new ArrayList<>();
    private final IdentityHashMap<y, Integer> b = new IdentityHashMap<>();

    public u(h hVar, r... rVarArr) {
        this.c = hVar;
        this.f2590a = rVarArr;
        this.h = hVar.a(new z[0]);
    }

    @Override // com.anythink.basead.exoplayer.h.r
    public final void a(r.a aVar, long j) {
        this.e = aVar;
        Collections.addAll(this.d, this.f2590a);
        for (r rVar : this.f2590a) {
            rVar.a(this, j);
        }
    }

    @Override // com.anythink.basead.exoplayer.h.r
    public final void a() {
        for (r rVar : this.f2590a) {
            rVar.a();
        }
    }

    @Override // com.anythink.basead.exoplayer.h.r
    public final af b() {
        return this.f;
    }

    @Override // com.anythink.basead.exoplayer.h.r
    public final long a(com.anythink.basead.exoplayer.i.f[] fVarArr, boolean[] zArr, y[] yVarArr, boolean[] zArr2, long j) {
        com.anythink.basead.exoplayer.i.f[] fVarArr2 = fVarArr;
        int[] iArr = new int[fVarArr2.length];
        int[] iArr2 = new int[fVarArr2.length];
        for (int i = 0; i < fVarArr2.length; i++) {
            y yVar = yVarArr[i];
            iArr[i] = yVar == null ? -1 : this.b.get(yVar).intValue();
            iArr2[i] = -1;
            com.anythink.basead.exoplayer.i.f fVar = fVarArr2[i];
            if (fVar != null) {
                ae f = fVar.f();
                int i2 = 0;
                while (true) {
                    r[] rVarArr = this.f2590a;
                    if (i2 >= rVarArr.length) {
                        break;
                    }
                    if (rVarArr[i2].b().a(f) != -1) {
                        iArr2[i] = i2;
                        break;
                    }
                    i2++;
                }
            }
        }
        this.b.clear();
        int length = fVarArr2.length;
        y[] yVarArr2 = new y[length];
        y[] yVarArr3 = new y[fVarArr2.length];
        com.anythink.basead.exoplayer.i.f[] fVarArr3 = new com.anythink.basead.exoplayer.i.f[fVarArr2.length];
        ArrayList arrayList = new ArrayList(this.f2590a.length);
        long j2 = j;
        int i3 = 0;
        while (i3 < this.f2590a.length) {
            for (int i4 = 0; i4 < fVarArr2.length; i4++) {
                com.anythink.basead.exoplayer.i.f fVar2 = null;
                yVarArr3[i4] = iArr[i4] == i3 ? yVarArr[i4] : null;
                if (iArr2[i4] == i3) {
                    fVar2 = fVarArr2[i4];
                }
                fVarArr3[i4] = fVar2;
            }
            int i5 = i3;
            long a2 = this.f2590a[i3].a(fVarArr3, zArr, yVarArr3, zArr2, j2);
            if (i5 == 0) {
                j2 = a2;
            } else if (a2 != j2) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            int i6 = 0;
            boolean z = false;
            while (i6 < fVarArr2.length) {
                if (iArr2[i6] == i5) {
                    com.anythink.basead.exoplayer.k.a.b(yVarArr3[i6] != null);
                    yVarArr2[i6] = yVarArr3[i6];
                    this.b.put(yVarArr3[i6], Integer.valueOf(i5));
                    z = true;
                } else if (iArr[i6] == i5) {
                    com.anythink.basead.exoplayer.k.a.b(yVarArr3[i6] == null);
                }
                i6++;
                fVarArr2 = fVarArr;
            }
            if (z) {
                arrayList.add(this.f2590a[i5]);
            }
            i3 = i5 + 1;
            fVarArr2 = fVarArr;
        }
        System.arraycopy(yVarArr2, 0, yVarArr, 0, length);
        r[] rVarArr2 = new r[arrayList.size()];
        this.g = rVarArr2;
        arrayList.toArray(rVarArr2);
        this.h = this.c.a(this.g);
        return j2;
    }

    @Override // com.anythink.basead.exoplayer.h.r
    public final void a(long j, boolean z) {
        for (r rVar : this.g) {
            rVar.a(j, z);
        }
    }

    @Override // com.anythink.basead.exoplayer.h.r, com.anythink.basead.exoplayer.h.z
    public final void a_(long j) {
        this.h.a_(j);
    }

    @Override // com.anythink.basead.exoplayer.h.r, com.anythink.basead.exoplayer.h.z
    public final boolean c(long j) {
        if (!this.d.isEmpty()) {
            int size = this.d.size();
            for (int i = 0; i < size; i++) {
                this.d.get(i).c(j);
            }
            return false;
        }
        return this.h.c(j);
    }

    @Override // com.anythink.basead.exoplayer.h.r, com.anythink.basead.exoplayer.h.z
    public final long e() {
        return this.h.e();
    }

    @Override // com.anythink.basead.exoplayer.h.r
    public final long c() {
        long c = this.f2590a[0].c();
        int i = 1;
        while (true) {
            r[] rVarArr = this.f2590a;
            if (i >= rVarArr.length) {
                if (c != -9223372036854775807L) {
                    for (r rVar : this.g) {
                        if (rVar != this.f2590a[0] && rVar.b(c) != c) {
                            throw new IllegalStateException("Unexpected child seekToUs result.");
                        }
                    }
                }
                return c;
            }
            if (rVarArr[i].c() != -9223372036854775807L) {
                throw new IllegalStateException("Child reported discontinuity.");
            }
            i++;
        }
    }

    @Override // com.anythink.basead.exoplayer.h.r, com.anythink.basead.exoplayer.h.z
    public final long d() {
        return this.h.d();
    }

    @Override // com.anythink.basead.exoplayer.h.r
    public final long b(long j) {
        long b = this.g[0].b(j);
        int i = 1;
        while (true) {
            r[] rVarArr = this.g;
            if (i >= rVarArr.length) {
                return b;
            }
            if (rVarArr[i].b(b) != b) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
            i++;
        }
    }

    @Override // com.anythink.basead.exoplayer.h.r
    public final long a(long j, com.anythink.basead.exoplayer.ac acVar) {
        return this.g[0].a(j, acVar);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.anythink.basead.exoplayer.h.r.a
    public final void a(r rVar) {
        this.d.remove(rVar);
        if (this.d.isEmpty()) {
            int i = 0;
            for (r rVar2 : this.f2590a) {
                i += rVar2.b().b;
            }
            ae[] aeVarArr = new ae[i];
            int i2 = 0;
            for (r rVar3 : this.f2590a) {
                af b = rVar3.b();
                int i3 = b.b;
                int i4 = 0;
                while (i4 < i3) {
                    aeVarArr[i2] = b.a(i4);
                    i4++;
                    i2++;
                }
            }
            this.f = new af(aeVarArr);
            this.e.a((r) this);
        }
    }

    private void f() {
        this.e.a((r.a) this);
    }

    @Override // com.anythink.basead.exoplayer.h.z.a
    public final /* bridge */ /* synthetic */ void a(r rVar) {
        this.e.a((r.a) this);
    }
}
