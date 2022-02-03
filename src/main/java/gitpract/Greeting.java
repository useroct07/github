package gitpract;
import org.apache.log4j.Logger;
public class Greeting {
    static Logger log=Logger.getLogger(Greeting.class.getClass());
    public void SayHello(){
        log.info("hello everyone");
    }

}
class India{
    Greeting g=new Greeting(){
        public void SayHello(){
            log.info("namaste everyone");
        }
    };
}
