public class Senaka{
    private String msg = "The class will be held on next saturday!";
    static Senaka s1;
    public static void main(String[] args) {
        s1 = new Senaka();
        s1.sendMessage();
    }
    public void sendMessage(){
        Lakshan l1 = new Lakshan();
        l1.setMsg(s1.getMsg(),s1);
        
    }
    public String getMsg(){
        return msg;
    }
}
class Lakshan{
    private String msg;
    public Senaka s1;
    
    public void setMsg(String msg, Senaka s){
        this.msg = msg;
        s1=s;
    }
    public void sendMessage(){
        
    }
    public String getMsg(){
        return msg;
    }
}
class Shashika{
    private String msg;
    public Senaka s1;
    
    public void setMsg(String msg, Senaka s){

    }
    public void sendMessage(){

    }
    public String getMsg(){
        return msg;
    }
}

class Mewan{
    private String msg;
    public Senaka s1;
    
    public void setMsg(String msg, Senaka s){

    }
    public void sendMessage(){

    }
    public String getMsg(){
        return msg;
    }
}