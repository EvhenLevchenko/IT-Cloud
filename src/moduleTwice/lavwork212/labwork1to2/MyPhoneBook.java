package moduleTwice.lavwork212.labwork1to2;

import java.util.Arrays;
import java.util.Comparator;

public class MyPhoneBook {


    private static final int numberOfRecords = 10;
    PhoneNumber[] phoneNumbers = new PhoneNumber[numberOfRecords];
    private int phoneNumbersConter;

    public static class PhoneNumber {
        private String name;
        private String phone;

        public PhoneNumber(String name, String phone) {
            this.name = name;
            this.phone = phone;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
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
                return o1.getPhone().compareTo(o2.getPhone());
            }
        });
    }
}