package com.edgedb.examples.codegen.generated.results;

import com.edgedb.driver.annotations.EdgeDBDeserializer;
import com.edgedb.driver.annotations.EdgeDBName;
import com.edgedb.driver.annotations.EdgeDBType;
import java.util.UUID;

@EdgeDBType
public final class CreateCommentResult {
  @EdgeDBName("id")
  private final UUID id;

  @EdgeDBDeserializer
  public CreateCommentResult(@EdgeDBName("id") UUID id) {
    this.id = id;
  }

  public UUID getId() {
    return this.id;
  }
}
