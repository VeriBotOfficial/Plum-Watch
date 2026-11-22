package com.baidu.ar;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.baidu.ar.arplay.core.pixel.FramePixels;
import com.baidu.ar.arplay.core.pixel.PixelReadListener;
import com.baidu.ar.arplay.core.pixel.PixelReadParams;
import com.baidu.ar.arplay.core.pixel.PixelRotation;
import com.baidu.ar.arplay.core.pixel.PixelType;
import com.baidu.ar.arplay.core.renderer.IARPRenderer;
import com.baidu.ar.lua.LuaMsgListener;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes12.dex */
public class m4 {

    /* renamed from: a, reason: collision with root package name */
    public Handler f7076a;
    public List<String> b;
    public LuaMsgListener c;
    public i8 d;
    public IARPRenderer e;
    public PixelReadParams f;
    public PixelReadListener g;

    public class a implements PixelReadListener {
        public a() {
        }

        @Override // com.baidu.ar.arplay.core.pixel.PixelReadListener
        public boolean onPixelRead(FramePixels framePixels) {
            if (framePixels == null || m4.this.e == null) {
                return false;
            }
            h.a("FrameCapture", "onPixelRead textureID = " + framePixels.getTextureID());
            m4.this.e.setCaptureData(framePixels.getTextureID());
            m4.this.c();
            return true;
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            m4.this.d();
        }
    }

    public class c implements LuaMsgListener {
        public c() {
        }

        @Override // com.baidu.ar.lua.LuaMsgListener
        public List<String> getMsgKeyListened() {
            return m4.this.b;
        }

        @Override // com.baidu.ar.lua.LuaMsgListener
        public void onLuaMessage(HashMap<String, Object> hashMap) {
            PixelReadParams pixelReadParams;
            PixelRotation pixelRotation;
            if (m4.this.e == null || m4.this.f == null || m4.this.g == null) {
                return;
            }
            String str = (String) hashMap.get(com.anythink.expressad.foundation.g.g.a.b.aS);
            h.a("FrameCapture", "createLuaCaptureListener eventName = " + str);
            if (!"capture_frame".equals(str)) {
                if ("clear_capture".equals(str)) {
                    m4.this.e.clearCaptureData();
                    return;
                }
                return;
            }
            m4.this.f.setPreFilterID((String) hashMap.get("filter_id"));
            if (m4.this.f.getPreFilterID().equals(PixelReadParams.DEFAULT_FILTER_ID) || TextUtils.isEmpty(m4.this.f.getPreFilterID())) {
                if (m4.this.e.isFrontCamera()) {
                    pixelReadParams = m4.this.f;
                    pixelRotation = PixelRotation.RotateRightFlipHorizontal;
                } else {
                    pixelReadParams = m4.this.f;
                    pixelRotation = PixelRotation.RotateRight;
                }
                pixelReadParams.setPixelRotate(pixelRotation);
            }
            m4.this.e.createPixelReaderByPreFilterID(m4.this.f, m4.this.g);
        }
    }

    public m4(Looper looper, i8 i8Var, IARPRenderer iARPRenderer) {
        if (looper == null || i8Var == null || iARPRenderer == null) {
            h.b("FrameCapture", "create FrameCapture error!!! As params NULLLLL!!!");
        }
        this.f7076a = new Handler(looper);
        this.d = i8Var;
        this.e = iARPRenderer;
    }

    public void a() {
        IARPRenderer iARPRenderer = this.e;
        if (iARPRenderer != null) {
            iARPRenderer.clearCaptureData();
        }
    }

    public final void a(int i, int i2) {
        PixelReadParams pixelReadParams = new PixelReadParams(PixelType.RGBA);
        this.f = pixelReadParams;
        pixelReadParams.setOutputWidth(i);
        this.f.setOutputHeight(i2);
        this.f.setFrameType(PixelReadParams.FrameType.SINGLE_FRAME);
        this.g = new a();
    }

    public final void a(i8 i8Var) {
        this.b = Arrays.asList(com.anythink.expressad.foundation.g.g.a.b.aS);
        c cVar = new c();
        this.c = cVar;
        i8Var.a(cVar);
    }

    public void b() {
        LuaMsgListener luaMsgListener;
        Handler handler = this.f7076a;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f7076a = null;
        }
        i8 i8Var = this.d;
        if (i8Var != null && (luaMsgListener = this.c) != null) {
            i8Var.b(luaMsgListener);
        }
        this.d = null;
        this.c = null;
        this.b = null;
        this.f = null;
        this.g = null;
        this.e = null;
    }

    public void b(int i, int i2) {
        a(i, i2);
        a(this.d);
    }

    public final void c() {
        Handler handler = this.f7076a;
        if (handler != null) {
            handler.post(new b());
        }
    }

    public void d() {
        PixelReadParams pixelReadParams;
        PixelReadListener pixelReadListener;
        IARPRenderer iARPRenderer = this.e;
        if (iARPRenderer == null || (pixelReadParams = this.f) == null || (pixelReadListener = this.g) == null) {
            return;
        }
        iARPRenderer.destroyPixelReaderByPreFilterID(pixelReadParams, pixelReadListener);
    }
}
