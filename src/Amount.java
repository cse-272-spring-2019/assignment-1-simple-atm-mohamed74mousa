import java.util.ArrayList;
public class Amount {
        HomeScreen homeScreen ;

 private double balance=0;
  private ArrayList<String>trans = new ArrayList<String>();
  int index =0 ;
  public String next(){
if (index==trans.size()-1)
    return null;

   index++;

return trans.get(index);


}
    public String previous(){
if (index==trans.size())
    return null;
index--;
return trans.get(index);


}
 public void credit(double amount){
 balance = balance + amount;
    String x="deposit" + amount;
   trans.add(x);
   if (trans.size()>5)
       trans.remove(0);
 
index= trans.size()-1;
 }

public void debit(double amount){
    
 balance = balance - amount;
  
   String x="withdraw" + amount;
   trans.add(x);
   if (trans.size()>5)
       trans.remove(0);
 
index= trans.size()-1;

}
 public double getBalance(){
     return balance;
 }
 public double getBalance2(){
        String x="balance"+ getBalance();
   trans.add(x);
   if (trans.size()>5)
       trans.remove(0);
 
index= trans.size()-1;
     return balance;
 }

    public int getIndex() {
        return index;
    }

    public int getTrans() {
        return trans.size();
    }
 

 }        
        
    

