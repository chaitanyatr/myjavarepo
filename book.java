import java.util.Scanner;
class Books{
int pages;
int chapters;
double rating;
float price;
String date;
static String author;
}
class SecondDemo{
public static void main(String args[]){
Books book1 = new Books();
Scanner bk=new Scanner(System.in);
System.out.println("Enter book1 information:");
book1.pages=bk.nextInt();
book1.chapters=bk.nextInt();
book1.rating=bk.nextDouble();
book1.price=bk.nextFloat();
book1.date=bk.next();
book1.author=bk.next();
System.out.println("book1 details: "+"No.of pages="+book1.pages+" No.of chapters="+book1.chapters+" rating="+book1.rating+ " price="+book1.price+" date="+book1.date+" author="+book1.author);

System.out.println("HI>>>>>>>>");


Books book2=new Books();
System.out.println("Enter book2 information:");
book2.pages=bk.nextInt();
book2.chapters=bk.nextInt();
System.out.println("book2 details: "+"No.of pages="+book2.pages+" No.of chapters="+book2.chapters+" rating="+book2.rating+ " price="+book2.price+" date="+book2.date+" author="+book2.author);
}
}