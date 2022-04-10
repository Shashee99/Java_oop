class Computer{
    private String uname="sss1234";
    private String pword="1234";
    public void setLogin(String str,String pw){
        if(this.uname.equals(str)&&this.pword.equals(pw)){
            System.out.println("Log in succed!");
        }
        else{
            System.out.println("log in failed");
        }
    }
}

class Son{
    private String username = "sss1234";
    private String password = "1234";
    private Computer c = new Computer();

    public String getUsername(){
        return username;
    }
    public String getPassword(){
        return password;
    }
    public Computer getComputer(){
        return c;
    }
}
public class Father {
    private String username;
    private String password;

    
    public void setunameandpw(String s,String p){
        username =s;
        password = p;

    }
    public void Login(){
        c1.setLogin(username, password);
    }
    static Computer c1;
    public static void main(String[] args) {
        Father f = new Father();
        Son s = new Son();
        c1=s.getComputer();

        f.setunameandpw(s.getUsername(),s.getPassword());
        f.Login();
        

    }

}
