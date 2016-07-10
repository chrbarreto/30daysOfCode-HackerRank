//Write MyBook Class
class MyBook extends Book {
    int price;
    
    public MyBook(String title, String author, int price){
        super(title, author);
        this.price = price;
    }
    
    @Override
    public void display(){
        StringBuffer sb = new StringBuffer();
        sb.append("Title: " + this.title + "\n");
        sb.append("Author: " + this.author + "\n");
        sb.append("Price: " + this.price + "\n");
        
        System.out.println(sb.toString());
    }
}
