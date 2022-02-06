package bo.edu.uap.api;
import static spark.Spark.*;
import spark.*;
import java.util.Properties;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Properties properties = new Properties();
        try{
            properties.load(App.class.getClassLoader().getResourceAsStream("vars.properties"));
        }catch(Exception e){
            System.out.println("Ooops!!! , hay un error, "+e.getMessage());
            System.exit(0);
        }
        System.out.println( "******************Iniciando el servidor******************" );
        System.out.println(properties.getProperty("ambiente"));
        get("/entornos",(req,res)->"En el ambiente " + properties.getProperty("ambiente") );
    }
}
