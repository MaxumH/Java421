import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Book[] myObjectArray;
        myObjectArray = new Book[6];
        myObjectArray[0]=new Book(1,"Harry Potter","Rouling","BookDream",2002,235,17.5);
        myObjectArray[1]=new Book(2,"Timber","Midwinter","Dream",2017,174,22);
        myObjectArray[2]=new Book(3,"War&Peace","Tolstoy","YourBook",1987,333,20);
        myObjectArray[3]=new Book(4,"Odisey","Stille","Svitanok",2012,199,15);
        myObjectArray[4]=new Book();
        myObjectArray[4].setName("Dune");

        System.out.println("Enter Name of Avtor");
        Scanner a = new Scanner(System.in);
        String NameAvtor = a.nextLine();
        System.out.println("Enter Name of Company");
        Scanner b = new Scanner(System.in);
        String NameCompany = b.nextLine();
        System.out.println("Enter Year");
        Scanner c = new Scanner(System.in);
        int Year = c.nextInt();
        for(int i=0;i < 4;i++)
        {
            if( myObjectArray[i].getAvtor().equals(NameAvtor))
            {
                System.out.println("Cписок книг заданого автора ");
                System.out.println(myObjectArray[i]);
            }
            if( myObjectArray[i].getCompany().equals(NameCompany))
            {
                System.out.println("Cписок книг, що видані заданим видавництвом ");
                System.out.println(myObjectArray[i]);
            }
            if( myObjectArray[i].getYear() >= Year)
            {
                System.out.println("Cписок книг, що випущені після заданого року. ");
                System.out.println(myObjectArray[i]);
            }
        }

    }
}