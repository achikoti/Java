import java.lang.Math;
public class MainClass121{
	public static void main(String[] str){
		double a[];
		double temp;
		double g=0.0;
		int x=760039,y=x,i=0;
		double ten=10.0;
		while(y>=1){
			a[i]=y%10;
			y=y/10;
			i++;
		}
		for(int j=0;j<=i;j++){
			if(a[j]<a[j+1]){
				temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
			}
		}
		/*for(double j=0;j<i;j++)
			g=g+a[j]*Math.pow(ten*j);*/
		double j=i;
		int k=0;
		while(j<i){
			g=g+a[k]*Math.pow(ten*j);
			j--;
			k++;
		}
		System.out.println("The greatest number of given number is: "+g);
	}
}