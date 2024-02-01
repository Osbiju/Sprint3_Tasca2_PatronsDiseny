package ObserverExemple;

import java.util.ArrayList;
import java.util.List;

public class PatronObserver {
    static class SachinCenturyNotifier{
        List<SachinFan> fans = new ArrayList<SachinFan>();

        void register(SachinFan fan){
            fans.add(fan);

        }

        void sachinScoredACentury(){
            for(SachinFan fan : fans){
                fan.announce();
            }
        }
    }

}
