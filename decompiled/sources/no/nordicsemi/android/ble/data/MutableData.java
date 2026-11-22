package no.nordicsemi.android.ble.data;

import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;

/* loaded from: classes8.dex */
public class MutableData extends Data {
    private static final int FLOAT_EXPONENT_MAX = 127;
    private static final int FLOAT_EXPONENT_MIN = -128;
    private static final int FLOAT_MANTISSA_MAX = 8388605;
    private static final int FLOAT_NAN = 8388607;
    private static final int FLOAT_NEGATIVE_INFINITY = 8388610;
    private static final int FLOAT_POSITIVE_INFINITY = 8388606;
    private static final int FLOAT_PRECISION = 10000000;
    private static final int SFLOAT_EXPONENT_MAX = 7;
    private static final int SFLOAT_EXPONENT_MIN = -8;
    private static final int SFLOAT_MANTISSA_MAX = 2045;
    private static final float SFLOAT_MAX = 2.045E10f;
    private static final float SFLOAT_MIN = -2.045E10f;
    private static final int SFLOAT_NAN = 2047;
    private static final int SFLOAT_NEGATIVE_INFINITY = 2050;
    private static final int SFLOAT_POSITIVE_INFINITY = 2046;
    private static final int SFLOAT_PRECISION = 10000;

    private static int intToSignedBits(int i, int i2) {
        if (i >= 0) {
            return i;
        }
        int i3 = 1 << (i2 - 1);
        return i3 + (i & (i3 - 1));
    }

    private static long longToSignedBits(long j, int i) {
        if (j >= 0) {
            return j;
        }
        long j2 = 1 << (i - 1);
        return j2 + (j & (j2 - 1));
    }

    public MutableData() {
    }

    public MutableData(byte[] bArr) {
        super(bArr);
    }

    public static MutableData from(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        return new MutableData(bluetoothGattCharacteristic.getValue());
    }

    public static MutableData from(BluetoothGattDescriptor bluetoothGattDescriptor) {
        return new MutableData(bluetoothGattDescriptor.getValue());
    }

    public boolean setValue(byte[] bArr) {
        this.mValue = bArr;
        return true;
    }

    public boolean setByte(int i, int i2) {
        int i3 = i2 + 1;
        if (this.mValue == null) {
            this.mValue = new byte[i3];
        }
        if (i3 > this.mValue.length) {
            return false;
        }
        this.mValue[i2] = (byte) i;
        return true;
    }

