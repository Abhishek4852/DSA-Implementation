#include <iostream>
using namespace std;

class ss
{
    public:
  
    void quickSort(int arr[], int low, int high)
    {
        if (low < high) {
            int NI = partition(arr, low, high);
            quickSort(arr, low, NI-1);
            quickSort(arr, NI+1, high);
        }
    }

    int partition (int arr[], int low, int high)
    {
        int pivot = arr[low];
        int i = low;
        int j = high - 1;

        while (true) {
          
            while (i <= high && arr[i] <= pivot) {
                i++;
            }

           
            while (j >= low && arr[j] > pivot) {
                j--;
            }

           
            if (i >= j) {
                break;
            }

       
            swap(arr[i], arr[j]);
        }

       
        swap(arr[low], arr[j]);
       j= low;
        return j;
    }
};


int main() {
    ss sorter;
    int arr[] = {12, 7, 14, 9, 10, 11};
    int n = sizeof(arr) / sizeof(arr[0]);

    cout << "Original array: ";
    for (int i = 0; i < n; i++) {
        cout << arr[i] << " ";
    }
    cout << endl;

    sorter.quickSort(arr, 0, n - 1);

    cout << "Sorted array: ";
    for (int i = 0; i < n; i++) {
        cout << arr[i] << " ";
    }
    cout << endl;

    return 0;
}
