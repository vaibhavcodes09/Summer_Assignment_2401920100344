interface LibraryUser{
    void registerAccount();
    void requestBook();
}
class KidUsers implements LibraryUser{
    int age;
    String bookType;
    
    @Override
    public void registerAccount(){
        if(age<12){
            System.out.println("You have successfully registered undeer a Kid acoount");
        }    
        else{
            System.out.println("Sorry, age must be less than 12 to register as a Kid");
        }
    }
    @Override
    public void requestBook(){
        if(bookType.equalsIgnoreCase("Kids")){
            System.out.println("Book issued successfully, please return the book in 10 days");
        }
        else{
            System.out.println("Oops , you are allowed to take only Kids books");
        }
    }

}
class AdultUsers implements LibraryUser{
    int age;
    String bookType;

    @Override
    public void registerAccount(){
        if(age>12){
            System.out.println("You have successfully registered under an Adult account");
        }
        else{
            System.out.println("Sorry, age must be greater than 12 to register as an Adult");
        }
    }
    @Override
    public void requestBook(){ 
        if(bookType.equalsIgnoreCase("Fiction")){
            System.out.println("Book issued successfully, please return the book in 7 days");
        }
        else{
            System.out.println("Oops, you are allowed to take only Adult Fiction books");
        }
    }
}
public class LibraryInterfaceDemo{
    public static void main(String [] args){
        
        KidUsers Kid = new KidUsers();

        Kid.age=10;
        Kid.bookType="Kids";
        Kid.registerAccount();
        Kid.requestBook();

        Kid.age=18;
        Kid.bookType="Fiction";
        Kid.registerAccount();
        Kid.requestBook();

        AdultUsers Adult = new AdultUsers();

        Adult.age=5;
        Adult.bookType="Kids";
        Adult.registerAccount();
        Adult.requestBook();

        Adult.age=23;
        Adult.bookType="Fiction";
        Adult.registerAccount();
        Adult.requestBook();
    }
}