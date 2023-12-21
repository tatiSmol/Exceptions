public class Main3 {
    /*
    3. Создать собственный класс-исключение - наследник класса Exception.
    Создать метод, выбрасывающий это исключение.
    Вызвать этот метод и отловить исключение.
    Вывести stack trace в консоль.
     */

    public static void main(String[] args) {
        try {
            createNewCat("cat", "dog");
        } catch (CatBreedException ex) {
            ex.printStackTrace();
        }
    }

    public static void createNewCat(String name, String breed) throws CatBreedException {
        if (breed.equalsIgnoreCase("dog")) {
            throw new CatBreedException("Cats cannot be of breed \"dog\"");
        }
        new Cat(name, breed);
    }

    static class Cat {
        private String name;
        private String breed;

        public Cat(String name, String breed) {
            this.name = name;
            this.breed = breed;
        }
    }
}

class CatBreedException extends Exception{
    public CatBreedException(String message){
        super(message);
    }
}


