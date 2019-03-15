
import java.util.HashMap;


public class loginAuthentication {

   HashMap userDictionary;

    public loginAuthentication( ) {
        userDictionary =new HashMap();
        userDictionary.put("1","1");
        
         
    }
   

   
    
    public boolean validate(String cardnum, String pass ){
        boolean checker =false;
        String fetched =(String) userDictionary.get(cardnum);
        if(fetched!=null){
            checker=fetched.equals(pass);    
        
        }
   return checker;
    }
    
}
