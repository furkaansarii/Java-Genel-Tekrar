package InterfaceRealLife;

public class SignUpManager {
	
	private UserCheckService userCheckService;
	
	
	public SignUpManager(UserCheckService userCheckService) {
		super();
		this.userCheckService = userCheckService;
	}


	public void signUp( User user )
	{
		if ( userCheckService.ageCheck(user) )
		{
			System.out.println(user.getName() + " Kayıt oldu.");
		}
		else
			System.out.println("Kullanıcı Kayı işlemi başarısız.");
	}

}
