package com.bykv.vk.openvk.fxn.fxn.kg.gff;

import android.graphics.SurfaceTexture;
import android.media.PlaybackParams;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseIntArray;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.bykv.vk.openvk.fxn.fxn.fxn.fxn;
import com.bykv.vk.openvk.fxn.fxn.kg.gff.gff;
import com.bytedance.sdk.component.tw.jq;
import com.bytedance.sdk.component.utils.dx;
import com.bytedance.sdk.component.utils.mve;
import java.io.File;
import java.io.FileInputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* loaded from: classes13.dex */
public class hm implements com.bykv.vk.openvk.fxn.fxn.fxn.fxn, gff.bh, gff.fxn, gff.InterfaceC0448gff, gff.hm, gff.kg, gff.rb, gff.sg, mve.fxn {
    private static final SparseIntArray fxn = new SparseIntArray();
    private SurfaceHolder bh;
    private ArrayList<Runnable> bx;
    private volatile boolean ij;
    private boolean jz;
    private boolean mve;
    private boolean mvp;
    private SurfaceTexture rb;
    private boolean rlu;
    private mve xdg;
    private final boolean kg = false;
    private final List<WeakReference<fxn.InterfaceC0445fxn>> gff = new CopyOnWriteArrayList();
    private final fxn hm = new fxn();

    /* renamed from: sg, reason: collision with root package name */
    private int f9085sg = 0;
    private int tw = 3;
    private boolean jq = false;
    private volatile gff hie = null;
    private boolean dgx = false;
    private volatile int zu = 201;
    private long ckl = -1;
    private boolean rmu = false;
    private long je = 0;
    private long ud = Long.MIN_VALUE;
    private long dx = 0;
    private long ums = 0;
    private long iwp = 0;
    private int uhw = 0;
    private String ke = "0";
    private com.bykv.vk.openvk.fxn.fxn.fxn.gff.gff zn = null;
    private boolean ggo = false;
    private CountDownLatch ax = new CountDownLatch(1);
    private volatile int ci = 200;
    private AtomicBoolean rz = new AtomicBoolean(false);
    private Surface ils = null;
    private long yws = 0;
    private long swx = 0;
    private boolean qhf = false;
    private final Runnable wc = new Runnable() { // from class: com.bykv.vk.openvk.fxn.fxn.kg.gff.hm.1
        @Override // java.lang.Runnable
        public void run() {
            if (hm.this.hie == null) {
                return;
            }
            long rmu = hm.this.rmu();
            if (rmu > 0 && hm.this.bh() && hm.this.ud != Long.MIN_VALUE) {
                try {
                    if (hm.this.ud == rmu) {
                        if (!hm.this.rmu && hm.this.dx >= 400) {
                            hm.this.kg(701, 800);
                            hm.this.rmu = true;
                        }
                        hm.this.dx += hm.this.ci;
                    } else {
                        if (hm.this.rmu) {
                            hm.this.je += hm.this.dx;
                            hm.this.kg(702, 800);
                            new Object[]{"handleMsg:  bufferingDuration =", Long.valueOf(hm.this.je), "  bufferCount =", Integer.valueOf(hm.this.f9085sg)};
                        }
                        hm.this.dx = 0L;
                        hm.this.rmu = false;
                    }
                } catch (Throwable th) {
                    th.getMessage();
                }
            }
            if (hm.this.xdg() > 0) {
                if (hm.this.ud != rmu) {
                    if (com.bykv.vk.openvk.fxn.fxn.fxn.gff.rb()) {
                        new Object[]{"run: lastCur = ", Long.valueOf(hm.this.ud), "  curPosition = ", Long.valueOf(rmu)};
                    }
                    hm hmVar = hm.this;
                    hmVar.fxn(rmu, hmVar.xdg());
                }
                hm.this.ud = rmu;
            }
            if (!hm.this.kg()) {
                if (hm.this.xdg != null) {
                    hm.this.xdg.postDelayed(this, hm.this.ci);
                }
            } else {
                hm hmVar2 = hm.this;
                hmVar2.fxn(hmVar2.xdg(), hm.this.xdg());
            }
        }
    };

    private boolean fxn(int i, int i2) {
        boolean z = i == -1010 || i == -1007 || i == -1004 || i == -110 || i == 100 || i == 200;
        if (i2 == 1 || i2 == 700 || i2 == 800) {
            return true;
        }
        return z;
    }

