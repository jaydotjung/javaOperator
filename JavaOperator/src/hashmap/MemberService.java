package hashmap;

public interface MemberService {
	public void join(String userid,String password,String name,int age,String address);
	public String login(String userid2,String password2);
	
}

//뭘 고칠때는 인터페이스부터 시작