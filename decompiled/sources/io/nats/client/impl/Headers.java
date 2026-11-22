package io.nats.client.impl;

import android.gov.nist.core.Separators;
import io.nats.client.support.ByteArrayBuilder;
import io.nats.client.support.NatsConstants;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.IntConsumer;

/* loaded from: classes6.dex */
public class Headers {
    private static final int HVCRLF_BYTES;
    private static final String KEY_CANNOT_BE_EMPTY_OR_NULL = "Header key cannot be null.";
    private static final String KEY_INVALID_CHARACTER = "Header key has invalid character: ";
    private static final int NON_DATA_BYTES;
    private static final String VALUE_INVALID_CHARACTERS = "Header value has invalid character: ";
    private int dataLength;
    private final Map<String, Integer> lengthMap;
    private byte[] serialized;
    private final Map<String, List<String>> valuesMap;

    public Headers() {
        this.valuesMap = new HashMap();
        this.lengthMap = new HashMap();
    }

    public Headers(Headers headers) {
        this();
        if (headers != null) {
            this.valuesMap.putAll(headers.valuesMap);
            this.lengthMap.putAll(headers.lengthMap);
            this.dataLength = headers.dataLength;
            this.serialized = null;
        }
    }

    public Headers add(String str, String... strArr) {
        if (strArr != null) {
            _add(str, Arrays.asList(strArr));
        }
        return this;
    }

    public Headers add(String str, Collection<String> collection) {
        _add(str, collection);
        return this;
    }

