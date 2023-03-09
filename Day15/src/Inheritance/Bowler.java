package Inheritance;

public class Bowler extends Player {
	  int wicketsTaken;
	    int noofballsbowled;
	    int economyrate;
	    public Bowler()
	    {
	        
	    }
	    
	    public Bowler(int jersyno,String playername,String address,int wicketsTaken, int noofballsbowled, int economyrate) {
	        super(jersyno,playername,address);
	        
	        this.wicketsTaken = wicketsTaken;
	        this.noofballsbowled = noofballsbowled;
	        this.economyrate = economyrate;
	    }

	    public int getWicketsTaken() {
	        return wicketsTaken;
	    }
	    public void setWicketsTaken(int wicketsTaken) {
	        this.wicketsTaken = wicketsTaken;
	    }
	    public int getNoofballsbowled() {
	        return noofballsbowled;
	    }
	    public void setNoofballsbowled(int noofballsbowled) {
	        this.noofballsbowled = noofballsbowled;
	    }
	    public int getEconomyrate() {
	        return economyrate;
	    }
	    public void setEconomyrate(int economyrate) {
	        this.economyrate = economyrate;
	    }
	    @Override
	    public String toString() {
	        return super.toString()+"Bowler [wicketsTaken=" + wicketsTaken + ", noofballsbowled=" + noofballsbowled + ", economyrate="
	                + economyrate + "]";
	    }

}
