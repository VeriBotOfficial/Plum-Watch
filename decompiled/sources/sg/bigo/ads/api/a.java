package sg.bigo.ads.api;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import sg.bigo.ads.core.adview.c;

/* loaded from: classes7.dex */
public abstract class a<T extends sg.bigo.ads.core.adview.c> extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    private T f19519a;

    public a(Context context) {
        super(context);
    }

    public a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    protected abstract T a();

    public final boolean a(int i, int i2) {
        return getViewImpl().a(i, i2);
    }

    protected final synchronized T getViewImpl() {
        if (this.f19519a == null) {
            this.f19519a = a();
        }
        return this.f19519a;
    }

    @Override // android.view.View
    @Deprecated
    public void setOnClickListener(View.OnClickListener onClickListener) {
        super.setOnClickListener(onClickListener);
    }
}
