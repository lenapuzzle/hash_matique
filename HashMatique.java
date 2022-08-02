import java.util.HashMap;
import java.util.Set;

public class HashMatique {

    public static void main(String[] args) {

        HashMap<String, String> trackList = new HashMap<String, String>();

        trackList.put("Imagine", "Imagine there's no heaven, It's easy if you try, No hell below us, Above us, only sky");
        trackList.put("Get lucky", "Like the legend of the Phoenix, huh, All ends with beginnings, What keeps the planet spinning, ah, The force from the beginning, hm, love");
        trackList.put("You're beautiful", "My life is brilliant, My love is pure, I saw an angel, Of that I'm sure, She smiled at me on the subway");
        trackList.put("Landslide", "I took my love, I took it down, I climbed a mountain and I turned around, And I saw my reflection in the snow-covered hills, Til the landslide brought me down");

        System.out.println(trackList.get("Get lucky"));


        Set<String> keys = trackList.keySet();
        for(String key : keys) {
            System.out.println(key + ": " + trackList.get(key));
        }
    }
}