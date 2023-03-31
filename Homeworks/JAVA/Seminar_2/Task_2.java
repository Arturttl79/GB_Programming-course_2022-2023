// На первой строке записывается натуральное число n - количество строчек в книге. Затем вводится n строк - строки книги. 
// потом вводится натуральное число m - количество продуктов, на которые у человека аллергия. Потом вводится m строк - 
// вида "продукт1 - продукт2", где продукт1 - продукт, на который у человека аллергия и продукт2 - продукт, на который следует 
// заменить продукт1. Гарантируется что любой продукт состоит из 1 слова. название продуктов написаны строчными буквами. 
// Гарантируется, что продукты, на которые нужно выполнить замену, не встречаются изначально в тексте.
// Выходные данные
// Замените все продукты в поваренной книге Васи и выведите их построчно на экран. На окончания не обращайте внимание. 
// ВАЖНО!!! Если продукт, который следует заменить написан с большой буквы, то и замена тоже должна начинаться с большой буквы!
// Sample Input:
// 2
// Рецепт 1. Арахис 100гр, мороженое 200гр. Возьмите арахис и измелчите его. Посыпьте измельчённый арахис на мороженое.
// Рецепт 2. Клубника 100гр, сгущенка 3кг. Смешать, есть) Радоваться жизни.
// 3
// арахис - колбаса
// клубника - вишня
// сгущенка - молоко
// Sample Output:
// Рецепт 1. Колбаса 100гр, мороженое 200гр. Возьмите колбаса и измелчите его. Посыпьте измельчённый колбаса на мороженое.
// Рецепт 2. Вишня 100гр, молоко 3кг. Смешать, есть) Радоваться жизни.

package Homeworks.JAVA.Seminar_2;
import java.util.*;
public class Task_2 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String n = sc.nextLine(); // Если создать как int, то в консоле неверно считывает строки для String[] recipe
        String[] recipe = new String[Integer.parseInt(n)]; 
        for (int i = 0; i < recipe.length; i++)
            recipe[i] = sc.nextLine().toLowerCase();

        String m = sc.nextLine(); // Если создать как int, то в консоле неверно считывает строки для String[] recipe
        String[] products = new String[Integer.parseInt(m)];
        for (int i = 0; i < products.length; i++)
            products[i] = sc.nextLine();

        for (int i = 0; i < recipe.length; i++) {
            for (int j = 0; j < products.length; j++) {
                String[] productToChange = products[j].split(" - ");
                recipe[i] = recipe[i].replace(productToChange[0], productToChange[1]);
            }
            firstLetterToCapital(recipe[i]);
        }
    }

    public static void firstLetterToCapital(String text) { //Делает первую букву в предложении заглавной
        String[] sentence = text.split("\\. ");
        for (int i = 0; i < sentence.length; i++) {
            if (sentence[i].indexOf(") ") != - 1) {
                String[] subSentence = sentence[i].split("\\) ");
                for (int j = 0; j < subSentence.length; j++) {
                    subSentence[j] = subSentence[j].substring(0,1).toUpperCase() + subSentence[j].substring(1);
                }
                sentence[i] = String.join(") ", subSentence);
            } sentence[i] = sentence[i].substring(0,1).toUpperCase() + sentence[i].substring(1);
        }
        System.out.println(String.join(". ", sentence));
    }
}
