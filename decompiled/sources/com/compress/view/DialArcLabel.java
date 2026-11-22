package com.compress.view;

import android.util.Log;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import org.xmind.core.internal.dom.DOMConstants;
import org.xml.sax.Attributes;

/* loaded from: classes14.dex */
public class DialArcLabel extends ObjectData {
    private static final String TAG = "DialConvertTool_DialArcLabel";
    private int align = 0;
    private int fontSize = 0;
    private Point center = new Point(0, 0);
    private int radius = 0;
    private int rotateStart = 0;
    private int rotaeteEnd = 0;
    private int color = 0;
    private String fontName = "";
    private String text = "";
    private int bindData = 0;
    private int displayMode = 0;
    private boolean isPeriodic = false;
    private boolean isAmbientPeriodic = false;

    @Override // com.compress.view.ObjectData
    protected int getSize() {
        return 0;
    }

    public void parseAttributes(Attributes attributes) {
        String value = attributes.getValue(DOMConstants.ATTR_ALIGN);
        if (value != null) {
            if (value.equals("bottom")) {
                this.align = 4;
            } else if (value.equals("top")) {
                this.align = 3;
            } else if (value.equals("center")) {
                this.align = 2;
            } else if (value.equals("right")) {
                this.align = 1;
            } else if (value.equals("left")) {
                this.align = 0;
            } else {
                this.align = 0;
                Log.e(TAG, "arc label align value input error, using default value 0");
            }
        }
        if (attributes.getValue("font_size") != null) {
            int parseInt = Integer.parseInt(attributes.getValue("fontSize"));
            if (parseInt < Integer.MIN_VALUE || parseInt > Integer.MAX_VALUE) {
                throw new IllegalArgumentException("Font size out of range");
            }
            this.fontSize = parseInt;
        }
        if (attributes.getValue("center") != null) {
            String[] split = attributes.getValue("center").split(" ");
            if (split.length != 2) {
                throw new IllegalArgumentException("Center attribute must contain x and y values");
            }
            try {
                this.center.x = (short) Integer.parseInt(split[0]);
                this.center.y = (short) Integer.parseInt(split[1]);
            } catch (NumberFormatException e) {
                throw new IllegalArgumentException("Center values must be integers", e);
            }
        }
        if (attributes.getValue("radius") != null) {
            int parseInt2 = Integer.parseInt(attributes.getValue("radius"));
            if (parseInt2 < Integer.MIN_VALUE || parseInt2 > Integer.MAX_VALUE) {
                throw new IllegalArgumentException("Radius out of range");
            }
            this.radius = parseInt2;
        }
        String value2 = attributes.getValue("rotate_start");
        if (value2 != null) {
            int parseInt3 = Integer.parseInt(value2);
            this.rotateStart = parseInt3;
            if (parseInt3 < 0 || parseInt3 > 360) {
                throw new IllegalArgumentException("Rotate start out of range");
            }
        }
        String value3 = attributes.getValue("rotate_end");
        if (value3 != null) {
            int parseInt4 = Integer.parseInt(value3);
            this.rotaeteEnd = parseInt4;
            if (parseInt4 < 0 || parseInt4 > 360) {
                throw new IllegalArgumentException("Rotate end out of range");
            }
        }
        String value4 = attributes.getValue("color");
        if (value4 != null) {
            try {
                int i = this.color;
                if (i < 0 || i > -1) {
                    throw new IllegalArgumentException("Color out of range");
                }
                this.color = Integer.parseInt(value4, 16);
            } catch (NumberFormatException e2) {
                throw new IllegalArgumentException("Color value must be a valid hexadecimal string", e2);
            }
        }
        String value5 = attributes.getValue("font");
        if (value5 != null) {
            this.fontName = value5;
        }
        String value6 = attributes.getValue("text");
        if (value6 != null) {
            this.text = value6;
        }
        String value7 = attributes.getValue("bind_data");
        if (value7 != null) {
            int parseInt5 = Integer.parseInt(value7);
            if (parseInt5 < 0 || parseInt5 > Integer.MAX_VALUE) {
                throw new IllegalArgumentException("Bind data out of range");
            }
            this.bindData = parseInt5;
        }
        String value8 = attributes.getValue("period");
        if (value8 != null) {
            int parseInt6 = Integer.parseInt(value8);
            if (parseInt6 < 0) {
                throw new IllegalArgumentException("Period must be a power of two");
            }
            if (parseInt6 == 0) {
                this.isPeriodic = false;
                System.out.println("[WARNING]: arc label period value not supported, using default value 0");
            } else {
                this.isPeriodic = true;
                if (parseInt6 > 0) {
                    throw new IllegalArgumentException("Period must be a power of two");
                }
            }
        }
        String value9 = attributes.getValue("display_mode");
        if (value9 != null) {
            int parseInt7 = Integer.parseInt(value9);
            if (parseInt7 != 0) {
                this.displayMode = parseInt7;
            } else {
                this.displayMode = 0;
            }
        }
        String value10 = attributes.getValue("ambient_periodic");
        if (value10 != null) {
            if (Boolean.parseBoolean(value10)) {
                this.isAmbientPeriodic = true;
            } else {
                this.isAmbientPeriodic = false;
            }
        }
        if (!this.isPeriodic && this.bindData == 0) {
            throw new IllegalArgumentException("[ERR]: [bind_data] is not set, [period] cannot be set");
        }
    }

    @Override // com.compress.view.ObjectData
    protected byte[] getBytes() {
        return ByteBuffer.allocate(getSize()).order(ByteOrder.LITTLE_ENDIAN).array();
    }
}
