public class ContactsManager {
    static Contact[] arrayofContacts;
    static int numofContacts;
    public ContactsManager(){
        arrayofContacts = new Contact[1000];
        numofContacts = 0;
    }
    public void addContact(Contact c){
        arrayofContacts[numofContacts] = c;
        numofContacts++;
    }

    public static String searchContact(String nama){
        for(int i =0;i<numofContacts;i++){
            if(arrayofContacts[i].nama==nama){
                return arrayofContacts[i].nomor;
            }
        }
        return null;
    }

}
