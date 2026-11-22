package com.baidu.ar;

import android.text.TextUtils;
import android.util.Log;
import com.baidu.ar.lua.LuaMsgListener;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes12.dex */
public class j8 {

    /* renamed from: a, reason: collision with root package name */
    public r3 f7004a;
    public LuaMsgListener b;
    public s3 c;
    public DefinedLuaListener d;

    public class a implements LuaMsgListener {
        public a() {
        }

        @Override // com.baidu.ar.lua.LuaMsgListener
        public List<String> getMsgKeyListened() {
            return Arrays.asList("id", com.anythink.expressad.foundation.g.g.a.b.aS);
        }

        @Override // com.baidu.ar.lua.LuaMsgListener
        public void onLuaMessage(HashMap<String, Object> hashMap) {
            if (j8.this.d == null || j8.this.a(hashMap)) {
                return;
            }
            j8.this.b(hashMap);
        }
    }

    public class b implements s3 {
        public b() {
        }

        @Override // com.baidu.ar.s3
        public List<Integer> a() {
            return Arrays.asList(1301);
        }

        @Override // com.baidu.ar.s3
        public void a(int i, int i2, HashMap<String, Object> hashMap) {
            if (i != 1301 || j8.this.d == null) {
                return;
            }
            int intValue = ((Integer) hashMap.get("type")).intValue();
            j8.this.d.onOpenUrl((String) hashMap.get("url"), intValue, hashMap);
        }
    }

    public j8(r3 r3Var) {
        if (r3Var == null) {
            return;
        }
        this.f7004a = r3Var;
        a();
        if (this.b == null) {
            this.b = new a();
        }
        if (r3Var.d() != null) {
            r3Var.d().a(this.b);
        }
    }

    public final void a() {
        b bVar = new b();
        this.c = bVar;
        this.f7004a.a(bVar);
    }

    public void a(DefinedLuaListener definedLuaListener) {
        this.d = definedLuaListener;
    }

    public final boolean a(HashMap<String, Object> hashMap) {
        String str = (String) hashMap.get(com.anythink.expressad.foundation.g.g.a.b.aS);
        if (TextUtils.isEmpty(str) || !"camera_switch".equals(str)) {
            return false;
        }
        String str2 = (String) hashMap.get("camera_action");
        Log.d("LuaMsgHelper", "swichCameraByEvent cameraFace = " + str2);
        if ("front".equals(str2)) {
            this.d.onRequireSwitchCamera(1);
        } else if ("back".equals(str2)) {
            this.d.onRequireSwitchCamera(0);
        } else {
            this.d.onRequireSwitchCamera(-1);
        }
        return true;
    }

    public void b() {
        r3 r3Var = this.f7004a;
        if (r3Var != null) {
            if (this.b != null) {
                r3Var.d().b(this.b);
                this.b = null;
            }
            s3 s3Var = this.c;
            if (s3Var != null) {
                this.f7004a.b(s3Var);
                this.c = null;
            }
            this.f7004a = null;
        }
        this.d = null;
    }

    public final boolean b(HashMap<String, Object> hashMap) {
        int a2 = a9.a(hashMap.get("id"), -1);
        Log.d("LuaMsgHelper", "switchCameraById id = " + a2);
        if (a2 != 10202) {
            return false;
        }
        this.d.onRequireSwitchCamera(-1);
        return true;
    }
}
