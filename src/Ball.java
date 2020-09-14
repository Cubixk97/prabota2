public class Ball {
    private String type;
    private String color;

    public Ball(String t , String c) {
        type = t;
        color = c;
    }

    public Ball(String t) {
        type = t;
        color = "red";
    }

    public Ball() {
        type = "Ball";
        color = "red";
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType(String type) {
        return type;
    }

    public String getColor() {
        return color;
    }

    public String toString() {
        return "Type " + this.type + ", color " + this.color;
    }
}