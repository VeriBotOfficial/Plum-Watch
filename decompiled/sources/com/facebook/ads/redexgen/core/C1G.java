package com.facebook.ads.redexgen.core;

import java.util.Arrays;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import org.tensorflow.lite.schema.BuiltinOptions;

/* JADX INFO: Add missing generic type declarations: [E] */
/* JADX WARN: Unexpected interfaces in signature: [kotlin.jvm.internal.markers.KMappedMarker] */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010*\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0092\u0004\u0018\u00002\f0\u0001R\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\u0005H\u0016J\r\u0010\n\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u000bJ\b\u0010\f\u001a\u00020\u0005H\u0016¨\u0006\r"}, d2 = {"Lkotlin/collections/AbstractList$ListIteratorImpl;", "Lkotlin/collections/AbstractList$IteratorImpl;", "Lkotlin/collections/AbstractList;", "", "index", "", "(Lkotlin/collections/AbstractList;I)V", "hasPrevious", "", "nextIndex", "previous", "()Ljava/lang/Object;", "previousIndex", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.facebook.ads.redexgen.X.1G, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public class C1G<E> extends C1F<E>.IteratorImpl implements ListIterator<E> {
    public static byte[] A01;
    public final /* synthetic */ C1F<E> A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 88);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{18, BuiltinOptions.GreaterEqualOptions, BuiltinOptions.PowOptions, BuiltinOptions.SelectOptions, BuiltinOptions.LogicalOrOptions, BuiltinOptions.LessOptions, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.TileOptions, BuiltinOptions.BitwiseXorOptions, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.LessEqualOptions, BuiltinOptions.BitwiseXorOptions, BuiltinOptions.TileOptions, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.LessOptions, BuiltinOptions.BitwiseXorOptions, BuiltinOptions.LessEqualOptions, BuiltinOptions.ArgMaxOptions, BuiltinOptions.GreaterEqualOptions, BuiltinOptions.GreaterEqualOptions, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.SelectOptions, BuiltinOptions.LessOptions, BuiltinOptions.PowOptions, BuiltinOptions.ArgMinOptions, BuiltinOptions.BitwiseXorOptions, BuiltinOptions.PackOptions, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.SelectOptions, BuiltinOptions.BitwiseXorOptions, BuiltinOptions.SelectOptions, BuiltinOptions.PowOptions, BuiltinOptions.LogicalOrOptions, BuiltinOptions.ArgMinOptions, BuiltinOptions.ReadVariableOptions, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.TileOptions, BuiltinOptions.TransposeConvOptions, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.BitwiseXorOptions, BuiltinOptions.LogicalAndOptions, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.TransposeConvOptions, BuiltinOptions.TransposeConvOptions, BuiltinOptions.PowOptions, BuiltinOptions.LogicalAndOptions, BuiltinOptions.LessOptions, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.TileOptions};
    }

    @Override // java.util.ListIterator
    public final void add(E e) {
        throw new UnsupportedOperationException(A00(0, 51, 5));
    }

    @Override // java.util.ListIterator
    public final void set(E e) {
        throw new UnsupportedOperationException(A00(0, 51, 5));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1G(C1F c1f, int i) {
        super(c1f);
        this.A00 = c1f;
        C1F.A02.A04(i, this.A00.size());
        A05(i);
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return getA00() > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return getA00();
    }

    @Override // java.util.ListIterator
    public final E previous() {
        if (hasPrevious()) {
            C1F<E> c1f = this.A00;
            A05(getA00() - 1);
            return c1f.get(getA00());
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return getA00() - 1;
    }
}
