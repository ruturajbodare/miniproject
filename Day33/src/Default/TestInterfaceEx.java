package Default;

public interface TestInterfaceEx
{
public int square(int n);
default void display()
{
	System.out.println("showing data");
}
}
