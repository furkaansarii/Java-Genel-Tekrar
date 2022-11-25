package InterfaceRealLife;

public class UserAgeCheckService implements UserCheckService {
	
	public boolean ageCheck( User user )
	{
		if ( user.getAge() >= 18 )
		{
			return true;
		}
		else 
			return false;
	}

}
