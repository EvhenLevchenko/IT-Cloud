//package attic.progect;
//
//public class Buyer {
//    String fname;
//    String sname;
//    String mname;
//    String address;
//    int numberCard;
//    int numberPhone;
//
//    Buyer() {
//        numberCard = 0;
//        numberPhone = 0;
//    }
//
//
//    public Buyer(String fname, String sname, String mname, String address, int numberCard, int numberPhone) {
//        this.fname = fname;
//        this.sname = sname;
//        this.mname = mname;
//        this.address = address;
//        this.numberCard = numberCard;
//        this.numberPhone = numberPhone;
//    }
//
//    void sort(int[] array, int n, int k,String fname,String sname) {
//        Buyer temp;
//        switch (k) {
//            case 1:
//                for (int i = 0; i < n - 1; i++) {
//                    for (int j = 0; j < n - 1 - i; j++) {
//                        if (array[j + 1].fname < array[j].fname) {
//                            temp = array[j];
//                            array[j] = array[j + 1];
//                            array[j + 1] = temp;
//                        }
//                    }
//                }
//                break;
//            case 2:
//                for (int i = 0; i < n - 1; i++) {
//                    for (int j = 0; j < n - 1 - i; j++) {
//                        if (array[j + 1].sname < array[j].sname) {
//                            temp = array[j];
//                            array[j] = array[j + 1];
//                            array[j + 1] = temp;
//                        }
//                    }
//                }
//                break;
//            case 3:
//                for (int i = 0; i < n - 1; i++) {
//                    for (int j = 0; j < n - 1 - i; j++) {
//                        if (array[j + 1].mname < array[j].mname) {
//                            temp = array[j];
//                            array[j] = array[j + 1];
//                            array[j + 1] = temp;
//                        }
//                    }
//                }
//                break;
//            case 4:
//                for (int i = 0; i < n - 1; i++) {
//                    for (int j = 0; j < n - 1 - i; j++) {
//                        if (array[j + 1].address < array[j].address) {
//                            temp = array[j];
//                            array[j] = array[j + 1];
//                            array[j + 1] = temp;
//                        }
//                    }
//                }
//                break;
//            case 5:
//                for (int i = 0; i < n - 1; i++) {
//                    for (int j = 0; j < n - 1 - i; j++) {
//                        if (array[j + 1].numberCard < array[j].numberCard) {
//                            temp = array[j];
//                            array[j] = array[j + 1];
//                            array[j + 1] = temp;
//                        }
//                    }
//                }
//                break;
//            case 6:
//                for (int i = 0; i < n - 1; i++) {
//                    for (int j = 0; j < n - 1 - i; j++) {
//                        if (mas[j + 1].numberPhone < mas[j].numberPhone) {
//                            temp = mas[j];
//                            mas[j] = mas[j + 1];
//                            mas[j + 1] = temp;
//                        }
//                    }
//                }
//                break;}}
//
//
//    void enter(int[] array, int n) {
//        String fname, sname, mname, address;
//        int numberCard, numberPhone;
//        for (int i = 0; i < n; i++) {
//            System.out.println("Введите имя, фамилию, отчество, адресс, номер карточки, номер телефона пользователя: ");
//            cin >> fname >> sname >> mname >> address >> numberCard >> numberPhone;
//            array[i] = Buyer(fname, sname, mname, address, numberCard, numberPhone);
//        }
//    }
//}
