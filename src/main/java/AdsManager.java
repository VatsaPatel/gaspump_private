import java.util.ArrayList;
import java.util.Arrays;

/**
 * Manages Ads
 */
public class AdsManager {
    /**
     * For now, just gets a random ad.
     *
     * @return the ad
     */
    public static String getAd()
    {
        ArrayList<String> ads = new ArrayList<String>(
                Arrays.asList(
                        "Join our Rewards Program.",
                        "Hungry? Visit our Snack Bar.",
                        "Save with a Car Wash.",
                        "Star Wars Movie Preview.",
                        "New on HBO Now.",
                        "New iPhone 13 at AT&T.",
                        "Macy's Summer Clearance.",
                        "Get Your Smog Check Now."
                ));
        return ads.get(new java.util.Random().nextInt(ads.size()));
    }
}
