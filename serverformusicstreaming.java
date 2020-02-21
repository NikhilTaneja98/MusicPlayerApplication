import com.vmm.JHTTPServer;
import static com.vmm.NanoHTTPD.HTTP_OK;
import java.io.*;
import java.sql.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class serverformusicstreaming extends JHTTPServer {

    public serverformusicstreaming(int port) throws IOException {
        super(port);
    }

    @Override
    public Response serve(String uri, String method, Properties header,
            Properties parms, Properties files) {

        Response res = null;

        System.out.println("URI " + uri);
        if(uri.contains("/getallpunsongs"))
        {
            try {
                String ans="";
                String q=parms.getProperty("Category");
                System.out.println(q);
                ResultSet rs = DBLoader.executeQuery("select * from list where Category='"+q+"'");

                while (rs.next()) {
                    String c = rs.getString("Songname");
                    String d= rs.getString("Songpath");
                    String e= rs.getString("Posterpath");

                    ans += c + ";;" + d + ";;" + e + "~~";

                }
                res = new Response(HTTP_OK, "text/plain", ans);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        else if(uri.contains("playpun"))
        {
            try{
                String p=parms.getProperty("Songname");
                ResultSet rs = DBLoader.executeQuery("select * from list where Songname='"+p+"'");
                if(rs.next())
                {
                    String a=rs.getString("Songpath");
                    res = new Response(HTTP_OK, "text/plain",a);
                }
                
            }
            catch(Exception ex)
            {
                ex.printStackTrace();
            }
            
            
        }
        else if(uri.contains("/userlogin"))
        {
            try {
                String a = parms.getProperty("username");
                String b = parms.getProperty("password");
                ResultSet rs = DBLoader.executeQuery("select * from users where Email='" + a + "'and Password='" + b + "'");
                if (rs.next()) {
                    String c=rs.getString("Username");
                    System.out.println(c);
                    System.out.println(GlobalData.nameofuser);
                    res = new Response(HTTP_OK, "text/plain", c+"+Login Successful");
                } else {
                    res = new Response(HTTP_OK, "text/plain", "Invalid login");
                }
            } catch (SQLException ex) {
                Logger.getLogger(serverformusicstreaming.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else if(uri.contains("/usersignup"))
        {
            String a=parms.getProperty("username");
            String b=parms.getProperty("email");
            String c=parms.getProperty("password");
            ResultSet rs= DBLoader.executeQuery("select * from users where Email='"+c+"'");
            try {
                if(rs.next())
                {
                    res=new Response(HTTP_OK,"text/plain","Email Already Registered");
                }
                else
                {
                    rs.moveToInsertRow();
                    rs.updateString("Username", a);
                    rs.updateString("Email", b);
                    rs.updateString("Password", c);
                    rs.insertRow();
                    res=new Response(HTTP_OK,"text/plain","User SignUp Successful");
                }
            } catch (Exception ex) {
                Logger.getLogger(serverformusicstreaming.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return res;
    }
}