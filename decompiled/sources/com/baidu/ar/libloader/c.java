package com.baidu.ar.libloader;

import android.text.TextUtils;
import com.baidu.ar.h;
import com.baidu.ar.libloader.ILibLoader;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes12.dex */
public class c extends b {
    public String c;
    public List<String> d = new ArrayList();
    public a e;

    public interface a {
        void a(String str, String str2);
    }

    public c(String str) {
        this.c = str;
    }

    public void a(a aVar) {
        this.e = aVar;
    }

    public final void a(String str) {
        try {
            System.load(str);
        } catch (Throwable th) {
            if (this.e != null) {
                this.e.a(str, th.getMessage());
            }
            throw th;
        }
    }

    @Override // com.baidu.ar.libloader.b, com.baidu.ar.libloader.ILibLoader
    public void require(String str) {
        h.c("LocalWithPathLibLoader", "require libName = " + str);
        try {
            super.require(str);
            if (this.d.contains(str)) {
                return;
            }
            this.d.add(str);
        } catch (Throwable th) {
            if (!TextUtils.isEmpty(this.c)) {
                File file = new File(this.c, "lib" + str + ".so");
                if (file.exists()) {
                    a(file.getAbsolutePath());
                    if (this.d.contains(str)) {
                        return;
                    }
                    this.d.add(str);
                    return;
                }
            }
            throw th;
        }
    }

    @Override // com.baidu.ar.libloader.b, com.baidu.ar.libloader.ILibLoader
    public void setLibReadyListener(String str, ILibLoader.c cVar) {
        if (cVar == null || !this.d.contains(str)) {
            super.setLibReadyListener(str, cVar);
        } else {
            cVar.onReady();
        }
    }
}
