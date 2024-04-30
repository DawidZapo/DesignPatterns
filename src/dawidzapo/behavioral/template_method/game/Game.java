package dawidzapo.behavioral.template_method.game;

import dawidzapo.behavioral.template_method.player.Player;

import java.util.Random;

public abstract class Game {
    protected static Random random = new Random();
    protected Player player1;
    protected Player player2;

    public Game(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }
    protected final void printScore(){
        System.out.println("====== Score ======");
        System.out.println(player1.getFullName() + ": " + player1.getPoints());
        System.out.println(player2.getFullName() + ": " + player2.getPoints());
        System.out.println("===================");
    }
    public final void playGame(){
        startGame();
        play();
        endGame();
    }
    protected void startGame(){
        System.out.println("Starting game [default implementation]");
    }
    protected abstract void play();
    protected void endGame(){
        printScore();

        if(player1.getPoints() > player2.getPoints()){
            player1.addGame();
            System.out.println("Game won by: " + player1.getFullName());
        }
        else{
            player2.addGame();
            System.out.println("Game won by: " + player2.getFullName());
        }
    }
    protected abstract boolean isGameOver(int player1Points, int player2Points);
    protected void changeServer(){
        player1.setServing(!player1.isServing());
        player2.setServing(!player2.isServing());
    }
}

