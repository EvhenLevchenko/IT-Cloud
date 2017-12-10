package moduleTwice.lavwork212.labwork1to2;

public class Main {
    public static void main(String[] args) {

        MyPhoneBook array = new MyPhoneBook();
        array.addPhoneNumber("Djin", "0923589739");
        array.addPhoneNumber("John", "0455789275");
        array.addPhoneNumber("Alina", "0970653300");
        array.addPhoneNumber("Vika", "0994256693");
        array.addPhoneNumber("Olya", "0681998363");

        array.printPhoneBook();
        System.out.println();
        MyPhoneBook myPhoneBook = new MyPhoneBook();
        myPhoneBook.addPhoneNumber("Vika", "094324324");
        myPhoneBook.addPhoneNumber("Dasha",  "0493478390");
        myPhoneBook.addPhoneNumber("Katya",  "0653252355");
        myPhoneBook.addPhoneNumber("katya2",  "0145434363");
        myPhoneBook.addPhoneNumber("Vova",   "0343565620");
        myPhoneBook.addPhoneNumber("Alisa",  "0925514915");
        myPhoneBook.addPhoneNumber("Liza",   "0966541254");
        myPhoneBook.addPhoneNumber("Marina",  "0674893275");
        myPhoneBook.addPhoneNumber("Vika",   "0587318955");
        myPhoneBook.addPhoneNumber("Olya",   "0582758923");


        System.out.println("This my PhoneBook!!");
        myPhoneBook.printPhoneBook();
        System.out.println();

        System.out.println("Sorted by name");
        myPhoneBook.sortByName();
        myPhoneBook.printPhoneBook();
        System.out.println();


        System.out.println("Sorted by phone");
        myPhoneBook.sortByPhone();
        myPhoneBook.printPhoneBook();
        System.out.println();
    }
}