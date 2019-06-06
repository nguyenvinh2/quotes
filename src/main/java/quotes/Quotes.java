package quotes;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

//use JSON to Java converter - http://www.jsonschema2pojo.org/
public class Quotes {

    @SerializedName("tags")
    @Expose
    private List<String> tags = null;
    @SerializedName("author")
    @Expose
    private String author;
    @SerializedName("likes")
    @Expose
    private String likes;
    @SerializedName("text")
    @Expose
    private String text;

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getLikes() {
        return likes;
    }

    public void setLikes(String likes) {
        this.likes = likes;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

}