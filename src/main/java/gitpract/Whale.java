package gitpract;

import org.apache.log4j.Logger;

public class Whale extends Fish{

    static Logger log = Logger.getLogger(Whale.class.getClass());
    String size = "Large";
    @Override
    public void fishType() {
        log.info("I am Whale");
    }

    @Override
    public void fishSize() {
        log.info(size);
    }
}
