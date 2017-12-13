//package attic.progect;
//
//public class Main {
//    public static void main(String[] args) {
//        setlocale(0, "");
//        int n = 2;
//        Buyer * mas = new Buyer[n];
//        boolean flag = true;
//        int number, k;
//        mas[0] = Buyer("ddd", "hhh", "sss", "asd", 123123, 222555);
//        mas[1] = Buyer("bbb", "ttt", "ddd", "ask", 123124, 222556);
//        while (flag) {
//            System.out.println("Меню:\\n 1-Ввод структуры\\n 2-Поиск по заданому параметру\\n 3-Сортировка по параметру\\n 4-Удаление покупателя\\n 5-Изменение информации о покупателе\\n 6-Вывод пользователей\\n 7-Выход\\n");
//            cin >> number;
//            switch (number)
//            {
//                case 1: enter(mas, n); print(mas, n); break;
//                case 2: System.out.println("Введите номер параметра:\n имя-1\n фамилия-2\n отчество-3\n адресс-4\n номер карточки-5\n номер телефона-6\n");
//                    cin >> k;
//                    search(mas, n, k);
//                    break;
//                case 3:  System.out.println("Введите номер параметра:\n имя-1\n фамилия-2\n отчество-3\n адресс-4\n номер карточки-5\n номер телефона-6\n");
//
//                    cin >> k;
//                    sort(mas, n, k);
//                    print(mas, n); break;
//                case 4:  System.out.println("Введите номер пользователя, которого нужно удалить: \\n");
//                    cin >> k;
//                    deleteBuyer(mas, n, k);
//                    n--;
//                    print(mas, n);
//                    break;
//                case 5:  print(mas, n);System.out.println("Введите номер пользователя, информацию о котором нужно изменить: \n");
//                    cin >> k;
//                    setBuyer(mas, n, k);
//                    break;
//                case 6: print(mas, n);
//                    break;
//                case 7: flag = false;
//                    break;
//            }
//        }
//
//        return 0;
//    }
//}
