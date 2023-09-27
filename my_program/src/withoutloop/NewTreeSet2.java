package withoutloop;


public class NewTreeSet2{
public static void main(String[] args) {      
int my_array[] = {1, 5, 3, 86, 5, 6, 7, 8, 9, 10};
int sum = 0;

for (int i : my_array)
    sum += i;
System.out.println("The sum is " + sum);
}
}