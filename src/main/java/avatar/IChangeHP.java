package avatar;

public interface IChangeHP {

     int changeHP();
     void removeHealthPoints(int points);
     void addHealthPoints(int points);
     void addCoins(int coins);
     String getName();
     String whatInHand();
     default int getDefBonus() {
          return 0;
     }
}
