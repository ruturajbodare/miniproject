package Inheritance;

public class Player {
	  int jersyno;
	    String playername;
	    String address;
	    public Player()
	    {
	        
	    }
	    
	    

	    public Player(int jersyno, String playername, String address) {
	        super();
	        this.jersyno = jersyno;
	        this.playername = playername;
	        this.address = address;
	    }

	    
	    public int getJersyno() {
	        return jersyno;
	    }



	    public void setJersyno(int jersyno) {
	        this.jersyno = jersyno;
	    }



	    public String getPlayername() {
	        return playername;
	    }
	    public void setPlayername(String playername) {
	        this.playername = playername;
	    }
	    public String getAddress() {
	        return address;
	    }
	    public void setAddress(String address) {
	        this.address = address;
	    }
	    
	    @Override
	    public String toString() {
	        return "Player [playerid=" + jersyno + ", playername=" + playername + ", address=" + address + "]";
	    }

}
