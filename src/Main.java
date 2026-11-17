public class Main {
    public static void main(String[] args){
        System.out.println("Study Task Manager");

        Course mathe = new Course("Mathe");

        Task one = new Task("Aufgabe1", mathe, 20.12,3);

        System.out.println(mathe.getName());

        System.out.println(one.getTitle());

    }

}
