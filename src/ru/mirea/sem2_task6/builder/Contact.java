package ru.mirea.sem2_task6.builder;

public class Contact {
        private final String name;
        private final String surname;
        private final String email;
        private final String phone;
        private final String address;

        Contact(ContactBuilder contactBulder) {
                this.name = contactBulder.getName();
                this.surname = contactBulder.getSurname();
                this.email = contactBulder.getEmail();
                this.phone = contactBulder.getPhone();
                this.address = contactBulder.getAddress();
        }

        public String getName() {
                return name;
        }

        public String getSurname() {
                return surname;
        }

        public String getEmail() {
                return email;
        }

        public String getPhone() {
                return phone;
        }

        public String getAddress() {
                return address;
        }
}