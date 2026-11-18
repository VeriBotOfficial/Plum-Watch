package androidx.constraintlayout.core.motion;

import com.baidu.mapapi.UIMsg;

/* JADX INFO: loaded from: classes8.dex */
public class CustomAttribute {
    private static final String TAG = "TransitionLayout";
    boolean mBooleanValue;
    private int mColorValue;
    private float mFloatValue;
    private int mIntegerValue;
    private boolean mMethod;
    String mName;
    private String mStringValue;
    private AttributeType mType;

    public enum AttributeType {
        INT_TYPE,
        FLOAT_TYPE,
        COLOR_TYPE,
        COLOR_DRAWABLE_TYPE,
        STRING_TYPE,
        BOOLEAN_TYPE,
        DIMENSION_TYPE,
        REFERENCE_TYPE
    }

    private static int clamp(int r1) {
        int r2 = (r1 & (~(r1 >> 31))) + UIMsg.m_AppUI.V_WM_ADDLISTUPDATE;
        return (r2 & (r2 >> 31)) + 255;
    }

    public static int hsvToRgb(float f, float f2, float f3) {
        float f4 = f * 6.0f;
        int r0 = (int) f4;
        float f5 = f4 - r0;
        float f6 = f3 * 255.0f;
        int r2 = (int) (((1.0f - f2) * f6) + 0.5f);
        int r4 = (int) (((1.0f - (f5 * f2)) * f6) + 0.5f);
        int r5 = (int) (((1.0f - ((1.0f - f5) * f2)) * f6) + 0.5f);
        int r6 = (int) (f6 + 0.5f);
        if (r0 == 0) {
            return ((r6 << 16) + (r5 << 8) + r2) | (-16777216);
        }
        if (r0 == 1) {
            return ((r4 << 16) + (r6 << 8) + r2) | (-16777216);
        }
        if (r0 == 2) {
            return ((r2 << 16) + (r6 << 8) + r5) | (-16777216);
        }
        if (r0 == 3) {
            return ((r2 << 16) + (r4 << 8) + r6) | (-16777216);
        }
        if (r0 == 4) {
            return ((r5 << 16) + (r2 << 8) + r6) | (-16777216);
        }
        if (r0 != 5) {
            return 0;
        }
        return ((r6 << 16) + (r2 << 8) + r4) | (-16777216);
    }

    public AttributeType getType() {
        return this.mType;
    }

    public boolean isContinuous() {
        int r0 = AnonymousClass1.$SwitchMap$androidx$constraintlayout$core$motion$CustomAttribute$AttributeType[this.mType.ordinal()];
        return (r0 == 1 || r0 == 2 || r0 == 3) ? false : true;
    }

    public void setFloatValue(float f) {
        this.mFloatValue = f;
    }

    public void setColorValue(int r1) {
        this.mColorValue = r1;
    }

    public void setIntValue(int r1) {
        this.mIntegerValue = r1;
    }

    public void setStringValue(String str) {
        this.mStringValue = str;
    }

    public int numberOfInterpolatedValues() {
        int r0 = AnonymousClass1.$SwitchMap$androidx$constraintlayout$core$motion$CustomAttribute$AttributeType[this.mType.ordinal()];
        return (r0 == 4 || r0 == 5) ? 4 : 1;
    }

    public float getValueToInterpolate() {
        switch (this.mType) {
            case BOOLEAN_TYPE:
                return this.mBooleanValue ? 1.0f : 0.0f;
            case STRING_TYPE:
                throw new RuntimeException("Cannot interpolate String");
            case COLOR_TYPE:
            case COLOR_DRAWABLE_TYPE:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case INT_TYPE:
                return this.mIntegerValue;
            case FLOAT_TYPE:
                return this.mFloatValue;
            case DIMENSION_TYPE:
                return this.mFloatValue;
            default:
                return Float.NaN;
        }
    }

