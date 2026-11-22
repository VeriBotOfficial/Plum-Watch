package com.bytedance.sdk.openadsdk.core.rlu.hm;

import com.bykv.vk.openvk.fxn.fxn.fxn.fxn;
import com.bykv.vk.openvk.fxn.fxn.kg.gff.hm;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes14.dex */
public class gff extends hm {
    private final fxn hm;
    private final List<kg> fxn = Collections.synchronizedList(new ArrayList());
    private int kg = 1;
    private int gff = 1;

    public interface kg extends fxn.InterfaceC0445fxn {
        void fxn(int i, int i2);
    }

    static /* synthetic */ int fxn(gff gffVar) {
        int i = gffVar.gff;
        gffVar.gff = i + 1;
        return i;
    }

    public gff() {
        fxn fxnVar = new fxn();
        this.hm = fxnVar;
        super.fxn(fxnVar);
        fxn(500);
    }

    @Override // com.bykv.vk.openvk.fxn.fxn.kg.gff.hm
    public long xdg() {
        return super.xdg() * this.kg;
    }

    @Override // com.bykv.vk.openvk.fxn.fxn.kg.gff.hm
    public long rmu() {
        long rmu = super.rmu();
        return this.kg == 1 ? rmu : rmu + ((this.gff - 1) * super.xdg());
    }

    public void gff(int i) {
        this.kg = Math.max(1, i);
    }

    @Override // com.bykv.vk.openvk.fxn.fxn.kg.gff.hm
    public void fxn(fxn.InterfaceC0445fxn interfaceC0445fxn) {
        if (interfaceC0445fxn instanceof kg) {
            if (this.fxn.contains(interfaceC0445fxn)) {
                return;
            }
            this.fxn.add((kg) interfaceC0445fxn);
            return;
        }
        super.fxn(interfaceC0445fxn);
    }

    public int dx() {
        return this.gff;
    }

    private class fxn implements fxn.InterfaceC0445fxn {
        private fxn() {
        }

        @Override // com.bykv.vk.openvk.fxn.fxn.fxn.fxn.InterfaceC0445fxn
        public void fxn(com.bykv.vk.openvk.fxn.fxn.fxn.fxn fxnVar) {
            gff.fxn(gff.this);
            if (gff.this.gff <= gff.this.kg) {
                Iterator it = gff.this.fxn.iterator();
                while (it.hasNext()) {
                    ((kg) it.next()).fxn(gff.this.gff, gff.this.kg);
                }
                gff.this.jq();
                return;
            }
            Iterator it2 = gff.this.fxn.iterator();
            while (it2.hasNext()) {
                ((kg) it2.next()).fxn(fxnVar);
            }
        }

        @Override // com.bykv.vk.openvk.fxn.fxn.fxn.fxn.InterfaceC0445fxn
        public void fxn(com.bykv.vk.openvk.fxn.fxn.fxn.fxn fxnVar, long j) {
            Iterator it = gff.this.fxn.iterator();
            while (it.hasNext()) {
                ((kg) it.next()).fxn(fxnVar, j);
            }
        }

        @Override // com.bykv.vk.openvk.fxn.fxn.fxn.fxn.InterfaceC0445fxn
        public void kg(com.bykv.vk.openvk.fxn.fxn.fxn.fxn fxnVar) {
            Iterator it = gff.this.fxn.iterator();
            while (it.hasNext()) {
                ((kg) it.next()).kg(fxnVar);
            }
        }

        @Override // com.bykv.vk.openvk.fxn.fxn.fxn.fxn.InterfaceC0445fxn
        public void fxn(com.bykv.vk.openvk.fxn.fxn.fxn.fxn fxnVar, com.bykv.vk.openvk.fxn.fxn.fxn.gff.fxn fxnVar2) {
            Iterator it = gff.this.fxn.iterator();
            while (it.hasNext()) {
                ((kg) it.next()).fxn(fxnVar, fxnVar2);
            }
        }

        @Override // com.bykv.vk.openvk.fxn.fxn.fxn.fxn.InterfaceC0445fxn
        public void fxn(com.bykv.vk.openvk.fxn.fxn.fxn.fxn fxnVar, boolean z) {
            Iterator it = gff.this.fxn.iterator();
            while (it.hasNext()) {
                ((kg) it.next()).fxn(fxnVar, z);
            }
        }

        @Override // com.bykv.vk.openvk.fxn.fxn.fxn.fxn.InterfaceC0445fxn
        public void gff(com.bykv.vk.openvk.fxn.fxn.fxn.fxn fxnVar) {
            Iterator it = gff.this.fxn.iterator();
            while (it.hasNext()) {
                ((kg) it.next()).gff(fxnVar);
            }
        }

        @Override // com.bykv.vk.openvk.fxn.fxn.fxn.fxn.InterfaceC0445fxn
        public void fxn(com.bykv.vk.openvk.fxn.fxn.fxn.fxn fxnVar, int i, int i2) {
            Iterator it = gff.this.fxn.iterator();
            while (it.hasNext()) {
                ((kg) it.next()).fxn(fxnVar, i, i2);
            }
        }

        @Override // com.bykv.vk.openvk.fxn.fxn.fxn.fxn.InterfaceC0445fxn
        public void fxn(com.bykv.vk.openvk.fxn.fxn.fxn.fxn fxnVar, int i, int i2, int i3) {
            Iterator it = gff.this.fxn.iterator();
            while (it.hasNext()) {
                ((kg) it.next()).fxn(fxnVar, i, i2, i3);
            }
        }

        @Override // com.bykv.vk.openvk.fxn.fxn.fxn.fxn.InterfaceC0445fxn
        public void fxn(com.bykv.vk.openvk.fxn.fxn.fxn.fxn fxnVar, int i) {
            Iterator it = gff.this.fxn.iterator();
            while (it.hasNext()) {
                ((kg) it.next()).fxn(fxnVar, i);
            }
        }

        @Override // com.bykv.vk.openvk.fxn.fxn.fxn.fxn.InterfaceC0445fxn
        public void kg(com.bykv.vk.openvk.fxn.fxn.fxn.fxn fxnVar, int i) {
            Iterator it = gff.this.fxn.iterator();
            while (it.hasNext()) {
                ((kg) it.next()).kg(fxnVar, i);
            }
        }

        @Override // com.bykv.vk.openvk.fxn.fxn.fxn.fxn.InterfaceC0445fxn
        public void fxn(com.bykv.vk.openvk.fxn.fxn.fxn.fxn fxnVar, long j, long j2) {
            Iterator it = gff.this.fxn.iterator();
            while (it.hasNext()) {
                ((kg) it.next()).fxn(fxnVar, j, j2);
            }
        }

        @Override // com.bykv.vk.openvk.fxn.fxn.fxn.fxn.InterfaceC0445fxn
        public void hm(com.bykv.vk.openvk.fxn.fxn.fxn.fxn fxnVar) {
            Iterator it = gff.this.fxn.iterator();
            while (it.hasNext()) {
                ((kg) it.next()).hm(fxnVar);
            }
        }

        @Override // com.bykv.vk.openvk.fxn.fxn.fxn.fxn.InterfaceC0445fxn
        public void rb(com.bykv.vk.openvk.fxn.fxn.fxn.fxn fxnVar) {
            Iterator it = gff.this.fxn.iterator();
            while (it.hasNext()) {
                ((kg) it.next()).rb(fxnVar);
            }
        }
    }
}
