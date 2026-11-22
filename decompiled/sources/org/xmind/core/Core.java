package org.xmind.core;

import java.util.Comparator;
import org.xmind.core.comment.ICommentManagerBuilder;
import org.xmind.core.internal.InternalCore;
import org.xmind.core.marker.IMarkerSheetBuilder;
import org.xmind.core.style.IStyleSheetBuilder;
import org.xmind.core.util.ILogger;

/* loaded from: classes7.dex */
public class Core {
    public static final String BoundaryAdd = "boundaryAdd";
    public static final String BoundaryRemove = "boundaryRemove";
    public static final int ERROR_CANCELLATION = 100;
    public static final int ERROR_FAIL_ACCESS_XML_PARSER = 12;
    public static final int ERROR_FAIL_ACCESS_XML_TRANSFORMER = 15;
    public static final int ERROR_FAIL_INIT_CRYPTOGRAM = 16;
    public static final int ERROR_FAIL_PARSING_XML = 13;
    public static final int ERROR_INVALID_ARGUMENT = 3;
    public static final int ERROR_INVALID_FILE = 10;
    public static final int ERROR_NO_SUCH_ENTRY = 11;
    public static final int ERROR_NO_WORKBOOK_CONTENT = 14;
    public static final int ERROR_NULL_ARGUMENT = 2;
    public static final int ERROR_UNKNOWN = 1;
    public static final int ERROR_WRONG_PASSWORD = 17;
    public static final String EndIndex = "endIndex";
    public static final String FileEntryAdd = "fileEntryAdd";
    public static final String FileEntryRemove = "fileEntryRemove";
    public static final String ImageAlignment = "imageAlignment";
    public static final String ImageHeight = "imageHeight";
    public static final String ImageSource = "imageSource";
    public static final String ImageWidth = "imageWidth";
    public static final String Labels = "labels";
    public static final String MEDIA_TYPE_IMAGE_PNG = "image/png";
    public static final String MEDIA_TYPE_TEXT_XML = "text/xml";
    public static final String MarkerAdd = "markerAdd";
    public static final String MarkerDescription = "markerDescription";
    public static final String MarkerGroupAdd = "markerGroupAdd";
    public static final String MarkerGroupRemove = "markerGroupRemove";
    public static final String MarkerRefAdd = "markerRefAdd";
    public static final String MarkerRefRemove = "markerRefRemove";
    public static final String MarkerRemove = "markerRemove";
    public static final String Metadata = "metadata";
    public static final String MetadataAttribute = "metadataAttribute";
    public static final String ModifyTime = "modifyTime";
    public static final String Name = "name";
    public static final String NumberFormat = "numberingFormat";
    public static final String NumberPrepending = "parentNumberingPrepending";
    public static final String NumberingPrefix = "numberingPrefix";
    public static final String NumberingSeparator = "numberingSeparator";
    public static final String NumberingSuffix = "numberingSuffix";
    public static final String PasswordChange = "passwordChange";
    public static final String Position = "position";
    public static final String Property = "property";
    public static final String Range = "range";
    public static final String RelationshipAdd = "relationshipAdd";
    public static final String RelationshipEnd1 = "relationshipEnd1";
    public static final String RelationshipEnd2 = "relationshipEnd2";
    public static final String RelationshipRemove = "relationshipRemove";
    public static final String ResourceRefs = "resourceRefs";
    public static final String RevisionAdd = "revisionAdd";
    public static final String RevisionRemove = "revisionRemove";
    public static final String RootTopic = "rootTopic";
    public static final String SheetAdd = "sheetAdd";
    public static final String SheetMove = "sheetMove";
    public static final String SheetRemove = "sheetRemove";
    public static final String StartIndex = "startIndex";
    public static final String StructureClass = "structureClass";
    public static final String Style = "style";
    public static final String StyleAdd = "styleAdd";
    public static final String StyleRemove = "styleRemove";
    public static final String SummaryAdd = "summaryAdd";
    public static final String SummaryRemove = "summaryRemove";
    public static final String ThemeId = "themeId";
    public static final String TitleText = "titleText";
    public static final String TitleWidth = "titleWidth";
    public static final String TopicAdd = "topicAdd";
    public static final String TopicComments = "topicComments";
    public static final String TopicFolded = "topicFolded";
    public static final String TopicHyperlink = "topicHyperlink";
    public static final String TopicNotes = "topicNotes";
    public static final String TopicRefId = "topicRefId";
    public static final String TopicRemove = "topicRemove";
    public static final String Visibility = "visibility";
    public static final String WorkbookPreSave = "workbookPreSave";
    public static final String WorkbookPreSaveOnce = "workbookPreSaveOnce";
    public static final String WorkbookSave = "workbookSave";

    private Core() {
    }

    public static IIdFactory getIdFactory() {
        return getInternal().getIdFactory();
    }

    public static IWorkbookBuilder getWorkbookBuilder() {
        return getInternal().getWorkbookBuilder();
    }

    public static IWorkspace getWorkspace() {
        return getInternal().getWorkspace();
    }

    public static IMarkerSheetBuilder getMarkerSheetBuilder() {
        return getInternal().getMarkerSheetBuilder();
    }

    public static Comparator<ITopic> getTopicComparator() {
        return getInternal().getTopicComparator();
    }

    public static IStyleSheetBuilder getStyleSheetBuilder() {
        return getInternal().getStyleSheetBuilder();
    }

    public static ICommentManagerBuilder getCommentManagerBuilder() {
        return getInternal().getCommentManagerBuilder();
    }

    public static final String getCurrentVersion() {
        return getInternal().getCurrentVersion();
    }

    public static final ILogger getLogger() {
        return getInternal().getLogger();
    }

    private static InternalCore getInternal() {
        return InternalCore.getInstance();
    }
}
