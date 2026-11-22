package com.qumeng.overseas.advlib.__remote__.ui.banner.json2view.view.utils;

import com.facebook.react.uimanager.ViewProps;

/* loaded from: classes17.dex */
public class c {
    public static String a(String str) {
        String replace;
        replace = str.replace("android:", "").replace("app:", "");
        replace.hashCode();
        replace.hashCode();
        switch (replace) {
            case "layout_width":
                return "width";
            case "layout_marginTop":
                return "topMargin";
            case "layout_height":
                return "height";
            case "layout_marginBottom":
                return "bottomMargin";
            case "layout_margin":
                return ViewProps.MARGIN;
            case "layout_marginLeft":
                return "leftMargin";
            case "layout_weight":
                return "weight";
            case "layout_marginRight":
                return "rightMargin";
            default:
                return replace;
        }
    }
}
