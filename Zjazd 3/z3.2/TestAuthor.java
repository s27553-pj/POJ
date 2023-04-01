class Author{
    private String name;
    private String surname;
    private int age;
    public Author(String name,String surname, int age){
        this.name =name;
        this.surname =surname;
        this.age =age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String toString()
    {
        return "Author name: " + getName() + " surname: "+ getSurname() + " wiek: " + getAge();
    }
}

public class TestAuthor {
    public static void main(String[] args) {
        Author pierwszy = new Author("Boleslaw", "Prus", 55);
        Author drugi = new Author("Boleslaw", "Lesmian", 55);
        Author trzeci = new Author("Eliza", "Orzeszkowa", 34);


        System.out.println(pierwszy.toString());
        System.out.println(drugi.toString());
        System.out.println(trzeci.toString());
        trzeci.setSurname("Majewska");
        System.out.println("Po zmianie nazwiska: " + trzeci.toString());
        System.out.println("Name: " + pierwszy.getName() + " age: " + pierwszy.getAge());

    }
}