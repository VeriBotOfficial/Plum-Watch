package org.apache.commons.net.ftp.parser;

import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import org.apache.commons.net.ftp.FTPFileEntryParserImpl;

/* loaded from: classes8.dex */
public abstract class RegexFTPFileEntryParserImpl extends FTPFileEntryParserImpl {
    protected Matcher _matcher_;
    private Pattern pattern;
    private MatchResult result;

    public RegexFTPFileEntryParserImpl(String str) {
        compileRegex(str, 0);
    }

    public RegexFTPFileEntryParserImpl(String str, int i) {
        compileRegex(str, i);
    }

    private void compileRegex(String str, int i) {
        try {
            this.pattern = Pattern.compile(str, i);
        } catch (PatternSyntaxException unused) {
            throw new IllegalArgumentException("Unparseable regex supplied: " + str);
        }
    }

    public int getGroupCnt() {
        MatchResult matchResult = this.result;
        if (matchResult == null) {
            return 0;
        }
        return matchResult.groupCount();
    }

    public String getGroupsAsString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= this.result.groupCount(); i++) {
            sb.append(i).append(") ").append(this.result.group(i)).append(System.lineSeparator());
        }
        return sb.toString();
    }

    public String group(int i) {
        MatchResult matchResult = this.result;
        if (matchResult == null) {
            return null;
        }
        return matchResult.group(i);
    }

    public boolean matches(String str) {
        this.result = null;
        Matcher matcher = this.pattern.matcher(str);
        this._matcher_ = matcher;
        if (matcher.matches()) {
            this.result = this._matcher_.toMatchResult();
        }
        return this.result != null;
    }

    public boolean setRegex(String str) {
        compileRegex(str, 0);
        return true;
    }

    public boolean setRegex(String str, int i) {
        compileRegex(str, i);
        return true;
    }
}
