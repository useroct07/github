package gitpract;

import org.apache.log4j.Logger;

public class Shark extends Fish {
    static Logger log = Logger.getLogger(Shark.class.getClass());

    @Override
    public void fishType() {
        log.info("I am Shark");
    }

    @Override
    public void fishSize() {
        log.info("Medium");
    }
}
