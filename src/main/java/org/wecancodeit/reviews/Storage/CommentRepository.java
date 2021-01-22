package org.wecancodeit.reviews.Storage;

import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.reviews.Models.Comment;

public interface CommentRepository extends CrudRepository<Comment,Long> {
}
