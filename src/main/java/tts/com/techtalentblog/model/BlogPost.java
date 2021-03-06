package tts.com.techtalentblog.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//the entity is going to align to data in our database
//the entire class can be thought of as a table in our database
@Entity
public class BlogPost {

    //@Id is used to identify primary keys on entities
    //@GeneratedValue is used for auto-generation of said keys
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private String author;
    private String blogEntry;

    public BlogPost (String title, String author, String blogEntry) {
        this.title = title;
        this.author = author;
        this.blogEntry = blogEntry;
    }

    //default constructor needed for a bean and to utilize
    //the @Entity annotation
    public BlogPost(){

    }

    public Long getId() {
        return  id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getBlogEntry() {
        return blogEntry;
    }

    public void setBlogEntry(String blogEntry) {
        this.blogEntry = blogEntry;
    }

    @Override
    public String toString() {
        return "BlogPost{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", blogEntry='" + blogEntry + '\'' +
                '}';
    }

    //additionally should override .hashcode() and .equals()
    //override hashcode
    //override equals
}
