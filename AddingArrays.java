import java.util.Arrays;
public class AddingArrays{
public static void main(String[] args){
int counter = 0;
int sum = 0;
int minSum = 0;
int maxSum = 0;

int[] number = {8 ,0 ,1};

for(int index = 0; index <  number.length; index++){

for (int count = 0; count < number.length ; count ++){

	if(count != index){
		sum += number[count];
}
}
	if(index == 0){
		maxSum = sum; 
		minSum = sum;
}
	if(sum > maxSum)maxSum = sum;

	else if(sum < minSum)minSum = sum;
 
	sum = 0;
}
	int[] maxMinSum = {maxSum ,minSum};
	System.out.println(Arrays.toString(maxMinSum));
	

}
}
