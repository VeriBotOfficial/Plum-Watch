package io.agora.rtc2.video;

import android.graphics.Color;
import io.agora.utils2.internal.Logging;
import java.util.ArrayList;
import java.util.List;

@Deprecated
/* loaded from: classes6.dex */
public class VideoCompositingLayout {
    public String backgroundColor;
    public int canvasHeight;
    public int canvasWidth;
    public Region[] regions = null;
    public byte[] appData = null;

    public static class Builder {
        public String appData;
        public Canvas canvas = new Canvas();
        public List<Region> regionsList;

        public Builder addWindow(Region region) {
            if (this.regionsList == null) {
                this.regionsList = new ArrayList();
            }
            this.regionsList.add(region);
            return this;
        }

        public VideoCompositingLayout create() {
            VideoCompositingLayout videoCompositingLayout = new VideoCompositingLayout();
            videoCompositingLayout.canvasWidth = this.canvas.width;
            videoCompositingLayout.canvasHeight = this.canvas.height;
            videoCompositingLayout.backgroundColor = this.canvas.bgColor;
            List<Region> list = this.regionsList;
            if (list != null && list.size() > 0) {
                List<Region> list2 = this.regionsList;
                videoCompositingLayout.regions = (Region[]) list2.toArray(new Region[list2.size()]);
            }
            String str = this.appData;
            if (str != null) {
                videoCompositingLayout.appData = str.getBytes();
            }
            return videoCompositingLayout;
        }

        public final int regionCount() {
            List<Region> list = this.regionsList;
            if (list == null) {
                return 0;
            }
            return list.size();
        }

        public Builder removeWindowForUid(int uid) {
            if (this.regionsList == null) {
                return this;
            }
            ArrayList arrayList = new ArrayList();
            for (Region region : this.regionsList) {
                if (region.uid == uid) {
                    arrayList.add(region);
                }
            }
            this.regionsList.removeAll(arrayList);
            return this;
        }

        public Builder resetWindows(List<Region> regions) {
            this.regionsList = new ArrayList(regions);
            return this;
        }

        public Builder setCanvas(int w, int h) {
            this.canvas.width = w;
            this.canvas.height = h;
            return this;
        }

        public Builder setCanvas(int w, int h, String bgColor) {
            if (VideoCompositingLayout.isValidColor(bgColor)) {
                this.canvas.bgColor = bgColor;
            } else {
                Logging.w("VideoCompositingLayout", "unknown color " + bgColor + ", using default bgColor");
            }
            return setCanvas(w, h);
        }

        public Builder updateAppData(String appData) {
            this.appData = appData;
            return this;
        }
    }

    public static class Canvas {
        public int width = 320;
        public int height = 640;
        public String bgColor = "#FF0000";
    }

    public static class Region {
        public double alpha;
        public double height;
        public int renderMode;
        public int uid;
        public String userId;
        public double width;
        public double x;
        public double y;
        public int zOrder;

        public Region alpha(double a2) {
            this.alpha = a2;
            return this;
        }

        public Region position(double x, double y) {
            this.x = x;
            this.y = y;
            return this;
        }

        public Region renderMode(int mode) {
            this.renderMode = mode;
            return this;
        }

        public Region size(double width, double height) {
            this.width = width;
            this.height = height;
            return this;
        }

        public Region uid(int uid) {
            this.uid = uid;
            return this;
        }

        public Region userId(String userId) {
            this.userId = userId;
            return this;
        }

        public Region zOrder(int z) {
            this.zOrder = z;
            return this;
        }
    }

    public static boolean isValidColor(String color) {
        try {
            Color.parseColor(color);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
