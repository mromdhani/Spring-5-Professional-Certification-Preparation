package be.businesstraining.springbeans;

import org.springframework.stereotype.Service;

@Service("userBo")
public class UserBusinessImpl implements IUserBusiness {

	@Override
	public String getMessage() {
	
		return "Hello, JSF2 and Spring get successfully integrated !";
	}

}
