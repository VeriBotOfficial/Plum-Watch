package com.compress.view;

import android.graphics.Color;
import android.util.Log;
import io.livekit.android.room.util.MediaConstraintKeys;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import org.xmind.core.internal.dom.DOMConstants;
import org.xml.sax.Attributes;

/* loaded from: classes14.dex */
public class DialLabel extends ObjectData {
    private byte align;
    private short bindData;
    private byte breakMode;
    private int color;
    private byte fontSize;
    private byte[] fontName = new byte[64];
    private byte[] text = new byte[64];
    private boolean isPeriodic = false;
    private boolean isAmbientPeriodic = false;
    private Rect rect = new Rect();

    public DialLabel() {
        this.period = (byte) 0;
        this.displayMode = (byte) 0;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public void parseAttributes(Attributes attributes) {
        String value;
        boolean z;
        boolean z2;
        String value2 = attributes.getValue("rect");
        if (value2 != null) {
            String[] split = value2.split(" ");
            if (split.length == 4) {
                try {
                    int parseInt = Integer.parseInt(split[0]);
                    int parseInt2 = Integer.parseInt(split[1]);
                    int parseInt3 = Integer.parseInt(split[2]);
                    int parseInt4 = Integer.parseInt(split[3]);
                    if (parseInt < -32768 || parseInt > 32767) {
                        throw new IllegalArgumentException("[ERR]:label rect x out of range");
                    }
                    if (parseInt2 < -32768 || parseInt2 > 32767) {
                        throw new IllegalArgumentException("[ERR]:label rect y out of range");
                    }
                    if (parseInt3 < -32768 || parseInt3 > 32767) {
                        throw new IllegalArgumentException("[ERR]:label rect w out of range");
                    }
                    if (parseInt4 < -32768 || parseInt4 > 32767) {
                        throw new IllegalArgumentException("[ERR]:label rect h out of range");
                    }
                    this.rect.x = (short) parseInt;
                    this.rect.y = (short) parseInt2;
                    this.rect.w = (short) parseInt3;
                    this.rect.h = (short) parseInt4;
                } catch (NumberFormatException e) {
                    throw new IllegalArgumentException("[ERR]:invalid rect values", e);
                }
            } else {
                throw new IllegalArgumentException("[ERR]:invalid rect format");
            }
        }
        String value3 = attributes.getValue("break_mode");
        if (value3 != null) {
            value3.hashCode();
            switch (value3.hashCode()) {
                case -1881872635:
                    if (value3.equals("stretch")) {
                        z2 = false;
                        break;
                    }
                    z2 = -1;
                    break;
                case 3056464:
                    if (value3.equals("clip")) {
                        z2 = true;
                        break;
                    }
                    z2 = -1;
                    break;
                case 3657802:
                    if (value3.equals("wrap")) {
                        z2 = 2;
                        break;
                    }
                    z2 = -1;
                    break;
                case 92657442:
                    if (value3.equals("adapt")) {
                        z2 = 3;
                        break;
                    }
                    z2 = -1;
                    break;
                case 188702929:
                    if (value3.equals("ellipsis")) {
                        z2 = 4;
                        break;
                    }
                    z2 = -1;
                    break;
                case 839444514:
                    if (value3.equals("marquee")) {
                        z2 = 5;
                        break;
                    }
                    z2 = -1;
                    break;
                default:
                    z2 = -1;
                    break;
            }
            switch (z2) {
                case false:
                    this.breakMode = (byte) 1;
                    break;
                case true:
                    this.breakMode = (byte) 5;
                    break;
                case true:
                    this.breakMode = (byte) 2;
                    break;
                case true:
                    this.breakMode = (byte) 0;
                    break;
                case true:
                    this.breakMode = (byte) 3;
                    break;
                case true:
                    this.breakMode = (byte) 4;
                    break;
                default:
                    this.breakMode = (byte) 3;
                    System.out.println("[WARNING][label:break_mode]Incorrect input: " + value3);
                    break;
            }
        }
        String value4 = attributes.getValue(DOMConstants.ATTR_ALIGN);
        if (value4 != null) {
            value4.hashCode();
            switch (value4.hashCode()) {
                case -1383228885:
                    if (value4.equals("bottom")) {
                        z = false;
                        break;
                    }
                    z = -1;
                    break;
                case -1364013995:
                    if (value4.equals("center")) {
                        z = true;
                        break;
                    }
                    z = -1;
                    break;
                case 115029:
                    if (value4.equals("top")) {
                        z = 2;
                        break;
                    }
                    z = -1;
                    break;
                case 3317767:
                    if (value4.equals("left")) {
                        z = 3;
                        break;
                    }
                    z = -1;
                    break;
                case 108511772:
                    if (value4.equals("right")) {
                        z = 4;
                        break;
                    }
                    z = -1;
                    break;
                default:
                    z = -1;
                    break;
            }
            switch (z) {
                case false:
                    this.align = (byte) 4;
                    break;
                case true:
                    this.align = (byte) 2;
                    break;
                case true:
                    this.align = (byte) 3;
                    break;
                case true:
                    this.align = (byte) 0;
                    break;
                case true:
                    this.align = (byte) 1;
                    break;
                default:
                    this.align = (byte) 0;
                    System.out.println("[WARNING][label:align]Incorrect input: " + value4);
                    break;
            }
        }
        String value5 = attributes.getValue("font_size");
        if (value5 != null) {
            try {
                int parseInt5 = Integer.parseInt(value5);
                if (parseInt5 < 0 || parseInt5 > 127) {
                    throw new IllegalArgumentException("[ERR]:label font size out of range");
                }
                this.fontSize = (byte) parseInt5;
            } catch (NumberFormatException e2) {
                throw new IllegalArgumentException("[ERR]:invalid font size value", e2);
            }
        }
        String value6 = attributes.getValue("color");
        Log.i("DialConvertTool", "colorStr: " + value6);
        if (!value6.equals("") || !value6.isEmpty() || value6 != null) {
            String replace = value6.replace("0x", "#");
            Log.i("DialConvertTool", "colorStr2: " + replace);
            try {
                this.color = Color.parseColor(replace);
                Log.i("DialConvertTool", "color int: " + this.color);
            } catch (NumberFormatException e3) {
                throw new IllegalArgumentException("[ERR]:invalid color value", e3);
            }
        }
        String value7 = attributes.getValue("font");
        if (value7 != null) {
            byte[] bytes = value7.getBytes();
            System.arraycopy(bytes, 0, this.fontName, 0, Math.min(bytes.length, 64));
        }
        String value8 = attributes.getValue("text");
        if (value8 != null) {
            byte[] bytes2 = value8.getBytes();
            System.arraycopy(bytes2, 0, this.text, 0, Math.min(bytes2.length, 64));
        }
        String value9 = attributes.getValue("bind_data");
        if (value9 != null) {
            try {
                int parseInt6 = Integer.parseInt(value9);
                if (parseInt6 < 0 || parseInt6 > 32767) {
                    throw new IllegalArgumentException("[ERR]:label bind data out of range");
                }
                this.bindData = (short) parseInt6;
            } catch (NumberFormatException e4) {
                throw new IllegalArgumentException("[ERR]:invalid bind data value", e4);
            }
        }
        String value10 = attributes.getValue("period");
        if (value10 != null) {
            try {
                int parseInt7 = Integer.parseInt(value10);
                if (parseInt7 == 0) {
                    this.isPeriodic = false;
                } else {
                    if (parseInt7 != 1 && parseInt7 != 10 && parseInt7 != 30 && parseInt7 != 60) {
                        this.period = (byte) 0;
                        System.out.println("[WARNING]:label image period value not supported, using default value 0");
                    }
                    this.isPeriodic = true;
                    this.period = (byte) parseInt7;
                }
            } catch (NumberFormatException e5) {
                throw new IllegalArgumentException("[ERR]:invalid period value", e5);
            }
        }
        String value11 = attributes.getValue("display_mode");
        if (value11 != null) {
            value11.hashCode();
            switch (value11) {
                case "always":
                    this.displayMode = (byte) 2;
                    break;
                case "normal":
                    this.displayMode = (byte) 0;
                    break;
                case "ambient":
                    this.displayMode = (byte) 1;
                    break;
                default:
                    throw new IllegalArgumentException("[ERR]:invalid display mode value");
            }
        }
        if (this.displayMode != 0 && (value = attributes.getValue("ambient_periodic")) != null && value.equalsIgnoreCase(MediaConstraintKeys.TRUE)) {
            this.isAmbientPeriodic = true;
        }
        if (this.isPeriodic && this.bindData == 0) {
            throw new IllegalArgumentException("[ERR]:[bind_data] is not set, [period] cannot be set");
        }
    }

    @Override // com.compress.view.ObjectData
    protected byte[] getBytes() {
        ByteBuffer order = ByteBuffer.allocate(getSize()).order(ByteOrder.LITTLE_ENDIAN);
        order.put(this.breakMode);
        order.put(this.align);
        order.put(this.fontSize);
        order.put(this.isPeriodic ? (byte) 1 : (byte) 0);
        order.put(this.rect.getBytes());
        order.putInt(this.color);
        order.put(this.fontName);
        order.put(this.text);
        order.putShort(this.bindData);
        order.put(this.displayMode);
        order.put(this.isAmbientPeriodic ? (byte) 1 : (byte) 0);
        return order.array();
    }

    @Override // com.compress.view.ObjectData
    protected int getSize() {
        return this.rect.getSize() + 140;
    }
}
