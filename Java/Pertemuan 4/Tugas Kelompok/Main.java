public class Main {
    public static void main(String[] args) {
        ContactsManager bukuKontak = new ContactsManager();
        Contact kontak1 = new Contact("Tanto", "tantows001@gmail.com", "085273349246");
        Contact kontak2 = new Contact("Muza", "muzagundud@gmail.com", "081278239211");

        bukuKontak.addContact(kontak1);
        bukuKontak.addContact(kontak2);
        System.out.println("Jumlah kontak sekarang : "+ ContactsManager.numofContacts);
        System.out.println("Nomor yang dicari : "+ContactsManager.searchContact("Tanto"));
    }
}
