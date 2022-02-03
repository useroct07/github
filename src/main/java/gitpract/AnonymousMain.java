package gitpract;
import org.apache.log4j.Logger;

public class AnonymousMain {
    static Logger log=Logger.getLogger(AnonymousMain.class.getClass());

    public static void main(String[] args) {
        log.info("checking");
        India ind=new India();
        ind.g.SayHello();
    }


}
