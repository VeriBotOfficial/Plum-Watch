package oqmj;

import android.content.Context;
import com.qumeng.overseas.advlib.core.AdRequestParam;
import com.qumeng.overseas.advlib.core.ICliBundle;
import com.qumeng.overseas.advlib.core.IMultiAdObject;
import java.util.List;

/* loaded from: classes8.dex */
public class c {
    public static final String f = "appregatebanner";

    /* renamed from: a, reason: collision with root package name */
    public List<ICliBundle> f18758a;
    public String b;
    public AdRequestParam c;
    public IMultiAdObject.ADStateListener d;
    public IMultiAdObject.ADEventListener e;

    public c a(List<ICliBundle> list) {
        this.f18758a = list;
        return this;
    }

    public c a(String str) {
        this.b = str;
        return this;
    }

    public c a(AdRequestParam adRequestParam) {
        this.c = adRequestParam;
        return this;
    }

    public c a(IMultiAdObject.ADStateListener aDStateListener) {
        this.d = aDStateListener;
        return this;
    }

    public c a(IMultiAdObject.ADEventListener aDEventListener) {
        this.e = aDEventListener;
        return this;
    }

    public a a(Context context) {
        if (!this.b.equals(f)) {
            return null;
        }
        com.qumeng.overseas.advlib.__remote__.ui.aggregate.imp.a aVar = new com.qumeng.overseas.advlib.__remote__.ui.aggregate.imp.a(context, this.f18758a, this.b, this.d);
        aVar.a(this.c);
        return aVar;
    }
}
