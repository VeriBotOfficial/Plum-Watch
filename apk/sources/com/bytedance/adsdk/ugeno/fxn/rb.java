package com.bytedance.adsdk.ugeno.fxn;

import com.facebook.react.uimanager.ViewProps;

/* JADX INFO: loaded from: classes15.dex */
public enum rb {
    TRANSLATE("translate", "translation", "point"),
    TRANSLATE_X(ViewProps.TRANSLATE_X, "translationX", "float"),
    TRANSLATE_Y(ViewProps.TRANSLATE_Y, "translationY", "float"),
    ROTATE_X("rotateX", "rotationX", "float"),
    ROTATE_Y("rotateY", "rotationY", "float"),
    ROTATE_Z("rotateZ", "rotation", "float"),
    SCALE("scale", "scale", "point"),
    SCALE_X("scaleX", "scaleX", "float"),
    SCALE_Y("scaleY", "scaleY", "float"),
    ALPHA(ViewProps.OPACITY, "alpha", "float"),
    BACKGROUND_COLOR("backgroundColor", "backgroundColor", "int"),
    BORDER_RADIUS("borderRadius", "borderRadius", "float"),
    RIPPLE("ripple", "ripple", "float"),
    SHINE("shine", "shine", "float");

    private final String ckl;
    private final String rmu;
    private final String xdg;

    rb(String str, String str2, String str3) {
        this.ckl = str;
        this.xdg = str2;
        this.rmu = str3;
    }

    public String fxn() {
        return this.ckl;
    }

    public String kg() {
        return this.xdg;
    }

    public String gff() {
        return this.rmu;
    }

    public static rb fxn(String str) {
        str.hashCode();
        switch (str) {
            case "translateX":
                return TRANSLATE_X;
            case "translateY":
                return TRANSLATE_Y;
            case "opacity":
                return ALPHA;
            case "ripple":
                return RIPPLE;
            case "scaleX":
                return SCALE_X;
            case "scaleY":
                return SCALE_Y;
            case "scale":
                return SCALE;
            case "translate":
                return TRANSLATE;
            case "backgroundColor":
                return BACKGROUND_COLOR;
            case "borderRadius":
                return BORDER_RADIUS;
            case "rotateX":
                return ROTATE_X;
            case "rotateY":
                return ROTATE_Y;
            case "rotateZ":
                return ROTATE_Z;
            default:
                return TRANSLATE_X;
        }
    }
}
