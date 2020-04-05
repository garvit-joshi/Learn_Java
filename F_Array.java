public class F_Array
{
    public static void main(String[] args)
	{
		/*
		To declare an array, you need to define the type of the elements with square brackets.
		For example, to declare an array of integers:
		*/
		int[ ] arr;
		/**
		Now, you need to define the array's capacity, or the number of elements it will hold.
		To accomplish this, use the keyword new.
		*/
		arr = new int[5];
		/**
		To reference elements in an array, type the name of the array followed by the index 
		position within a pair of square brackets.
		*/
		arr[2] = 42;
        String[ ] myNames = { "A", "B", "C", "D"};
		/**
		Sometimes you might see the square brackets placed after the array name, which also works,
		but the preferred way is to place the brackets after the array's data type.
		*/
        System.out.println(myNames[2]);
		int[ ] intArr = new int[5]; 
		/**
		You can access the length of an array (the number of elements it stores) via its length property.
		*/
		System.out.println(intArr.length);
		int [ ] myArr1 = {6, 42, 3, 7};
		int sum=0;
		for(int z=0; z<myArr1.length; z++)      
		{
			/**
			as the last element's index is myArr.length-1.
			*/
			sum += myArr1[z];
		}
		System.out.println(sum);
		int[ ] primes = {2, 3, 5, 7};
		/**
		The enhanced for loop (sometimes called a "for each" loop) is used to traverse elements in arrays.
		*/
		for (int t: primes)
		{
			System.out.println(t); 
		}
		/**
		The enhanced for loop declares a variable of a type compatible with the elements of the array being accessed.
		The variable will be available within the for block, and its value will be the same as the current 
		array element.So, on each iteration of the loop, the variable t will be equal to the corresponding 
		element in the array.
		*/
		/**=====================================MULTIDIMENTIONAL ARRAY====================================*/
		int[ ][ ] sample = { {1, 2, 3}, {4, 5, 6} }; 
		int x = sample[1][0];                //The array's two indexes are called row index and column index.
		System.out.println(x);                // Outputs 4
		int[ ][ ] myArr = { {1, 2, 3}, {4}, {5, 6, 7} };
		myArr[0][2] = 42;
		x = myArr[1][0];                  //x=4
	}
}