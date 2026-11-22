package com.baidu.ar;

import com.baidu.ar.arplay.core.message.ARPMessage;
import java.util.HashMap;

/* loaded from: classes12.dex */
public class w4 {

    /* renamed from: a, reason: collision with root package name */
    public ARPMessage.MessageHandler f7302a;
    public boolean b = false;
    public boolean c = false;
    public boolean d = false;
    public boolean e = false;
    public boolean f = false;
    public boolean g = false;
    public boolean h = false;
    public boolean i = false;
    public boolean j = false;

    public class a implements ARPMessage.MessageHandler {
        public a() {
        }

        @Override // com.baidu.ar.arplay.core.message.ARPMessage.MessageHandler
        public void handleMessage(int i, int i2, HashMap<String, Object> hashMap) {
            if (hashMap != null) {
                if (hashMap.get("disable_all") != null) {
                    if (1 == ((Integer) hashMap.get("disable_all")).intValue()) {
                        w4.this.b = true;
                    } else {
                        w4.this.b = false;
                    }
                }
                if (hashMap.get("disable_click") != null) {
                    if (1 == ((Integer) hashMap.get("disable_click")).intValue()) {
                        w4.this.c = true;
                    } else {
                        w4.this.c = false;
                    }
                }
                if (hashMap.get("disable_double_click") != null) {
                    if (1 == ((Integer) hashMap.get("disable_double_click")).intValue()) {
                        w4.this.d = true;
                    } else {
                        w4.this.d = false;
                    }
                }
                if (hashMap.get("disable_long_press") != null) {
                    if (1 == ((Integer) hashMap.get("disable_long_press")).intValue()) {
                        w4.this.e = true;
                    } else {
                        w4.this.e = false;
                    }
                }
                if (hashMap.get("disable_swipe") != null) {
                    if (1 == ((Integer) hashMap.get("disable_swipe")).intValue()) {
                        w4.this.f = true;
                    } else {
                        w4.this.f = false;
                    }
                }
                if (hashMap.get("disable_scroll") != null) {
                    if (1 == ((Integer) hashMap.get("disable_scroll")).intValue()) {
                        w4.this.g = true;
                    } else {
                        w4.this.g = false;
                    }
                }
                if (hashMap.get("disable_two_finger_scroll") != null) {
                    if (1 == ((Integer) hashMap.get("disable_two_finger_scroll")).intValue()) {
                        w4.this.h = true;
                    } else {
                        w4.this.h = false;
                    }
                }
                if (hashMap.get("disable_pinch") != null) {
                    if (1 == ((Integer) hashMap.get("disable_pinch")).intValue()) {
                        w4.this.i = true;
                    } else {
                        w4.this.i = false;
                    }
                }
                if (hashMap.get("disable_two_finger_rotate") != null) {
                    if (1 == ((Integer) hashMap.get("disable_two_finger_rotate")).intValue()) {
                        w4.this.j = true;
                    } else {
                        w4.this.j = false;
                    }
                }
            }
        }
    }

    public w4() {
        a();
    }

    public final void a() {
        this.f7302a = new a();
    }

    public boolean b() {
        return (this.b || this.h) ? false : true;
    }

    public boolean c() {
        return (this.b || this.c) ? false : true;
    }

    public boolean d() {
        return (this.b || this.d) ? false : true;
    }

    public boolean e() {
        return (this.b || this.e) ? false : true;
    }

    public boolean f() {
        return (this.b || this.i) ? false : true;
    }

    public boolean g() {
        return (this.b || this.j) ? false : true;
    }

    public boolean h() {
        return (this.b || this.g) ? false : true;
    }

    public boolean i() {
        return (this.b || this.f) ? false : true;
    }

    public void j() {
        ARPMessage.getInstance().removeMessageHandeler(this.f7302a);
    }

    public void k() {
        ARPMessage.getInstance().registerMessageHandler(11, this.f7302a);
    }

    public void l() {
        this.f7302a = null;
    }
}
