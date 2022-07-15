package url_protocol_domain;

public class Url_protocol_domain {

    public static void main(String[] args) {
        String url = "http://www.google.com";
        
        String protocol = url.substring(0, url.indexOf(":"));
        String extension = url.substring(url.lastIndexOf(".")+1);
        
        if (protocol.equals("http")) {
            System.out.println("Hypertext Transfer Protocol");
        } else if (protocol.equals("ftp")) {
            System.out.println("File Transfer Protocol");
        } else {
            System.out.println("Protocol is: " + protocol);
        }
        
        if (extension.equals("com")) {
            System.out.println("Commerical Website");
        } else if (protocol.equals("org")) {
            System.out.println("Organization Website");
        } else if (protocol.equals("gov")) {
            System.out.println("Government Website");
        } else {
            System.out.println("Website is: " + extension);
        }
    }
    
}
