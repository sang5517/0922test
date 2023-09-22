public class Article {


    private int id;

    private String content;

    private String title;

    public Article(int id, String title, String content) {
        this.title = title;
        this.content = content;
        this.id = id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setTitle(String title) {
        this.content = content;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }


}