package com.compress.view;

import com.compress.utils.ImageConvertTool;
import com.facebook.react.views.scroll.ReactScrollViewHelper;
import io.livekit.android.room.util.MediaConstraintKeys;
import java.util.ArrayList;
import java.util.List;
import org.xml.sax.Attributes;

/* loaded from: classes14.dex */
public class DialArcProgress extends ObjectData {
    public int bgColor;
    public short bindData;
    public byte cap;
    public short endAngle;
    public short lineWidth;
    public short radius;
    public short startAngle;
    public byte type;
    public List<ColorStop> stops = new ArrayList();
    public int period = 0;
    public boolean isPeriodic = false;
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
                        throw new IllegalArgumentException("[ERR]:arc progress rect x out of range");
                    }
                    if (parseInt2 < -32768 || parseInt2 > 32767) {
                        throw new IllegalArgumentException("[ERR]:arc progress rect y out of range");
                    }
                    if (parseInt3 < -32768 || parseInt3 > 32767) {
                        throw new IllegalArgumentException("[ERR]:arc progress rect w out of range");
                    }
                    if (parseInt4 < -32768 || parseInt4 > 32767) {
                        throw new IllegalArgumentException("[ERR]:arc progress rect h out of range");
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
        String value4 = attributes.getValue("radius");
        if (value4 != null) {
            try {
                int parseInt5 = Integer.parseInt(value4);
                if (parseInt5 < 0 || parseInt5 > 32767) {
                    throw new IllegalArgumentException("[ERR]:arc progress radius out of range");
                }
                this.radius = (short) parseInt5;
            } catch (NumberFormatException e2) {
                throw new IllegalArgumentException("[ERR]:invalid radius value", e2);
            }
        }
        String value5 = attributes.getValue("start_angle");
        if (value5 != null) {
            try {
                int parseInt6 = Integer.parseInt(value5);
                if (parseInt6 < 0 || parseInt6 > 360) {
                    throw new IllegalArgumentException("[ERR]:arc progress start angle out of range");
                }
                this.startAngle = (short) parseInt6;
            } catch (NumberFormatException e3) {
                throw new IllegalArgumentException("[ERR]:invalid start angle value", e3);
            }
        }
        String value6 = attributes.getValue("end_angle");
        if (value6 != null) {
            try {
                int parseInt7 = Integer.parseInt(value6);
                if (parseInt7 < 0 || parseInt7 > 360) {
                    throw new IllegalArgumentException("[ERR]:arc progress end angle out of range");
                }
                this.endAngle = (short) parseInt7;
            } catch (NumberFormatException e4) {
                throw new IllegalArgumentException("[ERR]:invalid end angle value", e4);
            }
        }
        String value7 = attributes.getValue("line_width");
        if (value7 != null) {
            try {
                int parseInt8 = Integer.parseInt(value7);
                if (parseInt8 < 0 || parseInt8 > 32767) {
                    throw new IllegalArgumentException("[ERR]:arc progress line width out of range");
                }
                this.lineWidth = (short) parseInt8;
            } catch (NumberFormatException e5) {
                throw new IllegalArgumentException("[ERR]:invalid line width value", e5);
            }
        }
        String value8 = attributes.getValue("bind_data");
        if (value8 != null) {
            try {
                int parseInt9 = Integer.parseInt(value8);
                if (parseInt9 < 0 || parseInt9 > 32767) {
                    throw new IllegalArgumentException("[ERR]:arc progress bind data out of range");
                }
                this.bindData = (short) parseInt9;
            } catch (NumberFormatException e6) {
                throw new IllegalArgumentException("[ERR]:invalid bind data value", e6);
            }
        }
        String value9 = attributes.getValue("img_name");
        if (value9 != null) {
            this.unionValue.imgId = ImageConvertTool.getInstance().convertImg(value9);
            this.type = (byte) 0;
        }
        String value10 = attributes.getValue("color");
        if (value10 != null) {
            try {
                this.unionValue.color = Integer.parseInt(value10, 16);
                this.type = (byte) 1;
            } catch (NumberFormatException e7) {
                throw new IllegalArgumentException("[ERR]:invalid color value", e7);
            }
        }
        String value11 = attributes.getValue("gradient_colors");
        if (value11 != null) {
            String value12 = attributes.getValue("gradient_stops");
            if (value12 == null) {
                throw new IllegalArgumentException("[ERR]:gradient_stops attribute is missing");
            }
            String[] split2 = value12.split(" ");
            String[] split3 = value11.split(" ");
            if (split2.length != split3.length) {
                throw new IllegalArgumentException("[ERROR]:[gradient_stops] attribute count does not match [gradient_colors] attribute count");
            }
            this.unionValue.stopCount = (byte) Math.min(split2.length, split3.length);
            for (int i = 0; i < this.unionValue.stopCount; i++) {
                try {
                    this.stops.add(new ColorStop(Float.parseFloat(split2[i]), Integer.parseInt(split3[i], 16)));
                } catch (NumberFormatException e8) {
                    throw new IllegalArgumentException("[ERR]:invalid gradient stop or color value", e8);
                }
            }
            this.type = (byte) 2;
        }
        String value13 = attributes.getValue("display_mode");
        if (value13 != null) {
            if (value13.equals("normal")) {
                this.displayMode = (byte) 0;
            } else if (value13.equals("ambient")) {
                this.displayMode = (byte) 1;
            } else if (value13.equals(ReactScrollViewHelper.OVER_SCROLL_ALWAYS)) {
                this.displayMode = (byte) 2;
            } else {
                throw new IllegalArgumentException("[ERR]:invalid display mode value");
            }
        }
        if (this.displayMode != 0 && (value = attributes.getValue("ambient_periodic")) != null && value.equalsIgnoreCase(MediaConstraintKeys.TRUE)) {
            this.isAmbientPeriodic = true;
        }
        String value14 = attributes.getValue("period");
        if (value14 != null) {
            try {
                int parseInt10 = Integer.parseInt(value14);
                if (parseInt10 == 0) {
                    this.isPeriodic = false;
                } else {
                    if (parseInt10 != 1 && parseInt10 != 10 && parseInt10 != 30 && parseInt10 != 60) {
                        this.period = 0;
                        System.out.println("[WARNING]:arc progress period value not supported, using default value 0");
                    }
                    this.isPeriodic = true;
                    this.period = parseInt10;
                }
            } catch (NumberFormatException e9) {
                throw new IllegalArgumentException("[ERR]:invalid period value", e9);
            }
        }
        String value15 = attributes.getValue("background_color");
        if (value15 != null) {
            try {
                this.bgColor = Integer.parseInt(value15, 16);
            } catch (NumberFormatException e10) {
                throw new IllegalArgumentException("[ERR]:invalid background color value", e10);
            }
        }
    }

    @Override // com.compress.view.ObjectData
    protected byte[] getBytes() {
        return new byte[getSize()];
    }
}