    public hm() {
        fxn("SSMediaPlayerWrapper");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fxn(long j, long j2) {
        long j3;
        long j4;
        for (WeakReference<fxn.InterfaceC0445fxn> weakReference : this.gff) {
            if (weakReference == null || weakReference.get() == null) {
                j3 = j;
                j4 = j2;
            } else {
                j3 = j;
                j4 = j2;
                weakReference.get().fxn(this, j3, j4);
            }
            j = j3;
            j2 = j4;
        }
    }

    private void fxn(String str) {
        this.uhw = 0;
        this.xdg = com.bytedance.sdk.component.tw.fxn.fxn.fxn().fxn(this, jq.THREAD_NAME_PRE.concat(String.valueOf(str)));
        this.qhf = true;
        ums();
    }

    private void dx() {
        this.je = 0L;
        this.f9085sg = 0;
        this.dx = 0L;
        this.rmu = false;
        this.ud = Long.MIN_VALUE;
    }

    public void fxn(final boolean z) {
        if (tw()) {
            return;
        }
        this.mve = z;
        if (this.hie != null) {
            this.hie.fxn(z);
            return;
        }
        mve mveVar = this.xdg;
        if (mveVar != null) {
            mveVar.post(new Runnable() { // from class: com.bykv.vk.openvk.fxn.fxn.kg.gff.hm.9
                @Override // java.lang.Runnable
                public void run() {
                    if (hm.this.hie != null) {
                        hm.this.hie.fxn(z);
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ums() {
        mve mveVar = this.xdg;
        if (mveVar != null) {
            mveVar.post(new Runnable() { // from class: com.bykv.vk.openvk.fxn.fxn.kg.gff.hm.10
                @Override // java.lang.Runnable
                public void run() {
                    if (hm.this.hie == null) {
                        try {
                            hm.this.hie = new kg();
                        } catch (Throwable th) {
                            th.getMessage();
                        }
                        if (hm.this.hie == null) {
                            return;
                        }
                        gff unused = hm.this.hie;
                        hm.this.ke = "0";
                        hm.this.hie.fxn((gff.rb) hm.this);
                        hm.this.hie.fxn((gff.kg) hm.this);
                        hm.this.hie.fxn((gff.InterfaceC0448gff) hm.this);
                        hm.this.hie.fxn((gff.fxn) hm.this);
                        hm.this.hie.fxn((gff.bh) hm.this);
                        hm.this.hie.fxn((gff.hm) hm.this);
                        hm.this.hie.fxn((gff.sg) hm.this);
                        try {
                            hm.this.hie.gff(false);
                        } catch (Throwable unused2) {
                        }
                        hm.this.dgx = false;
                    }
                }
            });
        }
    }

    public void jq() {
        if (tw() || this.hie == null) {
            return;
        }
        this.rz.set(true);
        if (this.zu != 206) {
            dx();
            this.ij = false;
            this.hm.fxn(true);
            kg(0L);
            mve mveVar = this.xdg;
            if (mveVar != null) {
                mveVar.removeCallbacks(this.wc);
                this.xdg.postDelayed(this.wc, this.ci);
            }
        }
        this.ax.countDown();
    }

    public void fxn(boolean z, long j, boolean z2) {
        if (tw()) {
            return;
        }
        ums();
        this.ggo = z2;
        this.rz.set(true);
        this.ij = false;
        kg(z2);
        if (z) {
            this.ckl = j;
            iwp();
        } else {
            kg(j);
        }
        mve mveVar = this.xdg;
        if (mveVar != null) {
            mveVar.removeCallbacks(this.wc);
            this.xdg.postDelayed(this.wc, this.ci);
        }
        this.ax.countDown();
    }

    private void kg(long j) {
        this.hm.fxn(j);
        if (this.mve) {
            kg(this.hm);
        } else if (kg(this.zn)) {
            kg(this.hm);
        } else {
            fxn(this.hm);
        }
    }

    private boolean kg(com.bykv.vk.openvk.fxn.fxn.fxn.gff.gff gffVar) {
        return gffVar != null && gffVar.sg();
    }

    public void hie() {
        if (tw() || this.xdg == null) {
            return;
        }
        this.rz.set(true);
        this.xdg.post(new Runnable() { // from class: com.bykv.vk.openvk.fxn.fxn.kg.gff.hm.11
            @Override // java.lang.Runnable
            public void run() {
                if (!hm.this.sg() || hm.this.hie == null) {
                    return;
                }
                try {
                    hm.this.hie.bh();
                    for (WeakReference weakReference : hm.this.gff) {
                        if (weakReference != null && weakReference.get() != null) {
                            ((fxn.InterfaceC0445fxn) weakReference.get()).rb(hm.this);
                        }
                    }
                    hm.this.zu = 206;
                } catch (Throwable th) {
                    new Object[]{"play: catch exception ", th.getMessage()};
                }
            }
        });
    }

    public void dgx() {
        mve mveVar;
        if (tw() || (mveVar = this.xdg) == null) {
            return;
        }
        mveVar.removeMessages(100);
        this.ij = true;
        if (!this.qhf) {
            if (this.jz || kg(this.zn)) {
                mve mveVar2 = this.xdg;
                if (mveVar2 != null) {
                    mveVar2.sendEmptyMessage(101);
                    return;
                }
                return;
            }
            fxn(new Runnable() { // from class: com.bykv.vk.openvk.fxn.fxn.kg.gff.hm.12
                @Override // java.lang.Runnable
                public void run() {
                    if (hm.this.xdg != null) {
                        hm.this.xdg.sendEmptyMessage(101);
                    }
                }
            });
            return;
        }
        if (this.jq || kg(this.zn)) {
            mve mveVar3 = this.xdg;
            if (mveVar3 != null) {
                mveVar3.sendEmptyMessage(101);
                return;
            }
            return;
        }
        fxn(new Runnable() { // from class: com.bykv.vk.openvk.fxn.fxn.kg.gff.hm.13
            @Override // java.lang.Runnable
            public void run() {
                if (hm.this.xdg != null) {
                    hm.this.xdg.sendEmptyMessage(101);
                }
            }
        });
    }

    public void mvp() {
        if (tw()) {
            return;
        }
        this.rlu = true;
        ax();
        mve mveVar = this.xdg;
        if (mveVar != null) {
            try {
                mveVar.removeCallbacksAndMessages(null);
                if (this.hie != null) {
                    this.xdg.sendEmptyMessage(103);
                }
                bx();
            } catch (Throwable unused) {
                bx();
            }
        }
    }

    private void iwp() {
        kg(new Runnable() { // from class: com.bykv.vk.openvk.fxn.fxn.kg.gff.hm.14
            @Override // java.lang.Runnable
            public void run() {
                if (hm.this.xdg != null) {
                    hm.this.xdg.sendEmptyMessage(104);
                }
            }
        });
    }

    public void fxn(final long j) {
        if (tw()) {
            return;
        }
        if (this.zu == 207 || this.zu == 206 || this.zu == 209) {
            kg(new Runnable() { // from class: com.bykv.vk.openvk.fxn.fxn.kg.gff.hm.2
                @Override // java.lang.Runnable
                public void run() {
                    if (hm.this.xdg != null) {
                        hm.this.xdg.obtainMessage(106, Long.valueOf(j)).sendToTarget();
                    }
                }
            });
        }
    }

    @Override // com.bykv.vk.openvk.fxn.fxn.fxn.fxn
    public boolean fxn() {
        return this.jq;
    }

    public void fxn(final SurfaceTexture surfaceTexture) {
        if (tw()) {
            return;
        }
        this.rb = surfaceTexture;
        fxn(true);
        kg(new Runnable() { // from class: com.bykv.vk.openvk.fxn.fxn.kg.gff.hm.3
            @Override // java.lang.Runnable
            public void run() {
                hm.this.ums();
                if (hm.this.xdg != null) {
                    hm.this.xdg.obtainMessage(111, surfaceTexture).sendToTarget();
                }
            }
        });
    }

    public void fxn(final SurfaceHolder surfaceHolder) {
        if (tw()) {
            return;
        }
        this.bh = surfaceHolder;
        fxn(true);
        kg(new Runnable() { // from class: com.bykv.vk.openvk.fxn.fxn.kg.gff.hm.4
            @Override // java.lang.Runnable
            public void run() {
                hm.this.ums();
                if (hm.this.xdg != null) {
                    hm.this.xdg.obtainMessage(110, surfaceHolder).sendToTarget();
                }
            }
        });
    }

    public void fxn(final com.bykv.vk.openvk.fxn.fxn.fxn.gff.gff gffVar) {
        if (tw()) {
            return;
        }
        this.zn = gffVar;
        if (gffVar != null) {
            this.qhf = this.qhf && !gffVar.sg();
        }
        kg(new Runnable() { // from class: com.bykv.vk.openvk.fxn.fxn.kg.gff.hm.5
            @Override // java.lang.Runnable
            public void run() {
                hm.this.ums();
                if (hm.this.xdg != null) {
                    hm.this.xdg.obtainMessage(107, gffVar).sendToTarget();
                }
            }
        });
    }

    @Override // com.bykv.vk.openvk.fxn.fxn.fxn.fxn
    public boolean bh() {
        mve mveVar;
        return (this.zu == 206 || ((mveVar = this.xdg) != null && mveVar.hasMessages(100))) && !this.ij;
    }

    @Override // com.bykv.vk.openvk.fxn.fxn.fxn.fxn
    public boolean gff() {
        return rlu() || bh() || sg();
    }

    @Override // com.bykv.vk.openvk.fxn.fxn.fxn.fxn
    public boolean sg() {
        mve mveVar;
        return ((this.zu != 207 && !this.ij) || (mveVar = this.xdg) == null || mveVar.hasMessages(100)) ? false : true;
    }

    @Override // com.bykv.vk.openvk.fxn.fxn.fxn.fxn
    public boolean tw() {
        return this.rlu;
    }

    public boolean rlu() {
        return this.zu == 205;
    }

    @Override // com.bykv.vk.openvk.fxn.fxn.fxn.fxn
    public boolean kg() {
        return this.zu == 209;
    }

    @Override // com.bytedance.sdk.component.utils.mve.fxn
    public void fxn(Message message) {
        int i = this.zu;
        int i2 = message.what;
        if (this.hie != null) {
            try {
                switch (message.what) {
                    case 100:
                        if (this.zu == 205 || this.zu == 207 || this.zu == 209) {
                            this.hie.bh();
                            this.iwp = SystemClock.elapsedRealtime();
                            this.zu = 206;
                            long j = this.ckl;
                            if (j > 0) {
                                new Object[]{"[video] OP_START, seekTo:", Long.valueOf(j), Integer.valueOf(this.tw)};
                                this.hie.fxn(this.ckl, this.tw);
                                this.ckl = -1L;
                            }
                            if (this.zn != null) {
                                kg(this.ggo);
                                return;
                            }
                            return;
                        }
                        break;
                    case 101:
                        if (this.rmu) {
                            this.je += this.dx;
                        }
                        this.rmu = false;
                        this.dx = 0L;
                        this.ud = Long.MIN_VALUE;
                        if (this.zu == 206 || this.zu == 207 || this.zu == 209) {
                            this.hie.tw();
                            this.zu = 207;
                            this.ij = false;
                            for (WeakReference<fxn.InterfaceC0445fxn> weakReference : this.gff) {
                                if (weakReference != null && weakReference.get() != null) {
                                    weakReference.get().hm(this);
                                }
                            }
                            return;
                        }
                        break;
                    case 102:
                        this.hie.rlu();
                        this.zu = 201;
                        return;
                    case 103:
                        try {
                            jz();
                        } catch (Throwable unused) {
                        }
                        for (WeakReference<fxn.InterfaceC0445fxn> weakReference2 : this.gff) {
                            if (weakReference2 != null && weakReference2.get() != null) {
                                weakReference2.get().gff(this);
                            }
                        }
                        this.zu = 203;
                        return;
                    case 104:
                        if (this.zu == 202 || this.zu == 208) {
                            this.hie.jq();
                            return;
                        }
                        break;
                    case 105:
                        if (this.zu == 205 || this.zu == 206 || this.zu == 208 || this.zu == 207 || this.zu == 209) {
                            this.hie.sg();
                            this.zu = 208;
                            return;
                        }
                        break;
                    case 106:
                        if (this.zu == 206 || this.zu == 207 || this.zu == 209) {
                            this.hie.fxn(((Long) message.obj).longValue(), this.tw);
                            return;
                        }
                        break;
                    case 107:
                        dx();
                        if (this.zu == 201 || this.zu == 203) {
                            com.bykv.vk.openvk.fxn.fxn.fxn.gff.gff gffVar = (com.bykv.vk.openvk.fxn.fxn.fxn.gff.gff) message.obj;
                            if (TextUtils.isEmpty(gffVar.rb())) {
                                gffVar.fxn(com.bykv.vk.openvk.fxn.fxn.fxn.gff.kg());
                            }
                            if (gffVar.uhw()) {
                                this.hie.fxn(gffVar.xdg());
                                gffVar.xdg();
                            } else {
                                File file = new File(gffVar.rb(), gffVar.rmu());
                                if (file.exists()) {
                                    fxn(gffVar, file);
                                } else {
                                    gff(gffVar);
                                }
                            }
                            this.zu = 202;
                            return;
                        }
                        break;
                    case 108:
                    case 109:
                    default:
                        return;
                    case 110:
                        this.hie.fxn((SurfaceHolder) message.obj);
                        this.hie.kg(true);
                        this.ax.await(1L, TimeUnit.SECONDS);
                        ggo();
                        return;
                    case 111:
                        this.ils = new Surface((SurfaceTexture) message.obj);
                        this.hie.fxn(this.ils);
                        this.hie.kg(true);
                        this.ax.await(1L, TimeUnit.SECONDS);
                        ggo();
                        return;
                }
                this.zu = 200;
                if (this.dgx) {
                    return;
                }
                com.bykv.vk.openvk.fxn.fxn.fxn.gff.fxn fxnVar = new com.bykv.vk.openvk.fxn.fxn.fxn.gff.fxn(308, i2);
                fxnVar.fxn(i + "," + i2);
                for (WeakReference<fxn.InterfaceC0445fxn> weakReference3 : this.gff) {
                    if (weakReference3 != null && weakReference3.get() != null) {
                        weakReference3.get().fxn(this, fxnVar);
                    }
                }
                this.dgx = true;
            } catch (Throwable unused2) {
            }
        }
    }

    private void fxn(com.bykv.vk.openvk.fxn.fxn.fxn.gff.gff gffVar, File file) {
        if (gffVar.fxn()) {
            kg(gffVar, file);
        } else {
            fxn(file);
        }
    }

    private void fxn(File file) {
        file.getAbsolutePath();
        try {
            if (com.bykv.vk.openvk.fxn.fxn.fxn.gff.gff()) {
                kg(file.getAbsolutePath());
            } else {
                this.hie.fxn(file.getAbsolutePath());
            }
        } catch (Throwable unused) {
        }
    }

    private void kg(com.bykv.vk.openvk.fxn.fxn.fxn.gff.gff gffVar, File file) {
        try {
            String fxn2 = com.bykv.vk.openvk.fxn.fxn.fxn.sg.fxn.fxn(file);
            if (gffVar.rmu().equals(fxn2)) {
                fxn(file);
                return;
            }
            JSONObject gff = gffVar.gff();
            boolean kg = gffVar.kg();
            if (gff != null) {
                gff.put("file_hash", gffVar.rmu());
                gff.put("file_real_hash", fxn2);
                gff.put("is_change_play_type", kg ? 1 : 0);
                gff.put("error_real_code", 309);
                gff.put("error_real_msg", "md5_not_match");
            }
            if (kg) {
                boolean delete = file.delete();
                if (gff != null) {
                    gff.put("delete_cache_file", delete ? 1 : 0);
                }
                if (delete) {
                    gff(gffVar);
                    return;
                }
            }
            fxn(file);
        } catch (Throwable unused) {
        }
    }

    private void gff(com.bykv.vk.openvk.fxn.fxn.fxn.gff.gff gffVar) throws Throwable {
        gffVar.xdg();
        this.hie.fxn(gffVar);
        gffVar.xdg();
    }

    private void kg(String str) throws Throwable {
        FileInputStream fileInputStream = new FileInputStream(str);
        this.hie.fxn(fileInputStream.getFD());
        fileInputStream.close();
    }

    private void jz() {
        if (this.hie == null) {
            return;
        }
        try {
            this.hie.rlu();
        } catch (Throwable unused) {
        }
        this.hie.fxn((gff.kg) null);
        this.hie.fxn((gff.sg) null);
        this.hie.fxn((gff.fxn) null);
        this.hie.fxn((gff.hm) null);
        this.hie.fxn((gff.InterfaceC0448gff) null);
        this.hie.fxn((gff.rb) null);
        this.hie.fxn((gff.bh) null);
        try {
            this.hie.mvp();
        } catch (Throwable unused2) {
        }
    }

    private void bx() {
        mve mveVar = this.xdg;
        if (mveVar == null || mveVar.getLooper() == null) {
            return;
        }
        try {
            this.xdg.post(new Runnable() { // from class: com.bykv.vk.openvk.fxn.fxn.kg.gff.hm.6
                @Override // java.lang.Runnable
                public void run() {
                    if (hm.this.xdg == null || hm.this.xdg.getLooper() == null) {
                        return;
                    }
                    try {
                        com.bytedance.sdk.component.tw.fxn.fxn.fxn().fxn(hm.this.xdg);
                        hm.this.xdg = null;
                    } catch (Throwable unused) {
                    }
                }
            });
        } catch (Throwable unused) {
        }
    }

    @Override // com.bykv.vk.openvk.fxn.fxn.kg.gff.gff.fxn
    public void fxn(gff gffVar, int i) {
        if (this.hie != gffVar) {
            return;
        }
        for (WeakReference<fxn.InterfaceC0445fxn> weakReference : this.gff) {
            if (weakReference != null && weakReference.get() != null) {
                weakReference.get().kg(this, i);
            }
        }
    }

    private void uhw() {
        SparseIntArray sparseIntArray = fxn;
        Integer valueOf = Integer.valueOf(sparseIntArray.get(this.uhw));
        if (valueOf == null) {
            sparseIntArray.put(this.uhw, 1);
        } else {
            sparseIntArray.put(this.uhw, valueOf.intValue() + 1);
        }
    }

    @Override // com.bykv.vk.openvk.fxn.fxn.kg.gff.gff.kg
    public void fxn(gff gffVar) {
        this.zu = 209;
        fxn.delete(this.uhw);
        mve mveVar = this.xdg;
        if (mveVar != null) {
            mveVar.removeCallbacks(this.wc);
        }
        for (WeakReference<fxn.InterfaceC0445fxn> weakReference : this.gff) {
            if (weakReference != null && weakReference.get() != null) {
                weakReference.get().fxn(this);
            }
        }
    }

    @Override // com.bykv.vk.openvk.fxn.fxn.kg.gff.gff.InterfaceC0448gff
    public boolean fxn(gff gffVar, int i, int i2) {
        uhw();
        this.zu = 200;
        mve mveVar = this.xdg;
        if (mveVar != null) {
            mveVar.removeCallbacks(this.wc);
        }
        if (fxn(i, i2)) {
            bx();
        }
        if (!this.rz.get()) {
            return true;
        }
        this.rz.set(false);
        com.bykv.vk.openvk.fxn.fxn.fxn.gff.fxn fxnVar = new com.bykv.vk.openvk.fxn.fxn.fxn.gff.fxn(i, i2);
        for (WeakReference<fxn.InterfaceC0445fxn> weakReference : this.gff) {
            if (weakReference != null && weakReference.get() != null) {
                weakReference.get().fxn(this, fxnVar);
            }
        }
        return true;
    }

    @Override // com.bykv.vk.openvk.fxn.fxn.kg.gff.gff.hm
    public boolean kg(gff gffVar, int i, int i2) {
        if (this.hie != gffVar) {
            return false;
        }
        if (i2 == -1004) {
            com.bykv.vk.openvk.fxn.fxn.fxn.gff.fxn fxnVar = new com.bykv.vk.openvk.fxn.fxn.fxn.gff.fxn(i, i2);
            for (WeakReference<fxn.InterfaceC0445fxn> weakReference : this.gff) {
                if (weakReference != null && weakReference.get() != null) {
                    weakReference.get().fxn(this, fxnVar);
                }
            }
        }
        kg(i, i2);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void kg(int i, int i2) {
        if (i == 701) {
            this.yws = SystemClock.elapsedRealtime();
            this.f9085sg++;
            for (WeakReference<fxn.InterfaceC0445fxn> weakReference : this.gff) {
                if (weakReference != null && weakReference.get() != null) {
                    weakReference.get().fxn(this, Integer.MAX_VALUE, 0, 0);
                }
            }
            new Object[]{"bufferCount = ", Integer.valueOf(this.f9085sg)};
            return;
        }
        if (i == 702) {
            if (this.yws > 0) {
                this.swx += SystemClock.elapsedRealtime() - this.yws;
                this.yws = 0L;
            }
            for (WeakReference<fxn.InterfaceC0445fxn> weakReference2 : this.gff) {
                if (weakReference2 != null && weakReference2.get() != null) {
                    weakReference2.get().fxn((com.bykv.vk.openvk.fxn.fxn.fxn.fxn) this, Integer.MAX_VALUE);
                }
            }
            new Object[]{"bufferCount = ", Integer.valueOf(this.f9085sg), " mBufferTotalTime = ", Long.valueOf(this.swx)};
            return;
        }
        if (this.qhf && i == 3) {
            ggo();
            ke();
            kg(this.ggo);
        }
    }

    @Override // com.bykv.vk.openvk.fxn.fxn.kg.gff.gff.rb
    public void kg(gff gffVar) {
        if (tw()) {
            return;
        }
        this.zu = 205;
        try {
            com.bykv.vk.openvk.fxn.fxn.fxn.gff.gff gffVar2 = this.zn;
            if (gffVar2 != null) {
                float ckl = gffVar2.ckl();
                if (ckl > 0.0f) {
                    com.bykv.vk.openvk.fxn.fxn.fxn.kg kgVar = new com.bykv.vk.openvk.fxn.fxn.fxn.kg();
                    kgVar.fxn(ckl);
                    this.hie.fxn(kgVar);
                }
            }
        } catch (Throwable unused) {
        }
        if (this.xdg != null) {
            if (this.ij) {
                mve();
            } else {
                mve mveVar = this.xdg;
                mveVar.sendMessage(mveVar.obtainMessage(100, -1, -1));
            }
        }
        fxn.delete(this.uhw);
        boolean z = this.qhf;
        boolean z2 = this.jz;
        if (!z && !z2) {
            ke();
            this.jz = true;
        }
        for (WeakReference<fxn.InterfaceC0445fxn> weakReference : this.gff) {
            if (weakReference != null && weakReference.get() != null) {
                weakReference.get().kg(this);
            }
        }
    }

    private void ke() {
        this.jq = true;
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.iwp;
        for (WeakReference<fxn.InterfaceC0445fxn> weakReference : this.gff) {
            if (weakReference != null && weakReference.get() != null) {
                weakReference.get().fxn(this, elapsedRealtime);
            }
        }
    }

    private void mve() {
        mve mveVar = this.xdg;
        if (mveVar != null) {
            mveVar.post(new Runnable() { // from class: com.bykv.vk.openvk.fxn.fxn.kg.gff.hm.7
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        hm.this.hie.tw();
                        hm.this.zu = 207;
                        hm.this.ij = false;
                    } catch (Throwable unused) {
                    }
                }
            });
        }
    }

    @Override // com.bykv.vk.openvk.fxn.fxn.kg.gff.gff.bh
    public void gff(gff gffVar) {
        for (WeakReference<fxn.InterfaceC0445fxn> weakReference : this.gff) {
            if (weakReference != null && weakReference.get() != null) {
                weakReference.get().fxn((com.bykv.vk.openvk.fxn.fxn.fxn.fxn) this, true);
            }
        }
    }

    private void fxn(Runnable runnable) {
        try {
            if (this.bx == null) {
                this.bx = new ArrayList<>();
            }
            this.bx.add(runnable);
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    private void zn() {
        if (this.mvp) {
            return;
        }
        this.mvp = true;
        Iterator it = new ArrayList(this.bx).iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        this.bx.clear();
        this.mvp = false;
    }

    private void ggo() {
        ArrayList<Runnable> arrayList = this.bx;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        zn();
    }

    private void ax() {
        ArrayList<Runnable> arrayList = this.bx;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        this.bx.clear();
    }

    private void kg(Runnable runnable) {
        if (runnable == null || tw()) {
            return;
        }
        if (!this.rlu) {
            runnable.run();
        } else {
            fxn(runnable);
        }
    }

    public void kg(final boolean z) {
        mve mveVar;
        if (tw() || (mveVar = this.xdg) == null) {
            return;
        }
        mveVar.post(new Runnable() { // from class: com.bykv.vk.openvk.fxn.fxn.kg.gff.hm.8
            @Override // java.lang.Runnable
            public void run() {
                if (hm.this.tw() || hm.this.hie == null) {
                    return;
                }
                try {
                    hm.this.ggo = z;
                    hm.this.hie.hm(z);
                } catch (Throwable unused) {
                }
            }
        });
    }

    public long zu() {
        if (this.rmu) {
            long j = this.dx;
            if (j > 0) {
                return this.je + j;
            }
        }
        return this.je;
    }

    @Override // com.bykv.vk.openvk.fxn.fxn.fxn.fxn
    public int hm() {
        if (this.hie == null || tw()) {
            return 0;
        }
        return this.hie.zu();
    }

    @Override // com.bykv.vk.openvk.fxn.fxn.fxn.fxn
    public int rb() {
        if (this.hie == null || tw()) {
            return 0;
        }
        return this.hie.ckl();
    }

    public int ckl() {
        return this.f9085sg;
    }

    @Override // com.bykv.vk.openvk.fxn.fxn.kg.gff.gff.sg
    public void fxn(gff gffVar, int i, int i2, int i3, int i4) {
        for (WeakReference<fxn.InterfaceC0445fxn> weakReference : this.gff) {
            if (weakReference != null && weakReference.get() != null) {
                weakReference.get().fxn((com.bykv.vk.openvk.fxn.fxn.fxn.fxn) this, i, i2);
            }
        }
    }

    public long xdg() {
        long j = this.ums;
        if (j != 0) {
            return j;
        }
        if (this.zu == 206 || this.zu == 207) {
            try {
                this.ums = this.hie.dgx();
            } catch (Throwable unused) {
            }
        }
        return this.ums;
    }

    public long rmu() {
        if (tw()) {
            return 0L;
        }
        if (this.zu == 206 || this.zu == 207) {
            try {
                return this.hie.hie();
            } catch (Throwable unused) {
            }
        }
        return 0L;
    }

    public void fxn(fxn.InterfaceC0445fxn interfaceC0445fxn) {
        if (interfaceC0445fxn == null) {
            return;
        }
        for (WeakReference<fxn.InterfaceC0445fxn> weakReference : this.gff) {
            if (weakReference != null && weakReference.get() == interfaceC0445fxn) {
                return;
            }
        }
        this.gff.add(new WeakReference<>(interfaceC0445fxn));
    }

    public void fxn(int i) {
        if (tw()) {
            return;
        }
        this.ci = i;
    }

    public SurfaceHolder je() {
        return this.bh;
    }

    public SurfaceTexture ud() {
        return this.rb;
    }

    public void kg(int i) {
        this.tw = i;
    }

    public boolean fxn(float f) {
        PlaybackParams playbackParams;
        if (f <= 0.0f) {
            return false;
        }
        try {
            if (this.hie == null || !gff()) {
                return false;
            }
            try {
                playbackParams = this.hie.rb();
            } catch (Throwable th) {
                dx.gff("CSJ_VIDEO_MEDIA", "getPlaybackParams error:" + th.getMessage());
                playbackParams = null;
            }
            if ((playbackParams != null ? playbackParams.getSpeed() : 0.0f) == f) {
                return true;
            }
            com.bykv.vk.openvk.fxn.fxn.fxn.kg kgVar = new com.bykv.vk.openvk.fxn.fxn.fxn.kg();
            kgVar.fxn(f);
            this.hie.fxn(kgVar);
            return true;
        } catch (Throwable th2) {
            dx.fxn("CSJ_VIDEO_MEDIA", "setPlaySpeedRatio error: ", th2);
            return false;
        }
    }

    class fxn implements Runnable {
        private boolean gff;
        private long kg;

        fxn() {
        }

        public void fxn(boolean z) {
            this.gff = z;
        }

        public void fxn(long j) {
            this.kg = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (hm.this.hie != null) {
                try {
                    if (!this.gff) {
                        long hie = hm.this.hie.hie();
                        hm.this.ckl = Math.max(this.kg, hie);
                    }
                    long unused = hm.this.ckl;
                } catch (Throwable th) {
                    new StringBuilder("[video] MediaPlayerProxy#start  error: getCurrentPosition :").append(th);
                }
            }
            if (hm.this.xdg != null) {
                hm.this.xdg.sendEmptyMessageDelayed(100, 0L);
            }
        }
    }
}
