package Fundamental.MainTask;

/**
 * 2. Отобразить в окне консоли аргументы командной строки в обратном порядке.
 */

//        Если вы используете intellij, перейдите в пункт меню Run > Edit Configurations.
//        Появится диалоговое окно. Теперь вы можете добавить аргументы в поле ввода Program arguments.

public class ArgsRevers {
    public static void main(String[] args) {
        for (int i = args.length - 1; i >= 0; i--) {
            System.out.println(args[i]);
        }
    }
}
