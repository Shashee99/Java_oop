public class Senaka{
    private String msg = "The class will be held on next saturday!";
    static Senaka s1;
    public static void main(String[] args) {
        s1 = new Senaka();
        s1.sendMessage();
    }
    public void feedback(String m){
        msg = m;
        System.out.println(msg);
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
        System.out.println("Lakshan says : "+msg);
        sendMessage();
    }
    public void sendMessage(){
        Shashika sh1 = new Shashika();
        sh1.setMsg(getMsg(),s1);

    }
    public String getMsg(){
        return msg;
    }
}
class Shashika{
    private String msg;
    public Senaka s1;
    
    public void setMsg(String msg, Senaka s){
        this.msg = msg;
        s1=s;
        System.out.println("Shashika says : "+msg);
        sendMessage();
    }
    public void sendMessage(){
        Mewan mew1 = new Mewan();
        mew1.setMsg(getMsg(),s1);
    }
    public String getMsg(){
        return msg;
    }
}

class Mewan{
    private String msg;
    public Senaka s1;
    
    public void setMsg(String msg, Senaka s){
        this .msg = msg;
        s1=s;
        System.out.println("Mewan says : "+msg);
        sendMessage();
    }
    public void sendMessage(){
        s1.feedback(getMsg());

    }
    public String getMsg(){
        return "sir i'm mewan i got ur msg :"+ msg;
    }
}