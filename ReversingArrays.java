import java.util.Arrays;
public class ReversingArrays{
public static void main(String[] args){

int[] array = {7, 2, 9, 3, 0};


for(int index = 0; index < array.length; index++) {
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