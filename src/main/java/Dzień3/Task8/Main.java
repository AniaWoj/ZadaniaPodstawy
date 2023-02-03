package Dzień3.Task8;

public class Main {
    public static void main(String[] args) {
        Poem[] poems = new Poem[3];
        poems[0] = new Poem(new Author("Brzechwa", "PL"),30);
        poems[1] = new Poem(new Author("Konopnicka", "PL"),31);
        poems[2] = new Poem(new Author("Tuwim", "PL"),34);

        int max = 0;
        String surname = "";
        String nationality = "";

        for ( Poem element : poems){
            if (element.getStropheNumbers() > max){
                max = element.getStropheNumbers();
                surname = element.getAuthor().getSurname();
                nationality = element.getAuthor().getNationality();
            }

        }
        System.out.println("surname: " + surname);
        System.out.println("nationality: " + nationality);
    }
}
