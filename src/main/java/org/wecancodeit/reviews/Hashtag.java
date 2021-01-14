package org.wecancodeit.reviews;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Collection;
@Entity
public class Hashtag {

        @Id
        @GeneratedValue
        private long id;
        private String name;
        @OneToMany(mappedBy = "type")
        private Collection<ReviewCakeItem> items;


        public Hashtag(String name) { this.name = name; }

        public Hashtag() {

        }

        public long getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public Collection<ReviewCakeItem> getItems() {
            return items;
        }

    @Override
    public String toString() {
        return "Hashtag{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Hashtag hashtag = (Hashtag) o;

        if (id != hashtag.id) return false;
        return name != null ? name.equals(hashtag.name) : hashtag.name == null;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}
