package analisesProgram;

public class TribleForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
for(int i=1;i<=10;i++){
	for(int j=1; j<=10;j++){
		for(int k=1;k<=10;k++){
			count=count+1;
			System.out.println(i+" "+j+" "+k);
		}
	}
	}
System.out.println("count "+count);
	}

}
