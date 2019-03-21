import java.util.ArrayList;
public class searchSortInterfaceRunner{
	ArrayList<Integer> list = new ArrayList<>();

	public searchSortInterfaceRunner(){

		ArrayList<Integer> list = new ArrayList<>();

		for(int x = 0;x<30;x++)
		{
				int rand = (int)(Math.random()*200)+1;
			list.add(rand);
		}
		Integer num = 4;
		Sorter sort = new Sorter();
		System.out.println("Original List: " + list);
		System.out.println("Selection Sorted List: " + sort.selectionSort(list));
		System.out.println("Insertion Sorted List: " + sort.insertionSort(list));
		System.out.println("Merge Sorted List: " + sort.mergeSort(list));
		System.out.println("Binary Seach: " + sort.binarySearch(list,num) + "\nValue Searched for was " + num);
		System.out.println("Linear Seach: " + sort.linearSearch(list,num) + "\nValue Searched for was " + num);

	}


	public static void main(String[]args){

	searchSortInterfaceRunner app = new searchSortInterfaceRunner();


	}
}