package dawidzapo.behavioral.template_method.game;

import dawidzapo.behavioral.template_method.player.Player;

public class NoTieBreakGame extends Game{

    public NoTieBreakGame(Player player1, Player player2) {
        super(player1, player2);
    }

    @Override
    public void play() {
        // making random to select server, easy option
        if(random.nextInt(2) == 0){
            player1.setServing(true);
            System.out.println("Player: " + player1.getFullName() + " is serving");
        }
        else{
            player2.setServing(true);
            System.out.println("Player: " + player2.getFullName() + " is serving");
        }

        while(!isGameOver(player1.getPoints(), player2.getPoints())){
            super.printScore();
            if(random.nextInt(2) == 0){
                player1.addPoint();
                System.out.println("Point won by: " + player1.getFullName());
            }
            else{
                player2.addPoint();
                System.out.println("Point won by: " + player2.getFullName());
            }
        }
    }

    @Override
    public boolean isGameOver(int player1Points, int player2Points) {
        return (player1Points >= 4 && player1Points >= player2Points + 2) || (player2Points >= 4 && player2Points >= player1Points + 2);
    }
}
