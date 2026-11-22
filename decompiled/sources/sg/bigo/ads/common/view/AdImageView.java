package sg.bigo.ads.common.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.webkit.ValueCallback;
import android.widget.ImageView;
import java.util.concurrent.Executor;
import sg.bigo.ads.common.p.g;
import sg.bigo.ads.common.utils.d;

/* loaded from: classes9.dex */
public class AdImageView extends ImageView {

    /* renamed from: a, reason: collision with root package name */
    protected final sg.bigo.ads.common.p.b f19740a;
    private boolean b;
    private boolean c;

    public AdImageView(Context context) {
        this(context, null);
    }

    public AdImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public AdImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.b = false;
        this.c = false;
        this.f19740a = new sg.bigo.ads.common.p.b(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setImageBitmapInternal(Bitmap bitmap) {
        if (this.c) {
            d.a(this, bitmap);
        } else {
            super.setImageBitmap(bitmap);
        }
    }

    private void setImageBitmapWithGradient(Bitmap bitmap) {
        d.a(bitmap, new ValueCallback<Bitmap>() { // from class: sg.bigo.ads.common.view.AdImageView.1
            @Override // android.webkit.ValueCallback
            public final /* synthetic */ void onReceiveValue(Bitmap bitmap2) {
                final Bitmap bitmap3 = bitmap2;
                AdImageView.this.post(new Runnable() { // from class: sg.bigo.ads.common.view.AdImageView.1.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        AdImageView.this.setImageBitmapInternal(bitmap3);
                    }
                });
            }
        });
    }

    public final void a() {
        this.f19740a.c.clear();
    }

    public final void a(String str, boolean z) {
        a(null, str, z);
    }

    public final void a(Executor executor, String str, boolean z) {
        this.f19740a.a(executor, str, z);
    }

    public final void a(g gVar) {
        this.f19740a.a(gVar);
    }

    public void setBlurBorder(boolean z) {
        this.b = z;
    }

    public void setFadeEnable(boolean z) {
        this.c = z;
    }

    public void setIconTag(boolean z) {
        sg.bigo.ads.common.p.b bVar = this.f19740a;
        if (bVar != null) {
            bVar.b = z;
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        if (!this.b || bitmap == null) {
            setImageBitmapInternal(bitmap);
        } else {
            setImageBitmapWithGradient(bitmap);
        }
    }
}
