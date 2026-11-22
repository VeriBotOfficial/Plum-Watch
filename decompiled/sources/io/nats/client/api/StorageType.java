package io.nats.client.api;

import io.nats.client.support.ApiConstants;

/* loaded from: classes6.dex */
public enum StorageType {
    File("file"),
    Memory(ApiConstants.MEMORY);

    private final String policy;

    StorageType(String str) {
        this.policy = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.policy;
    }

    public static StorageType get(String str) {
        StorageType storageType = File;
        if (storageType.policy.equalsIgnoreCase(str)) {
            return storageType;
        }
        StorageType storageType2 = Memory;
        if (storageType2.policy.equalsIgnoreCase(str)) {
            return storageType2;
        }
        return null;
    }
}
