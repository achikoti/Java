public class MainClass{
	int e=0,o=0,p=0,a=0,pr=0,k=64,ar,prm;
	public static void main(String[] str){
		
		if(k%2==0)
			e++;
		else
			o++;
			
		int rev=0,org=k,rem=0;
		while( org!=0 ){
			remainder = org%10;
			rev= rev*10 + rem;
			org /= 10;
		}
		if(k==rev)
			p++;
		ar=armstrong();
		prm=prime();
		System.out.println("No. of even integers: "+e);
		System.out.println("No. of odd integers: "+o);
		System.out.println("No. of palindromes: "+p);
		System.out.println("No. of armstrong: "+ar);
		System.out.println("No. of prime numbers: "+prm);
		
	}
	public static int armstrong(){
		int org, rem, result = 0;

		org=k;

		while (originalNumber != 0){
        rem = org%10;
        result += rem*rem*rem;
        org/= 10;
		}
		if(result==k)
			a++;
		return a;
	}
	public static int prime(){
		int i, f= 0;

		for(i=2; i<=k/2; ++i){
        if(k%i==0){
            f=1;
            break;
        }
		}
		if (f==0)
			pr++;
		return pr;
	}
    
}