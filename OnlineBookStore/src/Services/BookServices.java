package Services;

import java.io.IOException;

public interface BookServices {
	public void viewallbooks();
	public void buybook() throws NumberFormatException,IOException;
	public void sellbook()  throws NumberFormatException,IOException;
	public void personaldetails();

}
