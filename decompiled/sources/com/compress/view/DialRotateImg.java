package com.compress.view;

import com.compress.utils.ImageConvertTool;
import com.facebook.react.views.scroll.ReactScrollViewHelper;
import io.livekit.android.room.util.MediaConstraintKeys;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import org.xml.sax.Attributes;

/* loaded from: classes14.dex */
public class DialRotateImg extends ObjectData {
    private Point pos = new Point();
    private Point center = new Point();
    private short rotateStart = 0;
    private short rotateEnd = 0;
    private short imgId = 0;
    private short bindData = 0;
    private boolean isPeriodic = false;
    private boolean isAmbientPeriodic = false;
    private byte displayMode = 0;

    public DialRotateImg() {
        this.period = (byte) 0;
    }

    public void parseAttributes(Attributes attributes) {
        String value;
        String value2 = attributes.getValue("position");
        if (value2 != null) {
            String[] split = value2.split(" ");
            if (split.length == 2) {
                try {
                    int parseInt = Integer.parseInt(split[0]);
                    int parseInt2 = Integer.parseInt(split[1]);
                    if (parseInt < -32768 || parseInt > 32767) {
                        throw new IllegalArgumentException("[ERR]:rotate image pos x out of range");
                    }
                    if (parseInt2 < -32768 || parseInt2 > 32767) {
                        throw new IllegalArgumentException("[ERR]:rotate image pos y out of range");
                    }
                    this.pos.x = (short) parseInt;
                    this.pos.y = (short) parseInt2;
                } catch (NumberFormatException e) {
                    throw new IllegalArgumentException("[ERR]:invalid position values", e);
                }
            } else {
                throw new IllegalArgumentException("[ERR]:invalid position format");
            }
        }
        String value3 = attributes.getValue("rotate_center");
        if (value3 != null) {
            String[] split2 = value3.split(" ");
            if (split2.length == 2) {
                try {
                    float parseFloat = Float.parseFloat(split2[0]);
                    float parseFloat2 = Float.parseFloat(split2[1]);
                    this.center.x = (short) Math.round(parseFloat);
                    this.center.y = (short) Math.round(parseFloat2);
                } catch (NumberFormatException e2) {
                    throw new IllegalArgumentException("[ERR]:invalid rotate center values", e2);
                }
            } else {
                throw new IllegalArgumentException("[ERR]:invalid rotate center format");
            }
        }
        String value4 = attributes.getValue("rotate_start");
        if (value4 != null) {
            try {
                int parseInt3 = Integer.parseInt(value4);
                if (parseInt3 < 0 || parseInt3 > 360) {
                    throw new IllegalArgumentException("[ERR]:rotate image start angle out of range, [0, 360]");
                }
                this.rotateStart = (short) parseInt3;
            } catch (NumberFormatException e3) {
                throw new IllegalArgumentException("[ERR]:invalid rotate start value", e3);
            }
        }
        String value5 = attributes.getValue("rotate_end");
        if (value5 != null) {
            try {
                int parseInt4 = Integer.parseInt(value5);
                if (parseInt4 < 0 || parseInt4 > 360) {
                    throw new IllegalArgumentException("[ERR]:rotate image end angle out of range, [0, 360]");
                }
                this.rotateEnd = (short) parseInt4;
            } catch (NumberFormatException e4) {
                throw new IllegalArgumentException("[ERR]:invalid rotate end value", e4);
            }
        }
        String value6 = attributes.getValue("bind_data");
        if (value6 != null) {
            try {
                int parseInt5 = Integer.parseInt(value6);
                if (parseInt5 < 0 || parseInt5 > 32767) {
                    throw new IllegalArgumentException("[ERR]:rotate image bind data out of range");
                }
                this.bindData = (short) parseInt5;
            } catch (NumberFormatException e5) {
                throw new IllegalArgumentException("[ERR]:invalid bind data value", e5);
            }
        }
        String value7 = attributes.getValue("img_name");
        if (value7 != null) {
            this.imgId = (short) ImageConvertTool.getInstance().convertImg(value7);
        }
        String value8 = attributes.getValue("period");
        if (value8 != null) {
            try {
                int parseInt6 = Integer.parseInt(value8);
                if (parseInt6 == 0) {
                    this.isPeriodic = false;
                } else {
                    if (parseInt6 != 1 && parseInt6 != 10 && parseInt6 != 30 && parseInt6 != 60) {
                        this.period = (byte) 0;
                        System.out.println("[WARNING]:rotate image period value not supported, using default value 0");
                    }
                    this.isPeriodic = true;
                    this.period = (byte) parseInt6;
                }
            } catch (NumberFormatException e6) {
                throw new IllegalArgumentException("[ERR]:invalid period value", e6);
            }
        }
        String value9 = attributes.getValue("display_mode");
        if (value9 != null) {
            if (value9.equals("normal")) {
                this.displayMode = (byte) 0;
            } else if (value9.equals("ambient")) {
                this.displayMode = (byte) 1;
            } else if (value9.equals(ReactScrollViewHelper.OVER_SCROLL_ALWAYS)) {
                this.displayMode = (byte) 2;
            } else {
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
        ByteBuffer allocate = ByteBuffer.allocate(getSize());
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        allocate.put(this.pos.getBytes());
        allocate.put(this.center.getBytes());
        allocate.putShort(this.rotateStart);
        allocate.putShort(this.rotateEnd);
        allocate.putShort(this.imgId);
        allocate.putShort(this.bindData);
        allocate.put(this.isPeriodic ? (byte) 1 : (byte) 0);
        allocate.put(this.displayMode);
        allocate.put(this.isAmbientPeriodic ? (byte) 1 : (byte) 0);
        return allocate.array();
    }

    @Override // com.compress.view.ObjectData
    protected int getSize() {
        return Point.getSize() + Point.getSize() + 12;
    }
}
