public class Welcome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String greeting = "welcome to Core Java!";
        System.out.println(greeting);
        for (int i=0; i < greeting.length();i++)
            System.out.print("=");
        System.out.println();
    }
    
}