    public void getValuesToInterpolate(float[] fArr) {
        switch (this.mType) {
            case BOOLEAN_TYPE:
                fArr[0] = this.mBooleanValue ? 1.0f : 0.0f;
                return;
            case STRING_TYPE:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case COLOR_TYPE:
            case COLOR_DRAWABLE_TYPE:
                int r0 = this.mColorValue;
                int r2 = (r0 >> 24) & 255;
                float fPow = (float) Math.pow(((r0 >> 16) & 255) / 255.0f, 2.2d);
                float fPow2 = (float) Math.pow(((r0 >> 8) & 255) / 255.0f, 2.2d);
                float fPow3 = (float) Math.pow((r0 & 255) / 255.0f, 2.2d);
                fArr[0] = fPow;
                fArr[1] = fPow2;
                fArr[2] = fPow3;
                fArr[3] = r2 / 255.0f;
                return;
            case INT_TYPE:
                fArr[0] = this.mIntegerValue;
                return;
            case FLOAT_TYPE:
                fArr[0] = this.mFloatValue;
                return;
            case DIMENSION_TYPE:
                fArr[0] = this.mFloatValue;
                return;
            default:
                return;
        }
    }

    public void setValue(float[] fArr) {
        switch (AnonymousClass1.$SwitchMap$androidx$constraintlayout$core$motion$CustomAttribute$AttributeType[this.mType.ordinal()]) {
            case 1:
            case 6:
                this.mIntegerValue = (int) fArr[0];
                return;
            case 2:
                this.mBooleanValue = ((double) fArr[0]) > 0.5d;
                return;
            case 3:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case 4:
            case 5:
                int r0 = hsvToRgb(fArr[0], fArr[1], fArr[2]);
                this.mColorValue = r0;
                this.mColorValue = (clamp((int) (fArr[3] * 255.0f)) << 24) | (r0 & 16777215);
                return;
            case 7:
                this.mFloatValue = fArr[0];
                return;
            case 8:
                this.mFloatValue = fArr[0];
                return;
            default:
                return;
        }
    }

    public boolean diff(CustomAttribute customAttribute) {
        if (customAttribute == null || this.mType != customAttribute.mType) {
            return false;
        }
        switch (AnonymousClass1.$SwitchMap$androidx$constraintlayout$core$motion$CustomAttribute$AttributeType[this.mType.ordinal()]) {
            case 1:
            case 6:
                return this.mIntegerValue == customAttribute.mIntegerValue;
            case 2:
                return this.mBooleanValue == customAttribute.mBooleanValue;
            case 3:
                return this.mIntegerValue == customAttribute.mIntegerValue;
            case 4:
            case 5:
                return this.mColorValue == customAttribute.mColorValue;
            case 7:
                return this.mFloatValue == customAttribute.mFloatValue;
            case 8:
                return this.mFloatValue == customAttribute.mFloatValue;
            default:
                return false;
        }
    }

    public CustomAttribute(String str, AttributeType attributeType) {
        this.mMethod = false;
        this.mName = str;
        this.mType = attributeType;
    }

    public CustomAttribute(String str, AttributeType attributeType, Object obj, boolean z) {
        this.mName = str;
        this.mType = attributeType;
        this.mMethod = z;
        setValue(obj);
    }

    public CustomAttribute(CustomAttribute customAttribute, Object obj) {
        this.mMethod = false;
        this.mName = customAttribute.mName;
        this.mType = customAttribute.mType;
        setValue(obj);
    }

    public void setValue(Object obj) {
        switch (AnonymousClass1.$SwitchMap$androidx$constraintlayout$core$motion$CustomAttribute$AttributeType[this.mType.ordinal()]) {
            case 1:
            case 6:
                this.mIntegerValue = ((Integer) obj).intValue();
                break;
            case 2:
                this.mBooleanValue = ((Boolean) obj).booleanValue();
                break;
            case 3:
                this.mStringValue = (String) obj;
                break;
            case 4:
            case 5:
                this.mColorValue = ((Integer) obj).intValue();
                break;
            case 7:
                this.mFloatValue = ((Float) obj).floatValue();
                break;
            case 8:
                this.mFloatValue = ((Float) obj).floatValue();
                break;
        }
    }
}
