package classpersistence;

import java.util.Date;
import java.util.Objects;

public class Comment {
private int id;
private String content;
private Date creationDate ;
private boolean isEnabled;
private Client rClient;

    public Comment() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public boolean isEnabled() {
        return isEnabled;
    }

    public void setEnabled(boolean enabled) {
        isEnabled = enabled;
    }

    public Client getrClient() {
        return rClient;
    }

    public void setrClient(Client rClient) {
        this.rClient = rClient;
    }
    public void addClient(Client client){
        setrClient(client);
    }
    public void remove(Client client){
        setrClient(null);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Comment comment = (Comment) o;
        return id == comment.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
