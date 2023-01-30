import java.util.Random;
import javax.swing.JOptionPane;

public class ArmaMissionGenerator {
    public static void main(String[] args) {
        String Mission = primaryMissions();
        String locale = locales();
        String method1 = methods();
        String enemy = enemies();
        String ally = ally();
        String intelSource = intelSources();
        String intel = intel();
        String Reward = rewards();
        String twists = plotTwists();

        JOptionPane.showMessageDialog(null, "The mission is to " + Mission + " via " + method1 + " in " + locale + ". \nResistance will come from " + enemy + ", but an ally can be fount in " + ally + ". \nPotential Intel can be uncovered via " + intelSource + ", revealing " + intel + ". \nCompletion of this mission will result in the gain of " + Reward + "." + "\n/////GM Note: Possible twists and turns: " + twists + "/////");
    }

    //generates mission
    public static String primaryMissions() {
        String[] mission = {"Shooting Range", "Plant intel", "Gather intel", "Kill Witnesses", "Steal/Destroy supplies", "Kill Target", "Rescue Target", "Cause Chaos", "Deliver Intel", "Recon"};

        Random rand = new Random();
        int selectNum = rand.nextInt(0,9);

        return mission[selectNum];
    }

    //generates general locale for mission
    public static String locales() {
        String[] locale = {"City", "Town", "Fort", "Wilderness", "Countryside", "Estate", "FOB"};

        Random rand = new Random();
        int selectNum = rand.nextInt(0,6);

        return locale[selectNum];
    }

    //generates method of entry
    public static String methods() {
        String[] method = {"HALO Drop", "Mechanized Entry", "On Foot", "Helicopter Entry"};

        Random rand = new Random();
        int selectNum = rand.nextInt(0,3);

        return method[selectNum];
    }

    //generates enemy type
    public static String enemies() {
        String[] enemies = {"Covenant", "Resistance", "ODST"};

        Random rand = new Random();
        int selectNum = rand.nextInt(0,2);

        return enemies[selectNum];
    }

    //generates random ally
    public static String ally() {
        String[] allies = {"Regular Soldier (Well Trained)", "Rebel Soldier (Inexperienced)", "Mercenary (Fleeing chance higher)", "Standard Civilian", "Suit (Civilian)", "Doctor (Civilian)", "Police"};

        Random rand = new Random();
        int selectNum = rand.nextInt(0,6);

        return allies[selectNum];
    }

    //generates intel source
    public static String intelSources() {
        String[] source = {"Interrogation", "Recon", "Journal", "Traitor", "Refugee", "Personal Letter", "Sealed Orders", "Just a \"hunch\""};

        Random rand = new Random();
        int selectNum = rand.nextInt(0, 7);

        return source[selectNum];
    }

    //generates intel type
    public static String intel() {
        String[] intels = {"Troop Details", "Enemy Orders", "Supply Details", "Grand Strategy", "Cypher", "Damning Docs"};

        Random rand = new Random();
        int selectNum = rand.nextInt(0, 5);

        return intels[selectNum];
    }

    //generates rewards
    public static String rewards() {
        String[] reward = {"Supply Drop", "Vehicle Drop", "APC Drop", "Tank Drop"};

        Random rand = new Random();
        int selectNum = rand.nextInt(0, 3);

        return reward[selectNum];
    }

    //generates plot twists
    public static String plotTwists() {
        String[] twist = {"Ambush", "Enemy Forces", "Bad Intel", "Command KIA", "Conflicting Orders", "Cowardice", "False Flag OP", "Militia helps/hinders", "No Collateral Damage", "Red Herring", "Reinforcements", "Stranded", "Supplies Sabotaged", "Weather", "Goal Moved", "Trap"};

        Random rand = new Random();
        int selectNum = rand.nextInt(0, 15);

        return twist[selectNum];
    }
}
/*
The purpose of this generator is to quickly come up with a summary for missions in the
Milsim game called ARMA 3. It was designed for the OP:TRE mods and represents a general
outline for a Zeus mission.
 */