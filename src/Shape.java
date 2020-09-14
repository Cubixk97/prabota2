public class Shape {


private String shape;
private int argument;

public  Shape (String sh,int a) {
    shape = sh;
     argument = a;
}


    public double setArgument(int argument) {
        return argument;
    }


    public String setShape(String shape){
        return shape;}
    public void getArgument() {
        this.argument= argument;}
    public  void getShape (String shape) {
        this.shape=shape;

    }

    public String toString() {
        return this.shape + ", argument " + this.argument;
    }





    public void  Oso(){
        System.out.println(shape+" s = "+argument*argument*6+" v = "+argument*argument*argument);

}   }



