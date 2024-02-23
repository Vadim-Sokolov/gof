package gof.behavioural.memento;

public class Memento {

    private final String article;

    public Memento(String article) {
        this.article = article;
    }

    public String getArticle() {
        return article;
    }
}
