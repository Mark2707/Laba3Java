
public class Main3 {

    public static void main(String[] args) {

        try {
            PhoneBook phoneBook = new PhoneBook();
            phoneBook.createRecord(new Record(0, "8-800", "Иванов"));
            phoneBook.createRecord(new Record(1, "8-800", "Петров"));
        }
        catch(Exception e){
            System.out.println(e);
        }

        try{
            PhoneBook phoneBook = new PhoneBook();
            phoneBook.createRecord(new Record(0, "1", "Mark"));
            phoneBook.deleteRecord(1);
        }
        catch (Exception e){
            System.out.println(e);
        }

        try{
            PhoneBook phoneBook = new PhoneBook();
            phoneBook.createRecord(new Record(1, "913", "Mark"));
            phoneBook.updateRecord(new Record(1, null, null));
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}