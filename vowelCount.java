
import java.util.*;
public class vowelCount
{
	public static void main(String[] args) {
	    int arr[]=new int[5];
	    Arrays.fill(arr,0);
		Scanner input=new Scanner(System.in);
		String str=input.next();
		int count=0;
		str=str.toLowerCase();
		for(int i=0;i<str.length();i++){
		    char ch=str.charAt(i);
		    if(ch=='a'){
		        arr[0]++;
			    count++;
		    }else if(ch=='e'){
		        arr[1]++;
		        count++;
		    }else if(ch=='i'){
		        arr[2]++;
		        count++;
		    }else if(ch=='o'){
		        arr[3]++;
		        count++;
		    }else if(ch=='u'){
		        arr[4]++;
		        count++;
		    }
		}
		char arr1[]={'a','e','i','o','u'};
		for(int i=0;i<5;i++){
		    System.out.println("Vowel :"+arr1[i] +" Count :"+arr[i]);
		}
		System.out.println(count);
	}
}
