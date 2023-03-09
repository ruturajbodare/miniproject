package Inheritance;

public class BatsMan extends Player {
	 int centuries;
	    int halfcentury;
	    int sixes;
	    int fours;
	    public BatsMan()
	    {
	        
	    }
	    public BatsMan(int jersyno,String playername,String address,int centuries, int halfcentury, int sixes, int fours) {
	        super(jersyno,playername,address);
	        this.centuries = centuries;
	        this.halfcentury = halfcentury;
	        this.sixes = sixes;
	        this.fours = fours;
	    }
	    public int getCenturies() {
	        return centuries;
	    }
	    public void setCenturies(int centuries) {
	        this.centuries = centuries;
	    }
	    public int getHalfcentury() {
	        return halfcentury;
	    }
	    public void setHalfcentury(int halfcentury) {
	        this.halfcentury = halfcentury;
	    }
	    public int getSixes() {
	        return sixes;
	    }
	    public void setSixes(int sixes) {
	        this.sixes = sixes;
	    }
	    public int getFours() {
	        return fours;
	    }
	    public void setFours(int fours) {
	        this.fours = fours;
	    }
	    @Override
	    public String toString() {
	        return super.toString()+"BatsMan [centuries=" + centuries + ", halfcentury=" + halfcentury + ", sixes=" + sixes + ", fours="
	                + fours + "]";
	    }

}
