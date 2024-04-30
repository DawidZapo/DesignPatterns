package dawidzapo.behavioral.template_method.game;

import dawidzapo.behavioral.template_method.player.Player;

public class SuperTieBreakGame extends Game{

    public SuperTieBreakGame(Player player1, Player player2) {
        super(player1, player2);
    }

    @Override
    protected void play() {
        if(random.nextInt(2) == 0){
            player1.setServing(true);
        }
        else{
            player2.setServing(true);
        }

        while(!isGameOver(player1.getPoints(), player2.getPoints())){
            System.out.println("Player: " + (player1.isServing() ? player1.getFullName() : player2.getFullName()) + " is serving");
            super.printScore();
            if(random.nextInt(2) == 0){
                player1.addPoint();
                System.out.println("Point won by: " + player1.getFullName());
            }
            else{
                player2.addPoint();
                System.out.println("Point won by: " + player2.getFullName());
            }
            if((player1.getPoints() + player2.getPoints()) % 2 == 1){
                super.changeServer();
            }
        }
    }

    @Override
    protected boolean isGameOver(int player1Points, int player2Points) {
        return (player1Points >= 10 && player1Points >= player2Points + 2) || (player2Points >= 10 && player2Points >= player1Points + 2);
    }
}
