class Publication {

    private String title;

    public Publication(String title) {
        this.title = title;
    }

    public String getDetails() {
        return "title=\"" + title + "\"";
    }

}

class Newspaper extends Publication {

    private String source;

    public Newspaper(String title, String source) {
        super(title);
        this.source = source;
    }

    // write your code here


    @Override
    public String getDetails() {
        return (super.getDetails() + ", source=\"" + source + "\"");
    }
}

class Article extends Publication {

    private String author;

    public Article(String title, String author) {
        super(title);
        this.author = author;
    }

    // write your code here


    @Override
    public String getDetails() {
        return (super.getDetails() + ", author=\"" + author + "\"");
    }
}

class Announcement extends Publication {

    private int daysToExpire;

    public Announcement(String title, int daysToExpire) {
        super(title);
        this.daysToExpire = daysToExpire;
    }

    // write your code here


    @Override
    public String getDetails() {
        return (super.getDetails() + ", daysToExpire=" + daysToExpire + "");
    }
}

class class1{
    public static void main(String[] args) {
        Publication publication = new Publication("The new era");
        System.out.println(publication.getDetails());

        Newspaper newspaper = new Newspaper("Football results", "Sport news");
        System.out.println(newspaper.getDetails());

        Article article = new Article("Why the Sun is hot", "Dr James Smith");
        System.out.println(article.getDetails());

        Announcement announcement = new Announcement("Will sell a house", 30);
        System.out.println(announcement.getDetails());
    }
}
