package io.github.travelervihaan.posts;

import io.github.travelervihaan.users.User;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.time.LocalDateTime;
import java.util.Objects;

@Document
public class Post {

    @MongoId
    private String id;

    private String title;
    private String text;

    private LocalDateTime dateAdded;
    private User author;

    public Post(){}

    public Post(String id, String title, String text, LocalDateTime dateAdded, User author) {
        this.id = id;
        this.title = title;
        this.text = text;
        this.dateAdded = dateAdded;
        this.author = author;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public LocalDateTime getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(LocalDateTime dateAdded) {
        this.dateAdded = dateAdded;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Post post = (Post) o;
        return Objects.equals(title, post.title) &&
                Objects.equals(text, post.text) &&
                Objects.equals(dateAdded, post.dateAdded);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, text, dateAdded);
    }

    @Override
    public String toString() {
        return "Post{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", text='" + text + '\'' +
                ", dateAdded=" + dateAdded +
                ", author=" + author.getVisibleUsername() +
                '}';
    }
}
