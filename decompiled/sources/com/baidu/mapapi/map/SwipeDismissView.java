package com.baidu.mapapi.map;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.baidu.mapapi.map.SwipeDismissTouchListener;
import com.baidu.mapapi.map.WearMapView;

/* loaded from: classes13.dex */
public class SwipeDismissView extends RelativeLayout {

    /* renamed from: a, reason: collision with root package name */
    WearMapView.OnDismissCallback f7987a;

    class a implements SwipeDismissTouchListener.DismissCallbacks {
        a() {
        }

        @Override // com.baidu.mapapi.map.SwipeDismissTouchListener.DismissCallbacks
        public boolean canDismiss(Object obj) {
            return true;
        }

        @Override // com.baidu.mapapi.map.SwipeDismissTouchListener.DismissCallbacks
        public void onDismiss(View view, Object obj) {
            WearMapView.OnDismissCallback onDismissCallback = SwipeDismissView.this.f7987a;
            if (onDismissCallback == null) {
                return;
            }
            onDismissCallback.onDismiss();
        }

        @Override // com.baidu.mapapi.map.SwipeDismissTouchListener.DismissCallbacks
        public void onNotify() {
            WearMapView.OnDismissCallback onDismissCallback = SwipeDismissView.this.f7987a;
            if (onDismissCallback == null) {
                return;
            }
            onDismissCallback.onNotify();
        }
    }

    public SwipeDismissView(Context context, View view) {
        super(context);
        this.f7987a = null;
        a(context, view);
    }

    void a(Context context, View view) {
        setOnTouchListener(new SwipeDismissTouchListener(view, new Object(), new a()));
    }

    public void setCallback(WearMapView.OnDismissCallback onDismissCallback) {
        this.f7987a = onDismissCallback;
    }

    public SwipeDismissView(Context context, AttributeSet attributeSet, View view) {
        super(context, attributeSet);
        this.f7987a = null;
        a(context, view);
    }

    public SwipeDismissView(Context context, AttributeSet attributeSet, int i, View view) {
        super(context, attributeSet, i);
        this.f7987a = null;
        a(context, view);
    }
}
