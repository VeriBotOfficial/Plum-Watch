package org.xmind.core;

import java.util.List;

/* loaded from: classes7.dex */
public interface IHtmlNotesContent extends INotesContent {
    void addParagraph(IParagraph iParagraph);

    IHyperlinkSpan createHyperlinkSpan(String str);

    IImageSpan createImageSpan(String str);

    IParagraph createParagraph();

    ITextSpan createTextSpan(String str);

    List<IParagraph> getParagraphs();

    void removeParagraph(IParagraph iParagraph);
}
