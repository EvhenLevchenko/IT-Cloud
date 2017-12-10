package moduleTwice.lavwork212.labwork3;

import java.util.Arrays;
import java.util.Comparator;

public class MyPhone {

    private MyPhoneBook myPhoneBook;

    public class MyPhoneBook {

        private static final int numberOfRecords = 10;
        PhoneNumber[] phoneNumbers = new PhoneNumber[numberOfRecords];
        private int phoneNumbersConter;

        public class PhoneNumber {
            private String name;
            private String phone;

            public PhoneNumber(String name, String phone) {
                this.name = name;
                this.phone = phone;
            }

            public String getName() {
                return name;
            }

            public String getPhone() {
                return phone;
            }

            @Override
            public String toString() {
                return "Name " + getName() + ", phone " + getPhone()
                        ;
            }
        }

        public void addPhoneNumber(String name, String phone) {
            if (phoneNumbersConter < numberOfRecords) {
                phoneNumbers[phoneNumbersConter++] = new PhoneNumber(name, phone);
            }
        }

        public void printPhoneBook() {
            for (int i = 0; i < phoneNumbersConter; i++) {
                System.out.println(phoneNumbers[i]);

            }
        }

        public void sortByName() {
            Arrays.sort(phoneNumbers, new Comparator<PhoneNumber>() {
                @Override
                public int compare(PhoneNumber o1, PhoneNumber o2) {
                    return o1.name.compareTo(o2.name);
                }
            });

        }

        public void sortByPhone() {
            Arrays.sort(phoneNumbers, new Comparator<PhoneNumber>() {
                @Override
                public int compare(PhoneNumber o1, PhoneNumber o2) {
                    return o1.phone.compareTo(o2.phone);
                }
            });
        }
    }
    public  void switchOn(){
        System.out.println("Loading PhoneBook records…");
        myPhoneBook = new MyPhoneBook();
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
        System.out.println("Ok!");
    }

    public void call(int numberOfRecords){
        System.out.println("Calling to: " + myPhoneBook.phoneNumbers[numberOfRecords].toString());
    }

}
