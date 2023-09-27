import java.util.Date;
public class Book {
    private int Id;
    private String Name;
    private String Avtor;
    private String Company;
    private int Year;
    private int Count_of_pages;
    private double Price;

    public Book(int Id, String Name, String Avtor, String Company, int Year, int Count_of_pages, double Price) {
        this.Id = Id;
        this.Name = Name;
        this.Avtor = Avtor;
        this.Company = Company;
        this.Year = Year;
        this.Count_of_pages = Count_of_pages;
        this.Price = Price;
    }
    public Book() {
        this.Id = Id;
        this.Name = Name;
        this.Avtor = Avtor;
        this.Company = Company;
        this.Year = Year;
        this.Count_of_pages = Count_of_pages;
        this.Price = Price;
    }



    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getAvtor() {
        return Avtor;
    }

    public void setAvtor(String Avtor) {
        this.Avtor = Avtor;
    }

    public String getCompany() {
        return Company;
    }

    public void setCompany(String Company) {
        this.Company = Company;
    }

    public int getYear() {
        return Year;
    }

    public void setYear(int Year) {
        this.Year = Year;
    }

    public int getCount_of_pages() {
        return Count_of_pages;
    }

    public void setCount_of_pages(int Count_of_pages) {
        this.Count_of_pages = Count_of_pages;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(int Price) {
        this.Price = Price;
    }
    @Override
    public String toString() {
        return "Book{" + "Id=" + Id + '\'' + ", Name='" + Name + '\'' + ", Avtor='" + Avtor + '\'' + ", Company=" + Company + '\'' + ", Year=" + Year + '\'' + ", Count of pages=" + Count_of_pages + '\'' + ", Price=" + Price + '}';
    }
}
