package com.facebook.ads.redexgen.core;

import com.google.common.collect.ElementTypesAreNonnullByDefault;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import javax.annotation.CheckForNull;
import org.tensorflow.lite.schema.BuiltinOptions;

@ElementTypesAreNonnullByDefault
/* renamed from: com.facebook.ads.redexgen.X.Am, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC1372Am<E> extends AbstractC2767ma<E> implements List<E>, RandomAccess {
    public static byte[] A00 = null;
    public static String[] A01 = {"fHdUBkHaeOb", "RH", "RyMA6PTlrDF2m99nGPMPg2CjhSKVyaSQ", "ENegzNvFlexY3BR2RKk1z4PrLej5P8FF", "wggVriGK93MfFtYQABEEs6Hvem71Ew8R", "ul6RrA3f2JvHqPW8xA7h0PXskLz1uboQ", "Eo8bayYlVcx2q99x4ketqZKtcr", "wTUtZUDKElMjm9Nu5uZgljoHw4l"};
    public static final AF<Object> A02;
    public static final long serialVersionUID = -889275714;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static <E> AbstractC1372Am<E> A05(Collection<? extends E> elements) {
        if (!(elements instanceof AbstractC2767ma)) {
            return A08(elements.toArray());
        }
        AbstractC1372Am<E> A0J = ((AbstractC2767ma) elements).A0J();
        return A0J.A0K() ? A06(A0J.toArray()) : A0J;
    }

    public static String A0A(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A01;
            if (strArr[0].length() == strArr[7].length()) {
                throw new RuntimeException();
            }
            A01[1] = "b9";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 22);
            i4++;
        }
    }

    public static void A0B() {
        A00 = new byte[]{BuiltinOptions.UnsortedSegmentMinOptions, BuiltinOptions.DepthToSpaceOptions, BuiltinOptions.FloorModOptions, 13, BuiltinOptions.RightShiftOptions, BuiltinOptions.FloorModOptions, BuiltinOptions.NonMaxSuppressionV4Options, BuiltinOptions.FillOptions, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.FloorDivOptions, BuiltinOptions.FillOptions, BuiltinOptions.ReverseSequenceOptions, BuiltinOptions.FloorModOptions, BuiltinOptions.RangeOptions, BuiltinOptions.HashtableOptions, BuiltinOptions.SquareOptions, BuiltinOptions.NonMaxSuppressionV4Options, 64};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            i = ~(~((i * 31) + get(i2).hashCode()));
        }
        return i;
    }

    static {
        A0B();
        A02 = new C0W(C11421b.A02, 0);
    }

    public static <E> C11481h<E> A01() {
        return new C11481h<>();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Am != com.google.common.collect.ImmutableList<E> */
    private final AbstractC1372Am<E> A02(final int fromIndex, int toIndex) {
        final int i = toIndex - fromIndex;
        return new AbstractC1372Am<E>(fromIndex, i) { // from class: com.facebook.ads.redexgen.X.1g
            public final transient int A00;
            public final transient int A01;

            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.1g != com.google.common.collect.ImmutableList<E>$SubList */
            {
                this.A01 = fromIndex;
                this.A00 = i;
            }

            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.1g != com.google.common.collect.ImmutableList<E>$SubList */
            @Override // com.facebook.ads.redexgen.core.AbstractC2767ma
            public final int A0G() {
                return AbstractC1372Am.this.A0H() + this.A01 + this.A00;
            }

            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.1g != com.google.common.collect.ImmutableList<E>$SubList */
            @Override // com.facebook.ads.redexgen.core.AbstractC2767ma
            public final int A0H() {
                return AbstractC1372Am.this.A0H() + this.A01;
            }

            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.1g != com.google.common.collect.ImmutableList<E>$SubList */
            @Override // com.facebook.ads.redexgen.core.AbstractC2767ma
            public final boolean A0K() {
                return true;
            }

            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.1g != com.google.common.collect.ImmutableList<E>$SubList */
            @Override // com.facebook.ads.redexgen.core.AbstractC2767ma
            @CheckForNull
            public final Object[] A0L() {
                return AbstractC1372Am.this.A0L();
            }

            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.1g != com.google.common.collect.ImmutableList<E>$SubList */
            @Override // com.facebook.ads.redexgen.core.AbstractC1372Am, java.util.List
            /* renamed from: A0M */
            public final AbstractC1372Am<E> subList(int fromIndex2, int toIndex2) {
                AbstractC2570jA.A0B(fromIndex2, toIndex2, this.A00);
                return AbstractC1372Am.this.subList(this.A01 + fromIndex2, this.A01 + toIndex2);
            }

            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.1g != com.google.common.collect.ImmutableList<E>$SubList */
            @Override // java.util.List
            public final E get(int index) {
                AbstractC2570jA.A00(index, this.A00);
                return AbstractC1372Am.this.get(this.A01 + index);
            }

            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.1g != com.google.common.collect.ImmutableList<E>$SubList */
            @Override // com.facebook.ads.redexgen.core.AbstractC1372Am, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
            public final /* bridge */ /* synthetic */ Iterator iterator() {
                return iterator();
            }

            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.1g != com.google.common.collect.ImmutableList<E>$SubList */
            @Override // com.facebook.ads.redexgen.core.AbstractC1372Am, java.util.List
            public final /* bridge */ /* synthetic */ ListIterator listIterator() {
                return listIterator();
            }

            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.1g != com.google.common.collect.ImmutableList<E>$SubList */
            @Override // com.facebook.ads.redexgen.core.AbstractC1372Am, java.util.List
            public final /* bridge */ /* synthetic */ ListIterator listIterator(int index) {
                return super.listIterator(index);
            }

            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.1g != com.google.common.collect.ImmutableList<E>$SubList */
            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public final int size() {
                return this.A00;
            }
        };
    }

    public static <E> AbstractC1372Am<E> A03() {
        return (AbstractC1372Am<E>) C11421b.A02;
    }

    public static <E> AbstractC1372Am<E> A04(E element) {
        return A08(element);
    }

    public static <E> AbstractC1372Am<E> A06(Object[] elements) {
        return A09(elements, elements.length);
    }

    public static <E> AbstractC1372Am<E> A07(E[] elements) {
        if (elements.length == 0) {
            return A03();
        }
        return A08((Object[]) elements.clone());
    }

    public static <E> AbstractC1372Am<E> A08(Object... elements) {
        return A06(AbstractC2880oR.A03(elements));
    }

    public static <E> AbstractC1372Am<E> A09(Object[] elements, int length) {
        if (length == 0) {
            return A03();
        }
        return new C11421b(elements, length);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Am != com.google.common.collect.ImmutableList<E> */
    @Override // com.facebook.ads.redexgen.core.AbstractC2767ma
    public int A0I(Object[] dst, int offset) {
        int size = size();
        for (int i = 0; i < size; i++) {
            int i2 = offset + i;
            dst[i2] = get(i);
        }
        return offset + size;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Am != com.google.common.collect.ImmutableList<E> */
    @Override // com.facebook.ads.redexgen.core.AbstractC2767ma
    @Deprecated
    public final AbstractC1372Am<E> A0J() {
        return this;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Am != com.google.common.collect.ImmutableList<E> */
    @Override // java.util.List
    /* renamed from: A0M, reason: merged with bridge method [inline-methods] */
    public AbstractC1372Am<E> subList(int fromIndex, int toIndex) {
        AbstractC2570jA.A0B(fromIndex, toIndex, size());
        int i = toIndex - fromIndex;
        int length = size();
        if (i == length) {
            return this;
        }
        if (i == 0) {
            return A03();
        }
        return A02(fromIndex, toIndex);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Am != com.google.common.collect.ImmutableList<E> */
    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    /* renamed from: A0N, reason: merged with bridge method [inline-methods] */
    public final AbstractC2939pg<E> iterator() {
        return listIterator();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Am != com.google.common.collect.ImmutableList<E> */
    @Override // java.util.List
    /* renamed from: A0O, reason: merged with bridge method [inline-methods] */
    public final AF<E> listIterator() {
        return listIterator(0);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Am != com.google.common.collect.ImmutableList<E> */
    @Override // java.util.List
    /* renamed from: A0P, reason: merged with bridge method [inline-methods] */
    public AF<E> listIterator(int i) {
        AbstractC2570jA.A01(i, size());
        if (isEmpty()) {
            return (AF<E>) A02;
        }
        return new C0W(this, i);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Am != com.google.common.collect.ImmutableList<E> */
    @Override // java.util.List
    @Deprecated
    public final void add(int index, E element) {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Am != com.google.common.collect.ImmutableList<E> */
    @Override // java.util.List
    @Deprecated
    public final boolean addAll(int index, Collection<? extends E> newElements) {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Am != com.google.common.collect.ImmutableList<E> */
    @Override // com.facebook.ads.redexgen.core.AbstractC2767ma, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(@CheckForNull Object object) {
        return indexOf(object) >= 0;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Am != com.google.common.collect.ImmutableList<E> */
    @Override // java.util.Collection, java.util.List
    public final boolean equals(@CheckForNull Object obj) {
        return AbstractC2835ng.A06(this, obj);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Am != com.google.common.collect.ImmutableList<E> */
    @Override // java.util.List
    public int indexOf(@CheckForNull Object object) {
        if (object == null) {
            return -1;
        }
        return AbstractC2835ng.A00(this, object);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Am != com.google.common.collect.ImmutableList<E> */
    @Override // java.util.List
    public int lastIndexOf(@CheckForNull Object object) {
        if (object == null) {
            return -1;
        }
        return AbstractC2835ng.A01(this, object);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Am != com.google.common.collect.ImmutableList<E> */
    private void readObject(ObjectInputStream stream) throws InvalidObjectException {
        throw new InvalidObjectException(A0A(0, 18, 59));
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Am != com.google.common.collect.ImmutableList<E> */
    @Override // java.util.List
    @Deprecated
    public final E remove(int index) {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Am != com.google.common.collect.ImmutableList<E> */
    @Override // java.util.List
    @Deprecated
    public final E set(int index, E element) {
        throw new UnsupportedOperationException();
    }
}
