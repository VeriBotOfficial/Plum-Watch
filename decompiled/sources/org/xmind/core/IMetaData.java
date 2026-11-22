package org.xmind.core;

/* loaded from: classes7.dex */
public interface IMetaData extends IAdaptable {
    void addMetaData(IMetaData iMetaData);

    String getAttribute(String str);

    String getKey();

    IMetaData[] getMetaData(String str);

    IMeta getOwnedMeta();

    String getValue();

    void removeMetaData(IMetaData iMetaData);

    void setAttribute(String str, String str2);

    void setValue(String str);
}
