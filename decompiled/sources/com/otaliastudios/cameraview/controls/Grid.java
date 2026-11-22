package com.otaliastudios.cameraview.controls;

/* loaded from: classes17.dex */
public enum Grid implements Control {
    OFF(0),
    DRAW_3X3(1),
    DRAW_4X4(2),
    DRAW_PHI(3);

    private int value;
    static final Grid DEFAULT = OFF;

    Grid(int i) {
        this.value = i;
    }

    int value() {
        return this.value;
    }

    static Grid fromValue(int i) {
        for (Grid grid : values()) {
            if (grid.value() == i) {
                return grid;
            }
        }
        return DEFAULT;
    }
}
