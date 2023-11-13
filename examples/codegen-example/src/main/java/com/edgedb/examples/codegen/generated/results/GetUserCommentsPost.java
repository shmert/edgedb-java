package com.edgedb.generated.results;

import com.edgedb.driver.annotations.EdgeDBDeserializer;
import com.edgedb.driver.annotations.EdgeDBName;
import com.edgedb.driver.annotations.EdgeDBType;
import com.edgedb.driver.datatypes.NullableOptional;
import com.edgedb.generated.interfaces.Post;
import com.edgedb.generated.interfaces.User;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Optional;
import java.util.UUID;
import org.jetbrains.annotations.Nullable;

@EdgeDBType
public final class GetUserCommentsPost implements Post {
  /**
   * The {@code author} field on the {@code codegen::Post} object
   */
  @EdgeDBName("author")
  public final GetUserCommentsUser author;

  /**
   * The {@code title} field on the {@code codegen::Post} object
   */
  @EdgeDBName("title")
  public final String title;

  /**
   * The {@code id} field on the {@code codegen::Post} object
   */
  @EdgeDBName("id")
  public final UUID id;

  /**
   * The {@code content} field on the {@code codegen::Post} object
   */
  @EdgeDBName("content")
  public final String content;

  /**
   * The {@code created_at} field on the {@code codegen::Post} object
   */
  @EdgeDBName("created_at")
  public final @Nullable OffsetDateTime createdAt;

  @EdgeDBDeserializer
  public GetUserCommentsPost(@EdgeDBName("author") GetUserCommentsUser author,
      @EdgeDBName("title") String title, @EdgeDBName("id") UUID id,
      @EdgeDBName("content") String content,
      @EdgeDBName("createdAt") @Nullable OffsetDateTime createdAt) {
    this.author = author;
    this.title = title;
    this.id = id;
    this.content = content;
    this.createdAt = createdAt;
  }

  /**
   * Returns an optional wrapping the {@code author} field, which is always present on this type.
   */
  @Override
  public Optional<User> getAuthor() {
    return Optional.of(this.author);
  }

  /**
   * Returns an optional wrapping the {@code title} field, which is always present on this type.
   */
  @Override
  public Optional<String> getTitle() {
    return Optional.of(this.title);
  }

  /**
   * Returns an optional wrapping the {@code content} field, which is always present on this type.
   */
  @Override
  public Optional<String> getContent() {
    return Optional.of(this.content);
  }

  /**
   * Returns the {@code id} field of this class
   */
  @Override
  public UUID getId() {
    return this.id;
  }

  /**
   * Returns an optional wrapping the {@code createdAt} field, which is always present on this type.
   */
  @Override
  public NullableOptional<@Nullable OffsetDateTime> getCreatedAt() {
    return NullableOptional.of(this.createdAt);
  }
}
