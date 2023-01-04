class Bank{
    int getrateofInterest(){
        return 0;
    }
}
class SBI extends Bank{
    int getrateofInterest(){
        return 9;
    }
}
class ICICI extends Bank{
    int getrateofInterest(){
        return 15;
    }
}
public class Bank_Overriding {
    public static void main(String args[]){
        SBI obj= new SBI();
        ICICI obj1= new ICICI();
        System.out.println("SBI KA RATE:"+ obj.getrateofInterest());
        System.out.println("ICICI KA RATE:"+ obj1.getrateofInterest());
    }
}