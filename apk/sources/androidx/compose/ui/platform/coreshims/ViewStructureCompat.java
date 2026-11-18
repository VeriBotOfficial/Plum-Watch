package androidx.compose.ui.platform.coreshims;

import android.view.ViewStructure;

/* JADX INFO: loaded from: classes8.dex */
public class ViewStructureCompat {
    private final Object mWrappedObj;

    public static ViewStructureCompat toViewStructureCompat(ViewStructure viewStructure) {
        return new ViewStructureCompat(viewStructure);
    }

    public ViewStructure toViewStructure() {
        return (ViewStructure) this.mWrappedObj;
    }

    private ViewStructureCompat(ViewStructure viewStructure) {
        this.mWrappedObj = viewStructure;
    }

    public void setText(CharSequence charSequence) {
        Api23Impl.setText((ViewStructure) this.mWrappedObj, charSequence);
    }

    public void setClassName(String str) {
        Api23Impl.setClassName((ViewStructure) this.mWrappedObj, str);
    }

    public void setTextStyle(float f, int r3, int r4, int r5) {
        Api23Impl.setTextStyle((ViewStructure) this.mWrappedObj, f, r3, r4, r5);
    }

    public void setContentDescription(CharSequence charSequence) {
        Api23Impl.setContentDescription((ViewStructure) this.mWrappedObj, charSequence);
    }

    public void setDimens(int r9, int r10, int r11, int r12, int r13, int r14) {
        Api23Impl.setDimens((ViewStructure) this.mWrappedObj, r9, r10, r11, r12, r13, r14);
    }

    private static class Api23Impl {
        private Api23Impl() {
        }

        static void setDimens(ViewStructure viewStructure, int r1, int r2, int r3, int r4, int r5, int r6) {
            viewStructure.setDimens(r1, r2, r3, r4, r5, r6);
        }

        static void setText(ViewStructure viewStructure, CharSequence charSequence) {
            viewStructure.setText(charSequence);
        }

        static void setClassName(ViewStructure viewStructure, String str) {
            viewStructure.setClassName(str);
        }

        static void setContentDescription(ViewStructure viewStructure, CharSequence charSequence) {
            viewStructure.setContentDescription(charSequence);
        }

        static void setTextStyle(ViewStructure viewStructure, float f, int r2, int r3, int r4) {
            viewStructure.setTextStyle(f, r2, r3, r4);
        }
    }
}