    public boolean setValue(int i, int i2, int i3) {
        int typeLen = getTypeLen(i2) + i3;
        if (this.mValue == null) {
            this.mValue = new byte[typeLen];
        }
        if (typeLen > this.mValue.length) {
            return false;
        }
        switch (i2) {
            case 17:
                this.mValue[i3] = (byte) (i & 255);
                break;
            case 18:
                this.mValue[i3] = (byte) (i & 255);
                this.mValue[i3 + 1] = (byte) ((i >> 8) & 255);
                break;
            case 19:
                this.mValue[i3] = (byte) (i & 255);
                this.mValue[i3 + 1] = (byte) ((i >> 8) & 255);
                this.mValue[i3 + 2] = (byte) ((i >> 16) & 255);
                break;
            case 20:
                this.mValue[i3] = (byte) (i & 255);
                this.mValue[i3 + 1] = (byte) ((i >> 8) & 255);
                this.mValue[i3 + 2] = (byte) ((i >> 16) & 255);
                this.mValue[i3 + 3] = (byte) ((i >> 24) & 255);
                break;
            default:
                switch (i2) {
                    case 33:
                        i = intToSignedBits(i, 8);
                        this.mValue[i3] = (byte) (i & 255);
                        break;
                    case 34:
                        i = intToSignedBits(i, 16);
                        this.mValue[i3] = (byte) (i & 255);
                        this.mValue[i3 + 1] = (byte) ((i >> 8) & 255);
                        break;
                    case 35:
                        i = intToSignedBits(i, 24);
                        this.mValue[i3] = (byte) (i & 255);
                        this.mValue[i3 + 1] = (byte) ((i >> 8) & 255);
                        this.mValue[i3 + 2] = (byte) ((i >> 16) & 255);
                        break;
                    case 36:
                        i = intToSignedBits(i, 32);
                        this.mValue[i3] = (byte) (i & 255);
                        this.mValue[i3 + 1] = (byte) ((i >> 8) & 255);
                        this.mValue[i3 + 2] = (byte) ((i >> 16) & 255);
                        this.mValue[i3 + 3] = (byte) ((i >> 24) & 255);
                        break;
                    default:
                        switch (i2) {
                            case 274:
                                this.mValue[i3] = (byte) ((i >> 8) & 255);
                                this.mValue[i3 + 1] = (byte) (i & 255);
                                break;
                            case 275:
                                this.mValue[i3] = (byte) ((i >> 16) & 255);
                                this.mValue[i3 + 1] = (byte) ((i >> 8) & 255);
                                this.mValue[i3 + 2] = (byte) (i & 255);
                                break;
                            case 276:
                                this.mValue[i3] = (byte) ((i >> 24) & 255);
                                this.mValue[i3 + 1] = (byte) ((i >> 16) & 255);
                                this.mValue[i3 + 2] = (byte) ((i >> 8) & 255);
                                this.mValue[i3 + 3] = (byte) (i & 255);
                                break;
                            default:
                                switch (i2) {
                                    case 290:
                                        i = intToSignedBits(i, 16);
                                        this.mValue[i3] = (byte) ((i >> 8) & 255);
                                        this.mValue[i3 + 1] = (byte) (i & 255);
                                        break;
                                    case 291:
                                        i = intToSignedBits(i, 24);
                                        this.mValue[i3] = (byte) ((i >> 16) & 255);
                                        this.mValue[i3 + 1] = (byte) ((i >> 8) & 255);
                                        this.mValue[i3 + 2] = (byte) (i & 255);
                                        break;
                                    case 292:
                                        i = intToSignedBits(i, 32);
                                        this.mValue[i3] = (byte) ((i >> 24) & 255);
                                        this.mValue[i3 + 1] = (byte) ((i >> 16) & 255);
                                        this.mValue[i3 + 2] = (byte) ((i >> 8) & 255);
                                        this.mValue[i3 + 3] = (byte) (i & 255);
                                        break;
                                }
                        }
                }
        }
        return false;
    }

    public boolean setValue(int i, int i2, int i3, int i4) {
        int typeLen = getTypeLen(i3) + i4;
        if (this.mValue == null) {
            this.mValue = new byte[typeLen];
        }
        if (typeLen > this.mValue.length) {
            return false;
        }
        if (i3 == 50) {
            int intToSignedBits = intToSignedBits(i, 12);
            int intToSignedBits2 = intToSignedBits(i2, 4);
            int i5 = i4 + 1;
            this.mValue[i4] = (byte) (intToSignedBits & 255);
            this.mValue[i5] = (byte) ((intToSignedBits >> 8) & 15);
            byte[] bArr = this.mValue;
            bArr[i5] = (byte) (bArr[i5] + ((byte) ((intToSignedBits2 & 15) << 4)));
            return true;
        }
        if (i3 != 52) {
            return false;
        }
        int intToSignedBits3 = intToSignedBits(i, 24);
        int intToSignedBits4 = intToSignedBits(i2, 8);
        this.mValue[i4] = (byte) (intToSignedBits3 & 255);
        int i6 = i4 + 2;
        this.mValue[i4 + 1] = (byte) ((intToSignedBits3 >> 8) & 255);
        int i7 = i4 + 3;
        this.mValue[i6] = (byte) ((intToSignedBits3 >> 16) & 255);
        byte[] bArr2 = this.mValue;
        bArr2[i7] = (byte) (bArr2[i7] + ((byte) (intToSignedBits4 & 255)));
        return true;
    }

    public boolean setValue(long j, int i, int i2) {
        int typeLen = getTypeLen(i) + i2;
        if (this.mValue == null) {
            this.mValue = new byte[typeLen];
        }
        if (typeLen > this.mValue.length) {
            return false;
        }
        if (i != 20) {
            if (i == 36) {
                j = longToSignedBits(j, 32);
            } else {
                if (i != 276) {
                    if (i != 292) {
                        return false;
                    }
                    j = longToSignedBits(j, 32);
                }
                this.mValue[i2] = (byte) ((j >> 24) & 255);
                this.mValue[i2 + 1] = (byte) ((j >> 16) & 255);
                this.mValue[i2 + 2] = (byte) ((j >> 8) & 255);
                this.mValue[i2 + 3] = (byte) (j & 255);
                return true;
            }
        }
        this.mValue[i2] = (byte) (j & 255);
        this.mValue[i2 + 1] = (byte) ((j >> 8) & 255);
        this.mValue[i2 + 2] = (byte) ((j >> 16) & 255);
        this.mValue[i2 + 3] = (byte) ((j >> 24) & 255);
        return true;
    }

