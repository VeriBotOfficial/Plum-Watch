package com.bytedance.sdk.component.adexpress.dynamic.animation.fxn;

import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes13.dex */
public class gff {
    private static volatile gff fxn;

    private gff() {
    }

    public static gff fxn() {
        if (fxn == null) {
            synchronized (gff.class) {
                if (fxn == null) {
                    fxn = new gff();
                }
            }
        }
        return fxn;
    }

    public hm fxn(View view, com.bytedance.sdk.component.adexpress.dynamic.hm.fxn fxnVar) {
        if (fxnVar == null) {
            return null;
        }
        if (view.getParent() != null) {
            ((ViewGroup) view.getParent()).setClipChildren(false);
        }
        if (view.getParent().getParent() != null) {
            ((ViewGroup) view.getParent().getParent()).setClipChildren(false);
        }
        if ("scale".equals(fxnVar.jq())) {
            return new dgx(view, fxnVar);
        }
        if ("translate".equals(fxnVar.jq())) {
            return new ckl(view, fxnVar);
        }
        if ("ripple".equals(fxnVar.jq())) {
            return new tw(view, fxnVar);
        }
        if ("marquee".equals(fxnVar.jq())) {
            return new sg(view, fxnVar);
        }
        if ("waggle".equals(fxnVar.jq())) {
            return new xdg(view, fxnVar);
        }
        if ("shine".equals(fxnVar.jq())) {
            return new mvp(view, fxnVar);
        }
        if ("swing".equals(fxnVar.jq())) {
            return new zu(view, fxnVar);
        }
        if ("fade".equals(fxnVar.jq())) {
            return new fxn(view, fxnVar);
        }
        if ("rubIn".equals(fxnVar.jq())) {
            return new hie(view, fxnVar);
        }
        if ("rotate".equals(fxnVar.jq())) {
            return new jq(view, fxnVar);
        }
        if ("cutIn".equals(fxnVar.jq())) {
            return new bh(view, fxnVar);
        }
        if ("stretch".equals(fxnVar.jq())) {
            return new rlu(view, fxnVar);
        }
        if ("bounce".equals(fxnVar.jq())) {
            return new rb(view, fxnVar);
        }
        return null;
    }
}
