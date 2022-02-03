package gitpract;

import org.apache.log4j.Logger;

public abstract class Fish {

    static Logger log = Logger.getLogger(Fish.class.getClass());

    String ocean = "Indian Ocean";

    public abstract void fishType();
    public void fishSize(){
    }
}
