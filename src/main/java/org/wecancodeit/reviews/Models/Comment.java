package org.wecancodeit.reviews.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.Collection;
import java.util.List;

@Entity
public class Comment {
    public String comment;

    @Id
    @GeneratedValue
    public Long id;

    @ManyToMany
    private Collection<ReviewCakeItem> reviewComments;

    public Comment(String comment, ReviewCakeItem...reviewComments) {
        this.comment = comment;
        this.reviewComments = List.of(reviewComments);
    }

    public Comment() {
    }
}
