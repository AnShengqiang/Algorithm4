import edu.princeton.cs.algs4.StdOut;

public class Test {
   public static void main(String[] args){
        Test test = new Test();
        Sheep sheep = test.new Sheep();
        sheep.cry();
    }

    class Sheep {
        public void cry(){
            StdOut.println("mie~");
        }
    }
}