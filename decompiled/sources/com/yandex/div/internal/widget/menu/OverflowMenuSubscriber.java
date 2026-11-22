package com.yandex.div.internal.widget.menu;

/* loaded from: classes5.dex */
public interface OverflowMenuSubscriber {

    public interface Listener {
        void dismiss();
    }

    void subscribe(Listener listener);
}
