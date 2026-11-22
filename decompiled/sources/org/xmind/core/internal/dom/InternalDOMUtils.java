package org.xmind.core.internal.dom;

import android.gov.nist.core.Separators;
import kotlin.text.Typography;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xmind.core.Core;
import org.xmind.core.IAdaptable;
import org.xmind.core.event.ICoreEventSource;
import org.xmind.core.event.ICoreEventSupport;
import org.xmind.core.util.DOMUtils;

/* loaded from: classes7.dex */
public class InternalDOMUtils {
    public static void addVersion(Document document) {
        Element documentElement = document.getDocumentElement();
        if (documentElement == null || documentElement.hasAttribute("version")) {
            return;
        }
        DOMUtils.setAttribute(documentElement, "version", Core.getCurrentVersion());
    }

    public static void replaceVersion(Document document) {
        Element documentElement = document.getDocumentElement();
        if (documentElement != null) {
            DOMUtils.setAttribute(documentElement, "version", Core.getCurrentVersion());
        }
    }

    public static String getParentPath(String str) {
        int lastIndexOf;
        if (str.endsWith("/")) {
            lastIndexOf = str.lastIndexOf(47, str.length() - 2);
        } else {
            lastIndexOf = str.lastIndexOf(47);
        }
        if (lastIndexOf < 0) {
            return null;
        }
        return str.substring(0, lastIndexOf + 1);
    }

    public static String getLastName(String str) {
        String parentPath = getParentPath(str);
        return parentPath != null ? str.substring(parentPath.length()) : str;
    }

    public static boolean isParentPath(String str, String str2) {
        return str.startsWith(str2);
    }

    public static String trim(String str) {
        if (str == null) {
            return null;
        }
        return str.trim();
    }

    public static String trimElementContent(String str, String str2) {
        int indexOf = str.indexOf(Separators.LESS_THAN + str2 + " ");
        if (indexOf < 0) {
            indexOf = str.indexOf(Separators.LESS_THAN + str2 + Separators.GREATER_THAN);
        }
        if (indexOf >= 0) {
            int indexOf2 = str.indexOf(62, indexOf + 1);
            if (indexOf2 > 0) {
                for (int i = indexOf2 - 1; str.charAt(i) != '<'; i--) {
                    if (str.charAt(i) == '/') {
                        return null;
                    }
                }
            }
            indexOf = indexOf2 + 1;
        }
        int lastIndexOf = str.lastIndexOf("</" + str2 + Separators.GREATER_THAN);
        return (indexOf > 0 || (lastIndexOf >= 0 && lastIndexOf < str.length())) ? str.substring(indexOf, lastIndexOf) : str;
    }

    public static String makeElementText(String str, NS ns, String str2, NS... nsArr) {
        if (str2 == null || str.indexOf(Separators.LESS_THAN + str2) >= 0) {
            return str;
        }
        StringBuffer stringBuffer = new StringBuffer(str2.length() + (ns != null ? ns.getURI().length() : 0) + (nsArr.length * 20) + 2);
        stringBuffer.append(Typography.less);
        stringBuffer.append(str2);
        if (ns != null) {
            stringBuffer.append(" xmlns=\"");
            stringBuffer.append(ns.getURI());
            stringBuffer.append('\"');
        }
        for (NS ns2 : nsArr) {
            stringBuffer.append(" xmlns:");
            stringBuffer.append(ns2.getPrefix());
            stringBuffer.append("=\"");
            stringBuffer.append(ns2.getURI());
            stringBuffer.append('\"');
        }
        stringBuffer.append(Typography.greater);
        stringBuffer.append(str);
        stringBuffer.append("</");
        stringBuffer.append(str2);
        stringBuffer.append(Typography.greater);
        return stringBuffer.toString();
    }

    public static String toRangeValue(int i, int i2) {
        if (i < 0 && i2 < 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder(Separators.LPAREN);
        if (i >= 0) {
            sb.append(i);
        }
        sb.append(AbstractJsonLexerKt.COMMA);
        if (i2 >= 0) {
            sb.append(i2);
        }
        sb.append(')');
        return sb.toString();
    }

    public static int getStartIndex(String str) {
        int indexOf;
        int safeParseInt;
        if (str == null || !str.startsWith(Separators.LPAREN) || !str.endsWith(Separators.RPAREN) || (indexOf = str.indexOf(44)) <= 0 || (safeParseInt = NumberUtils.safeParseInt(str.substring(1, indexOf).trim(), -1)) < 0) {
            return -1;
        }
        return safeParseInt;
    }

    public static int getEndIndex(String str) {
        int lastIndexOf;
        int safeParseInt;
        if (str == null || !str.startsWith(Separators.LPAREN) || !str.endsWith(Separators.RPAREN) || (lastIndexOf = str.lastIndexOf(44)) <= 0 || (safeParseInt = NumberUtils.safeParseInt(str.substring(lastIndexOf + 1, str.length() - 1).trim(), -1)) < 0) {
            return -1;
        }
        return safeParseInt;
    }

    public static void updateModificationInfo(IAdaptable iAdaptable) {
        Element element = (Element) iAdaptable.getAdapter(Element.class);
        if (element == null) {
            return;
        }
        long modifiedTime = getModifiedTime(iAdaptable, element);
        long currentTimeMillis = System.currentTimeMillis();
        DOMUtils.setAttribute(element, "timestamp", Long.toString(currentTimeMillis));
        DOMUtils.setAttribute(element, DOMConstants.ATTR_MODIFYBY, null);
        DOMUtils.setAttribute(element, DOMConstants.ATTR_MODIFIED_BY, getDefaultModifierName());
        ICoreEventSupport iCoreEventSupport = (ICoreEventSupport) iAdaptable.getAdapter(ICoreEventSupport.class);
        if (iCoreEventSupport == null || !(iAdaptable instanceof ICoreEventSource)) {
            return;
        }
        iCoreEventSupport.dispatchValueChange((ICoreEventSource) iAdaptable, Core.ModifyTime, Long.valueOf(modifiedTime), Long.valueOf(currentTimeMillis));
    }

    public static long getModifiedTime(IAdaptable iAdaptable, Element element) {
        return NumberUtils.safeParseLong(DOMUtils.getAttribute(element, "timestamp"), 0L);
    }

    public static String getModifiedBy(IAdaptable iAdaptable, Element element) {
        String attribute = DOMUtils.getAttribute(element, DOMConstants.ATTR_MODIFIED_BY);
        return attribute != null ? attribute : DOMUtils.getAttribute(element, DOMConstants.ATTR_MODIFYBY);
    }

    public static String getDefaultModifierName() {
        String property = System.getProperty(DOMConstants.AUTHOR_NAME);
        return property != null ? property : System.getProperty("user.name");
    }
}
