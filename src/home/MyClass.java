package home;

public class MyClass {

    public static void main(String[] args) {
        //Массивы
        int array[] = new int[5];//создаем массив
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
            System.out.println(array[i]);
        }
        for(int v: array) { //foreach
            System.out.println(v);
        }

        int w =1;
        switch (w) {
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            default:
                System.out.println("0");
                break;
        }

        //String
        String f = "Java";
        String f1 = new String("Java");
        System.out.println(f);
        System.out.println(f1);
        System.out.println(f.equals(f1));//сравниваем строки по значению
        String f3 = f.replace("J", "G");

        String s = "";
        for(int i = 1; i < 11; i++) {
            s = s + i + ";";
        }
        System.out.println(s);
    }
}