package com.compress.view;

import com.compress.utils.ImageConvertTool;
import com.facebook.react.views.scroll.ReactScrollViewHelper;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import io.livekit.android.room.util.MediaConstraintKeys;
import java.util.ArrayList;
import java.util.List;
import org.xml.sax.Attributes;

/* loaded from: classes14.dex */
public class DialBoxProgress extends ObjectData {
    public int bgColor;
    public short bindData;
    public byte cap;
    public byte direction;
    public byte type;
    public List<ColorStop> stops = new ArrayList();
    public boolean isPeriodic = false;
    public int period = 0;
    public byte displayMode = 0;
    public boolean isAmbientPeriodic = false;
    public ProgressUnion unionValue = new ProgressUnion();
    public Rect rect = new Rect();

    @Override // com.compress.view.ObjectData
    protected int getSize() {
        return 0;
    }

    public void parseAttributes(Attributes attributes) {
        String value;
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
                        throw new IllegalArgumentException("[ERR]:box progress rect x out of range");
                    }
                    if (parseInt2 < -32768 || parseInt2 > 32767) {
                        throw new IllegalArgumentException("[ERR]:box progress rect y out of range");
                    }
                    if (parseInt3 < -32768 || parseInt3 > 32767) {
                        throw new IllegalArgumentException("[ERR]:box progress rect w out of range");
                    }
                    if (parseInt4 < -32768 || parseInt4 > 32767) {
                        throw new IllegalArgumentException("[ERR]:box progress rect h out of range");
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
        String value3 = attributes.getValue("cap_type");
        if (value3 != null) {
            if (value3.equals("round")) {
                this.cap = (byte) 1;
            } else {
                this.cap = (byte) 0;
            }
        }
        String value4 = attributes.getValue(HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION);
        if (value4 != null) {
            if (value4.equals("left_to_right")) {
                this.direction = (byte) 0;
            } else if (value4.equals("right_to_left")) {
                this.direction = (byte) 1;
            } else if (value4.equals("top_to_bottom")) {
                this.direction = (byte) 2;
            } else if (value4.equals("bottom_to_top")) {
                this.direction = (byte) 3;
            } else {
                this.direction = (byte) 0;
                System.out.println("[WARNING]:box progress direction set error, using default value");
            }
        }
        String value5 = attributes.getValue("bind_data");
        if (value5 != null) {
            try {
                int parseInt5 = Integer.parseInt(value5);
                if (parseInt5 < 0 || parseInt5 > 32767) {
                    throw new IllegalArgumentException("[ERR]:box progress bind data out of range");
                }
                this.bindData = (short) parseInt5;
            } catch (NumberFormatException e2) {
                throw new IllegalArgumentException("[ERR]:invalid bind data value", e2);
            }
        }
        String value6 = attributes.getValue("img_name");
        if (value6 != null) {
            this.unionValue.imgId = ImageConvertTool.getInstance().convertImg(value6);
            this.type = (byte) 0;
        }
        String value7 = attributes.getValue("color");
        if (value7 != null) {
            try {
                this.unionValue.color = Integer.parseInt(value7, 16);
                this.type = (byte) 1;
            } catch (NumberFormatException e3) {
                throw new IllegalArgumentException("[ERR]:invalid color value", e3);
            }
        }
        String value8 = attributes.getValue("gradient_colors");
        if (value8 != null) {
            String value9 = attributes.getValue("gradient_stops");
            if (value9 == null) {
                throw new IllegalArgumentException("[ERR]:gradient_stops attribute is missing");
            }
            String[] split2 = value9.split(" ");
            String[] split3 = value8.split(" ");
            if (split2.length != split3.length) {
                throw new IllegalArgumentException("[ERROR]:[gradient_stops] attribute count does not match [gradient_colors] attribute count");
            }
            this.unionValue.stopCount = (byte) Math.min(split2.length, split3.length);
            for (int i = 0; i < this.unionValue.stopCount; i++) {
                try {
                    this.stops.add(new ColorStop(Float.parseFloat(split2[i]), Integer.parseInt(split3[i], 16)));
                } catch (NumberFormatException e4) {
                    throw new IllegalArgumentException("[ERR]:invalid gradient stop or color value", e4);
                }
            }
            this.type = (byte) 2;
        }
        String value10 = attributes.getValue("display_mode");
        if (value10 != null) {
            if (value10.equals("normal")) {
                this.displayMode = (byte) 0;
            } else if (value10.equals("ambient")) {
                this.displayMode = (byte) 1;
            } else if (value10.equals(ReactScrollViewHelper.OVER_SCROLL_ALWAYS)) {
                this.displayMode = (byte) 2;
            } else {
                throw new IllegalArgumentException("[ERR]:invalid display mode value");
            }
        }
        if (this.displayMode != 0 && (value = attributes.getValue("ambient_periodic")) != null && value.equalsIgnoreCase(MediaConstraintKeys.TRUE)) {
            this.isAmbientPeriodic = true;
        }
        String value11 = attributes.getValue("period");
        if (value11 != null) {
            try {
                int parseInt6 = Integer.parseInt(value11);
                if (parseInt6 == 0) {
                    this.isPeriodic = false;
                } else {
                    if (parseInt6 != 1 && parseInt6 != 10 && parseInt6 != 30 && parseInt6 != 60) {
                        this.period = 0;
                        System.out.println("[WARNING]:box progress period value not supported, using default value 0");
                    }
                    this.isPeriodic = true;
                    this.period = parseInt6;
                }
            } catch (NumberFormatException e5) {
                throw new IllegalArgumentException("[ERR]:invalid period value", e5);
            }
        }
        String value12 = attributes.getValue("background_color");
        if (value12 != null) {
            try {
                this.bgColor = Integer.parseInt(value12, 16);
            } catch (NumberFormatException e6) {
                throw new IllegalArgumentException("[ERR]:invalid background color value", e6);
            }
        }
    }

    @Override // com.compress.view.ObjectData
    protected byte[] getBytes() {
        return new byte[getSize()];
    }
}
