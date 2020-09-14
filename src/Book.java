
public class Book {
    private String name;
    private int page;

    public Book(String n, int p) {
        name = n;
        page = p;
    }

    public Book(String n) {
        name = n;
        page = 0;
    }

    public Book() {
        name = "Book";
        page = 0;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName(String name) {
        return name;
    }

    public int getPage() {
        return page;
    }

    public String toString() {
        return this.name + ", page " + this.page;
    }

    public void avrreedingSpeedPage() {
        System.out.println(name + " avarage reeding speed of one page " + page * 0.01 + " page in minute");
    }
}
