package quotes;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

//use JSON to Java converter - http://www.jsonschema2pojo.org/
public class Quote {

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
    @SerializedName("quoteText")
    @Expose
    private String quoteText;
    @SerializedName("quoteAuthor")
    @Expose
    private String quoteAuthor;
    @SerializedName("senderName")
    @Expose
    private String senderName;
    @SerializedName("senderLink")
    @Expose
    private String senderLink;
    @SerializedName("quoteLink")
    @Expose
    private String quoteLink;

    public String getQuoteText() {
        return quoteText;
    }

    public void setQuoteText(String quoteText) { this.quoteText = quoteText; }

    public String getQuoteAuthor() { return quoteAuthor; }

    public void setQuoteAuthor(String quoteAuthor) { this.quoteAuthor = quoteAuthor; }

    public String getSenderName() { return senderName; }

    public void setSenderName(String senderName) { this.senderName = senderName; }

    public String getSenderLink() { return senderLink; }

    public void setSenderLink(String senderLink) { this.senderLink = senderLink; }

    public String getQuoteLink() { return quoteLink; }

    public void setQuoteLink(String quoteLink) { this.quoteLink = quoteLink; }

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

    public Quote() { }

    public Quote(String text, String author) {
        this.text = text;
        this.author = author;
    }
}