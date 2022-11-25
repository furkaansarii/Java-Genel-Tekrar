package InterfaceRealLife;

public class ComplexUserCheckService implements UserCheckService {

	
	public boolean ageCheck( User user )
	{
		if ( user.getAge() >= 18 && user.getName().startsWith("Fu") )
		{
			return true;
		}else
			return false;
			
	}
}
