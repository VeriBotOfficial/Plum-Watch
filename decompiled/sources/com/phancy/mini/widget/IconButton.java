package com.phancy.mini.widget;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.appcompat.widget.AppCompatImageView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.xmind.core.internal.dom.DOMConstants;

/* compiled from: IconButton.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0012\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0002J\u0012\u0010\u0015\u001a\u00020\u00142\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u0016\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u000eR\u0012\u0010\u000b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\fR\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/phancy/mini/widget/IconButton;", "Landroidx/appcompat/widget/AppCompatImageView;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "colorOfFilter", "Ljava/lang/Integer;", "modeOfFilter", "Landroid/graphics/PorterDuff$Mode;", "onTouchEvent", "", "event", "Landroid/view/MotionEvent;", "restoreColorFilter", "", "setColorFilter", "cf", "Landroid/graphics/ColorFilter;", "setIconColorFilter", "color", DOMConstants.ATTR_MODE, "phancy-mini-sdk_overseasRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class IconButton extends AppCompatImageView {
    private Integer colorOfFilter;
    private PorterDuff.Mode modeOfFilter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IconButton(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IconButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IconButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void setIconColorFilter(int color, PorterDuff.Mode mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.colorOfFilter = Integer.valueOf(color);
        this.modeOfFilter = mode;
        setColorFilter(color, mode);
    }

    @Override // android.widget.ImageView
    public void setColorFilter(ColorFilter cf) {
        if (cf == null) {
            this.colorOfFilter = null;
            this.modeOfFilter = null;
        }
        super.setColorFilter(cf);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        PorterDuff.Mode mode;
        Integer valueOf = event != null ? Integer.valueOf(event.getAction()) : null;
        if (valueOf != null && valueOf.intValue() == 0) {
            if (this.colorOfFilter != null && (mode = this.modeOfFilter) != null) {
                if (mode == PorterDuff.Mode.SRC_IN) {
                    Integer num = this.colorOfFilter;
                    int intValue = num != null ? num.intValue() : -16777216;
                    setColorFilter(Color.argb(Color.alpha(intValue) / 2, Color.red(intValue), Color.green(intValue), Color.blue(intValue)), PorterDuff.Mode.SRC_IN);
                } else {
                    setColorFilter(Integer.MIN_VALUE, PorterDuff.Mode.MULTIPLY);
                }
            } else {
                setColorFilter(Integer.MIN_VALUE, PorterDuff.Mode.MULTIPLY);
            }
        } else if (valueOf != null && valueOf.intValue() == 1) {
            restoreColorFilter();
        } else if (valueOf != null && valueOf.intValue() == 3) {
            restoreColorFilter();
        }
        return super.onTouchEvent(event);
    }

    private final void restoreColorFilter() {
        Integer num = this.colorOfFilter;
        int intValue = num != null ? num.intValue() : -16777216;
        PorterDuff.Mode mode = this.modeOfFilter;
        if (mode == null) {
            mode = PorterDuff.Mode.SRC_IN;
        }
        if (this.colorOfFilter != null && this.modeOfFilter != null) {
            setColorFilter(intValue, mode);
        } else {
            clearColorFilter();
        }
    }
}
