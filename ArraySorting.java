import java.util.Arrays;
public class ArraySorting{

	
int[] squarenumber = new int[numbers.length];

for(sortsquare = 0 ; sortsquare < number.length; sortsquare++){
squarenumber[sortsquare] = number[sortsquare] * number[sortsquare];
}

for(int firstloop = 0; firstloop < squarednumber.length; firstloop++){
for(int secondloop = 0; secondloop <  squarenumber.length -1 - firstloop; secondloop++){

if(squarednumber[firstloop] > squarednumber[firstloop + 1]){

int temps = squarednumber[firstloop];

squarednumber[firstloop] = squarednumber[firstloop + 1];

squarednumber[firstloop + 1] = temps;
}
}
}
}
return squarednumber;
}




public static void main (String[] args ){

	int[] array = {7, 2, 9, 3, 0};

		for(int index = array[index]; index < array.length; index++) {
			int numberMin = array[index];
			 int numberMinIndex = index;
			for(int count = index + 1; count < array.length; count++) {
				if(numberMin > array[count]) {
					numberMin = array[count];
					numberMinIndex = count;
}
}

if(numberMinIndex != index) {
	array[numberMinIndex] = array[index];
	array[index] = numberMin;
}

}
System.out.print(Arrays.toString(array));
}
}
}
}