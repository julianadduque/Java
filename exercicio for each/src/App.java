public class App {
    
    public static void main (String[] args) {

        String[] Vect = new String[] {"Maria", "Bob", "Alex"};

        for (int i = 0; i < Vect.length; i+=1) {
            System.out.println(Vect[i]);
        }
        System.out.println("----------------------------");
        for(String obj : Vect) {
            System.out.println(obj);
        }
    }

}