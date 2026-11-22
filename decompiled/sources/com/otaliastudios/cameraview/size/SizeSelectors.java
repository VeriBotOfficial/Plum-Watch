package com.otaliastudios.cameraview.size;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes17.dex */
public class SizeSelectors {

    public interface Filter {
        boolean accepts(Size size);
    }

    public static SizeSelector withFilter(Filter filter) {
        return new FilterSelector(filter);
    }

    public static SizeSelector maxWidth(final int i) {
        return withFilter(new Filter() { // from class: com.otaliastudios.cameraview.size.SizeSelectors.1
            @Override // com.otaliastudios.cameraview.size.SizeSelectors.Filter
            public boolean accepts(Size size) {
                return size.getWidth() <= i;
            }
        });
    }

    public static SizeSelector minWidth(final int i) {
        return withFilter(new Filter() { // from class: com.otaliastudios.cameraview.size.SizeSelectors.2
            @Override // com.otaliastudios.cameraview.size.SizeSelectors.Filter
            public boolean accepts(Size size) {
                return size.getWidth() >= i;
            }
        });
    }

    public static SizeSelector maxHeight(final int i) {
        return withFilter(new Filter() { // from class: com.otaliastudios.cameraview.size.SizeSelectors.3
            @Override // com.otaliastudios.cameraview.size.SizeSelectors.Filter
            public boolean accepts(Size size) {
                return size.getHeight() <= i;
            }
        });
    }

    public static SizeSelector minHeight(final int i) {
        return withFilter(new Filter() { // from class: com.otaliastudios.cameraview.size.SizeSelectors.4
            @Override // com.otaliastudios.cameraview.size.SizeSelectors.Filter
            public boolean accepts(Size size) {
                return size.getHeight() >= i;
            }
        });
    }

    public static SizeSelector aspectRatio(AspectRatio aspectRatio, final float f) {
        final float f2 = aspectRatio.toFloat();
        return withFilter(new Filter() { // from class: com.otaliastudios.cameraview.size.SizeSelectors.5
            @Override // com.otaliastudios.cameraview.size.SizeSelectors.Filter
            public boolean accepts(Size size) {
                float f3 = AspectRatio.of(size.getWidth(), size.getHeight()).toFloat();
                float f4 = f2;
                float f5 = f;
                return f3 >= f4 - f5 && f3 <= f4 + f5;
            }
        });
    }

    public static SizeSelector biggest() {
        return new SizeSelector() { // from class: com.otaliastudios.cameraview.size.SizeSelectors.6
            @Override // com.otaliastudios.cameraview.size.SizeSelector
            public List<Size> select(List<Size> list) {
                Collections.sort(list);
                Collections.reverse(list);
                return list;
            }
        };
    }

    public static SizeSelector smallest() {
        return new SizeSelector() { // from class: com.otaliastudios.cameraview.size.SizeSelectors.7
            @Override // com.otaliastudios.cameraview.size.SizeSelector
            public List<Size> select(List<Size> list) {
                Collections.sort(list);
                return list;
            }
        };
    }

    public static SizeSelector maxArea(final int i) {
        return withFilter(new Filter() { // from class: com.otaliastudios.cameraview.size.SizeSelectors.8
            @Override // com.otaliastudios.cameraview.size.SizeSelectors.Filter
            public boolean accepts(Size size) {
                return size.getHeight() * size.getWidth() <= i;
            }
        });
    }

    public static SizeSelector minArea(final int i) {
        return withFilter(new Filter() { // from class: com.otaliastudios.cameraview.size.SizeSelectors.9
            @Override // com.otaliastudios.cameraview.size.SizeSelectors.Filter
            public boolean accepts(Size size) {
                return size.getHeight() * size.getWidth() >= i;
            }
        });
    }

    public static SizeSelector and(SizeSelector... sizeSelectorArr) {
        return new AndSelector(sizeSelectorArr);
    }

    public static SizeSelector or(SizeSelector... sizeSelectorArr) {
        return new OrSelector(sizeSelectorArr);
    }

    private static class FilterSelector implements SizeSelector {
        private Filter constraint;

        private FilterSelector(Filter filter) {
            this.constraint = filter;
        }

        @Override // com.otaliastudios.cameraview.size.SizeSelector
        public List<Size> select(List<Size> list) {
            ArrayList arrayList = new ArrayList();
            for (Size size : list) {
                if (this.constraint.accepts(size)) {
                    arrayList.add(size);
                }
            }
            return arrayList;
        }
    }

    private static class AndSelector implements SizeSelector {
        private SizeSelector[] values;

        private AndSelector(SizeSelector... sizeSelectorArr) {
            this.values = sizeSelectorArr;
        }

        @Override // com.otaliastudios.cameraview.size.SizeSelector
        public List<Size> select(List<Size> list) {
            for (SizeSelector sizeSelector : this.values) {
                list = sizeSelector.select(list);
            }
            return list;
        }
    }

    private static class OrSelector implements SizeSelector {
        private SizeSelector[] values;

        private OrSelector(SizeSelector... sizeSelectorArr) {
            this.values = sizeSelectorArr;
        }

        @Override // com.otaliastudios.cameraview.size.SizeSelector
        public List<Size> select(List<Size> list) {
            List<Size> list2 = null;
            for (SizeSelector sizeSelector : this.values) {
                list2 = sizeSelector.select(list);
                if (!list2.isEmpty()) {
                    break;
                }
            }
            return list2 == null ? new ArrayList() : list2;
        }
    }
}
