package org.xmind.core.util;

import java.io.IOException;
import org.w3c.dom.Document;
import org.xmind.core.CoreException;
import org.xmind.core.io.IInputSource;

/* loaded from: classes7.dex */
public interface IXMLLoader {
    Document createDocument();

    Document loadXMLFile(IInputSource iInputSource, String str) throws IOException, CoreException;
}