    private void _add(String str, Collection<String> collection) {
        if (collection != null) {
            Checker checker = new Checker(str, collection);
            if (checker.hasValues()) {
                this.valuesMap.computeIfAbsent(str, new Function() { // from class: io.nats.client.impl.Headers$$ExternalSyntheticLambda1
                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return Headers.lambda$_add$0((String) obj);
                    }
                }).addAll(checker.list);
                this.dataLength += checker.len;
                this.lengthMap.put(str, Integer.valueOf(this.lengthMap.getOrDefault(str, 0).intValue() + checker.len));
                this.serialized = null;
            }
        }
    }

    static /* synthetic */ List lambda$_add$0(String str) {
        return new ArrayList();
    }

    public Headers put(String str, String... strArr) {
        if (strArr != null) {
            _put(str, Arrays.asList(strArr));
        }
        return this;
    }

    public Headers put(String str, Collection<String> collection) {
        _put(str, collection);
        return this;
    }

    public Headers put(Map<String, List<String>> map) {
        for (String str : map.keySet()) {
            put(str, map.get(str));
        }
        return this;
    }

    private void _put(String str, Collection<String> collection) {
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException("Key cannot be null or empty.");
        }
        if (collection != null) {
            Checker checker = new Checker(str, collection);
            if (checker.hasValues()) {
                this.dataLength = (this.dataLength - this.lengthMap.getOrDefault(str, 0).intValue()) + checker.len;
                this.valuesMap.put(str, checker.list);
                this.lengthMap.put(str, Integer.valueOf(checker.len));
                this.serialized = null;
            }
        }
    }

    public void remove(String... strArr) {
        for (String str : strArr) {
            _remove(str);
        }
        this.serialized = null;
    }

    public void remove(Collection<String> collection) {
        Iterator<String> it = collection.iterator();
        while (it.hasNext()) {
            _remove(it.next());
        }
        this.serialized = null;
    }

    private void _remove(String str) {
        if (this.valuesMap.remove(str) != null) {
            this.dataLength -= this.lengthMap.remove(str).intValue();
        }
    }

    public int size() {
        return this.valuesMap.size();
    }

    public boolean isEmpty() {
        return this.valuesMap.isEmpty();
    }

    public void clear() {
        this.valuesMap.clear();
        this.lengthMap.clear();
        this.dataLength = 0;
        this.serialized = null;
    }

    public boolean containsKey(String str) {
        return this.valuesMap.containsKey(str);
    }

    public boolean containsKeyIgnoreCase(String str) {
        Iterator<String> it = this.valuesMap.keySet().iterator();
        while (it.hasNext()) {
            if (it.next().equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }

    public Set<String> keySet() {
        return Collections.unmodifiableSet(this.valuesMap.keySet());
    }

    public Set<String> keySetIgnoreCase() {
        HashSet hashSet = new HashSet();
        Iterator<String> it = this.valuesMap.keySet().iterator();
        while (it.hasNext()) {
            hashSet.add(it.next().toLowerCase());
        }
        return Collections.unmodifiableSet(hashSet);
    }

    public List<String> get(String str) {
        List<String> list = this.valuesMap.get(str);
        if (list == null) {
            return null;
        }
        return Collections.unmodifiableList(list);
    }

    public String getFirst(String str) {
        List<String> list = this.valuesMap.get(str);
        if (list == null) {
            return null;
        }
        return list.get(0);
    }

    public List<String> getIgnoreCase(String str) {
        ArrayList arrayList = new ArrayList();
        for (String str2 : this.valuesMap.keySet()) {
            if (str2.equalsIgnoreCase(str)) {
                arrayList.addAll(this.valuesMap.get(str2));
            }
        }
        if (arrayList.size() == 0) {
            return null;
        }
        return Collections.unmodifiableList(arrayList);
    }

    public void forEach(BiConsumer<String, List<String>> biConsumer) {
        Collections.unmodifiableMap(this.valuesMap).forEach(biConsumer);
    }

    public Set<Map.Entry<String, List<String>>> entrySet() {
        return Collections.unmodifiableSet(this.valuesMap.entrySet());
    }

    public boolean isDirty() {
        return this.serialized == null;
    }

    public int serializedLength() {
        return this.dataLength + NON_DATA_BYTES;
    }

    static {
        int length = NatsConstants.HEADER_VERSION_BYTES_PLUS_CRLF.length;
        HVCRLF_BYTES = length;
        NON_DATA_BYTES = length + 2;
    }

    public byte[] getSerialized() {
        if (this.serialized == null) {
            byte[] bArr = new byte[serializedLength()];
            this.serialized = bArr;
            serializeToArray(0, bArr);
        }
        return this.serialized;
    }

    @Deprecated
    public ByteArrayBuilder appendSerialized(ByteArrayBuilder byteArrayBuilder) {
        byteArrayBuilder.append(NatsConstants.HEADER_VERSION_BYTES_PLUS_CRLF);
        for (String str : this.valuesMap.keySet()) {
            for (String str2 : this.valuesMap.get(str)) {
                byteArrayBuilder.append(str);
                byteArrayBuilder.append(NatsConstants.COLON_BYTES);
                byteArrayBuilder.append(str2);
                byteArrayBuilder.append(NatsConstants.CRLF_BYTES);
            }
        }
        byteArrayBuilder.append(NatsConstants.CRLF_BYTES);
        return byteArrayBuilder;
    }

    public int serializeToArray(int i, byte[] bArr) {
        byte[] bArr2 = NatsConstants.HEADER_VERSION_BYTES_PLUS_CRLF;
        int i2 = HVCRLF_BYTES;
        System.arraycopy(bArr2, 0, bArr, i, i2);
        int i3 = i + i2;
        for (Map.Entry<String, List<String>> entry : this.valuesMap.entrySet()) {
            for (String str : entry.getValue()) {
                byte[] bytes = entry.getKey().getBytes(StandardCharsets.US_ASCII);
                System.arraycopy(bytes, 0, bArr, i3, bytes.length);
                int length = i3 + bytes.length;
                int i4 = length + 1;
                bArr[length] = 58;
                byte[] bytes2 = str.getBytes(StandardCharsets.US_ASCII);
                System.arraycopy(bytes2, 0, bArr, i4, bytes2.length);
                int length2 = i4 + bytes2.length;
                bArr[length2] = 13;
                bArr[length2 + 1] = 10;
                i3 = length2 + 2;
            }
        }
        bArr[i3] = 13;
        bArr[i3 + 1] = 10;
        return serializedLength();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkKey(String str) {
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException(KEY_CANNOT_BE_EMPTY_OR_NULL);
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt < '!' || charAt > '~' || charAt == ':') {
                throw new IllegalArgumentException("Header key has invalid character: '" + charAt + Separators.QUOTE);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkValue(String str) {
        str.chars().forEach(new IntConsumer() { // from class: io.nats.client.impl.Headers$$ExternalSyntheticLambda0
            @Override // java.util.function.IntConsumer
            public final void accept(int i) {
                Headers.lambda$checkValue$1(i);
            }
        });
    }

    static /* synthetic */ void lambda$checkValue$1(int i) {
        if ((i < 32 && i != 9) || i > 126) {
            throw new IllegalArgumentException(VALUE_INVALID_CHARACTERS + i);
        }
    }

    private class Checker {
        List<String> list = new ArrayList();
        int len = 0;

        Checker(String str, Collection<String> collection) {
            Headers.this.checkKey(str);
            if (collection.isEmpty()) {
                return;
            }
            for (String str2 : collection) {
                if (str2 != null) {
                    if (!str2.isEmpty()) {
                        Headers.this.checkValue(str2);
                        this.list.add(str2);
                        this.len += str.length() + str2.length() + 3;
                    } else {
                        this.list.add(str2);
                        this.len += str.length() + 3;
                    }
                }
            }
        }

        boolean hasValues() {
            return this.list.size() > 0;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.valuesMap, ((Headers) obj).valuesMap);
    }

    public int hashCode() {
        return Objects.hash(this.valuesMap);
    }
}
