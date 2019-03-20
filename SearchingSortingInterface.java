import java.util.ArrayList;
public interface SearchingSortingInterface{

	public ArrayList<Integer> selectionSort(ArrayList<Integer> list);
	public ArrayList<Integer> insertionSort(ArrayList<Integer> list);
	public ArrayList<Integer> mergeSort(ArrayList<Integer> list);
	public boolean binarySearch(ArrayList<Integer> list, int x);
//	public boolean linearSearch(ArrayList<Integer> list, int x);
}