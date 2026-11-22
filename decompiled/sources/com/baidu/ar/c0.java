package com.baidu.ar;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.SparseArray;
import com.baidu.ar.arplay.core.pixel.PixelReadParams;
import com.baidu.ar.arplay.core.pixel.PixelRotation;
import com.baidu.ar.arrender.IARRenderer;
import com.baidu.ar.arrender.a;
import com.baidu.ar.lua.LuaMsgListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public abstract class c0 implements a.e {

    /* renamed from: a, reason: collision with root package name */
    public Context f6831a;
    public Handler b;
    public g3 c;
    public e6 d;
    public com.baidu.ar.arrender.a e;
    public r3 f;
    public String g;
    public x8 h;
    public b i;
    public HashMap<String, e3> j;
    public a.f n;
    public int o;
    public int p;

    /* renamed from: q, reason: collision with root package name */
    public int f6832q;
    public int r;
    public int s;
    public List<t5> k = new ArrayList();
    public boolean l = false;
    public List<String> m = new CopyOnWriteArrayList();
    public boolean t = true;
    public boolean u = true;

    public class a implements a.f {
        public a() {
        }

        @Override // com.baidu.ar.arrender.a.f
        public void a(int i, int i2) {
            c0 c0Var = c0.this;
            c0Var.f6832q = i;
            c0Var.r = i2;
        }
    }

    public interface b {
        boolean a(String str, e3 e3Var);
    }

    public final void a(int i, HashMap<String, Object> hashMap) {
        r3 r3Var = this.f;
        if (r3Var != null) {
            r3Var.a(i, hashMap);
        }
    }

    public void a(Context context, Looper looper) {
        this.f6831a = context;
        this.b = new Handler(looper);
    }

    public void a(b bVar) {
        this.i = bVar;
    }

    public void a(e6 e6Var) {
        this.d = e6Var;
    }

    public void a(g3 g3Var, com.baidu.ar.arrender.a aVar, g gVar) {
        this.c = g3Var;
        this.e = aVar;
        this.o = aVar.q().getInputWidth();
        this.p = aVar.q().getInputHeight();
        aVar.r().getOutputWidth();
        aVar.r().getOutputHeight();
        this.s = aVar.q().getInputDegree();
        this.t = aVar.q().isCameraInput();
        this.u = aVar.q().isFrontCamera();
        a aVar2 = new a();
        this.n = aVar2;
        aVar.a(aVar2);
        aVar.a(this);
        if (e()) {
            this.l = true;
        }
    }

    public final void a(LuaMsgListener luaMsgListener) {
        r3 r3Var = this.f;
        if (r3Var == null || r3Var.d() == null) {
            return;
        }
        this.f.d().a(luaMsgListener);
    }

    public final void a(n7 n7Var) {
        e6 e6Var = this.d;
        if (e6Var != null) {
            e6Var.stop(n7Var);
        }
    }

    public void a(r3 r3Var) {
        this.f = r3Var;
    }

    public final void a(s3 s3Var) {
        r3 r3Var = this.f;
        if (r3Var != null) {
            r3Var.a(s3Var);
        }
    }

    public final void a(t5 t5Var) {
        com.baidu.ar.arrender.a aVar;
        if (t5Var == null) {
            h.b("AbstractAR", "removeDetector error!!! detector is null!!!");
            return;
        }
        if ((t5Var instanceof o4) && (aVar = this.e) != null) {
            o4 o4Var = (o4) t5Var;
            aVar.b(o4Var.b(), o4Var);
        }
        g3 g3Var = this.c;
        if (g3Var != null) {
            g3Var.a(t5Var);
        }
        List<t5> list = this.k;
        if (list != null) {
            list.remove(t5Var);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x004c, code lost:
    
        if (r2 != 270) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(com.baidu.ar.t5 r5, com.baidu.ar.e3 r6) {
        /*
            r4 = this;
            if (r5 != 0) goto La
            java.lang.String r5 = "AbstractAR"
            java.lang.String r6 = "addDetector error!!! detector is null!!!"
            com.baidu.ar.h.b(r5, r6)
            return
        La:
            boolean r0 = r5 instanceof com.baidu.ar.o4
            if (r0 == 0) goto L62
            com.baidu.ar.arrender.a r0 = r4.e
            if (r0 == 0) goto L62
            java.util.List<com.baidu.ar.t5> r0 = r4.k
            r0.add(r5)
            r0 = r5
            com.baidu.ar.o4 r0 = (com.baidu.ar.o4) r0
            android.os.Handler r1 = r4.b
            r0.a(r1)
            boolean r1 = r4.l
            r0.a(r1)
            com.baidu.ar.arplay.core.pixel.PixelReadParams r1 = r0.b()
            boolean r2 = r4.t
            if (r2 == 0) goto L3a
            boolean r2 = r1.getIsPortrait()
            if (r2 == 0) goto L3a
            boolean r2 = r4.u
            if (r2 == 0) goto L37
            goto L4f
        L37:
            com.baidu.ar.arplay.core.pixel.PixelRotation r2 = com.baidu.ar.arplay.core.pixel.PixelRotation.RotateRight
            goto L5a
        L3a:
            boolean r2 = r4.t
            if (r2 != 0) goto L5d
            int r2 = r4.s
            if (r2 == 0) goto L58
            r3 = 90
            if (r2 == r3) goto L55
            r3 = 180(0xb4, float:2.52E-43)
            if (r2 == r3) goto L52
            r3 = 270(0x10e, float:3.78E-43)
            if (r2 == r3) goto L4f
            goto L5d
        L4f:
            com.baidu.ar.arplay.core.pixel.PixelRotation r2 = com.baidu.ar.arplay.core.pixel.PixelRotation.RotateRightFlipHorizontal
            goto L5a
        L52:
            com.baidu.ar.arplay.core.pixel.PixelRotation r2 = com.baidu.ar.arplay.core.pixel.PixelRotation.FlipHorizontal
            goto L5a
        L55:
            com.baidu.ar.arplay.core.pixel.PixelRotation r2 = com.baidu.ar.arplay.core.pixel.PixelRotation.RotateRightFlipVertical
            goto L5a
        L58:
            com.baidu.ar.arplay.core.pixel.PixelRotation r2 = com.baidu.ar.arplay.core.pixel.PixelRotation.FlipVertical
        L5a:
            r1.setPixelRotate(r2)
        L5d:
            com.baidu.ar.arrender.a r2 = r4.e
            r2.a(r1, r0)
        L62:
            com.baidu.ar.g3 r0 = r4.c
            if (r0 == 0) goto L69
            r0.a(r5, r6)
        L69:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baidu.ar.c0.a(com.baidu.ar.t5, com.baidu.ar.e3):void");
    }

    public void a(String str) {
        List<String> list = this.m;
        if (list == null || list.contains(str)) {
            return;
        }
        this.m.add(str);
    }

    public void a(String str, e3 e3Var) {
        if (this.k == null || TextUtils.isEmpty(str) || e3Var == null) {
            return;
        }
        for (t5 t5Var : this.k) {
            if (t5Var != null && str.equals(t5Var.getName()) && (t5Var instanceof f0)) {
                ((f0) t5Var).b(e3Var);
            }
        }
    }

    public final void a(HashMap<String, Object> hashMap) {
        r3 r3Var = this.f;
        if (r3Var != null) {
            r3Var.a(1902, hashMap);
        }
    }

    public void a(List<String> list) {
        if (list == null || list.size() <= 0) {
            return;
        }
        for (String str : list) {
            List<String> list2 = this.m;
            if (list2 != null && !list2.contains(str)) {
                this.m.add(str);
            }
        }
    }

    void a(JSONObject jSONObject) {
    }

    void a(boolean z) {
        this.u = z;
        for (t5 t5Var : this.k) {
            if ((t5Var instanceof o4) && this.e != null) {
                PixelReadParams b2 = ((o4) t5Var).b();
                if (this.t && b2.getIsPortrait()) {
                    PixelRotation pixelRotation = z ? PixelRotation.RotateRightFlipHorizontal : PixelRotation.RotateRight;
                    b2.setPixelRotate(pixelRotation);
                    this.e.a(b2, pixelRotation);
                }
            }
        }
    }

    public boolean a() {
        List<String> list = this.m;
        if (list != null && list.size() > 0) {
            return false;
        }
        for (t5 t5Var : this.k) {
            if (t5Var != null && (t5Var instanceof f0) && ((f0) t5Var).a()) {
                return false;
            }
        }
        return true;
    }

    public final boolean a(q7 q7Var, n7 n7Var) {
        e6 e6Var = this.d;
        if (e6Var != null) {
            return e6Var.start(q7Var, n7Var);
        }
        return false;
    }

    public void adjust(HashMap<String, Object> hashMap) {
        if (hashMap == null) {
            return;
        }
        String str = (String) hashMap.get("detect_sync");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        boolean equals = "sync".equals(str);
        if (e()) {
            equals = true;
        }
        if (equals != this.l) {
            this.l = equals;
            for (t5 t5Var : this.k) {
                if (t5Var != null && (t5Var instanceof o4)) {
                    ((o4) t5Var).a(this.l);
                }
                g3 g3Var = this.c;
                if (g3Var != null) {
                    g3Var.a((o4) t5Var);
                }
            }
        }
    }

    public void b() {
        List<String> list = this.m;
        if (list != null) {
            list.clear();
        }
    }

    public final void b(s3 s3Var) {
        r3 r3Var = this.f;
        if (r3Var != null) {
            r3Var.b(s3Var);
        }
    }

    public void b(String str) {
        List<String> list = this.m;
        if (list != null) {
            list.remove(str);
        }
    }

    public void b(String str, e3 e3Var) {
        if (this.k == null || TextUtils.isEmpty(str) || e3Var == null) {
            return;
        }
        for (t5 t5Var : this.k) {
            if (t5Var != null && str.equals(t5Var.getName()) && (t5Var instanceof f0)) {
                ((f0) t5Var).c(e3Var);
            }
        }
    }

    public final Context c() {
        return this.f6831a;
    }

    public final boolean c(String str, e3 e3Var) {
        if (this.i == null || TextUtils.isEmpty(str) || e3Var == null) {
            return false;
        }
        HashMap<String, e3> hashMap = this.j;
        if (hashMap != null) {
            hashMap.remove(str);
        }
        return this.i.a(str, e3Var);
    }

    public final IARRenderer d() {
        return this.e;
    }

    public final boolean e() {
        com.baidu.ar.arrender.a aVar = this.e;
        if (aVar == null || aVar.q() == null) {
            return false;
        }
        return this.e.q().isSyncInputContent();
    }

    public String getFaceModelPath() {
        return this.g;
    }

    public SparseArray<w8> getMdlConfigs() {
        x8 x8Var = this.h;
        if (x8Var != null) {
            return x8Var.a();
        }
        h.b("AbstractAR", "mMdlConfigParams is null.");
        return new SparseArray<>();
    }

    public void onCaseCreate(String str) {
    }

    public void onCaseDestroy() {
    }

    @Override // com.baidu.ar.arrender.a.e
    public void onInputSizeChange(int i, int i2) {
        com.baidu.ar.arrender.a aVar = this.e;
        if (aVar == null) {
            return;
        }
        this.o = aVar.q().getInputWidth();
        this.p = this.e.q().getInputHeight();
    }

    public void pause() {
    }

    public void release() {
        HashMap<String, e3> hashMap = this.j;
        if (hashMap != null) {
            for (Map.Entry<String, e3> entry : hashMap.entrySet()) {
                c(entry.getKey(), entry.getValue());
            }
            this.j.clear();
            this.j = null;
        }
        int size = this.k.size();
        t5[] t5VarArr = new t5[size];
        this.k.toArray(t5VarArr);
        for (int i = 0; i < size; i++) {
            a(t5VarArr[i]);
        }
        this.k.clear();
        this.k = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.b = null;
        this.f6831a = null;
    }

    public void resume() {
    }

    public void setFaceModelPath(String str) {
        this.g = str;
    }

    public void setMdlConfigParams(x8 x8Var) {
        this.h = x8Var;
    }

    public void setup(HashMap<String, Object> hashMap) {
        if (hashMap == null) {
            return;
        }
        String str = (String) hashMap.get("detect_sync");
        if (!TextUtils.isEmpty(str) && "sync".equals(str)) {
            this.l = true;
        }
        if (e()) {
            this.l = true;
        }
    }
}
