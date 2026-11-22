package org.apache.commons.net.ftp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.apache.commons.net.util.Charsets;

/* loaded from: classes8.dex */
public class FTPListParseEngine {
    private static final FTPFile[] EMPTY_FTP_FILE_ARRAY = new FTPFile[0];
    private List<String> entries;
    private ListIterator<String> internalIterator;
    private final FTPFileEntryParser parser;
    private final boolean saveUnparseableEntries;

    public FTPListParseEngine(FTPFileEntryParser fTPFileEntryParser) {
        this(fTPFileEntryParser, null);
    }

    FTPListParseEngine(FTPFileEntryParser fTPFileEntryParser, FTPClientConfig fTPClientConfig) {
        LinkedList linkedList = new LinkedList();
        this.entries = linkedList;
        this.internalIterator = linkedList.listIterator();
        this.parser = fTPFileEntryParser;
        if (fTPClientConfig != null) {
            this.saveUnparseableEntries = fTPClientConfig.getUnparseableEntries();
        } else {
            this.saveUnparseableEntries = false;
        }
    }

    public List<FTPFile> getFileList(final FTPFileFilter fTPFileFilter) {
        Stream<R> map = this.entries.stream().map(new Function() { // from class: org.apache.commons.net.ftp.FTPListParseEngine$$ExternalSyntheticLambda0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return FTPListParseEngine.this.m16126xa450d0a6((String) obj);
            }
        });
        Objects.requireNonNull(fTPFileFilter);
        return (List) map.filter(new Predicate() { // from class: org.apache.commons.net.ftp.FTPListParseEngine$$ExternalSyntheticLambda1
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return FTPFileFilter.this.accept((FTPFile) obj);
            }
        }).collect(Collectors.toList());
    }

    /* renamed from: lambda$getFileList$0$org-apache-commons-net-ftp-FTPListParseEngine, reason: not valid java name */
    /* synthetic */ FTPFile m16126xa450d0a6(String str) {
        FTPFile parseFTPEntry = this.parser.parseFTPEntry(str);
        return (parseFTPEntry == null && this.saveUnparseableEntries) ? new FTPFile(str) : parseFTPEntry;
    }

    public FTPFile[] getFiles() throws IOException {
        return getFiles(FTPFileFilters.NON_NULL);
    }

    public FTPFile[] getFiles(FTPFileFilter fTPFileFilter) throws IOException {
        return (FTPFile[]) getFileList(fTPFileFilter).toArray(EMPTY_FTP_FILE_ARRAY);
    }

    public FTPFile[] getNext(int i) {
        LinkedList linkedList = new LinkedList();
        while (i > 0 && this.internalIterator.hasNext()) {
            String next = this.internalIterator.next();
            FTPFile parseFTPEntry = this.parser.parseFTPEntry(next);
            if (parseFTPEntry == null && this.saveUnparseableEntries) {
                parseFTPEntry = new FTPFile(next);
            }
            linkedList.add(parseFTPEntry);
            i--;
        }
        return (FTPFile[]) linkedList.toArray(EMPTY_FTP_FILE_ARRAY);
    }

    public FTPFile[] getPrevious(int i) {
        LinkedList linkedList = new LinkedList();
        while (i > 0 && this.internalIterator.hasPrevious()) {
            String previous = this.internalIterator.previous();
            FTPFile parseFTPEntry = this.parser.parseFTPEntry(previous);
            if (parseFTPEntry == null && this.saveUnparseableEntries) {
                parseFTPEntry = new FTPFile(previous);
            }
            linkedList.add(0, parseFTPEntry);
            i--;
        }
        return (FTPFile[]) linkedList.toArray(EMPTY_FTP_FILE_ARRAY);
    }

    public boolean hasNext() {
        return this.internalIterator.hasNext();
    }

    public boolean hasPrevious() {
        return this.internalIterator.hasPrevious();
    }

    private void read(InputStream inputStream, String str) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, Charsets.toCharset(str)));
        try {
            String readNextEntry = this.parser.readNextEntry(bufferedReader);
            while (readNextEntry != null) {
                this.entries.add(readNextEntry);
                readNextEntry = this.parser.readNextEntry(bufferedReader);
            }
            bufferedReader.close();
        } catch (Throwable th) {
            try {
                bufferedReader.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Deprecated
    public void readServerList(InputStream inputStream) throws IOException {
        readServerList(inputStream, null);
    }

    public void readServerList(InputStream inputStream, String str) throws IOException {
        this.entries = new LinkedList();
        read(inputStream, str);
        this.parser.preParse(this.entries);
        resetIterator();
    }

    public void resetIterator() {
        this.internalIterator = this.entries.listIterator();
    }
}
