package bo.edu.uap.api;
import static spark.Spark.*;
import spark.*;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "******************Iniciando el servidor******************" );
        get("/entornos",(req,res)->"En el ambiente <ambiente>");
    }
}
