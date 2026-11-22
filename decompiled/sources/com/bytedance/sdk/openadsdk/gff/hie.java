package com.bytedance.sdk.openadsdk.gff;

import android.os.RemoteException;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.dx;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.IListenerManager;
import com.bytedance.sdk.openadsdk.core.hm.sg;
import com.bytedance.sdk.openadsdk.core.model.jz;
import com.bytedance.sdk.openadsdk.utils.yws;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public class hie {
    protected IListenerManager bh;
    private JSONObject ckl;
    private String dgx;
    private FilterWord dx;
    private int je;
    private String mvp;
    private String rlu;
    private jz rmu;
    private int ud;
    private String xdg;
    private String zu;
    public static FilterWord fxn = new FilterWord("", "");
    public static int kg = 1;
    public static int gff = 2;
    public static int hm = 3;
    public static int rb = 4;

    /* renamed from: sg, reason: collision with root package name */
    private final Set<gff> f9549sg = new HashSet();
    private final Set<kg> tw = new HashSet();
    private final Set<hm> jq = new HashSet();
    private final Set<fxn> hie = new HashSet();

    public interface fxn {
        void fxn(List<FilterWord> list);
    }

    public interface gff {
        void fxn(FilterWord filterWord);
    }

    public interface hm {
        void fxn(String str);
    }

    public interface kg {
        void fxn(int i);
    }

    public void fxn() {
        this.f9549sg.clear();
        this.tw.clear();
        this.jq.clear();
        this.hie.clear();
    }

    public void fxn(String str) {
        this.dgx = str;
    }

    public void kg(String str) {
        this.mvp = str;
    }

    public void fxn(FilterWord filterWord) {
        this.dx = filterWord;
        hie();
    }

    public FilterWord kg() {
        return this.dx;
    }

    public boolean gff() {
        FilterWord filterWord = this.dx;
        return (filterWord == null || filterWord.equals(fxn)) ? false : true;
    }

    private void hie() {
        Iterator<gff> it = this.f9549sg.iterator();
        while (it.hasNext()) {
            it.next().fxn(this.dx);
        }
    }

    public void fxn(gff gffVar) {
        this.f9549sg.add(gffVar);
    }

    public void fxn(kg kgVar) {
        this.tw.add(kgVar);
    }

    public void fxn(hm hmVar) {
        this.jq.add(hmVar);
    }

    public void fxn(fxn fxnVar) {
        this.hie.add(fxnVar);
    }

    public void hm() {
        if (!gff() && !TextUtils.isEmpty(this.zu)) {
            this.dx = new FilterWord("0:00", this.zu);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.dx);
        if (!TextUtils.isEmpty(this.dgx)) {
            if (TextUtils.isEmpty(this.zu)) {
                com.bytedance.sdk.openadsdk.gff.kg.fxn().fxn(this.dgx, arrayList, this.mvp);
            } else {
                if (this.ckl == null) {
                    jz jzVar = this.rmu;
                    if (jzVar != null) {
                        this.ckl = jzVar.jf();
                    } else {
                        try {
                            this.ckl = new JSONObject(this.xdg);
                        } catch (Throwable th) {
                            dx.fxn("TTDislikeManager", "creative info to json exception", th);
                        }
                    }
                }
                com.bytedance.sdk.openadsdk.gff.kg.fxn().fxn(this.dgx, arrayList, this.ckl, this.zu, this.mvp);
            }
        }
        if (!TextUtils.isEmpty(this.rlu)) {
            if (com.bytedance.sdk.openadsdk.multipro.kg.gff()) {
                hm("onItemClickClosed");
            } else {
                sg.fxn rb2 = com.bytedance.sdk.openadsdk.core.jq.kg().rb(this.rlu);
                if (rb2 != null) {
                    rb2.fxn();
                    com.bytedance.sdk.openadsdk.core.jq.kg().bh(this.rlu);
                }
            }
        }
        Iterator<kg> it = this.tw.iterator();
        while (it.hasNext()) {
            it.next().fxn(kg);
        }
        fxn(fxn);
        gff("");
    }

    public void rb() {
        Iterator<kg> it = this.tw.iterator();
        while (it.hasNext()) {
            it.next().fxn(gff);
        }
    }

    public void bh() {
        Iterator<kg> it = this.tw.iterator();
        while (it.hasNext()) {
            it.next().fxn(rb);
        }
    }

    public void fxn(List<FilterWord> list) {
        Iterator<fxn> it = this.hie.iterator();
        while (it.hasNext()) {
            it.next().fxn(list);
        }
    }

    private void hm(final String str) {
        yws.gff(new com.bytedance.sdk.component.tw.tw("Reward_executeMultiProcessCallback") { // from class: com.bytedance.sdk.openadsdk.gff.hie.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    if (TextUtils.isEmpty(hie.this.rlu)) {
                        return;
                    }
                    hie.this.fxn(6).executeDisLikeClosedCallback(hie.this.rlu, str);
                } catch (Throwable th) {
                    dx.fxn("TTDislikeManager", "executeRewardVideoCallback execute throw Exception : ", th);
                }
            }
        }, 5);
    }

    protected IListenerManager fxn(int i) {
        if (this.bh == null) {
            this.bh = com.bytedance.sdk.openadsdk.multipro.aidl.fxn.fxn.asInterface(com.bytedance.sdk.openadsdk.multipro.aidl.fxn.fxn().fxn(i));
        }
        return this.bh;
    }

    public static void fxn(final int i, final String str, final sg.fxn fxnVar) {
        if (com.bytedance.sdk.openadsdk.multipro.kg.gff()) {
            yws.gff(new com.bytedance.sdk.component.tw.tw("DislikeClosed_registerMultiProcessListener") { // from class: com.bytedance.sdk.openadsdk.gff.hie.2
                @Override // java.lang.Runnable
                public void run() {
                    com.bytedance.sdk.openadsdk.multipro.aidl.fxn fxn2 = com.bytedance.sdk.openadsdk.multipro.aidl.fxn.fxn();
                    if (i != 6 || fxnVar == null) {
                        return;
                    }
                    try {
                        com.bytedance.sdk.openadsdk.multipro.aidl.kg.kg kgVar = new com.bytedance.sdk.openadsdk.multipro.aidl.kg.kg(str, fxnVar);
                        IListenerManager asInterface = com.bytedance.sdk.openadsdk.multipro.aidl.fxn.hm.asInterface(fxn2.fxn(6));
                        if (asInterface != null) {
                            asInterface.registerDisLikeClosedListener(str, kgVar);
                        }
                    } catch (RemoteException e) {
                        dx.gff("TTDislikeManager", e.getMessage());
                    }
                }
            }, 5);
        }
    }

    public static void fxn(final int i, final String str) {
        if (com.bytedance.sdk.openadsdk.multipro.kg.gff()) {
            yws.gff(new com.bytedance.sdk.component.tw.tw("DislikeClosed_unregisterMultiProcessListener") { // from class: com.bytedance.sdk.openadsdk.gff.hie.3
                @Override // java.lang.Runnable
                public void run() {
                    com.bytedance.sdk.openadsdk.multipro.aidl.fxn fxn2 = com.bytedance.sdk.openadsdk.multipro.aidl.fxn.fxn();
                    if (i == 6) {
                        try {
                            IListenerManager asInterface = com.bytedance.sdk.openadsdk.multipro.aidl.fxn.hm.asInterface(fxn2.fxn(6));
                            if (asInterface != null) {
                                asInterface.unregisterDisLikeClosedListener(str);
                            }
                        } catch (RemoteException unused) {
                        }
                    }
                }
            }, 5);
        }
    }

    public void gff(String str) {
        this.zu = str;
        Iterator<hm> it = this.jq.iterator();
        while (it.hasNext()) {
            it.next().fxn(this.zu);
        }
    }

    public String sg() {
        return this.zu;
    }

    public void fxn(String str, jz jzVar) {
        this.xdg = str;
        this.rmu = jzVar;
    }

    public void fxn(int i, int i2) {
        this.je = i;
        this.ud = i2;
    }

    public int tw() {
        return this.je;
    }

    public boolean jq() {
        return this.je < this.ud;
    }
}
