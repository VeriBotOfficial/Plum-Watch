package org.xmind.core;

/* loaded from: classes7.dex */
public interface IMeta extends IAdaptable, IWorkbookComponent {
    public static final String AUTHOR = "Author";
    public static final String AUTHOR_EMAIL = "Author/Email";
    public static final String AUTHOR_NAME = "Author/Name";
    public static final String AUTHOR_ORG = "Author/Org";
    public static final String BACKGROUND_COLOR = "Thumbnail/BackgroundColor";
    public static final String CONFIGURATIONS = "Configurations";
    public static final String CONFIG_AUTO_REVISION_GENERATION = "Configurations/AutoRevisionGeneration";
    public static final String CREATE = "Create";
    public static final String CREATED_TIME = "Create/Time";
    public static final String CREATOR = "Creator";
    public static final String CREATOR_NAME = "Creator/Name";
    public static final String CREATOR_VERSION = "Creator/Version";
    public static final String DESCRIPTION = "Description";
    public static final String ORIGIN_X = "Thumbnail/Origin/X";
    public static final String ORIGIN_Y = "Thumbnail/Origin/Y";
    public static final String SEP = "/";
    public static final String THUMBNAIL = "Thumbnail";
    public static final String V_NO = "No";
    public static final String V_YES = "Yes";

    void addMetaData(IMetaData iMetaData);

    IMetaData createMetaData(String str);

    IMetaData[] getMetaData(String str);

    String getValue(String str);

    void removeMetaData(IMetaData iMetaData);

    void setValue(String str, String str2);
}
