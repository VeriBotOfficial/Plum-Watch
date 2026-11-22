package org.xmind.core;

/* loaded from: classes7.dex */
public interface IControlPoint extends IAdaptable, ISheetComponent, IPositioned {
    int getIndex();

    IRelationship getParent();

    double getPolarAmount();

    double getPolarAngle();

    boolean hasPolarAmount();

    boolean hasPolarAngle();

    void resetPolarAmount();

    void resetPolarAngle();

    void setPolarAmount(double d);

    void setPolarAngle(double d);

    boolean usesPolarPosition();
}
