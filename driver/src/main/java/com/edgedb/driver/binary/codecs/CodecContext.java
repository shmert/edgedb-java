package com.edgedb.driver.binary.codecs;

import com.edgedb.driver.binary.codecs.visitors.TypeVisitor;
import com.edgedb.driver.clients.EdgeDBBinaryClient;

public final class CodecContext {
    public final EdgeDBBinaryClient client;

    public CodecContext(EdgeDBBinaryClient client) {
        this.client = client;
    }

    public TypeVisitor getTypeVisitor() {
        return new TypeVisitor(this.client);
    }
}
