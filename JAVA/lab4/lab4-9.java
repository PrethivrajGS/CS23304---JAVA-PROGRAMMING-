/* Create a class called UserLogin with username, and password. Create methods: 
validateUsername() and validatePWD() to check if the username and password are valid or 
not. Create an array of 5 Login credentials and initialize using constructors. All 5 users must 
try to login with their credentials (use a loop through the array). If the username does not exist 
“Username invalid“message should be displayed. If the username is correct, but the password 
is incorrect, “password does not match the username” message must be displayed. If both 
are correct, “Successful login by username _____” message must be displayed. */
import java.util.Scanner;
class UserLogin
{
    String username;
    String password;
    public UserLogin(String x,String y)
    {
        username = x;
        password = y;
    }
    public boolean validateUsername(String inuser)
    {
        return username.equals(inuser);
    }
    public boolean validatePWD(String inpass)
    {
        return password.equals(inpass);
    }
    public static void main(String[] arg)
    {
        UserLogin[] users={ new UserLogin("gsp","son"),
                          new UserLogin("vani","sister"),
                          new UserLogin("nandy","elder"),
                          new UserLogin("selva","father"),
                          new UserLogin("neela","grandma"),
                         };
        String[][] test={
            {"user","son"},
            {"vani","sister"},
            {"nandy","daughter"},
            {"selva","son"},
            {"neela","grandpa"},
        };
        for(String[] credentials : test)
        {
            String testuser=credentials[0];
            String testpass=credentials[1];
            
            boolean userfound=false;
            boolean passcrt=false;
            
            for(UserLogin user : users)
            {
                if(user.validateUsername(testuser))
                  userfound=true;
                if(user.validatePWD(testpass))
                  passcrt=true;
            }    
                if(!userfound)
                  System.out.println("USERNAME NOT FOUND");
                else if(!passcrt)
                  System.out.println("PASSWORD NOT MATCHES THE USERNAME");
                else
                  System.out.println("SUCCESFUL LOGIN BY USERNAME:" +testuser);
        }
    }
    
}