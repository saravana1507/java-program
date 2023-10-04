package sortsAndSearch;

public class JumpSearch {

	public static void main(String[] args) {
       int num=jumpSearch(new int[] {43,52,32,12,16,75,},16);
		System.out.println("print = "+num);
		
	}
     
		public static int jumpSearch(int[] integers, int elementToSearch) {

		    int arrayLength = integers.length;
		    int jumpStep = (int) Math.sqrt(integers.length);
		    int previousStep = 0;

		    while (integers[Math.min(jumpStep, arrayLength) - 1] < elementToSearch) {
		        previousStep = jumpStep;
		        jumpStep += (int)(Math.sqrt(arrayLength));
		        if (previousStep >= arrayLength)
		            return -1;
		    }
		    while (integers[previousStep] < elementToSearch) {
		        previousStep++;
		        if (previousStep == Math.min(jumpStep, arrayLength))
		            return -1;
		    }

		    if (integers[previousStep] == elementToSearch) {
		        return previousStep;}
		    return -1;
		}

		
	}

