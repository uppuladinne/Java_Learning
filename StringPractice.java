package stringpractice;

public class StringPractice {

    public static void main(String[] args) {
        String str = "programmer@hotmail.com";
        
        /*String username = str.substring(0, str.indexOf('@'));
        System.out.println(username);
        String domain_name = str.substring(str.indexOf('@')+1);
        System.out.println(domain_name);
        System.out.println(domain_name.startsWith("gmail"));*/
        String[] words = str.split("@");
        
        System.out.println("username: "+words[0]);
        System.out.println("domain_name: "+words[1]);
        
        
        
    }
    
}
