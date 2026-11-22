package com.monetization.ads.nativeads.view.pager;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.yandex.mobile.ads.R;
import com.yandex.mobile.ads.impl.ju1;
import com.yandex.mobile.ads.impl.n50;
import com.yandex.mobile.ads.impl.pw1;
import com.yandex.mobile.ads.impl.v30;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bB\u001b\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\n\u0010\u000eB#\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\n\u0010\u0011B+\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\n\u0010\u0013J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\u0014"}, d2 = {"Lcom/monetization/ads/nativeads/view/pager/MultiBannerControlsContainer;", "Landroid/widget/FrameLayout;", "Landroid/view/View$OnClickListener;", "listener", "", "setOnClickLeftButtonListener", "(Landroid/view/View$OnClickListener;)V", "setOnClickRightButtonListener", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "mobileads_externalRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes17.dex */
public final class MultiBannerControlsContainer extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    private final v30 f12714a;
    private final Lazy b;
    private final n50 c;
    private boolean d;

    static final class a extends Lambda implements Function0<Boolean> {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            int i = pw1.l;
            pw1 a2 = pw1.a.a();
            Context context = MultiBannerControlsContainer.this.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            ju1 a3 = a2.a(context);
            return Boolean.valueOf((a3 == null || a3.p0()) ? false : true);
        }
    }

    public static final class b extends ViewPager2.OnPageChangeCallback {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewPager2 f12715a;
        final /* synthetic */ MultiBannerControlsContainer b;

        b(ViewPager2 viewPager2, MultiBannerControlsContainer multiBannerControlsContainer) {
            this.f12715a = viewPager2;
            this.b = multiBannerControlsContainer;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public final void onPageSelected(int i) {
            RecyclerView.Adapter adapter = this.f12715a.getAdapter();
            this.b.a(i, adapter != null ? adapter.getItemCount() : 0);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiBannerControlsContainer(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f12714a = new v30();
        this.b = LazyKt.lazy(new a());
        this.c = new n50();
        this.d = true;
    }

    public final void setOnClickLeftButtonListener(View.OnClickListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        View findViewById = findViewById(R.id.left_scroll_control_button);
        ImageView imageView = findViewById instanceof ImageView ? (ImageView) findViewById : null;
        if (imageView != null) {
            imageView.setOnClickListener(listener);
        }
    }

    public final void setOnClickRightButtonListener(View.OnClickListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        View findViewById = findViewById(R.id.right_scroll_control_button);
        ImageView imageView = findViewById instanceof ImageView ? (ImageView) findViewById : null;
        if (imageView != null) {
            imageView.setOnClickListener(listener);
        }
    }

    public final void a(ViewPager2 viewPager) {
        Intrinsics.checkNotNullParameter(viewPager, "viewPager");
        viewPager.registerOnPageChangeCallback(new b(viewPager, this));
        viewPager.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.monetization.ads.nativeads.view.pager.MultiBannerControlsContainer$$ExternalSyntheticLambda0
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                MultiBannerControlsContainer.a(MultiBannerControlsContainer.this, view, i, i2, i3, i4, i5, i6, i7, i8);
            }
        });
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiBannerControlsContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f12714a = new v30();
        this.b = LazyKt.lazy(new a());
        this.c = new n50();
        this.d = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(MultiBannerControlsContainer this$0, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (view instanceof ViewPager2) {
            boolean z = this$0.d;
            boolean a2 = this$0.c.a(view, i, i2, i3, i4);
            this$0.d = a2;
            if (a2 != z) {
                ViewPager2 viewPager2 = (ViewPager2) view;
                int currentItem = viewPager2.getCurrentItem();
                RecyclerView.Adapter adapter = viewPager2.getAdapter();
                this$0.a(currentItem, adapter != null ? adapter.getItemCount() : 0);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiBannerControlsContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f12714a = new v30();
        this.b = LazyKt.lazy(new a());
        this.c = new n50();
        this.d = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(int i, int i2) {
        View findViewById = findViewById(R.id.left_scroll_control_button);
        ImageView imageView = findViewById instanceof ImageView ? (ImageView) findViewById : null;
        View findViewById2 = findViewById(R.id.right_scroll_control_button);
        ImageView imageView2 = findViewById2 instanceof ImageView ? (ImageView) findViewById2 : null;
        View findViewById3 = findViewById(R.id.dot_indicator);
        ImageView imageView3 = findViewById3 instanceof ImageView ? (ImageView) findViewById3 : null;
        if (!this.d) {
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            if (imageView2 != null) {
                imageView2.setVisibility(8);
            }
            if (imageView3 == null) {
                return;
            }
            imageView3.setVisibility(8);
            return;
        }
        View findViewById4 = findViewById(R.id.dot_indicator);
        ImageView imageView4 = findViewById4 instanceof ImageView ? (ImageView) findViewById4 : null;
        if (imageView4 != null) {
            imageView4.setVisibility(0);
            v30 v30Var = this.f12714a;
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            imageView4.setImageDrawable(v30Var.a(context, i, i2));
        }
        View findViewById5 = findViewById(R.id.left_scroll_control_button);
        ImageView imageView5 = findViewById5 instanceof ImageView ? (ImageView) findViewById5 : null;
        View findViewById6 = findViewById(R.id.right_scroll_control_button);
        ImageView imageView6 = findViewById6 instanceof ImageView ? (ImageView) findViewById6 : null;
        if (!((Boolean) this.b.getValue()).booleanValue() || imageView5 == null || imageView6 == null) {
            if (imageView5 != null) {
                imageView5.setVisibility(8);
            }
            if (imageView6 == null) {
                return;
            }
            imageView6.setVisibility(8);
            return;
        }
        if (i == 0) {
            imageView5.setVisibility(8);
            imageView6.setVisibility(0);
        } else if (i == i2 - 1) {
            imageView5.setVisibility(0);
            imageView6.setVisibility(8);
        } else {
            imageView5.setVisibility(0);
            imageView6.setVisibility(0);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiBannerControlsContainer(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f12714a = new v30();
        this.b = LazyKt.lazy(new a());
        this.c = new n50();
        this.d = true;
    }
}
