package oqmj;

import android.content.Context;
import com.qumeng.overseas.advlib.core.AdRequestParam;
import com.qumeng.overseas.advlib.core.ICliBundle;
import com.qumeng.overseas.advlib.core.IMultiAdObject;
import java.util.List;

/* loaded from: classes8.dex */
public abstract class a implements b {

    /* renamed from: a, reason: collision with root package name */
    public List<ICliBundle> f18757a;
    public String b;
    public Context c;
    public IMultiAdObject.ADStateListener d;
    public AdRequestParam e;
    public IMultiAdObject.ADEventListener f;

    public a(Context context, List<ICliBundle> list, String str) {
        this.c = context;
        this.f18757a = list;
        this.b = str;
    }

    public void a(AdRequestParam adRequestParam) {
        this.e = adRequestParam;
    }

    public void a(AdRequestParam adRequestParam, IMultiAdObject.ADEventListener aDEventListener) {
        this.e = adRequestParam;
        this.f = aDEventListener;
    }

    public a(Context context, List<ICliBundle> list, String str, IMultiAdObject.ADStateListener aDStateListener) {
        this.f18757a = list;
        this.b = str;
        this.c = context;
        this.d = aDStateListener;
    }
}
