package com.baidu.mapapi.map;

/* JADX INFO: loaded from: classes15.dex */
public enum CollisionBehavior {
    NOT_COLLIDE(0),
    ALWAYS_SHOW(1),
    HIDE_BY_PRIORITY(2),
    COLLIDE_WITH_INNER(4),
    COLLIDE_WITH_BASEPOI(8),
    COLLIDE_INNER_AND_BASEPOI(12);

    private int b;

    CollisionBehavior(int r3) {
        this.b = r3;
    }

    public int getNumber() {
        return this.b;
    }
}
