package gitpract;

import org.apache.log4j.Logger;

public class Anonymous {

    static Logger log = Logger.getLogger(HelloGit.class.getClass());
    public static void main(String[] args) {
        Fish whale= new Whale();
        whale.fishType();

        Fish shark= new Shark();
        shark.fishType();

        Fish any = new Fish() {
            @Override
            public void fishType() {
                log.info("I am Barracuda");
            }

            @Override
            public void fishSize() {
                log.info("small");
            }
        };
        any.fishType();
        any.fishSize();
        log.info(any.ocean);
    }
}
