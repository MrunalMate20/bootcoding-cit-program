import java.io.*;
public class GeeksForGeeks{
	public static void printstars(int n){
		int i,j;
		for(i=0;i<n;i++){
			for(j=0;i<i;j++){
			System.out.print("*");}
			System.out.println();
		}
	}
	
	public static void main(String args[]){
		int n=4;
		printstars(n);
	}
}
