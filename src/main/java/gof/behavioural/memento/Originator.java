package gof.behavioural.memento;

public class Originator {

    private String article;

    public void setArticle(String article) {
        System.out.println("Originator: current version\n" + article + "\n");
        this.article = article;
    }

    public Memento saveArticle() {
        System.out.println("Originator: saving article");
        return new Memento(article);
    }

    public String getArticle(Memento memento) {
        article = memento.getArticle();
        System.out.println("Originator: article retreived\n" + article +"\n");
        return article;
    }
}
