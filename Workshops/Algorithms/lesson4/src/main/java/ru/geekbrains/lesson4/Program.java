package ru.geekbrains.lesson4;



public class Program {

    public static void main(String[] args) {

        HashMap<String, String> hashMap = new HashMap<>(4);

        String res = hashMap.put("+79005554433", "Андрей");
        res = hashMap.put("+79005554432", "Алексей");
        res = hashMap.put("+79005554432", "Дарья1");
        res = hashMap.put("+79005554433", "Дарья2");
        res = hashMap.put("+79005554434", "Дарья3");
        res = hashMap.put("+79005554435", "Дарья4");
        res = hashMap.put("+79005554436", "Дарья5");
        res = hashMap.put("+79005554437", "Дарья6");
        res = hashMap.put("+79005554438", "Дарья7");
        res = hashMap.put("+79005554439", "Дарья8");


        res = hashMap.get("+79005554436");

        hashMap.remove("+79005554438");

        for (HashMap.Entity element : hashMap) {
            System.out.println(element.key + " - " + element.value);
        }

    


    }

}