    public boolean setValue(float f, int i, int i2) {
        int typeLen = getTypeLen(i) + i2;
        if (this.mValue == null) {
            this.mValue = new byte[typeLen];
        }
        if (typeLen > this.mValue.length) {
            return false;
        }
        if (i == 50) {
            int sfloatToInt = sfloatToInt(f);
            this.mValue[i2] = (byte) (sfloatToInt & 255);
            this.mValue[i2 + 1] = (byte) ((sfloatToInt >> 8) & 255);
            return true;
        }
        if (i != 52) {
            return false;
        }
        int floatToInt = floatToInt(f);
        this.mValue[i2] = (byte) (floatToInt & 255);
        int i3 = i2 + 2;
        this.mValue[i2 + 1] = (byte) ((floatToInt >> 8) & 255);
        int i4 = i2 + 3;
        this.mValue[i3] = (byte) ((floatToInt >> 16) & 255);
        byte[] bArr = this.mValue;
        bArr[i4] = (byte) (bArr[i4] + ((byte) ((floatToInt >> 24) & 255)));
        return true;
    }

    private static int sfloatToInt(float f) {
        if (Float.isNaN(f)) {
            return SFLOAT_NAN;
        }
        if (f > SFLOAT_MAX) {
            return SFLOAT_POSITIVE_INFINITY;
        }
        if (f < SFLOAT_MIN) {
            return 2050;
        }
        int i = f >= 0.0f ? 1 : -1;
        float abs = Math.abs(f);
        int i2 = 0;
        while (abs > 2045.0f) {
            abs /= 10.0f;
            i2++;
            if (i2 > 7) {
                if (i > 0) {
                    return SFLOAT_POSITIVE_INFINITY;
                }
                return 2050;
            }
        }
        while (abs < 1.0f) {
            abs *= 10.0f;
            i2--;
            if (i2 < -8) {
                return 0;
            }
        }
        double abs2 = Math.abs(Math.round(abs * 10000.0f) - (Math.round(abs) * 10000));
        while (abs2 > 0.5d && i2 > -8) {
            float f2 = abs * 10.0f;
            if (f2 > 2045.0f) {
                break;
            }
            i2--;
            abs2 = Math.abs(Math.round(f2 * 10000.0f) - (Math.round(f2) * 10000));
            abs = f2;
        }
        return (Math.round(i * abs) & 4095) | ((i2 & 15) << 12);
    }

    private static int floatToInt(float f) {
        if (Float.isNaN(f)) {
            return FLOAT_NAN;
        }
        if (f == Float.POSITIVE_INFINITY) {
            return FLOAT_POSITIVE_INFINITY;
        }
        if (f == Float.NEGATIVE_INFINITY) {
            return FLOAT_NEGATIVE_INFINITY;
        }
        int i = f >= 0.0f ? 1 : -1;
        float abs = Math.abs(f);
        int i2 = 0;
        while (abs > 8388605.0f) {
            abs /= 10.0f;
            i2++;
            if (i2 > 127) {
                return i > 0 ? FLOAT_POSITIVE_INFINITY : FLOAT_NEGATIVE_INFINITY;
            }
        }
        while (abs < 1.0f) {
            abs *= 10.0f;
            i2--;
            if (i2 < -128) {
                return 0;
            }
        }
        double abs2 = Math.abs(Math.round(abs * 1.0E7f) - (Math.round(abs) * 10000000));
        while (abs2 > 0.5d && i2 > -128) {
            float f2 = abs * 10.0f;
            if (f2 > 8388605.0f) {
                break;
            }
            i2--;
            abs2 = Math.abs(Math.round(f2 * 1.0E7f) - (Math.round(f2) * 10000000));
            abs = f2;
        }
        return (Math.round(i * abs) & 16777215) | (i2 << 24);
    }
}
