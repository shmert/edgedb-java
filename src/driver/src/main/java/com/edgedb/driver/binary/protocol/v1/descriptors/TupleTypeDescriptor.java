package com.edgedb.driver.binary.protocol.v1.descriptors;

import com.edgedb.driver.binary.PacketReader;
import com.edgedb.driver.binary.protocol.TypeDescriptor;
import org.jetbrains.annotations.NotNull;
import org.joou.UShort;

import java.util.UUID;

public final class TupleTypeDescriptor implements TypeDescriptor {

    public final UShort @NotNull [] elementTypeDescriptorPositions;

    private final UUID id;

    public TupleTypeDescriptor(final UUID id, final @NotNull PacketReader reader) {
        this.id = id;
        this.elementTypeDescriptorPositions = reader.readArrayOf(UShort.class, PacketReader::readUInt16, UShort.class);
    }

    @Override
    public UUID getId() {
        return this.id;
    }
}
