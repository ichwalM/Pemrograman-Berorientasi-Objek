package model;

import java.math.BigDecimal;
import java.util.Arrays;

public class Book{
    private int id;
    private String name;
    private Author[] authors;
    private Publisher publisher;
    private int publishingYear;
    private int amountOfPages;
    private BigDecimal price;
    private CoverType coverType;
    
   public Book(int id,String name, Author[] authors, Publisher publisher, int publishingYear, int amountOfPages, BigDecimal price,CoverType coverType){
       this.id=id;
       this.name=name;
       this.authors=authors;
       this.publisher=publisher;
       this.publishingYear=publishingYear;
       this.amountOfPages=amountOfPages;
       this.price=price;
       this.coverType=coverType;
       
       
   }
   
   public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public Author[] getAuthors() {
        return authors;
    }
    
    public void setAuthors(Author[] authors) {
        this.authors = authors;
    }
    
    public Publisher getPublisher() {
        return publisher;
    }
    
    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }
    
    public int getPublishingYear() {
        return publishingYear;
    }
    
    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }
    
    public int getAmountOfPages() {
        return amountOfPages;
    }
    
    public void setAmountOfPages(int amountOfPages) {
        this.amountOfPages = amountOfPages;
    }
    
    public BigDecimal getPrice() {
        return price;
    }
    
    public void setPrice(BigDecimal price) {
        this.price = price;
    }
    
    public CoverType getCoverType() {
        return coverType;
    }
    
    public void setCoverType(CoverType coverType) {
        this.coverType = coverType;
    }

    @Override
    public String toString() {
        return "Book{" + "id=" + id + ", name=" + name + ", authors=" + Arrays.toString(authors) + ", publisher=" + publisher + ", publishingYear=" + publishingYear + ", amountOfPages=" + amountOfPages + ", price=" + price + ", coverType=" + coverType + '}';
    }
    
    
   
}
