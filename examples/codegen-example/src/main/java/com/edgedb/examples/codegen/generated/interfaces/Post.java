package com.edgedb.generated.interfaces;

import com.edgedb.driver.datatypes.NullableOptional;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Optional;
import java.util.UUID;
import org.jetbrains.annotations.Nullable;

/**
 * Represents the schema type {@code codegen::Post} with properties that are shared
 *  across the following types:
 * {@linkplain com.edgedb.generated.results.CreatePostPost}
 * {@linkplain com.edgedb.generated.results.GetUserCommentsPost}
 * {@linkplain com.edgedb.generated.results.GetUserLikedPostsPost}
 * {@linkplain com.edgedb.generated.results.GetUserPostsPost}
 */
public interface Post {
  /**
   * Gets the {@code author} property, available on {@linkplain com.edgedb.generated.results.GetUserCommentsPost}, {@linkplain com.edgedb.generated.results.GetUserLikedPostsPost}, {@linkplain com.edgedb.generated.results.GetUserPostsPost}
   */
  Optional<User> getAuthor();

  /**
   * Gets the {@code title} property, available on {@linkplain com.edgedb.generated.results.GetUserCommentsPost}, {@linkplain com.edgedb.generated.results.GetUserLikedPostsPost}, {@linkplain com.edgedb.generated.results.GetUserPostsPost}
   */
  Optional<String> getTitle();

  /**
   * Gets the {@code content} property, available on {@linkplain com.edgedb.generated.results.GetUserCommentsPost}, {@linkplain com.edgedb.generated.results.GetUserLikedPostsPost}, {@linkplain com.edgedb.generated.results.GetUserPostsPost}
   */
  Optional<String> getContent();

  /**
   * Gets the {@code id} property, available on all descendants of this interface.
   */
  UUID getId();

  /**
   * Gets the {@code created_at} property, available on {@linkplain com.edgedb.generated.results.GetUserCommentsPost}, {@linkplain com.edgedb.generated.results.GetUserLikedPostsPost}, {@linkplain com.edgedb.generated.results.GetUserPostsPost}
   */
  NullableOptional<@Nullable OffsetDateTime> getCreatedAt();
}
