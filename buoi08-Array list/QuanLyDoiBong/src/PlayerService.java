import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class PlayerService {
    Random rd = new Random();

    public ArrayList<Player> getAllPlayer() {
        ArrayList<Player> allPlayer = new ArrayList<>();
        allPlayer.add(new Player(1, "Alisson Becker", Position.GK));
        allPlayer.add(new Player(13, "Adrian San Miguel", Position.GK));
        allPlayer.add(new Player(62, "Caoimhin Kelleherr", Position.GK));
        allPlayer.add(new Player(47, "Nathaniel Phillips", Position.DF));
        allPlayer.add(new Player(66, "Alexander-Arnold", Position.DF));
        allPlayer.add(new Player(12, "Jose Gomez", Position.DF));
        allPlayer.add(new Player(32, "Joel Matip", Position.DF));
        allPlayer.add(new Player(4, "Virgil van Dijk", Position.DF));
        allPlayer.add(new Player(26, "Andrew Robertson", Position.DF));
        allPlayer.add(new Player(72, "Sepp Van Den Berg", Position.DF));
        allPlayer.add(new Player(6, "Thiago Alcantara", Position.MF));
        allPlayer.add(new Player(3, "Fabinho", Position.MF));
        allPlayer.add(new Player(17, "Curtis Jones", Position.MF));
        allPlayer.add(new Player(14, "Jordan Henderson", Position.MF));
        allPlayer.add(new Player(7, "James Milner", Position.MF));
        allPlayer.add(new Player(67, "Harvey Elliott", Position.MF));
        allPlayer.add(new Player(58, "Ben Woodburn", Position.MF));
        allPlayer.add(new Player(20, "Diogo Jota", Position.FW));
        allPlayer.add(new Player(23, "Luis Diaz", Position.FW));
        allPlayer.add(new Player(11, "Mohamed Salah", Position.FW));
        allPlayer.add(new Player(10, "Sadio Mane", Position.FW));
        allPlayer.add(new Player(18, "Takumi Minamino", Position.FW));
        allPlayer.add(new Player(9, "Roberto Firmino", Position.FW));
    return allPlayer;
    }
    public ArrayList<Player> getGkPlayer(ArrayList<Player> allPlayer){
        ArrayList<Player> gkPlayer = new ArrayList<>();
        for (Player player:allPlayer){
            if (player.getPosition().equals(Position.GK)){
                gkPlayer.add(player);
            }
        }
        return gkPlayer;
    }
    public ArrayList<Player> getMfPlayer(ArrayList<Player> allPlayer){
        ArrayList<Player> mfPlayer = new ArrayList<>();
        for (Player player:allPlayer){
            if (player.getPosition().equals(Position.MF)){
                mfPlayer.add(player);
            }
        }
        return mfPlayer;
    }
    public ArrayList<Player> getDfPlayer(ArrayList<Player> allPlayer){
        ArrayList<Player> dfPlayer = new ArrayList<>();
        for (Player player:allPlayer){
            if (player.getPosition().equals(Position.DF)){
                dfPlayer.add(player);
            }
        }
        return dfPlayer;
    }
    public ArrayList<Player> getFwPlayer(ArrayList<Player> allPlayer){
        ArrayList<Player> fwPlayer = new ArrayList<>();
        for (Player player:allPlayer){
            if (player.getPosition().equals(Position.FW)){
               fwPlayer.add(player);
            }
        }
        return fwPlayer;
    }



    public void Show(ArrayList<Player> allPlayer){
        for (Player p:allPlayer){
            System.out.println(p);
        }
    }
    public ArrayList<Player> buildTeam(  ArrayList<Player> gkPlayer
    ,  ArrayList<Player> dfPlayer,  ArrayList<Player> mfPlayer
    ,  ArrayList<Player> fwPlayer,int a,int b,int c){
        ArrayList<Player> newTeam =new ArrayList<>();
        newTeam.add(gkPlayer.get(rd.nextInt(gkPlayer.size())));
        ArrayList<Integer> countDF = new ArrayList<>();
        for (int i =0;i<dfPlayer.size();i++){
            countDF.add(i);
        }
        Collections.shuffle(countDF);
        for (int i=0;i<a;i++){

                newTeam.add(dfPlayer.get(countDF.get(i)));

            }
        ArrayList<Integer> countMF = new ArrayList<>();
        for (int i =0;i<mfPlayer.size();i++){
            countMF.add(i);
        }
        Collections.shuffle(countMF);
        for (int i=0;i<b;i++){

            newTeam.add(mfPlayer.get(countMF.get(i)));

        }
        ArrayList<Integer> countFW = new ArrayList<>();
        for (int i =0;i<fwPlayer.size();i++){
            countFW.add(i);
        }
        Collections.shuffle(countFW);
        for (int i=0;i<c;i++){

            newTeam.add(fwPlayer.get(countFW.get(i)));

        }
        return newTeam;
    }
}
