#include <iostream>
using namespace std;

int main()
{
    int arr[5] = {20, 15, 10, 5, 1};
    int n = sizeof(arr) / sizeof(arr[2]); // sizeof function returns the total size of array in bytes stored in memory. so we take the sizeof of array and first item and then divide them to get the number of elements of the array
    cout << n << " " << endl;

    for (int i = 0; i < n; i++)
    {
        cout << arr[i] << " ";
    }
    cout << endl;

    // sorting algorithm
    for (int i = 1; i < n; i++)
    {
        int key = arr[i];
        int j = i - 1;

        while (j >= 0 && arr[j] > key)
        {
            arr[j + 1] = arr[j];
            j = j - 1;
        }

        arr[j + 1] = key;
    }

    for (int i = 0; i < n; i++)
    {
        cout << arr[i] << " ";
    }
    cout << endl;
}