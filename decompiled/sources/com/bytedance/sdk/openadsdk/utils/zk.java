package com.bytedance.sdk.openadsdk.utils;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.bytedance.sdk.openadsdk.ApmHelper;
import java.util.List;

/* loaded from: classes14.dex */
public class zk {

    public interface kg {
        void fxn();

        void fxn(View view, boolean z);

        void fxn(boolean z);

        void kg();
    }

    public static void fxn(final ViewGroup viewGroup, boolean z, int i, final boolean z2, kg kgVar, List<ViewGroup> list) {
        viewGroup.setTag(520093765, kgVar);
        viewGroup.setTag(520093766, Integer.valueOf(i));
        if (viewGroup.getTag(520093764) == Boolean.TRUE) {
            return;
        }
        final fxn fxnVar = new fxn(viewGroup, z2);
        if (list != null && list.size() > 0) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                list.get(i2).setOnHierarchyChangeListener(new ViewGroup.OnHierarchyChangeListener() { // from class: com.bytedance.sdk.openadsdk.utils.zk.1
                    @Override // android.view.ViewGroup.OnHierarchyChangeListener
                    public void onChildViewAdded(View view, View view2) {
                        fxn.this.fxn = view2;
                    }

                    @Override // android.view.ViewGroup.OnHierarchyChangeListener
                    public void onChildViewRemoved(View view, View view2) {
                        fxn.this.fxn = null;
                    }
                });
            }
        }
        viewGroup.getViewTreeObserver().addOnGlobalLayoutListener(fxnVar);
        if (z) {
            viewGroup.getViewTreeObserver().addOnScrollChangedListener(new ViewTreeObserver.OnScrollChangedListener() { // from class: com.bytedance.sdk.openadsdk.utils.zk.2
                @Override // android.view.ViewTreeObserver.OnScrollChangedListener
                public void onScrollChanged() {
                    try {
                        kg kgVar2 = (kg) viewGroup.getTag(520093765);
                        ViewGroup viewGroup2 = viewGroup;
                        zk.kg(viewGroup2, kgVar2, (Integer) viewGroup2.getTag(520093766), z2);
                    } catch (Exception e) {
                        ApmHelper.reportCustomError("onScrollChanged exception " + viewGroup.getTag(520093765), "ViewUtils", e);
                    }
                }
            });
        }
        viewGroup.getViewTreeObserver().addOnWindowFocusChangeListener(new ViewTreeObserver.OnWindowFocusChangeListener() { // from class: com.bytedance.sdk.openadsdk.utils.zk.3
            @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
            public void onWindowFocusChanged(boolean z3) {
                try {
                    kg kgVar2 = (kg) viewGroup.getTag(520093765);
                    if (kgVar2 != null) {
                        kgVar2.fxn(z3);
                        ViewGroup viewGroup2 = viewGroup;
                        zk.kg(viewGroup2, kgVar2, (Integer) viewGroup2.getTag(520093766), z2);
                    }
                } catch (Exception e) {
                    ApmHelper.reportCustomError("onWindowFocusChanged exception " + viewGroup.getTag(520093765), "ViewUtils", e);
                }
            }
        });
        viewGroup.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.bytedance.sdk.openadsdk.utils.zk.4
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view) {
                kg kgVar2 = (kg) viewGroup.getTag(520093765);
                if (kgVar2 != null) {
                    kgVar2.fxn();
                }
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view) {
                kg kgVar2 = (kg) viewGroup.getTag(520093765);
                if (kgVar2 != null) {
                    kgVar2.kg();
                }
            }
        });
        viewGroup.setTag(520093764, Boolean.TRUE);
    }

    class fxn implements ViewTreeObserver.OnGlobalLayoutListener {
        View fxn = null;
        final /* synthetic */ boolean gff;
        final /* synthetic */ ViewGroup kg;

        fxn(ViewGroup viewGroup, boolean z) {
            this.kg = viewGroup;
            this.gff = z;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            try {
                kg kgVar = (kg) this.kg.getTag(520093765);
                if (this.fxn != null) {
                    Rect rect = new Rect();
                    this.fxn.getGlobalVisibleRect(rect);
                    Rect rect2 = new Rect();
                    this.kg.getGlobalVisibleRect(rect2);
                    if (rect.contains(rect2)) {
                        if (kgVar != null) {
                            kgVar.fxn(this.kg, false);
                        }
                        this.kg.setTag(520093763, Boolean.FALSE);
                        return;
                    } else {
                        if (kgVar != null) {
                            kgVar.fxn(this.kg, true);
                        }
                        this.kg.setTag(520093763, Boolean.TRUE);
                        return;
                    }
                }
                ViewGroup viewGroup = this.kg;
                zk.kg(viewGroup, kgVar, (Integer) viewGroup.getTag(520093766), this.gff);
            } catch (Exception e) {
                ApmHelper.reportCustomError("onGlobalLayout exception " + this.kg.getTag(520093765), "ViewUtils", e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void kg(View view, kg kgVar, Integer num, boolean z) {
        if (kgVar == null) {
            return;
        }
        if (num == null) {
            num = 0;
        }
        kgVar.fxn(view, fxn(view, num.intValue(), z));
    }

    private static boolean fxn(View view, int i, boolean z) {
        return com.bytedance.sdk.openadsdk.core.ij.fxn(view, 20, i, z);
    }
}
