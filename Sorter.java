import java.util.ArrayList;
public class Sorter implements SearchingSortingInterface{

	public Sorter(){





	}

	public ArrayList<Integer> selectionSort(ArrayList<Integer> list){
		for(int x = 0;x<list.size()-1;x++){
			int min = x;
			for(int j = x;j<list.size();j++)
				if(list.get(j)<list.get(min))
					min = j;

			int temp = list.get(min);
			list.set(min,list.get(x));
			list.set(x,temp);
		}
	return list;

	}
	public ArrayList<Integer> insertionSort(ArrayList<Integer> list){
		for (int i=1; i<list.size();i++){
			int key = list.get(i);
			int j = i-1;
			while (j>=0 && list.get(j) > key){
				list.set(j+1,j);
				j--;
		    }
				list.set(j+1,key);
        }
		return list;
	}
	public ArrayList<Integer> mergeSort(ArrayList<Integer> list)
	{
		return mergeSort(list,0,list.size()-1);
	}


	public ArrayList<Integer> mergeSort(ArrayList<Integer> list, int lo, int n){
			int low = lo;
			int high = n;
			if (low>=high){
			return list ;
			}
			int middle = (low + high) / 2;
			mergeSort(list, low, middle);
			mergeSort(list, middle + 1, high);
			int endLow = middle;
			int startHigh = middle + 1;
			while ((lo <=endLow) && (startHigh<=high)){
				if (list.get(low) < list.get(startHigh)){
					low++;
				}
				else{
					int temp = list.get(startHigh);
				for (int k = startHigh-1;k>=low;k--){
					list.set(k+1,list.get(k));
				}
				list.set(low,temp);
				low++;
				endLow++;
				startHigh++;
			}
}
		return list;
	}
	public boolean binarySearch(ArrayList<Integer> list, int x){

		return true;
	}


}