package module6_5;

public class RunTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WorksWithArray arr = new WorksWithArray();
		UtilsModuleFive.inputDataArray(arr);
		UtilsModuleFive.printArray(arr);
		arr.findMaxMin();
		UtilsModuleFive.printMinMax(arr);
		arr.sortSelection();
		UtilsModuleFive.printSortArray(arr);
	}

}
