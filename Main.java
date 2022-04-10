class Toy{
    private String name = "BMW";
    public String getName(){
        return name;
    }
}

class Ebay{
    private Toy t = new Toy()    ;
    public Toy passAp(){
        return t;
    }
    public void  settftonull(){
       t=null;
    }
}
class American_postal{
    private Toy t;
    public void getToy(Toy t){
        this.t=t;
    }
    public Toy passSlp(){
        return t;
    }
    public void  settftonull(){
        t=null;
     }
}
class Srilankan_postal{
    private Toy t;
    public void getToy(Toy t){
        this.t=t;
    }
    public Toy pass(){
        return t;
    }
    public  void  settftonull(){
        t=null;
     }
}
class Shashika {
    private Toy t;
    public void getToy(Toy t){
        this.t=t;
    }
    public void display(){
        System.out.println(t.getName());
    } 
    public void  settftonull(){
        t=null;
    }  
}
public class Main{
    public static void main(String[] args) {
        Ebay e = new Ebay();
        American_postal ap = new American_postal();
        Srilankan_postal slp = new Srilankan_postal();
        Shashika sh1 = new Shashika();
        ap.getToy(e.passAp());
        e.settftonull();
        slp.getToy(ap.passSlp());
        ap.settftonull();
        sh1.getToy(slp.pass());
        sh1.display();

    }
}
